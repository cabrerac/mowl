# MOWL: A Domain Specific Language to Handling Modular Ontologies 

MOWL is a domain specific language for handling modular ontologies based on MDE. This language enables the manipulation of multiple ontologies, which can be connected through e-connections<sup>1</sup>. MOWL extends the Ontology Web Language (OWL<sup>2</sup>) with the elements to connect two or more ontologies allowing a modular development of knowledge models. These knowledge models can be translated to a knowledge base implemented on Jess<sup>3</sup>)

MOWL is developed using the Eclipse Modelling Framework (EMF). So as a first requirement you must download and install eclipse from the [EMF web site.](https://www.eclipse.org/modeling/emf/)

Different artifacts compose MOWL as follows:

* mowl.installer is the update-site that can be used to install the MOWL editor in eclipse.
* mowl.metamodel contains the Ecore metamodels that define the MOWL<sup> 4</sup> and JESS <sup>5</sup> languages.
* mowl.mtc.design contains the transformation chain that translates a model conform to the MOWL language to a knowledge base written in JESS.
* mowl.tool.design contains the implementation of the graphic editor using [SIRIUS](https://www.eclipse.org/sirius/).

## Users Mode




## Sources
1. [Cuenca, B., Parsia, B. and Sirin, E. "Ontology Integration Using ε-Connections", In Modular Ontologies: Concepts, Theories and Techniques for Knowledge Modularization, Springer Berlin Heidelberg (2009).](https://link.springer.com/chapter/10.1007/978-3-642-01907-4_14)
2. [OWL Working Group "Web Ontology Language (OWL)", W3C (2012).](https://www.w3.org/OWL/)
3. ["JESS, the Rule Engine for the Java^{TM} Platform", Sandia National Laboratories (2013).](https://www.jessrules.com/)
4. [Cabrera, C. and Mariño, O. "Domain Specific Language for Handling Modular Ontologies", In 9th Computing Colombian Conference (9CCC) IEEE (2014).](https://link.springer.com/chapter/10.1007/978-3-642-01907-4_14)

