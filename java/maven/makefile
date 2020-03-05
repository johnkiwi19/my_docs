# Target  :  Dependincies
# TAB		Your Command
# TAB		Next Command



CMD=asciidoc -b html5


all: cls maven abc


cls:
	clear

maven: maven.adoc
	$(CMD) maven.adoc
	

abc: abc.adoc
	$(CMD) abc.adoc




git:
	clear
	git add .
	git status
	git lg


clean:
	rm -f maven.html
	rm -f abc.html
	rm -rf tmp*
	rm -f pom.xml


help:
	clear
	@echo make
	@echo make all
	@echo make git 
	@echo make clean 
	@echo make help
