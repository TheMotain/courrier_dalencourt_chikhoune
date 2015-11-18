# cibles
.PHONY: all, clean, docs, compile, jar, run


SOURCES = City/*.java Content/*.java Letters/*.java Money/*.java TestCity/*.java TestContent/*.java TestLetters/*.java TestMoney/*.java
# nom du fichier jar						
JAR_NAME = courrier_dalencourt_chikhoune.jar
# nom du manifeste pour la création du jar
MANIFEST = Manifest
# les packages
PACKAGES = City Content Letters Money
# les répertoires de documentation
DIR = ../doc $(PACKAGES)
# le classpath à utiliser
CLASSPATH = ../junit.jar:.

all: clean docs compile jar

#compilation des sources	
compile: 
	cd src ; javac -classpath $(CLASSPATH) $(SOURCES) -d ../bin

#création du jar
jar: 
	cd bin ; jar cvfm ../$(JAR_NAME) ../$(MANIFEST) $(DIR)

#génération de la doc	
docs:
	cd src ; javadoc $(PACKAGES) -d ../doc

#exécution du jar
run: 
	java -jar $(JAR_NAME)

#nettoyage bin et doc
clean: 
	rm -f -r bin ; mkdir bin
	rm -f -r doc ; mkdir doc
