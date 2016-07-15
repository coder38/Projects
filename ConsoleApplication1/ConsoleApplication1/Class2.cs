﻿using System;
using System.Xml;
using System.Xml.Schema;
using System.Linq;
using System.Collections.Generic;

namespace ConsoleApplication1
{
    class XMLValidation
    {
        public static void Main()
        {
            Console.WriteLine("reading xml schema definition \n*************************************\n");

            // Set the validation settings.
            XmlReaderSettings settings = new XmlReaderSettings();
            settings.ValidationType = ValidationType.Schema;
            settings.Schemas.Add(null, "Untitled1.xsd");
           
            settings.ValidationEventHandler += new ValidationEventHandler(ValidationCallBack);
            Console.WriteLine("validated \n*************************************\n");

            try
            {
                XmlReader reader = XmlReader.Create("test.xml", settings);
                Console.WriteLine("parsing xml\n*************************************\n");

                while (reader.Read())
                {
                    switch (reader.NodeType)
                    {
                        case XmlNodeType.Element: // The node is an element.
                            Console.Write("<" + reader.Name);
                            Console.Write(">");
                            break;
                        case XmlNodeType.Text: //Display the text in each element.
                            Console.Write(reader.Value);
                            break;
                        case XmlNodeType.EndElement: //Display the end of the element.
                            Console.Write("</" + reader.Name);
                            Console.WriteLine(">");
                           // Console.WriteLine();
                            break;
                    }
                }
                Console.WriteLine("getting attributes \n*************************************\n");

                XmlDocument x = new XmlDocument();
                x.Load("test.xml");
                Console.WriteLine(x);
                XmlNodeList elemList = x.GetElementsByTagName("title");
                for (int i = 0; i < elemList.Count; i++)
                {
                    Console.WriteLine(elemList[i].InnerXml);
                }
            
                x.Load("Untitled.xml");
                Console.WriteLine(x);
                XmlNodeList elemList2 = x.GetElementsByTagName("UML:Model");
                for (int i = 0; i < elemList.Count; i++)
                {
                    Console.WriteLine(elemList2[i].InnerXml);
                }
                /* List<string> attributes = new List<string>();

                 List<XmlNode> nodes = new List<XmlNode>();
                 XmlNode node = xml.FirstChild;
                 foreach (XmlElement n in node.ChildNodes)
                 {
                     XmlAttributeCollection att = n.Attributes;
                     foreach (XmlAttribute at in att)
                     {
                         if (at.LocalName.Contains("attribute"))
                         {
                             attributes.Add(at.Value);
                         }
                     }
                 }*/

            }
            catch(Exception e)
            {
                Console.WriteLine("exception: " + e);
            }
              
        }
        // Display any warnings or errors.
        private static void ValidationCallBack(object sender, ValidationEventArgs args)
        {
            if (args.Severity == XmlSeverityType.Warning)
                Console.WriteLine("\tWarning: " + args.Message);
            else if (args.Severity == XmlSeverityType.Error)
                Console.WriteLine("\tValidation error: " + args.Message);

        }
    }
}