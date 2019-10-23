;;; Declaring the triple template ---------------------------------
(deftemplate triple "Template representing a triple" 
 (slot predicate (default "")) 
 (slot subject   (default "")) 
 (slot object    (default ""))
)


;;;Multiontology Facts
;;;IRI= http://Multiontology.mowl Version= 1.0
(assert	(triple	(predicate	 "#type")(subject	 "http://Multiontology.mowl#")(object	 "#Multiontology")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl#Ontology_Connector_2")(object	 "#LinkProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl#Ontology_Connector_3")(object	 "#LinkProperty")))

;;;Ontology 1 Facts
;;;IRI= http://Multiontology.mowl/Ontology_1.owl Version= 1.0
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#")(object	 "http://www.w3.org/2002/07/owl#Ontology")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Class_1")(object	 "http://www.w3.org/2002/07/owl#Class")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Object_Property_1")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Data_Property__1")(object	 "http://www.w3.org/2002/07/owl#DatatypeProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Data_Property__2")(object	 "http://www.w3.org/2002/07/owl#DatatypeProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Literal_1")(object	 "http://www.w3.org/2002/07/owl#Literal")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_1.owl#Literal_2")(object	 "http://www.w3.org/2002/07/owl#Literal")))

;;;Ontology 2 Facts
;;;IRI= http://Multiontology.mowl/Ontology_2.owl Version= 1.0
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#")(object	 "http://www.w3.org/2002/07/owl#Ontology")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Class_1")(object	 "http://www.w3.org/2002/07/owl#Class")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Object_Property_1")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Object_Property_2")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Data_Property__1")(object	 "http://www.w3.org/2002/07/owl#DatatypeProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Individual__1")(object	 "http://www.w3.org/2002/07/owl#NamedIndividual")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Individual__2")(object	 "http://www.w3.org/2002/07/owl#NamedIndividual")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Individual__3")(object	 "http://www.w3.org/2002/07/owl#AnonymousIndividual")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Literal_1")(object	 "http://www.w3.org/2002/07/owl#Literal")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_2.owl#Literal_2")(object	 "http://www.w3.org/2002/07/owl#Literal")))

;;;Ontology 3 Facts
;;;IRI= http://Multiontology.mowl/Ontology_3.owl Version= 1.0
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#")(object	 "http://www.w3.org/2002/07/owl#Ontology")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Class_1")(object	 "http://www.w3.org/2002/07/owl#Class")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Class_2")(object	 "http://www.w3.org/2002/07/owl#Class")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Class_3")(object	 "http://www.w3.org/2002/07/owl#Class")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Object_Property_1")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Object_Property_2")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Object_Property_3")(object	 "http://www.w3.org/2002/07/owl#ObjectProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Data_Property__1")(object	 "http://www.w3.org/2002/07/owl#DatatypeProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Data_Property__2")(object	 "http://www.w3.org/2002/07/owl#DatatypeProperty")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Individual__1")(object	 "http://www.w3.org/2002/07/owl#NamedIndividual")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Individual__2")(object	 "http://www.w3.org/2002/07/owl#AnonymousIndividual")))
(assert	(triple	(predicate	 "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")(subject	 "http://Multiontology.mowl/Ontology_3.owl#Literal_1")(object	 "http://www.w3.org/2002/07/owl#Literal")))

(run)
(save-facts "owlfacts.txt")
