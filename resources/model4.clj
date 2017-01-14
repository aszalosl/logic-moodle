[{:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((r\\equiv \\lnot q)\\land r)\\lor (s\\equiv r)), (\\lnot ((r\\land (s\\supset s))\\lor s)\\lor p) \\}\\)"
         "\\(\\{ (s\\supset (\\lnot (r\\lor (p\\equiv s))\\lor s)), ((q\\supset \\lnot q)\\lor ((r\\land p)\\equiv q)) \\}\\)"
         "\\(\\{ ((s\\lor (s\\equiv r))\\land (p\\supset (s\\land q))), (\\lnot (q\\equiv \\lnot \\lnot p)\\equiv p) \\}\\)"
         "\\(\\{ \\lnot (s\\lor (\\lnot r\\supset (s\\lor q))), ((\\lnot ((r\\land q)\\lor r)\\equiv p)\\equiv r) \\}\\)"
         "\\(\\{ (((q\\lor q)\\lor r)\\supset \\lnot \\lnot r), (((q\\supset \\lnot q)\\lor (s\\land s))\\lor q) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot (\\lnot p\\equiv s)\\supset p)), (((r\\equiv r)\\land \\lnot r)\\supset (q\\equiv s)) \\}\\)"
         "\\(\\{ (((r\\land p)\\land (q\\lor r))\\supset (s\\equiv p)), (s\\supset ((p\\supset p)\\equiv ((p\\equiv s)\\equiv r))) \\}\\)"
         "\\(\\{ ((s\\equiv (\\lnot q\\lor \\lnot p))\\supset s), \\lnot ((\\lnot q\\lor (s\\lor r))\\supset p) \\}\\)"
         "\\(\\{ \\lnot (((\\lnot s\\equiv q)\\lor s)\\land r), \\lnot (\\lnot (r\\lor \\lnot p)\\land q) \\}\\)"
         "\\(\\{ \\lnot (\\lnot \\lnot r\\land (r\\lor r)), (p\\lor (\\lnot (r\\supset p)\\supset (r\\lor p))) \\}\\)"
         "\\(\\{ (\\lnot (r\\supset r)\\equiv (r\\land (p\\lor q))), \\lnot ((r\\lor ((s\\lor q)\\equiv q))\\land q) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot \\lnot \\lnot ((p\\supset r)\\land s),(((\\lnot s\\lor r)\\supset (s\\land p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1001110111101110 és 0000000001010101"]
          ["\\(\\{ ((((p\\land s)\\land r)\\lor (r\\equiv s))\\supset q),((s\\supset (p\\lor q))\\equiv (s\\lor (r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0110111101101111 és 0011001000000000"]
          ["\\(\\{ \\lnot ((q\\land s)\\supset (\\lnot s\\supset q)),(q\\lor ((\\lnot r\\supset s)\\lor (r\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 1111111101111111"]
          ["\\(\\{ (((q\\supset s)\\lor q)\\lor \\lnot (r\\land r)),\\lnot \\lnot (s\\lor ((s\\land q)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0101010101010101"]
          ["\\(\\{ (((q\\lor q)\\supset (s\\equiv \\lnot q))\\land r),(s\\land (((s\\supset p)\\lor (r\\equiv r))\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001001100110010 és 0101010101010101"]
          ["\\(\\{ ((s\\land (s\\supset p))\\lor \\lnot (r\\supset q)),(\\lnot (p\\equiv (p\\supset q))\\land (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0011011101110101 és 0000000001010000"]
          ["\\(\\{ \\lnot (((s\\land (q\\lor s))\\supset p)\\lor s),((((q\\lor q)\\lor (s\\equiv q))\\lor r)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000000 és 1011111111111111"]
          ["\\(\\{ (\\lnot ((p\\supset p)\\lor p)\\land (s\\equiv r)),(((q\\land s)\\supset (r\\lor q))\\lor \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000000 és 1111111111111111"]
          ["\\(\\{ ((s\\supset p)\\supset \\lnot (p\\land (r\\supset r))),\\lnot ((p\\equiv p)\\supset \\lnot (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1101011110000000 és 0000010100000101"]
          ["\\(\\{ \\lnot \\lnot (q\\land (s\\equiv \\lnot p)),\\lnot ((q\\equiv (p\\land s))\\supset (q\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000100100001010 és 1100111010100000"]
          ["\\(\\{ (\\lnot (s\\land q)\\lor (r\\supset (q\\equiv q))),\\lnot (p\\supset \\lnot (q\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111110 és 0000111101111111"]
          ["\\(\\{ (r\\equiv ((q\\equiv p)\\lor (\\lnot p\\lor p))),((r\\equiv \\lnot ((s\\equiv p)\\land r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0010010100110011 és 1100011101101110"]
          ["\\(\\{ ((((p\\supset q)\\supset s)\\supset (q\\supset q))\\lor s),\\lnot \\lnot ((p\\equiv (s\\equiv s))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0000000010000000"]
          ["\\(\\{ (p\\land ((q\\supset (\\lnot q\\lor p))\\lor q)),(((s\\supset q)\\equiv (p\\equiv s))\\equiv (s\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0110100100001101"]
          ["\\(\\{ (((r\\lor p)\\supset \\lnot (q\\supset s))\\land p),(s\\lor \\lnot ((r\\equiv q)\\land (r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001010 és 0111110101111101"]
          ["\\(\\{ \\lnot (r\\land ((r\\supset p)\\land (s\\lor r))),(p\\lor \\lnot ((p\\equiv r)\\equiv \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1111101111001100 és 0000000011111111"]
          ["\\(\\{ ((s\\land (s\\supset p))\\land \\lnot (q\\equiv r)),((r\\lor q)\\supset (((p\\lor s)\\equiv s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0001010000010100 és 1110111111011111"]
          ["\\(\\{ (\\lnot (r\\lor (q\\equiv (s\\equiv q)))\\supset r),(p\\lor ((s\\land r)\\lor ((r\\land r)\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0111011110110111 és 1111110111111111"]
          ["\\(\\{ ((r\\supset q)\\supset ((q\\equiv \\lnot q)\\land s)),((((r\\supset p)\\supset r)\\land \\lnot p)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110000 és 1100010010000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot \\lnot (((r\\supset q)\\supset p)\\supset s), \\lnot ((p\\lor q)\\lor ((r\\supset s)\\land r)) \\}\\)"
         "\\(\\{ ((q\\lor r)\\equiv ((r\\land s)\\lor (s\\equiv r))), \\lnot (q\\land (q\\lor (s\\equiv (p\\equiv r)))) \\}\\)"
         "\\(\\{ (q\\equiv \\lnot ((s\\equiv (q\\equiv s))\\lor s)), \\lnot (\\lnot (p\\lor r)\\supset (p\\lor r)) \\}\\)"
         "\\(\\{ ((q\\land (p\\supset s))\\lor ((s\\land r)\\supset r)), (s\\supset (\\lnot s\\supset ((q\\lor s)\\equiv p))) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\equiv ((\\lnot r\\lor q)\\supset s)), ((s\\land p)\\equiv ((r\\supset s)\\supset (q\\land s))) \\}\\)"
         "\\(\\{ (q\\lor (s\\supset (q\\equiv (r\\lor (p\\equiv s))))), (q\\equiv ((p\\supset \\lnot (q\\equiv p))\\supset r)) \\}\\)"
         "\\(\\{ (((s\\lor q)\\equiv (r\\supset q))\\equiv (s\\equiv s)), (s\\lor \\lnot (\\lnot (q\\equiv s)\\lor s)) \\}\\)"
         "\\(\\{ (\\lnot (r\\land p)\\land \\lnot (r\\lor p)), ((s\\supset r)\\supset (p\\lor ((p\\supset p)\\supset s))) \\}\\)"
         "\\(\\{ (r\\supset ((s\\land (r\\supset p))\\supset (p\\equiv s))), ((r\\lor p)\\lor (s\\land (q\\lor (p\\supset q)))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\lor \\lnot ((s\\lor (p\\lor r))\\equiv p)),(((q\\supset p)\\equiv \\lnot (q\\supset p))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0111111100001111 és 0000111100001111"]
          ["\\(\\{ (q\\lor (((p\\land p)\\land (q\\equiv q))\\supset r)),\\lnot (r\\supset \\lnot (p\\supset (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1111111100111111 és 0011011000110011"]
          ["\\(\\{ ((r\\land s)\\land ((r\\lor r)\\land (r\\lor r))),(s\\supset ((p\\equiv ((q\\lor s)\\land p))\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 1101110111111111"]
          ["\\(\\{ ((\\lnot q\\supset q)\\supset (q\\equiv \\lnot p)),(\\lnot (q\\supset ((q\\land p)\\equiv q))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1100111111110000 és 0000111111111111"]
          ["\\(\\{ (q\\land \\lnot (s\\supset (q\\equiv (q\\lor p)))),((\\lnot q\\equiv (s\\equiv s))\\land (r\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 1100100010001111"]
          ["\\(\\{ \\lnot ((p\\lor (r\\equiv (s\\equiv q)))\\lor q),((q\\equiv p)\\equiv ((q\\supset p)\\land \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1010011000000000 és 1100000010111100"]
          ["\\(\\{ \\lnot (s\\lor (\\lnot r\\lor (s\\lor s))),(((q\\equiv (s\\land p))\\land r)\\lor (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0010010100100010 és 0000001000110011"]
          ["\\(\\{ (((p\\equiv r)\\supset \\lnot q)\\supset (s\\equiv q)),((q\\supset p)\\lor (\\lnot (r\\lor s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1011011001100111 és 1110111011111111"]
          ["\\(\\{ ((p\\lor q)\\land \\lnot (r\\equiv (q\\land r))),((p\\equiv (q\\supset (s\\lor q)))\\lor (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110000 és 0001011011111111"]
          ["\\(\\{ (\\lnot \\lnot p\\equiv (q\\land (p\\lor p))),(p\\equiv (\\lnot q\\land ((p\\lor r)\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010001111 és 0000001001000000"]
          ["\\(\\{ ((r\\land (p\\equiv s))\\equiv (p\\land \\lnot s)),(((s\\lor r)\\supset (\\lnot p\\lor r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1101101101000100 és 0000110011110111"]
          ["\\(\\{ \\lnot ((q\\land (\\lnot q\\equiv r))\\supset p),(((q\\equiv r)\\equiv \\lnot (r\\land p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000000 és 0000000000001000"]
          ["\\(\\{ ((r\\supset (\\lnot (s\\land p)\\land p))\\supset s),\\lnot ((\\lnot q\\equiv s)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 1001011111011010"]
          ["\\(\\{ (((q\\land s)\\equiv (r\\supset p))\\lor (p\\lor q)),\\lnot (((p\\lor q)\\supset r)\\lor (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0011111111111111 és 0010011011001000"]
          ["\\(\\{ (((p\\equiv q)\\supset \\lnot (q\\supset p))\\equiv q),(\\lnot (r\\equiv r)\\land ((p\\lor p)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0000000000000000"]
          ["\\(\\{ ((\\lnot r\\supset \\lnot \\lnot s)\\supset p),(((q\\equiv (r\\lor \\lnot s))\\land r)\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1010111011111111 és 1101101111001111"]
          ["\\(\\{ ((((p\\land p)\\land p)\\lor p)\\equiv (q\\equiv s)),((q\\equiv (((s\\equiv r)\\lor q)\\equiv r))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0101101011100101 és 0000010100000001"]
          ["\\(\\{ \\lnot ((p\\equiv q)\\land (r\\equiv (r\\land r))),(q\\land ((r\\land (q\\land r))\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0000000100000010"]
          ["\\(\\{ ((s\\supset q)\\supset \\lnot (s\\lor (p\\land q))),\\lnot ((s\\land ((p\\land q)\\supset p))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110000 és 0001000100000000"]
          ["\\(\\{ ((q\\equiv \\lnot (q\\lor p))\\land \\lnot q),(q\\land ((q\\equiv p)\\equiv ((s\\land s)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0000011011110000 és 0000101000001000"]
          ["\\(\\{ ((s\\land (q\\land s))\\supset (p\\equiv (s\\lor r))),((s\\land (r\\lor q))\\land (q\\land (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0000000100000001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot ((q\\equiv r)\\lor (s\\lor (r\\lor r))), ((q\\equiv r)\\lor ((p\\equiv q)\\land (s\\lor p))) \\}\\)"
         "\\(\\{ (\\lnot (r\\lor \\lnot \\lnot s)\\equiv p), (\\lnot (r\\land r)\\lor ((q\\equiv r)\\supset p)) \\}\\)"
         "\\(\\{ (\\lnot (p\\supset s)\\equiv (q\\supset (r\\lor q))), ((r\\supset ((p\\land q)\\supset (s\\supset s)))\\supset p) \\}\\)"
         "\\(\\{ ((r\\land r)\\supset ((p\\land r)\\supset (s\\supset s))), (((q\\supset p)\\lor (s\\supset \\lnot s))\\lor r) \\}\\)"
         "\\(\\{ (((q\\lor r)\\lor s)\\land (\\lnot r\\equiv p)), \\lnot ((r\\equiv s)\\supset ((s\\supset r)\\supset p)) \\}\\)"
         "\\(\\{ (((r\\lor q)\\lor p)\\lor ((q\\supset q)\\land r)), (((s\\land s)\\equiv r)\\lor (\\lnot s\\lor q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((((q\\lor q)\\equiv (r\\land q))\\supset q)\\supset q),((r\\equiv (q\\supset r))\\supset ((r\\supset r)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 1100110011111111"]
          ["\\(\\{ ((s\\land (s\\lor r))\\supset \\lnot (s\\lor s)),(((p\\land r)\\supset p)\\lor (\\lnot q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 1100111011111111"]
          ["\\(\\{ \\lnot ((q\\land r)\\lor \\lnot (p\\land s)),(r\\lor \\lnot (p\\equiv (s\\equiv (p\\supset p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000110010100 és 0111101110111011"]
          ["\\(\\{ \\lnot ((s\\land ((s\\lor p)\\lor p))\\equiv s),(((q\\equiv s)\\lor \\lnot s)\\land (q\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1001110111100101"]
          ["\\(\\{ (((p\\supset p)\\lor q)\\equiv ((r\\land q)\\supset r)),(((p\\supset r)\\equiv r)\\lor (\\lnot s\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110001000000000 és 0101111111111111"]
          ["\\(\\{ ((s\\supset (q\\land q))\\land (\\lnot s\\lor p)),\\lnot (((s\\lor (r\\land p))\\lor s)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101111 és 0110011001000100"]
          ["\\(\\{ ((((r\\lor s)\\equiv q)\\land s)\\equiv (s\\land q)),(q\\supset ((p\\supset s)\\supset ((q\\supset s)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1100001110111111 és 1111111011111011"]
          ["\\(\\{ (\\lnot ((r\\supset r)\\lor (r\\supset q))\\supset s),((((p\\equiv q)\\lor \\lnot s)\\equiv p)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0001001000100011"]
          ["\\(\\{ (p\\land \\lnot ((r\\equiv q)\\land \\lnot p)),(((p\\lor r)\\supset s)\\equiv ((p\\equiv s)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0100100010010001"]
          ["\\(\\{ \\lnot (p\\equiv \\lnot (\\lnot q\\land r)),\\lnot ((r\\supset q)\\land ((q\\lor q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1100010011010000 és 0000111000111010"]
          ["\\(\\{ ((p\\lor (r\\equiv r))\\lor ((p\\supset q)\\supset p)),((p\\land (s\\land r))\\lor (s\\lor \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111111 és 1101011111010101"]
          ["\\(\\{ (\\lnot (p\\supset s)\\equiv \\lnot (s\\lor r)),\\lnot (p\\land ((s\\equiv q)\\equiv (r\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0110101011011101 és 1100011011010110"]
          ["\\(\\{ (\\lnot \\lnot q\\land ((s\\supset r)\\lor r)),((\\lnot r\\lor ((p\\land q)\\supset s))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001011 és 0000111100001101"]
          ["\\(\\{ \\lnot ((r\\supset s)\\lor ((q\\equiv p)\\supset p)),(q\\land (q\\lor ((s\\lor (r\\land r))\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 0000111100001111"]
          ["\\(\\{ (((r\\supset s)\\equiv q)\\supset ((p\\land s)\\equiv p)),((p\\land (s\\supset r))\\supset \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1111011011010111 és 1100011011111111"]
          ["\\(\\{ ((r\\supset (p\\land q))\\supset (q\\equiv (r\\equiv q))),\\lnot (((q\\equiv p)\\supset q)\\supset (p\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001111110011 és 0000111111111111"]
          ["\\(\\{ ((r\\lor s)\\land (p\\land ((r\\supset s)\\equiv r))),(\\lnot p\\equiv ((q\\lor q)\\land (p\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010001 és 0000000011111010"]
          ["\\(\\{ ((q\\land q)\\land (s\\equiv \\lnot \\lnot q)),(p\\equiv (r\\land \\lnot ((p\\land s)\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100010010100000"]
          ["\\(\\{ (\\lnot \\lnot r\\equiv ((r\\lor p)\\lor p)),(((p\\land q)\\lor r)\\lor \\lnot \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1100011010110011 és 0011111100111111"]
          ["\\(\\{ ((q\\lor s)\\equiv \\lnot (p\\equiv (q\\land q))),\\lnot ((p\\land (r\\lor s))\\equiv (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001101011010000 és 0000010101110010"]
          ["\\(\\{ (((s\\land r)\\equiv r)\\lor (r\\lor \\lnot q)),(((p\\lor q)\\land q)\\lor ((s\\equiv s)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000111100001111"]
          ["\\(\\{ (\\lnot (p\\equiv r)\\supset ((r\\equiv r)\\land r)),\\lnot ((((q\\land p)\\lor r)\\land q)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1110101100110011 és 1100111011110000"]
          ["\\(\\{ (s\\lor ((((r\\lor s)\\supset r)\\equiv p)\\supset s)),(q\\land ((q\\equiv q)\\equiv ((r\\supset p)\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1111111101010101 és 0000010100000000"]
          ["\\(\\{ ((q\\lor r)\\lor (p\\equiv (r\\lor (q\\equiv p)))),(\\lnot (p\\supset p)\\equiv (q\\supset (q\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0011111100111111 és 0000111010000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot (((q\\land p)\\supset (r\\equiv q))\\equiv s), (p\\equiv \\lnot ((q\\supset s)\\equiv (q\\land q))) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (r\\supset r)\\equiv (r\\lor q)), ((s\\land (r\\land r))\\equiv (q\\supset \\lnot q)) \\}\\)"
         "\\(\\{ \\lnot ((s\\supset (r\\supset p))\\equiv (p\\supset q)), \\lnot ((q\\lor q)\\lor ((r\\equiv q)\\lor p)) \\}\\)"
         "\\(\\{ (((q\\land q)\\land q)\\supset (r\\lor (p\\supset p))), ((r\\supset (p\\supset q))\\lor ((s\\lor p)\\equiv r)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot r\\land (\\lnot r\\supset s)), (((\\lnot r\\land s)\\equiv q)\\lor (q\\equiv s)) \\}\\)"
         "\\(\\{ (((r\\equiv r)\\lor q)\\lor \\lnot (s\\supset p)), (\\lnot (((q\\equiv s)\\lor q)\\lor q)\\supset p) \\}\\)"
         "\\(\\{ ((\\lnot (q\\lor p)\\equiv r)\\equiv (r\\land q)), (\\lnot (p\\lor (r\\equiv r))\\supset (s\\supset s)) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot (s\\lor q)\\supset (q\\land p))), \\lnot ((q\\lor \\lnot p)\\lor (q\\lor s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\land \\lnot q)\\lor ((q\\lor s)\\lor r)),\\lnot \\lnot ((q\\supset (r\\equiv q))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0111111101111111 és 1110111111111111"]
          ["\\(\\{ ((p\\supset q)\\equiv ((p\\supset (p\\land s))\\equiv q)),(\\lnot ((p\\land \\lnot q)\\supset r)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000001011010101 és 0000010001000000"]
          ["\\(\\{ (\\lnot \\lnot \\lnot (s\\land p)\\equiv s),\\lnot \\lnot \\lnot (\\lnot s\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0101100111000000 és 0110011001000100"]
          ["\\(\\{ (p\\land \\lnot \\lnot (s\\land \\lnot q)),(r\\land \\lnot (((r\\lor r)\\supset r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010000 és 0011001100000000"]
          ["\\(\\{ \\lnot \\lnot \\lnot ((r\\land p)\\land q),((s\\equiv ((\\lnot q\\supset r)\\lor s))\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000010 és 0011101100111011"]
          ["\\(\\{ (\\lnot ((p\\lor p)\\supset p)\\land (r\\equiv s)),(\\lnot \\lnot p\\land ((s\\equiv q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000000 és 0000000010010101"]
          ["\\(\\{ (((s\\supset s)\\equiv (q\\lor r))\\supset \\lnot p),(\\lnot \\lnot s\\equiv ((p\\equiv p)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1110011011000000 és 0101100101010101"]
          ["\\(\\{ (((q\\equiv q)\\land s)\\equiv (\\lnot s\\lor p)),\\lnot (p\\supset (r\\lor ((r\\equiv r)\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0001001100000000 és 0010111000000000"]
          ["\\(\\{ \\lnot \\lnot ((r\\land (p\\lor p))\\lor q),((\\lnot (p\\equiv p)\\supset \\lnot p)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0000111100111111 és 0000001000000000"]
          ["\\(\\{ (((p\\lor q)\\land p)\\supset (r\\equiv \\lnot p)),((\\lnot (p\\land p)\\equiv (q\\supset q))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001100 és 0000001011110000"]
          ["\\(\\{ ((r\\land ((r\\land s)\\equiv (r\\land r)))\\lor p),\\lnot ((p\\land q)\\equiv (p\\land (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0011000011111111 és 0000000010111100"]
          ["\\(\\{ (\\lnot \\lnot (p\\supset s)\\supset (r\\land q)),((q\\land s)\\equiv ((\\lnot p\\land r)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001111100101011 és 1110111111001001"]
          ["\\(\\{ ((r\\land s)\\land \\lnot (r\\supset (q\\lor r))),((r\\equiv ((p\\equiv \\lnot r)\\equiv r))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0000000001001100"]
          ["\\(\\{ \\lnot ((\\lnot s\\equiv s)\\lor (r\\lor q)),(r\\supset \\lnot (r\\equiv (r\\supset (r\\supset p)))) \\}\\)" "az igazságtáblák főoszlopai: 1110011001000000 és 1111101111001100"]
          ["\\(\\{ (((q\\lor (q\\equiv (p\\land q)))\\land r)\\lor p),((\\lnot q\\equiv (q\\lor s))\\land (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000001111111111 és 0000000100000000"]
          ["\\(\\{ (\\lnot (s\\supset q)\\equiv (p\\equiv (q\\equiv q))),((p\\lor s)\\equiv \\lnot (p\\lor (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1001111100101111 és 1010101010000000"]
          ["\\(\\{ \\lnot ((p\\lor (p\\equiv r))\\land \\lnot s),\\lnot ((q\\lor q)\\equiv ((q\\equiv r)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0100101101010101 és 0001000111100000"]
          ["\\(\\{ ((q\\land (q\\equiv p))\\supset ((q\\equiv p)\\supset r)),(((p\\lor \\lnot r)\\lor s)\\equiv (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0000111100110011"]
          ["\\(\\{ ((\\lnot \\lnot (p\\equiv s)\\land p)\\lor p),((q\\supset \\lnot \\lnot (q\\equiv s))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1111111111110111"]
          ["\\(\\{ ((p\\land p)\\lor ((s\\lor \\lnot r)\\equiv r)),((q\\land ((r\\equiv (p\\lor s))\\supset p))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1101010101011101"]
          ["\\(\\{ (r\\land (((r\\land q)\\lor r)\\supset (s\\equiv p))),(\\lnot p\\land ((p\\lor s)\\supset (p\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0011000100010001 és 1100011010000000"]
          ["\\(\\{ ((r\\land (r\\lor \\lnot p))\\land (q\\supset p)),((s\\land \\lnot (p\\supset q))\\lor \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0000001000110011 és 1110110111011100"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot \\lnot p\\equiv ((s\\equiv p)\\supset p)), ((s\\equiv (r\\land (s\\equiv s)))\\lor (r\\supset q)) \\}\\)"
         "\\(\\{ ((\\lnot r\\land q)\\lor ((s\\land q)\\supset p)), ((q\\equiv s)\\supset (q\\land (p\\supset \\lnot r))) \\}\\)"
         "\\(\\{ ((s\\land q)\\equiv (\\lnot \\lnot p\\supset s)), ((\\lnot (s\\land s)\\equiv s)\\supset (p\\land s)) \\}\\)"
         "\\(\\{ \\lnot (r\\equiv (\\lnot (q\\supset p)\\supset r)), (\\lnot ((s\\lor s)\\lor (p\\supset r))\\equiv q) \\}\\)"
         "\\(\\{ \\lnot (r\\land \\lnot ((r\\equiv r)\\lor s)), ((s\\supset s)\\land ((q\\land \\lnot r)\\supset q)) \\}\\)"
         "\\(\\{ ((r\\lor r)\\lor ((p\\equiv q)\\supset \\lnot r)), ((((p\\lor p)\\land s)\\supset s)\\supset (r\\land q)) \\}\\)"
         "\\(\\{ (s\\supset (r\\equiv (\\lnot q\\lor (q\\supset p)))), (((q\\equiv q)\\supset r)\\supset (\\lnot q\\lor s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((s\\lor s)\\supset p)\\equiv \\lnot (r\\supset p)),(p\\lor ((\\lnot (q\\equiv s)\\land q)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0111011100000000 és 1100111111111111"]
          ["\\(\\{ (q\\lor ((q\\supset (s\\land s))\\lor (r\\supset p))),\\lnot ((r\\equiv q)\\land (\\lnot s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1100001000000011"]
          ["\\(\\{ \\lnot (q\\equiv ((r\\equiv (q\\supset r))\\supset r)),(s\\supset (s\\land (\\lnot s\\supset (s\\supset q)))) \\}\\)" "az igazságtáblák főoszlopai: 1111000011111100 és 1101110111111111"]
          ["\\(\\{ ((p\\land (q\\equiv p))\\supset ((s\\lor q)\\lor s)),((q\\lor (p\\equiv q))\\land ((p\\lor p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111101011111 és 1100011100000101"]
          ["\\(\\{ ((p\\supset r)\\lor (p\\equiv \\lnot (p\\lor s))),((((r\\lor p)\\land p)\\supset r)\\supset (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1111011110110011 és 0010111011111111"]
          ["\\(\\{ ((r\\lor \\lnot (q\\equiv r))\\supset (q\\lor s)),(\\lnot (((r\\equiv p)\\land q)\\equiv q)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011111 és 1111001100111011"]
          ["\\(\\{ (s\\land ((q\\supset q)\\land (\\lnot p\\lor r))),(\\lnot p\\lor (\\lnot (s\\land r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0100010100010001 és 1101011111000100"]
          ["\\(\\{ (\\lnot r\\supset \\lnot ((q\\supset q)\\lor p)),((r\\lor s)\\land \\lnot ((r\\land s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0011111100110011 és 0101011001100000"]
          ["\\(\\{ \\lnot (p\\equiv (s\\land (r\\lor (s\\lor r)))),(\\lnot ((q\\lor s)\\supset \\lnot q)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101010 és 0001111100001111"]
          ["\\(\\{ (r\\lor (r\\supset ((p\\land p)\\equiv \\lnot q))),(s\\equiv ((r\\supset r)\\lor ((s\\lor p)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0111000011010101"]
          ["\\(\\{ ((p\\land (p\\land p))\\supset ((p\\land s)\\supset q)),((p\\lor r)\\lor \\lnot ((q\\equiv s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111101111 és 0111011111111111"]
          ["\\(\\{ (((s\\lor (s\\land r))\\land (r\\supset p))\\lor r),(((q\\land \\lnot p)\\equiv s)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0111001101110111 és 1001011011010101"]
          ["\\(\\{ (\\lnot \\lnot (s\\land s)\\equiv (r\\equiv q)),(\\lnot (p\\land r)\\supset \\lnot (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0110101110001001 és 1100010111111111"]
          ["\\(\\{ (\\lnot (r\\land \\lnot p)\\land \\lnot r),\\lnot (s\\equiv (\\lnot (s\\supset r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100000000000000 és 1110101000010001"]
          ["\\(\\{ ((s\\equiv (s\\supset s))\\land ((q\\land s)\\lor r)),\\lnot (((q\\lor s)\\lor s)\\lor (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000010101 és 0001011010100000"]
          ["\\(\\{ ((s\\lor q)\\equiv \\lnot ((r\\land q)\\supset p)),((((s\\lor p)\\supset r)\\land (q\\land q))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1001010001100000 és 0000000000000011"]
          ["\\(\\{ \\lnot (p\\equiv (\\lnot (q\\equiv q)\\land s)),(((q\\equiv (q\\land \\lnot r))\\lor q)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0000011000000000"]
          ["\\(\\{ ((q\\equiv s)\\equiv \\lnot \\lnot (p\\equiv p)),((s\\lor p)\\land (p\\supset (s\\land \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1001111110011010 és 0100010011010000"]
          ["\\(\\{ (s\\land (p\\lor ((q\\land \\lnot p)\\land r))),((p\\supset q)\\equiv (s\\lor ((s\\lor r)\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010101 és 0110001010000111"]
          ["\\(\\{ \\lnot ((s\\equiv p)\\lor ((s\\land r)\\supset q)),(p\\land \\lnot ((q\\equiv r)\\supset (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 0000000000000000"]
          ["\\(\\{ ((((r\\land \\lnot r)\\equiv q)\\supset p)\\supset q),\\lnot ((p\\supset q)\\land ((p\\equiv p)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100001111 és 1100011011110000"]
          ["\\(\\{ \\lnot (s\\supset ((q\\equiv q)\\supset \\lnot q)),((p\\supset s)\\lor ((\\lnot q\\equiv s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000101 és 1101111111011111"]
          ["\\(\\{ (p\\land (q\\equiv (((r\\equiv p)\\lor q)\\lor q))),((s\\lor r)\\land ((r\\supset \\lnot p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000101111 és 0000011100000100"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (s\\supset ((p\\equiv r)\\supset (p\\land (s\\land q)))), ((q\\supset p)\\supset (s\\land (s\\equiv (r\\equiv s)))) \\}\\)"
         "\\(\\{ (q\\lor (\\lnot (q\\equiv q)\\supset (q\\supset r))), \\lnot ((s\\equiv r)\\lor (p\\supset (r\\land p))) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (s\\equiv \\lnot s)\\equiv q), (((q\\land (p\\lor q))\\supset (s\\lor r))\\supset p) \\}\\)"
         "\\(\\{ (s\\equiv (p\\equiv (q\\lor (\\lnot s\\lor p)))), (\\lnot (\\lnot r\\supset p)\\lor (r\\lor s)) \\}\\)"
         "\\(\\{ \\lnot \\lnot \\lnot (q\\supset \\lnot p), \\lnot (((s\\equiv r)\\lor s)\\land (p\\lor p)) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot s\\supset ((s\\equiv r)\\equiv r))), ((\\lnot (s\\supset s)\\supset \\lnot p)\\lor r) \\}\\)"
         "\\(\\{ (p\\lor ((q\\land s)\\equiv \\lnot (r\\lor p))), \\lnot \\lnot ((s\\lor s)\\land (q\\supset p)) \\}\\)"
         "\\(\\{ (s\\land \\lnot \\lnot (q\\equiv (p\\land r))), (\\lnot \\lnot ((q\\supset q)\\land r)\\lor s) \\}\\)"
         "\\(\\{ (\\lnot q\\supset (q\\lor (r\\supset (q\\land p)))), (((r\\lor q)\\land p)\\supset (s\\supset (s\\land r))) \\}\\)"
         "\\(\\{ (p\\equiv (((q\\lor r)\\supset (s\\equiv p))\\supset s)), ((p\\lor r)\\equiv (s\\supset ((r\\supset q)\\land r))) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\supset (\\lnot s\\land \\lnot p)), (\\lnot (p\\equiv (q\\supset r))\\lor \\lnot p) \\}\\)"
         "\\(\\{ (((p\\equiv q)\\land (p\\supset s))\\land (p\\supset r)), ((r\\land (s\\lor \\lnot s))\\lor \\lnot q) \\}\\)"
         "\\(\\{ (((q\\lor (p\\land q))\\land s)\\land (q\\lor r)), \\lnot (s\\supset (\\lnot (r\\supset q)\\equiv p)) \\}\\)"
         "\\(\\{ (\\lnot (p\\equiv r)\\lor (p\\lor (s\\equiv s))), ((\\lnot (r\\lor q)\\equiv s)\\equiv (q\\land s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((q\\equiv p)\\lor \\lnot p)\\equiv (p\\land p)),((s\\equiv r)\\equiv ((q\\land (q\\lor s))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111110001111 és 1001000101000101"]
          ["\\(\\{ \\lnot (s\\land ((p\\supset s)\\supset (q\\lor q))),((r\\lor p)\\lor (p\\lor (\\lnot p\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1101110111111010 és 0011001111111111"]
          ["\\(\\{ (((s\\supset \\lnot s)\\lor (s\\supset q))\\land s),\\lnot ((p\\supset p)\\land (q\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000101 és 1100000000000000"]
          ["\\(\\{ ((p\\land (p\\equiv ((p\\land r)\\equiv q)))\\land r),((q\\lor r)\\supset ((s\\lor (p\\land s))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000011 és 1111111111011001"]
          ["\\(\\{ \\lnot ((r\\supset p)\\lor \\lnot (p\\land q)),(r\\land ((q\\equiv p)\\equiv \\lnot (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0011011000000000 és 0011001000110000"]
          ["\\(\\{ ((p\\equiv (q\\equiv (s\\lor r)))\\equiv (p\\lor p)),(r\\equiv \\lnot ((r\\equiv r)\\equiv (r\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1010001000100111 és 1100111100110011"]
          ["\\(\\{ (\\lnot (s\\land q)\\supset ((p\\land s)\\equiv r)),(\\lnot \\lnot ((q\\supset s)\\land q)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1110110110011101 és 0000001100000001"]
          ["\\(\\{ (r\\supset (\\lnot (q\\supset r)\\equiv \\lnot q)),(\\lnot q\\lor (\\lnot (q\\land r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1111101111001111 és 1100111111111100"]
          ["\\(\\{ ((s\\lor (q\\land p))\\equiv \\lnot \\lnot q),(((s\\supset q)\\supset (q\\lor p))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1001000001101111 és 1101111011110000"]
          ["\\(\\{ (p\\equiv (\\lnot r\\land \\lnot (q\\equiv r))),\\lnot \\lnot ((p\\equiv q)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111001010001100 és 1100011010000000"]
          ["\\(\\{ ((s\\supset (s\\equiv (p\\lor r)))\\equiv (s\\supset s)),((p\\supset q)\\lor (((p\\lor s)\\land s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1011100000000000 és 1101111111111111"]
          ["\\(\\{ (\\lnot (s\\equiv \\lnot r)\\land (s\\equiv q)),(((r\\lor p)\\supset \\lnot q)\\supset (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001000000000001 és 0011011100001111"]
          ["\\(\\{ (((p\\supset r)\\land r)\\equiv \\lnot (q\\supset r)),((q\\land s)\\land (p\\land \\lnot (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1101110111000000 és 0000000000000000"]
          ["\\(\\{ (((p\\lor q)\\supset (p\\land p))\\lor \\lnot p),(((r\\equiv q)\\lor q)\\equiv ((p\\equiv p)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111111 és 1111001100101111"]
          ["\\(\\{ \\lnot ((q\\land s)\\lor (r\\supset (q\\equiv r))),(((s\\equiv (s\\land p))\\supset p)\\land (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0011010100010000 és 0100000100110011"]
          ["\\(\\{ ((s\\supset (s\\lor \\lnot r))\\land \\lnot r),(p\\equiv ((r\\supset (q\\land (p\\lor q)))\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110100111001100 és 1110011000111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (q\\land (q\\land (p\\equiv ((q\\equiv r)\\land q)))), (((s\\equiv q)\\lor ((q\\supset s)\\land r))\\lor s) \\}\\)"
         "\\(\\{ \\lnot (p\\supset ((q\\lor \\lnot p)\\supset q)), (p\\equiv ((p\\lor q)\\supset (r\\lor \\lnot r))) \\}\\)"
         "\\(\\{ ((r\\land p)\\supset (\\lnot \\lnot s\\supset s)), ((r\\lor r)\\lor ((p\\land (r\\supset s))\\equiv s)) \\}\\)"
         "\\(\\{ ((q\\equiv s)\\equiv \\lnot \\lnot (r\\lor s)), \\lnot ((\\lnot r\\land q)\\lor (s\\land p)) \\}\\)"
         "\\(\\{ (\\lnot s\\lor ((p\\equiv (r\\equiv p))\\lor q)), ((q\\lor (s\\land r))\\lor ((r\\lor s)\\equiv p)) \\}\\)"
         "\\(\\{ ((((r\\supset q)\\supset \\lnot r)\\land s)\\supset q), (s\\supset \\lnot (p\\land \\lnot (q\\equiv s))) \\}\\)"
         "\\(\\{ (((q\\lor p)\\supset (\\lnot p\\land q))\\lor s), (p\\lor (\\lnot p\\supset ((r\\equiv r)\\land r))) \\}\\)"
         "\\(\\{ (\\lnot (s\\land p)\\supset ((p\\supset q)\\supset p)), (s\\lor \\lnot (\\lnot (p\\lor p)\\lor q)) \\}\\)"
         "\\(\\{ (((r\\equiv (s\\equiv q))\\supset p)\\lor \\lnot s), (\\lnot ((s\\lor r)\\land r)\\lor (q\\supset s)) \\}\\)"
         "\\(\\{ (((r\\lor r)\\lor r)\\supset (p\\supset (r\\equiv p))), (s\\lor \\lnot ((q\\land \\lnot q)\\lor s)) \\}\\)"
         "\\(\\{ ((p\\equiv s)\\supset \\lnot ((q\\supset q)\\supset p)), \\lnot \\lnot \\lnot \\lnot \\lnot p \\}\\)"
         "\\(\\{ \\lnot (\\lnot (q\\supset s)\\land (s\\equiv r)), (((q\\land s)\\supset q)\\land (q\\supset (s\\land p))) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\supset ((p\\lor (r\\land p))\\supset s)), (r\\land ((q\\supset (s\\lor r))\\land (q\\equiv p))) \\}\\)"
         "\\(\\{ (q\\supset ((((q\\equiv p)\\equiv r)\\land r)\\supset p)), (((s\\equiv s)\\equiv p)\\equiv (q\\equiv (s\\land q))) \\}\\)"
         "\\(\\{ ((s\\lor (s\\equiv s))\\supset \\lnot (p\\lor p)), ((((p\\lor q)\\lor s)\\lor p)\\equiv (r\\lor s)) \\}\\)"
         "\\(\\{ (p\\lor (q\\supset \\lnot ((p\\land r)\\supset s))), \\lnot (\\lnot (r\\lor q)\\land (r\\lor q)) \\}\\)"
         "\\(\\{ (((p\\lor p)\\land (r\\land q))\\supset (s\\supset p)), (\\lnot (p\\lor (q\\lor s))\\supset (q\\equiv p)) \\}\\)"
         "\\(\\{ (((r\\land r)\\lor (s\\land \\lnot s))\\supset q), (((s\\supset r)\\land r)\\supset ((p\\land q)\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (\\lnot s\\lor ((q\\lor q)\\equiv r)),((((s\\equiv q)\\supset q)\\equiv q)\\land (r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0010010101010100 és 0001101000101111"]
          ["\\(\\{ (r\\lor ((\\lnot (s\\supset s)\\land p)\\supset q)),((s\\land q)\\land ((p\\lor (r\\land p))\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100111111 és 0000010100000101"]
          ["\\(\\{ (((q\\lor p)\\equiv q)\\land (s\\land \\lnot p)),((p\\supset (q\\lor ((s\\land p)\\equiv r)))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 0100010100010101"]
          ["\\(\\{ \\lnot ((q\\equiv r)\\equiv \\lnot (q\\equiv s)),\\lnot ((p\\lor s)\\land \\lnot (r\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111001111001 és 1101110000101111"]
          ["\\(\\{ (r\\equiv (r\\equiv (\\lnot (q\\equiv s)\\lor q))),((q\\lor q)\\equiv ((q\\lor p)\\supset (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0100000110011111 és 0000011000001101"]
          ["\\(\\{ (((q\\equiv q)\\equiv \\lnot s)\\equiv (s\\land q)),((q\\equiv \\lnot r)\\lor (s\\equiv (s\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0101110001101111 és 0011111111111101"]
          ["\\(\\{ \\lnot (q\\equiv \\lnot \\lnot (q\\supset r)),(\\lnot (q\\lor s)\\land \\lnot (q\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1111000011111100 és 0000000000000000"]
          ["\\(\\{ ((((p\\equiv q)\\equiv q)\\equiv (r\\supset r))\\lor r),(\\lnot s\\supset \\lnot ((p\\supset q)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110011 és 1111110111111101"]
          ["\\(\\{ (\\lnot ((q\\supset r)\\land s)\\land \\lnot q),((r\\equiv r)\\lor ((r\\lor (q\\supset s))\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1000110010100000 és 1111011101011101"]
          ["\\(\\{ \\lnot \\lnot (((q\\supset r)\\land r)\\supset p),\\lnot \\lnot (r\\supset (\\lnot p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1110100111111111 és 1110111111111111"]
          ["\\(\\{ ((((s\\equiv q)\\land s)\\lor (p\\land s))\\equiv r),((p\\supset p)\\equiv (r\\lor \\lnot (r\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1111100110011001 és 1110010111111111"]
          ["\\(\\{ ((p\\supset r)\\equiv (p\\land (s\\lor (q\\lor q)))),((s\\lor (s\\lor s))\\land \\lnot (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0010111000010011 és 0100010000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((p\\supset \\lnot s)\\land q)\\equiv \\lnot q), \\lnot \\lnot (\\lnot (s\\lor r)\\supset q) \\}\\)"
         "\\(\\{ (((s\\equiv s)\\equiv p)\\equiv ((p\\land q)\\equiv r)), (((p\\land \\lnot (p\\land r))\\equiv s)\\lor s) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (s\\lor s)\\land \\lnot r), (((p\\supset (q\\equiv p))\\equiv (p\\supset p))\\supset s) \\}\\)"
         "\\(\\{ (q\\lor ((p\\equiv p)\\land (q\\lor (s\\lor s)))), ((r\\land (s\\land s))\\land (q\\supset (s\\land r))) \\}\\)"
         "\\(\\{ (\\lnot r\\lor ((q\\equiv (s\\land p))\\land s)), (s\\lor (r\\land ((s\\equiv p)\\equiv (s\\supset r)))) \\}\\)"
         "\\(\\{ ((s\\equiv p)\\lor (\\lnot (q\\land p)\\lor q)), \\lnot \\lnot ((\\lnot p\\land q)\\equiv q) \\}\\)"
         "\\(\\{ (((\\lnot r\\land s)\\land r)\\supset \\lnot q), (\\lnot s\\supset \\lnot \\lnot \\lnot p) \\}\\)"
         "\\(\\{ (p\\lor (((s\\equiv (p\\supset p))\\equiv r)\\equiv s)), (\\lnot ((r\\equiv r)\\supset q)\\lor (p\\supset s)) \\}\\)"
         "\\(\\{ ((((r\\land q)\\supset p)\\land (r\\equiv r))\\supset r), ((s\\land (\\lnot s\\supset q))\\supset (p\\equiv p)) \\}\\)"
         "\\(\\{ (\\lnot (p\\land p)\\supset ((s\\equiv q)\\lor s)), (r\\lor (r\\supset (((q\\land q)\\equiv q)\\equiv s))) \\}\\)"
         "\\(\\{ (((\\lnot q\\land p)\\equiv (r\\land q))\\supset p), ((r\\supset r)\\lor \\lnot ((p\\equiv r)\\land r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (p\\supset ((q\\equiv r)\\equiv (p\\supset (r\\supset s)))),\\lnot (r\\lor ((r\\equiv \\lnot s)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1101011110000001 és 0110011010001000"]
          ["\\(\\{ (q\\lor (p\\supset (((p\\land s)\\supset s)\\lor r))),\\lnot (\\lnot ((s\\lor p)\\supset r)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1010111000000000"]
          ["\\(\\{ (((\\lnot q\\supset s)\\land (r\\equiv r))\\supset p),((p\\equiv p)\\lor ((p\\equiv (r\\land q))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1000000011111111 és 1110111111001111"]
          ["\\(\\{ ((r\\lor (\\lnot s\\land q))\\equiv (s\\supset q)),(\\lnot (p\\supset (p\\lor s))\\equiv (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0111101011101011 és 1100111011101110"]
          ["\\(\\{ ((q\\equiv (p\\supset r))\\land ((r\\supset p)\\equiv r)),((\\lnot (s\\equiv r)\\equiv q)\\land (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000011 és 1011001110010000"]
          ["\\(\\{ ((p\\equiv \\lnot q)\\land (r\\land (s\\equiv s))),((p\\land r)\\supset ((p\\land (r\\land p))\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1100011010111111"]
          ["\\(\\{ (((p\\land s)\\land (p\\equiv q))\\land (r\\lor r)),(r\\land (q\\supset ((s\\land q)\\lor (q\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000001 és 0000001100110011"]
          ["\\(\\{ (p\\supset ((p\\lor s)\\supset (q\\lor (q\\lor s)))),((q\\equiv p)\\lor (s\\equiv ((r\\supset p)\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1101111111011111 és 1110111001011111"]
          ["\\(\\{ ((r\\supset (\\lnot r\\land \\lnot q))\\land s),\\lnot ((q\\land (p\\supset p))\\land (p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0100000101000100 és 1100011000001000"]
          ["\\(\\{ ((r\\lor (p\\supset p))\\equiv (q\\land \\lnot s)),((q\\lor r)\\equiv ((p\\equiv (p\\supset r))\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0010000010001010 és 1101101011111111"]
          ["\\(\\{ ((((p\\land q)\\supset s)\\lor q)\\land (s\\supset p)),(((p\\supset q)\\lor (q\\equiv q))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1001110101011111 és 1100111011110000"]
          ["\\(\\{ (((p\\supset s)\\lor ((s\\lor p)\\lor s))\\supset q),((r\\equiv (r\\equiv q))\\land ((p\\land q)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0001111100001111 és 0000000000000011"]
          ["\\(\\{ \\lnot \\lnot ((p\\lor q)\\land \\lnot q),((p\\land r)\\land ((r\\lor r)\\supset \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111011110000 és 0000000000000000"]
          ["\\(\\{ ((s\\supset \\lnot ((q\\lor s)\\lor p))\\equiv p),(r\\equiv \\lnot (s\\equiv (s\\equiv (s\\equiv s)))) \\}\\)" "az igazságtáblák főoszlopai: 0101011010101010 és 1110011000110011"]
          ["\\(\\{ (s\\equiv \\lnot ((s\\land r)\\land \\lnot r)),((p\\land r)\\equiv (((p\\land s)\\land p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0101100011010101 és 1001110110011001"]
          ["\\(\\{ (\\lnot ((s\\land q)\\land s)\\equiv (s\\lor p)),((r\\lor \\lnot s)\\land \\lnot (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0101111111111010 és 1000111010110000"]
          ["\\(\\{ \\lnot (\\lnot ((q\\supset s)\\lor q)\\lor p),((\\lnot q\\land \\lnot p)\\supset (q\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111100000000 és 1100111011111111"]
          ["\\(\\{ \\lnot ((q\\supset s)\\land (\\lnot s\\equiv r)),\\lnot ((q\\supset r)\\land (q\\land (r\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1001111010011011 és 1100000000000000"]
          ["\\(\\{ (\\lnot ((r\\land s)\\equiv q)\\lor \\lnot q),(\\lnot (q\\supset (r\\equiv s))\\lor (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1101111011111110 és 0011011100110111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((s\\land p)\\land q)\\equiv ((q\\equiv q)\\equiv p)), ((((s\\lor s)\\land s)\\lor (q\\supset r))\\lor q) \\}\\)"
         "\\(\\{ (s\\supset (((p\\supset p)\\lor q)\\equiv (r\\lor s))), (\\lnot (p\\equiv r)\\lor (r\\lor (q\\lor p))) \\}\\)"
         "\\(\\{ ((q\\lor (s\\supset q))\\lor (p\\supset (p\\supset r))), (((p\\lor \\lnot q)\\equiv (q\\land r))\\supset p) \\}\\)"
         "\\(\\{ (((q\\equiv (s\\land \\lnot p))\\supset p)\\land p), \\lnot (p\\land \\lnot ((q\\lor p)\\supset q)) \\}\\)"
         "\\(\\{ ((q\\lor (q\\supset s))\\supset (q\\lor (p\\supset r))), (((r\\lor q)\\lor s)\\supset ((q\\land q)\\equiv q)) \\}\\)"
         "\\(\\{ (\\lnot ((s\\lor p)\\supset \\lnot p)\\equiv r), \\lnot (((p\\land q)\\equiv (s\\lor s))\\land p) \\}\\)"
         "\\(\\{ ((r\\land ((r\\lor p)\\supset \\lnot r))\\equiv q), (((p\\land p)\\equiv q)\\supset (p\\equiv (s\\lor r))) \\}\\)"
         "\\(\\{ (((s\\supset p)\\supset (s\\lor (r\\lor q)))\\supset s), \\lnot \\lnot (s\\supset \\lnot \\lnot q) \\}\\)"
         "\\(\\{ ((q\\lor r)\\equiv ((q\\supset p)\\equiv (s\\equiv p))), \\lnot ((q\\supset r)\\land ((q\\lor r)\\land r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot \\lnot (((r\\equiv q)\\supset q)\\land q),(((p\\equiv (s\\supset s))\\equiv (q\\lor s))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0000000011011111"]
          ["\\(\\{ (s\\lor ((p\\equiv (s\\lor q))\\land (r\\equiv r))),(((r\\supset (q\\equiv p))\\land \\lnot r)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1101011101010101 és 0000000011001100"]
          ["\\(\\{ (((q\\equiv r)\\lor q)\\equiv ((r\\supset s)\\equiv q)),((r\\supset ((q\\equiv r)\\equiv (p\\land r)))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0000000101111101 és 0111010101110101"]
          ["\\(\\{ (p\\equiv (((p\\equiv s)\\lor (r\\equiv p))\\land r)),(((r\\supset s)\\lor s)\\land (p\\equiv (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1110101100110011 és 1110100111011101"]
          ["\\(\\{ (((\\lnot s\\land q)\\equiv \\lnot p)\\equiv q),(\\lnot r\\equiv (((p\\supset p)\\supset p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100000001000101 és 0011001101100110"]
          ["\\(\\{ (((r\\supset (p\\equiv (q\\supset q)))\\equiv q)\\land r),((s\\lor (r\\equiv s))\\equiv \\lnot (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001000000011 és 0011000010100010"]
          ["\\(\\{ ((q\\land ((s\\supset s)\\equiv p))\\land \\lnot r),(\\lnot \\lnot ((r\\land q)\\equiv p)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0000000100001100 és 0000000100000011"]
          ["\\(\\{ (((q\\supset (q\\lor q))\\lor q)\\supset (s\\lor p)),((s\\lor s)\\equiv (\\lnot p\\supset (p\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0101111111111111 és 1001110101010101"]
          ["\\(\\{ (r\\lor ((p\\lor q)\\land (r\\land (s\\lor s)))),(\\lnot (p\\land r)\\land (r\\lor (r\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0000001000100000"]
          ["\\(\\{ \\lnot ((s\\equiv (s\\lor q))\\equiv (r\\equiv p)),(((s\\equiv r)\\lor (p\\lor q))\\equiv \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0010000100111110 és 1111100001101010"]
          ["\\(\\{ (\\lnot \\lnot ((q\\supset r)\\land p)\\equiv s),((\\lnot \\lnot \\lnot r\\equiv s)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1001110101011001 és 0010000000100010"]
          ["\\(\\{ (((q\\land (r\\supset p))\\land (p\\supset p))\\equiv s),(\\lnot \\lnot q\\land ((r\\equiv p)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110100101 és 0000001100001111"]
          ["\\(\\{ (((q\\supset (p\\land q))\\equiv p)\\lor \\lnot r),((q\\equiv s)\\land (r\\equiv (p\\land (p\\equiv s)))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1000000000000001"]
          ["\\(\\{ (\\lnot (p\\supset s)\\equiv (s\\supset (p\\equiv p))),\\lnot ((q\\supset ((s\\equiv p)\\equiv r))\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0000011101111111 és 1110111011001000"]
          ["\\(\\{ ((s\\supset \\lnot (r\\land p))\\supset \\lnot p),((q\\lor (s\\equiv q))\\land (s\\supset (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1101011011010001 és 1001111101101111"]
          ["\\(\\{ ((s\\land q)\\land \\lnot \\lnot (r\\lor p)),((r\\lor s)\\equiv (p\\lor (p\\land (r\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000101 és 1010111001110111"]
          ["\\(\\{ ((s\\equiv s)\\land \\lnot ((s\\lor s)\\land q)),(((p\\equiv s)\\equiv (q\\lor (r\\land p)))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1100001000000000 és 0101100011111111"]
          ["\\(\\{ \\lnot \\lnot ((r\\supset r)\\land (q\\equiv r)),((\\lnot p\\supset \\lnot (q\\equiv q))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1110000000100011 és 0000000011111111"]
          ["\\(\\{ \\lnot ((q\\supset r)\\supset (p\\equiv (s\\land p))),(p\\land ((r\\land ((s\\land r)\\supset q))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011111100100010 és 0000000001001001"]
          ["\\(\\{ (((q\\land (s\\land p))\\equiv q)\\lor (q\\lor s)),\\lnot (\\lnot p\\equiv ((q\\equiv q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1001111100101010"]
          ["\\(\\{ \\lnot (q\\land \\lnot \\lnot (q\\lor s)),(((r\\lor s)\\land p)\\land \\lnot (s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0000000000100010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (p\\lor ((q\\supset r)\\lor (p\\land (p\\land r)))), \\lnot (s\\equiv ((r\\equiv s)\\land (p\\supset s))) \\}\\)"
         "\\(\\{ (((r\\lor q)\\land (q\\supset p))\\equiv (p\\equiv r)), (\\lnot (p\\land s)\\equiv ((q\\land r)\\equiv q)) \\}\\)"
         "\\(\\{ (p\\lor ((q\\land p)\\land (q\\equiv (p\\land q)))), (((s\\supset q)\\supset (q\\lor r))\\supset (s\\equiv q)) \\}\\)"
         "\\(\\{ ((p\\equiv (p\\equiv q))\\supset \\lnot (p\\lor p)), ((s\\lor (p\\lor s))\\land (s\\lor (p\\land p))) \\}\\)"
         "\\(\\{ ((p\\supset \\lnot ((p\\land q)\\lor s))\\supset s), (((s\\land s)\\supset q)\\supset (r\\lor (r\\equiv p))) \\}\\)"
         "\\(\\{ \\lnot ((((q\\lor s)\\equiv q)\\land q)\\lor r), (((p\\land (s\\supset r))\\lor q)\\lor (s\\lor p)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (q\\equiv p)\\supset (p\\equiv p)), (\\lnot (q\\equiv \\lnot r)\\land (s\\land s)) \\}\\)"
         "\\(\\{ ((q\\land s)\\supset (s\\lor \\lnot \\lnot q)), \\lnot \\lnot (((p\\land r)\\supset q)\\equiv s) \\}\\)"
         "\\(\\{ ((p\\land (r\\equiv s))\\supset \\lnot (r\\equiv s)), \\lnot ((r\\supset q)\\supset (p\\supset (p\\equiv q))) \\}\\)"
         "\\(\\{ ((q\\supset (p\\lor r))\\supset ((s\\equiv q)\\land s)), (((\\lnot \\lnot p\\land r)\\lor s)\\supset s) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot r\\equiv (p\\equiv s))\\lor s), (s\\lor \\lnot (\\lnot r\\lor (q\\lor p))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\land p)\\equiv ((p\\equiv p)\\supset (r\\supset p))),(((r\\land r)\\supset r)\\equiv ((p\\equiv p)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0010000100000000"]
          ["\\(\\{ ((\\lnot q\\supset ((q\\lor s)\\equiv r))\\equiv s),((r\\supset p)\\land ((r\\land (p\\equiv q))\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0011000000001101 és 1100000011111111"]
          ["\\(\\{ \\lnot ((r\\supset (r\\land r))\\supset (s\\land s)),\\lnot ((p\\supset p)\\equiv \\lnot (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1010110110101010 és 1111101011000011"]
          ["\\(\\{ ((q\\lor (p\\land s))\\land \\lnot \\lnot q),((r\\equiv (s\\supset s))\\equiv (\\lnot s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0011000010110011"]
          ["\\(\\{ \\lnot (((p\\supset s)\\lor (q\\supset q))\\lor r),\\lnot \\lnot (q\\land (r\\supset \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 0000111100001100"]
          ["\\(\\{ (((r\\lor s)\\supset (r\\lor q))\\supset (r\\equiv q)),\\lnot (p\\supset \\lnot (r\\equiv (s\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1110011001100011 és 0011111000101001"]
          ["\\(\\{ (q\\equiv (((s\\lor q)\\equiv p)\\lor (r\\supset p))),((\\lnot (r\\supset p)\\lor \\lnot q)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0010101010001111 és 0000000011110000"]
          ["\\(\\{ \\lnot ((q\\lor p)\\land (\\lnot q\\lor s)),((s\\land q)\\equiv (((q\\land r)\\lor q)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000001010 és 1100100000001101"]
          ["\\(\\{ \\lnot (\\lnot (s\\land q)\\land (s\\supset s)),(\\lnot s\\supset ((q\\land q)\\supset (r\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0000011100000101 és 1101111111110111"]
          ["\\(\\{ ((\\lnot q\\equiv (r\\lor p))\\lor \\lnot q),(((r\\lor ((r\\lor s)\\equiv q))\\supset r)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1110111111110000 és 0011001100110011"]
          ["\\(\\{ (((q\\land p)\\supset \\lnot (p\\lor s))\\lor s),((s\\supset (r\\equiv (q\\lor r)))\\land (r\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1101111101011101 és 1101100110101011"]
          ["\\(\\{ ((p\\equiv (q\\land p))\\supset (p\\lor (s\\lor r))),((q\\equiv (s\\equiv q))\\land (r\\land (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0111011111111111 és 0001000000010001"]
          ["\\(\\{ (((p\\lor (q\\land r))\\supset r)\\equiv (q\\land q)),\\lnot ((r\\equiv q)\\land (q\\equiv (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0010001000100011 és 0111101000000010"]
          ["\\(\\{ ((q\\land r)\\land ((\\lnot q\\land q)\\lor s)),((q\\equiv \\lnot (q\\supset (q\\supset p)))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000001 és 0100010000000000"]
          ["\\(\\{ ((s\\equiv q)\\equiv ((p\\land r)\\supset (s\\supset q))),(((s\\equiv p)\\land q)\\lor ((p\\equiv q)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1000111000110101 és 0000111111111111"]
          ["\\(\\{ ((s\\lor p)\\supset \\lnot (p\\equiv (q\\equiv p))),(((s\\supset s)\\land q)\\land \\lnot (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110000 és 0000010100000000"]
          ["\\(\\{ (q\\land ((r\\supset q)\\lor ((p\\equiv p)\\equiv r))),(\\lnot (s\\supset s)\\equiv (r\\lor (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0011100000101100"]
          ["\\(\\{ ((p\\lor ((q\\lor \\lnot r)\\supset r))\\equiv r),((((q\\equiv s)\\land (r\\land q))\\lor p)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1100001010110011 és 1100111110001111"]
          ["\\(\\{ ((r\\supset s)\\lor ((s\\land (r\\lor q))\\supset s)),(((s\\land q)\\supset (q\\supset \\lnot r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0000111100001110"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot (\\lnot r\\lor s)\\equiv \\lnot s), \\lnot ((q\\land (q\\lor (q\\equiv p)))\\land r) \\}\\)"
         "\\(\\{ (\\lnot \\lnot \\lnot r\\lor (s\\supset q)), (\\lnot \\lnot (p\\equiv s)\\equiv (q\\land r)) \\}\\)"
         "\\(\\{ (\\lnot (p\\lor (r\\lor r))\\supset (s\\equiv r)), ((q\\land (p\\equiv (r\\land r)))\\equiv (q\\equiv p)) \\}\\)"
         "\\(\\{ (q\\equiv ((r\\land s)\\land (p\\equiv (p\\equiv p)))), ((\\lnot (q\\supset (p\\lor r))\\equiv s)\\equiv p) \\}\\)"
         "\\(\\{ \\lnot (p\\equiv ((s\\lor (r\\supset s))\\equiv p)), (p\\equiv ((p\\supset p)\\land (\\lnot r\\supset s))) \\}\\)"
         "\\(\\{ (((\\lnot q\\lor p)\\supset (q\\supset q))\\equiv r), (((q\\land p)\\land s)\\supset ((r\\equiv r)\\equiv s)) \\}\\)"
         "\\(\\{ (\\lnot q\\lor (((p\\land q)\\equiv s)\\supset p)), ((s\\equiv r)\\supset \\lnot (p\\lor (r\\lor q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (p\\supset ((r\\equiv ((p\\land r)\\lor r))\\equiv p)),(((p\\equiv (s\\supset r))\\lor s)\\land (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0011001100110011"]
          ["\\(\\{ ((p\\equiv p)\\supset (s\\land (q\\equiv (q\\land q)))),(\\lnot (p\\equiv p)\\equiv (p\\land (q\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 1100011000001000"]
          ["\\(\\{ (((r\\lor q)\\equiv ((s\\equiv p)\\lor r))\\lor s),((r\\supset q)\\land ((p\\equiv s)\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0101011101110111 és 1000110001000000"]
          ["\\(\\{ (\\lnot ((s\\supset r)\\land (s\\supset p))\\land p),(\\lnot \\lnot (p\\land \\lnot q)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000000001000100 és 1100111110001111"]
          ["\\(\\{ (((q\\lor q)\\equiv (p\\equiv p))\\equiv (p\\equiv s)),\\lnot (\\lnot s\\land (q\\supset \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011010 és 0100110101010111"]
          ["\\(\\{ ((s\\lor p)\\lor \\lnot ((s\\land q)\\land s)),(((q\\lor r)\\lor (\\lnot q\\equiv r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1101011111111111 és 1100110000001011"]
          ["\\(\\{ (((\\lnot q\\equiv s)\\land q)\\equiv (s\\supset q)),(\\lnot \\lnot r\\equiv ((r\\lor s)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0101011101011010 és 1011111110011001"]
          ["\\(\\{ (p\\equiv (\\lnot p\\land ((s\\land q)\\equiv s))),((p\\supset r)\\supset (r\\supset ((p\\supset s)\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0100010010000000 és 1111111111011101"]
          ["\\(\\{ (((q\\equiv (q\\supset p))\\lor (s\\equiv p))\\lor q),((p\\land r)\\land (q\\equiv (p\\supset \\lnot r))) \\}\\)" "az igazságtáblák főoszlopai: 1001111101011111 és 0000000000110000"]
          ["\\(\\{ ((\\lnot s\\land q)\\land (q\\equiv \\lnot p)),((p\\lor r)\\equiv (((r\\lor r)\\lor s)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000100100000000 és 0101010001001111"]
          ["\\(\\{ (((q\\supset (p\\supset r))\\equiv (s\\land q))\\land r),((p\\supset s)\\lor ((r\\supset q)\\supset (q\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0010000000000001 és 1111111111111111"]
          ["\\(\\{ (\\lnot r\\supset (q\\lor (q\\supset (p\\land s)))),((((s\\equiv p)\\equiv s)\\lor (s\\equiv q))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0101010101011111"]
          ["\\(\\{ (\\lnot ((s\\lor \\lnot s)\\land s)\\land r),\\lnot ((\\lnot s\\equiv r)\\land (r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100100010 és 1000000000000000"]
          ["\\(\\{ (\\lnot ((q\\lor s)\\equiv p)\\lor (s\\land s)),(((r\\land s)\\equiv s)\\equiv \\lnot (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0101111111110101 és 1101011010000100"]
          ["\\(\\{ ((q\\equiv (r\\land p))\\land (r\\lor (s\\lor s))),\\lnot \\lnot (q\\lor (s\\lor (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0100011001000011 és 1111111111111111"]
          ["\\(\\{ (((p\\supset p)\\supset (q\\lor s))\\supset (q\\supset p)),\\lnot \\lnot (((s\\lor q)\\equiv p)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1101111011111111 és 0000011000001111"]
          ["\\(\\{ ((r\\equiv (q\\equiv r))\\land ((r\\land p)\\equiv s)),(((r\\lor p)\\equiv (p\\land (p\\land r)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0001110010001001 és 0000000000110011"]
          ["\\(\\{ (q\\supset ((r\\lor ((q\\land s)\\lor q))\\land q)),\\lnot \\lnot \\lnot (q\\supset (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0011011100001100"]
          ["\\(\\{ ((r\\supset p)\\equiv \\lnot (s\\equiv (p\\supset q))),((q\\land ((r\\land q)\\supset (q\\supset q)))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1010100111011010 és 0000111111111111"]
          ["\\(\\{ ((r\\land r)\\supset ((s\\lor (p\\supset q))\\supset q)),((q\\supset s)\\supset (p\\supset (s\\lor (s\\land s)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111101111 és 1101011111011111"]
          ["\\(\\{ \\lnot (((s\\equiv r)\\equiv (p\\land s))\\equiv r),(p\\lor ((r\\equiv q)\\equiv ((p\\supset r)\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0101010100000000 és 0011100111111111"]
          ["\\(\\{ (((s\\equiv s)\\lor \\lnot q)\\lor (q\\supset q)),(q\\land (r\\land \\lnot \\lnot (r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0000001100000011"]
          ["\\(\\{ \\lnot ((r\\supset r)\\lor ((q\\supset p)\\supset p)),((p\\supset p)\\lor (\\lnot p\\equiv (q\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 1110011111111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((((r\\equiv s)\\land q)\\land r)\\lor (q\\lor r)), (s\\equiv ((p\\supset \\lnot (q\\supset s))\\supset s)) \\}\\)"
         "\\(\\{ (r\\supset (((q\\equiv s)\\supset p)\\lor (p\\equiv q))), ((p\\supset r)\\equiv ((p\\land s)\\supset (r\\land r))) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((r\\lor (s\\supset p))\\lor r), ((s\\land (p\\equiv p))\\supset (p\\lor (r\\supset s))) \\}\\)"
         "\\(\\{ (((r\\supset (r\\equiv q))\\lor q)\\equiv (q\\land s)), (((s\\supset p)\\supset r)\\lor ((r\\lor r)\\lor s)) \\}\\)"
         "\\(\\{ (((s\\lor q)\\lor p)\\equiv (p\\land (p\\equiv s))), \\lnot (\\lnot ((q\\land p)\\supset p)\\lor q) \\}\\)"
         "\\(\\{ ((((s\\land q)\\lor p)\\land r)\\supset (q\\lor r)), (r\\lor \\lnot (p\\lor ((s\\lor r)\\supset s))) \\}\\)"
         "\\(\\{ (\\lnot (r\\equiv r)\\supset ((r\\land r)\\lor s)), ((r\\supset r)\\lor (r\\lor \\lnot (r\\land s))) \\}\\)"
         "\\(\\{ (r\\lor ((r\\equiv r)\\supset (s\\equiv (r\\land s)))), (((\\lnot p\\supset r)\\lor (q\\equiv r))\\supset r) \\}\\)"
         "\\(\\{ ((s\\supset r)\\land (((q\\lor r)\\equiv p)\\equiv r)), ((r\\equiv s)\\land ((r\\supset (p\\lor p))\\equiv s)) \\}\\)"
         "\\(\\{ ((p\\supset r)\\lor \\lnot (s\\equiv (q\\lor q))), (r\\land \\lnot \\lnot \\lnot (q\\land r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((q\\land q)\\lor s)\\equiv ((s\\land s)\\supset q)),\\lnot ((q\\land s)\\lor ((p\\equiv p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000011010001111 és 0010111011001000"]
          ["\\(\\{ (((r\\lor r)\\lor (r\\supset (q\\supset s)))\\lor r),(\\lnot ((q\\supset p)\\land (r\\land s))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000011000001110"]
          ["\\(\\{ ((q\\equiv (s\\land s))\\equiv ((p\\lor p)\\supset r)),(((q\\supset r)\\land \\lnot q)\\lor (r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111000101001 és 1111111111111111"]
          ["\\(\\{ (\\lnot \\lnot \\lnot q\\supset (q\\supset p)),\\lnot ((q\\lor (s\\supset s))\\lor \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0001011000000000"]
          ["\\(\\{ (((r\\supset \\lnot q)\\equiv (r\\lor r))\\lor p),(\\lnot (r\\supset ((s\\lor r)\\lor p))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0001010011111111 és 0000010000000000"]
          ["\\(\\{ (((p\\equiv r)\\equiv (s\\lor (q\\supset r)))\\equiv q),(s\\equiv (((r\\lor r)\\lor s)\\land (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0001101000101011 és 1111100001011001"]
          ["\\(\\{ ((r\\equiv s)\\supset (r\\supset \\lnot (p\\supset s))),(p\\lor ((p\\equiv (p\\supset p))\\lor (q\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111101110 és 1001000011111111"]
          ["\\(\\{ (\\lnot (((r\\lor q)\\land s)\\lor s)\\land s),((r\\equiv (s\\lor r))\\land \\lnot (s\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000000 és 0000001001100010"]
          ["\\(\\{ ((s\\land ((s\\lor p)\\equiv p))\\equiv (p\\land q)),(r\\lor (\\lnot \\lnot (q\\supset s)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1101110110100101 és 0011001111110111"]
          ["\\(\\{ (((q\\land r)\\supset r)\\lor \\lnot (s\\equiv q)),(\\lnot (q\\lor (s\\land q))\\land (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000001000000000"]
          ["\\(\\{ (((s\\lor r)\\land q)\\equiv ((p\\land p)\\supset p)),(\\lnot s\\supset \\lnot (q\\supset \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0000011100000111 és 0111011101010111"]
          ["\\(\\{ (s\\supset ((r\\lor (q\\land p))\\equiv (s\\equiv s))),(((s\\lor q)\\lor (p\\supset q))\\equiv (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1011110111101010 és 1110000100000011"]
          ["\\(\\{ \\lnot (q\\supset (\\lnot p\\supset (q\\land s))),(s\\lor (s\\lor ((r\\land (p\\equiv r))\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 0101010101010111"]
          ["\\(\\{ (\\lnot s\\equiv (q\\lor ((q\\lor r)\\supset s))),(\\lnot q\\supset (r\\supset (s\\land \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 1011100001001010 és 1110111111001111"]
          ["\\(\\{ ((q\\land q)\\lor ((r\\land q)\\equiv (p\\land p))),(((q\\supset s)\\land (s\\equiv r))\\lor (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111100001111 és 1111111110110011"]
          ["\\(\\{ (((q\\land s)\\land q)\\land ((q\\lor q)\\equiv s)),((s\\equiv q)\\equiv (\\lnot (s\\supset s)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1000110101100101"]
          ["\\(\\{ \\lnot ((s\\equiv p)\\supset (\\lnot q\\land p)),((p\\lor p)\\lor (s\\land \\lnot \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110100000101 és 0000010111111111"]
          ["\\(\\{ (q\\land (\\lnot (r\\land (s\\land r))\\lor s)),\\lnot ((\\lnot p\\supset q)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1100000100001111"]
          ["\\(\\{ (s\\lor (\\lnot (r\\supset q)\\supset (s\\lor r))),(\\lnot ((s\\lor r)\\lor s)\\land (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000000010001000"]
          ["\\(\\{ (p\\land ((\\lnot (s\\land r)\\land p)\\supset q)),(p\\equiv ((s\\lor (p\\supset p))\\supset (s\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000010011111 és 0101011010101111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((s\\equiv r)\\lor q)\\equiv (p\\supset (q\\equiv p))), (((q\\equiv r)\\supset p)\\lor (\\lnot r\\supset p)) \\}\\)"
         "\\(\\{ (((q\\land p)\\lor (q\\equiv s))\\equiv (s\\lor q)), ((\\lnot (r\\equiv s)\\supset (q\\land s))\\supset p) \\}\\)"
         "\\(\\{ \\lnot ((s\\equiv s)\\equiv (\\lnot s\\equiv q)), ((s\\supset r)\\lor (s\\supset \\lnot (q\\equiv r))) \\}\\)"
         "\\(\\{ (r\\lor ((q\\supset p)\\supset (q\\lor (r\\equiv p)))), \\lnot ((q\\supset (s\\land s))\\equiv (s\\lor q)) \\}\\)"
         "\\(\\{ ((p\\equiv (\\lnot q\\equiv s))\\supset (q\\equiv p)), ((q\\supset q)\\supset ((q\\land s)\\lor (p\\supset q))) \\}\\)"
         "\\(\\{ ((\\lnot (q\\equiv s)\\equiv r)\\equiv (p\\land s)), (\\lnot \\lnot (s\\supset \\lnot r)\\lor s) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (q\\supset (q\\land q))\\land q), (p\\equiv (((s\\equiv q)\\land (s\\supset p))\\supset s)) \\}\\)"
         "\\(\\{ (\\lnot r\\supset ((p\\equiv (q\\supset q))\\lor s)), (p\\land (r\\supset (q\\lor (r\\equiv (q\\land s))))) \\}\\)"
         "\\(\\{ (((q\\lor q)\\land (p\\supset q))\\land (s\\supset p)), \\lnot ((\\lnot q\\equiv q)\\land (s\\equiv r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((p\\land s)\\supset r)\\land (r\\lor \\lnot q)),((r\\equiv r)\\supset ((q\\supset q)\\land (p\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1111011101110011 és 0000000001010101"]
          ["\\(\\{ ((r\\lor \\lnot (p\\lor p))\\land (q\\equiv p)),((\\lnot \\lnot p\\lor q)\\equiv (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000011 és 1100111000110011"]
          ["\\(\\{ ((p\\land q)\\land (s\\lor \\lnot (s\\supset r))),((((q\\equiv (p\\lor r))\\lor r)\\land q)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100000111111111"]
          ["\\(\\{ (p\\land (s\\land (r\\supset (s\\equiv (r\\supset q))))),((r\\lor (s\\equiv (q\\lor q)))\\supset (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001000101 és 1111111110111011"]
          ["\\(\\{ (r\\lor \\lnot (s\\lor (p\\lor (q\\land r)))),(q\\lor ((q\\equiv \\lnot q)\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111100110011 és 0000111100001111"]
          ["\\(\\{ ((p\\lor q)\\lor (p\\land (p\\equiv (q\\land r)))),(r\\equiv (p\\lor \\lnot ((q\\land q)\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1110010010110011"]
          ["\\(\\{ (((p\\supset r)\\equiv r)\\supset \\lnot \\lnot s),(((s\\land r)\\lor q)\\equiv (s\\equiv (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1101010111010101 és 1011010100010111"]
          ["\\(\\{ \\lnot (r\\equiv (s\\equiv (\\lnot q\\equiv p))),(((r\\lor q)\\land (q\\supset r))\\lor (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1010001111101001 és 0011111100110011"]
          ["\\(\\{ ((r\\lor s)\\land \\lnot \\lnot (s\\equiv s)),((\\lnot (r\\supset q)\\equiv p)\\supset (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0100011000000000 és 1011111111111111"]
          ["\\(\\{ \\lnot ((p\\lor p)\\equiv (r\\supset (q\\equiv r))),(p\\supset (\\lnot (r\\supset (s\\lor s))\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1110110100010000 és 1110011110100010"]
          ["\\(\\{ (r\\land (q\\supset (((q\\land r)\\supset p)\\supset r))),((s\\supset ((s\\land s)\\land p))\\equiv (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1011101000111101"]
          ["\\(\\{ (((s\\equiv r)\\land \\lnot \\lnot s)\\land p),((s\\land p)\\lor (q\\equiv ((s\\lor q)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010001 és 0110000111110111"]
          ["\\(\\{ ((r\\supset (q\\land r))\\land \\lnot (r\\supset q)),(\\lnot (\\lnot r\\land \\lnot r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0010001000000000 és 1111110111011101"]
          ["\\(\\{ ((p\\land \\lnot (s\\land (p\\lor p)))\\land r),\\lnot (r\\equiv \\lnot ((r\\land r)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000100010 és 0000010100000011"]
          ["\\(\\{ \\lnot (((q\\supset q)\\land (p\\equiv r))\\lor q),((s\\supset q)\\land ((p\\land s)\\land (p\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000111011000000 és 0000000000000101"]
          ["\\(\\{ \\lnot \\lnot (\\lnot (r\\equiv s)\\land q),(((s\\land (q\\lor \\lnot s))\\lor s)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000110 és 1001111110101111"]
          ["\\(\\{ \\lnot (((q\\equiv q)\\land s)\\lor (r\\lor r)),\\lnot ((r\\land q)\\lor (p\\lor (q\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1010111011001100 és 1001011000000000"]
          ["\\(\\{ (q\\supset \\lnot \\lnot \\lnot (p\\supset p)),(((q\\lor r)\\supset p)\\lor (r\\equiv (p\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1110111111111111"]
          ["\\(\\{ (((p\\supset p)\\land p)\\land ((r\\land r)\\supset r)),(\\lnot (p\\lor r)\\equiv ((q\\lor s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0110111110100000"]
          ["\\(\\{ ((q\\land (s\\supset (r\\supset q)))\\supset (p\\land r)),\\lnot \\lnot \\lnot (s\\equiv (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110011 és 0101000001010000"]
          ["\\(\\{ ((p\\land s)\\lor \\lnot (r\\land (r\\equiv r))),(((r\\supset p)\\equiv (r\\equiv r))\\land (r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100010001010101 és 1110000000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (p\\supset (((r\\equiv q)\\equiv r)\\land (s\\land q))), (\\lnot \\lnot (q\\supset \\lnot r)\\equiv p) \\}\\)"
         "\\(\\{ ((q\\land (q\\lor \\lnot p))\\lor (s\\equiv s)), ((s\\lor r)\\lor ((p\\land p)\\supset (r\\equiv p))) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((q\\lor (s\\equiv r))\\lor q), (\\lnot (\\lnot (r\\lor p)\\equiv s)\\lor s) \\}\\)"
         "\\(\\{ ((\\lnot (s\\land (r\\lor q))\\supset q)\\lor s), ((((s\\land r)\\supset r)\\equiv (p\\supset s))\\lor s) \\}\\)"
         "\\(\\{ (\\lnot \\lnot ((p\\supset s)\\lor p)\\lor p), ((\\lnot q\\equiv q)\\supset ((s\\lor q)\\equiv p)) \\}\\)"
         "\\(\\{ \\lnot (((p\\supset p)\\equiv \\lnot p)\\equiv p), ((p\\land (q\\equiv p))\\equiv ((p\\lor s)\\lor r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\lor \\lnot (r\\equiv ((s\\supset s)\\land p))),((\\lnot (r\\land r)\\equiv (s\\supset q))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011111111001111 és 0101010011010000"]
          ["\\(\\{ ((r\\lor \\lnot r)\\equiv (\\lnot p\\land s)),((p\\equiv (\\lnot r\\lor q))\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0110011000000000 és 1110111110110000"]
          ["\\(\\{ (s\\equiv (s\\lor (p\\supset (r\\lor (r\\land s))))),(r\\land (p\\lor ((q\\equiv r)\\supset (q\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0111100011011101 és 0011001100110011"]
          ["\\(\\{ (((\\lnot q\\land s)\\land (p\\lor s))\\equiv p),(q\\land (\\lnot (q\\equiv p)\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1000001011010000 és 0000101100001111"]
          ["\\(\\{ ((r\\land p)\\equiv (\\lnot q\\lor (r\\equiv r))),((r\\land (p\\equiv p))\\equiv (p\\supset (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100111100 és 0010110100001000"]
          ["\\(\\{ ((p\\land p)\\equiv (s\\supset (r\\land (r\\equiv q)))),(q\\land \\lnot \\lnot ((p\\equiv r)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0110010110101011 és 0000001100001111"]
          ["\\(\\{ ((\\lnot (s\\land p)\\land (q\\land s))\\supset p),(\\lnot ((s\\lor r)\\supset (s\\supset p))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1100001011111111 és 0100010000000000"]
          ["\\(\\{ ((q\\lor q)\\lor ((p\\land p)\\supset (r\\equiv q))),\\lnot ((s\\supset q)\\land ((s\\lor q)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111110101111 és 1101011011110000"]
          ["\\(\\{ ((r\\equiv r)\\supset ((s\\equiv p)\\supset \\lnot s)),(((s\\land p)\\supset (r\\lor q))\\land (s\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1101110110101010 és 0111011101110111"]
          ["\\(\\{ \\lnot (q\\lor ((s\\supset q)\\land (p\\land r))),\\lnot ((\\lnot s\\equiv q)\\supset (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011010000 és 0101111001011010"]
          ["\\(\\{ (r\\supset (\\lnot ((p\\lor s)\\land r)\\equiv q)),(((p\\supset q)\\land (r\\land r))\\land (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111100 és 0000001100000011"]
          ["\\(\\{ ((s\\supset p)\\equiv (\\lnot (q\\equiv p)\\land p)),(\\lnot \\lnot (r\\supset (r\\equiv s))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0101010111110000 és 0000111100001101"]
          ["\\(\\{ ((p\\supset \\lnot (q\\supset s))\\lor \\lnot s),(q\\land \\lnot (p\\equiv (q\\land \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 1101111110101010 és 0000011000001111"]
          ["\\(\\{ ((r\\land \\lnot q)\\land ((q\\supset s)\\lor q)),((((p\\lor p)\\supset (p\\supset p))\\lor s)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0000001000110000 és 1101011111111111"]
          ["\\(\\{ ((\\lnot s\\equiv (q\\supset (s\\lor s)))\\land q),((s\\equiv \\lnot r)\\lor (\\lnot r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 0111011111101110"]
          ["\\(\\{ (\\lnot (((s\\equiv s)\\land s)\\equiv r)\\supset r),((r\\supset (r\\supset r))\\equiv (s\\lor (p\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1011111111111111 és 0111110000000000"]
          ["\\(\\{ ((((p\\supset r)\\lor (s\\equiv r))\\land r)\\equiv r),(\\lnot q\\lor ((q\\lor r)\\supset (s\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 1110111011110000"]
          ["\\(\\{ (\\lnot p\\lor \\lnot (p\\lor (s\\land s))),((((r\\lor (p\\lor s))\\land r)\\land s)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1101111110000000 és 0001000111111111"]
          ["\\(\\{ ((p\\supset q)\\land ((s\\land r)\\equiv (s\\supset s))),(s\\lor (\\lnot ((s\\lor q)\\land p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000110010000001 és 0101010101010101"]
          ["\\(\\{ \\lnot (p\\lor (p\\supset ((p\\lor p)\\equiv s))),((s\\supset r)\\supset (s\\supset (r\\supset (s\\lor s)))) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 1111111111111111"]
          ["\\(\\{ (q\\lor ((p\\supset ((r\\equiv r)\\supset p))\\land s)),((\\lnot s\\lor \\lnot s)\\lor (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0100111101011111 és 1001111110101011"]
          ["\\(\\{ (((r\\supset p)\\land (r\\equiv p))\\equiv (p\\equiv q)),((p\\lor r)\\supset (q\\supset \\lnot (r\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1111111011000011 és 1111111111110000"]
          ["\\(\\{ ((q\\lor \\lnot q)\\equiv \\lnot \\lnot p),((p\\supset s)\\land ((\\lnot q\\lor r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111011111111 és 0000011011010001"]
          ["\\(\\{ (\\lnot (s\\supset s)\\equiv \\lnot \\lnot s),(((q\\land \\lnot s)\\land \\lnot q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1000011001101010 és 1100110010000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot ((q\\lor r)\\land ((p\\land s)\\land q)), ((r\\equiv s)\\supset (p\\land (q\\equiv (s\\lor s)))) \\}\\)"
         "\\(\\{ \\lnot (s\\equiv ((s\\land \\lnot p)\\equiv s)), \\lnot (r\\land \\lnot \\lnot (s\\land r)) \\}\\)"
         "\\(\\{ ((((r\\lor r)\\land r)\\supset \\lnot s)\\supset p), ((p\\lor q)\\lor (\\lnot (p\\equiv q)\\supset r)) \\}\\)"
         "\\(\\{ \\lnot (p\\supset (((s\\equiv q)\\land p)\\equiv p)), (\\lnot ((p\\supset q)\\equiv (p\\lor q))\\supset q) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (q\\land q)\\equiv (q\\lor p)), ((((q\\land q)\\supset p)\\equiv s)\\supset (s\\supset q)) \\}\\)"
         "\\(\\{ (((p\\equiv (q\\supset p))\\supset r)\\lor (p\\lor q)), ((\\lnot s\\equiv (q\\lor s))\\equiv (r\\land r)) \\}\\)"
         "\\(\\{ (((s\\supset (r\\supset (r\\equiv s)))\\equiv s)\\lor r), ((q\\supset ((q\\equiv s)\\supset (r\\lor s)))\\equiv p) \\}\\)"
         "\\(\\{ ((r\\land s)\\equiv \\lnot (\\lnot s\\equiv r)), ((p\\lor p)\\lor ((s\\supset r)\\equiv \\lnot r)) \\}\\)"
         "\\(\\{ (s\\supset ((q\\lor q)\\land (p\\supset (r\\land r)))), ((((p\\lor r)\\supset q)\\equiv p)\\supset (p\\supset r)) \\}\\)"
         "\\(\\{ (p\\supset ((r\\lor q)\\land (r\\supset (q\\equiv r)))), ((s\\supset ((q\\lor (s\\land s))\\land r))\\supset p) \\}\\)"
         "\\(\\{ (((s\\lor s)\\land \\lnot s)\\equiv (q\\supset s)), ((q\\equiv r)\\lor (\\lnot \\lnot q\\land q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (s\\land ((r\\lor ((s\\equiv p)\\lor s))\\supset s)),((((p\\land q)\\equiv (q\\lor s))\\equiv p)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000000010101111"]
          ["\\(\\{ \\lnot ((r\\equiv (p\\equiv q))\\equiv (r\\lor s)),((\\lnot (p\\lor (q\\lor s))\\supset q)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0101001010110100 és 0101111111111111"]
          ["\\(\\{ ((((p\\land q)\\lor p)\\lor q)\\land (r\\equiv r)),((q\\lor p)\\supset (\\lnot (r\\equiv p)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 1110111100111111"]
          ["\\(\\{ ((s\\land r)\\equiv (q\\land ((r\\supset s)\\lor r))),\\lnot \\lnot (s\\land \\lnot \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1101011111100001 és 0101010101010101"]
          ["\\(\\{ ((s\\supset (((s\\supset q)\\equiv q)\\supset s))\\equiv p),(\\lnot (q\\equiv s)\\equiv (r\\land \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0001010111111111 és 1010000110100101"]
          ["\\(\\{ (\\lnot p\\lor \\lnot ((r\\lor r)\\supset p)),(q\\lor ((p\\lor (r\\equiv \\lnot p))\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111011110000000 és 1111111100111111"]
          ["\\(\\{ \\lnot (\\lnot s\\equiv (p\\land \\lnot s)),((p\\lor (s\\equiv p))\\land ((s\\equiv p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1001110100000000 és 0001010101010101"]
          ["\\(\\{ \\lnot ((p\\supset (q\\lor (r\\lor q)))\\land s),((s\\equiv ((q\\supset p)\\equiv p))\\land (q\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1001110111101010 és 1001000011010001"]
          ["\\(\\{ ((\\lnot (s\\lor p)\\equiv q)\\lor \\lnot p),\\lnot (((q\\lor (r\\supset q))\\equiv p)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1101111010001000 és 1110100000000010"]
          ["\\(\\{ ((r\\equiv p)\\supset (s\\land ((q\\land p)\\supset q))),((p\\land q)\\land \\lnot (r\\supset (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0111011111001101 és 0000000000000000"]
          ["\\(\\{ \\lnot (((s\\supset p)\\land r)\\equiv (q\\equiv p)),((r\\lor r)\\equiv (r\\equiv (\\lnot r\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1101111100111100 és 0010110101111111"]
          ["\\(\\{ (((q\\supset r)\\land s)\\supset (s\\equiv (p\\equiv r))),\\lnot ((s\\supset (q\\equiv q))\\land (s\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 1100011000000000"]
          ["\\(\\{ ((r\\lor \\lnot p)\\supset (s\\lor (r\\land p))),\\lnot ((\\lnot q\\equiv p)\\supset (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0111111101111111 és 0000111011110000"]
          ["\\(\\{ ((s\\land r)\\land (r\\lor ((s\\supset r)\\lor r))),(((p\\supset q)\\supset p)\\land (\\lnot r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 0000000001000100"]
          ["\\(\\{ \\lnot (s\\lor (p\\land ((r\\land r)\\land q))),\\lnot (\\lnot (r\\land p)\\supset (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101000 és 1100011010000000"]
          ["\\(\\{ (r\\equiv (((r\\land \\lnot r)\\equiv s)\\lor p)),(s\\land (s\\lor (s\\supset (s\\lor (p\\lor r))))) \\}\\)" "az igazságtáblák főoszlopai: 0101011000110011 és 0101010101010101"]
          ["\\(\\{ ((r\\land s)\\lor ((s\\land q)\\supset (q\\equiv r))),\\lnot \\lnot (\\lnot (p\\supset r)\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111011 és 0111111101011101"]
          ["\\(\\{ (((q\\equiv s)\\land (r\\supset s))\\supset \\lnot q),(p\\land ((s\\land s)\\land (\\lnot r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1101111011111010 és 0000000000010100"]
          ["\\(\\{ (((q\\lor q)\\lor r)\\lor (s\\land (s\\equiv r))),\\lnot (\\lnot \\lnot (q\\lor p)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0011111100111111 és 0000111100000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((p\\equiv \\lnot \\lnot s)\\supset r)\\supset p), \\lnot \\lnot (\\lnot q\\equiv \\lnot r) \\}\\)"
         "\\(\\{ ((r\\land ((s\\supset q)\\equiv p))\\equiv (s\\equiv r)), (((r\\land p)\\equiv s)\\land (q\\land (s\\equiv q))) \\}\\)"
         "\\(\\{ (p\\equiv ((((q\\lor s)\\supset r)\\land q)\\supset p)), (r\\land ((s\\equiv ((r\\land s)\\equiv p))\\lor s)) \\}\\)"
         "\\(\\{ (q\\supset ((r\\supset r)\\lor (p\\lor (r\\equiv s)))), (((p\\supset s)\\land p)\\lor ((s\\land s)\\lor r)) \\}\\)"
         "\\(\\{ (((r\\lor (r\\lor s))\\lor s)\\land (p\\lor r)), ((q\\supset (r\\supset (\\lnot r\\supset q)))\\supset q) \\}\\)"
         "\\(\\{ ((r\\equiv (p\\supset q))\\equiv ((p\\lor s)\\supset p)), \\lnot (p\\land ((\\lnot s\\equiv r)\\equiv q)) \\}\\)"
         "\\(\\{ ((((p\\land r)\\land q)\\land (p\\equiv r))\\equiv s), (q\\supset ((p\\land s)\\equiv (s\\lor (q\\supset s)))) \\}\\)"
         "\\(\\{ ((s\\land (r\\land q))\\lor (\\lnot q\\supset q)), (\\lnot ((s\\land q)\\supset q)\\equiv \\lnot r) \\}\\)"
         "\\(\\{ ((((r\\land q)\\equiv p)\\land (p\\land q))\\lor r), \\lnot ((r\\land p)\\land \\lnot (r\\land p)) \\}\\)"
         "\\(\\{ (((s\\lor (q\\supset s))\\equiv r)\\lor (q\\supset s)), (((q\\supset q)\\lor ((r\\land r)\\land r))\\equiv q) \\}\\)"
         "\\(\\{ ((s\\land r)\\lor ((r\\land q)\\supset (p\\supset s))), (s\\lor ((p\\lor p)\\land (s\\lor (r\\supset s)))) \\}\\)"
         "\\(\\{ ((p\\lor s)\\land (((r\\land r)\\land r)\\land s)), ((s\\supset p)\\lor (r\\lor (q\\equiv (r\\lor r)))) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot \\lnot q\\supset s)\\lor p), ((s\\land p)\\lor ((s\\supset (s\\equiv s))\\equiv r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (((p\\supset r)\\land p)\\supset p), ((p\\lor \\lnot p)\\supset (p\\equiv (s\\land p))) \\}\\)"
         "\\(\\{ ((r\\supset p)\\supset (q\\equiv ((p\\equiv s)\\lor s))), (((p\\lor s)\\supset q)\\equiv (s\\land (q\\equiv s))) \\}\\)"
         "\\(\\{ ((r\\supset (q\\supset p))\\lor (\\lnot p\\supset p)), ((s\\land s)\\land ((q\\equiv r)\\land (r\\land q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot ((p\\land p)\\land \\lnot (s\\land r)),(p\\supset (\\lnot (q\\supset q)\\equiv (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010010001 és 1100011110000000"]
          ["\\(\\{ ((r\\lor (s\\equiv \\lnot (q\\equiv s)))\\equiv s),((r\\lor r)\\land \\lnot ((q\\land p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0111000011011001 és 0001000100100000"]
          ["\\(\\{ ((r\\lor (p\\equiv r))\\supset ((q\\lor s)\\land p)),(q\\land \\lnot ((q\\land q)\\supset (s\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0010000111011111 és 0000011000000000"]
          ["\\(\\{ \\lnot ((p\\lor \\lnot (r\\supset r))\\land p),((r\\equiv \\lnot (p\\lor s))\\equiv (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0011111001010110"]
          ["\\(\\{ (q\\equiv \\lnot \\lnot \\lnot \\lnot q),\\lnot (p\\lor (\\lnot (s\\land r)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 1101010010000000"]
          ["\\(\\{ (\\lnot p\\land (((p\\land s)\\supset q)\\lor q)),\\lnot \\lnot (q\\land (q\\land (r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000010000000011"]
          ["\\(\\{ (((s\\supset q)\\supset q)\\land \\lnot (s\\equiv r)),((r\\land p)\\supset (\\lnot (p\\equiv p)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0100011001000110 és 1100111100101111"]
          ["\\(\\{ \\lnot ((q\\land (r\\land q))\\lor (p\\equiv p)),(\\lnot q\\supset (r\\land \\lnot (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000111111100 és 0000111100111111"]
          ["\\(\\{ (\\lnot (\\lnot (q\\supset r)\\supset p)\\lor q),\\lnot (p\\equiv (\\lnot q\\supset (r\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0010111100001111 és 1110111111000000"]
          ["\\(\\{ ((p\\land r)\\land (p\\land \\lnot \\lnot r)),((r\\equiv \\lnot (p\\land (q\\supset p)))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 0000110100001100"]
          ["\\(\\{ \\lnot ((q\\lor r)\\lor (s\\land (r\\supset q))),\\lnot (p\\supset ((p\\equiv (p\\supset s))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1010011010000000 és 0010111001100110"]
          ["\\(\\{ (s\\land (p\\land ((r\\equiv q)\\lor (q\\supset r)))),((q\\land \\lnot q)\\equiv (\\lnot r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010001 és 0010100100100010"]
          ["\\(\\{ (((q\\land (q\\equiv q))\\lor q)\\equiv (p\\supset s)),((s\\lor p)\\equiv (s\\lor (q\\supset (p\\land q)))) \\}\\)" "az igazságtáblák főoszlopai: 0001001010100101 és 0100100000000000"]
          ["\\(\\{ (\\lnot (p\\land (p\\supset p))\\land \\lnot p),((s\\lor s)\\supset (s\\lor (s\\supset (q\\supset q)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1101111111111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((q\\supset s)\\lor r)\\lor ((p\\land p)\\land r)), (s\\equiv (\\lnot \\lnot s\\equiv (s\\supset s))) \\}\\)"
         "\\(\\{ (\\lnot \\lnot r\\equiv (p\\land (s\\lor r))), ((p\\equiv q)\\supset (s\\supset ((p\\supset r)\\equiv s))) \\}\\)"
         "\\(\\{ (\\lnot (r\\lor s)\\lor ((r\\equiv r)\\lor q)), (\\lnot (r\\land ((s\\land p)\\lor r))\\lor q) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot p\\supset p)\\supset \\lnot s), ((r\\supset q)\\lor (((r\\supset p)\\equiv r)\\supset p)) \\}\\)"
         "\\(\\{ (\\lnot ((s\\equiv q)\\supset s)\\land (r\\supset s)), \\lnot \\lnot \\lnot ((q\\lor r)\\land p) \\}\\)"
         "\\(\\{ \\lnot \\lnot (r\\lor \\lnot (r\\lor s)), ((q\\land p)\\supset \\lnot (r\\land (q\\land q))) \\}\\)"
         "\\(\\{ (((r\\equiv (p\\lor s))\\lor (r\\supset s))\\lor p), (\\lnot (q\\land p)\\lor ((r\\lor s)\\supset r)) \\}\\)"
         "\\(\\{ \\lnot (r\\land \\lnot (q\\supset (p\\lor r))), ((s\\land (s\\equiv r))\\supset ((r\\supset p)\\lor p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((p\\land p)\\lor ((r\\supset s)\\supset (r\\supset r))),(s\\land (p\\lor ((q\\lor r)\\lor (r\\lor s)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0101010101010101"]
          ["\\(\\{ (((p\\equiv r)\\equiv (q\\land p))\\land (p\\supset r)),(((p\\equiv (s\\supset q))\\lor (q\\supset q))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011001110000011 és 0011010010110011"]
          ["\\(\\{ (\\lnot ((q\\lor s)\\equiv (p\\lor q))\\supset p),(\\lnot (q\\land r)\\equiv (q\\land (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1001101011111111 és 0000010100001100"]
          ["\\(\\{ (((q\\land q)\\supset (r\\lor s))\\land (p\\supset p)),(((r\\land r)\\supset (s\\lor q))\\land (r\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011110111 és 0011001111011111"]
          ["\\(\\{ (((\\lnot q\\equiv q)\\land (q\\land s))\\lor s),(q\\lor (((q\\equiv q)\\land q)\\supset (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 1100111111111111"]
          ["\\(\\{ (((p\\land r)\\equiv (p\\land s))\\equiv (s\\land p)),((r\\lor r)\\supset (((q\\land r)\\lor q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001011 és 1111100111101101"]
          ["\\(\\{ (\\lnot \\lnot (s\\equiv p)\\equiv (r\\land p)),(s\\supset (s\\lor (s\\lor (\\lnot p\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0101010110011001 és 1101110111111111"]
          ["\\(\\{ ((s\\supset \\lnot p)\\equiv \\lnot (q\\lor s)),(((s\\supset q)\\supset r)\\land \\lnot (q\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1000101111110101 és 0000011101110000"]
          ["\\(\\{ ((s\\land (((s\\equiv p)\\supset q)\\supset q))\\land s),((s\\equiv ((s\\supset s)\\lor s))\\land (s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0001010101010101 és 0100000001010101"]
          ["\\(\\{ (s\\lor ((s\\lor \\lnot q)\\lor (p\\lor r))),\\lnot ((p\\lor (q\\lor r))\\supset (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0010011000000000"]
          ["\\(\\{ (p\\equiv (p\\equiv (q\\land ((q\\lor q)\\land r)))),((r\\land (s\\equiv s))\\land (p\\lor (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 0000001000000000"]
          ["\\(\\{ (((r\\land p)\\supset (q\\lor s))\\land (q\\equiv r)),((q\\land (p\\lor s))\\land (p\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000100011 és 0000010000001111"]
          ["\\(\\{ (q\\lor (p\\equiv ((p\\lor q)\\lor (s\\supset r)))),((q\\land q)\\equiv (((q\\supset p)\\supset q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0110111111111111 és 0000101111110000"]
          ["\\(\\{ (r\\equiv ((((q\\supset s)\\equiv q)\\lor s)\\supset r)),(r\\lor ((\\lnot (p\\supset q)\\land p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0100001000001111 és 1111101110111111"]
          ["\\(\\{ (r\\equiv (\\lnot r\\land ((q\\land s)\\land r))),(\\lnot q\\supset (s\\land ((s\\land q)\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1110100000101100 és 0000111100001111"]
          ["\\(\\{ ((s\\equiv (s\\land p))\\equiv ((p\\lor q)\\equiv r)),((((p\\equiv q)\\lor \\lnot r)\\equiv s)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1010001110110011 és 0010000000100001"]
          ["\\(\\{ \\lnot \\lnot \\lnot ((r\\equiv r)\\equiv p),(s\\land ((s\\lor (r\\equiv r))\\land (s\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0101010101010101"]
          ["\\(\\{ (((q\\land p)\\equiv (q\\equiv r))\\equiv (r\\supset p)),((q\\equiv \\lnot (p\\lor q))\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0001110100110011 és 0000011011110000"]
          ["\\(\\{ ((p\\land (r\\equiv q))\\land \\lnot (s\\lor p)),\\lnot (\\lnot (p\\land (r\\land q))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0001111010101000"]
          ["\\(\\{ ((p\\equiv (q\\supset q))\\land (p\\equiv \\lnot s)),((s\\equiv s)\\land (r\\land (q\\lor \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 0000010010101010 és 0000001000000000"]
          ["\\(\\{ (((r\\supset r)\\land q)\\equiv \\lnot (r\\supset r)),(q\\equiv \\lnot (\\lnot q\\land (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1111000000001000 és 0000101101111111"]
          ["\\(\\{ (((r\\lor (r\\equiv s))\\lor (p\\lor p))\\land r),(((r\\equiv s)\\supset (\\lnot p\\land r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1001110110101010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot (s\\lor s)\\equiv ((s\\lor q)\\land p)), \\lnot (q\\equiv (s\\lor (p\\lor (r\\lor q)))) \\}\\)"
         "\\(\\{ ((\\lnot p\\land p)\\lor (q\\lor (s\\land s))), ((q\\lor s)\\equiv (r\\lor ((q\\equiv p)\\lor r))) \\}\\)"
         "\\(\\{ ((r\\supset ((s\\lor q)\\supset q))\\land \\lnot p), (q\\lor (q\\lor ((r\\supset q)\\supset (r\\supset r)))) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\lor (q\\lor ((s\\lor s)\\supset r))), (p\\supset ((p\\lor (r\\equiv r))\\lor (r\\lor p))) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot p\\supset p)\\land (s\\land q)), (((q\\equiv q)\\lor (p\\lor (q\\land r)))\\equiv s) \\}\\)"
         "\\(\\{ ((p\\supset p)\\supset (\\lnot (p\\land r)\\lor q)), (q\\supset ((s\\lor \\lnot (r\\supset q))\\lor s)) \\}\\)"
         "\\(\\{ (((r\\equiv q)\\lor \\lnot (s\\supset q))\\lor s), ((r\\supset ((q\\land p)\\equiv s))\\equiv (q\\supset q)) \\}\\)"
         "\\(\\{ (((p\\supset p)\\land (p\\equiv p))\\lor (s\\lor r)), (r\\supset (\\lnot p\\equiv ((s\\lor r)\\supset p))) \\}\\)"
         "\\(\\{ (((q\\land r)\\supset r)\\equiv ((r\\lor q)\\equiv q)), (p\\equiv ((q\\land (p\\supset q))\\land (r\\supset r))) \\}\\)"
         "\\(\\{ (\\lnot ((q\\equiv s)\\supset (p\\land s))\\equiv r), (\\lnot ((s\\lor s)\\land \\lnot p)\\equiv p) \\}\\)"
]
  :wrong [
          ["\\(\\{ (s\\lor (\\lnot (s\\equiv (r\\land q))\\supset p)),(\\lnot (r\\supset p)\\land \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0000000000000000"]
          ["\\(\\{ (q\\land \\lnot ((p\\supset \\lnot p)\\equiv s)),(\\lnot \\lnot ((s\\supset q)\\lor q)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000101 és 0111011101110011"]
          ["\\(\\{ (\\lnot (q\\land (s\\lor \\lnot s))\\equiv q),(r\\supset \\lnot ((s\\lor (q\\supset s))\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000010010000000 és 1111111111001100"]
          ["\\(\\{ \\lnot (\\lnot q\\equiv (r\\equiv (p\\equiv q))),(((q\\supset p)\\lor r)\\land \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1110101100110011 és 0000000011111111"]
          ["\\(\\{ ((q\\lor \\lnot (s\\lor r))\\land (q\\supset q)),\\lnot (s\\land ((p\\supset \\lnot p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1000111110001111 és 1001110110101010"]
          ["\\(\\{ ((q\\supset q)\\land ((r\\lor p)\\supset (q\\supset q))),(r\\land ((s\\lor s)\\land (q\\equiv \\lnot r))) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0001000100010000"]
          ["\\(\\{ \\lnot ((s\\equiv p)\\equiv ((q\\lor q)\\lor p)),((r\\land s)\\land \\lnot ((p\\land p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1001001010101010 és 0000000000000000"]
          ["\\(\\{ ((\\lnot r\\land (s\\land r))\\equiv (q\\equiv q)),(s\\supset \\lnot (\\lnot \\lnot p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000111111111 és 1101111110101010"]
          ["\\(\\{ ((s\\land \\lnot (p\\supset s))\\equiv \\lnot q),(p\\supset (p\\land (((q\\equiv s)\\land s)\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0001000010001111 és 1100011011000101"]
          ["\\(\\{ (((r\\lor q)\\lor \\lnot p)\\supset (s\\supset s)),(((r\\supset s)\\equiv p)\\land ((q\\land r)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000010111011101"]
          ["\\(\\{ (p\\lor \\lnot (p\\lor ((p\\land s)\\lor s))),((q\\supset ((s\\equiv (r\\supset p))\\supset r))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111111 és 1111111111111111"]
          ["\\(\\{ ((r\\land q)\\land (p\\lor ((r\\land s)\\lor q))),(q\\land (s\\supset (p\\supset (p\\supset (p\\land r))))) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 0000111100001011"]
          ["\\(\\{ (((s\\supset q)\\land q)\\lor ((s\\lor s)\\supset p)),\\lnot ((q\\lor r)\\supset ((p\\land s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1001111111111111 és 0011111100000000"]
          ["\\(\\{ \\lnot (r\\lor ((r\\lor s)\\land (r\\supset q))),((r\\lor (r\\supset q))\\supset (r\\supset (s\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1010111010001000 és 1111111111011101"]
          ["\\(\\{ ((s\\lor r)\\equiv (\\lnot (s\\land p)\\supset p)),((q\\equiv p)\\supset (q\\land ((s\\equiv p)\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1010111001110111 és 0000111111110001"]
          ["\\(\\{ (r\\lor (s\\supset (\\lnot s\\supset (p\\lor s)))),((q\\land r)\\land (r\\supset (\\lnot r\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000001100000011"]
          ["\\(\\{ \\lnot \\lnot (((p\\lor s)\\land q)\\land s),(((s\\supset q)\\land p)\\lor (s\\lor (s\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000101 és 1101110111111111"]
          ["\\(\\{ (p\\supset ((s\\land \\lnot r)\\lor (q\\equiv p))),\\lnot (((s\\equiv q)\\supset s)\\equiv (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111001111 és 0010100000101000"]
          ["\\(\\{ (((s\\land q)\\land (s\\land \\lnot p))\\lor r),(p\\equiv (q\\supset ((s\\equiv (q\\land q))\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110011 és 0001011111111111"]
          ["\\(\\{ ((s\\land p)\\land ((q\\land (s\\supset q))\\lor p)),((p\\lor (p\\lor s))\\supset ((r\\equiv p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010101 és 1101110100010001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((\\lnot q\\lor (r\\equiv p))\\lor (r\\supset q)), (((p\\equiv s)\\land r)\\lor (r\\supset (r\\supset r))) \\}\\)"
         "\\(\\{ (((r\\equiv r)\\land q)\\lor \\lnot (q\\lor r)), (\\lnot ((p\\supset r)\\supset s)\\supset (s\\land r)) \\}\\)"
         "\\(\\{ (\\lnot (s\\supset (r\\supset r))\\lor \\lnot q), ((p\\equiv (s\\land s))\\lor \\lnot (p\\equiv r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((p\\lor p)\\equiv \\lnot (s\\lor q))\\lor q),\\lnot ((q\\land \\lnot q)\\equiv (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0101111110101111 és 0000110100000011"]
          ["\\(\\{ ((\\lnot (r\\equiv q)\\land q)\\supset (r\\land p)),((q\\land \\lnot s)\\lor \\lnot (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1100110000111011 és 0000110110001010"]
          ["\\(\\{ ((\\lnot r\\land (q\\lor s))\\supset (q\\land q)),(\\lnot s\\supset ((p\\lor (s\\lor s))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1000111110111111 és 1101011111010101"]
          ["\\(\\{ (((s\\supset (q\\lor (s\\land p)))\\lor s)\\equiv s),(p\\equiv ((p\\land s)\\lor (q\\supset (r\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0100100011010101 és 0010011011111101"]
          ["\\(\\{ (\\lnot \\lnot (q\\land q)\\land (s\\lor s)),((r\\lor \\lnot q)\\lor (p\\supset (r\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000101 és 1111111111111111"]
          ["\\(\\{ (((s\\supset ((q\\lor r)\\equiv p))\\lor s)\\land q),(\\lnot r\\equiv (q\\lor (r\\supset (r\\supset p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1100000000101100"]
          ["\\(\\{ (\\lnot \\lnot s\\equiv ((p\\equiv r)\\lor q)),((s\\supset p)\\equiv \\lnot \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0110000001010101 és 1001000110000000"]
          ["\\(\\{ (q\\lor \\lnot (s\\supset (p\\supset (p\\land q)))),((p\\supset (p\\lor (q\\supset p)))\\lor (q\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001111101011111 és 1111111111111111"]
          ["\\(\\{ (((q\\supset q)\\equiv (r\\lor (p\\land q)))\\land s),(((s\\lor r)\\supset r)\\land ((r\\equiv p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000010101 és 0000100100000011"]
          ["\\(\\{ (((((q\\land q)\\supset p)\\equiv r)\\supset q)\\supset r),(q\\land ((\\lnot (s\\supset s)\\equiv r)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110011 és 0000111100001111"]
          ["\\(\\{ \\lnot \\lnot ((s\\lor r)\\lor (p\\land q)),(q\\supset (p\\supset (r\\equiv (r\\supset (s\\supset r))))) \\}\\)" "az igazságtáblák főoszlopai: 0111011101111111 és 1100111011110011"]
          ["\\(\\{ (\\lnot (p\\lor \\lnot s)\\supset (p\\supset s)),(p\\supset ((p\\supset p)\\land ((q\\equiv p)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1100011011000011"]
          ["\\(\\{ (\\lnot p\\supset (((q\\land r)\\lor p)\\land s)),(r\\supset (((s\\lor s)\\land s)\\land (p\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000111111111 és 1110110111001101"]
          ["\\(\\{ ((\\lnot (q\\equiv q)\\equiv s)\\land (r\\land q)),((s\\lor r)\\lor ((p\\supset s)\\equiv (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000010 és 0111111111111111"]
          ["\\(\\{ \\lnot (\\lnot s\\land (s\\land (q\\supset q))),((s\\land r)\\lor \\lnot ((q\\equiv p)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100001111111111 és 1001101101011011"]
          ["\\(\\{ ((s\\supset (r\\equiv \\lnot r))\\equiv \\lnot q),((r\\equiv (q\\supset p))\\supset (s\\lor (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1001100110100101 és 1111111111011111"]
          ["\\(\\{ ((q\\lor \\lnot \\lnot q)\\supset (s\\land p)),((((r\\lor r)\\lor r)\\land p)\\supset (s\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110101 és 1101011111111111"]
          ["\\(\\{ (\\lnot (p\\supset r)\\lor \\lnot (p\\equiv s)),((r\\equiv (p\\lor s))\\equiv ((r\\lor q)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0111111111101110 és 0000011001110011"]
          ["\\(\\{ (((q\\supset q)\\lor s)\\equiv \\lnot (s\\equiv s)),(q\\equiv ((r\\land (s\\supset p))\\lor \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 0010111100001111"]
          ["\\(\\{ \\lnot (s\\land ((q\\lor s)\\lor (s\\equiv r))),(\\lnot p\\land \\lnot \\lnot (r\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 1100010000000000"]
          ["\\(\\{ \\lnot (q\\supset (q\\equiv \\lnot (s\\equiv p))),((p\\supset (s\\lor \\lnot p))\\lor (q\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0001011100000101 és 1101111111110101"]
          ["\\(\\{ ((p\\equiv (((p\\lor r)\\supset s)\\lor p))\\supset s),((s\\land ((p\\supset r)\\supset r))\\supset \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1111110101010101 és 1101110110101010"]
          ["\\(\\{ (((q\\equiv (p\\lor r))\\equiv p)\\equiv (q\\lor s)),\\lnot (p\\supset ((q\\supset p)\\equiv (p\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1011100111101111 és 0000000101110000"]
          ["\\(\\{ ((((q\\equiv q)\\equiv q)\\equiv q)\\lor \\lnot s),(\\lnot ((p\\equiv q)\\supset s)\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1101111110101010 és 1101111111110101"]
          ["\\(\\{ (q\\supset ((q\\lor r)\\equiv (p\\supset (p\\land s)))),((q\\equiv ((p\\land p)\\equiv s))\\equiv (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111110101 és 0100001101100101"]
          ["\\(\\{ (p\\equiv (s\\land (((r\\supset q)\\equiv q)\\lor q))),(\\lnot (q\\supset s)\\land ((q\\lor p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1101110100010101 és 0001011000001010"]
          ["\\(\\{ (((s\\equiv s)\\lor (s\\land s))\\lor (r\\equiv r)),((p\\land p)\\equiv (s\\land ((s\\supset s)\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1101011101010101 és 1100001100000101"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot ((p\\supset (\\lnot p\\supset r))\\supset q), (\\lnot r\\supset ((p\\land q)\\equiv (r\\land r))) \\}\\)"
         "\\(\\{ ((((p\\supset s)\\supset s)\\supset r)\\supset (s\\supset q)), (s\\lor (r\\supset \\lnot (q\\lor (r\\equiv r)))) \\}\\)"
         "\\(\\{ (((q\\land (p\\lor q))\\equiv q)\\supset (r\\supset s)), ((r\\land (\\lnot q\\land p))\\lor (s\\lor q)) \\}\\)"
         "\\(\\{ ((r\\supset p)\\lor ((s\\land (r\\equiv q))\\supset s)), \\lnot ((q\\land \\lnot (s\\lor q))\\equiv r) \\}\\)"
         "\\(\\{ \\lnot ((s\\lor s)\\land (q\\lor (p\\lor r))), ((r\\lor (r\\land r))\\lor ((p\\lor s)\\equiv r)) \\}\\)"
         "\\(\\{ ((s\\supset (q\\land q))\\equiv (r\\land (r\\lor q))), ((p\\equiv \\lnot p)\\equiv ((p\\lor r)\\supset p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((\\lnot q\\supset (r\\lor q))\\lor \\lnot q),((s\\equiv s)\\equiv (\\lnot (s\\equiv q)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000000001100101"]
          ["\\(\\{ ((p\\land (r\\lor r))\\supset (p\\land (q\\equiv s))),\\lnot ((q\\supset s)\\lor ((q\\land p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011001101101 és 0010011000000000"]
          ["\\(\\{ (((q\\equiv p)\\supset (r\\equiv p))\\supset \\lnot q),((s\\lor (r\\supset s))\\supset (q\\equiv (q\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1111111011111100 és 1110111111111111"]
          ["\\(\\{ (\\lnot ((p\\land q)\\lor \\lnot r)\\equiv q),((p\\equiv ((p\\land s)\\equiv p))\\lor \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1110010000100000 és 1001110110111111"]
          ["\\(\\{ \\lnot ((r\\supset q)\\supset ((p\\land q)\\supset s)),(((q\\equiv (r\\lor (q\\land q)))\\supset q)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0010111010000010 és 1110011011111111"]
          ["\\(\\{ (((r\\equiv (p\\equiv q))\\land (s\\supset p))\\supset q),((\\lnot s\\lor ((s\\supset s)\\equiv r))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1100111100111111 és 0001010100010001"]
          ["\\(\\{ ((s\\supset ((p\\land p)\\supset q))\\land (p\\land s)),\\lnot ((q\\land p)\\land (s\\supset (q\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100011000001000"]
          ["\\(\\{ (q\\supset ((p\\supset s)\\equiv ((r\\supset r)\\equiv s))),\\lnot ((q\\lor s)\\lor ((s\\supset r)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111011111111 és 1010011010100000"]
          ["\\(\\{ (p\\supset ((q\\supset p)\\equiv ((q\\supset q)\\land s))),(\\lnot (\\lnot p\\equiv (r\\equiv q))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1100111111010101 és 0011001110110011"]
          ["\\(\\{ ((r\\land p)\\lor \\lnot (r\\lor \\lnot r)),(p\\equiv ((r\\lor r)\\supset (r\\lor (s\\equiv q)))) \\}\\)" "az igazságtáblák főoszlopai: 0010000100110011 és 0010000111111111"]
          ["\\(\\{ \\lnot \\lnot ((p\\equiv s)\\equiv \\lnot s),(((p\\equiv s)\\supset q)\\supset (q\\lor (s\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1001111101111111"]
          ["\\(\\{ ((\\lnot (p\\equiv r)\\land s)\\supset (q\\supset q)),(((r\\land p)\\lor ((p\\lor s)\\supset s))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0100101000111101"]
          ["\\(\\{ ((((p\\land s)\\equiv s)\\land q)\\lor (p\\lor q)),(p\\equiv (((r\\supset (p\\supset s))\\lor q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1010111001110101"]
          ["\\(\\{ \\lnot (\\lnot (p\\equiv (q\\lor r))\\lor r),\\lnot \\lnot ((r\\land s)\\land \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1110011000001100 és 0000000100000000"]
          ["\\(\\{ \\lnot \\lnot \\lnot (s\\supset \\lnot p),((p\\lor r)\\equiv ((q\\land q)\\equiv \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0001011001010101 és 1100110010111100"]
          ["\\(\\{ ((r\\lor p)\\lor ((\\lnot s\\land q)\\supset r)),((p\\lor \\lnot \\lnot (q\\lor q))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1110010010110011"]
          ["\\(\\{ (((q\\supset (s\\land s))\\supset q)\\lor (q\\equiv r)),((\\lnot (r\\supset q)\\land r)\\land (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100101111 és 0000001000110000"]
          ["\\(\\{ (((q\\equiv \\lnot p)\\lor (s\\land r))\\land q),((((p\\lor r)\\lor p)\\supset p)\\land (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000101100000001 és 1100000011111111"]
          ["\\(\\{ ((r\\equiv s)\\equiv ((p\\equiv r)\\land (q\\equiv q))),((p\\lor (((p\\land q)\\land p)\\supset q))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1010011001100110 és 1100111111111111"]
          ["\\(\\{ ((r\\land \\lnot r)\\land \\lnot (s\\equiv q)),((s\\lor (s\\supset q))\\land ((q\\equiv p)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0000111111111111"]
          ["\\(\\{ ((q\\land \\lnot ((r\\land q)\\land r))\\equiv s),(p\\land ((s\\equiv q)\\supset (p\\supset \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1001101001100110 és 0000000011111010"]
          ["\\(\\{ (\\lnot (q\\lor s)\\land ((s\\land r)\\supset r)),((q\\lor p)\\lor (\\lnot (q\\supset p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1001001010100000 és 1110111111111111"]
          ["\\(\\{ (((r\\lor (s\\supset q))\\equiv (q\\lor r))\\land s),(p\\supset (p\\equiv \\lnot (q\\equiv (s\\land p)))) \\}\\)" "az igazságtáblák főoszlopai: 0100010001010101 és 1100111011011010"]
          ["\\(\\{ (\\lnot (r\\equiv (r\\land q))\\lor (r\\land p)),(q\\land (\\lnot s\\land \\lnot \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0011000000110011 és 0000010100000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((p\\supset q)\\equiv ((q\\supset (s\\supset p))\\lor q)), ((s\\lor q)\\lor (\\lnot s\\land \\lnot q)) \\}\\)"
         "\\(\\{ ((q\\supset p)\\supset \\lnot (q\\supset (r\\supset q))), ((\\lnot r\\lor (r\\supset r))\\supset \\lnot s) \\}\\)"
         "\\(\\{ (p\\supset \\lnot (\\lnot \\lnot p\\supset q)), ((r\\equiv s)\\lor ((q\\supset r)\\supset (s\\supset p))) \\}\\)"
         "\\(\\{ (((r\\supset p)\\equiv (p\\equiv p))\\equiv (q\\equiv s)), (\\lnot (r\\lor s)\\lor (s\\lor (s\\equiv s))) \\}\\)"
         "\\(\\{ (\\lnot q\\lor (r\\equiv \\lnot (r\\equiv q))), (((r\\lor s)\\lor r)\\lor ((q\\land q)\\lor p)) \\}\\)"
         "\\(\\{ \\lnot ((s\\land ((s\\lor q)\\supset r))\\land s), (q\\lor (\\lnot (p\\land p)\\equiv (p\\equiv r))) \\}\\)"
         "\\(\\{ ((r\\equiv q)\\supset \\lnot (\\lnot q\\equiv p)), ((r\\land \\lnot s)\\supset ((s\\land s)\\supset r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (q\\land ((q\\lor (q\\supset q))\\supset r)),((q\\lor (p\\equiv q))\\equiv \\lnot (q\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111100 és 0000011111110000"]
          ["\\(\\{ ((s\\land s)\\equiv ((q\\lor q)\\supset (r\\land p))),(q\\supset ((((p\\lor q)\\lor s)\\lor r)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101000101011001 és 1110111011111111"]
          ["\\(\\{ (((q\\land s)\\supset ((s\\supset r)\\lor p))\\supset p),(r\\land (((s\\equiv s)\\land (p\\land s))\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0010011011111111 és 0011001100110011"]
          ["\\(\\{ (\\lnot (p\\supset p)\\lor ((r\\land p)\\land r)),\\lnot (\\lnot (\\lnot s\\land s)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0000000010110011 és 1001110110101010"]
          ["\\(\\{ (((s\\lor s)\\lor \\lnot \\lnot p)\\land s),\\lnot (q\\equiv (\\lnot (s\\equiv r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000100100001001"]
          ["\\(\\{ \\lnot ((p\\land s)\\lor (q\\lor \\lnot q)),(p\\land (\\lnot (\\lnot p\\land s)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 0000000001010101"]
          ["\\(\\{ ((r\\supset \\lnot \\lnot (s\\lor s))\\land p),(((p\\equiv r)\\land (s\\supset (r\\supset q)))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000000011011101 és 0011111111011111"]
          ["\\(\\{ \\lnot ((s\\lor ((r\\land p)\\equiv r))\\lor s),((q\\supset p)\\lor (\\lnot s\\supset (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0010010100000000 és 1101111111111111"]
          ["\\(\\{ (((s\\land p)\\equiv (q\\land p))\\land (s\\land p)),((p\\supset q)\\equiv \\lnot (s\\equiv (r\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000001000101 és 1111110110111100"]
          ["\\(\\{ (q\\supset \\lnot (s\\lor (p\\lor (q\\equiv r)))),\\lnot ((r\\land p)\\supset ((q\\land p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111110000 és 0011011000010000"]
          ["\\(\\{ (q\\lor (((r\\equiv r)\\equiv q)\\supset (r\\supset q))),((\\lnot s\\supset p)\\land ((q\\land r)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001111 és 0100010111111111"]
          ["\\(\\{ ((((q\\equiv r)\\equiv p)\\equiv r)\\equiv (p\\lor q)),((s\\lor \\lnot (s\\lor r))\\lor (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000011101101111 és 1111111111011101"]
          ["\\(\\{ (\\lnot (((q\\lor q)\\equiv r)\\equiv p)\\supset p),(\\lnot p\\lor (\\lnot r\\supset (s\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0011110011111111 és 1111011111110111"]
          ["\\(\\{ (\\lnot ((r\\land p)\\equiv (p\\equiv r))\\lor r),\\lnot (p\\land \\lnot (q\\lor (q\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1111101100110011 és 1100011010001111"]
          ["\\(\\{ ((p\\land p)\\supset ((s\\lor p)\\land (s\\equiv r))),\\lnot (((p\\land p)\\supset (s\\equiv r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1101011110011001 és 1100110010101010"]
          ["\\(\\{ ((q\\lor (q\\equiv (s\\supset q)))\\supset (s\\equiv r)),(((r\\land r)\\land s)\\lor \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111001 és 0001000111111111"]
          ["\\(\\{ (s\\lor ((p\\land \\lnot s)\\equiv \\lnot r)),(\\lnot ((s\\lor s)\\lor (s\\lor s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0111011111011101 és 0001010100000000"]
          ["\\(\\{ (((q\\equiv (r\\supset p))\\supset s)\\supset (r\\equiv q)),(\\lnot (q\\equiv (p\\land p))\\land (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1110111000101011 és 0000001100110000"]
          ["\\(\\{ ((q\\equiv s)\\lor (\\lnot q\\lor (q\\lor s))),\\lnot (((q\\supset q)\\equiv \\lnot p)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1100011011111111"]
          ["\\(\\{ (s\\lor ((s\\equiv (q\\lor (q\\equiv s)))\\lor q)),(r\\equiv (q\\land (s\\supset (r\\equiv (q\\supset q))))) \\}\\)" "az igazságtáblák főoszlopai: 0101111101111111 és 1110011111000111"]
          ["\\(\\{ (\\lnot s\\equiv \\lnot \\lnot \\lnot s),(((s\\lor (s\\land p))\\supset (p\\lor q))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0101111100001111"]
          ["\\(\\{ ((\\lnot s\\lor s)\\equiv (\\lnot q\\lor s)),(((q\\lor q)\\equiv \\lnot q)\\lor \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1100010000001101 és 1110111111001100"]
          ["\\(\\{ (((p\\land (s\\equiv p))\\land q)\\supset (p\\equiv s)),((\\lnot s\\land (p\\land (s\\land p)))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1101111101010111 és 0000000000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((r\\land (p\\lor q))\\supset (r\\supset (r\\equiv q))), ((s\\supset s)\\lor (((p\\lor p)\\equiv q)\\lor p)) \\}\\)"
         "\\(\\{ (q\\supset ((q\\equiv (s\\land q))\\land (r\\lor p))), ((p\\equiv r)\\equiv \\lnot (q\\supset (q\\supset r))) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot r\\supset q)\\land (p\\supset q)), (r\\lor (((p\\equiv (q\\land q))\\equiv p)\\supset s)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (q\\lor (p\\supset \\lnot r)), \\lnot (\\lnot s\\supset (p\\lor (p\\lor q))) \\}\\)"
         "\\(\\{ (q\\land ((r\\lor p)\\supset (q\\supset (r\\equiv q)))), ((s\\equiv s)\\lor \\lnot \\lnot (s\\land r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (q\\lor ((s\\equiv s)\\lor q)), (\\lnot ((p\\equiv p)\\equiv s)\\lor (p\\equiv s)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((p\\lor (s\\supset s))\\equiv r), (\\lnot \\lnot p\\lor \\lnot (q\\land q)) \\}\\)"
         "\\(\\{ (((p\\land (r\\land p))\\lor \\lnot q)\\land q), (((q\\land p)\\supset \\lnot (q\\supset s))\\equiv p) \\}\\)"
         "\\(\\{ ((((s\\lor s)\\supset p)\\equiv (p\\lor p))\\supset q), \\lnot (((s\\equiv p)\\land \\lnot p)\\supset q) \\}\\)"
         "\\(\\{ (\\lnot (p\\lor p)\\supset (\\lnot q\\equiv q)), (\\lnot (p\\supset p)\\lor ((s\\land q)\\land q)) \\}\\)"
         "\\(\\{ (\\lnot ((p\\lor r)\\equiv (q\\supset s))\\equiv r), ((s\\land \\lnot q)\\land ((p\\equiv s)\\supset r)) \\}\\)"
         "\\(\\{ ((s\\land s)\\supset ((r\\equiv (q\\supset s))\\lor s)), ((p\\equiv (q\\land ((p\\lor s)\\land q)))\\lor s) \\}\\)"
         "\\(\\{ (q\\supset ((s\\land (q\\land s))\\land (s\\lor q))), ((p\\supset s)\\supset \\lnot (q\\equiv (s\\lor q))) \\}\\)"
         "\\(\\{ (p\\lor (\\lnot ((s\\lor s)\\equiv s)\\supset s)), ((p\\lor q)\\lor (((q\\land p)\\land r)\\equiv q)) \\}\\)"
         "\\(\\{ ((((r\\equiv s)\\land (q\\land q))\\equiv r)\\lor q), ((q\\supset q)\\lor \\lnot \\lnot \\lnot s) \\}\\)"
         "\\(\\{ (((r\\equiv q)\\land (s\\equiv p))\\land (r\\equiv r)), ((r\\land s)\\supset \\lnot (s\\land \\lnot s)) \\}\\)"
         "\\(\\{ (((q\\supset p)\\equiv q)\\land (s\\lor \\lnot r)), \\lnot (p\\equiv ((r\\supset s)\\land (q\\equiv r))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (r\\supset ((\\lnot q\\equiv (s\\lor q))\\supset q)),(s\\land ((q\\land s)\\equiv (r\\lor (s\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111101111 és 0000000000000101"]
          ["\\(\\{ \\lnot \\lnot (((q\\supset q)\\land p)\\land s),((p\\lor (p\\equiv r))\\supset ((r\\equiv r)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010101 és 0011001100110011"]
          ["\\(\\{ ((q\\lor r)\\equiv ((q\\equiv p)\\land \\lnot q)),((p\\supset s)\\supset (s\\lor (\\lnot q\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0010101111000000 és 0101111111111111"]
          ["\\(\\{ (((s\\land s)\\equiv (s\\equiv s))\\equiv (p\\lor p)),\\lnot ((p\\land \\lnot q)\\land (r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1001001110101010 és 1100011000000000"]
          ["\\(\\{ ((s\\lor s)\\land \\lnot (r\\lor (p\\lor r))),((q\\supset p)\\lor ((p\\supset (r\\equiv q))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0100000100000000 és 1101111111111111"]
          ["\\(\\{ (p\\land ((s\\supset q)\\land ((r\\land q)\\equiv r))),(((r\\lor r)\\supset \\lnot (q\\lor s))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000101111 és 1111111111101111"]
          ["\\(\\{ ((s\\land p)\\land (s\\equiv (r\\lor \\lnot r))),((q\\land r)\\equiv ((s\\supset p)\\land (s\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010101 és 0101011110101001"]
          ["\\(\\{ ((q\\equiv p)\\land ((r\\land s)\\supset (p\\lor s))),((\\lnot (s\\lor q)\\land \\lnot p)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1100111000001111 és 0111001111111111"]
          ["\\(\\{ ((((q\\lor r)\\equiv (r\\land s))\\equiv s)\\lor p),((\\lnot q\\lor ((q\\supset s)\\equiv q))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0111100011111111 és 1101111011111111"]
          ["\\(\\{ \\lnot \\lnot \\lnot \\lnot (r\\equiv p),(((q\\equiv r)\\equiv (q\\supset s))\\equiv (s\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100100110011 és 0010101000100111"]
          ["\\(\\{ (p\\lor \\lnot ((r\\land r)\\lor (r\\supset p))),((q\\equiv p)\\lor ((p\\lor s)\\equiv (p\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0010000111111111 és 1101111111111111"]
          ["\\(\\{ \\lnot (s\\equiv (s\\supset (r\\equiv (r\\land s)))),((\\lnot s\\lor q)\\lor \\lnot (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1010100011101010 és 1101111110101111"]
          ["\\(\\{ ((((s\\land q)\\land p)\\equiv r)\\land (s\\supset p)),((s\\lor q)\\equiv \\lnot (p\\land (q\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1000100111001001 és 0101001100101010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((r\\lor r)\\land (p\\supset (r\\equiv (s\\supset p)))), ((r\\land (s\\lor s))\\lor (q\\equiv (q\\equiv q))) \\}\\)"
         "\\(\\{ (q\\lor (((q\\lor p)\\supset \\lnot r)\\equiv s)), ((q\\supset r)\\lor ((s\\land (s\\equiv q))\\supset p)) \\}\\)"
         "\\(\\{ ((r\\lor p)\\equiv \\lnot ((p\\lor s)\\equiv p)), \\lnot (s\\equiv \\lnot (r\\land \\lnot r)) \\}\\)"
         "\\(\\{ ((s\\lor p)\\supset ((r\\lor r)\\lor (r\\land q))), (s\\lor (((s\\land r)\\equiv q)\\lor (r\\lor p))) \\}\\)"
         "\\(\\{ (p\\supset (((p\\land q)\\equiv q)\\supset (r\\equiv q))), (((s\\supset (q\\supset p))\\supset q)\\equiv (p\\supset p)) \\}\\)"
         "\\(\\{ (q\\supset (((s\\land p)\\land r)\\lor (q\\land p))), (p\\equiv ((r\\lor (q\\equiv r))\\supset \\lnot p)) \\}\\)"
         "\\(\\{ ((p\\equiv (q\\lor s))\\lor ((q\\equiv s)\\land r)), \\lnot (\\lnot \\lnot p\\land \\lnot p) \\}\\)"
         "\\(\\{ (\\lnot ((q\\land q)\\lor \\lnot p)\\land q), (((p\\equiv (q\\land (r\\lor q)))\\supset p)\\land r) \\}\\)"
         "\\(\\{ (\\lnot \\lnot \\lnot (r\\lor p)\\supset s), ((((r\\land r)\\lor p)\\lor r)\\equiv (q\\equiv r)) \\}\\)"
         "\\(\\{ ((p\\equiv (s\\lor p))\\equiv \\lnot (s\\lor p)), (r\\supset \\lnot (p\\supset (q\\lor (s\\supset p)))) \\}\\)"
         "\\(\\{ \\lnot (q\\supset (\\lnot s\\equiv (s\\lor p))), \\lnot (((r\\supset s)\\equiv s)\\land (r\\equiv p)) \\}\\)"
         "\\(\\{ (((q\\equiv s)\\land (s\\land r))\\equiv (r\\lor q)), ((s\\equiv q)\\supset ((s\\land r)\\supset (q\\lor s))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((s\\lor s)\\lor ((r\\equiv s)\\land \\lnot r)),\\lnot ((\\lnot q\\lor (p\\supset s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1111110111011101 és 1001110110101010"]
          ["\\(\\{ ((r\\lor \\lnot \\lnot (q\\supset r))\\equiv s),((s\\lor (((r\\supset p)\\supset p)\\supset s))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0111000011011001 és 1111110111111111"]
          ["\\(\\{ (r\\supset ((p\\land (q\\lor p))\\land (p\\supset s))),((\\lnot s\\supset s)\\supset ((p\\lor p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100111011101 és 1111110110111011"]
          ["\\(\\{ (\\lnot (\\lnot p\\land s)\\land (p\\equiv p)),(((q\\supset q)\\land \\lnot (r\\land r))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1000001000000000 és 0100000101000100"]
          ["\\(\\{ ((s\\land q)\\equiv ((q\\equiv (p\\lor s))\\lor s)),((\\lnot (s\\equiv r)\\lor (r\\equiv s))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0001101010100101 és 0000000011111111"]
          ["\\(\\{ \\lnot ((p\\land q)\\supset (r\\equiv (q\\supset r))),((p\\land (r\\equiv s))\\lor ((q\\land s)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111101000000 és 0000000110011001"]
          ["\\(\\{ (((p\\supset q)\\land (q\\equiv (s\\land r)))\\supset q),(\\lnot r\\lor \\lnot (r\\lor (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111101111111 és 1110100111001100"]
          ["\\(\\{ \\lnot (((s\\equiv r)\\equiv q)\\equiv (p\\supset r)),\\lnot (((p\\equiv s)\\lor (q\\equiv r))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1001110101011010 és 1010110100100010"]
          ["\\(\\{ \\lnot (\\lnot s\\land ((p\\land q)\\equiv r)),((q\\land \\lnot \\lnot p)\\lor (p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0100101101111101 és 0000000011111111"]
          ["\\(\\{ (p\\supset (\\lnot (r\\equiv r)\\equiv (r\\equiv p))),(((p\\lor q)\\supset q)\\equiv (r\\lor (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1111011111001100 és 0010010010001111"]
          ["\\(\\{ (\\lnot r\\land (\\lnot q\\lor (q\\lor s))),(\\lnot p\\equiv (\\lnot (q\\lor p)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1100100111001100 és 0000101110000000"]
          ["\\(\\{ \\lnot (s\\land (\\lnot (p\\lor r)\\lor p)),\\lnot ((((q\\lor p)\\supset q)\\supset s)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1000011110101010 és 0101000011111010"]
          ["\\(\\{ ((s\\land s)\\land (s\\lor ((s\\equiv s)\\equiv q))),(((p\\lor (s\\lor p))\\land (r\\supset q))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 1010111100000011"]
          ["\\(\\{ ((s\\land (p\\equiv s))\\land ((p\\lor s)\\supset q)),\\lnot ((p\\lor ((p\\land q)\\land s))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000101 és 1100011010000000"]
          ["\\(\\{ \\lnot ((q\\supset (q\\supset s))\\land (p\\supset p)),((((s\\equiv r)\\land s)\\equiv r)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0000000010001010 és 1110001110100010"]
          ["\\(\\{ (q\\equiv \\lnot \\lnot (s\\lor (p\\lor r))),((\\lnot r\\equiv (\\lnot s\\supset s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1010001010001111 és 0100010001000100"]
          ["\\(\\{ (s\\equiv (((s\\equiv p)\\land (r\\land r))\\lor q)),((s\\lor (r\\land p))\\equiv \\lnot \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1000100001110101 és 1100011000111101"]
          ["\\(\\{ ((\\lnot p\\supset s)\\lor (r\\land (r\\land s))),((((s\\lor s)\\land p)\\land p)\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0101010111111111 és 0000000001010000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (q\\equiv \\lnot (q\\supset (\\lnot q\\equiv q))), ((s\\supset (q\\equiv q))\\lor ((p\\equiv s)\\supset r)) \\}\\)"
         "\\(\\{ (((s\\equiv q)\\supset ((r\\supset q)\\lor s))\\supset s), (s\\supset ((s\\lor p)\\equiv (p\\supset (q\\equiv p)))) \\}\\)"
         "\\(\\{ (((s\\supset s)\\equiv q)\\supset ((s\\supset s)\\supset s)), ((\\lnot \\lnot (p\\land r)\\supset p)\\supset r) \\}\\)"
         "\\(\\{ ((r\\supset \\lnot (r\\land q))\\equiv (r\\lor p)), (\\lnot q\\equiv \\lnot (p\\equiv (r\\land r))) \\}\\)"
         "\\(\\{ (\\lnot ((p\\land (p\\supset s))\\equiv r)\\lor p), ((r\\land s)\\supset \\lnot ((r\\equiv p)\\supset q)) \\}\\)"
         "\\(\\{ (((p\\land r)\\supset \\lnot s)\\equiv \\lnot r), ((((q\\lor q)\\land q)\\supset (q\\lor q))\\lor q) \\}\\)"
         "\\(\\{ (\\lnot ((p\\equiv r)\\equiv q)\\equiv (r\\land p)), (\\lnot (s\\supset p)\\supset ((q\\lor s)\\lor r)) \\}\\)"
         "\\(\\{ \\lnot ((s\\lor s)\\supset (r\\supset (p\\lor p))), ((s\\supset \\lnot p)\\lor ((p\\equiv s)\\supset r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\supset p)\\land \\lnot (r\\supset (s\\land p))),\\lnot (q\\land \\lnot ((r\\lor r)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0010000100100010 és 1100011000000000"]
          ["\\(\\{ \\lnot (((s\\lor r)\\land s)\\supset (p\\equiv s)),(((p\\supset p)\\equiv p)\\land ((p\\lor s)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0101010100000000 és 0000000000000000"]
          ["\\(\\{ \\lnot ((q\\supset q)\\equiv ((q\\land p)\\supset q)),(((r\\land \\lnot \\lnot s)\\supset p)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0000000011110000 és 1101111111111111"]
          ["\\(\\{ (\\lnot \\lnot (r\\equiv p)\\equiv \\lnot p),(p\\land (\\lnot (p\\lor s)\\lor (r\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1111011001001100 és 0000000000000011"]
          ["\\(\\{ ((r\\lor ((p\\land s)\\supset q))\\supset (p\\supset s)),\\lnot (\\lnot (r\\equiv r)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111011111010101 és 1100111011110000"]
          ["\\(\\{ (s\\supset ((p\\equiv \\lnot s)\\land (p\\equiv s))),\\lnot ((((r\\equiv s)\\supset r)\\supset p)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 1100011010000000"]
          ["\\(\\{ (((q\\equiv p)\\lor \\lnot s)\\lor (r\\land s)),\\lnot \\lnot ((\\lnot q\\land r)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1101111110111111 és 0000001000000000"]
          ["\\(\\{ (\\lnot (q\\land q)\\equiv (s\\equiv \\lnot s)),(r\\supset (((q\\equiv p)\\equiv s)\\supset (r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0000001001001111 és 1111101111111111"]
          ["\\(\\{ ((q\\supset (p\\supset \\lnot q))\\equiv \\lnot p),(((r\\land q)\\land \\lnot (q\\land p))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1100101001001111 és 1100111100001111"]
          ["\\(\\{ (\\lnot (\\lnot s\\supset p)\\land (p\\supset p)),((r\\land ((s\\lor q)\\equiv p))\\equiv \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1000010000000000 és 0100111001000110"]
          ["\\(\\{ \\lnot ((\\lnot (q\\supset p)\\supset q)\\land p),\\lnot ((q\\land ((r\\lor p)\\supset r))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0000111000000000"]
          ["\\(\\{ (((r\\equiv r)\\equiv \\lnot \\lnot r)\\equiv r),\\lnot (s\\supset ((r\\equiv r)\\land (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1101011100000000 és 0001011001010101"]
          ["\\(\\{ (s\\land (((r\\supset (p\\equiv s))\\land r)\\lor r)),\\lnot (s\\equiv \\lnot ((p\\lor p)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 0101101010100101"]
          ["\\(\\{ (((s\\lor r)\\supset (r\\supset s))\\supset (r\\equiv r)),((r\\supset p)\\lor (q\\equiv ((q\\lor r)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1110011000100010 és 1110101111111111"]
          ["\\(\\{ ((\\lnot (r\\lor q)\\equiv s)\\equiv \\lnot q),(((p\\land (q\\supset s))\\supset r)\\land (r\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0111111001100101 és 1110011110001011"]
          ["\\(\\{ (r\\land (\\lnot (q\\supset (s\\land p))\\supset p)),\\lnot (\\lnot \\lnot s\\lor (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000110011 és 0010010110001000"]
          ["\\(\\{ (p\\land ((((r\\equiv p)\\supset s)\\equiv p)\\supset r)),(\\lnot ((q\\equiv (p\\land s))\\supset p)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 0100010000000000"]
          ["\\(\\{ (((q\\land r)\\land s)\\equiv (r\\supset (q\\lor s))),\\lnot ((q\\land s)\\supset ((p\\lor q)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0010011100100001 és 0010011000000100"]
          ["\\(\\{ \\lnot (\\lnot \\lnot q\\land (p\\lor r)),(\\lnot (p\\lor \\lnot r)\\land (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100010111110000 és 0000000000000000"]
          ["\\(\\{ ((r\\supset s)\\lor (\\lnot \\lnot p\\equiv p)),\\lnot ((s\\lor r)\\equiv (\\lnot r\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011101 és 0100100001001000"]
          ["\\(\\{ (((p\\land (s\\lor s))\\lor \\lnot p)\\land r),(\\lnot ((s\\land s)\\land (p\\lor p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0000001000010001 és 0000000001101010"]
          ["\\(\\{ (p\\supset ((p\\equiv p)\\land (r\\equiv (q\\supset r)))),(r\\supset ((p\\supset s)\\land (s\\equiv (s\\lor r)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1111100111011101"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot p\\equiv ((q\\supset p)\\lor \\lnot r)), ((\\lnot r\\lor \\lnot p)\\lor (q\\supset r)) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot s\\land s)\\land (r\\supset p)), ((p\\land (r\\equiv (p\\supset r)))\\lor (p\\land r)) \\}\\)"
         "\\(\\{ ((p\\equiv r)\\supset \\lnot ((p\\equiv q)\\equiv p)), \\lnot \\lnot (q\\supset (r\\land (r\\lor p))) \\}\\)"
         "\\(\\{ ((q\\supset (r\\land s))\\supset ((q\\equiv s)\\equiv q)), (s\\supset ((r\\equiv ((r\\supset s)\\land p))\\land q)) \\}\\)"
         "\\(\\{ (r\\supset (s\\land ((s\\land q)\\lor (s\\lor r)))), (\\lnot ((q\\supset p)\\lor s)\\lor (p\\supset q)) \\}\\)"
         "\\(\\{ ((q\\equiv (p\\lor p))\\supset \\lnot (p\\lor q)), \\lnot ((q\\supset q)\\supset (\\lnot q\\equiv q)) \\}\\)"
         "\\(\\{ ((q\\lor r)\\supset (r\\supset (p\\land (r\\land q)))), (((r\\land q)\\land s)\\lor ((q\\lor s)\\supset s)) \\}\\)"
         "\\(\\{ ((((r\\land s)\\equiv q)\\equiv (s\\equiv q))\\supset r), \\lnot (\\lnot (r\\supset q)\\equiv (p\\lor r)) \\}\\)"
         "\\(\\{ (((p\\supset (r\\equiv s))\\equiv q)\\lor (p\\lor q)), \\lnot \\lnot ((\\lnot s\\lor p)\\lor r) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((s\\land s)\\lor \\lnot r)\\equiv (s\\lor s)),((\\lnot q\\equiv (p\\supset (r\\land r)))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0111001011110111 és 0011111101001111"]
          ["\\(\\{ ((p\\land q)\\equiv ((s\\equiv (s\\supset s))\\land p)),\\lnot (((r\\land p)\\equiv (q\\supset r))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 1100011010100101 és 0001010100001100"]
          ["\\(\\{ (\\lnot (q\\land \\lnot r)\\supset (s\\equiv r)),((q\\lor p)\\supset ((\\lnot r\\equiv r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110011101 és 1100111000000000"]
          ["\\(\\{ ((q\\supset q)\\equiv ((r\\land p)\\land (s\\land q))),(\\lnot p\\equiv \\lnot ((r\\supset p)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000001 és 1111011010110011"]
          ["\\(\\{ (\\lnot (s\\land q)\\supset (r\\land (s\\lor q))),\\lnot (\\lnot (r\\equiv r)\\land (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0001011100010111 és 1100011000000000"]
          ["\\(\\{ \\lnot ((s\\supset ((s\\supset s)\\supset p))\\lor r),((p\\land s)\\equiv \\lnot ((q\\lor p)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0110011000000000 és 0000111110101010"]
          ["\\(\\{ ((r\\equiv p)\\equiv (r\\lor (p\\equiv \\lnot q))),((p\\supset (r\\equiv q))\\equiv ((p\\land s)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001111100111111 és 0001110100101011"]
          ["\\(\\{ ((p\\equiv s)\\supset (\\lnot (p\\lor s)\\land r)),((r\\land (s\\supset p))\\lor (s\\lor (q\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101010 és 0111111101111111"]
          ["\\(\\{ (\\lnot p\\lor ((s\\supset q)\\supset (s\\equiv q))),\\lnot (s\\land ((p\\lor \\lnot p)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1101011011110101 és 1100011000000000"]
          ["\\(\\{ \\lnot (q\\supset ((q\\equiv r)\\equiv (r\\supset p))),((s\\equiv s)\\land \\lnot (q\\land (r\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111000001100 és 1100010000000000"]
          ["\\(\\{ \\lnot ((q\\land s)\\equiv \\lnot (r\\equiv r)),(\\lnot (p\\lor (p\\lor (s\\land r)))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000101 és 0001000111111111"]
          ["\\(\\{ ((r\\supset q)\\equiv \\lnot ((p\\supset p)\\lor s)),\\lnot (\\lnot (q\\lor q)\\equiv (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0010101100110000 és 1100110111110011"]
          ["\\(\\{ (((q\\lor (r\\lor p))\\supset \\lnot s)\\supset s),(s\\lor ((p\\supset ((s\\supset s)\\equiv r))\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 1111011111110111"]
          ["\\(\\{ \\lnot ((p\\lor r)\\equiv (q\\equiv (s\\equiv q))),(s\\equiv ((r\\land s)\\supset (p\\lor (s\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0110010101101010 és 0100100011010101"]
          ["\\(\\{ ((r\\land p)\\land (q\\lor (p\\supset (s\\land p)))),(p\\supset (((s\\equiv q)\\lor (p\\lor p))\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010011 és 1101111111010101"]
          ["\\(\\{ ((q\\land (s\\land r))\\lor \\lnot (s\\equiv p)),((q\\land (q\\supset q))\\land (q\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101011 és 0000111100001111"]
          ["\\(\\{ (((p\\equiv q)\\supset (r\\lor p))\\land \\lnot s),(((s\\lor s)\\lor q)\\lor (p\\equiv (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0001110110101010 és 1101111101011111"]
          ["\\(\\{ (r\\lor (q\\equiv ((s\\lor s)\\land (q\\lor q)))),\\lnot (q\\land ((p\\land r)\\lor (s\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1111101100111111 és 1100110111110000"]
          ["\\(\\{ ((r\\land (p\\lor p))\\lor \\lnot (p\\land r)),(\\lnot (r\\equiv (p\\land p))\\lor (s\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000111111 és 1011111111011101"]
          ["\\(\\{ (((p\\land s)\\supset (q\\land s))\\supset (r\\land q)),(q\\land ((((r\\supset p)\\equiv p)\\supset p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001110010011 és 0000110100001111"]
          ["\\(\\{ (((s\\equiv r)\\lor (r\\land \\lnot s))\\lor r),(\\lnot (p\\lor (p\\supset r))\\equiv (r\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 0000100000111100"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((q\\equiv q)\\land s)\\lor (r\\equiv (q\\lor s))), (((q\\land q)\\land s)\\supset (s\\equiv (p\\equiv q))) \\}\\)"
         "\\(\\{ \\lnot \\lnot (\\lnot q\\lor (s\\supset q)), (s\\supset \\lnot \\lnot \\lnot (q\\equiv s)) \\}\\)"
         "\\(\\{ (((q\\lor \\lnot p)\\land r)\\supset (q\\lor q)), ((((q\\land s)\\supset r)\\supset \\lnot q)\\lor r) \\}\\)"
         "\\(\\{ (((q\\land \\lnot s)\\supset (p\\supset r))\\equiv s), (q\\lor (((s\\equiv q)\\land p)\\supset \\lnot s)) \\}\\)"
         "\\(\\{ ((\\lnot p\\equiv (s\\land s))\\supset (p\\lor p)), (((r\\equiv (q\\land q))\\equiv s)\\lor (r\\lor s)) \\}\\)"
         "\\(\\{ (s\\equiv (\\lnot r\\lor (s\\equiv (q\\land q)))), \\lnot (\\lnot \\lnot q\\lor (p\\land r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((((r\\land q)\\supset p)\\supset s)\\supset (s\\equiv r)),(p\\land (s\\land (s\\land \\lnot \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 0000000000000101"]
          ["\\(\\{ ((s\\supset p)\\supset ((q\\supset r)\\equiv (s\\equiv q))),(q\\lor (\\lnot (p\\supset \\lnot q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1111011101101001 és 1100111100001111"]
          ["\\(\\{ (((q\\supset (q\\supset q))\\lor (q\\equiv s))\\equiv r),(s\\supset ((p\\equiv (r\\land (r\\land q)))\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0011010010110011 és 1101111110101111"]
          ["\\(\\{ \\lnot ((q\\supset q)\\equiv ((q\\lor p)\\lor r)),(((s\\lor \\lnot s)\\lor \\lnot q)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1111000000000000 és 1101111111111111"]
          ["\\(\\{ (((s\\supset p)\\equiv \\lnot r)\\equiv (r\\land p)),((r\\land s)\\lor ((r\\supset \\lnot q)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0111010000010000 és 1111111111111111"]
          ["\\(\\{ \\lnot ((p\\land (s\\supset s))\\lor (s\\lor s)),\\lnot ((((r\\equiv s)\\land p)\\supset q)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1001110100000000 és 1110011011001100"]
          ["\\(\\{ \\lnot ((q\\equiv (p\\lor r))\\supset (r\\lor s)),\\lnot ((s\\lor p)\\equiv ((q\\lor q)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1010011000001000 és 0101101000000000"]
          ["\\(\\{ (r\\supset (\\lnot q\\equiv ((p\\lor p)\\supset s))),((p\\supset q)\\land \\lnot \\lnot (s\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1111101111011110 és 1000000000000101"]
          ["\\(\\{ \\lnot (((q\\equiv q)\\lor r)\\supset (s\\supset p)),((\\lnot (r\\equiv (r\\supset p))\\equiv p)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0110011000000000 és 1111101100110011"]
          ["\\(\\{ \\lnot (p\\lor (r\\supset ((r\\equiv q)\\supset q))),(q\\supset ((\\lnot s\\land r)\\land (s\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 1101111111110010"]
          ["\\(\\{ (((\\lnot p\\supset p)\\land p)\\lor (s\\equiv s)),(r\\land \\lnot ((q\\land s)\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0000001100000001"]
          ["\\(\\{ ((p\\land q)\\equiv (p\\land \\lnot \\lnot q)),((((p\\lor s)\\equiv s)\\lor (p\\supset q))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000000011011111"]
          ["\\(\\{ (\\lnot ((r\\supset (r\\supset q))\\lor q)\\land r),(p\\equiv (((p\\land \\lnot q)\\supset r)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0011001000110000 és 1111011001001111"]
          ["\\(\\{ ((r\\equiv (s\\lor (p\\supset r)))\\supset (s\\supset q)),\\lnot (((p\\land q)\\lor p)\\lor (r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111101111 és 1110011000000000"]
          ["\\(\\{ ((p\\supset q)\\lor (((p\\equiv q)\\supset r)\\supset q)),(((r\\lor s)\\supset p)\\land \\lnot (r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1110111110001111 és 0000000000000000"]
          ["\\(\\{ (\\lnot (q\\equiv q)\\land ((q\\lor s)\\land p)),((s\\equiv (r\\lor s))\\lor (\\lnot q\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111111111111111"]
          ["\\(\\{ (r\\land (\\lnot ((s\\land r)\\lor q)\\lor s)),\\lnot ((((s\\equiv p)\\land q)\\land q)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0001001100110001 és 1100001111111010"]
          ["\\(\\{ ((((p\\land s)\\equiv q)\\lor (q\\equiv s))\\supset r),(((p\\land s)\\supset ((s\\lor s)\\land s))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011011100111011 és 0011110001110011"]
          ["\\(\\{ ((\\lnot (r\\supset s)\\lor (r\\supset p))\\equiv q),\\lnot ((r\\lor \\lnot (p\\supset p))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0011100010001111 és 1101101111101110"]
          ["\\(\\{ (p\\land ((q\\supset s)\\lor ((p\\land s)\\lor s))),(\\lnot q\\supset (p\\supset (q\\equiv (s\\lor p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011110101 és 1101111110001111"]
          ["\\(\\{ (\\lnot (q\\supset ((r\\lor r)\\supset q))\\land s),(((r\\land r)\\land (r\\supset q))\\lor (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0001010000000000 és 0010001100110011"]
          ["\\(\\{ ((r\\supset r)\\equiv ((p\\lor (r\\land p))\\supset s)),\\lnot (r\\equiv ((r\\equiv r)\\land (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1111010000110101 és 0111011100110011"]
          ["\\(\\{ (((\\lnot q\\lor r)\\lor s)\\lor (r\\lor p)),\\lnot \\lnot ((s\\supset r)\\land (r\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1010111110001011"]
          ["\\(\\{ (((p\\lor p)\\equiv p)\\land \\lnot \\lnot q),((r\\land (p\\land q))\\equiv ((q\\equiv r)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 1111101000111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot s\\land ((p\\supset p)\\lor (s\\lor p))), ((q\\land q)\\lor ((r\\lor p)\\equiv \\lnot s)) \\}\\)"
         "\\(\\{ (((\\lnot p\\supset (q\\supset p))\\supset p)\\lor r), ((\\lnot q\\land \\lnot s)\\supset \\lnot s) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot (s\\equiv r)\\supset s)\\land s), ((p\\lor (q\\lor s))\\supset (\\lnot q\\supset p)) \\}\\)"
         "\\(\\{ (((r\\supset q)\\lor (p\\lor (r\\equiv s)))\\lor q), (p\\equiv (\\lnot q\\lor ((q\\lor r)\\land p))) \\}\\)"
         "\\(\\{ ((p\\supset s)\\lor (\\lnot (q\\land s)\\supset r)), (p\\supset ((s\\supset \\lnot s)\\equiv (q\\supset r))) \\}\\)"
         "\\(\\{ (r\\equiv \\lnot (p\\supset ((q\\lor q)\\lor s))), ((r\\supset r)\\lor (((p\\supset p)\\supset r)\\lor p)) \\}\\)"
         "\\(\\{ ((q\\equiv s)\\supset (p\\equiv \\lnot (q\\land q))), ((s\\land p)\\lor ((r\\land s)\\supset (q\\supset q))) \\}\\)"
         "\\(\\{ ((p\\land r)\\land (q\\equiv (\\lnot p\\land s))), \\lnot \\lnot ((s\\lor q)\\lor (p\\lor s)) \\}\\)"
         "\\(\\{ \\lnot (((r\\land r)\\land r)\\equiv (p\\land q)), (\\lnot s\\lor ((s\\supset (s\\equiv q))\\equiv s)) \\}\\)"
         "\\(\\{ ((s\\land r)\\supset ((p\\land (r\\equiv q))\\supset r)), (((s\\equiv ((q\\equiv s)\\land q))\\land r)\\supset r) \\}\\)"
         "\\(\\{ (s\\equiv \\lnot (\\lnot q\\lor (r\\lor s))), ((s\\supset q)\\lor ((q\\supset q)\\lor (s\\equiv p))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\supset (s\\equiv (((r\\equiv r)\\equiv r)\\equiv s))),(\\lnot (r\\land \\lnot s)\\land (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111011111100 és 0000001100000001"]
          ["\\(\\{ ((\\lnot s\\land (q\\land (r\\supset q)))\\lor s),\\lnot \\lnot ((r\\lor (r\\lor p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0101110101011111 és 0000000011111111"]
          ["\\(\\{ (\\lnot \\lnot (\\lnot q\\equiv p)\\land q),(((p\\lor q)\\lor \\lnot (q\\supset p))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000000 és 1100111100001111"]
          ["\\(\\{ (((\\lnot q\\lor r)\\supset \\lnot q)\\land q),((p\\supset r)\\lor ((p\\equiv s)\\land (s\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0000111000001100 és 1111011111110111"]
          ["\\(\\{ (((q\\lor s)\\land r)\\lor ((s\\land q)\\lor r)),((p\\supset p)\\equiv (\\lnot s\\land (q\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110111 és 0000000100000010"]
          ["\\(\\{ ((s\\land (r\\lor (p\\equiv (s\\equiv r))))\\land q),((p\\lor r)\\supset (s\\equiv (q\\land \\lnot r))) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000001 és 1111110101100110"]
          ["\\(\\{ ((p\\supset r)\\supset ((r\\land (s\\lor r))\\land p)),((q\\equiv q)\\lor ((s\\land r)\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0010111001111111 és 1100011000010000"]
          ["\\(\\{ ((s\\land (p\\equiv \\lnot p))\\equiv \\lnot r),((p\\lor (\\lnot (s\\land r)\\equiv r))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0011001101110011 és 1110111110001111"]
          ["\\(\\{ (\\lnot ((s\\equiv r)\\supset p)\\land (p\\equiv q)),((((p\\equiv r)\\supset (q\\land r))\\lor p)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1000111000000000 és 1110100111111111"]
          ["\\(\\{ \\lnot (((r\\equiv s)\\supset s)\\lor \\lnot r),((\\lnot (p\\lor (p\\supset p))\\equiv q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 0000111101110000"]
          ["\\(\\{ (\\lnot (q\\supset ((s\\land r)\\supset r))\\land p),((\\lnot r\\supset p)\\equiv ((q\\land p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0011110011011101"]
          ["\\(\\{ (\\lnot (p\\land p)\\lor ((s\\land q)\\lor s)),\\lnot (\\lnot (s\\equiv q)\\supset (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1101011111010101 és 0101011010010000"]
          ["\\(\\{ \\lnot ((r\\equiv p)\\land (q\\land (p\\lor q))),((s\\lor (r\\equiv p))\\supset (p\\land (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100101111111100 és 0010010110001000"]
          ["\\(\\{ ((r\\lor ((p\\lor s)\\supset q))\\supset (s\\lor q)),((r\\lor s)\\equiv \\lnot ((p\\equiv r)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0111111111011111 és 0100110011000100"]
          ["\\(\\{ ((\\lnot (s\\land r)\\land \\lnot s)\\lor s),(\\lnot ((s\\lor q)\\equiv (p\\lor p))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1101110111111111 és 1001111101011111"]
          ["\\(\\{ \\lnot (\\lnot r\\equiv (\\lnot q\\land q)),((r\\equiv (s\\lor p))\\equiv (\\lnot s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110011111001100 és 0110100000100110"]
          ["\\(\\{ ((r\\supset (s\\supset q))\\lor ((r\\lor r)\\equiv r)),\\lnot ((q\\lor \\lnot s)\\lor \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111111111101111 és 0001011000000000"]
          ["\\(\\{ (((r\\supset q)\\equiv \\lnot (p\\supset p))\\land r),\\lnot ((r\\equiv q)\\equiv \\lnot (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0011001000110000 és 1110101111010011"]
          ["\\(\\{ (\\lnot ((r\\equiv q)\\equiv (p\\lor q))\\lor q),((\\lnot \\lnot p\\supset q)\\equiv (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111011111 és 1100101101110000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((s\\land (r\\land p))\\supset \\lnot (p\\lor s)), ((((q\\equiv r)\\equiv p)\\equiv (r\\lor p))\\lor r) \\}\\)"
         "\\(\\{ (\\lnot q\\equiv (\\lnot (p\\equiv p)\\lor s)), ((((p\\land p)\\lor r)\\supset s)\\equiv (p\\supset p)) \\}\\)"
         "\\(\\{ ((p\\supset (q\\land s))\\lor (q\\supset (p\\equiv p))), (s\\supset \\lnot ((r\\equiv p)\\supset \\lnot r)) \\}\\)"
         "\\(\\{ (((q\\lor q)\\supset p)\\land ((q\\equiv r)\\supset p)), (\\lnot \\lnot p\\lor (q\\land (q\\lor q))) \\}\\)"
         "\\(\\{ ((\\lnot (s\\lor r)\\equiv p)\\equiv (r\\equiv r)), (q\\equiv ((r\\equiv q)\\land (q\\land (s\\lor p)))) \\}\\)"
         "\\(\\{ ((r\\land r)\\supset (\\lnot q\\land (s\\lor r))), ((((s\\equiv q)\\supset r)\\supset p)\\land (s\\lor s)) \\}\\)"
         "\\(\\{ (p\\lor (s\\land (\\lnot q\\supset \\lnot q))), (\\lnot (q\\land q)\\lor (q\\land (r\\equiv r))) \\}\\)"
         "\\(\\{ (\\lnot (s\\lor \\lnot (p\\land q))\\lor p), (\\lnot (p\\land s)\\supset \\lnot (s\\equiv q)) \\}\\)"
         "\\(\\{ ((q\\equiv r)\\lor ((q\\supset p)\\lor (q\\supset q))), ((s\\equiv q)\\equiv ((r\\land \\lnot s)\\land p)) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot p\\land (r\\supset q))\\equiv s), (\\lnot s\\lor (s\\lor ((s\\equiv r)\\equiv p))) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (r\\supset (p\\lor (s\\equiv (s\\equiv q)))),\\lnot ((p\\equiv \\lnot (s\\land r))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0011000100000000 és 1001110100000000"]
          ["\\(\\{ (((p\\equiv \\lnot s)\\equiv r)\\lor (s\\equiv s)),(((\\lnot r\\equiv (p\\land p))\\lor p)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1111111101100110 és 0011001111111111"]
          ["\\(\\{ (\\lnot ((q\\land r)\\lor p)\\supset (p\\lor q)),\\lnot (((q\\equiv r)\\land (q\\lor s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1000001000000001"]
          ["\\(\\{ (\\lnot \\lnot \\lnot p\\land \\lnot r),\\lnot \\lnot (\\lnot \\lnot q\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1100000010000000 és 1001000001100101"]
          ["\\(\\{ ((\\lnot \\lnot s\\supset p)\\supset (s\\supset q)),\\lnot \\lnot \\lnot (r\\equiv (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1101111110101111 és 0011000000110000"]
          ["\\(\\{ \\lnot ((q\\lor r)\\supset (p\\land (p\\equiv q))),\\lnot (p\\supset (r\\land ((s\\lor s)\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0011111100110000 és 0001111001001100"]
          ["\\(\\{ \\lnot ((\\lnot s\\equiv (q\\lor r))\\supset q),(\\lnot ((p\\land q)\\equiv r)\\lor (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0111011001100000 és 1111011111111111"]
          ["\\(\\{ ((q\\land p)\\lor ((q\\supset (s\\equiv r))\\lor s)),\\lnot (\\lnot ((p\\equiv r)\\land q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1100101100000011"]
          ["\\(\\{ (\\lnot ((p\\supset q)\\lor (r\\supset s))\\equiv r),((\\lnot r\\equiv ((p\\supset p)\\equiv q))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1101110111101100 és 0111110111111101"]
          ["\\(\\{ ((\\lnot (r\\lor p)\\land q)\\lor (q\\lor q)),(((q\\supset (r\\lor r))\\land p)\\supset (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1100011010111111"]
          ["\\(\\{ (\\lnot s\\equiv (r\\supset ((q\\equiv r)\\land s))),(((s\\land r)\\land r)\\equiv ((r\\lor s)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1010101001011000 és 0110011101100001"]
          ["\\(\\{ \\lnot (\\lnot q\\supset ((r\\equiv p)\\equiv p)),((p\\supset (((r\\supset r)\\lor s)\\lor q))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1110011011000000 és 1111111111111111"]
          ["\\(\\{ \\lnot (r\\equiv ((p\\supset s)\\supset (p\\equiv s))),(s\\land ((p\\equiv r)\\equiv (s\\supset (r\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 1010110001001100 és 0101010001010101"]
          ["\\(\\{ ((\\lnot (q\\land p)\\equiv r)\\lor (q\\supset q)),((((r\\lor s)\\equiv q)\\equiv (q\\lor r))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0101010100000101"]
          ["\\(\\{ ((p\\land q)\\land ((q\\lor q)\\lor (r\\equiv q))),(((s\\equiv q)\\lor r)\\supset (r\\supset (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001111 és 1110100111111111"]
          ["\\(\\{ ((\\lnot p\\land q)\\supset (s\\lor (s\\lor s))),((r\\land (q\\equiv s))\\lor (r\\equiv (p\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1101010101010101 és 0011010111100011"]
          ["\\(\\{ (s\\land ((\\lnot r\\lor q)\\land \\lnot s)),(((p\\supset p)\\lor s)\\lor (r\\supset (s\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000000 és 1111111111111111"]
          ["\\(\\{ ((s\\lor (p\\supset p))\\land ((q\\supset s)\\land q)),(((q\\supset \\lnot q)\\land \\lnot p)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000011100000101 és 0100010000000000"]
          ["\\(\\{ (\\lnot (p\\lor (p\\lor q))\\land (r\\equiv p)),\\lnot \\lnot \\lnot (p\\supset (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100100000000000 és 0001111000000000"]
          ["\\(\\{ ((r\\supset (((r\\lor s)\\equiv s)\\lor r))\\supset r),(p\\land ((\\lnot r\\land p)\\equiv (p\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0000000011100110"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot s\\lor \\lnot (q\\equiv (s\\lor s))), ((q\\lor r)\\supset (\\lnot p\\supset (r\\supset s))) \\}\\)"
         "\\(\\{ ((q\\lor (r\\equiv \\lnot (r\\lor s)))\\land p), ((q\\lor (p\\equiv (q\\equiv s)))\\land \\lnot s) \\}\\)"
         "\\(\\{ ((r\\lor p)\\lor ((\\lnot q\\equiv q)\\lor q)), (((r\\supset \\lnot r)\\land p)\\supset (q\\supset p)) \\}\\)"
         "\\(\\{ (\\lnot (s\\equiv p)\\land ((r\\land q)\\lor p)), (((q\\supset (q\\supset (s\\lor p)))\\equiv q)\\lor s) \\}\\)"
         "\\(\\{ (((p\\land p)\\supset (q\\equiv r))\\supset (q\\lor s)), (((p\\equiv p)\\lor (r\\land p))\\equiv (q\\land s)) \\}\\)"
         "\\(\\{ (\\lnot (q\\equiv (s\\lor r))\\equiv (s\\lor q)), (s\\equiv \\lnot ((q\\lor q)\\equiv (p\\supset p))) \\}\\)"
         "\\(\\{ (\\lnot p\\supset (p\\supset (r\\supset (s\\land p)))), ((r\\land \\lnot p)\\equiv ((s\\supset s)\\equiv s)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (s\\land p)\\supset \\lnot q), ((q\\land (s\\lor s))\\lor ((p\\equiv q)\\equiv p)) \\}\\)"
         "\\(\\{ ((r\\lor (p\\lor s))\\land (\\lnot q\\supset r)), ((\\lnot \\lnot q\\land (r\\lor q))\\lor r) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (p\\equiv r)\\equiv ((r\\lor r)\\land p)),((r\\lor s)\\supset ((p\\lor \\lnot q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110100100000000 és 1010111010001111"]
          ["\\(\\{ \\lnot (\\lnot \\lnot s\\supset (q\\land p)),\\lnot ((q\\land r)\\supset (p\\lor (s\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010000 és 0001110100000000"]
          ["\\(\\{ (((\\lnot r\\land r)\\lor s)\\supset (s\\lor q)),(((s\\land r)\\lor (p\\lor s))\\land (p\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0101010111010101"]
          ["\\(\\{ (\\lnot \\lnot q\\equiv (q\\supset (p\\supset s))),((p\\equiv r)\\equiv \\lnot ((r\\supset r)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0001101010000101 és 1101011000111100"]
          ["\\(\\{ ((\\lnot p\\equiv (r\\land \\lnot s))\\lor s),((r\\land q)\\land \\lnot ((r\\equiv r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011101 és 0000001000000000"]
          ["\\(\\{ ((r\\lor r)\\supset \\lnot ((r\\equiv p)\\equiv r)),\\lnot (((s\\lor p)\\lor p)\\supset \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1111101111001100 és 0101010101010101"]
          ["\\(\\{ (\\lnot (q\\lor \\lnot s)\\land (s\\lor s)),\\lnot ((r\\supset s)\\lor (r\\supset (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0101010001010000 és 0010011000000000"]
          ["\\(\\{ ((p\\supset (q\\equiv p))\\supset (s\\equiv \\lnot q)),((q\\supset \\lnot s)\\supset (q\\equiv (p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0101111101111010 és 0101111001100101"]
          ["\\(\\{ ((s\\lor (r\\land (p\\equiv (s\\lor s))))\\equiv r),(p\\equiv \\lnot (p\\equiv \\lnot (r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1011111110011001 és 1110010000100011"]
          ["\\(\\{ \\lnot (((q\\lor s)\\lor r)\\supset \\lnot p),\\lnot ((q\\land (q\\land q))\\lor (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0011111101111111 és 0000111000000000"]
          ["\\(\\{ (((p\\supset p)\\lor ((s\\supset p)\\lor s))\\equiv r),(((s\\land p)\\lor r)\\lor ((q\\equiv p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0011010010110011 és 1111111101111111"]
          ["\\(\\{ \\lnot (r\\equiv (\\lnot q\\land (s\\supset r))),((s\\supset (s\\supset p))\\lor (q\\supset (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1011110110000011 és 1111111111111111"]
          ["\\(\\{ ((\\lnot \\lnot p\\equiv (p\\supset p))\\land p),((s\\land ((q\\land q)\\equiv \\lnot q))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1100001100000000"]
          ["\\(\\{ \\lnot ((\\lnot p\\supset q)\\land (s\\lor q)),(s\\land (s\\land (\\lnot s\\equiv \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1100111010100000 és 0001000100000101"]
          ["\\(\\{ (q\\equiv (\\lnot (s\\equiv s)\\equiv (r\\land q))),(((r\\lor q)\\equiv s)\\land (s\\equiv (r\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0000100010001100 és 0001000000000000"]
          ["\\(\\{ (((q\\supset r)\\equiv r)\\supset (\\lnot p\\equiv q)),(\\lnot ((q\\land r)\\supset (s\\equiv s))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1100111111110000 és 0000000100000011"]
          ["\\(\\{ (s\\lor (q\\supset (\\lnot r\\equiv (p\\land q)))),((\\lnot q\\lor r)\\lor (r\\lor (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111101 és 1111111111110011"]
          ["\\(\\{ ((q\\equiv (r\\land ((s\\land s)\\equiv p)))\\lor s),(((s\\equiv (q\\lor q))\\lor q)\\equiv (q\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1101011111110101 és 0101101001011111"]
          ["\\(\\{ (((\\lnot p\\land r)\\supset (r\\equiv q))\\lor r),(\\lnot (s\\supset p)\\land ((r\\equiv q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1111011100110011 és 0100000100000000"]
          ["\\(\\{ (s\\lor (r\\supset (p\\land (s\\land (s\\land q))))),(q\\land \\lnot \\lnot ((s\\supset r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111011101 és 0000010100000001"]
          ["\\(\\{ (((s\\equiv r)\\lor (q\\lor r))\\supset (r\\land p)),\\lnot ((p\\equiv (s\\equiv (p\\lor s)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0110011001110011 és 1100011000101010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (s\\equiv (\\lnot (s\\equiv \\lnot s)\\land p)), (((p\\equiv s)\\lor \\lnot q)\\land (p\\lor q)) \\}\\)"
         "\\(\\{ ((r\\equiv p)\\lor ((p\\land (p\\equiv s))\\equiv q)), (q\\lor ((s\\land p)\\land (r\\lor (p\\supset s)))) \\}\\)"
         "\\(\\{ (((q\\lor p)\\lor q)\\land (q\\lor (p\\lor r))), (((q\\equiv (p\\supset s))\\land q)\\supset (q\\land p)) \\}\\)"
         "\\(\\{ ((s\\supset q)\\land ((p\\supset q)\\lor (s\\lor p))), (\\lnot r\\lor (p\\equiv (q\\lor (q\\equiv p)))) \\}\\)"
         "\\(\\{ ((r\\equiv s)\\lor ((s\\land p)\\supset (s\\supset q))), ((((p\\lor p)\\equiv p)\\supset s)\\equiv (s\\supset q)) \\}\\)"
         "\\(\\{ ((((s\\lor \\lnot q)\\lor p)\\land q)\\supset p), (s\\equiv \\lnot (((r\\supset q)\\supset s)\\supset r)) \\}\\)"
         "\\(\\{ ((((q\\supset r)\\land s)\\supset p)\\lor (p\\lor q)), \\lnot ((q\\lor s)\\supset \\lnot (p\\equiv q)) \\}\\)"
         "\\(\\{ (\\lnot s\\lor (r\\lor (r\\supset (r\\supset s)))), (\\lnot \\lnot s\\lor \\lnot (q\\lor q)) \\}\\)"
         "\\(\\{ ((\\lnot (r\\land s)\\equiv (p\\lor q))\\lor r), (\\lnot r\\equiv \\lnot (q\\supset (r\\land r))) \\}\\)"
         "\\(\\{ (\\lnot (p\\equiv s)\\supset (\\lnot p\\equiv r)), (((p\\supset r)\\supset q)\\equiv (p\\land (q\\supset p))) \\}\\)"
         "\\(\\{ ((s\\land q)\\lor \\lnot ((q\\equiv s)\\lor p)), ((r\\supset (\\lnot (q\\equiv p)\\supset s))\\supset q) \\}\\)"
         "\\(\\{ (q\\lor (r\\equiv \\lnot (s\\equiv (q\\supset r)))), ((r\\land (((q\\supset r)\\land s)\\lor r))\\lor p) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (\\lnot q\\supset \\lnot r)\\supset q),(s\\equiv \\lnot ((\\lnot r\\equiv r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001111 és 0100111010101010"]
          ["\\(\\{ ((((r\\land p)\\equiv (q\\equiv q))\\equiv q)\\lor r),(((r\\lor r)\\supset (p\\equiv q))\\land (s\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000000100000001"]
          ["\\(\\{ (((p\\lor p)\\equiv (s\\equiv s))\\land (q\\equiv q)),((s\\land (p\\land p))\\equiv ((s\\lor p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1010111001010101"]
          ["\\(\\{ (s\\equiv (((r\\supset r)\\supset s)\\land (r\\supset p))),((p\\supset (((r\\land p)\\equiv s)\\equiv p))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1110110000000000 és 0101010100010001"]
          ["\\(\\{ \\lnot ((q\\equiv s)\\supset (r\\equiv \\lnot p)),((r\\equiv ((r\\land r)\\equiv r))\\land (s\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1010011010100001 és 0000000001000100"]
          ["\\(\\{ ((q\\equiv (s\\land (s\\land r)))\\lor (p\\land q)),(r\\equiv \\lnot \\lnot \\lnot (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1101011111101111 és 0001000010000000"]
          ["\\(\\{ ((((p\\lor r)\\land p)\\lor q)\\land (s\\supset r)),(((s\\lor s)\\lor ((q\\land q)\\land p))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000111110111011 és 1001111110101111"]
          ["\\(\\{ ((p\\lor q)\\land ((q\\land s)\\land \\lnot p)),((p\\land r)\\land ((p\\supset (q\\equiv p))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 0000000000100001"]
          ["\\(\\{ ((s\\lor ((q\\lor r)\\equiv r))\\land (r\\supset s)),\\lnot ((((r\\supset q)\\land s)\\lor q)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1101110101011101 és 1100011001110000"]
          ["\\(\\{ (q\\land (\\lnot (p\\land (p\\supset s))\\lor r)),((((q\\equiv p)\\land (r\\land q))\\supset q)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000011100001011 és 0000111111111111"]
          ["\\(\\{ ((r\\supset q)\\supset (q\\land ((p\\equiv p)\\land s))),(p\\lor \\lnot ((r\\land p)\\supset (s\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0011011000110000 és 0001011011111111"]
          ["\\(\\{ ((\\lnot \\lnot r\\land q)\\land (s\\supset q)),(p\\equiv (((p\\lor s)\\equiv p)\\equiv (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 0110101011110011"]
          ["\\(\\{ ((s\\supset \\lnot s)\\land (s\\supset (r\\equiv q))),((q\\equiv (\\lnot s\\supset p))\\supset \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 1111101111111100"]
          ["\\(\\{ ((s\\lor r)\\equiv (r\\land ((q\\supset p)\\lor s))),(((((p\\equiv s)\\equiv r)\\equiv p)\\equiv p)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1011110001111011 és 1010111010011001"]
          ["\\(\\{ (\\lnot \\lnot r\\land (\\lnot q\\equiv r)),((s\\lor (s\\equiv s))\\lor (q\\supset (s\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0010000100110000 és 1111111111111101"]
          ["\\(\\{ (\\lnot \\lnot (q\\lor s)\\equiv (s\\lor r)),((q\\lor q)\\equiv (p\\land (s\\supset (q\\supset r)))) \\}\\)" "az igazságtáblák főoszlopai: 1111001000110111 és 1100111000001011"]
          ["\\(\\{ (\\lnot (s\\land (\\lnot r\\supset s))\\equiv p),(q\\land \\lnot \\lnot (r\\equiv (p\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101010 és 0000111100000011"]
          ["\\(\\{ (s\\equiv (q\\supset ((p\\lor s)\\equiv (q\\equiv q)))),(s\\supset (q\\equiv \\lnot ((r\\land r)\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0100100011011010 és 1111110110101010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((s\\land s)\\equiv (r\\supset s))\\lor (p\\equiv q)), (r\\supset (\\lnot \\lnot (s\\lor p)\\equiv p)) \\}\\)"
         "\\(\\{ ((q\\supset (s\\equiv p))\\lor ((q\\supset r)\\equiv r)), (\\lnot (p\\supset (q\\equiv (s\\lor s)))\\equiv q) \\}\\)"
         "\\(\\{ ((r\\equiv (\\lnot p\\lor q))\\equiv (r\\supset r)), ((r\\lor (r\\equiv (s\\lor p)))\\land (p\\lor r)) \\}\\)"
         "\\(\\{ ((p\\equiv q)\\lor ((s\\lor (s\\equiv q))\\equiv p)), (((s\\supset r)\\land (r\\equiv (r\\equiv s)))\\lor r) \\}\\)"
         "\\(\\{ (s\\lor \\lnot ((r\\equiv q)\\equiv \\lnot r)), ((p\\land r)\\land ((\\lnot q\\lor s)\\supset r)) \\}\\)"
         "\\(\\{ (((p\\supset s)\\supset \\lnot \\lnot p)\\supset r), (((s\\lor (r\\lor s))\\land r)\\equiv (r\\supset p)) \\}\\)"
         "\\(\\{ (((p\\lor r)\\equiv \\lnot \\lnot p)\\equiv q), ((q\\supset \\lnot (q\\equiv s))\\lor (s\\supset q)) \\}\\)"
         "\\(\\{ (((s\\equiv s)\\equiv s)\\land (r\\land (p\\supset r))), (p\\lor ((r\\lor (q\\land r))\\supset (r\\equiv r))) \\}\\)"
         "\\(\\{ (((\\lnot q\\lor r)\\equiv p)\\equiv (r\\lor q)), ((s\\lor ((q\\lor p)\\land \\lnot r))\\lor q) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (((q\\supset r)\\supset (s\\equiv r))\\lor r),((p\\equiv (r\\supset s))\\supset (s\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0110011001000000 és 1111110101110010"]
          ["\\(\\{ (r\\supset \\lnot (s\\lor (s\\supset (s\\equiv p)))),\\lnot ((q\\supset ((p\\supset s)\\lor p))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1111110111001100 és 1101000011110000"]
          ["\\(\\{ (\\lnot \\lnot ((s\\equiv r)\\lor q)\\equiv p),((q\\land q)\\equiv (\\lnot r\\land (q\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0110011010011111 és 1000000001111100"]
          ["\\(\\{ (((r\\lor p)\\lor \\lnot r)\\supset (s\\equiv r)),\\lnot ((\\lnot (r\\lor r)\\equiv s)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1011111110011001 és 0110011001100000"]
          ["\\(\\{ ((q\\supset ((p\\equiv s)\\equiv (r\\lor p)))\\land s),((s\\supset \\lnot ((q\\lor q)\\supset s))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000111100001010"]
          ["\\(\\{ ((s\\equiv r)\\land \\lnot ((q\\equiv s)\\supset r)),((q\\lor r)\\equiv \\lnot ((p\\land q)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1010000110000000 és 0010101100110000"]
          ["\\(\\{ ((p\\equiv r)\\lor (r\\equiv (s\\lor (q\\land q)))),\\lnot (r\\land (s\\equiv ((p\\land s)\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1111110101110011 és 1100010000000000"]
          ["\\(\\{ ((((s\\equiv s)\\land r)\\land r)\\land (q\\lor q)),(q\\land ((q\\supset p)\\lor ((p\\land s)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000000 és 0000111100001111"]
          ["\\(\\{ \\lnot ((\\lnot p\\land r)\\land (q\\lor s)),((s\\supset ((p\\land \\lnot p)\\supset s))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000000 és 1101111111111111"]
          ["\\(\\{ (\\lnot ((r\\equiv r)\\lor p)\\equiv (p\\equiv r)),(r\\supset ((\\lnot q\\supset p)\\lor \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0011001101001100 és 1110111111111111"]
          ["\\(\\{ (((q\\supset p)\\land (s\\land q))\\land \\lnot p),((\\lnot (p\\supset \\lnot q)\\supset s)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 0101010101010101"]
          ["\\(\\{ ((q\\equiv ((q\\equiv s)\\land (r\\equiv q)))\\equiv p),((s\\equiv ((r\\lor q)\\supset s))\\land \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1000111111010001 és 0110100011001100"]
          ["\\(\\{ (\\lnot \\lnot p\\land (\\lnot r\\lor p)),(\\lnot \\lnot \\lnot (r\\equiv r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1101011101010101"]
          ["\\(\\{ (((q\\supset q)\\lor (p\\supset q))\\lor (p\\supset q)),((p\\equiv \\lnot r)\\land ((q\\land s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0000000111001100"]
          ["\\(\\{ (q\\supset (\\lnot (p\\lor p)\\equiv (p\\lor q))),(((q\\equiv (q\\supset p))\\lor r)\\lor (r\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111110000 és 1111011100111111"]
          ["\\(\\{ (q\\equiv ((((r\\equiv s)\\supset p)\\lor q)\\supset q)),(((p\\lor q)\\supset s)\\lor (p\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0110101000000000 és 1101111111111111"]
          ["\\(\\{ (r\\land ((p\\supset q)\\land \\lnot (s\\supset s))),(p\\supset (((s\\equiv r)\\supset (r\\lor s))\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000000 és 1111111111111111"]
          ["\\(\\{ \\lnot (\\lnot q\\lor (s\\equiv (s\\equiv s))),(((p\\supset (s\\land p))\\lor \\lnot q)\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000101 és 1101111111110101"]
          ["\\(\\{ ((s\\equiv (\\lnot s\\lor (q\\equiv r)))\\lor q),(\\lnot r\\equiv ((\\lnot q\\equiv s)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0111111110001111 és 1010100011101001"]
          ["\\(\\{ ((r\\equiv s)\\equiv ((q\\supset (q\\supset q))\\supset p)),\\lnot \\lnot \\lnot (r\\equiv (s\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0110101110011001 és 0110011011001100"]
          ["\\(\\{ (\\lnot p\\equiv \\lnot (p\\supset (s\\supset r))),(((q\\supset (r\\supset q))\\equiv (q\\supset r))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0011101010111011 és 0100111010100001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((((s\\equiv r)\\land (p\\equiv s))\\supset q)\\supset p), (((s\\equiv (q\\equiv q))\\land r)\\supset (p\\supset q)) \\}\\)"
         "\\(\\{ (((r\\supset (s\\lor q))\\supset (p\\supset r))\\lor q), \\lnot \\lnot (s\\supset ((r\\land s)\\lor q)) \\}\\)"
         "\\(\\{ (q\\lor \\lnot ((q\\land q)\\supset (p\\equiv r))), (\\lnot \\lnot (r\\supset p)\\lor (p\\lor q)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (p\\land (q\\equiv r))\\land q), ((s\\equiv r)\\land (p\\lor (p\\supset \\lnot s))) \\}\\)"
         "\\(\\{ (s\\supset ((p\\land \\lnot r)\\lor (s\\land q))), (((q\\land s)\\supset (s\\land (r\\lor p)))\\equiv s) \\}\\)"
         "\\(\\{ ((((q\\lor p)\\equiv r)\\supset q)\\supset (p\\lor p)), ((r\\lor q)\\lor (q\\supset ((s\\supset q)\\equiv p))) \\}\\)"
         "\\(\\{ (((\\lnot r\\lor p)\\lor (r\\supset p))\\land r), ((r\\equiv r)\\supset (s\\lor \\lnot (s\\equiv r))) \\}\\)"
         "\\(\\{ ((\\lnot (s\\land q)\\lor (r\\supset p))\\land r), (\\lnot \\lnot ((q\\land s)\\equiv q)\\land q) \\}\\)"
         "\\(\\{ ((s\\lor (\\lnot p\\equiv (p\\supset p)))\\land p), (\\lnot (r\\supset (r\\lor r))\\supset (q\\land p)) \\}\\)"
         "\\(\\{ (s\\lor (((p\\supset r)\\land (p\\supset q))\\land p)), (((q\\land s)\\land (s\\lor q))\\equiv (r\\lor p)) \\}\\)"
         "\\(\\{ ((s\\land p)\\supset ((q\\lor (r\\supset p))\\equiv q)), (((r\\equiv r)\\equiv p)\\supset (r\\land (r\\lor r))) \\}\\)"
         "\\(\\{ (((s\\land p)\\supset (r\\lor s))\\equiv (p\\lor q)), ((((s\\land p)\\equiv p)\\equiv r)\\lor (q\\equiv q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (\\lnot (p\\equiv r)\\supset (q\\lor p)),(s\\lor \\lnot ((p\\lor p)\\equiv (s\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0011011000000000 és 1101011111111111"]
          ["\\(\\{ (((\\lnot (r\\lor r)\\supset q)\\land r)\\lor p),(((s\\land (p\\equiv p))\\equiv (p\\lor r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0011001111111111 és 0000111000000000"]
          ["\\(\\{ (((q\\lor s)\\land (\\lnot q\\land p))\\land s),(((s\\equiv (s\\lor p))\\lor p)\\land (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010000 és 0000000011111111"]
          ["\\(\\{ (r\\equiv (\\lnot r\\land ((p\\land r)\\lor p))),\\lnot ((r\\lor q)\\equiv \\lnot (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100100000000 és 0000110011110011"]
          ["\\(\\{ \\lnot (r\\lor ((q\\equiv r)\\land (p\\land r))),(((s\\lor q)\\equiv r)\\supset \\lnot (p\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110100111001100 és 0110111001111100"]
          ["\\(\\{ \\lnot ((q\\supset (q\\land (p\\equiv q)))\\equiv p),((\\lnot r\\equiv \\lnot r)\\equiv (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 0000000010000000"]
          ["\\(\\{ \\lnot ((p\\equiv p)\\supset (s\\equiv (s\\equiv q))),(\\lnot (p\\land s)\\supset \\lnot (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100010100110000 és 0011001111011101"]
          ["\\(\\{ \\lnot ((r\\land ((s\\land s)\\land s))\\land s),(q\\equiv (\\lnot p\\lor (\\lnot p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1101101111101110 és 0000101100001111"]
          ["\\(\\{ (\\lnot q\\equiv ((s\\equiv (s\\supset s))\\land q)),\\lnot ((p\\lor r)\\supset \\lnot (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001010001010 és 0011011001110111"]
          ["\\(\\{ (((q\\supset \\lnot q)\\lor r)\\lor (s\\supset p)),(((p\\supset p)\\equiv r)\\equiv \\lnot (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1100010110000000"]
          ["\\(\\{ (\\lnot ((p\\land r)\\equiv p)\\lor (q\\lor r)),(q\\supset ((q\\land \\lnot r)\\equiv (q\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0011111111111111 és 1101111111111100"]
          ["\\(\\{ \\lnot (((\\lnot s\\land p)\\supset p)\\land p),((s\\land s)\\lor \\lnot (q\\equiv (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0111110111110101"]
          ["\\(\\{ (((r\\supset q)\\equiv \\lnot (q\\supset r))\\land q),\\lnot ((p\\supset s)\\supset (s\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0000101100001100 és 1001011110000101"]
          ["\\(\\{ (((p\\supset p)\\land q)\\equiv (r\\supset \\lnot r)),(q\\land ((\\lnot (q\\lor s)\\supset s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0011011000111100 és 0000111100001111"]
          ["\\(\\{ \\lnot ((((q\\land s)\\land q)\\land r)\\equiv s),((q\\lor r)\\lor (((q\\land s)\\land r)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010001010100 és 1111111111111111"]
          ["\\(\\{ ((r\\supset ((r\\equiv p)\\equiv \\lnot r))\\equiv r),(((q\\equiv p)\\land ((q\\supset p)\\land r))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0001010010000000 és 0000001011111111"]
          ["\\(\\{ (((q\\supset q)\\lor r)\\lor ((r\\equiv q)\\land s)),((q\\equiv r)\\land ((r\\land (r\\equiv r))\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1100010000100000"]
          ["\\(\\{ ((s\\land r)\\equiv (\\lnot \\lnot s\\supset p)),((r\\land q)\\land \\lnot ((q\\lor r)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0100110010010001 és 0000001100000000"]
]}]