CMD=asciidoc -b html5

all: abc make_file_howto

abc:  abc.adoc
		clear
		$(CMD) abc.adoc
		ls -1

make_file_howto: make_file_howto.adoc
		$(CMD) make_file_howto.adoc
		ls -l
git:
		clear
		git add .
		git status
		git lg

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

