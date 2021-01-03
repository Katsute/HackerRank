Regex_Pattern = r'^\d{5,6} (C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$'

import re

lines = int(input())

for _ in range(lines):
    string = input()
    print("VALID" if re.search(Regex_Pattern, string) else "INVALID")