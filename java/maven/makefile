all: maven
CMD=asciidoc -b html5

maven:
	clear
	$(CMD) maven.adoc
	$(CMD) abc.adoc
	ls -1


git:
	clear
	git add .
	git status
	git lg


clean:
	rm -f maven.html
	rm -f abc.html
	rm -rf tmp
	rm -f pom.xml


help:
	clear
	@echo make
	@echo make all
	@echo make git 
	@echo make clean 
	@echo make help