CC=javac

.PHONY: %
%: %.java
	$(CC) $^

.PHONY: run
run: Replacer
	java $^

.PHONY: clean
clean:
	$(RM) *.class
