CMD:=asciidoctor -b html5 

### Print the all command 
all : abc.html keyboard_shortcuts.html new_dynamic_web_Project.html 



### LOOP Print the RULES
abc.html: abc.adoc
	$(CMD) abc.adoc


keyboard_shortcuts.html: keyboard_shortcuts.adoc
	$(CMD) keyboard_shortcuts.adoc


new_dynamic_web_Project.html: new_dynamic_web_Project.adoc
	$(CMD) new_dynamic_web_Project.adoc




### print the CLEAN command
clean: 
	rm -f *.html pom pom.xml
	rm -rf tmp



git:
	clear
	(cd ~/aaa/aaa1_doc/ && git add .)
	(cd ~/aaa/aaa1_doc/ && git status)
	(cd ~/aaa/aaa1_doc/ && git lg)

