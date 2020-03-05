CMD:=asciidoc -b html5 

all : abc.html create_a_simple_make_file.html create_generic_make_file.html make_file_howto.html viewingthemakefile.html 

abc.html: abc.adoc
	$(CMD) abc.adoc

create_a_simple_make_file.html: create_a_simple_make_file.adoc
	$(CMD) create_a_simple_make_file.adoc

create_generic_make_file.html: create_generic_make_file.adoc
	$(CMD) create_generic_make_file.adoc

make_file_howto.html: make_file_howto.adoc
	$(CMD) make_file_howto.adoc

viewingthemakefile.html: viewingthemakefile.adoc
	$(CMD) viewingthemakefile.adoc



clean: 
	rm -f *.html pom pom.xml
	rm -rf tmp
ngit:
	clear
	(cd ~/aaa/aaa_doc/ && git add .)
	(cd ~/aaa/aaa_doc/ && git status)
	(cd ~/aaa/aaa_doc/ && git lg)

