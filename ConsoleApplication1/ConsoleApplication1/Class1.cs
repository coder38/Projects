using System;
using System.Xml;
using System.Xml.XPath;
using System.Xml.Schema;
using System.Linq;
using System.Threading.Tasks;
using System.IO;
using System.CodeDom;
using System.Xml.Serialization;

namespace ConsoleApplication1
{
    public sealed class Processor
    {
        public static CodeNamespace Process(string xsdFile,
           string targetNamespace)
        {
            // Load the XmlSchema and its collection.
            XmlSchema xsd;
            using (FileStream fs = new FileStream("Untitled1.xsd", FileMode.Open))
            {
                xsd = XmlSchema.Read(fs, null);
                xsd.Compile(null);
            }
            XmlSchemas schemas = new XmlSchemas();
            schemas.Add(xsd);
            // Create the importer for these schemas.
            XmlSchemaImporter importer = new XmlSchemaImporter(schemas);
            // System.CodeDom namespace for the XmlCodeExporter to put classes in.
            CodeNamespace ns = new CodeNamespace(targetNamespace);
            XmlCodeExporter exporter = new XmlCodeExporter(ns);
            // Iterate schema top-level elements and export code for each.
            foreach (XmlSchemaElement element in xsd.Elements.Values)
            {
                // Import the mapping first.
                XmlTypeMapping mapping = importer.ImportTypeMapping(
                  element.QualifiedName);
                // Export the code finally.
                exporter.ExportTypeMapping(mapping);
            }
            return ns;
        }
    }
}
