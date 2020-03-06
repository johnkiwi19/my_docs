CMD:=asciidoc -b html5 

all : abc.html 

abc.html: abc.adoc
	$(CMD) abc.adoc



clean: 
	rm -f *.html pom pom.xml
	rm -rf tmp
ngit:
	clear
	(cd ~/aaa/aaa_doc/ && git add .)
	(cd ~/aaa/aaa_doc/ && git status)
	(cd ~/aaa/aaa_doc/ && git lg)

