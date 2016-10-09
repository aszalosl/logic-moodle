[{:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot ((p\\supset s)\\lor p)\\lor (q\\supset s)), \\lnot (r\\lor (q\\land ((q\\lor p)\\supset r))) \\}\\)"
         "\\(\\{ ((s\\lor s)\\lor ((r\\equiv r)\\land (r\\equiv q))), (\\lnot ((r\\land r)\\land r)\\land (q\\supset q)) \\}\\)"
         "\\(\\{ \\lnot ((p\\supset q)\\equiv \\lnot (q\\supset r)), (\\lnot p\\land ((s\\supset p)\\lor (s\\lor p))) \\}\\)"
         "\\(\\{ (s\\supset (((r\\supset r)\\land (r\\supset r))\\supset q)), (((p\\equiv p)\\lor s)\\land ((r\\supset s)\\lor q)) \\}\\)"
         "\\(\\{ (\\lnot r\\land (r\\equiv ((p\\supset p)\\supset r))), (((r\\supset q)\\land (q\\land s))\\supset (r\\land p)) \\}\\)"]
  :wrong [
          ["\\(\\{ ((((s\\land p)\\lor q)\\equiv (q\\equiv s))\\lor r),\\lnot ((p\\supset (s\\lor (r\\supset p)))\\lor p) \\)" "az igazságtáblák főoszlopai: 0111011111110111 és 0011011000000000"]
          ["\\(\\{ (q\\equiv ((s\\lor q)\\equiv (q\\supset \\lnot q))),((s\\equiv \\lnot ((s\\equiv q)\\equiv r))\\land q) \\)" "az igazságtáblák főoszlopai: 1000101001010000 és 0000010000000010"]
          ["\\(\\{ \\lnot (\\lnot (q\\lor q)\\land (s\\supset r)),(q\\equiv (q\\equiv (((p\\land s)\\land p)\\equiv s))) \\)" "az igazságtáblák főoszlopai: 0100000011001111 és 1000000101111111"]
          ["\\(\\{ \\lnot \\lnot ((p\\equiv s)\\supset \\lnot s),(\\lnot (p\\equiv (r\\equiv r))\\land (r\\lor r)) \\)" "az igazságtáblák főoszlopai: 1100011110011010 és 0000001000110011"]
          ["\\(\\{ ((q\\supset q)\\equiv (q\\equiv (s\\equiv (r\\supset q)))),\\lnot \\lnot (\\lnot (r\\land s)\\land q) \\)" "az igazságtáblák főoszlopai: 1011011100100101 és 0000010100001110"]
          ["\\(\\{ ((s\\land r)\\land ((\\lnot r\\lor s)\\equiv p)),\\lnot (s\\land (r\\supset (r\\equiv (q\\land q)))) \\)" "az igazságtáblák főoszlopai: 0000000100100001 és 1000011110011010"]
          ["\\(\\{ (\\lnot s\\lor (\\lnot s\\supset (q\\supset s))),((q\\supset r)\\equiv (\\lnot (p\\equiv p)\\land r)) \\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0010011000001100"]
          ["\\(\\{ (((r\\land \\lnot s)\\equiv (q\\equiv p))\\supset r),(q\\land ((r\\equiv (s\\equiv q))\\equiv (r\\supset s))) \\)" "az igazságtáblák főoszlopai: 1111111100111111 és 0000110100001011"]
          ["\\(\\{ (((r\\supset r)\\lor r)\\supset (q\\land (q\\supset q))),(\\lnot q\\lor ((q\\land \\lnot q)\\supset q)) \\)" "az igazságtáblák főoszlopai: 0010111100001111 és 1100111111111111"]
          ["\\(\\{ ((\\lnot q\\equiv (r\\land \\lnot r))\\lor s),\\lnot \\lnot \\lnot \\lnot (p\\land p) \\)" "az igazságtáblák főoszlopai: 0111011101101111 és 0000000011111111"]
          ["\\(\\{ ((((p\\supset (p\\land r))\\equiv q)\\land r)\\lor s),\\lnot (p\\land (\\lnot (r\\lor p)\\supset p)) \\)" "az igazságtáblák főoszlopai: 0100001101100111 és 1100011010000000"]
          ["\\(\\{ \\lnot ((s\\supset q)\\lor \\lnot \\lnot p),\\lnot \\lnot (p\\supset \\lnot (s\\land s)) \\)" "az igazságtáblák főoszlopai: 0100111000000000 és 1100011110011010"]
          ["\\(\\{ (((\\lnot p\\lor r)\\equiv q)\\lor (p\\land s)),\\lnot ((p\\lor p)\\equiv ((p\\lor r)\\lor p)) \\)" "az igazságtáblák főoszlopai: 0010001011100111 és 0011001100000000"]
          ["\\(\\{ (((\\lnot p\\lor p)\\equiv \\lnot r)\\land s),\\lnot ((p\\land r)\\equiv (q\\supset \\lnot p)) \\)" "az igazságtáblák főoszlopai: 0100001001000100 és 1100111011000011"]
          ["\\(\\{ ((p\\lor q)\\land \\lnot (q\\equiv (r\\lor p))),(r\\lor \\lnot (r\\lor (q\\supset \\lnot q))) \\)" "az igazságtáblák főoszlopai: 0000110011110000 és 0011011100111111"]
          ["\\(\\{ (\\lnot \\lnot ((s\\supset p)\\supset s)\\lor p),(((q\\lor s)\\lor s)\\supset ((p\\supset p)\\lor p)) \\)" "az igazságtáblák főoszlopai: 0100001111111111 és 1100111011111111"]
          ["\\(\\{ \\lnot ((((r\\equiv p)\\supset r)\\lor r)\\supset q),(r\\supset \\lnot ((s\\lor (p\\lor s))\\equiv q)) \\)" "az igazságtáblák főoszlopai: 0011011011110000 és 1110110111111100"]
          ["\\(\\{ (\\lnot (p\\land s)\\equiv ((q\\equiv s)\\supset r)),((\\lnot (r\\supset s)\\supset \\lnot s)\\lor r) \\)" "az igazságtáblák főoszlopai: 0110001111011110 és 1111111111111111"]
          ["\\(\\{ (q\\land ((r\\supset s)\\lor (s\\equiv (p\\equiv q)))),(s\\supset ((((s\\lor r)\\supset p)\\supset r)\\lor p)) \\)" "az igazságtáblák főoszlopai: 0000111100001101 és 1111011111111111"]
          ["\\(\\{ (((s\\lor (s\\lor (p\\supset s)))\\equiv q)\\land s),(\\lnot (q\\land \\lnot p)\\supset (r\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0000001000000101 és 1100011000000000"]
          ["\\(\\{ (((p\\supset p)\\supset (q\\land p))\\land (r\\land q)),(((p\\lor p)\\land (\\lnot q\\equiv s))\\lor s) \\)" "az igazságtáblák főoszlopai: 0000000000000011 és 0100001101101111"]
          ["\\(\\{ ((r\\equiv s)\\supset \\lnot ((r\\equiv p)\\lor s)),(q\\equiv ((r\\supset (s\\supset r))\\land \\lnot r)) \\)" "az igazságtáblák főoszlopai: 0111000111011110 és 0011111100111100"]
          ["\\(\\{ ((r\\supset ((q\\land r)\\land s))\\supset \\lnot q),((p\\supset r)\\equiv ((\\lnot p\\lor q)\\supset s)) \\)" "az igazságtáblák főoszlopai: 1111111111110010 és 0110001010111001"]
          ["\\(\\{ ((\\lnot (r\\land (r\\supset q))\\lor r)\\supset p),(\\lnot (p\\equiv \\lnot p)\\supset (r\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0010000111111111 és 1010101001101001"]
          ["\\(\\{ \\lnot ((s\\equiv r)\\equiv (p\\supset (p\\supset s))),(\\lnot s\\supset (((s\\supset r)\\equiv q)\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0110110110001100 és 1101101101100111"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (r\\supset \\lnot \\lnot ((q\\lor s)\\lor p)), ((\\lnot q\\supset \\lnot s)\\lor (q\\lor s)) \\}\\)"
         "\\(\\{ ((q\\supset q)\\lor \\lnot \\lnot (p\\equiv s)), ((r\\lor (q\\equiv (q\\lor q)))\\supset (q\\lor s)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot \\lnot s\\lor \\lnot r), (r\\equiv (((q\\supset q)\\equiv (s\\supset p))\\land r)) \\}\\)"
         "\\(\\{ (p\\supset ((p\\lor p)\\supset (\\lnot r\\land r))), ((s\\supset p)\\lor (\\lnot (p\\lor q)\\lor q)) \\}\\)"
         "\\(\\{ ((s\\land \\lnot \\lnot q)\\lor (s\\lor s)), ((\\lnot s\\land \\lnot (s\\supset p))\\supset r) \\}\\)"
         "\\(\\{ (p\\lor (r\\supset (s\\lor (s\\supset (q\\equiv p))))), ((p\\supset ((p\\lor (r\\lor q))\\land r))\\lor p) \\}\\)"
         "\\(\\{ ((r\\equiv q)\\equiv ((s\\lor p)\\equiv (r\\equiv q))), ((r\\land r)\\equiv ((p\\lor r)\\lor (q\\land s))) \\}\\)"
         "\\(\\{ ((r\\lor q)\\supset \\lnot (s\\land \\lnot p)), \\lnot (((p\\supset \\lnot r)\\land q)\\lor r) \\}\\)"
         "\\(\\{ ((\\lnot r\\land (p\\lor q))\\equiv (r\\lor p)), ((s\\land p)\\supset ((r\\land (q\\lor p))\\land r)) \\}\\)"]

  :wrong [
          ["\\(\\{ (q\\land (s\\lor \\lnot \\lnot (r\\equiv q))),(p\\land ((p\\land p)\\land (s\\equiv (s\\land s)))) \\)" "az igazságtáblák főoszlopai: 0000011100000111 és 0000000000000000"]
          ["\\(\\{ (\\lnot ((q\\land r)\\supset \\lnot r)\\land s),((r\\lor (p\\land r))\\lor (q\\land (r\\land r))) \\)" "az igazságtáblák főoszlopai: 0000000100000001 és 0011001100110011"]
          ["\\(\\{ ((p\\lor p)\\equiv (r\\supset ((p\\land q)\\supset p))),(q\\land ((q\\equiv (q\\supset r))\\supset (r\\lor q))) \\)" "az igazságtáblák főoszlopai: 0011011011111111 és 0000111100001111"]
          ["\\(\\{ (((q\\land r)\\supset r)\\lor ((p\\land p)\\supset r)),((((q\\land s)\\equiv (r\\equiv s))\\lor q)\\equiv q) \\)" "az igazságtáblák főoszlopai: 1111011111111111 és 1010101011101111"]
          ["\\(\\{ (((s\\lor p)\\land q)\\supset \\lnot (s\\equiv p)),(((q\\supset p)\\supset s)\\land (s\\equiv (q\\lor p))) \\)" "az igazságtáblák főoszlopai: 1100011111111010 és 0000110001100101"]
          ["\\(\\{ ((s\\equiv r)\\land ((s\\lor r)\\equiv (p\\equiv p))),(q\\lor (r\\lor \\lnot (s\\supset \\lnot r))) \\)" "az igazságtáblák főoszlopai: 0010100000001000 és 0011111100111111"]
          ["\\(\\{ ((q\\supset s)\\supset ((s\\lor q)\\equiv \\lnot s)),(q\\supset (((r\\land p)\\equiv s)\\supset (q\\equiv q))) \\)" "az igazságtáblák főoszlopai: 0000111010001010 és 1100111111110110"]
          ["\\(\\{ ((r\\land (s\\land s))\\equiv ((r\\lor q)\\supset q)),(\\lnot p\\lor (\\lnot \\lnot s\\land p)) \\)" "az igazságtáblák főoszlopai: 0011010010010001 és 1100011011100101"]
          ["\\(\\{ \\lnot \\lnot (((q\\lor q)\\equiv r)\\land r),((p\\lor r)\\supset (\\lnot (q\\equiv s)\\supset q)) \\)" "az igazságtáblák főoszlopai: 0010000000100011 és 1110111101011111"]
          ["\\(\\{ \\lnot \\lnot (q\\equiv \\lnot (p\\land q)),(\\lnot (\\lnot q\\supset \\lnot s)\\lor p) \\)" "az igazságtáblák főoszlopai: 0000101111111000 és 0100111011111111"]
          ["\\(\\{ \\lnot ((q\\lor ((r\\supset r)\\land r))\\equiv p),(\\lnot s\\lor ((s\\lor p)\\supset (s\\land p))) \\)" "az igazságtáblák főoszlopai: 0011111111000000 és 1000010111111111"]
          ["\\(\\{ \\lnot (r\\supset \\lnot ((p\\land q)\\lor q)),(\\lnot (r\\supset (q\\lor q))\\land (r\\lor s)) \\)" "az igazságtáblák főoszlopai: 0011011000000011 és 0011001000110000"]
          ["\\(\\{ (r\\equiv ((q\\land s)\\equiv ((s\\lor q)\\supset p))),(\\lnot (p\\equiv q)\\equiv (s\\equiv (s\\supset s))) \\)" "az igazságtáblák főoszlopai: 1010011111001001 és 1000110111101010"]
          ["\\(\\{ (p\\supset ((p\\equiv s)\\equiv \\lnot (r\\supset p))),(\\lnot (s\\equiv p)\\land (p\\land (p\\supset r))) \\)" "az igazságtáblák főoszlopai: 1110111110011010 és 0000000010010010"]
          ["\\(\\{ \\lnot \\lnot ((r\\lor p)\\lor (q\\lor s)),\\lnot ((((q\\supset p)\\land s)\\supset q)\\equiv r) \\)" "az igazságtáblák főoszlopai: 0111111111111111 és 1011110001101100"]
          ["\\(\\{ ((p\\supset (p\\supset r))\\supset \\lnot \\lnot q),((r\\land \\lnot ((q\\supset q)\\equiv s))\\equiv r) \\)" "az igazságtáblák főoszlopai: 0010111101001111 és 1110100111011110"]
          ["\\(\\{ (q\\supset (((\\lnot s\\lor p)\\supset p)\\equiv q)),(((q\\equiv p)\\equiv (r\\land r))\\equiv (r\\supset p)) \\)" "az igazságtáblák főoszlopai: 1100111011111111 és 0000110000100011"]
          ["\\(\\{ (((\\lnot q\\supset r)\\supset q)\\supset (q\\supset s)),((p\\lor r)\\lor ((s\\equiv q)\\land (r\\land p))) \\)" "az igazságtáblák főoszlopai: 1111111111110101 és 0011001111111111"]
          ["\\(\\{ ((r\\land r)\\equiv ((s\\equiv q)\\land (q\\lor r))),((r\\land (p\\supset (s\\equiv r)))\\lor \\lnot s) \\)" "az igazságtáblák főoszlopai: 1110011011011001 és 1010011110111011"]
          ["\\(\\{ ((q\\lor \\lnot (r\\lor r))\\supset (r\\land s)),((r\\land ((q\\lor r)\\supset q))\\lor (s\\supset q)) \\)" "az igazságtáblák főoszlopai: 0011011100110001 és 1010111110011111"]
          ["\\(\\{ ((p\\equiv ((s\\equiv p)\\equiv s))\\lor (s\\supset q)),\\lnot ((p\\land p)\\lor (r\\supset (r\\equiv p))) \\)" "az igazságtáblák főoszlopai: 1100111110011111 és 0011001100000000"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot (((q\\supset s)\\supset s)\\equiv (r\\lor s)), ((r\\lor p)\\lor (((r\\land p)\\lor s)\\lor s)) \\}\\)"
         "\\(\\{ (r\\lor ((p\\supset q)\\lor (q\\supset (q\\land p)))), \\lnot (((r\\supset p)\\lor (s\\equiv p))\\supset s) \\}\\)"
         "\\(\\{ \\lnot (r\\lor (s\\land ((r\\equiv p)\\land p))), ((r\\lor (p\\lor ((q\\supset s)\\land p)))\\lor q) \\}\\)"]

  :wrong [
          ["\\(\\{ \\lnot \\lnot (s\\supset \\lnot (s\\equiv s)),((s\\equiv (r\\lor q))\\supset ((q\\equiv s)\\lor s)) \\)" "az igazságtáblák főoszlopai: 1000010110011010 és 1111111101111111"]
          ["\\(\\{ ((q\\equiv p)\\equiv \\lnot \\lnot (p\\land r)),(s\\equiv \\lnot (\\lnot r\\land \\lnot r)) \\)" "az igazságtáblák főoszlopai: 0000111111000011 és 1010101001101001"]
          ["\\(\\{ (\\lnot (\\lnot (q\\lor r)\\lor p)\\equiv q),((((p\\land p)\\equiv s)\\equiv r)\\equiv (q\\lor r)) \\)" "az igazságtáblák főoszlopai: 1110101000001000 és 1001101011101001"]
          ["\\(\\{ (\\lnot \\lnot (r\\lor (p\\equiv p))\\land p),(((q\\land q)\\land \\lnot (s\\equiv q))\\equiv q) \\)" "az igazságtáblák főoszlopai: 0000000000110011 és 1100010111111010"]
          ["\\(\\{ (\\lnot (s\\land s)\\supset ((p\\supset q)\\supset p)),(((q\\equiv \\lnot s)\\supset s)\\land (p\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0100111111111111 és 1100001000000000"]
          ["\\(\\{ ((p\\supset (s\\equiv s))\\land (q\\land \\lnot p)),(\\lnot ((q\\equiv q)\\supset r)\\supset (p\\land s)) \\)" "az igazságtáblák főoszlopai: 0000011000000000 és 0011001101110111"]
          ["\\(\\{ ((s\\supset s)\\equiv (\\lnot (p\\lor r)\\supset q)),\\lnot (p\\equiv (\\lnot s\\land \\lnot r)) \\)" "az igazságtáblák főoszlopai: 0010001000000000 és 1000000101110111"]
          ["\\(\\{ ((r\\lor s)\\supset \\lnot \\lnot \\lnot s),\\lnot (q\\supset \\lnot (s\\equiv (s\\lor p))) \\)" "az igazságtáblák főoszlopai: 1010110110011010 és 0000111100000101"]
          ["\\(\\{ \\lnot (s\\land ((q\\land p)\\supset (q\\land r))),(\\lnot \\lnot s\\supset (q\\land (q\\lor p))) \\)" "az igazságtáblák főoszlopai: 1000010111111110 és 1000111110011111"]
          ["\\(\\{ ((r\\land (p\\supset s))\\supset ((r\\land p)\\land p)),\\lnot (r\\lor (r\\equiv ((s\\land p)\\land s))) \\)" "az igazságtáblák főoszlopai: 1100010111111111 és 0010000101000100"]
          ["\\(\\{ ((q\\supset (s\\equiv p))\\land ((r\\lor p)\\land r)),(r\\land ((p\\equiv r)\\lor (p\\equiv (s\\lor s)))) \\)" "az igazságtáblák főoszlopai: 0000001100110001 és 0010000100110011"]
          ["\\(\\{ \\lnot ((r\\supset p)\\equiv (q\\land (q\\equiv s))),(q\\lor (\\lnot s\\lor ((s\\equiv q)\\land r))) \\)" "az igazságtáblák főoszlopai: 1110010111111010 és 1000111110011111"]
          ["\\(\\{ (s\\lor ((r\\equiv (p\\land p))\\equiv (q\\supset s))),\\lnot (\\lnot (s\\supset p)\\supset (q\\lor s)) \\)" "az igazságtáblák főoszlopai: 1111111101111101 és 0000111000000000"]
          ["\\(\\{ (((\\lnot (r\\equiv p)\\equiv q)\\land p)\\land p),\\lnot (\\lnot (r\\lor \\lnot r)\\equiv r) \\)" "az igazságtáblák főoszlopai: 0000000010111100 és 0001001000110011"]
          ["\\(\\{ ((\\lnot (p\\land p)\\land r)\\equiv \\lnot s),((\\lnot p\\equiv (s\\land s))\\lor (p\\supset p)) \\)" "az igazságtáblák főoszlopai: 0100000101100101 és 1100011111111111"]
          ["\\(\\{ (q\\lor (((p\\lor r)\\land (p\\equiv r))\\land p)),(\\lnot (q\\supset \\lnot (p\\lor p))\\supset s) \\)" "az igazságtáblák főoszlopai: 0000111100111111 és 1100111111110101"]
          ["\\(\\{ ((q\\equiv (p\\equiv p))\\equiv \\lnot (q\\supset s)),((r\\lor \\lnot s)\\lor ((p\\supset s)\\lor r)) \\)" "az igazságtáblák főoszlopai: 1100001100000101 és 1111011111111111"]
          ["\\(\\{ (\\lnot (\\lnot s\\equiv q)\\supset (q\\supset p)),\\lnot ((r\\lor p)\\supset (q\\equiv (p\\supset r))) \\)" "az igazságtáblák főoszlopai: 1100111011111111 és 0011000100111100"]
          ["\\(\\{ \\lnot (\\lnot (s\\supset p)\\equiv \\lnot p),((p\\land (p\\land (q\\equiv s)))\\supset (s\\land r)) \\)" "az igazságtáblák főoszlopai: 1000010110000000 és 1100011101101011"]
          ["\\(\\{ \\lnot ((q\\equiv (r\\land s))\\lor \\lnot s),((p\\equiv s)\\lor ((r\\land q)\\land (r\\supset s))) \\)" "az igazságtáblák főoszlopai: 0000110101000100 és 1000011101100101"]
          ["\\(\\{ (((s\\lor (q\\land s))\\lor p)\\lor (p\\land s)),(((p\\lor ((r\\equiv p)\\lor r))\\land r)\\land s) \\)" "az igazságtáblák főoszlopai: 0100001111111111 és 0000001100100001"]
          ["\\(\\{ (s\\equiv ((s\\lor p)\\equiv ((r\\land p)\\lor r))),(\\lnot ((r\\land p)\\equiv s)\\supset (r\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0011001100101001 és 1100011110101001"]
          ["\\(\\{ (p\\land (q\\equiv (q\\land (s\\lor \\lnot r)))),(((p\\land p)\\land \\lnot p)\\supset (s\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0000000000000011 és 1100011111111111"]
          ["\\(\\{ (((p\\equiv q)\\supset \\lnot (q\\land q))\\land p),((q\\land (r\\equiv (q\\lor (s\\land r))))\\land q) \\)" "az igazságtáblák főoszlopai: 0000000011110000 és 0000010000000011"]
          ["\\(\\{ ((q\\supset s)\\lor ((s\\equiv s)\\land (r\\lor s))),((r\\equiv s)\\lor (((r\\equiv s)\\land s)\\lor p)) \\)" "az igazságtáblák főoszlopai: 1100111111110101 és 1010101011111111"]
          ["\\(\\{ (((q\\supset q)\\equiv p)\\supset (p\\lor (s\\equiv p))),(((q\\lor r)\\lor s)\\lor (p\\supset (s\\equiv p))) \\)" "az igazságtáblák főoszlopai: 1100111111111111 és 1111111111111111"]
          ["\\(\\{ (\\lnot ((q\\land r)\\equiv r)\\land (q\\supset s)),\\lnot ((p\\land (r\\supset p))\\land (r\\supset p)) \\)" "az igazságtáblák főoszlopai: 0000000000110000 és 1100011010000000"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot (((q\\equiv r)\\supset p)\\equiv (s\\supset q)), (((r\\land q)\\equiv r)\\supset ((s\\equiv p)\\land q)) \\}\\)"
         "\\(\\{ \\lnot (r\\supset (r\\supset \\lnot (r\\equiv r))), ((q\\lor r)\\lor \\lnot ((p\\land r)\\lor p)) \\}\\)"
         "\\(\\{ (\\lnot p\\supset (r\\lor ((p\\land p)\\equiv s))), ((r\\lor s)\\lor (((s\\equiv r)\\supset s)\\equiv p)) \\}\\)"
         "\\(\\{ ((r\\equiv s)\\supset (q\\supset ((s\\lor q)\\lor s))), ((q\\land \\lnot (s\\land r))\\supset (r\\lor q)) \\}\\)"]

  :wrong [
          ["\\(\\{ ((q\\land (\\lnot r\\supset (s\\land q)))\\land q),((\\lnot q\\lor q)\\land (s\\lor (r\\land s))) \\)" "az igazságtáblák főoszlopai: 0000001100000111 és 0100001101100101"]
          ["\\(\\{ ((q\\lor (r\\land r))\\land (p\\land (p\\supset q))),(((p\\equiv q)\\equiv p)\\supset (p\\supset (s\\land q))) \\)" "az igazságtáblák főoszlopai: 0000000000001111 és 1100111111110101"]
          ["\\(\\{ ((q\\supset ((q\\supset p)\\supset r))\\lor \\lnot p),((((p\\equiv s)\\equiv q)\\equiv p)\\supset (r\\land s)) \\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0100101110101011"]
          ["\\(\\{ \\lnot ((s\\lor (q\\land s))\\supset (q\\supset s)),((s\\land (s\\equiv q))\\equiv (p\\equiv (s\\lor s))) \\)" "az igazságtáblák főoszlopai: 0000111000000000 és 0100001111011111"]
          ["\\(\\{ (\\lnot ((s\\lor (q\\land p))\\land p)\\equiv q),((s\\land p)\\supset (p\\supset ((s\\supset p)\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0000101110100000 és 1110111111111011"]
          ["\\(\\{ (((s\\supset s)\\equiv ((q\\lor s)\\lor p))\\lor r),\\lnot (((p\\land q)\\lor q)\\supset \\lnot p) \\)" "az igazságtáblák főoszlopai: 0111101100110011 és 0000111100001111"]
          ["\\(\\{ \\lnot (\\lnot (p\\supset s)\\equiv (s\\land s)),((p\\supset (q\\equiv p))\\land \\lnot \\lnot q) \\)" "az igazságtáblák főoszlopai: 0100001001111111 és 0000111000001111"]
          ["\\(\\{ ((r\\supset (p\\equiv \\lnot r))\\supset \\lnot r),\\lnot (r\\supset \\lnot ((r\\land r)\\supset p)) \\)" "az igazságtáblák főoszlopai: 1110100111111111 és 0010000100110011"]
          ["\\(\\{ ((\\lnot s\\lor (p\\supset s))\\lor \\lnot p),((r\\equiv \\lnot s)\\land \\lnot (r\\equiv p)) \\)" "az igazságtáblák főoszlopai: 1100011111111111 és 0010001101000100"]
          ["\\(\\{ (p\\equiv (r\\supset (p\\supset \\lnot \\lnot r))),((s\\land (s\\equiv s))\\land (q\\supset (s\\lor r))) \\)" "az igazságtáblák főoszlopai: 0010011011111111 és 0100001000000000"]
          ["\\(\\{ (\\lnot (r\\supset r)\\lor (q\\equiv \\lnot s)),(q\\lor ((p\\land q)\\equiv (q\\equiv (r\\supset p)))) \\)" "az igazságtáblák főoszlopai: 0110100111101010 és 1110111111111111"]
          ["\\(\\{ (\\lnot s\\lor (r\\supset (q\\equiv \\lnot r))),((s\\lor q)\\lor ((p\\land p)\\supset (s\\lor q))) \\)" "az igazságtáblák főoszlopai: 1111111111111110 és 1100111111101111"]
          ["\\(\\{ (q\\equiv (r\\lor ((p\\supset p)\\lor (s\\lor q)))),((((p\\land r)\\lor r)\\equiv q)\\land (p\\supset r)) \\)" "az igazságtáblák főoszlopai: 0010101010001111 és 1110010000100011"]
          ["\\(\\{ (p\\equiv (((r\\lor p)\\land r)\\land (s\\land s))),\\lnot \\lnot (((q\\equiv s)\\equiv s)\\supset q) \\)" "az igazságtáblák főoszlopai: 1100010100100001 és 1100111100111111"]
          ["\\(\\{ ((p\\land ((\\lnot q\\equiv r)\\equiv r))\\lor s),(\\lnot \\lnot (r\\supset p)\\lor (q\\supset p)) \\)" "az igazságtáblák főoszlopai: 0100001111110101 és 1110111111111111"]
          ["\\(\\{ (((p\\lor p)\\land r)\\lor (r\\supset (s\\lor s))),((s\\lor q)\\equiv ((p\\supset s)\\lor \\lnot r)) \\)" "az igazságtáblák főoszlopai: 1110101111111111 és 0111101011111101"]
          ["\\(\\{ (\\lnot r\\equiv \\lnot ((q\\lor s)\\supset r)),\\lnot (p\\lor ((r\\supset (p\\equiv r))\\supset q)) \\)" "az igazságtáblák főoszlopai: 0100111001111111 és 1110011000000000"]
          ["\\(\\{ ((s\\land (p\\land (p\\equiv q)))\\land (s\\lor q)),((s\\land s)\\lor ((r\\equiv r)\\land (q\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100011101100101"]
          ["\\(\\{ (r\\supset (\\lnot r\\supset ((q\\supset r)\\land s))),(q\\land (s\\equiv ((p\\equiv p)\\equiv (r\\lor q)))) \\)" "az igazságtáblák főoszlopai: 1111101111111111 és 0000101000001010"]
          ["\\(\\{ ((\\lnot q\\lor (q\\supset q))\\lor \\lnot r),((r\\lor r)\\equiv ((s\\equiv q)\\lor (p\\land r))) \\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0110011010111011"]
          ["\\(\\{ (\\lnot \\lnot \\lnot (r\\land q)\\equiv r),\\lnot (((p\\supset q)\\supset p)\\equiv (q\\lor p)) \\)" "az igazságtáblák főoszlopai: 0010111100110000 és 0000000100000000"]
          ["\\(\\{ ((r\\lor (q\\supset p))\\equiv (\\lnot s\\supset s)),(\\lnot (p\\equiv r)\\equiv \\lnot (p\\supset q)) \\)" "az igazságtáblák főoszlopai: 0110010011100101 és 1110010101000011"]
          ["\\(\\{ (((p\\equiv (q\\supset q))\\supset (r\\equiv p))\\supset p),(s\\lor (((p\\supset q)\\supset (s\\supset s))\\land r)) \\)" "az igazságtáblák főoszlopai: 0011011011111111 és 0100001101110111"]
          ["\\(\\{ ((r\\supset q)\\supset (q\\lor \\lnot \\lnot s)),(q\\lor ((r\\supset q)\\land ((s\\land r)\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0111111101111111 és 1110111100001111"]
          ["\\(\\{ \\lnot \\lnot (\\lnot (r\\equiv s)\\equiv q),((q\\supset s)\\equiv \\lnot ((s\\equiv s)\\land q)) \\)" "az igazságtáblák főoszlopai: 1010011010100110 és 1100111000001010"]
          ["\\(\\{ (p\\land (s\\equiv \\lnot \\lnot (s\\supset r))),(s\\lor \\lnot ((q\\land (s\\lor s))\\lor q)) \\)" "az igazságtáblák főoszlopai: 0000000010100001 és 1100111111110101"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((s\\supset s)\\lor (s\\lor q))\\equiv (r\\supset p)), \\lnot \\lnot ((q\\supset r)\\lor (r\\equiv r)) \\}\\)"
         "\\(\\{ (r\\supset ((r\\lor q)\\supset (p\\lor (s\\lor q)))), (q\\land (s\\lor (q\\lor ((r\\land s)\\land q)))) \\}\\)"
         "\\(\\{ ((s\\land ((p\\supset r)\\supset \\lnot q))\\supset q), ((p\\lor q)\\land (r\\equiv (p\\land (r\\supset q)))) \\}\\)"
         "\\(\\{ (q\\lor (\\lnot (s\\land r)\\equiv \\lnot q)), \\lnot (p\\lor (q\\equiv (p\\supset (p\\supset s)))) \\}\\)"
         "\\(\\{ (q\\land \\lnot ((r\\equiv (p\\equiv p))\\equiv s)), ((q\\land (r\\land q))\\supset (r\\supset (s\\equiv r))) \\}\\)"
         "\\(\\{ ((r\\supset (q\\equiv (r\\lor r)))\\lor (p\\lor p)), (((p\\supset (q\\supset s))\\lor (p\\supset s))\\land q) \\}\\)"
         "\\(\\{ ((s\\supset (s\\land (r\\supset p)))\\equiv \\lnot q), ((r\\supset s)\\supset ((p\\lor (q\\lor r))\\lor q)) \\}\\)"
         "\\(\\{ (q\\lor (((r\\supset r)\\equiv (s\\land s))\\land r)), \\lnot (s\\equiv \\lnot ((q\\equiv s)\\equiv p)) \\}\\)"]

  :wrong [
          ["\\(\\{ (((s\\lor s)\\supset ((p\\land s)\\land p))\\land p),(\\lnot r\\lor (r\\supset ((s\\land q)\\supset p))) \\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1110110111111111"]
          ["\\(\\{ (p\\land (p\\lor \\lnot (s\\supset (r\\equiv r)))),((r\\lor ((r\\supset r)\\lor q))\\land (r\\land p)) \\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0000000000110011"]
          ["\\(\\{ (((p\\supset q)\\supset (s\\lor s))\\equiv (p\\supset q)),\\lnot \\lnot ((r\\supset p)\\supset (r\\land r)) \\)" "az igazságtáblák főoszlopai: 0100011010000101 és 0011001100110011"]
          ["\\(\\{ (\\lnot (s\\lor q)\\equiv \\lnot \\lnot q),((s\\lor (r\\land ((r\\lor r)\\supset q)))\\lor q) \\)" "az igazságtáblák főoszlopai: 0100011101100000 és 0110111101101111"]
          ["\\(\\{ ((\\lnot (r\\equiv r)\\land q)\\equiv \\lnot s),\\lnot (\\lnot p\\supset ((q\\land r)\\supset q)) \\)" "az igazságtáblák főoszlopai: 0100001101100101 és 0000111000000000"]
          ["\\(\\{ (\\lnot (s\\land (s\\lor p))\\supset \\lnot q),(\\lnot (\\lnot q\\equiv q)\\lor (p\\equiv s)) \\)" "az igazságtáblák főoszlopai: 1100111111110101 és 1100010111111111"]
          ["\\(\\{ (((r\\lor \\lnot \\lnot r)\\supset s)\\equiv r),((q\\land (q\\equiv q))\\lor \\lnot (r\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0001001010100001 és 0111011001010110"]
          ["\\(\\{ (r\\supset ((q\\equiv p)\\supset (r\\equiv (r\\equiv s)))),\\lnot (\\lnot (q\\land (q\\supset r))\\land s) \\)" "az igazságtáblák főoszlopai: 1111111111111101 és 1000010001011011"]
          ["\\(\\{ ((q\\lor r)\\lor ((s\\supset (s\\land s))\\lor s)),\\lnot \\lnot (((p\\supset r)\\land s)\\land q) \\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000001100000001"]
          ["\\(\\{ (\\lnot (q\\supset \\lnot (s\\land r))\\land s),(\\lnot ((r\\land r)\\equiv r)\\supset \\lnot q) \\)" "az igazságtáblák főoszlopai: 0000001000000001 és 1100111011110000"]
          ["\\(\\{ \\lnot (((q\\supset \\lnot r)\\equiv p)\\supset s),((\\lnot p\\supset q)\\lor \\lnot (p\\equiv q)) \\)" "az igazságtáblák főoszlopai: 0011011010011000 és 0000111111111111"]
          ["\\(\\{ \\lnot ((p\\supset r)\\lor \\lnot (q\\supset q)),(\\lnot (p\\land (p\\lor (q\\lor q)))\\supset q) \\)" "az igazságtáblák főoszlopai: 0010011001001100 és 0000111111111111"]
          ["\\(\\{ \\lnot ((\\lnot p\\equiv (q\\land s))\\lor q),(\\lnot s\\land (p\\land \\lnot \\lnot s)) \\)" "az igazságtáblák főoszlopai: 1100111010000000 és 0000000000000000"]
          ["\\(\\{ \\lnot (\\lnot (p\\lor r)\\equiv (s\\land r)),((p\\lor (r\\equiv p))\\equiv (r\\land (p\\supset q))) \\)" "az igazságtáblák főoszlopai: 1110101000100001 és 0011000010000011"]
          ["\\(\\{ ((\\lnot p\\equiv (p\\land p))\\lor \\lnot p),(((r\\equiv p)\\lor r)\\supset \\lnot (p\\equiv p)) \\)" "az igazságtáblák főoszlopai: 1100011011000000 és 0010000111001100"]
          ["\\(\\{ ((r\\land (s\\land q))\\land \\lnot (p\\land s)),(((p\\equiv s)\\supset p)\\supset ((q\\supset r)\\lor p)) \\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1111111111111111"]
          ["\\(\\{ (\\lnot (q\\lor p)\\equiv (q\\lor (s\\land s))),(\\lnot ((p\\lor r)\\land (p\\land s))\\land r) \\)" "az igazságtáblák főoszlopai: 0100011110010000 és 0000001000010010"]
          ["\\(\\{ (((q\\land q)\\equiv s)\\land (\\lnot s\\land q)),\\lnot (s\\lor \\lnot ((q\\supset s)\\land r)) \\)" "az igazságtáblák főoszlopai: 0000010000000000 és 0000000100010000"]
          ["\\(\\{ ((((r\\equiv r)\\lor r)\\equiv (p\\lor q))\\supset r),(r\\lor (\\lnot (r\\land (q\\supset q))\\land q)) \\)" "az igazságtáblák főoszlopai: 1111101111111111 és 0011011100111111"]
          ["\\(\\{ ((((r\\land \\lnot s)\\land q)\\lor r)\\equiv p),\\lnot (s\\lor \\lnot (r\\land (r\\lor p))) \\)" "az igazságtáblák főoszlopai: 1110100100110011 és 0011000100010010"]
          ["\\(\\{ \\lnot (p\\supset (r\\land ((r\\land s)\\equiv s))),((\\lnot r\\land q)\\lor (s\\lor (r\\lor s))) \\)" "az igazságtáblák főoszlopai: 0000000011001100 és 0111101101111111"]
          ["\\(\\{ (q\\equiv \\lnot \\lnot (p\\land (r\\equiv r))),((p\\supset \\lnot p)\\equiv (s\\land (r\\land p))) \\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0000000011011110"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((s\\supset s)\\equiv \\lnot (q\\land (s\\lor p))), (((p\\lor r)\\supset (q\\land (r\\equiv r)))\\lor p) \\}\\)"
         "\\(\\{ ((q\\land r)\\lor (\\lnot p\\lor (q\\lor s))), \\lnot ((\\lnot r\\equiv s)\\equiv (p\\supset r)) \\}\\)"
         "\\(\\{ (((q\\lor s)\\land s)\\lor (r\\supset (q\\supset r))), (\\lnot (r\\supset s)\\supset ((s\\lor q)\\equiv p)) \\}\\)"
         "\\(\\{ ((s\\supset r)\\lor (((p\\supset p)\\supset p)\\supset r)), \\lnot ((\\lnot r\\equiv (q\\land s))\\equiv q) \\}\\)"
         "\\(\\{ ((\\lnot q\\lor (s\\equiv \\lnot r))\\land q), (((s\\land p)\\supset \\lnot q)\\equiv (s\\land q)) \\}\\)"
         "\\(\\{ (p\\equiv ((\\lnot (q\\lor p)\\lor q)\\lor r)), ((s\\supset p)\\supset (\\lnot \\lnot r\\supset q)) \\}\\)"
         "\\(\\{ (s\\supset \\lnot \\lnot ((q\\land s)\\supset q)), (((q\\equiv (r\\equiv p))\\supset s)\\lor (r\\lor s)) \\}\\)"
         "\\(\\{ (\\lnot ((r\\equiv (r\\lor q))\\lor p)\\equiv r), (p\\supset (s\\land (\\lnot \\lnot r\\supset r))) \\}\\)"
         "\\(\\{ ((\\lnot \\lnot s\\land (p\\land r))\\supset s), (\\lnot (r\\equiv s)\\equiv ((p\\lor r)\\lor r)) \\}\\)"
         "\\(\\{ (((\\lnot r\\lor p)\\equiv p)\\supset (p\\lor q)), \\lnot ((p\\lor q)\\supset (r\\lor (q\\lor s))) \\}\\)"]

  :wrong [
          ["\\(\\{ (((r\\equiv p)\\supset p)\\supset (p\\equiv (s\\supset r))),((s\\equiv q)\\equiv ((r\\lor p)\\supset \\lnot q)) \\)" "az igazságtáblák főoszlopai: 1110111110111011 és 1011100101011010"]
          ["\\(\\{ \\lnot ((r\\land p)\\land ((r\\equiv p)\\lor p)),(p\\land \\lnot ((q\\equiv (s\\land s))\\lor q)) \\)" "az igazságtáblák főoszlopai: 1100011000101100 és 0000000010100000"]
          ["\\(\\{ (\\lnot ((p\\land (q\\lor r))\\lor r)\\land r),((s\\equiv (\\lnot r\\land s))\\lor (r\\land r)) \\)" "az igazságtáblák főoszlopai: 0010000100000000 és 1111011100111111"]
          ["\\(\\{ \\lnot (\\lnot \\lnot (r\\land s)\\equiv q),(((r\\land (p\\lor (p\\equiv r)))\\supset q)\\land s) \\)" "az igazságtáblák főoszlopai: 0000110000101110 és 0100001101000101"]
          ["\\(\\{ ((p\\lor (p\\land s))\\land (q\\land (s\\equiv s))),(((q\\supset s)\\land p)\\lor ((q\\equiv r)\\lor r)) \\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111011111110111"]
          ["\\(\\{ (((s\\land p)\\land q)\\equiv \\lnot (r\\land r)),(s\\land (q\\supset ((q\\land q)\\supset (s\\equiv q)))) \\)" "az igazságtáblák főoszlopai: 0011001100110110 és 0100001001100101"]
          ["\\(\\{ ((q\\equiv p)\\supset (\\lnot (q\\supset s)\\lor r)),\\lnot ((p\\lor r)\\lor (r\\equiv (s\\land q))) \\)" "az igazságtáblák főoszlopai: 0011111111111011 és 0010000100000000"]
          ["\\(\\{ ((r\\land (p\\lor (r\\land q)))\\lor (p\\lor p)),(p\\lor ((q\\supset ((s\\lor s)\\equiv q))\\supset r)) \\)" "az igazságtáblák főoszlopai: 0000001111111111 és 0011111111111111"]
          ["\\(\\{ (((r\\lor s)\\equiv ((q\\lor s)\\equiv s))\\land s),((q\\supset ((s\\land s)\\lor s))\\lor (q\\lor r)) \\)" "az igazságtáblák főoszlopai: 0100001000000101 és 1111111111111111"]
          ["\\(\\{ (((p\\land r)\\land p)\\equiv ((s\\lor p)\\equiv r)),\\lnot (q\\lor (((p\\lor r)\\land r)\\land s)) \\)" "az igazságtáblák főoszlopai: 0111000011111111 és 1100111011010000"]
          ["\\(\\{ \\lnot (s\\supset (q\\land ((r\\supset q)\\land s))),(r\\equiv (((s\\supset s)\\equiv r)\\supset (s\\supset p))) \\)" "az igazságtáblák főoszlopai: 0100000101100000 és 0000000010110011"]
          ["\\(\\{ \\lnot ((r\\supset s)\\land \\lnot (q\\supset s)),(((s\\land p)\\lor (p\\supset p))\\lor (s\\equiv r)) \\)" "az igazságtáblák főoszlopai: 1100100000001111 és 1110111011111111"]
          ["\\(\\{ (((r\\lor q)\\equiv (q\\lor (s\\supset s)))\\lor s),(\\lnot p\\equiv ((p\\land p)\\land (q\\lor r))) \\)" "az igazságtáblák főoszlopai: 0110101111111111 és 0000000011000000"]
          ["\\(\\{ ((\\lnot r\\supset (q\\equiv s))\\lor (r\\lor s)),((\\lnot (s\\land s)\\supset p)\\equiv \\lnot r) \\)" "az igazságtáblák főoszlopai: 1111111101110111 és 0111000000101100"]
          ["\\(\\{ ((((p\\lor (s\\supset s))\\land r)\\lor s)\\lor s),\\lnot ((r\\supset p)\\lor ((r\\land r)\\supset r)) \\)" "az igazságtáblák főoszlopai: 0100001101110111 és 0010000100000000"]
          ["\\(\\{ (\\lnot \\lnot p\\lor (s\\equiv (q\\supset p))),((p\\lor ((s\\supset (q\\supset s))\\land p))\\lor r) \\)" "az igazságtáblák főoszlopai: 0100110111111111 és 0011001111111111"]
          ["\\(\\{ ((q\\equiv \\lnot s)\\lor (r\\lor (r\\supset r))),((r\\supset (s\\lor \\lnot p))\\equiv (r\\lor q)) \\)" "az igazságtáblák főoszlopai: 1111101111111111 és 0001101010101101"]
          ["\\(\\{ (p\\land \\lnot (((q\\supset p)\\lor s)\\supset q)),((s\\supset p)\\supset ((r\\lor (s\\supset q))\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0000000011110000 és 0110011110100101"]
          ["\\(\\{ (\\lnot (r\\land (s\\equiv (r\\lor s)))\\supset p),((s\\lor (r\\supset s))\\lor (q\\land (p\\land q))) \\)" "az igazságtáblák főoszlopai: 0010001011111111 és 1110101111101111"]
          ["\\(\\{ (((s\\equiv (q\\lor r))\\equiv p)\\equiv (r\\supset p)),(\\lnot (s\\equiv s)\\land (\\lnot s\\supset r)) \\)" "az igazságtáblák főoszlopai: 0101110111100101 és 0000000000000000"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (q\\supset (r\\land (q\\supset ((p\\lor r)\\lor s)))), \\lnot (((r\\lor (q\\lor q))\\supset q)\\supset r) \\}\\)"
         "\\(\\{ (((q\\equiv s)\\lor (s\\equiv (s\\land r)))\\supset r), ((p\\equiv (q\\lor r))\\supset ((q\\supset r)\\lor r)) \\}\\)"
         "\\(\\{ ((s\\lor r)\\land ((s\\supset r)\\lor \\lnot p)), \\lnot (((r\\land (p\\supset q))\\lor r)\\supset q) \\}\\)"
         "\\(\\{ (s\\supset (q\\supset (((s\\land p)\\supset q)\\lor q))), (((p\\equiv (r\\equiv s))\\lor q)\\supset (q\\supset q)) \\}\\)"
         "\\(\\{ ((s\\supset r)\\land \\lnot (q\\lor (r\\land s))), (\\lnot ((s\\supset q)\\lor p)\\land (q\\lor s)) \\}\\)"
         "\\(\\{ \\lnot (((r\\supset r)\\equiv s)\\equiv (p\\land r)), (\\lnot (\\lnot s\\lor q)\\lor (q\\land q)) \\}\\)"
         "\\(\\{ (r\\supset (((s\\equiv q)\\equiv s)\\lor \\lnot p)), (\\lnot \\lnot s\\land ((q\\lor s)\\lor q)) \\}\\)"
         "\\(\\{ ((r\\equiv ((q\\supset r)\\supset (p\\lor r)))\\lor r), ((r\\equiv (q\\equiv s))\\supset \\lnot (s\\supset p)) \\}\\)"
         "\\(\\{ \\lnot (p\\land (r\\supset \\lnot (s\\supset s))), ((p\\equiv \\lnot r)\\supset ((p\\equiv r)\\lor r)) \\}\\)"
         "\\(\\{ (s\\equiv (s\\lor ((p\\lor r)\\land (s\\supset p)))), (q\\supset (((p\\supset q)\\supset (q\\lor s))\\land s)) \\}\\)"]

  :wrong [
          ["\\(\\{ (q\\equiv (q\\land \\lnot \\lnot \\lnot s)),(((r\\supset p)\\equiv (p\\equiv r))\\lor \\lnot p) \\)" "az igazságtáblák főoszlopai: 1100100000000110 és 1100011010110011"]
          ["\\(\\{ (p\\lor (q\\land (q\\equiv \\lnot (r\\supset p)))),(\\lnot \\lnot s\\equiv (p\\equiv (q\\equiv s))) \\)" "az igazságtáblák főoszlopai: 0000010011111111 és 1100111001001111"]
          ["\\(\\{ (((p\\land (p\\supset s))\\supset p)\\supset (r\\supset r)),\\lnot \\lnot \\lnot (r\\lor (p\\lor r)) \\)" "az igazságtáblák főoszlopai: 1111101111111111 és 1110100100000000"]
          ["\\(\\{ (r\\equiv (p\\lor (q\\land \\lnot \\lnot q))),\\lnot ((s\\land q)\\equiv \\lnot \\lnot r) \\)" "az igazságtáblák főoszlopai: 1110010010110011 és 0011000000110110"]
          ["\\(\\{ (((q\\equiv r)\\lor (q\\lor r))\\land (s\\supset p)),\\lnot ((s\\land (q\\equiv q))\\equiv (q\\supset r)) \\)" "az igazságtáblák főoszlopai: 1000010100111111 és 1011110111110011"]
          ["\\(\\{ ((r\\lor ((\\lnot p\\equiv q)\\equiv s))\\lor r),\\lnot \\lnot ((q\\equiv (s\\lor p))\\supset p) \\)" "az igazságtáblák főoszlopai: 1011101100111011 és 0100110011111111"]
          ["\\(\\{ ((((r\\equiv q)\\equiv s)\\supset (r\\supset r))\\equiv r),((\\lnot p\\supset \\lnot q)\\lor (s\\lor s)) \\)" "az igazságtáblák főoszlopai: 0000110010110011 és 1100111111111111"]
          ["\\(\\{ \\lnot (q\\land (p\\land (p\\equiv (p\\land r)))),(\\lnot \\lnot (p\\land r)\\lor \\lnot s) \\)" "az igazságtáblák főoszlopai: 1100011000000010 és 1000010110111011"]
          ["\\(\\{ ((((q\\supset s)\\equiv p)\\supset s)\\equiv (p\\equiv s)),(\\lnot (r\\lor s)\\land \\lnot (r\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1000100000001101 és 0010100000001000"]
          ["\\(\\{ ((q\\supset (p\\lor ((r\\supset r)\\equiv q)))\\land p),((q\\equiv (q\\lor (r\\lor p)))\\supset (r\\supset r)) \\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1111101111111111"]
          ["\\(\\{ \\lnot ((\\lnot q\\land s)\\land (r\\supset s)),(r\\lor ((q\\lor r)\\supset ((q\\equiv q)\\equiv p))) \\)" "az igazságtáblák főoszlopai: 1000010001011111 és 1111011111110011"]
          ["\\(\\{ ((q\\supset (q\\equiv q))\\equiv ((p\\equiv r)\\lor r)),((p\\supset \\lnot q)\\land ((r\\supset r)\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1110110100111100 és 0000110010000000"]
          ["\\(\\{ ((s\\equiv q)\\lor ((r\\land s)\\equiv (r\\equiv p))),(p\\lor ((p\\equiv q)\\supset \\lnot (r\\equiv q))) \\)" "az igazságtáblák főoszlopai: 1011110001011101 és 0011111111111111"]
          ["\\(\\{ (q\\supset \\lnot (q\\lor \\lnot (s\\equiv p))),\\lnot (((r\\equiv s)\\lor p)\\land (q\\supset q)) \\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0100100010000000"]
          ["\\(\\{ ((p\\lor r)\\land \\lnot (q\\supset (r\\equiv q))),((r\\equiv (s\\land r))\\supset (r\\equiv \\lnot q)) \\)" "az igazságtáblák főoszlopai: 0011001100001100 és 0011010100111110"]
          ["\\(\\{ \\lnot (((s\\supset \\lnot r)\\supset r)\\lor p),((r\\supset ((r\\lor r)\\equiv q))\\lor (r\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1110111000000000 és 1110110111101111"]
          ["\\(\\{ \\lnot \\lnot \\lnot (\\lnot p\\land s),((r\\equiv q)\\supset ((s\\equiv \\lnot s)\\equiv r)) \\)" "az igazságtáblák főoszlopai: 1000010000000000 és 1111110101111100"]
          ["\\(\\{ \\lnot ((r\\supset p)\\supset ((q\\supset q)\\lor p)),(\\lnot ((s\\equiv r)\\supset \\lnot r)\\equiv q) \\)" "az igazságtáblák főoszlopai: 0010011000000000 és 1111010000110001"]
          ["\\(\\{ \\lnot ((p\\land \\lnot (p\\lor p))\\land s),((s\\supset p)\\land (((p\\land q)\\lor r)\\land p)) \\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000000000111111"]
          ["\\(\\{ (s\\land (((r\\land q)\\equiv (q\\land p))\\equiv s)),((r\\supset \\lnot (p\\land r))\\supset (r\\supset r)) \\)" "az igazságtáblák főoszlopai: 0100000001100001 és 1111111111111111"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((q\\land s)\\lor (q\\land (p\\lor (p\\lor q)))), ((p\\lor (r\\land q))\\supset ((s\\equiv r)\\land s)) \\}\\)"
         "\\(\\{ (((r\\supset \\lnot p)\\supset q)\\land (s\\lor r)), \\lnot \\lnot ((q\\lor s)\\land (q\\supset r)) \\}\\)"
         "\\(\\{ ((r\\equiv r)\\equiv (\\lnot \\lnot r\\lor r)), (((p\\lor (s\\supset q))\\supset r)\\lor (q\\lor q)) \\}\\)"
         "\\(\\{ (s\\lor ((\\lnot (q\\equiv p)\\land s)\\land s)), (\\lnot s\\lor \\lnot (s\\land (r\\lor q))) \\}\\)"
         "\\(\\{ ((q\\land q)\\supset ((\\lnot r\\lor q)\\lor r)), (r\\supset ((q\\lor (s\\land (r\\supset p)))\\lor q)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (q\\land \\lnot (q\\supset p)), ((r\\supset ((s\\equiv p)\\supset (r\\supset r)))\\supset q) \\}\\)"
         "\\(\\{ (s\\lor \\lnot ((p\\lor s)\\equiv (r\\land q))), (\\lnot s\\land (q\\lor ((q\\lor r)\\lor q))) \\}\\)"
         "\\(\\{ ((((p\\land s)\\land \\lnot q)\\equiv s)\\equiv p), \\lnot (s\\lor (p\\land \\lnot (s\\supset q))) \\}\\)"
         "\\(\\{ (q\\equiv (((r\\lor (p\\supset r))\\land s)\\equiv q)), (((p\\lor p)\\lor r)\\supset \\lnot (q\\land p)) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot \\lnot s\\equiv s)\\equiv s), (r\\land (\\lnot ((q\\supset p)\\lor r)\\equiv s)) \\}\\)"
         "\\(\\{ (\\lnot ((p\\land p)\\land (s\\supset r))\\equiv r), (\\lnot ((s\\equiv r)\\land s)\\lor (q\\lor s)) \\}\\)"
         "\\(\\{ (((s\\equiv s)\\lor \\lnot p)\\lor (r\\lor s)), (((q\\supset q)\\lor r)\\lor ((r\\equiv p)\\equiv p)) \\}\\)"]

  :wrong [
          ["\\(\\{ (\\lnot (q\\supset s)\\supset (p\\equiv (s\\land q))),(r\\equiv (q\\lor ((r\\equiv q)\\land (p\\supset r)))) \\)" "az igazságtáblák főoszlopai: 1100111111110101 és 0001010000010011"]
          ["\\(\\{ (((r\\equiv r)\\lor (p\\equiv r))\\supset \\lnot q),((\\lnot (s\\land s)\\land r)\\lor \\lnot p) \\)" "az igazságtáblák főoszlopai: 1111111011111100 és 1100011110010010"]
          ["\\(\\{ \\lnot \\lnot (q\\land ((q\\equiv r)\\lor q)),\\lnot \\lnot \\lnot ((r\\lor r)\\equiv q) \\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0011110000111100"]
          ["\\(\\{ \\lnot \\lnot (((q\\supset p)\\lor s)\\equiv r),\\lnot ((q\\land p)\\equiv \\lnot (q\\lor p)) \\)" "az igazságtáblák főoszlopai: 0010010010110011 és 1100111000001111"]
          ["\\(\\{ ((s\\equiv s)\\land (\\lnot \\lnot q\\supset s)),(\\lnot (p\\lor q)\\supset \\lnot (r\\equiv r)) \\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000111111111111"]
          ["\\(\\{ ((((r\\lor p)\\equiv r)\\equiv s)\\equiv (s\\land r)),(r\\land ((p\\supset p)\\equiv (s\\supset \\lnot p))) \\)" "az igazságtáblák főoszlopai: 1000011000001111 és 0000001100010010"]
          ["\\(\\{ (r\\land ((q\\equiv (p\\supset q))\\lor (s\\land s))),(\\lnot (s\\equiv (q\\equiv s))\\supset (s\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0000001100110011 és 1100111011001111"]
          ["\\(\\{ (\\lnot (s\\lor ((s\\land p)\\equiv q))\\lor r),((s\\equiv r)\\lor \\lnot \\lnot (p\\lor p)) \\)" "az igazságtáblák főoszlopai: 0011111100111011 és 1010101011111111"]
          ["\\(\\{ (r\\equiv ((s\\land s)\\supset \\lnot (q\\supset r))),(\\lnot \\lnot q\\equiv (q\\land (s\\lor r))) \\)" "az igazságtáblák főoszlopai: 0101110011010010 és 1100110000001111"]
          ["\\(\\{ ((r\\supset p)\\equiv \\lnot (r\\land (r\\supset p))),(p\\lor ((r\\equiv \\lnot \\lnot r)\\equiv s)) \\)" "az igazságtáblák főoszlopai: 1101100000101100 és 0100001111111111"]
          ["\\(\\{ (((q\\land q)\\lor q)\\supset ((s\\equiv q)\\equiv p)),\\lnot \\lnot (\\lnot q\\equiv \\lnot p) \\)" "az igazságtáblák főoszlopai: 1100111011110101 és 1100101001001111"]
          ["\\(\\{ (q\\supset ((s\\lor p)\\equiv ((q\\lor r)\\lor s))),((q\\land s)\\lor ((p\\land s)\\supset \\lnot p)) \\)" "az igazságtáblák főoszlopai: 1110111011111111 és 1100011111011111"]
          ["\\(\\{ (\\lnot \\lnot p\\equiv (q\\equiv (r\\equiv p))),(((((q\\land q)\\equiv q)\\equiv s)\\equiv p)\\supset p) \\)" "az igazságtáblák főoszlopai: 1110011011000011 és 0100001111111111"]
          ["\\(\\{ ((p\\land p)\\land ((s\\land s)\\land (s\\supset r))),((\\lnot s\\equiv p)\\supset (q\\equiv (s\\equiv p))) \\)" "az igazságtáblák főoszlopai: 0000000000100001 és 1100110101110101"]
          ["\\(\\{ ((\\lnot r\\land (s\\land p))\\land (r\\supset p)),(((p\\land r)\\land (r\\land (s\\equiv q)))\\land q) \\)" "az igazságtáblák főoszlopai: 0000000001000100 és 0000000000000001"]
          ["\\(\\{ ((r\\equiv s)\\equiv ((q\\land (q\\supset q))\\equiv r)),(r\\equiv (((\\lnot p\\equiv s)\\equiv p)\\equiv p)) \\)" "az igazságtáblák főoszlopai: 1000111110110101 és 1010101000110110"]
          ["\\(\\{ ((\\lnot ((s\\equiv q)\\lor q)\\land q)\\lor p),\\lnot \\lnot (q\\lor ((r\\land q)\\land r)) \\)" "az igazságtáblák főoszlopai: 0000111011111111 és 0000111100001111"]
          ["\\(\\{ \\lnot \\lnot (p\\lor ((r\\equiv s)\\land r)),\\lnot \\lnot (((q\\equiv s)\\supset q)\\equiv r) \\)" "az igazságtáblák főoszlopai: 0010001011111111 és 1010010001100011"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\supset q)\\lor (((q\\land s)\\lor q)\\equiv p)), (\\lnot (\\lnot s\\equiv s)\\land \\lnot r) \\}\\)"
         "\\(\\{ (((q\\land p)\\supset s)\\equiv (s\\supset (s\\equiv s))), \\lnot (((q\\land p)\\lor (q\\equiv q))\\lor q) \\}\\)"
         "\\(\\{ ((r\\lor (s\\supset q))\\equiv (\\lnot s\\equiv s)), (((r\\supset q)\\land (q\\supset q))\\equiv \\lnot p) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot r\\equiv s)\\lor (r\\lor p)), (\\lnot (\\lnot s\\supset q)\\lor (q\\equiv p)) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot ((s\\land r)\\equiv r)\\equiv s)), \\lnot (\\lnot (r\\equiv (p\\equiv s))\\lor r) \\}\\)"]

  :wrong [
          ["\\(\\{ ((\\lnot (q\\equiv s)\\equiv q)\\equiv (s\\supset r)),\\lnot (p\\land (r\\supset (r\\equiv (q\\equiv r)))) \\)" "az igazságtáblák főoszlopai: 1110100000111110 és 1100011010010000"]
          ["\\(\\{ \\lnot \\lnot (p\\equiv \\lnot (s\\supset r)),((q\\supset p)\\lor ((r\\equiv q)\\equiv \\lnot q)) \\)" "az igazságtáblák főoszlopai: 1011011101000100 és 1111111011111111"]
          ["\\(\\{ (\\lnot (p\\land q)\\land (r\\land (r\\equiv s))),(((s\\equiv p)\\lor ((r\\lor r)\\land r))\\lor s) \\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1111011101110111"]
          ["\\(\\{ (r\\lor ((s\\equiv (r\\land (r\\supset s)))\\lor p)),((p\\lor p)\\equiv ((s\\land \\lnot p)\\supset s)) \\)" "az igazságtáblák főoszlopai: 1011101111111111 és 0000000101100101"]
          ["\\(\\{ \\lnot ((p\\equiv (p\\lor s))\\equiv (q\\supset p)),((q\\lor p)\\supset \\lnot ((r\\supset r)\\lor s)) \\)" "az igazságtáblák főoszlopai: 0100101100000000 és 1110111100000000"]
          ["\\(\\{ (\\lnot ((q\\equiv r)\\lor s)\\supset (r\\land s)),(((p\\lor p)\\equiv (r\\land q))\\lor (p\\supset p)) \\)" "az igazságtáblák főoszlopai: 1110011101100111 és 1100011111111111"]
          ["\\(\\{ (\\lnot \\lnot r\\equiv ((q\\supset q)\\supset r)),\\lnot \\lnot ((s\\lor r)\\supset (p\\land q)) \\)" "az igazságtáblák főoszlopai: 1100110000000000 és 1010100110001111"]
          ["\\(\\{ (\\lnot q\\equiv (\\lnot p\\lor (s\\equiv r))),\\lnot (q\\lor \\lnot ((q\\equiv s)\\lor r)) \\)" "az igazságtáblák főoszlopai: 1111101000010110 és 1011011001110000"]
          ["\\(\\{ (\\lnot r\\land ((s\\supset r)\\supset (r\\land q))),((p\\supset (((r\\supset r)\\equiv q)\\land r))\\supset s) \\)" "az igazságtáblák főoszlopai: 0110100101000100 és 0111111101111101"]
          ["\\(\\{ (((\\lnot q\\lor q)\\land q)\\lor (s\\land p)),((r\\lor p)\\supset ((s\\land r)\\supset (q\\land p))) \\)" "az igazságtáblák főoszlopai: 0000111101101111 és 1110110111011111"]
          ["\\(\\{ \\lnot ((\\lnot q\\supset p)\\supset (s\\lor r)),\\lnot (((q\\lor s)\\equiv (q\\supset p))\\land p) \\)" "az igazságtáblák főoszlopai: 0010011010001000 és 1100011001010000"]
          ["\\(\\{ (p\\land \\lnot \\lnot (\\lnot r\\supset q)),((r\\supset \\lnot s)\\lor ((s\\land p)\\land s)) \\)" "az igazságtáblák főoszlopai: 0000000000111111 és 1110110111111111"]
          ["\\(\\{ ((\\lnot (\\lnot q\\lor r)\\land r)\\lor s),(\\lnot ((s\\land p)\\equiv p)\\equiv (q\\lor r)) \\)" "az igazságtáblák főoszlopai: 0110001101100101 és 1110011001011010"]
          ["\\(\\{ (q\\equiv (\\lnot s\\equiv \\lnot (r\\supset p))),\\lnot \\lnot ((p\\supset s)\\lor (r\\equiv r)) \\)" "az igazságtáblák főoszlopai: 1011101001010101 és 1100011111100101"]
          ["\\(\\{ \\lnot (\\lnot (q\\equiv (s\\equiv r))\\lor q),\\lnot (\\lnot (r\\supset p)\\equiv (p\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0111011010010000 és 1111010100000000"]
          ["\\(\\{ (\\lnot (q\\lor \\lnot (r\\supset r))\\land p),((s\\land ((q\\equiv (r\\equiv s))\\equiv r))\\lor s) \\)" "az igazságtáblák főoszlopai: 0000000011110000 és 0100001101100101"]
          ["\\(\\{ (((q\\supset q)\\equiv s)\\equiv ((s\\supset q)\\land q)),\\lnot (r\\supset (r\\supset \\lnot (p\\lor r))) \\)" "az igazságtáblák főoszlopai: 1000010100010101 és 0011001100110011"]
          ["\\(\\{ ((q\\equiv s)\\land ((s\\lor q)\\equiv (r\\supset q))),(\\lnot (r\\land (q\\supset (r\\supset s)))\\lor r) \\)" "az igazságtáblák főoszlopai: 0000100001010101 és 1111101111111111"]
          ["\\(\\{ ((\\lnot p\\lor p)\\lor \\lnot (r\\land s)),\\lnot (q\\supset (((p\\land r)\\land s)\\lor q)) \\)" "az igazságtáblák főoszlopai: 1100011111111111 és 0000111000000000"]
          ["\\(\\{ (((\\lnot p\\land (s\\equiv q))\\supset s)\\equiv p),((\\lnot p\\land p)\\equiv \\lnot (p\\supset r)) \\)" "az igazságtáblák főoszlopai: 1000010101100101 és 1111011100110011"]
          ["\\(\\{ \\lnot ((p\\lor (r\\equiv (s\\lor p)))\\land q),(((q\\lor (p\\supset s))\\lor r)\\supset \\lnot q) \\)" "az igazságtáblák főoszlopai: 1100100000001000 és 1110111011110000"]
          ["\\(\\{ ((\\lnot ((s\\lor s)\\equiv s)\\land p)\\equiv r),((p\\land q)\\supset (q\\lor (\\lnot q\\equiv q))) \\)" "az igazságtáblák főoszlopai: 1110100111001100 és 1100111100001111"]
          ["\\(\\{ (\\lnot r\\supset \\lnot \\lnot (s\\lor q)),(((q\\lor p)\\supset s)\\supset ((r\\land r)\\lor q)) \\)" "az igazságtáblák főoszlopai: 0111111101111111 és 0011111110111111"]
          ["\\(\\{ ((s\\land (r\\equiv s))\\equiv (q\\lor \\lnot r)),\\lnot ((\\lnot p\\lor q)\\supset (r\\equiv q)) \\)" "az igazságtáblák főoszlopai: 0011010101010001 és 0011011110001100"]
          ["\\(\\{ ((q\\lor ((p\\supset q)\\land (s\\land r)))\\supset s),\\lnot ((\\lnot p\\supset s)\\supset (p\\lor s)) \\)" "az igazságtáblák főoszlopai: 1100111111110101 és 0000000100000000"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (s\\lor (p\\equiv (p\\lor ((r\\supset r)\\land r)))), ((q\\lor (p\\equiv q))\\supset (s\\equiv (q\\equiv s))) \\}\\)"
         "\\(\\{ ((r\\supset q)\\land (q\\lor ((p\\equiv q)\\lor p))), (\\lnot (q\\lor s)\\supset \\lnot (s\\lor r)) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\supset ((s\\lor (r\\equiv s))\\lor q)), ((q\\supset (r\\lor s))\\lor (q\\land (s\\supset r))) \\}\\)"
         "\\(\\{ (q\\supset ((p\\supset s)\\supset (p\\land (s\\equiv p)))), (s\\supset ((q\\supset s)\\supset ((p\\supset p)\\lor s))) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (s\\supset r)\\supset (r\\lor q)), ((q\\land \\lnot (\\lnot s\\land r))\\equiv s) \\}\\)"
         "\\(\\{ \\lnot (r\\land ((s\\lor s)\\supset (r\\land r))), ((((r\\land p)\\supset s)\\land s)\\supset \\lnot r) \\}\\)"]

  :wrong [
          ["\\(\\{ ((r\\equiv ((r\\equiv r)\\supset (s\\equiv p)))\\land s),((((q\\equiv r)\\land q)\\supset (q\\lor r))\\equiv r) \\)" "az igazságtáblák főoszlopai: 0100001100100001 és 0000110000001011"]
          ["\\(\\{ (\\lnot \\lnot (s\\lor s)\\land (r\\equiv q)),(\\lnot (s\\land p)\\equiv \\lnot \\lnot r) \\)" "az igazságtáblák főoszlopai: 0100000000100001 és 0010110110010110"]
          ["\\(\\{ ((r\\land ((p\\supset r)\\supset s))\\lor (p\\equiv p)),\\lnot (((p\\supset \\lnot p)\\supset q)\\lor r) \\)" "az igazságtáblák főoszlopai: 1110011100100001 és 1110011000000000"]
          ["\\(\\{ \\lnot (((s\\lor s)\\land \\lnot r)\\supset p),(\\lnot (q\\equiv r)\\supset ((q\\lor q)\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0100000100000000 és 1110110001110111"]
          ["\\(\\{ (((q\\lor \\lnot r)\\equiv p)\\equiv (q\\lor r)),(\\lnot s\\land ((r\\equiv (s\\land r))\\land s)) \\)" "az igazságtáblák főoszlopai: 1100101100001111 és 0000000000000000"]
          ["\\(\\{ (\\lnot (\\lnot (r\\land r)\\lor q)\\land r),(s\\land (p\\equiv ((r\\equiv p)\\land \\lnot r))) \\)" "az igazságtáblák főoszlopai: 0011001000110000 és 0000001100000000"]
          ["\\(\\{ ((p\\equiv (p\\land (s\\supset s)))\\equiv (p\\equiv r)),\\lnot ((\\lnot (r\\lor q)\\lor s)\\lor s) \\)" "az igazságtáblák főoszlopai: 1111011011001100 és 0011111000011010"]
          ["\\(\\{ \\lnot (r\\supset (((p\\supset q)\\land s)\\land r)),((q\\lor q)\\lor (q\\equiv ((p\\supset q)\\supset p))) \\)" "az igazságtáblák főoszlopai: 0011000100110010 és 1100111100001111"]
          ["\\(\\{ (\\lnot (p\\supset r)\\equiv \\lnot (s\\lor s)),\\lnot (p\\land ((s\\lor p)\\supset (s\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0111000100101001 és 1100011001010110"]
          ["\\(\\{ (\\lnot ((s\\land q)\\supset (p\\lor p))\\equiv r),(p\\supset (((q\\supset s)\\land s)\\land \\lnot r)) \\)" "az igazságtáblák főoszlopai: 1110101000101100 és 1100011111000100"]
          ["\\(\\{ (\\lnot ((s\\equiv s)\\equiv \\lnot q)\\equiv s),(((q\\lor q)\\supset s)\\land (\\lnot r\\supset r)) \\)" "az igazságtáblák főoszlopai: 1000100101101010 és 0000001100110001"]
          ["\\(\\{ ((\\lnot \\lnot r\\lor (p\\lor p))\\land s),((s\\supset (q\\equiv q))\\equiv \\lnot \\lnot s) \\)" "az igazságtáblák főoszlopai: 0000001101100101 és 0100001010000000"]
          ["\\(\\{ ((((r\\supset p)\\equiv p)\\supset (r\\lor s))\\lor s),(\\lnot (s\\supset r)\\supset ((q\\supset q)\\supset r)) \\)" "az igazságtáblák főoszlopai: 1111101101110111 és 1011111110111011"]
          ["\\(\\{ (\\lnot \\lnot (p\\land q)\\equiv (q\\land p)),(r\\land \\lnot \\lnot (q\\equiv (q\\land p))) \\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000001000110011"]
          ["\\(\\{ ((q\\lor p)\\land (p\\equiv ((s\\equiv r)\\land r))),((q\\supset (p\\supset r))\\equiv (s\\supset (q\\land q))) \\)" "az igazságtáblák főoszlopai: 0000100010100001 és 1010101001010011"]
          ["\\(\\{ (\\lnot \\lnot (s\\supset (q\\supset p))\\equiv q),((q\\lor s)\\land \\lnot \\lnot (q\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0000011010001111 és 0100111000001111"]
          ["\\(\\{ (((q\\lor q)\\equiv (q\\land (q\\land r)))\\land p),\\lnot (\\lnot p\\land \\lnot (q\\lor p)) \\)" "az igazságtáblák főoszlopai: 0000000000001011 és 0000000000000000"]
          ["\\(\\{ ((s\\supset s)\\lor (p\\supset ((q\\land s)\\lor r))),((\\lnot s\\equiv (s\\lor q))\\equiv (s\\equiv p)) \\)" "az igazságtáblák főoszlopai: 1111011111111111 és 0100110100010000"]
          ["\\(\\{ (p\\supset \\lnot ((q\\equiv p)\\equiv (q\\supset r))),((p\\land (s\\equiv (q\\equiv (p\\land p))))\\land s) \\)" "az igazságtáblák főoszlopai: 1111011111111100 és 0000000000000101"]
          ["\\(\\{ \\lnot (s\\lor (r\\lor (p\\land (p\\land s)))),((r\\lor \\lnot (q\\lor q))\\lor (s\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1010100110001000 és 1111111111110111"]
          ["\\(\\{ ((r\\supset (q\\supset s))\\lor \\lnot (s\\lor r)),((q\\land (p\\land \\lnot \\lnot p))\\land p) \\)" "az igazságtáblák főoszlopai: 1110111111111101 és 0000000000001111"]
          ["\\(\\{ \\lnot ((q\\lor q)\\supset (q\\supset \\lnot p)),((s\\supset (p\\supset q))\\lor ((q\\lor s)\\land s)) \\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1100111111111111"]
          ["\\(\\{ \\lnot ((r\\equiv s)\\equiv (s\\supset \\lnot q)),(((s\\land s)\\lor r)\\land \\lnot \\lnot q) \\)" "az igazságtáblák főoszlopai: 0110010110010011 és 0000001100000111"]
          ["\\(\\{ \\lnot (q\\equiv (r\\supset (r\\lor (p\\land r)))),(((s\\equiv (r\\equiv s))\\equiv q)\\land (r\\land q)) \\)" "az igazságtáblák főoszlopai: 1111010011110000 és 0000000000000011"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot (q\\supset s)\\supset (s\\supset (s\\supset r))), (r\\equiv (p\\lor ((p\\supset r)\\equiv (p\\supset q)))) \\}\\)"
         "\\(\\{ (q\\supset (\\lnot ((q\\land s)\\lor s)\\supset p)), (\\lnot (r\\supset (q\\equiv s))\\lor (r\\supset q)) \\}\\)"
         "\\(\\{ ((p\\land \\lnot s)\\supset ((r\\equiv r)\\lor s)), (((s\\supset s)\\lor ((r\\land p)\\lor r))\\equiv p) \\}\\)"
         "\\(\\{ \\lnot (q\\lor ((r\\supset \\lnot p)\\land p)), (r\\lor (s\\equiv (q\\supset (q\\land (q\\supset p))))) \\}\\)"
         "\\(\\{ ((s\\equiv ((s\\supset q)\\lor s))\\lor (s\\lor p)), ((r\\equiv p)\\land (r\\lor \\lnot (p\\lor r))) \\}\\)"
         "\\(\\{ (\\lnot (q\\lor \\lnot s)\\equiv (s\\supset r)), ((r\\land \\lnot q)\\land ((s\\lor p)\\supset s)) \\}\\)"
         "\\(\\{ ((p\\lor p)\\land ((s\\supset (p\\lor s))\\supset r)), (r\\lor ((r\\land q)\\lor \\lnot (p\\land r))) \\}\\)"
         "\\(\\{ ((r\\lor (p\\equiv q))\\equiv \\lnot \\lnot s), (r\\supset (((q\\equiv r)\\land s)\\supset \\lnot r)) \\}\\)"
         "\\(\\{ ((\\lnot s\\equiv \\lnot p)\\lor (q\\land p)), ((((s\\land q)\\lor s)\\equiv r)\\supset (r\\land p)) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (p\\supset q)\\land \\lnot r), (((s\\land (q\\supset (s\\lor q)))\\supset q)\\equiv q) \\}\\)"
         "\\(\\{ ((\\lnot p\\lor s)\\equiv ((p\\supset p)\\land s)), (s\\land (q\\supset ((p\\supset (s\\equiv s))\\land r))) \\}\\)"
         "\\(\\{ (\\lnot s\\lor (p\\lor \\lnot (s\\land s))), (q\\supset \\lnot (r\\lor ((s\\land p)\\lor r))) \\}\\)"
         "\\(\\{ ((((r\\land q)\\lor p)\\equiv q)\\supset \\lnot q), ((p\\equiv \\lnot (\\lnot r\\equiv s))\\equiv r) \\}\\)"
         "\\(\\{ (((r\\lor p)\\lor (r\\supset (s\\supset s)))\\supset s), (\\lnot \\lnot \\lnot (r\\supset q)\\equiv r) \\}\\)"]

  :wrong [
          ["\\(\\{ ((r\\supset r)\\supset ((q\\land (q\\supset s))\\land p)),\\lnot (((r\\supset r)\\land r)\\lor (p\\equiv q)) \\)" "az igazságtáblák főoszlopai: 0010000100000101 és 0010011011000000"]
          ["\\(\\{ (((s\\land (s\\land q))\\supset q)\\supset (s\\equiv p)),((s\\supset q)\\land ((s\\land (r\\land q))\\supset s)) \\)" "az igazságtáblák főoszlopai: 1000111101100101 és 1000011110011111"]
          ["\\(\\{ ((\\lnot p\\equiv q)\\equiv \\lnot (s\\lor p)),((r\\land q)\\supset ((r\\land s)\\lor (s\\lor q))) \\)" "az igazságtáblák főoszlopai: 0100111110001111 és 1100111111111111"]
          ["\\(\\{ ((s\\supset r)\\equiv (p\\land (r\\supset (p\\land q)))),((s\\supset \\lnot (\\lnot r\\supset s))\\supset q) \\)" "az igazságtáblák főoszlopai: 0110111010001011 és 0111111101101111"]
          ["\\(\\{ \\lnot \\lnot \\lnot \\lnot \\lnot s,((r\\equiv \\lnot q)\\supset \\lnot (p\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1000010110011010 és 1111111111110011"]
          ["\\(\\{ ((s\\supset (p\\equiv q))\\lor (r\\supset \\lnot s)),(r\\land \\lnot (((q\\equiv r)\\equiv r)\\land p)) \\)" "az igazságtáblák főoszlopai: 1110111111011111 és 0000001000010000"]
          ["\\(\\{ (((s\\equiv q)\\equiv (q\\lor (s\\lor q)))\\lor q),((r\\land p)\\land (s\\land ((p\\land s)\\lor r))) \\)" "az igazságtáblák főoszlopai: 0000111111001111 és 0000000000100001"]
          ["\\(\\{ ((q\\equiv (\\lnot q\\lor (r\\equiv s)))\\land q),\\lnot (((p\\lor q)\\lor s)\\land (p\\supset q)) \\)" "az igazságtáblák főoszlopai: 0000101100001001 és 1000111001110000"]
          ["\\(\\{ ((p\\lor ((p\\equiv p)\\lor (r\\equiv p)))\\lor q),\\lnot (((q\\equiv p)\\lor p)\\equiv (s\\lor q)) \\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1000000110010000"]
          ["\\(\\{ ((\\lnot \\lnot (q\\lor s)\\supset q)\\equiv r),(((s\\supset (p\\lor r))\\equiv \\lnot s)\\equiv r) \\)" "az igazságtáblák főoszlopai: 0110010011010011 és 0001000110010110"]
          ["\\(\\{ (\\lnot (p\\supset (r\\supset q))\\land \\lnot r),((r\\supset (p\\land q))\\lor (q\\supset (q\\land q))) \\)" "az igazságtáblák főoszlopai: 0010000000000000 és 1110111111111111"]
          ["\\(\\{ (\\lnot ((q\\land s)\\lor \\lnot r)\\supset p),((p\\equiv \\lnot p)\\land (q\\lor \\lnot p)) \\)" "az igazságtáblák főoszlopai: 1110101111111111 és 0000000000000000"]
          ["\\(\\{ \\lnot \\lnot \\lnot ((q\\land r)\\equiv r),(r\\equiv \\lnot (s\\land (q\\lor (s\\lor q)))) \\)" "az igazságtáblák főoszlopai: 0011000000110000 és 0110111101010110"]
          ["\\(\\{ (\\lnot (s\\supset r)\\supset ((r\\lor r)\\lor r)),((q\\land \\lnot (p\\equiv p))\\land (r\\lor r)) \\)" "az igazságtáblák főoszlopai: 1011011110111011 és 0000000000000000"]
          ["\\(\\{ \\lnot ((p\\supset r)\\land ((r\\equiv p)\\supset r)),\\lnot ((s\\supset s)\\land ((p\\land r)\\land p)) \\)" "az igazságtáblák főoszlopai: 1110100101001100 és 1100011000101100"]
          ["\\(\\{ ((p\\land q)\\equiv (p\\equiv ((s\\lor p)\\lor s))),((\\lnot r\\lor ((r\\equiv q)\\supset r))\\supset s) \\)" "az igazságtáblák főoszlopai: 0100001100001111 és 0110011101100101"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((q\\supset q)\\land \\lnot (p\\supset (s\\lor q))), (((q\\supset q)\\supset ((q\\supset p)\\land p))\\equiv p) \\}\\)"
         "\\(\\{ (((p\\lor \\lnot s)\\lor r)\\land (q\\supset s)), (\\lnot (s\\lor p)\\lor \\lnot (p\\equiv s)) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot q\\land s)\\lor \\lnot p), (p\\equiv \\lnot (((q\\land s)\\lor q)\\equiv p)) \\}\\)"
         "\\(\\{ (p\\supset (r\\supset (q\\supset (\\lnot p\\equiv p)))), ((q\\equiv (((p\\lor q)\\land s)\\equiv p))\\equiv r) \\}\\)"
         "\\(\\{ ((((\\lnot r\\supset p)\\equiv q)\\equiv r)\\supset p), ((r\\supset (r\\land ((p\\equiv r)\\land p)))\\lor s) \\}\\)"
         "\\(\\{ (((q\\equiv p)\\supset (q\\supset r))\\lor (p\\land q)), (\\lnot p\\supset \\lnot ((q\\land p)\\land s)) \\}\\)"
         "\\(\\{ ((q\\land (r\\equiv (r\\land q)))\\supset (q\\supset r)), \\lnot (s\\equiv ((q\\land p)\\lor (s\\supset q))) \\}\\)"
         "\\(\\{ \\lnot ((r\\land r)\\equiv (p\\land \\lnot p)), (((p\\land \\lnot q)\\lor p)\\supset (s\\equiv q)) \\}\\)"]

  :wrong [
          ["\\(\\{ (((q\\lor s)\\land ((p\\equiv p)\\equiv r))\\land s),\\lnot (\\lnot (r\\equiv r)\\supset (s\\land p)) \\)" "az igazságtáblák főoszlopai: 0000000101000100 és 0000000001011010"]
          ["\\(\\{ ((p\\equiv (q\\equiv q))\\land \\lnot \\lnot p),((q\\lor q)\\equiv (\\lnot (r\\lor p)\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0000000010000000 és 1101011011011100"]
          ["\\(\\{ ((\\lnot p\\equiv q)\\supset \\lnot (q\\land r)),((q\\land (p\\land (r\\equiv r)))\\equiv \\lnot s) \\)" "az igazságtáblák főoszlopai: 1100110111111111 és 0100001101100101"]
          ["\\(\\{ ((p\\equiv q)\\land ((\\lnot r\\lor s)\\land r)),((s\\lor (p\\lor p))\\equiv ((q\\lor r)\\equiv s)) \\)" "az igazságtáblák főoszlopai: 0000001000000001 és 0011111001100101"]
          ["\\(\\{ (\\lnot (s\\supset s)\\land ((r\\supset q)\\land s)),(((r\\lor q)\\land r)\\equiv ((r\\supset r)\\supset r)) \\)" "az igazságtáblák főoszlopai: 0000000100000000 és 1100011000000000"]
          ["\\(\\{ ((s\\equiv (r\\equiv p))\\land \\lnot (s\\land q)),((r\\equiv (r\\land p))\\supset ((p\\equiv p)\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0100000001101000 és 0011001110000000"]
          ["\\(\\{ ((q\\supset (s\\land s))\\supset \\lnot (s\\land q)),((q\\land (p\\land s))\\land (r\\supset (q\\supset s))) \\)" "az igazságtáblák főoszlopai: 1100111111111010 és 0000000000000101"]
          ["\\(\\{ \\lnot ((s\\supset q)\\equiv (q\\supset (q\\equiv p))),((q\\equiv r)\\land \\lnot ((q\\equiv q)\\supset r)) \\)" "az igazságtáblák főoszlopai: 0100000101100000 és 1110000000000000"]
          ["\\(\\{ \\lnot ((p\\equiv (s\\land (p\\equiv q)))\\supset q),((s\\supset \\lnot (q\\lor s))\\lor (p\\supset q)) \\)" "az igazságtáblák főoszlopai: 1000111000000000 és 1100111110011111"]
          ["\\(\\{ ((s\\supset \\lnot q)\\land \\lnot (q\\supset r)),((s\\lor ((p\\land p)\\equiv (r\\supset s)))\\equiv q) \\)" "az igazságtáblák főoszlopai: 0000011000001000 és 1010010010011101"]
          ["\\(\\{ \\lnot ((s\\equiv (r\\supset r))\\supset (q\\lor q)),(s\\equiv ((r\\lor p)\\lor \\lnot (p\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0110011001100000 és 1010101011100101"]
          ["\\(\\{ (r\\equiv \\lnot ((q\\land p)\\lor (s\\equiv s))),(((p\\land p)\\lor r)\\equiv (q\\lor \\lnot s)) \\)" "az igazságtáblák főoszlopai: 1110100111000100 és 0110010001011111"]
          ["\\(\\{ ((s\\supset p)\\supset (\\lnot \\lnot s\\supset p)),((r\\equiv p)\\supset \\lnot ((r\\supset r)\\equiv r)) \\)" "az igazságtáblák főoszlopai: 1100011111111111 és 1111101111001100"]
          ["\\(\\{ \\lnot ((q\\lor r)\\supset (r\\equiv \\lnot s)),((s\\lor (s\\equiv (p\\lor q)))\\lor \\lnot p) \\)" "az igazságtáblák főoszlopai: 0011011000101001 és 1100111111100101"]
          ["\\(\\{ ((q\\lor (p\\land r))\\equiv \\lnot (p\\supset q)),(\\lnot (s\\equiv q)\\lor (p\\land (s\\equiv r))) \\)" "az igazságtáblák főoszlopai: 1100011110110000 és 0100110001101011"]
          ["\\(\\{ \\lnot (\\lnot (p\\supset p)\\supset (q\\equiv p)),\\lnot (s\\lor ((q\\equiv p)\\lor \\lnot r)) \\)" "az igazságtáblák főoszlopai: 0000111100000000 és 0011011000010000"]
          ["\\(\\{ ((\\lnot (s\\supset r)\\supset p)\\land (s\\equiv r)),(\\lnot \\lnot \\lnot (s\\lor r)\\supset s) \\)" "az igazságtáblák főoszlopai: 1010001001101001 és 0111001101110111"]
          ["\\(\\{ ((s\\land r)\\lor (s\\supset (s\\equiv (q\\equiv p)))),(\\lnot (\\lnot (r\\supset s)\\equiv p)\\equiv p) \\)" "az igazságtáblák főoszlopai: 1100111110111111 és 1110101111101101"]
          ["\\(\\{ ((((q\\land p)\\supset p)\\land (q\\equiv q))\\equiv p),((\\lnot (s\\lor q)\\supset s)\\equiv (q\\lor r)) \\)" "az igazságtáblák főoszlopai: 0000000010000000 és 1010101001101111"]
          ["\\(\\{ (((r\\supset (s\\land p))\\equiv p)\\land (p\\land p)),(s\\lor ((s\\equiv q)\\equiv ((s\\supset p)\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0000000011101101 és 0111101111111101"]
          ["\\(\\{ ((q\\land (s\\lor p))\\supset (r\\equiv (q\\lor p))),(\\lnot s\\equiv (q\\equiv ((q\\supset p)\\lor s))) \\)" "az igazságtáblák főoszlopai: 1110010111110011 és 0100010111101010"]
          ["\\(\\{ (q\\equiv \\lnot (s\\equiv (p\\equiv \\lnot q))),((\\lnot (p\\supset p)\\equiv (q\\land r))\\supset q) \\)" "az igazságtáblák főoszlopai: 1000010101100101 és 0000111110001111"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((p\\supset p)\\lor ((p\\land s)\\supset \\lnot p)), (\\lnot q\\supset (s\\lor (r\\land (s\\lor r)))) \\}\\)"
         "\\(\\{ (((q\\land r)\\equiv (r\\lor s))\\lor \\lnot r), (r\\lor (r\\equiv \\lnot \\lnot (p\\supset r))) \\}\\)"
         "\\(\\{ \\lnot (p\\equiv (\\lnot (s\\equiv s)\\equiv p)), ((s\\lor r)\\equiv (((r\\equiv s)\\land q)\\land r)) \\}\\)"
         "\\(\\{ ((q\\lor \\lnot (q\\land s))\\supset (p\\land p)), (\\lnot p\\equiv ((s\\lor \\lnot s)\\supset s)) \\}\\)"
         "\\(\\{ (\\lnot s\\supset ((\\lnot p\\supset s)\\supset p)), (\\lnot (p\\land r)\\lor ((p\\supset r)\\land q)) \\}\\)"
         "\\(\\{ \\lnot ((r\\supset q)\\land (q\\land \\lnot q)), ((s\\lor (q\\supset r))\\equiv ((q\\equiv r)\\equiv p)) \\}\\)"
         "\\(\\{ ((p\\supset \\lnot s)\\land ((p\\supset q)\\lor q)), ((\\lnot (r\\supset q)\\equiv q)\\supset \\lnot q) \\}\\)"]

  :wrong [
          ["\\(\\{ (\\lnot ((s\\lor r)\\land p)\\equiv (r\\land p)),\\lnot (((p\\supset p)\\land (p\\equiv r))\\lor q) \\)" "az igazságtáblák főoszlopai: 0000000001000100 és 0000111011000000"]
          ["\\(\\{ \\lnot ((p\\lor q)\\land \\lnot (q\\equiv r)),(((r\\land (q\\land r))\\supset r)\\supset (p\\lor p)) \\)" "az igazságtáblák főoszlopai: 1100110000100011 és 0010111011111111"]
          ["\\(\\{ (\\lnot q\\supset (r\\lor ((s\\lor r)\\lor p))),\\lnot (((p\\supset s)\\equiv (s\\land p))\\lor p) \\)" "az igazságtáblák főoszlopai: 0111111111111111 és 1100011100000000"]
          ["\\(\\{ ((s\\land r)\\land ((q\\supset r)\\supset (p\\land q))),\\lnot ((((s\\lor s)\\lor s)\\supset r)\\supset p) \\)" "az igazságtáblák főoszlopai: 0000001000000001 és 1011011100000000"]
          ["\\(\\{ (\\lnot (s\\land \\lnot q)\\land (s\\supset s)),(p\\land ((r\\equiv r)\\supset ((p\\lor q)\\equiv s))) \\)" "az igazságtáblák főoszlopai: 1000010001011111 és 0000000011100101"]
          ["\\(\\{ (((q\\supset r)\\supset (s\\supset r))\\equiv (r\\equiv r)),(s\\lor (((r\\land p)\\equiv (r\\supset s))\\equiv s)) \\)" "az igazságtáblák főoszlopai: 1010101101000000 és 1110101101111111"]
          ["\\(\\{ ((q\\supset (p\\supset (r\\land s)))\\land (r\\lor s)),\\lnot \\lnot (\\lnot (q\\lor q)\\lor s) \\)" "az igazságtáblák főoszlopai: 0100001101110001 és 1100111111110101"]
          ["\\(\\{ (\\lnot s\\land ((\\lnot s\\lor r)\\supset s)),((s\\equiv (q\\supset p))\\lor (p\\equiv (q\\supset r))) \\)" "az igazságtáblák főoszlopai: 0000010100000000 és 0110111111110111"]
          ["\\(\\{ (\\lnot \\lnot p\\equiv ((s\\equiv r)\\supset r)),((p\\lor \\lnot p)\\land (r\\supset (q\\land s))) \\)" "az igazságtáblák főoszlopai: 1010100101110111 és 1100001011001101"]
          ["\\(\\{ (((q\\land p)\\supset \\lnot q)\\supset (q\\equiv r)),(r\\land ((s\\supset r)\\land ((r\\land q)\\land s))) \\)" "az igazságtáblák főoszlopai: 1110111100100111 és 0000001100000001"]
          ["\\(\\{ (\\lnot q\\lor (q\\lor \\lnot (p\\lor q))),(\\lnot \\lnot (q\\land \\lnot p)\\land s) \\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0000001000000000"]
          ["\\(\\{ (\\lnot (r\\land (s\\equiv r))\\supset \\lnot r),(((s\\land (s\\equiv q))\\equiv r)\\supset (r\\land q)) \\)" "az igazságtáblák főoszlopai: 1110101111101101 és 0011001101110111"]
          ["\\(\\{ (\\lnot s\\equiv (r\\land (p\\supset (p\\land q)))),\\lnot (s\\equiv \\lnot (p\\lor \\lnot q)) \\)" "az igazságtáblák főoszlopai: 0100000101100110 és 0100110001100101"]
          ["\\(\\{ ((q\\equiv r)\\lor ((r\\land p)\\lor (s\\land s))),\\lnot (\\lnot \\lnot (p\\equiv p)\\equiv s) \\)" "az igazságtáblák főoszlopai: 1110011101110111 és 1000010101100101"]
          ["\\(\\{ ((r\\equiv q)\\lor ((q\\equiv s)\\land (p\\supset s))),((((q\\equiv r)\\lor (s\\land q))\\land p)\\land q) \\)" "az igazságtáblák főoszlopai: 1110010001100111 és 0000000000000111"]
          ["\\(\\{ (r\\lor ((r\\land s)\\supset (q\\land (s\\supset p)))),\\lnot (\\lnot r\\supset (r\\supset (r\\lor q))) \\)" "az igazságtáblák főoszlopai: 1111011111111111 és 0010011000000000"]
          ["\\(\\{ ((r\\lor p)\\land (p\\land \\lnot (p\\supset s))),(p\\land (q\\equiv ((p\\lor \\lnot r)\\land r))) \\)" "az igazságtáblák főoszlopai: 0000000000011010 és 0000000011000011"]
          ["\\(\\{ \\lnot ((\\lnot (r\\land q)\\equiv q)\\land r),((p\\land s)\\equiv (((s\\supset r)\\land r)\\lor p)) \\)" "az igazságtáblák főoszlopai: 1100011000000000 és 1110100101100101"]
          ["\\(\\{ (p\\equiv (p\\equiv (((r\\lor p)\\land r)\\lor p))),(p\\land (p\\equiv ((s\\equiv p)\\lor (q\\supset r)))) \\)" "az igazságtáblák főoszlopai: 0011001111111111 és 0000000011110111"]
          ["\\(\\{ ((q\\equiv \\lnot r)\\land \\lnot \\lnot r),(\\lnot (r\\land s)\\land (p\\equiv (r\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0011001100110000 és 0000000010000000"]
          ["\\(\\{ (p\\land (q\\lor (((r\\land q)\\land p)\\lor r))),\\lnot ((r\\land r)\\supset ((r\\lor q)\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0000000000111111 és 0011010100110000"]
          ["\\(\\{ ((q\\supset \\lnot \\lnot (s\\lor p))\\supset r),(((q\\equiv r)\\supset p)\\lor \\lnot (s\\land p)) \\)" "az igazságtáblák főoszlopai: 0011111100110011 és 1111111011111111"]
          ["\\(\\{ (((s\\equiv s)\\supset r)\\land (\\lnot r\\equiv r)),\\lnot (q\\supset \\lnot (p\\equiv (s\\supset p))) \\)" "az igazságtáblák főoszlopai: 0001000000000000 és 0000111000001111"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (q\\lor ((q\\land p)\\lor \\lnot \\lnot s)), \\lnot ((q\\equiv r)\\land (s\\supset \\lnot q)) \\}\\)"
         "\\(\\{ (((\\lnot q\\supset r)\\lor \\lnot q)\\supset q), (((q\\lor r)\\lor s)\\supset ((p\\land q)\\land p)) \\}\\)"
         "\\(\\{ (((q\\lor r)\\equiv r)\\supset (\\lnot s\\equiv r)), ((\\lnot s\\equiv s)\\supset (r\\lor \\lnot q)) \\}\\)"
         "\\(\\{ (((s\\lor (r\\lor p))\\lor \\lnot q)\\supset p), ((s\\land \\lnot (q\\land r))\\lor (p\\equiv q)) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\lor ((p\\lor r)\\lor \\lnot r)), (((s\\lor r)\\equiv (p\\land r))\\supset (p\\supset s)) \\}\\)"
         "\\(\\{ (q\\equiv (p\\lor (p\\lor ((r\\land r)\\land s)))), ((s\\equiv \\lnot s)\\supset ((s\\equiv s)\\lor r)) \\}\\)"
         "\\(\\{ (q\\supset ((r\\supset (p\\lor s))\\supset \\lnot r)), \\lnot (s\\equiv (\\lnot (p\\land s)\\lor r)) \\}\\)"
         "\\(\\{ \\lnot ((p\\supset p)\\supset (r\\equiv (q\\supset s))), \\lnot \\lnot \\lnot (q\\equiv (r\\land s)) \\}\\)"]

  :wrong [
          ["\\(\\{ (\\lnot (p\\land r)\\land ((r\\lor r)\\land r)),(((q\\supset p)\\lor ((r\\equiv p)\\supset s))\\supset p) \\)" "az igazságtáblák főoszlopai: 0000001000100000 és 0010011011111111"]
          ["\\(\\{ (\\lnot (q\\supset \\lnot q)\\land \\lnot s),(p\\land (p\\supset (s\\land (p\\equiv (q\\land r))))) \\)" "az igazságtáblák főoszlopai: 0000010100001010 és 0000000010000001"]
          ["\\(\\{ (((r\\equiv (q\\land q))\\equiv (s\\supset r))\\equiv p),(((s\\equiv p)\\lor (s\\land (p\\land q)))\\equiv s) \\)" "az igazságtáblák főoszlopai: 0101001101100111 és 0000000000000000"]
          ["\\(\\{ ((s\\land r)\\lor (q\\land ((s\\land r)\\land q))),\\lnot (r\\lor ((q\\supset (r\\equiv s))\\equiv q)) \\)" "az igazságtáblák főoszlopai: 0000001100100001 és 1110000111000100"]
          ["\\(\\{ (\\lnot s\\land ((p\\land s)\\supset (s\\lor s))),((\\lnot r\\land r)\\equiv (r\\equiv \\lnot p)) \\)" "az igazságtáblák főoszlopai: 1000010100011010 és 1100110001110011"]
          ["\\(\\{ (\\lnot r\\equiv (p\\land (p\\equiv (q\\supset s)))),\\lnot \\lnot ((q\\supset \\lnot p)\\equiv p) \\)" "az igazságtáblák főoszlopai: 0011001111000110 és 0000111111110000"]
          ["\\(\\{ ((s\\supset \\lnot r)\\land ((s\\supset p)\\equiv r)),(s\\lor ((s\\supset (r\\supset p))\\lor (s\\lor r))) \\)" "az igazságtáblák főoszlopai: 0110110100010010 és 1111111111111111"]
          ["\\(\\{ ((r\\equiv \\lnot s)\\supset ((s\\equiv s)\\equiv p)),\\lnot ((p\\equiv ((r\\equiv s)\\equiv p))\\land p) \\)" "az igazságtáblák főoszlopai: 1011011010101001 és 1100011000010110"]
          ["\\(\\{ (\\lnot r\\lor \\lnot (\\lnot s\\lor r)),\\lnot \\lnot ((s\\equiv r)\\land (p\\land p)) \\)" "az igazságtáblák főoszlopai: 1110111111001100 és 0000000001101001"]
          ["\\(\\{ ((\\lnot \\lnot p\\land r)\\equiv \\lnot r),(((r\\supset r)\\equiv (s\\supset (p\\supset q)))\\supset p) \\)" "az igazságtáblák főoszlopai: 0011001100000000 és 0011010011111111"]
          ["\\(\\{ (\\lnot \\lnot r\\supset (p\\lor (q\\supset s))),\\lnot ((s\\land p)\\supset (\\lnot p\\supset q)) \\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0000111000000000"]
          ["\\(\\{ ((r\\supset ((s\\land p)\\supset r))\\land (s\\supset r)),\\lnot ((r\\supset (p\\equiv s))\\equiv \\lnot q) \\)" "az igazságtáblák főoszlopai: 1011011110111011 és 0010001100011101"]
          ["\\(\\{ ((r\\supset \\lnot s)\\land \\lnot (p\\land q)),\\lnot ((q\\equiv p)\\equiv (s\\equiv (q\\equiv s))) \\)" "az igazságtáblák főoszlopai: 1100010000001000 és 1100000011000000"]
          ["\\(\\{ ((q\\lor r)\\land ((p\\lor q)\\supset (q\\equiv p))),(s\\equiv (\\lnot s\\equiv ((q\\supset s)\\lor s))) \\)" "az igazságtáblák főoszlopai: 0000111000001111 és 0000100111001010"]
          ["\\(\\{ ((r\\equiv p)\\lor \\lnot \\lnot \\lnot p),\\lnot \\lnot ((q\\supset q)\\lor (p\\supset p)) \\)" "az igazságtáblák főoszlopai: 1110111110110011 és 1100111111111111"]
          ["\\(\\{ (((q\\land r)\\lor (r\\supset r))\\equiv (q\\equiv r)),(r\\land ((s\\equiv (q\\supset (r\\lor r)))\\equiv s)) \\)" "az igazságtáblák főoszlopai: 1101011000100011 és 0011001000110011"]
          ["\\(\\{ ((r\\equiv q)\\lor (((q\\land q)\\supset q)\\lor s)),(\\lnot (r\\supset (p\\lor r))\\lor \\lnot s) \\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1010010110011010"]
          ["\\(\\{ ((s\\land (q\\equiv r))\\equiv \\lnot \\lnot p),((q\\land p)\\land (r\\lor \\lnot (p\\land p))) \\)" "az igazságtáblák főoszlopai: 1000011010100001 és 0000000000000011"]
          ["\\(\\{ \\lnot ((s\\supset (q\\lor q))\\equiv (q\\lor s)),\\lnot ((\\lnot s\\land s)\\supset \\lnot s) \\)" "az igazságtáblák főoszlopai: 1100000011110000 és 0000000100000000"]
          ["\\(\\{ (((r\\equiv (r\\land q))\\equiv \\lnot q)\\equiv q),(p\\lor (p\\land \\lnot (s\\lor (s\\lor s)))) \\)" "az igazságtáblák főoszlopai: 0010100101010000 és 0000000011111111"]
          ["\\(\\{ \\lnot ((r\\land (s\\equiv s))\\land (q\\land r)),((\\lnot (s\\land q)\\equiv r)\\supset \\lnot p) \\)" "az igazságtáblák főoszlopai: 1100010000000000 és 1111011011001001"]
          ["\\(\\{ (\\lnot s\\lor \\lnot ((s\\supset p)\\lor p)),(\\lnot (r\\supset q)\\land (\\lnot r\\lor p)) \\)" "az igazságtáblák főoszlopai: 1100011110011010 és 0010000000110000"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot \\lnot \\lnot (s\\equiv (s\\lor r)), ((p\\supset (r\\equiv p))\\lor (s\\lor (r\\land p))) \\}\\)"
         "\\(\\{ ((((q\\lor p)\\lor (r\\land q))\\supset p)\\supset q), (p\\supset (r\\supset (r\\land (q\\lor (p\\land s))))) \\}\\)"
         "\\(\\{ (\\lnot ((p\\land q)\\supset (p\\land r))\\supset r), (p\\lor \\lnot (s\\land (p\\land (q\\land p)))) \\}\\)"
         "\\(\\{ (((q\\land \\lnot (r\\equiv p))\\equiv s)\\lor s), (((r\\equiv r)\\land p)\\lor (s\\lor (s\\supset s))) \\}\\)"
         "\\(\\{ (((p\\land s)\\lor ((r\\supset q)\\supset p))\\land q), (\\lnot (s\\equiv ((p\\equiv p)\\supset p))\\land q) \\}\\)"
         "\\(\\{ \\lnot (s\\lor ((s\\lor (p\\equiv s))\\equiv q)), ((((s\\land r)\\land q)\\lor q)\\supset (p\\land q)) \\}\\)"
         "\\(\\{ ((p\\lor r)\\supset ((\\lnot p\\supset q)\\supset p)), ((r\\lor q)\\land ((p\\lor r)\\lor (s\\supset s))) \\}\\)"
         "\\(\\{ (r\\lor ((q\\supset q)\\land ((p\\land p)\\land r))), (((q\\supset (r\\equiv q))\\equiv (p\\supset p))\\lor q) \\}\\)"
         "\\(\\{ (((r\\lor s)\\supset \\lnot r)\\supset (q\\supset p)), \\lnot (((r\\lor r)\\supset (q\\equiv q))\\land s) \\}\\)"
         "\\(\\{ (\\lnot ((s\\equiv q)\\lor s)\\supset (s\\lor q)), ((((s\\supset q)\\land p)\\equiv p)\\land (p\\supset q)) \\}\\)"
         "\\(\\{ \\lnot ((q\\equiv (s\\equiv p))\\land \\lnot r), \\lnot (s\\equiv (p\\supset (s\\supset (r\\supset p)))) \\}\\)"]

  :wrong [
          ["\\(\\{ \\lnot (r\\lor \\lnot (r\\lor (s\\land s))),(\\lnot (q\\lor r)\\equiv (s\\equiv (r\\equiv p))) \\)" "az igazságtáblák főoszlopai: 0110000101000100 és 0101111101010110"]
          ["\\(\\{ (\\lnot ((q\\lor s)\\land \\lnot p)\\supset r),((r\\lor (\\lnot q\\supset q))\\equiv \\lnot q) \\)" "az igazságtáblák főoszlopai: 0111011100110011 és 0010101100110000"]
          ["\\(\\{ \\lnot ((r\\supset ((s\\lor r)\\equiv q))\\supset p),(r\\lor ((\\lnot \\lnot p\\lor s)\\land q)) \\)" "az igazságtáblák főoszlopai: 1110110100000000 és 0011001100111111"]
          ["\\(\\{ ((r\\lor (r\\land s))\\equiv (p\\supset (q\\land s))),(q\\land \\lnot (q\\supset (s\\land (r\\lor p)))) \\)" "az igazságtáblák főoszlopai: 0010110011001001 és 0000111000001010"]
          ["\\(\\{ ((r\\land p)\\equiv (p\\lor (q\\equiv (p\\land q)))),(((q\\equiv r)\\land s)\\equiv (r\\lor (p\\equiv p))) \\)" "az igazságtáblák főoszlopai: 0000111100110011 és 0110111011101101"]
          ["\\(\\{ ((r\\equiv (s\\land p))\\land ((r\\equiv p)\\land s)),(((p\\lor s)\\lor \\lnot s)\\land \\lnot q) \\)" "az igazságtáblák főoszlopai: 0100000100100001 és 1100011011110000"]
          ["\\(\\{ (((s\\equiv r)\\equiv (p\\lor r))\\equiv (s\\supset p)),(s\\supset (\\lnot (r\\equiv q)\\supset (p\\lor r))) \\)" "az igazságtáblák főoszlopai: 0001111101101001 és 1111011111111111"]
          ["\\(\\{ (\\lnot s\\land (r\\equiv ((s\\equiv r)\\land p))),(\\lnot ((s\\supset (s\\supset r))\\equiv s)\\land s) \\)" "az igazságtáblák főoszlopai: 1000000110000000 és 0100000001000100"]
          ["\\(\\{ ((p\\land q)\\supset ((s\\equiv q)\\equiv (q\\land r))),\\lnot (((p\\supset (r\\equiv q))\\equiv q)\\supset q) \\)" "az igazságtáblák főoszlopai: 1100111010101001 és 0011011001010000"]
          ["\\(\\{ ((q\\land r)\\land (s\\land ((r\\equiv q)\\land s))),\\lnot ((r\\supset (\\lnot r\\lor r))\\equiv r) \\)" "az igazságtáblák főoszlopai: 0000000000000001 és 1100100011001100"]
          ["\\(\\{ ((((q\\supset (s\\supset r))\\lor q)\\supset s)\\equiv s),(\\lnot (\\lnot (s\\equiv p)\\land s)\\land p) \\)" "az igazságtáblák főoszlopai: 1111110000000000 és 0000000011111111"]
          ["\\(\\{ (q\\equiv (s\\land ((\\lnot q\\equiv r)\\lor p))),(\\lnot (((r\\lor s)\\equiv q)\\lor p)\\equiv q) \\)" "az igazságtáblák főoszlopai: 1100111110010101 és 1010100101110000"]
          ["\\(\\{ (r\\land \\lnot (q\\lor ((s\\lor s)\\lor p))),((r\\land \\lnot \\lnot q)\\supset (q\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1110010111111111"]
          ["\\(\\{ (((r\\land (s\\equiv r))\\lor (s\\supset s))\\land r),\\lnot ((s\\land s)\\supset (q\\supset (q\\equiv q))) \\)" "az igazságtáblák főoszlopai: 0010001100110011 és 0000111000000101"]
          ["\\(\\{ \\lnot ((s\\equiv \\lnot (q\\lor q))\\land r),((((r\\lor p)\\lor s)\\equiv p)\\lor (q\\supset q)) \\)" "az igazságtáblák főoszlopai: 1100011111011101 és 1110111111111111"]
          ["\\(\\{ (s\\land (((r\\equiv s)\\supset p)\\supset (p\\supset r))),((p\\equiv p)\\equiv ((p\\supset r)\\land \\lnot q)) \\)" "az igazságtáblák főoszlopai: 0100001100100001 és 1100011011001111"]
          ["\\(\\{ (((r\\equiv p)\\land (p\\land q))\\equiv \\lnot r),(\\lnot (s\\supset (s\\supset \\lnot s))\\lor q) \\)" "az igazságtáblák főoszlopai: 0011001100110000 és 0100111101101111"]
          ["\\(\\{ (s\\equiv ((s\\supset (q\\lor p))\\lor (q\\lor s))),(((p\\lor q)\\supset r)\\supset ((q\\equiv r)\\supset q)) \\)" "az igazságtáblák főoszlopai: 0100110011100101 és 0011111111111111"]
          ["\\(\\{ ((q\\supset ((q\\lor q)\\equiv q))\\equiv (q\\equiv p)),(r\\supset ((\\lnot r\\lor p)\\land (p\\land r))) \\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1110100111111111"]]}


 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot q\\supset (p\\lor ((p\\lor q)\\supset q))), ((q\\land p)\\land ((q\\land (p\\land s))\\supset s)) \\}\\)"
         "\\(\\{ ((s\\equiv r)\\lor ((\\lnot s\\lor r)\\land p)), (r\\lor \\lnot \\lnot \\lnot (s\\lor s)) \\}\\)"
         "\\(\\{ (q\\supset (r\\supset ((p\\lor q)\\equiv (r\\equiv s)))), (((r\\lor q)\\equiv (s\\equiv q))\\supset (p\\land p)) \\}\\)"
         "\\(\\{ ((r\\lor (q\\lor (p\\land r)))\\lor (s\\land r)), ((r\\equiv ((r\\lor r)\\lor (s\\lor s)))\\supset r) \\}\\)"
         "\\(\\{ (r\\supset ((q\\lor q)\\lor ((p\\lor r)\\supset p))), (s\\equiv (\\lnot ((q\\land r)\\lor p)\\lor p)) \\}\\)"
         "\\(\\{ ((((r\\lor r)\\land q)\\supset r)\\equiv (s\\land p)), (((r\\land p)\\supset q)\\land ((r\\lor p)\\land r)) \\}\\)"
         "\\(\\{ ((r\\land (p\\land q))\\lor (s\\land \\lnot s)), ((s\\supset q)\\lor \\lnot (r\\lor (q\\supset p))) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot s\\equiv (p\\supset r))\\supset q), (\\lnot p\\lor (\\lnot (r\\equiv s)\\supset r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (((q\\equiv r)\\equiv p)\\equiv p), (((\\lnot r\\lor s)\\land p)\\supset (p\\lor r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (((r\\land p)\\lor s)\\lor s), ((r\\supset (q\\land q))\\equiv (s\\lor \\lnot p)) \\}\\)"
         "\\(\\{ (q\\land \\lnot (((p\\equiv p)\\land s)\\equiv r)), \\lnot \\lnot ((s\\lor (p\\lor p))\\lor s) \\}\\)"
         "\\(\\{ \\lnot (q\\equiv \\lnot (r\\lor (r\\land p))), ((q\\lor p)\\land ((r\\land p)\\equiv (s\\land s))) \\}\\)"]

  :wrong [
          ["\\(\\{ \\lnot ((\\lnot (q\\land p)\\land p)\\land p),(q\\equiv \\lnot (((s\\land r)\\equiv s)\\lor s)) \\)" "az igazságtáblák főoszlopai: 1100011000001111 és 1100111101110000"]
          ["\\(\\{ \\lnot (p\\equiv \\lnot (\\lnot s\\equiv s)),((r\\equiv s)\\supset (q\\lor ((q\\lor p)\\land p))) \\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0111111111111111"]
          ["\\(\\{ \\lnot (((p\\land r)\\lor (p\\lor r))\\equiv s),\\lnot (p\\land \\lnot ((q\\land s)\\equiv p)) \\)" "az igazságtáblák főoszlopai: 0111000010011010 és 1100011010000101"]
          ["\\(\\{ ((\\lnot (p\\equiv p)\\land (r\\lor r))\\land r),(\\lnot s\\land (q\\lor \\lnot (q\\land p))) \\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1000010100001010"]
          ["\\(\\{ (s\\supset \\lnot (((s\\land r)\\lor s)\\supset r)),(\\lnot \\lnot (s\\lor p)\\lor (p\\lor p)) \\)" "az igazságtáblák főoszlopai: 1110111111011110 és 0100001111111111"]
          ["\\(\\{ \\lnot ((\\lnot s\\land (s\\equiv p))\\land s),\\lnot ((s\\lor \\lnot (q\\equiv p))\\lor r) \\)" "az igazságtáblák főoszlopai: 1100011111111111 és 1010011000001000"]
          ["\\(\\{ \\lnot (((p\\supset q)\\lor (s\\equiv s))\\supset p),(((q\\supset r)\\land \\lnot (s\\equiv p))\\land q) \\)" "az igazságtáblák főoszlopai: 1100111100000000 és 0000001100000010"]
          ["\\(\\{ \\lnot ((\\lnot (q\\equiv p)\\land r)\\supset s),(((r\\equiv q)\\equiv (p\\equiv q))\\lor (r\\supset s)) \\)" "az igazságtáblák főoszlopai: 0000000100010000 és 1111101111111111"]
          ["\\(\\{ (((s\\lor p)\\equiv s)\\equiv ((r\\equiv r)\\equiv p)),((((s\\land q)\\land s)\\equiv q)\\land (q\\equiv r)) \\)" "az igazságtáblák főoszlopai: 0000000001011010 és 1100010000000001"]
          ["\\(\\{ ((q\\land r)\\lor (\\lnot p\\lor \\lnot p)),(r\\land (((q\\land r)\\equiv (q\\equiv q))\\equiv q)) \\)" "az igazságtáblák főoszlopai: 1100011110000011 és 0000000000000000"]
          ["\\(\\{ \\lnot (p\\supset ((p\\lor (r\\supset r))\\land r)),(((s\\equiv q)\\equiv p)\\equiv (r\\lor (q\\land p))) \\)" "az igazságtáblák főoszlopai: 0010111001001100 és 1010011000010101"]
          ["\\(\\{ (((q\\lor p)\\land (s\\supset q))\\lor (r\\equiv s)),\\lnot ((s\\equiv p)\\supset (r\\equiv (r\\supset q))) \\)" "az igazságtáblák főoszlopai: 1010111111111111 és 1001111001100100"]
          ["\\(\\{ ((q\\equiv p)\\equiv (((s\\supset q)\\supset p)\\lor p)),\\lnot \\lnot (s\\equiv \\lnot (q\\supset p)) \\)" "az igazságtáblák főoszlopai: 0100011010001111 és 1000110001011010"]
          ["\\(\\{ ((r\\land r)\\supset \\lnot \\lnot \\lnot s),((r\\land (s\\lor s))\\equiv ((q\\equiv r)\\equiv p)) \\)" "az igazságtáblák főoszlopai: 1110110111011110 és 1110011001111101"]
          ["\\(\\{ (((p\\land (q\\lor r))\\equiv (r\\supset s))\\land s),\\lnot (q\\lor ((p\\supset p)\\supset (q\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0000000100100101 és 0011011001010000"]
          ["\\(\\{ (((r\\lor s)\\lor \\lnot p)\\equiv \\lnot q),(p\\equiv (p\\lor (\\lnot r\\lor (p\\equiv r)))) \\)" "az igazságtáblák főoszlopai: 1110001111111000 és 0011001111111111"]
          ["\\(\\{ ((s\\land p)\\equiv \\lnot ((p\\equiv s)\\supset q)),((q\\equiv q)\\supset ((r\\land p)\\supset (s\\equiv r))) \\)" "az igazságtáblák főoszlopai: 0100111111111010 és 1110111001101101"]
          ["\\(\\{ (s\\land (((q\\land q)\\lor s)\\land (p\\equiv p))),\\lnot \\lnot \\lnot (\\lnot r\\supset r) \\)" "az igazságtáblák főoszlopai: 0100001000000000 és 1110100111001100"]]}]
