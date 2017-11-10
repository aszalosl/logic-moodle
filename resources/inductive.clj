[
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő zárójelpárok számát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "szám a végeredmény, nem halmaz"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "a konkrét formulában szereplő zárójelet is figyelembe kell venni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "szám a végeredmény, nem halmaz"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "Nemlogikai konstans nem tartalmazhat zárójelet!"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{A\\lor B\\}\\cup f(A) \\cup f(B) \\)" "szám a végeredmény, nem halmaz"]
	]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő valódi logikai konstansok (\\(LC\\backslash\\{(,)\\}\\)) számát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)" "a formulában szereplő fő összekötőjel (negáció) is számít"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot várunk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "a formulában szereplő fő összekötőjel (konjunkció) is számít"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot várunk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot várunk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)" "számot várunk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot várunk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot várunk, nem halmazt"]
          ["\\(f(A) = 1\\) ha \\(A\\in Con\\)" "egyetlen nemlogikai konstans sem logikai konstans"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "a formulában szereplő fő összekötőjel (diszjunkció) is számít"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "a formulában szereplő fő összekötőjel is számít"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot várunk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "a formulában szereplő fő összekötőjel (ekvivalencia) is számít"]
	]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő valódi logikai konstansok (\\(LC\\backslash\\{(,)\\}\\)) halmazát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "figyelembe kell venni a fő összekötő jelet (implikáció) is"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "figyelembe kell venni a fő összekötő jelet (konjunkció) is"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "figyelembe kell venni a fő összekötő jelet (diszjunkció) is"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "figyelembe kell venni a fő összekötő jelet (ekvivalencia) is"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)" "figyelembe kell venni a fő összekötő jelet (negáció) is"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\{A\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A\\supset B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{A\\land B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{A\\lor B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{A\\equiv B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
	]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(\\lnot\\) logikai konstans előfordulásainak számát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "a \\(not\\) nem lehet nemlogikai konstans"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)" "a negációt számolni kell!"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
	]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(\\land\\) logikai konstans előfordulásainak számát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "a \\(\\land\\) nem lehet nemlogikai konstans"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "a konjunkciót számolni kell"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(\\lor\\) logikai konstans előfordulásainak számát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "a \\(\\lor\\) nem lehet nemlogikai konstans"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "a diszjunkciót számolni kell"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(\\equiv\\) logikai konstans előfordulásainak számát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "a \\(\\equiv\\) nem lehet nemlogikai konstans"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "az ekvivalenciát számolni kell"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(\\supset\\) logikai konstans előfordulásainak számát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "a \\(\\supset\\) nem lehet nemlogikai konstans"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "az implikációt számolni kell"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő nemlogikai konstansok (előfordulásainak) számát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "pont a nemlogikai konstansokat számoljuk"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+ f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja, hogy a formulának legfeljebb hány különböző részformája lehet?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)"
        ]
  :wrong [
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "az atomi formula is számít"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a formula önmagának részformulája, számolni kell vele"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+ f(A) + f(B) \\)" "a formula önmagának részformulája, számolni kell vele"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a formula önmagának részformulája, számolni kell vele"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a formula önmagának részformulája, számolni kell vele"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "a formula önmagának részformulája, számolni kell vele"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő nemlogikai konstansok halmazát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = \\{A\\}\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "pont a nemlogikai konstansokat akarjuk összegyűjteni"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\{A\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A\\supset B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{A\\land B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{A\\lor B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{A\\equiv B\\}\\cup f(A) \\cup f(B) \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "nem formulák halmazát definiáljuk"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formulában szereplő \\(C\\) nemlogikai konstans előfordulásainak számát?"
  :good [
	 "ha \\(C\\in Con\\), akkor \\(f(C) = 1\\)"
	 "ha \\(A\\in Con\\) és \\(A=C\\), akkor \\(f(A) = 1\\)"
	 "ha \\(A\\in Con\\) és \\(A\\not= C\\), akkor \\(f(A) = 0\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)"
        ]
  :wrong [
	  ["ha \\(A\\in Con\\) és \\(A=C\\), akkor \\(f(A) = 0\\)" "pont ezt számolnánk össze"]
	  ["ha \\(A\\in Con\\) és \\(A\\not= C\\), akkor \\(f(A) = 1\\)" "a többi nemlogikai konstans most nem érdekel bennünket"]
	  ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "nem kezelhetjük egységesen az összes nemlogikai konstanst, ha közülük az egyiket külön kezelnénk"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)"  "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "a negációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1+ f(A) + f(B) \\)" "az implikációt nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1+f(A) + f(B) \\)" "a konjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1+f(A) + f(B) \\)" "a diszjunkciót nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1+f(A) + f(B) \\)" "az ekvivalenciát nem kell számolni"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A)\\cup f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A)\\cup  f(B) \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "számot keresünk, nem halmazt"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formula részformuláinak halmazát?"
  :good [
         "ha \\(A\\in Con\\), akkor \\(f(A) = \\{A\\}\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot A\\}\\cup f(A) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A\\supset B\\}\\cup f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{A\\land B\\}\\cup f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{A\\lor B\\}\\cup f(A) \\cup f(B) \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{A\\equiv B\\}\\cup f(A) \\cup f(B) \\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
        ]}
 {:question "Mely pontok részei annak az induktív függvény definíciónak, mely minden formula esetén megadja a formula közvetlen részformuláinak halmazát?"
  :good [
	 "ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)"
         "ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)"
         "ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)"
        ]
  :wrong [
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 0\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = 1\\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = 1+f(A) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = 1 + f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\emptyset\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot\\}\\cup f(A) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{\\supset\\}\\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{\\land\\} \\cup f(A) \\cup f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{\\lor\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{\\equiv\\} \\cup  f(A) \\cup  f(B) \\)" "nem a logikai konstansokat gyűjtjük össze"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = f(A) + f(B) \\)" "halmazt várunk, nem számot"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{A\\} \\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A, B\\} \\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) =  \\{A, B\\}\\)" "minden formulának saját maga részformulája"]
          ["ha \\(A\\in Con\\), akkor \\(f(A) = \\{A\\}\\)" "atomi formulának nincs közvetlen részhalmaza"]
          ["ha \\(A\\in Form\\), akkor \\(f(\\lnot A) = \\{\\lnot A\\}\\cup f(A) \\)" "a formula nem közvetlen részformulája saját magának"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\supset B)\\,) = \\{A\\supset B\\}\\cup f(A) \\cup f(B) \\)" "a formula nem közvetlen részformulája saját magának"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\land B)\\,) = \\{A\\land B\\}\\cup f(A) \\cup f(B) \\)" "a formula nem közvetlen részformulája saját magának"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\lor B)\\,) = \\{A\\lor B\\}\\cup f(A) \\cup f(B) \\)" "a formula nem közvetlen részformulája saját magának"]
          ["ha \\(A,\\ B\\in Form\\), akkor \\(f(\\,(A \\equiv B)\\,) = \\{A\\equiv B\\}\\cup f(A) \\cup f(B) \\)" "a formula nem közvetlen részformulája saját magának"]
        ]}]

