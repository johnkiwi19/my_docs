CMD=asciidoc -b html5

all: abc 

abc:  abc.adoc
	clear
	$(CMD) abc.adoc
	ls -1



git:
	clear
	(cd ~/aaa/aaa_doc/ && git add .)
	(cd ~/aaa/aaa_doc/ && git status)
	(cd ~/aaa/aaa_doc/ && git lg)

clean:
	rm -f *.html
	rm -rf tmp
	rm -f pom.xml
help:
	clear
	@echo make
	@echo make all
	@echo make git
	@echo make clean
	@echo make help

