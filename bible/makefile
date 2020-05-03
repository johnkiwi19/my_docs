CMD:=asciidoctor -b html5 

### Print the all command 
all : abc.html 



### LOOP Print the RULES
abc.html: abc.adoc
	$(CMD) abc.adoc




### print the CLEAN command
clean: 
	rm -f *.html pom pom.xml
	rm -rf tmp



git:
	clear
	(cd ~/aaa/aaa1_doc/ && git add .)
	(cd ~/aaa/aaa1_doc/ && git status)
	(cd ~/aaa/aaa1_doc/ && git lg)

