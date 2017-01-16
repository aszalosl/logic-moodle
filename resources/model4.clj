[{:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot ((r\\lor q)\\land p)\\lor (s\\land r)), ((q\\lor r)\\equiv (p\\land ((s\\land s)\\land s))) \\}\\)"
         "\\(\\{ ((q\\land s)\\supset (q\\lor \\lnot (s\\supset p))), ((r\\land ((q\\supset (q\\lor s))\\land p))\\supset s) \\}\\)"
         "\\(\\{ (\\lnot ((p\\equiv p)\\supset p)\\equiv \\lnot s), (q\\equiv ((r\\land q)\\equiv (\\lnot p\\lor p))) \\}\\)"
         "\\(\\{ \\lnot ((r\\land s)\\land (q\\equiv (r\\equiv r))), ((q\\land (r\\land r))\\supset (s\\land (p\\lor s))) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot s\\land s)\\supset \\lnot s), \\lnot (r\\land (r\\land (p\\supset (s\\supset r)))) \\}\\)"
         "\\(\\{ (\\lnot ((q\\supset r)\\equiv r)\\lor (q\\land p)), (((q\\lor ((p\\supset p)\\lor q))\\equiv r)\\supset r) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (s\\lor s)\\equiv \\lnot \\lnot s),\\lnot ((r\\equiv p)\\lor (s\\land (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0000101010000000 és 0011010111001000"]
          ["\\(\\{ ((s\\supset (((r\\land r)\\supset p)\\lor r))\\equiv r),\\lnot (((p\\equiv r)\\supset s)\\supset (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000110010110011 és 0110011001000100"]
          ["\\(\\{ ((((r\\land r)\\supset p)\\lor r)\\land (s\\land p)),((((r\\land q)\\lor q)\\supset (q\\equiv r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010101 és 0000111000000011"]
          ["\\(\\{ (((p\\supset r)\\supset ((p\\supset s)\\equiv q))\\land s),((\\lnot s\\equiv r)\\equiv ((r\\lor p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0001010001000101 és 1011111111001100"]
          ["\\(\\{ ((r\\land p)\\lor (\\lnot (q\\land s)\\equiv s)),((r\\equiv ((s\\equiv s)\\land \\lnot q))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0101111101110011 és 0111110111011101"]
          ["\\(\\{ (p\\supset \\lnot \\lnot ((q\\equiv s)\\equiv s)),((r\\equiv ((p\\equiv q)\\supset p))\\supset (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100011111001111 és 0111110111111111"]
          ["\\(\\{ ((r\\supset (s\\lor (s\\supset q)))\\lor (s\\supset p)),(p\\equiv (r\\equiv (s\\land ((s\\land p)\\supset q)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0111011010001001"]
          ["\\(\\{ (q\\land (q\\lor ((r\\lor r)\\supset (s\\lor q)))),\\lnot (((q\\supset q)\\lor s)\\land \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0101010101010101"]
          ["\\(\\{ ((s\\land \\lnot r)\\lor ((s\\lor r)\\lor q)),((r\\land (r\\lor (s\\equiv q)))\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0111111101111111 és 0000001000110000"]
          ["\\(\\{ ((((p\\lor r)\\supset p)\\lor \\lnot r)\\land p),(((q\\supset s)\\equiv r)\\land \\lnot (s\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0001010010100000"]
          ["\\(\\{ ((r\\lor q)\\equiv ((r\\land (p\\land r))\\supset s)),(s\\supset (((r\\equiv (r\\equiv p))\\equiv p)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001001111101 és 1001110111101010"]
          ["\\(\\{ (\\lnot (s\\lor p)\\lor \\lnot (p\\land s)),((r\\supset s)\\equiv (s\\equiv \\lnot (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1101111101101010 és 0001010010000000"]
          ["\\(\\{ ((r\\land p)\\lor (r\\equiv (s\\land \\lnot s))),(r\\equiv ((r\\land q)\\supset (r\\lor (q\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000110010110011"]
          ["\\(\\{ (p\\equiv ((q\\lor r)\\lor ((q\\lor s)\\land r))),(r\\land \\lnot (q\\supset \\lnot \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1110011000111111 és 0000001100000000"]
          ["\\(\\{ ((s\\land q)\\equiv (s\\supset \\lnot (s\\equiv p))),(q\\supset \\lnot \\lnot (r\\lor (r\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0001001011010000 és 1111111111110011"]
          ["\\(\\{ (((q\\land p)\\land (r\\lor s))\\land (r\\equiv r)),\\lnot (((s\\land r)\\supset (q\\equiv p))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1000101010111010"]
          ["\\(\\{ \\lnot \\lnot ((r\\land r)\\equiv \\lnot r),(q\\equiv (((p\\lor r)\\lor q)\\supset (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0001000010000000 és 0011001111000011"]
          ["\\(\\{ ((s\\equiv q)\\land (\\lnot (q\\equiv s)\\lor p)),\\lnot ((q\\supset (s\\land r))\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0001000001100101 és 0001111101110001"]
          ["\\(\\{ \\lnot ((r\\equiv q)\\supset \\lnot (s\\land s)),(r\\lor ((s\\equiv (s\\land q))\\equiv (p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0110010101000001 és 1111001111110111"]
          ["\\(\\{ (s\\lor (q\\land ((r\\equiv p)\\lor (r\\supset p)))),(((q\\lor q)\\land s)\\equiv (q\\supset (s\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0101110101011111 és 0000100100001111"]
          ["\\(\\{ (r\\land ((p\\equiv (p\\lor r))\\land \\lnot q)),((q\\land \\lnot (r\\supset s))\\lor (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110000 és 1100111100001111"]
          ["\\(\\{ (((r\\supset q)\\equiv \\lnot (r\\equiv s))\\supset r),(\\lnot (q\\supset r)\\land (q\\equiv (q\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1011101110111011 és 0000010000001000"]
          ["\\(\\{ ((q\\equiv ((p\\lor (s\\supset r))\\lor r))\\land r),(((s\\supset (q\\supset q))\\supset \\lnot s)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0010001000000011 és 0000000010101010"]
          ["\\(\\{ (r\\lor ((\\lnot q\\equiv s)\\equiv (s\\lor s))),(\\lnot (((p\\lor s)\\equiv q)\\equiv q)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1111001100111011 és 0000100010101010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot \\lnot ((q\\land r)\\supset (q\\equiv p)), \\lnot ((p\\land \\lnot r)\\land (q\\land p)) \\}\\)"
         "\\(\\{ (((p\\land q)\\lor s)\\lor (q\\lor (q\\supset q))), ((p\\supset r)\\land (p\\equiv \\lnot (r\\supset q))) \\}\\)"
         "\\(\\{ (s\\land ((q\\land (r\\supset p))\\lor (r\\equiv p))), ((s\\lor s)\\lor ((r\\lor r)\\equiv (p\\supset s))) \\}\\)"
         "\\(\\{ (s\\lor ((q\\land p)\\lor ((s\\equiv r)\\equiv r))), (\\lnot ((p\\supset s)\\lor r)\\equiv (r\\land s)) \\}\\)"
         "\\(\\{ \\lnot (((r\\lor r)\\lor p)\\land (p\\equiv q)), ((q\\land (s\\supset s))\\supset (r\\land (p\\lor p))) \\}\\)"
         "\\(\\{ (r\\supset (s\\land ((p\\lor q)\\land (r\\supset r)))), (\\lnot ((q\\supset p)\\supset r)\\equiv \\lnot q) \\}\\)"
         "\\(\\{ (((\\lnot r\\equiv q)\\supset r)\\supset \\lnot p), (p\\supset (((q\\land r)\\supset r)\\lor (s\\equiv p))) \\}\\)"
         "\\(\\{ ((s\\land \\lnot r)\\supset (s\\land \\lnot q)), (\\lnot ((p\\equiv q)\\land q)\\lor (q\\equiv q)) \\}\\)"
         "\\(\\{ (\\lnot (r\\equiv p)\\equiv ((r\\supset p)\\supset q)), ((p\\lor r)\\lor ((r\\lor p)\\lor (q\\equiv p))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((((p\\land r)\\lor (r\\land s))\\lor q)\\equiv r),((p\\equiv r)\\supset ((q\\supset s)\\land (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1111010000001011 és 0011111111001101"]
          ["\\(\\{ (p\\lor \\lnot (((q\\supset p)\\lor q)\\equiv p)),(((p\\land (r\\land p))\\supset (q\\lor r))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0010011000111111"]
          ["\\(\\{ (\\lnot (r\\lor (q\\land s))\\land (s\\equiv r)),(q\\supset ((s\\supset \\lnot p)\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1010111010001000 és 1100111011110000"]
          ["\\(\\{ (((p\\equiv (\\lnot s\\land q))\\lor r)\\equiv r),((p\\lor ((q\\equiv r)\\land s))\\supset (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000110000001111 és 1100111010001111"]
          ["\\(\\{ ((r\\equiv ((q\\land p)\\land (q\\equiv s)))\\land p),\\lnot ((s\\equiv s)\\equiv (q\\supset (r\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011001001 és 0001100111110001"]
          ["\\(\\{ (r\\supset \\lnot (((s\\land r)\\equiv q)\\land q)),\\lnot ((p\\equiv p)\\land (s\\supset \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100111111110 és 0000001000000000"]
          ["\\(\\{ ((q\\supset r)\\lor (\\lnot (q\\lor r)\\equiv s)),((s\\equiv \\lnot \\lnot p)\\lor (p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111011 és 1001110111111111"]
          ["\\(\\{ ((p\\equiv \\lnot (s\\land s))\\equiv (p\\lor q)),(((p\\supset (r\\land s))\\lor p)\\land (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1001000001101010 és 1101010111011101"]
          ["\\(\\{ (p\\equiv (q\\supset (((s\\land s)\\supset q)\\equiv q))),(((p\\land ((q\\equiv s)\\supset q))\\equiv p)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0001011111111111 és 1111011111111111"]
          ["\\(\\{ (\\lnot (r\\lor (s\\lor q))\\lor (q\\land q)),((q\\land (q\\supset \\lnot s))\\lor (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1010111110001111 és 0000111101011111"]
          ["\\(\\{ (((s\\land s)\\lor s)\\supset \\lnot \\lnot q),\\lnot ((p\\supset (p\\supset p))\\land (s\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1001111110101111 és 1000000001001000"]
          ["\\(\\{ ((s\\lor s)\\equiv ((r\\land (s\\equiv r))\\supset r)),((((s\\supset p)\\lor p)\\lor (s\\supset q))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 0001010101010101"]
          ["\\(\\{ ((\\lnot p\\land \\lnot \\lnot q)\\supset p),(s\\supset ((s\\supset ((q\\land p)\\equiv s))\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1100000011111111 és 1011111110111111"]
          ["\\(\\{ ((r\\supset r)\\land (\\lnot s\\lor (s\\lor p))),(((p\\supset s)\\land (q\\equiv s))\\lor (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1101100111111111 és 1001001101000111"]
          ["\\(\\{ ((s\\supset r)\\land (q\\land \\lnot (s\\equiv q))),((r\\lor p)\\equiv \\lnot ((q\\supset q)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000101000001010 és 1110010100000000"]
          ["\\(\\{ (((q\\land r)\\land \\lnot s)\\lor (s\\supset p)),((p\\equiv q)\\equiv (r\\lor (r\\lor (r\\lor p)))) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111111 és 0010010100001111"]
          ["\\(\\{ \\lnot (r\\land (((q\\land p)\\land r)\\equiv p)),((q\\supset q)\\equiv (\\lnot (r\\equiv r)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000010 és 0000111000000000"]
          ["\\(\\{ \\lnot (\\lnot (r\\supset q)\\supset \\lnot p),(r\\supset ((q\\land q)\\land \\lnot (q\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0011011000110000 és 1110111111001100"]
          ["\\(\\{ ((s\\lor (s\\land r))\\land (q\\lor (p\\lor r))),(q\\land \\lnot (s\\land (p\\equiv (s\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0001010101010101 és 0000110100001010"]
          ["\\(\\{ (((p\\lor r)\\lor \\lnot q)\\land (q\\supset r)),((r\\land \\lnot \\lnot r)\\land (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0000001000110011"]
          ["\\(\\{ ((r\\equiv p)\\equiv (s\\supset \\lnot (p\\supset r))),(\\lnot (p\\lor (s\\supset r))\\land (s\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1001111100100010 és 0100011000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((s\\land (p\\land (\\lnot r\\land r)))\\lor r), (\\lnot \\lnot (r\\lor (q\\land q))\\supset q) \\}\\)"
         "\\(\\{ ((s\\supset p)\\supset \\lnot (r\\lor \\lnot q)), ((q\\lor \\lnot r)\\lor ((r\\supset p)\\land q)) \\}\\)"
         "\\(\\{ ((p\\equiv r)\\lor (((p\\supset q)\\land p)\\supset s)), ((\\lnot (r\\equiv p)\\supset p)\\lor \\lnot p) \\}\\)"
         "\\(\\{ ((q\\equiv r)\\lor ((q\\land (p\\land p))\\supset q)), (((r\\lor p)\\land (r\\equiv (r\\land s)))\\lor q) \\}\\)"
         "\\(\\{ (\\lnot (p\\lor (r\\equiv s))\\equiv (q\\lor s)), (s\\equiv ((p\\supset ((q\\supset r)\\equiv s))\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((\\lnot (s\\lor s)\\equiv r)\\supset (p\\equiv r)),\\lnot (((q\\supset p)\\land s)\\lor (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111110111011 és 1000111010100000"]
          ["\\(\\{ (((r\\lor s)\\equiv p)\\equiv ((r\\equiv s)\\equiv p)),(r\\supset ((r\\lor q)\\equiv \\lnot (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000101010010001 és 1110101111001100"]
          ["\\(\\{ ((\\lnot s\\equiv (s\\lor s))\\land (r\\lor q)),(r\\supset ((s\\supset q)\\lor (q\\equiv (q\\land p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000101000000000 és 1111111111111111"]
          ["\\(\\{ (\\lnot p\\land \\lnot (q\\supset (q\\lor s))),\\lnot (((p\\equiv r)\\lor p)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 0010111101111111"]
          ["\\(\\{ ((r\\lor (r\\lor p))\\land (p\\land (p\\land r))),(((r\\lor p)\\equiv \\lnot \\lnot s)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 0110101001100101"]
          ["\\(\\{ ((\\lnot r\\equiv r)\\equiv (\\lnot s\\equiv q)),((q\\land ((q\\equiv s)\\land q))\\lor (p\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1000101001100101 és 1001110101010101"]
          ["\\(\\{ (((s\\supset p)\\land q)\\supset \\lnot (p\\equiv p)),((r\\land (((s\\supset p)\\equiv q)\\supset q))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1100110111110000 és 1101111111001111"]
          ["\\(\\{ \\lnot (((p\\supset q)\\land s)\\supset (r\\equiv q)),((p\\equiv (s\\land \\lnot s))\\land (s\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0011111000000100 és 0101010100000000"]
          ["\\(\\{ ((((r\\equiv p)\\supset q)\\land (r\\land r))\\supset q),(((s\\land (q\\supset p))\\land (r\\lor p))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1001110111111111"]
          ["\\(\\{ (\\lnot (p\\equiv (r\\equiv p))\\land (p\\equiv r)),\\lnot ((((p\\land q)\\land r)\\land r)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1110100100000000 és 0101010101010110"]
          ["\\(\\{ (\\lnot s\\supset (\\lnot r\\land (q\\lor q))),((s\\land \\lnot (p\\equiv q))\\supset (p\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0101110101011101 és 1101011111111111"]
          ["\\(\\{ \\lnot (q\\lor (\\lnot s\\land (r\\land q))),((r\\equiv p)\\equiv (\\lnot q\\lor (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1110111100111001"]
          ["\\(\\{ (((s\\equiv q)\\equiv s)\\supset ((r\\equiv p)\\supset s)),((q\\lor s)\\supset (\\lnot p\\lor (q\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111101 és 1101111110101111"]
          ["\\(\\{ (r\\land (\\lnot q\\lor ((r\\lor r)\\supset r))),\\lnot (((s\\land (r\\lor s))\\land s)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1001110100000000"]
          ["\\(\\{ ((p\\equiv p)\\supset ((p\\supset (p\\supset p))\\equiv r)),(s\\land (p\\land (\\lnot (p\\supset r)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0010110100110011 és 0000000000000000"]
          ["\\(\\{ ((\\lnot q\\land r)\\lor ((p\\land p)\\land p)),(s\\land ((q\\land r)\\lor (r\\lor (r\\equiv r)))) \\}\\)" "az igazságtáblák főoszlopai: 0000001011111111 és 0101010100010001"]
          ["\\(\\{ \\lnot (((r\\supset p)\\equiv (r\\supset p))\\land r),((s\\supset (q\\lor q))\\supset ((s\\equiv q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000000 és 0101011001010101"]
          ["\\(\\{ ((\\lnot ((s\\equiv p)\\lor q)\\equiv r)\\lor r),\\lnot (q\\land (q\\lor (\\lnot s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1011111101111111 és 1100111011110000"]
          ["\\(\\{ \\lnot \\lnot \\lnot \\lnot \\lnot q,\\lnot (r\\land ((r\\supset r)\\supset \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1111100111001111"]
          ["\\(\\{ (\\lnot (\\lnot (p\\equiv p)\\equiv r)\\lor q),(((r\\land q)\\lor q)\\lor \\lnot (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0011111100111111 és 0101111100001111"]
          ["\\(\\{ (((s\\lor r)\\land (r\\supset (q\\equiv q)))\\supset r),\\lnot (p\\land ((p\\supset \\lnot p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 1100011011001100"]
          ["\\(\\{ \\lnot (r\\equiv (\\lnot (p\\land s)\\lor p)),\\lnot \\lnot \\lnot (p\\land (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1111010111001100 és 1100011001011010"]
          ["\\(\\{ (((p\\land r)\\land q)\\lor (p\\lor (r\\supset s))),((p\\equiv (p\\equiv p))\\land (q\\lor (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0000000000000000"]
          ["\\(\\{ ((r\\lor s)\\lor (s\\land (s\\equiv (r\\land p)))),(((q\\equiv p)\\equiv q)\\supset ((s\\lor q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101110111 és 1101011111110101"]
          ["\\(\\{ (q\\supset (\\lnot ((q\\equiv p)\\land r)\\lor s)),(\\lnot \\lnot p\\supset ((q\\lor r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110111 és 1111011011010101"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((r\\supset (r\\lor p))\\land (r\\lor q))\\equiv s), ((((s\\lor s)\\land p)\\lor (q\\lor q))\\supset s) \\}\\)"
         "\\(\\{ ((q\\land (p\\lor q))\\lor (r\\land (s\\supset q))), (((r\\land q)\\equiv q)\\equiv ((s\\equiv q)\\supset p)) \\}\\)"
         "\\(\\{ (((p\\land p)\\lor r)\\equiv (p\\equiv (s\\equiv p))), (r\\supset (\\lnot s\\lor (s\\equiv \\lnot r))) \\}\\)"
         "\\(\\{ \\lnot (((p\\equiv (r\\supset p))\\land s)\\land s), (s\\equiv (((p\\equiv \\lnot p)\\land q)\\lor p)) \\}\\)"
         "\\(\\{ (((s\\lor r)\\lor q)\\lor ((r\\equiv r)\\equiv q)), (\\lnot (s\\supset \\lnot (s\\land p))\\lor q) \\}\\)"
         "\\(\\{ ((q\\supset p)\\equiv ((s\\supset s)\\supset (r\\land q))), (((r\\lor (p\\supset q))\\equiv s)\\lor (p\\supset q)) \\}\\)"
         "\\(\\{ ((s\\supset (p\\land (s\\land r)))\\equiv \\lnot p), (((\\lnot q\\supset \\lnot r)\\lor q)\\lor r) \\}\\)"
         "\\(\\{ ((q\\land ((s\\land (s\\supset q))\\equiv s))\\equiv s), (\\lnot (p\\supset (s\\lor r))\\equiv (s\\land p)) \\}\\)"
         "\\(\\{ (p\\equiv ((r\\lor (r\\lor s))\\equiv (q\\lor q))), (r\\land ((\\lnot q\\land (s\\lor q))\\lor r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\land (s\\supset ((\\lnot s\\equiv s)\\lor q))),\\lnot ((s\\supset r)\\supset (s\\land \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1011111010111011"]
          ["\\(\\{ (((\\lnot p\\lor r)\\supset q)\\supset (p\\lor r)),((r\\lor (q\\land p))\\land (q\\lor (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111111 és 0010001100101111"]
          ["\\(\\{ ((p\\supset (p\\equiv ((s\\lor s)\\equiv s)))\\land p),(((p\\land s)\\land r)\\supset ((p\\equiv s)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000000 és 1101111101011111"]
          ["\\(\\{ ((p\\land s)\\supset ((q\\equiv p)\\land \\lnot r)),\\lnot (q\\equiv \\lnot (\\lnot q\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111001101110 és 1100000111111111"]
          ["\\(\\{ (\\lnot (r\\land ((s\\land p)\\equiv p))\\supset p),\\lnot (((s\\equiv p)\\equiv s)\\lor \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0000001011111111 és 0101011001010101"]
          ["\\(\\{ ((q\\supset (r\\supset s))\\lor (p\\land (s\\lor s))),\\lnot ((\\lnot (r\\equiv s)\\land r)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111101 és 0010001011011101"]
          ["\\(\\{ (s\\lor (r\\land (q\\supset ((p\\equiv q)\\supset r)))),((s\\equiv q)\\land ((s\\land p)\\supset (r\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0111011101110111 és 1000000001100001"]
          ["\\(\\{ ((\\lnot p\\supset p)\\lor ((s\\supset r)\\equiv s)),(q\\land ((r\\equiv (r\\land r))\\land (p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0011000011111111 és 0000010000000000"]
          ["\\(\\{ (((s\\land r)\\supset \\lnot s)\\lor \\lnot r),(((\\lnot p\\land s)\\equiv (r\\equiv q))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1111111111101110 és 1010110111001100"]
          ["\\(\\{ \\lnot \\lnot \\lnot \\lnot \\lnot p,(((q\\equiv r)\\equiv (q\\equiv (s\\supset r)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0000000000010111"]
          ["\\(\\{ \\lnot \\lnot \\lnot ((q\\equiv r)\\supset p),(((((p\\supset q)\\land q)\\lor p)\\lor q)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1110010010000000 és 1100111100001111"]
          ["\\(\\{ (((r\\equiv p)\\supset \\lnot (q\\supset q))\\supset p),\\lnot ((p\\supset ((r\\supset r)\\equiv r))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1110011011111111 és 0010011001001100"]
          ["\\(\\{ (((r\\land s)\\land p)\\lor (q\\supset (q\\equiv s))),(((r\\supset (r\\supset r))\\land (q\\equiv s))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1101111011110101 és 0000000001100101"]
          ["\\(\\{ ((r\\supset (r\\land p))\\land ((q\\land r)\\lor r)),((q\\land p)\\equiv (q\\land (p\\equiv (q\\equiv r)))) \\}\\)" "az igazságtáblák főoszlopai: 0010000100110011 és 1100110000001011"]
          ["\\(\\{ ((((r\\equiv q)\\supset q)\\equiv q)\\land \\lnot r),((p\\lor q)\\land (r\\supset \\lnot (r\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1110100000001100 és 0000110111111100"]
          ["\\(\\{ \\lnot (s\\lor \\lnot (r\\lor (p\\land s))),(((r\\equiv (s\\equiv q))\\lor r)\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0010010100100010 és 0100101010110000"]
          ["\\(\\{ (((q\\lor (r\\supset q))\\land (p\\equiv s))\\lor q),(((s\\supset s)\\supset (q\\land q))\\equiv (q\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1000111101001111 és 1000011001101111"]
          ["\\(\\{ (s\\land (q\\lor \\lnot (q\\equiv (s\\land p)))),(r\\equiv (\\lnot ((s\\equiv s)\\land q)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000010101010101 és 1010100111001100"]
          ["\\(\\{ ((s\\lor ((r\\land r)\\supset q))\\lor \\lnot r),((((r\\supset p)\\supset q)\\land (q\\land r))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011111 és 1100010100000011"]
          ["\\(\\{ (((q\\supset r)\\land (s\\equiv s))\\land (s\\land q)),(((s\\lor s)\\lor \\lnot \\lnot p)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 1001110111111111"]
          ["\\(\\{ \\lnot \\lnot (s\\equiv (s\\land (p\\equiv q))),(q\\equiv ((((s\\lor q)\\equiv s)\\lor p)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1101101110101111 és 1110110011000011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot \\lnot \\lnot (r\\equiv \\lnot r), ((s\\lor r)\\supset (\\lnot (s\\equiv s)\\land q)) \\}\\)"
         "\\(\\{ (\\lnot (q\\land s)\\equiv ((r\\supset r)\\supset s)), ((((p\\equiv (p\\supset p))\\equiv r)\\lor p)\\lor s) \\}\\)"
         "\\(\\{ (((q\\equiv p)\\supset p)\\equiv ((s\\equiv r)\\equiv q)), \\lnot (((q\\supset q)\\land \\lnot p)\\lor q) \\}\\)"
         "\\(\\{ ((((s\\lor p)\\land s)\\equiv r)\\land \\lnot q), (q\\supset ((\\lnot q\\lor q)\\supset \\lnot r)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot q\\supset ((p\\supset q)\\equiv r)), ((q\\equiv (q\\land s))\\land \\lnot (r\\land s)) \\}\\)"
         "\\(\\{ (s\\equiv ((p\\supset ((p\\lor s)\\equiv r))\\supset p)), (q\\supset (q\\lor (\\lnot (q\\lor r)\\supset r))) \\}\\)"
         "\\(\\{ ((r\\lor (\\lnot (s\\lor r)\\lor r))\\lor p), ((q\\lor \\lnot (r\\supset p))\\supset (s\\supset r)) \\}\\)"
         "\\(\\{ ((s\\equiv \\lnot s)\\land (p\\supset (p\\equiv s))), (q\\lor ((p\\equiv r)\\supset ((r\\lor r)\\land s))) \\}\\)"
         "\\(\\{ ((r\\equiv (q\\land r))\\supset (r\\supset (r\\equiv p))), \\lnot (((p\\supset q)\\supset (p\\lor r))\\land q) \\}\\)"
         "\\(\\{ (\\lnot (r\\equiv ((r\\equiv r)\\supset p))\\supset p), ((q\\land \\lnot q)\\lor ((q\\land s)\\equiv s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\land \\lnot r)\\equiv (\\lnot p\\equiv r)),(\\lnot (p\\supset (q\\supset r))\\land (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100110001110011 és 0000001000000000"]
          ["\\(\\{ \\lnot ((r\\land ((p\\land q)\\equiv p))\\equiv r),(r\\equiv (\\lnot (q\\land r)\\equiv \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0011000100110000 és 0010000010111111"]
          ["\\(\\{ ((q\\land r)\\equiv ((p\\lor s)\\equiv (r\\land p))),((((p\\lor p)\\land s)\\lor q)\\land (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0101011111001111 és 0000000000001111"]
          ["\\(\\{ ((\\lnot s\\supset s)\\land (p\\supset (q\\lor r))),((q\\land (\\lnot (q\\equiv s)\\lor r))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0101010100010101 és 0000101111111111"]
          ["\\(\\{ (((\\lnot s\\lor p)\\lor s)\\supset (r\\land q)),(p\\supset (\\lnot ((r\\supset s)\\land p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0001011100000011 és 1101011111110111"]
          ["\\(\\{ \\lnot ((p\\land q)\\land \\lnot (s\\land p)),((s\\land s)\\lor \\lnot (q\\equiv (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000001101 és 0101111101111101"]
          ["\\(\\{ ((r\\lor p)\\land ((s\\equiv p)\\equiv (q\\equiv p))),(((s\\land \\lnot q)\\supset \\lnot r)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0001000110100101 és 0110011101000101"]
          ["\\(\\{ ((q\\lor s)\\land ((s\\lor q)\\equiv (s\\lor r))),(((r\\supset (q\\supset s))\\supset r)\\supset (s\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0101001000010111 és 1111111111011111"]
          ["\\(\\{ ((q\\equiv (p\\land s))\\equiv \\lnot \\lnot r),(r\\lor ((p\\land q)\\equiv ((s\\land q)\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0010010101101001 és 1111001111110111"]
          ["\\(\\{ (((r\\land q)\\supset r)\\lor (\\lnot s\\equiv p)),(\\lnot (p\\equiv q)\\lor (s\\equiv (s\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111111 és 0000111111110000"]
          ["\\(\\{ ((p\\equiv r)\\equiv (r\\land ((q\\equiv p)\\land q))),(r\\equiv ((r\\land p)\\supset ((p\\supset p)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0011000111001111 és 0000001011110011"]
          ["\\(\\{ ((s\\equiv s)\\land (((r\\land s)\\supset q)\\supset r)),\\lnot ((s\\land q)\\supset (q\\supset \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 0000111000000101"]
          ["\\(\\{ \\lnot ((((r\\equiv r)\\lor p)\\lor p)\\land p),((r\\supset q)\\land \\lnot \\lnot (p\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1100011000000000"]
          ["\\(\\{ ((p\\land (r\\equiv p))\\equiv ((p\\lor s)\\supset p)),((r\\equiv \\lnot p)\\equiv (\\lnot r\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010100110011 és 1101100001001111"]
          ["\\(\\{ (p\\lor \\lnot \\lnot (p\\land (s\\land p))),(((r\\land q)\\lor q)\\equiv (r\\land (s\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1101011111100001"]
          ["\\(\\{ \\lnot ((\\lnot s\\lor q)\\supset (r\\supset s)),((p\\land \\lnot (q\\lor s))\\equiv (q\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000100010 és 0000111110100000"]
          ["\\(\\{ ((p\\lor s)\\land (q\\equiv (s\\equiv (q\\lor p)))),(s\\supset (((r\\lor s)\\lor p)\\lor (s\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0101010000100101 és 1111111111111111"]
          ["\\(\\{ ((s\\lor r)\\lor ((s\\supset (p\\land r))\\land p)),((r\\equiv r)\\supset \\lnot (\\lnot s\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0111011111111111 és 1100011011010101"]
          ["\\(\\{ (((q\\equiv s)\\land s)\\land (s\\lor \\lnot p)),(((p\\supset q)\\land \\lnot r)\\land (p\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0001000001000101 és 0000100110001100"]
          ["\\(\\{ ((r\\land s)\\equiv (p\\supset (r\\lor (q\\land q)))),((q\\supset (s\\equiv s))\\equiv ((s\\equiv p)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0011011101010001 és 0101000101011010"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (s\\supset ((\\lnot p\\supset s)\\equiv \\lnot s)), ((((q\\supset r)\\equiv q)\\supset s)\\land (q\\lor p)) \\}\\)"
         "\\(\\{ (\\lnot (\\lnot p\\land r)\\lor (s\\supset r)), ((r\\equiv (p\\supset s))\\land (r\\lor \\lnot s)) \\}\\)"
         "\\(\\{ \\lnot ((q\\equiv ((p\\land s)\\equiv p))\\land r), \\lnot \\lnot ((p\\supset (r\\land q))\\lor q) \\}\\)"
         "\\(\\{ (((q\\lor r)\\lor ((s\\supset r)\\equiv r))\\lor q), (((s\\supset s)\\supset (q\\supset q))\\lor \\lnot r) \\}\\)"
         "\\(\\{ (\\lnot (p\\equiv \\lnot (s\\supset q))\\supset p), ((((p\\land q)\\supset s)\\lor \\lnot p)\\supset s) \\}\\)"
         "\\(\\{ (\\lnot p\\land (r\\equiv (q\\supset (r\\supset q)))), (q\\lor (s\\supset \\lnot ((q\\lor r)\\equiv r))) \\}\\)"
         "\\(\\{ ((p\\equiv r)\\equiv \\lnot \\lnot \\lnot p), (s\\lor ((q\\lor \\lnot (r\\equiv s))\\lor p)) \\}\\)"
         "\\(\\{ \\lnot ((q\\equiv \\lnot r)\\land (r\\land p)), (\\lnot q\\lor ((r\\land q)\\equiv (s\\lor p))) \\}\\)"
         "\\(\\{ ((s\\lor q)\\supset ((q\\lor (r\\supset p))\\supset q)), (q\\land (((s\\lor s)\\lor s)\\lor (r\\land q))) \\}\\)"
         "\\(\\{ ((p\\equiv s)\\lor ((p\\lor (s\\supset s))\\land q)), (((r\\land (q\\land p))\\equiv (p\\equiv s))\\equiv s) \\}\\)"
         "\\(\\{ (p\\lor (s\\equiv ((s\\supset \\lnot p)\\land s))), ((r\\lor \\lnot q)\\supset ((p\\supset r)\\land r)) \\}\\)"
         "\\(\\{ ((\\lnot (r\\equiv r)\\supset \\lnot q)\\land q), \\lnot ((r\\supset p)\\lor ((r\\lor p)\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((((q\\equiv p)\\supset r)\\supset q)\\equiv (s\\lor r)),(q\\lor ((q\\equiv r)\\equiv \\lnot \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0101001001000111 és 0011111110101111"]
          ["\\(\\{ ((r\\lor s)\\equiv (\\lnot (s\\land q)\\land q)),((r\\lor s)\\equiv (\\lnot (q\\land q)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1010110001000010 és 1000101001110111"]
          ["\\(\\{ (\\lnot (p\\lor q)\\equiv (s\\land (q\\lor s))),(((\\lnot (s\\land s)\\land p)\\supset r)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0101000110101010 és 0010111011111111"]
          ["\\(\\{ ((s\\land s)\\lor ((s\\equiv p)\\lor (p\\equiv p))),(((p\\land q)\\lor r)\\equiv \\lnot (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111101010101 és 0011001010101110"]
          ["\\(\\{ ((q\\equiv (r\\lor (p\\land s)))\\equiv (p\\supset s)),((q\\lor p)\\equiv ((q\\supset p)\\lor \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100101101101 és 0011101000000000"]
          ["\\(\\{ (p\\land (\\lnot (q\\land s)\\equiv (q\\supset q))),(\\lnot \\lnot (q\\equiv \\lnot q)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000110 és 1111001111111111"]
          ["\\(\\{ ((r\\land ((p\\land p)\\supset r))\\land \\lnot s),((\\lnot q\\land r)\\supset ((q\\supset q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100100010 és 1101010011111111"]
          ["\\(\\{ (((r\\equiv r)\\lor (q\\supset s))\\equiv (q\\land p)),((r\\land r)\\land (((p\\lor q)\\lor q)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000101 és 0001001100110011"]
          ["\\(\\{ (\\lnot r\\land (r\\lor (\\lnot s\\supset q))),(((q\\supset s)\\equiv r)\\lor (r\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0110100101001100 és 1111111111111011"]
          ["\\(\\{ ((\\lnot (r\\lor s)\\equiv (s\\land s))\\equiv r),((q\\land q)\\land \\lnot (p\\lor (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1101100000011110 és 0000011000000000"]
          ["\\(\\{ (((r\\supset r)\\lor (p\\supset p))\\land \\lnot q),\\lnot ((q\\equiv p)\\equiv (\\lnot q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1110101100110011"]
          ["\\(\\{ ((p\\lor r)\\equiv (((r\\land s)\\land q)\\land s)),\\lnot (q\\lor ((p\\equiv (s\\lor q))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1110100010000001 és 1100111010100000"]
          ["\\(\\{ ((q\\equiv \\lnot s)\\land (r\\supset (r\\equiv s))),\\lnot (r\\equiv ((r\\equiv r)\\supset (s\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0101100011011000 és 0011001101100110"]
          ["\\(\\{ \\lnot \\lnot \\lnot (\\lnot p\\land r),(\\lnot p\\equiv \\lnot ((s\\equiv p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000000 és 1011001010011001"]
          ["\\(\\{ (r\\equiv ((r\\supset (p\\land q))\\supset (r\\supset q))),\\lnot \\lnot ((s\\equiv s)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0000110010110011 és 1100101010001111"]
          ["\\(\\{ (((p\\lor q)\\lor (\\lnot s\\supset q))\\equiv s),((s\\supset p)\\lor (p\\lor ((p\\equiv r)\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1100100011010101 és 1011111111111111"]
          ["\\(\\{ ((p\\land r)\\equiv (q\\equiv \\lnot (q\\land r))),(\\lnot \\lnot r\\land (q\\lor (s\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1100101011000000 és 0000001100000011"]
          ["\\(\\{ (\\lnot (q\\supset s)\\lor (q\\land (q\\lor s))),(p\\equiv (((r\\lor q)\\supset p)\\land (s\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0001111100001111 és 1000001000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (r\\lor ((r\\lor (s\\lor p))\\equiv (q\\land q))), (((p\\land (q\\supset s))\\supset (r\\lor r))\\supset s) \\}\\)"
         "\\(\\{ (((p\\equiv s)\\supset (q\\lor (p\\supset r)))\\equiv q), (\\lnot (s\\supset (q\\supset q))\\supset (s\\supset s)) \\}\\)"
         "\\(\\{ ((q\\lor r)\\supset ((\\lnot q\\land q)\\land s)), ((p\\lor p)\\supset (s\\land (s\\supset (r\\equiv q)))) \\}\\)"
         "\\(\\{ ((r\\equiv s)\\lor \\lnot \\lnot (p\\land p)), (((r\\supset s)\\equiv \\lnot \\lnot q)\\supset r) \\}\\)"
         "\\(\\{ (q\\supset (p\\equiv \\lnot (p\\equiv (s\\equiv s)))), ((s\\supset ((s\\equiv (p\\equiv r))\\equiv p))\\equiv s) \\}\\)"
         "\\(\\{ (((q\\lor p)\\equiv (r\\supset q))\\equiv (p\\lor r)), (((s\\supset r)\\land (q\\lor \\lnot q))\\equiv p) \\}\\)"
         "\\(\\{ (q\\equiv ((p\\supset (p\\lor q))\\land \\lnot p)), (q\\supset ((p\\equiv p)\\supset \\lnot (s\\supset q))) \\}\\)"
         "\\(\\{ ((q\\land (s\\equiv p))\\lor ((s\\supset p)\\supset r)), ((r\\equiv s)\\lor (((r\\lor s)\\land p)\\lor p)) \\}\\)"
         "\\(\\{ ((r\\equiv q)\\lor ((q\\equiv p)\\land (q\\supset q))), (s\\equiv (q\\land \\lnot ((r\\land q)\\lor p))) \\}\\)"
         "\\(\\{ (\\lnot p\\supset ((q\\lor q)\\land (s\\equiv s))), \\lnot (q\\lor ((p\\land p)\\land (q\\land r))) \\}\\)"
         "\\(\\{ (((q\\equiv q)\\land ((s\\land q)\\equiv r))\\lor q), \\lnot (\\lnot \\lnot p\\supset (r\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\supset \\lnot p)\\land \\lnot (p\\supset q)),(\\lnot (p\\equiv r)\\land (p\\land (p\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111001110000 és 0000000000000000"]
          ["\\(\\{ ((p\\land p)\\land (\\lnot (s\\supset r)\\equiv p)),((s\\equiv p)\\lor \\lnot (r\\land (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000001000100 és 1101110101010101"]
          ["\\(\\{ \\lnot (q\\equiv (p\\lor (\\lnot r\\land q))),((r\\lor p)\\equiv (\\lnot \\lnot r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0000011011110000 és 0010110100000000"]
          ["\\(\\{ ((s\\lor s)\\lor (((p\\land q)\\lor r)\\supset p)),((q\\land ((q\\supset r)\\supset \\lnot q))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0000010000000100"]
          ["\\(\\{ ((r\\supset ((r\\land q)\\equiv s))\\lor (r\\supset r)),(p\\land \\lnot (s\\equiv (s\\equiv \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000000000001111"]
          ["\\(\\{ \\lnot (q\\lor ((q\\lor p)\\equiv (q\\supset p))),((p\\land (p\\land (q\\equiv s)))\\land (q\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 0000000000000101"]
          ["\\(\\{ (((r\\equiv q)\\equiv q)\\equiv (p\\equiv (r\\equiv q))),((s\\land ((s\\lor q)\\lor p))\\land (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1100110110001111 és 0001010100010001"]
          ["\\(\\{ ((p\\equiv ((p\\supset q)\\lor (p\\equiv q)))\\equiv r),(p\\land \\lnot ((r\\land s)\\land (s\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1110010101000011 és 0000000011101110"]
          ["\\(\\{ (\\lnot r\\equiv ((r\\land (p\\supset p))\\supset p)),(((r\\supset q)\\land (r\\lor q))\\land \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1111010111001100 és 0000110100001010"]
          ["\\(\\{ (\\lnot p\\equiv \\lnot ((s\\lor p)\\equiv p)),(((r\\land p)\\supset (p\\lor (p\\lor p)))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0101100101111111 és 0010110100110011"]
          ["\\(\\{ (s\\lor ((r\\equiv \\lnot p)\\lor (r\\land p))),(((r\\supset r)\\lor r)\\lor ((s\\land p)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0111110101111111 és 1111101111111111"]
          ["\\(\\{ (\\lnot (p\\land q)\\supset (s\\land (r\\equiv q))),(((p\\lor q)\\supset s)\\lor \\lnot (q\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0100010000001111 és 1101111101010101"]
          ["\\(\\{ (p\\land ((q\\land s)\\land (s\\land (p\\land s)))),(\\lnot (s\\lor s)\\equiv \\lnot (p\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1010110011010101"]
          ["\\(\\{ (((s\\supset p)\\land (r\\equiv s))\\land (p\\land r)),((p\\land (q\\equiv q))\\land ((p\\supset r)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010001 és 0000000000000000"]
          ["\\(\\{ (((s\\lor s)\\lor p)\\equiv \\lnot (s\\supset s)),(r\\equiv ((r\\lor q)\\land ((q\\lor r)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1000011010000000 és 1100010111011001"]
          ["\\(\\{ (\\lnot q\\supset ((s\\supset s)\\land \\lnot p)),\\lnot \\lnot (r\\supset (\\lnot s\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111110001111 és 1111100111101110"]
          ["\\(\\{ ((\\lnot (\\lnot p\\land q)\\lor p)\\lor p),(s\\equiv ((p\\equiv \\lnot (q\\land r))\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100000011111111 és 0101000001100101"]
          ["\\(\\{ \\lnot \\lnot (\\lnot \\lnot p\\land p),((\\lnot ((s\\equiv r)\\supset r)\\supset p)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0111011111111111"]
          ["\\(\\{ (p\\land ((((p\\supset q)\\lor r)\\lor q)\\lor p)),(p\\land ((\\lnot p\\supset p)\\lor (r\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0000000011111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot s\\supset \\lnot ((r\\supset p)\\land r)), (p\\lor ((p\\supset s)\\land (r\\lor (r\\land r)))) \\}\\)"
         "\\(\\{ (\\lnot \\lnot r\\equiv (p\\land \\lnot s)), ((s\\land q)\\equiv ((q\\equiv s)\\land (p\\equiv q))) \\}\\)"
         "\\(\\{ (r\\supset ((q\\supset (s\\equiv \\lnot p))\\supset q)), ((\\lnot (p\\lor s)\\land (r\\supset p))\\land r) \\}\\)"
         "\\(\\{ ((((p\\lor p)\\supset r)\\lor (q\\land r))\\lor r), ((p\\supset p)\\equiv (((p\\supset q)\\supset s)\\supset q)) \\}\\)"
         "\\(\\{ (r\\supset (q\\supset ((r\\equiv q)\\supset (p\\equiv p)))), \\lnot \\lnot ((p\\supset r)\\land (r\\lor r)) \\}\\)"
         "\\(\\{ (p\\supset \\lnot (q\\land \\lnot (s\\lor s))), ((q\\lor (q\\land (s\\equiv r)))\\lor (p\\lor s)) \\}\\)"
         "\\(\\{ ((q\\land r)\\lor (r\\supset ((r\\supset r)\\supset q))), (((q\\lor \\lnot r)\\land q)\\lor (s\\lor s)) \\}\\)"
         "\\(\\{ ((r\\supset s)\\supset \\lnot \\lnot (r\\equiv p)), (((r\\equiv q)\\lor s)\\land \\lnot (q\\supset p)) \\}\\)"
         "\\(\\{ (((s\\lor s)\\lor q)\\supset \\lnot (r\\equiv p)), (((s\\land s)\\equiv \\lnot r)\\equiv (r\\lor s)) \\}\\)"
         "\\(\\{ ((r\\lor s)\\lor (p\\supset \\lnot (q\\equiv p))), ((s\\land \\lnot r)\\lor (s\\lor (p\\lor q))) \\}\\)"
         "\\(\\{ (((r\\equiv r)\\lor \\lnot \\lnot q)\\supset s), ((q\\lor (q\\lor q))\\equiv (r\\equiv (r\\lor p))) \\}\\)"
         "\\(\\{ ((s\\land (p\\lor (p\\equiv s)))\\supset (r\\supset p)), (s\\lor ((\\lnot s\\supset (q\\lor r))\\lor q)) \\}\\)"
         "\\(\\{ ((\\lnot \\lnot \\lnot q\\land r)\\lor q), ((q\\lor q)\\supset ((s\\lor s)\\land \\lnot r)) \\}\\)"
         "\\(\\{ ((p\\equiv (s\\land q))\\supset ((p\\lor p)\\equiv r)), \\lnot \\lnot ((q\\equiv (r\\equiv p))\\supset q) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot p\\lor (s\\land (s\\equiv (q\\lor p)))),(((r\\equiv (p\\supset q))\\supset (s\\lor r))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1101011011010101 és 0011001100110011"]
          ["\\(\\{ \\lnot (\\lnot r\\equiv ((p\\equiv r)\\supset q)),(s\\supset ((p\\equiv q)\\land (q\\equiv (r\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 1101011000000011 és 1001110110101111"]
          ["\\(\\{ \\lnot ((p\\supset s)\\equiv \\lnot (q\\supset r)),((q\\land (s\\land s))\\equiv (\\lnot s\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1111000111011001 és 0101001010000101"]
          ["\\(\\{ (\\lnot r\\supset ((p\\supset r)\\supset (p\\land p))),(\\lnot s\\land ((q\\land s)\\land (q\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0011111111111111 és 0000000000000000"]
          ["\\(\\{ (q\\supset ((s\\supset s)\\lor (q\\equiv (q\\lor p)))),(((q\\supset s)\\supset ((s\\equiv s)\\lor q))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0001101000000000"]
          ["\\(\\{ ((s\\lor \\lnot p)\\lor ((p\\land p)\\land s)),(s\\equiv (q\\equiv ((p\\land q)\\supset (p\\equiv s)))) \\}\\)" "az igazságtáblák főoszlopai: 1101011111010101 és 1000111011000111"]
          ["\\(\\{ ((q\\supset ((r\\equiv q)\\supset q))\\land (q\\equiv q)),((r\\equiv ((s\\land r)\\supset q))\\land (p\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000010010000011"]
          ["\\(\\{ (\\lnot q\\land ((r\\lor (p\\equiv q))\\land q)),((s\\supset r)\\supset \\lnot (r\\lor \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 0110011001000100"]
          ["\\(\\{ ((q\\land (q\\supset r))\\supset \\lnot (s\\land p)),(p\\supset (r\\land (\\lnot s\\lor (p\\land q)))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111110 és 1101011110100011"]
          ["\\(\\{ ((\\lnot s\\land (s\\lor p))\\equiv (s\\land s)),(s\\land ((r\\lor q)\\supset ((p\\equiv r)\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1000011010000000 és 0101010101000101"]
          ["\\(\\{ (q\\supset ((q\\land p)\\lor (\\lnot p\\equiv p))),((\\lnot q\\lor r)\\lor ((s\\lor p)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111111 és 1111111111111111"]
          ["\\(\\{ ((r\\lor (q\\equiv q))\\land ((s\\equiv r)\\land r)),((q\\equiv p)\\equiv ((q\\land p)\\supset (s\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0011001100010001 és 1100101001101101"]
          ["\\(\\{ \\lnot ((r\\equiv (s\\equiv r))\\equiv (q\\equiv p)),(\\lnot \\lnot \\lnot s\\equiv (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1000001011011010 és 0101100011011010"]
          ["\\(\\{ \\lnot (((s\\equiv s)\\lor r)\\lor (s\\land r)),(((p\\land r)\\supset (s\\supset s))\\supset (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0010111011001100 és 0001011000001111"]
          ["\\(\\{ (r\\land \\lnot (r\\supset (p\\supset (r\\equiv r)))),(\\lnot \\lnot (s\\lor (q\\equiv r))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0011001000110011 és 0111101000111101"]
          ["\\(\\{ \\lnot ((s\\equiv q)\\supset (r\\equiv (q\\supset r))),(\\lnot \\lnot p\\equiv \\lnot (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1001011100000000 és 1100011010000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot (r\\equiv s)\\lor ((q\\supset q)\\lor q)), \\lnot ((s\\equiv s)\\supset (q\\land (s\\land r))) \\}\\)"
         "\\(\\{ ((q\\lor q)\\supset \\lnot (p\\lor (p\\land q))), \\lnot \\lnot (p\\lor (q\\supset (r\\lor s))) \\}\\)"
         "\\(\\{ (\\lnot q\\lor (q\\lor (r\\land \\lnot p))), ((p\\equiv r)\\supset (p\\land ((p\\supset s)\\equiv q))) \\}\\)"
         "\\(\\{ ((p\\equiv p)\\lor \\lnot (p\\land \\lnot s)), \\lnot ((q\\land (p\\equiv q))\\lor (r\\lor q)) \\}\\)"
         "\\(\\{ (\\lnot r\\lor (q\\land (\\lnot s\\equiv p))), ((q\\supset r)\\supset (s\\supset \\lnot (r\\lor r))) \\}\\)"
         "\\(\\{ (\\lnot \\lnot r\\equiv ((p\\land s)\\land p)), ((s\\land ((r\\supset (r\\land q))\\lor p))\\supset r) \\}\\)"
         "\\(\\{ ((s\\lor (s\\lor (q\\supset q)))\\equiv \\lnot q), (p\\supset (((s\\land r)\\lor (p\\lor r))\\supset p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\land \\lnot \\lnot ((q\\land s)\\equiv s)),\\lnot (p\\lor \\lnot ((q\\land r)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000101000001111 és 0000001100000000"]
          ["\\(\\{ (\\lnot (\\lnot s\\supset p)\\supset \\lnot s),(\\lnot (p\\lor q)\\lor ((r\\supset q)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1101110111111111 és 1110111100000011"]
          ["\\(\\{ (((r\\equiv p)\\equiv (r\\land s))\\lor (s\\lor s)),(\\lnot (\\lnot p\\supset (p\\supset q))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0111011101111101 és 1100111111111111"]
          ["\\(\\{ \\lnot (q\\lor (((s\\lor q)\\equiv q)\\supset p)),(r\\equiv ((r\\land q)\\equiv ((q\\lor p)\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1001011000000000 és 0010011001001111"]
          ["\\(\\{ (((r\\land p)\\land (q\\supset r))\\land (r\\supset p)),((q\\lor (q\\lor q))\\land (q\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 0000110100001010"]
          ["\\(\\{ ((((r\\lor q)\\land p)\\equiv (r\\equiv s))\\supset r),(r\\equiv ((s\\equiv (p\\equiv (p\\land p)))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110110111 és 0010011001001100"]
          ["\\(\\{ (\\lnot \\lnot q\\equiv ((p\\equiv q)\\lor p)),((p\\supset (\\lnot p\\lor s))\\equiv \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0000011100001111 és 1000100001000000"]
          ["\\(\\{ ((q\\land p)\\land (((s\\supset q)\\equiv s)\\equiv q)),\\lnot ((\\lnot r\\supset s)\\land (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1101110110001000"]
          ["\\(\\{ \\lnot ((s\\land (q\\lor (s\\lor r)))\\equiv p),(((s\\land (p\\equiv p))\\equiv (p\\supset r))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101010 és 1110010000010110"]
          ["\\(\\{ ((q\\land \\lnot (q\\supset (s\\supset p)))\\supset p),((((r\\equiv p)\\equiv r)\\equiv (s\\lor r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1100000011111111 és 0000111000001000"]
          ["\\(\\{ \\lnot ((s\\lor (p\\lor r))\\land (q\\equiv s)),(q\\supset (s\\equiv (((r\\equiv q)\\lor q)\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1101101001011010 és 1111111011111111"]
          ["\\(\\{ ((p\\land (s\\land q))\\land (r\\equiv \\lnot p)),((r\\equiv q)\\land (((r\\lor r)\\lor p)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000100 és 0010010000100011"]
          ["\\(\\{ (r\\equiv \\lnot \\lnot \\lnot (s\\lor q)),((\\lnot p\\land r)\\equiv \\lnot (p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0111110101101100 és 0000001011111111"]
          ["\\(\\{ ((r\\land s)\\land ((p\\equiv (s\\lor r))\\lor p)),((((r\\supset q)\\supset r)\\land r)\\land (p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010001 és 0000000000110011"]
          ["\\(\\{ (\\lnot (q\\equiv ((s\\land s)\\lor q))\\lor q),\\lnot ((\\lnot r\\lor (r\\land p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011111 és 1100011010000000"]
          ["\\(\\{ (\\lnot ((q\\equiv r)\\land r)\\equiv (q\\land s)),((s\\equiv q)\\supset (((p\\supset r)\\lor p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0010011011000110 és 0101111101011111"]
          ["\\(\\{ (s\\land (\\lnot p\\land \\lnot (r\\equiv s))),(\\lnot ((q\\supset q)\\supset q)\\land (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 1000110011110000"]
          ["\\(\\{ \\lnot ((p\\lor (p\\equiv q))\\lor (r\\land q)),((((r\\supset q)\\supset p)\\lor r)\\supset (q\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 1110111111111111"]
          ["\\(\\{ (((r\\lor r)\\supset \\lnot s)\\equiv \\lnot r),(((p\\equiv r)\\land (s\\supset (s\\lor p)))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1101110000111101 és 0100000100010001"]
          ["\\(\\{ (\\lnot \\lnot r\\equiv ((q\\land q)\\lor r)),(\\lnot (q\\equiv r)\\lor \\lnot (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100110000001011 és 0011111111111100"]
          ["\\(\\{ \\lnot (s\\supset ((s\\supset \\lnot q)\\land r)),(((p\\supset \\lnot r)\\supset s)\\equiv (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0101011001000101 és 1010111001110111"]
          ["\\(\\{ ((p\\equiv s)\\land (q\\lor (r\\supset \\lnot r))),((q\\lor (p\\lor ((s\\supset s)\\land p)))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 1000110101000101 és 1100111011111111"]
          ["\\(\\{ (\\lnot ((\\lnot q\\lor p)\\land s)\\lor q),(\\lnot (s\\lor q)\\equiv (r\\land (p\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1000111101101111 és 0100001101001110"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (r\\lor (p\\supset \\lnot ((p\\equiv s)\\supset q))), (\\lnot q\\lor (p\\land ((r\\equiv s)\\supset s))) \\}\\)"
         "\\(\\{ (\\lnot ((p\\equiv r)\\supset (p\\land s))\\lor s), \\lnot (r\\equiv (\\lnot s\\supset (q\\equiv r))) \\}\\)"
         "\\(\\{ ((r\\supset r)\\lor ((r\\land (p\\lor s))\\equiv q)), ((q\\lor \\lnot (q\\lor q))\\equiv (p\\land p)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((s\\lor r)\\land (p\\supset s)), ((r\\land ((r\\supset p)\\lor (p\\equiv s)))\\lor p) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((p\\lor r)\\lor (p\\land s)), (((s\\lor p)\\supset \\lnot r)\\equiv (s\\land s)) \\}\\)"
         "\\(\\{ (\\lnot (s\\lor (r\\lor p))\\lor (r\\supset p)), (((s\\equiv (s\\lor p))\\land q)\\supset \\lnot q) \\}\\)"
         "\\(\\{ ((\\lnot ((s\\land s)\\land s)\\equiv s)\\supset s), (r\\equiv \\lnot (q\\supset (\\lnot r\\supset q))) \\}\\)"
         "\\(\\{ \\lnot (((r\\lor r)\\equiv (p\\land p))\\equiv s), ((s\\land ((q\\lor p)\\equiv p))\\supset (p\\lor s)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((s\\land p)\\supset \\lnot r), ((q\\lor p)\\supset ((q\\supset r)\\land (r\\lor s))) \\}\\)"
         "\\(\\{ (q\\supset ((((s\\lor s)\\supset p)\\equiv p)\\equiv q)), (r\\supset ((s\\equiv \\lnot s)\\land (r\\lor s))) \\}\\)"
         "\\(\\{ ((((r\\equiv p)\\equiv q)\\equiv s)\\supset \\lnot q), (p\\lor \\lnot (s\\lor ((q\\supset p)\\lor q))) \\}\\)"
         "\\(\\{ ((q\\lor (r\\land ((s\\land q)\\equiv q)))\\lor s), ((s\\land p)\\supset ((r\\lor s)\\lor \\lnot q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\equiv \\lnot q)\\lor (s\\lor (q\\supset p))),(((q\\equiv (s\\lor r))\\supset r)\\supset (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1010001110000111"]
          ["\\(\\{ ((r\\land (s\\land (p\\supset p)))\\equiv (s\\lor s)),((p\\lor r)\\lor \\lnot ((s\\lor r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110111011 és 0011001111111111"]
          ["\\(\\{ (\\lnot s\\land ((\\lnot q\\lor p)\\lor r)),(r\\lor (r\\supset \\lnot (p\\lor \\lnot r))) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 1111101111111111"]
          ["\\(\\{ \\lnot (q\\lor (((p\\lor q)\\land p)\\supset p)),((p\\lor (s\\equiv (p\\equiv p)))\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 1101011110000000"]
          ["\\(\\{ ((q\\lor r)\\supset ((q\\supset q)\\lor (q\\supset p))),(((r\\land p)\\supset (s\\equiv p))\\equiv (q\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1101001110000010"]
          ["\\(\\{ (\\lnot (\\lnot r\\lor q)\\supset (q\\supset q)),(r\\land (\\lnot q\\land \\lnot (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0000001000000000"]
          ["\\(\\{ (((r\\equiv r)\\land q)\\lor ((q\\land r)\\supset q)),(s\\land \\lnot (((p\\lor p)\\land s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0100010000000000"]
          ["\\(\\{ (\\lnot \\lnot \\lnot r\\supset (p\\land r)),((s\\land s)\\equiv (\\lnot q\\supset (s\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1001000000001101"]
          ["\\(\\{ ((s\\equiv p)\\land \\lnot ((p\\equiv q)\\lor r)),(((((s\\lor q)\\land q)\\equiv q)\\lor s)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000010001000000 és 0000011100000101"]
          ["\\(\\{ (p\\equiv \\lnot \\lnot (p\\equiv (r\\land r))),(\\lnot ((p\\supset s)\\supset \\lnot q)\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1111110000101001"]
          ["\\(\\{ (r\\land \\lnot (p\\supset (\\lnot p\\lor q))),((r\\land q)\\equiv \\lnot (s\\lor (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0000001000110000 és 1111010111110100"]
          ["\\(\\{ ((((r\\land s)\\supset r)\\land s)\\equiv (s\\lor r)),(r\\land ((s\\equiv p)\\lor (\\lnot r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011101 és 0011001100110001"]
          ["\\(\\{ (p\\lor \\lnot ((q\\supset q)\\equiv (s\\lor s))),(r\\equiv ((((r\\supset q)\\land q)\\land q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1001101011111111 és 0011010010111001"]
          ["\\(\\{ ((p\\equiv (s\\equiv q))\\lor (p\\supset (q\\land r))),(((\\lnot (r\\supset r)\\supset s)\\equiv p)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1101111111100111 és 1111001100001111"]
          ["\\(\\{ ((s\\supset (q\\lor s))\\equiv \\lnot (p\\supset p)),(\\lnot ((q\\land (p\\equiv q))\\lor p)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0001011010000000 és 1111111100110011"]
          ["\\(\\{ ((p\\supset \\lnot q)\\supset \\lnot (p\\lor p)),((\\lnot s\\equiv ((q\\supset r)\\supset r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1100111110001111 és 0000000000001010"]
          ["\\(\\{ (p\\equiv \\lnot (\\lnot (r\\equiv q)\\equiv p)),\\lnot ((\\lnot (r\\equiv p)\\land r)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1110010000100011 és 0011001111111111"]
          ["\\(\\{ ((s\\lor s)\\equiv (s\\land (q\\equiv (q\\supset q)))),(((s\\land r)\\equiv s)\\equiv ((r\\supset q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001101110101111 és 0100110110001011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((p\\land p)\\supset \\lnot (p\\equiv (r\\land q))), (q\\supset \\lnot (p\\equiv ((s\\land p)\\supset p))) \\}\\)"
         "\\(\\{ (q\\lor (r\\land ((s\\lor \\lnot q)\\equiv r))), \\lnot (r\\supset (((s\\equiv r)\\lor r)\\land q)) \\}\\)"
         "\\(\\{ (r\\land (((q\\equiv r)\\equiv p)\\lor (q\\equiv q))), (((\\lnot r\\lor q)\\land r)\\supset \\lnot p) \\}\\)"
         "\\(\\{ ((\\lnot (r\\equiv r)\\equiv p)\\lor (r\\land p)), ((r\\lor (r\\lor q))\\lor (s\\lor (r\\supset r))) \\}\\)"
         "\\(\\{ ((\\lnot s\\land q)\\supset (p\\lor \\lnot q)), \\lnot \\lnot (((s\\land q)\\land q)\\supset q) \\}\\)"
         "\\(\\{ (((s\\lor p)\\equiv (s\\land s))\\equiv (p\\equiv q)), \\lnot \\lnot (\\lnot \\lnot q\\lor r) \\}\\)"
         "\\(\\{ (((p\\lor r)\\equiv ((q\\land p)\\equiv p))\\lor r), \\lnot ((q\\land q)\\lor \\lnot (s\\lor r)) \\}\\)"
         "\\(\\{ ((p\\supset p)\\equiv \\lnot ((r\\land q)\\lor s)), \\lnot ((p\\supset (p\\equiv q))\\equiv (r\\lor p)) \\}\\)"
         "\\(\\{ ((p\\land q)\\lor ((p\\lor \\lnot s)\\lor s)), ((s\\equiv (\\lnot (p\\lor s)\\supset r))\\supset p) \\}\\)"
         "\\(\\{ ((q\\land s)\\lor \\lnot (q\\equiv \\lnot q)), \\lnot \\lnot (((s\\supset p)\\lor s)\\equiv p) \\}\\)"
         "\\(\\{ (((r\\supset \\lnot (r\\land p))\\land q)\\supset s), \\lnot (((q\\equiv r)\\lor p)\\land (r\\land p)) \\}\\)"
         "\\(\\{ (p\\supset ((\\lnot (q\\lor s)\\supset p)\\lor r)), ((p\\equiv r)\\lor ((q\\equiv s)\\supset (r\\supset r))) \\}\\)"
         "\\(\\{ (s\\lor ((r\\land r)\\lor ((r\\lor s)\\land s))), \\lnot ((p\\supset q)\\land (q\\equiv (p\\lor q))) \\}\\)"
         "\\(\\{ ((s\\lor (p\\supset s))\\lor (r\\equiv (s\\lor r))), (\\lnot \\lnot r\\supset \\lnot (q\\land s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((q\\lor (q\\land s))\\equiv q)\\land (s\\supset r)),((r\\lor (s\\land (\\lnot r\\equiv p)))\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1000011000000000 és 1111101110111011"]
          ["\\(\\{ \\lnot ((q\\land (q\\equiv q))\\supset (p\\lor q)),((s\\lor (p\\supset s))\\land ((s\\lor r)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 0101011101010101"]
          ["\\(\\{ (q\\equiv ((r\\supset (s\\supset s))\\land (s\\supset r))),(q\\land ((s\\lor (r\\lor \\lnot p))\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0110100011001011 és 0000111000000111"]
          ["\\(\\{ (\\lnot q\\land ((r\\supset q)\\lor (p\\equiv q))),(q\\equiv (((r\\lor s)\\equiv p)\\land (s\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011000000 és 0100101111110000"]
          ["\\(\\{ (((s\\land (q\\supset \\lnot q))\\land s)\\land r),((((r\\land \\lnot p)\\equiv q)\\equiv p)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010000 és 1100111100001111"]
          ["\\(\\{ \\lnot (r\\lor (((r\\land s)\\land s)\\supset s)),\\lnot (q\\land (((s\\lor s)\\equiv p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 1100001111110000"]
          ["\\(\\{ ((p\\land q)\\supset (s\\lor ((p\\land r)\\equiv r))),(\\lnot r\\equiv (r\\lor \\lnot (s\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0001011100000000"]
          ["\\(\\{ ((s\\equiv r)\\equiv (\\lnot r\\land (s\\land s))),(((p\\land p)\\supset r)\\supset ((s\\supset r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0010011100100010 és 0011111101011101"]
          ["\\(\\{ ((q\\equiv (r\\lor (s\\equiv r)))\\lor (p\\equiv p)),\\lnot ((r\\equiv p)\\supset ((p\\land p)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1110111011001011 és 0010111000000000"]
          ["\\(\\{ ((q\\equiv (p\\lor q))\\equiv (q\\equiv \\lnot s)),(((q\\supset q)\\land r)\\supset ((s\\land p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0101011110101010 és 1100010111001101"]
          ["\\(\\{ ((s\\land r)\\supset (((p\\equiv r)\\equiv q)\\supset q)),(q\\lor ((q\\land s)\\lor \\lnot (p\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000111100001111"]
          ["\\(\\{ (\\lnot ((q\\supset r)\\lor (r\\lor q))\\equiv r),((\\lnot (r\\supset s)\\land \\lnot s)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1101110111001100 és 0000010100000000"]
          ["\\(\\{ (\\lnot (\\lnot \\lnot p\\lor q)\\land r),(p\\supset \\lnot ((s\\equiv s)\\supset (p\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1100111111110000"]
          ["\\(\\{ ((\\lnot q\\lor s)\\equiv \\lnot (q\\lor p)),\\lnot ((p\\lor \\lnot (q\\equiv p))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1101101100001010 és 1100010111001100"]
          ["\\(\\{ (\\lnot (p\\supset (s\\equiv r))\\supset (s\\supset r)),\\lnot ((q\\land (s\\lor p))\\supset (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111110111011 és 0011000100001100"]
          ["\\(\\{ (r\\equiv ((p\\lor \\lnot q)\\lor (p\\land p))),(((s\\land q)\\equiv r)\\land ((s\\land r)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0010010100110011 és 0000111100001001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((p\\lor s)\\land ((p\\supset (p\\land s))\\land s)), (((q\\equiv r)\\equiv (p\\supset (s\\supset p)))\\lor p) \\}\\)"
         "\\(\\{ ((((q\\supset s)\\land p)\\land p)\\equiv (r\\supset s)), ((s\\lor (r\\land p))\\equiv \\lnot \\lnot s) \\}\\)"
         "\\(\\{ ((s\\equiv q)\\supset ((p\\lor (p\\equiv q))\\equiv p)), ((r\\lor \\lnot (s\\land q))\\supset (r\\lor r)) \\}\\)"
         "\\(\\{ ((((q\\lor p)\\supset r)\\supset r)\\equiv (r\\land s)), ((\\lnot r\\supset (p\\lor p))\\lor (p\\supset p)) \\}\\)"
         "\\(\\{ ((p\\lor p)\\supset (s\\lor (r\\equiv (s\\lor r)))), ((((r\\land r)\\land (p\\land s))\\lor q)\\equiv s) \\}\\)"
         "\\(\\{ \\lnot (q\\equiv ((p\\supset r)\\lor (r\\lor p))), (\\lnot (q\\supset ((s\\supset q)\\land r))\\lor p) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\land (s\\supset (p\\supset r)))\\equiv (q\\equiv p)),(p\\lor ((\\lnot p\\lor r)\\equiv \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0010010111000011 és 1110001111111111"]
          ["\\(\\{ \\lnot (\\lnot ((r\\lor r)\\lor q)\\equiv s),((q\\equiv \\lnot \\lnot q)\\land \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1011001110010101 és 1000010000000000"]
          ["\\(\\{ ((((p\\land s)\\land r)\\supset q)\\equiv (s\\lor q)),(\\lnot ((r\\equiv r)\\land (s\\equiv r))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0101101001111111 és 0000000000000000"]
          ["\\(\\{ \\lnot \\lnot (r\\land \\lnot (r\\equiv s)),(p\\equiv (\\lnot q\\equiv (\\lnot p\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0010001000100010 és 1100111001001111"]
          ["\\(\\{ ((p\\land p)\\supset (\\lnot (q\\equiv r)\\land q)),((q\\lor r)\\land ((r\\lor p)\\lor (s\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1100111010001100 és 0011011100111111"]
          ["\\(\\{ (p\\lor (((r\\equiv r)\\equiv (s\\equiv q))\\supset q)),((r\\land (q\\equiv q))\\equiv (r\\lor (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0101111111111111 és 0010110100000000"]
          ["\\(\\{ ((r\\equiv (p\\supset ((q\\equiv s)\\land s)))\\lor q),(\\lnot q\\lor (q\\land \\lnot (p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0011111100001111 és 1100111111111010"]
          ["\\(\\{ ((p\\lor p)\\equiv \\lnot (q\\lor (p\\land p))),\\lnot \\lnot (q\\equiv ((q\\land q)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000000 és 1100011010001111"]
          ["\\(\\{ (p\\equiv (p\\equiv \\lnot ((r\\land p)\\lor q))),(\\lnot \\lnot p\\lor (q\\lor (q\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011000000 és 0000111111111111"]
          ["\\(\\{ (\\lnot (q\\supset q)\\equiv ((r\\equiv s)\\equiv p)),(((s\\supset (s\\lor r))\\equiv p)\\supset (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1011001011100110 és 1111111100010001"]
          ["\\(\\{ ((s\\supset s)\\supset (p\\equiv (s\\lor (q\\lor q)))),(s\\land (q\\land ((q\\lor (s\\supset r))\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1001011101011111 és 0000010000000101"]
          ["\\(\\{ (((q\\equiv p)\\equiv (q\\lor q))\\equiv (p\\lor r)),((s\\equiv p)\\lor ((s\\lor r)\\supset (r\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1110110000000000 és 1111111111111111"]
          ["\\(\\{ (\\lnot (s\\lor \\lnot p)\\land (p\\supset p)),(\\lnot (q\\equiv (s\\supset s))\\supset (r\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000101010 és 1111100111111111"]
          ["\\(\\{ (\\lnot (s\\lor s)\\supset (s\\lor (r\\land s))),(q\\land ((\\lnot p\\supset p)\\equiv (q\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000111000001111"]
          ["\\(\\{ \\lnot ((((r\\equiv q)\\supset r)\\land s)\\equiv r),(\\lnot ((s\\lor s)\\equiv p)\\land (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000100110 és 0101010110101010"]
          ["\\(\\{ ((q\\equiv (r\\supset q))\\land ((r\\land q)\\equiv p)),((((r\\lor \\lnot p)\\equiv r)\\supset q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000011 és 0000111010001111"]
          ["\\(\\{ \\lnot ((s\\land r)\\land ((p\\land r)\\land q)),((p\\supset \\lnot p)\\supset ((s\\supset q)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000001 és 0111011111111111"]
          ["\\(\\{ (\\lnot (s\\equiv (p\\equiv s))\\equiv (r\\lor p)),(s\\supset (\\lnot r\\supset ((q\\land p)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0010000100000000 és 1011111110111111"]
          ["\\(\\{ \\lnot ((r\\land p)\\land ((p\\equiv q)\\supset p)),(s\\equiv (((s\\equiv p)\\equiv p)\\supset (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000101100 és 0000101010010001"]
          ["\\(\\{ (\\lnot q\\land ((p\\equiv s)\\equiv \\lnot s)),(s\\equiv ((q\\lor p)\\land \\lnot (r\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1001111110101010"]
          ["\\(\\{ (r\\equiv ((q\\equiv p)\\lor \\lnot (p\\lor r))),((s\\supset ((q\\supset q)\\supset \\lnot q))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0001010000100011 és 0011010010110110"]
          ["\\(\\{ (\\lnot q\\supset \\lnot ((r\\land p)\\supset s)),(p\\supset (q\\equiv ((s\\lor q)\\lor \\lnot r))) \\}\\)" "az igazságtáblák főoszlopai: 0001111110001111 és 1110111010101111"]
          ["\\(\\{ ((p\\supset q)\\land ((p\\supset (s\\lor q))\\equiv q)),\\lnot (((q\\lor s)\\supset p)\\land (r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000101010001111 és 1101111111000000"]
          ["\\(\\{ ((r\\supset \\lnot q)\\lor ((r\\equiv p)\\equiv q)),\\lnot ((q\\land s)\\equiv \\lnot (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0110001101100011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((r\\equiv (((r\\equiv q)\\equiv s)\\equiv r))\\lor q), (\\lnot \\lnot q\\land ((q\\land p)\\lor s)) \\}\\)"
         "\\(\\{ (((q\\supset (q\\land r))\\land (r\\supset p))\\equiv r), (q\\land \\lnot (s\\lor \\lnot (p\\lor q))) \\}\\)"
         "\\(\\{ (p\\supset (p\\lor \\lnot (q\\land (p\\supset s)))), ((s\\supset s)\\supset (\\lnot s\\land (q\\land p))) \\}\\)"
         "\\(\\{ (((q\\land s)\\lor p)\\land ((p\\lor s)\\supset p)), ((r\\land r)\\supset ((p\\land r)\\equiv (p\\equiv p))) \\}\\)"
         "\\(\\{ (\\lnot (p\\land p)\\equiv (p\\land (p\\land r))), (\\lnot (r\\lor q)\\supset (s\\lor (q\\lor q))) \\}\\)"
         "\\(\\{ ((\\lnot (p\\lor (q\\land q))\\lor p)\\lor r), ((s\\lor p)\\equiv ((q\\land p)\\supset (s\\equiv p))) \\}\\)"
         "\\(\\{ (((r\\equiv (p\\land p))\\land r)\\supset (s\\supset q)), (((q\\supset (s\\land r))\\land (p\\equiv s))\\supset p) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\lor r)\\equiv ((q\\supset (p\\equiv s))\\supset r)),((p\\lor \\lnot r)\\lor ((p\\lor s)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100101000000111 és 1110110111111111"]
          ["\\(\\{ (((r\\equiv \\lnot r)\\supset r)\\land (s\\equiv q)),((s\\equiv r)\\supset ((r\\lor q)\\lor (q\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1001000001100101 és 0111111101111111"]
          ["\\(\\{ ((q\\supset (r\\equiv r))\\land (\\lnot r\\lor s)),(r\\supset (\\lnot p\\supset (r\\land \\lnot q))) \\}\\)" "az igazságtáblák főoszlopai: 1100110011010000 és 1110101111111111"]
          ["\\(\\{ \\lnot ((p\\equiv (r\\supset r))\\land (s\\land q)),(\\lnot \\lnot (\\lnot p\\lor s)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1100011111111010 és 0001001010100101"]
          ["\\(\\{ ((((p\\equiv \\lnot r)\\supset p)\\equiv r)\\equiv p),\\lnot ((p\\supset q)\\equiv (q\\lor \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 1101101001110011 és 0101000000100000"]
          ["\\(\\{ \\lnot (p\\equiv \\lnot (r\\land \\lnot r)),((\\lnot p\\equiv (p\\equiv r))\\lor (q\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111101100000000 és 1111111111111111"]
          ["\\(\\{ (\\lnot ((q\\lor q)\\lor \\lnot q)\\equiv q),(((s\\land p)\\supset r)\\lor ((s\\land r)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011111110000 és 1111011101111011"]
          ["\\(\\{ ((q\\lor ((q\\land p)\\supset (p\\lor r)))\\land q),((r\\supset r)\\equiv ((r\\lor r)\\lor (p\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0000001000000000"]
          ["\\(\\{ \\lnot ((\\lnot (r\\land p)\\supset s)\\supset p),(q\\supset ((s\\lor \\lnot (q\\lor s))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0101010100000000 és 1100111011110101"]
          ["\\(\\{ \\lnot (((s\\supset q)\\land r)\\equiv (p\\supset s)),\\lnot (((p\\land s)\\equiv \\lnot q)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1100010011110110 és 1100001110101111"]
          ["\\(\\{ (p\\supset \\lnot \\lnot \\lnot (r\\equiv r)),(r\\equiv \\lnot \\lnot \\lnot (q\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1111110111000110"]
          ["\\(\\{ ((s\\equiv ((r\\land p)\\land (q\\equiv q)))\\supset r),(((s\\lor s)\\lor (q\\equiv q))\\lor (q\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101110111 és 1101011101010101"]
          ["\\(\\{ ((\\lnot s\\equiv (r\\land p))\\land \\lnot r),((s\\lor r)\\supset \\lnot \\lnot \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0100000101000100 és 1110111011111000"]
          ["\\(\\{ (((s\\equiv q)\\lor s)\\equiv \\lnot \\lnot s),((p\\land (r\\lor r))\\lor \\lnot (p\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0100011000111111 és 0000111001110011"]
          ["\\(\\{ (p\\supset \\lnot \\lnot \\lnot (q\\equiv p)),((((s\\equiv p)\\equiv r)\\lor q)\\land (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111110000 és 0001000000000101"]
          ["\\(\\{ (\\lnot (s\\land r)\\equiv (s\\land (q\\land s))),(p\\supset (r\\equiv \\lnot (\\lnot r\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0001011100010100 és 1100111010110011"]
          ["\\(\\{ (\\lnot (p\\lor (p\\lor (r\\land r)))\\lor r),(p\\supset (((p\\equiv p)\\equiv r)\\equiv (r\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1111101100110011 és 1111011110110000"]
          ["\\(\\{ (\\lnot p\\land (p\\land \\lnot (p\\land r))),((p\\equiv q)\\supset \\lnot (r\\supset (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0010111111110010"]
          ["\\(\\{ ((r\\equiv (q\\supset r))\\supset \\lnot \\lnot r),(\\lnot r\\supset ((r\\lor (p\\supset q))\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0011111100111111"]
          ["\\(\\{ (\\lnot p\\land ((s\\lor (p\\supset r))\\equiv s)),(\\lnot p\\land ((p\\land \\lnot q)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0100000010000000 és 0100010010000000"]
          ["\\(\\{ (p\\supset ((q\\land s)\\land (r\\lor (r\\lor s)))),\\lnot (((q\\supset q)\\equiv r)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1100011110000101 és 1110101001000011"]
          ["\\(\\{ (((r\\equiv q)\\land ((p\\lor r)\\lor r))\\land r),((s\\equiv (p\\land r))\\land (p\\supset \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0010000000100011 és 1000110110001000"]
          ["\\(\\{ \\lnot (r\\lor ((p\\lor s)\\land (q\\equiv q))),\\lnot (r\\lor ((r\\lor q)\\lor (p\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1010111011001100 és 0010011011000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (p\\equiv (((s\\land p)\\supset (q\\equiv p))\\land s)), \\lnot ((r\\supset (q\\equiv p))\\land (s\\supset r)) \\}\\)"
         "\\(\\{ \\lnot (r\\land ((s\\supset (r\\equiv q))\\supset q)), (\\lnot (p\\supset p)\\lor (q\\equiv (r\\supset q))) \\}\\)"
         "\\(\\{ (((s\\lor r)\\supset q)\\land ((q\\equiv p)\\land p)), ((p\\lor p)\\land ((p\\equiv (q\\land s))\\equiv p)) \\}\\)"
         "\\(\\{ (((((s\\supset s)\\supset r)\\land q)\\lor s)\\lor s), ((q\\supset q)\\equiv ((q\\supset (r\\equiv q))\\supset q)) \\}\\)"
         "\\(\\{ (((s\\equiv q)\\land ((r\\lor q)\\supset p))\\equiv q), (s\\supset ((((r\\land r)\\lor q)\\supset q)\\land s)) \\}\\)"
         "\\(\\{ ((\\lnot p\\supset (r\\lor \\lnot q))\\land q), (q\\supset (\\lnot p\\supset ((q\\lor s)\\lor p))) \\}\\)"
         "\\(\\{ (p\\lor (q\\lor (\\lnot (r\\land s)\\supset s))), \\lnot ((p\\equiv (q\\supset p))\\land (q\\equiv r)) \\}\\)"
         "\\(\\{ ((q\\equiv \\lnot r)\\equiv ((q\\lor s)\\lor r)), (\\lnot ((s\\land q)\\equiv (q\\equiv r))\\equiv p) \\}\\)"
         "\\(\\{ (q\\supset (\\lnot ((p\\lor q)\\equiv q)\\equiv r)), ((q\\supset (p\\supset ((s\\supset r)\\equiv q)))\\supset q) \\}\\)"
         "\\(\\{ (\\lnot r\\supset (((p\\supset s)\\lor p)\\land p)), (\\lnot (r\\supset \\lnot p)\\supset \\lnot s) \\}\\)"
         "\\(\\{ ((s\\land r)\\lor (((s\\land s)\\lor q)\\lor q)), (\\lnot \\lnot (s\\equiv (r\\supset r))\\supset p) \\}\\)"
         "\\(\\{ \\lnot \\lnot (((q\\supset s)\\lor q)\\equiv s), \\lnot (((r\\land q)\\equiv p)\\lor (r\\equiv s)) \\}\\)"
         "\\(\\{ (\\lnot r\\equiv \\lnot (p\\supset (s\\supset r))), ((((q\\equiv (q\\lor p))\\lor q)\\equiv r)\\lor s) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((p\\supset p)\\supset (s\\land s))\\land (r\\lor r)),\\lnot (p\\equiv ((s\\equiv (q\\supset q))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 0000000000101010"]
          ["\\(\\{ (((q\\land p)\\lor (p\\supset s))\\supset (q\\lor s)),(((r\\lor (r\\equiv s))\\land r)\\land (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0101111101111111 és 0000001000000000"]
          ["\\(\\{ (((p\\land q)\\supset \\lnot r)\\lor (q\\lor q)),\\lnot ((s\\lor r)\\lor ((p\\land q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001111 és 0010111000000000"]
          ["\\(\\{ \\lnot \\lnot (p\\supset (s\\land \\lnot p)),(q\\supset ((q\\equiv q)\\equiv ((r\\lor p)\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1110111111110000"]
          ["\\(\\{ \\lnot ((p\\lor p)\\equiv ((q\\lor s)\\equiv p)),(\\lnot ((r\\land r)\\supset p)\\lor \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1001011010100000 és 1111111111110000"]
          ["\\(\\{ ((q\\lor p)\\equiv (r\\supset (p\\supset (q\\supset s)))),(r\\equiv (((r\\land q)\\land \\lnot q)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0010101000000011 és 0000001000000000"]
          ["\\(\\{ ((((s\\equiv \\lnot p)\\supset p)\\supset r)\\equiv q),(((s\\equiv p)\\supset s)\\equiv (q\\land \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1010110000100011 és 1001010010001100"]
          ["\\(\\{ \\lnot ((\\lnot q\\supset (q\\land s))\\lor p),\\lnot ((q\\supset (r\\land q))\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 0000111101110011"]
          ["\\(\\{ (((r\\equiv s)\\land p)\\equiv \\lnot \\lnot r),\\lnot (\\lnot q\\lor (\\lnot r\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1110100101010101 és 0010011000000000"]
          ["\\(\\{ (s\\land (s\\lor \\lnot ((p\\lor r)\\supset r))),\\lnot (q\\lor (((s\\land p)\\lor p)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 1100111011000000"]
          ["\\(\\{ (((p\\supset p)\\lor p)\\land ((q\\lor p)\\land r)),((q\\equiv ((p\\equiv p)\\lor p))\\supset (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000110011 és 1111111111110111"]
          ["\\(\\{ (r\\equiv (\\lnot \\lnot (q\\lor r)\\supset p)),(\\lnot (q\\land s)\\land \\lnot (p\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001110100110011 és 1100000100000000"]
          ["\\(\\{ ((q\\lor r)\\equiv (s\\supset (p\\land (r\\land q)))),((r\\land r)\\supset ((r\\equiv (q\\land s))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0111100011101011 és 1110100111101111"]
          ["\\(\\{ ((r\\lor s)\\land (q\\lor ((q\\equiv p)\\lor p))),((q\\equiv (r\\equiv s))\\land (s\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0100011101110111 és 0000000000000000"]
          ["\\(\\{ ((q\\lor (s\\supset q))\\lor (q\\supset (q\\supset p))),((p\\lor p)\\supset ((r\\supset s)\\equiv \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1110111111010010"]
          ["\\(\\{ ((r\\equiv q)\\equiv ((p\\supset (p\\lor r))\\supset p)),((p\\land p)\\equiv (\\lnot (r\\land q)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000100010100011 és 1100010111111111"]
          ["\\(\\{ (\\lnot \\lnot ((q\\lor q)\\land r)\\land q),(((r\\equiv s)\\land (r\\land p))\\land (p\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 0000000000010001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((p\\equiv p)\\equiv ((p\\land s)\\land p))\\lor p), ((s\\supset s)\\land ((p\\equiv q)\\land (p\\lor q))) \\}\\)"
         "\\(\\{ ((s\\equiv (r\\land s))\\lor ((p\\supset q)\\lor p)), ((\\lnot s\\lor s)\\lor ((r\\land r)\\supset r)) \\}\\)"
         "\\(\\{ ((p\\land \\lnot (p\\supset s))\\lor (r\\lor p)), ((r\\land ((p\\land (s\\lor r))\\land r))\\lor p) \\}\\)"
         "\\(\\{ (q\\equiv ((r\\lor \\lnot r)\\lor (r\\supset r))), (((s\\supset p)\\land r)\\land (q\\equiv (s\\lor q))) \\}\\)"
         "\\(\\{ \\lnot (r\\land ((q\\lor p)\\supset (p\\land q))), \\lnot \\lnot \\lnot (p\\supset \\lnot q) \\}\\)"
         "\\(\\{ (((r\\supset q)\\equiv (p\\land q))\\lor (r\\land s)), ((q\\supset (p\\supset (q\\lor p)))\\lor \\lnot q) \\}\\)"
         "\\(\\{ ((\\lnot (p\\supset q)\\equiv s)\\land (q\\lor s)), (r\\land ((p\\supset ((s\\land q)\\equiv s))\\supset r)) \\}\\)"
         "\\(\\{ ((r\\land q)\\land ((\\lnot r\\land s)\\lor r)), (q\\lor (((s\\equiv \\lnot r)\\lor p)\\supset r)) \\}\\)"
         "\\(\\{ ((q\\equiv (q\\supset q))\\lor ((r\\lor p)\\lor p)), \\lnot ((p\\lor r)\\land (s\\land (s\\supset p))) \\}\\)"
         "\\(\\{ (((s\\equiv q)\\supset p)\\supset (q\\lor (r\\equiv s))), ((r\\supset ((q\\equiv q)\\equiv s))\\lor (s\\equiv p)) \\}\\)"
         "\\(\\{ ((r\\lor s)\\lor (\\lnot r\\supset (q\\equiv p))), (s\\lor (s\\supset (\\lnot (p\\supset s)\\supset p))) \\}\\)"
         "\\(\\{ ((\\lnot r\\lor p)\\land ((p\\supset r)\\land q)), \\lnot \\lnot \\lnot ((r\\land p)\\land q) \\}\\)"
         "\\(\\{ ((((r\\land \\lnot s)\\land r)\\supset q)\\lor q), (q\\lor (p\\land (q\\land (q\\supset (q\\lor p))))) \\}\\)"
         "\\(\\{ (q\\supset (r\\land (s\\equiv \\lnot (p\\lor r)))), (\\lnot (q\\supset p)\\lor ((r\\supset r)\\lor p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\equiv (s\\land (p\\land s)))\\land (p\\supset q)),((\\lnot s\\lor (p\\land q))\\lor \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1100111010000101 és 1101111111111111"]
          ["\\(\\{ (\\lnot \\lnot \\lnot \\lnot s\\equiv p),((p\\land q)\\supset \\lnot ((p\\lor s)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1001110101010101 és 1101011100001000"]
          ["\\(\\{ ((p\\supset q)\\lor \\lnot ((r\\supset q)\\lor q)),(((q\\lor (r\\equiv p))\\land \\lnot p)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1111111110111111 és 0100010000000000"]
          ["\\(\\{ (((s\\equiv r)\\land (r\\lor r))\\equiv (s\\supset p)),\\lnot ((p\\equiv (s\\land q))\\lor (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0111011100010001 és 0000010111110000"]
          ["\\(\\{ \\lnot (\\lnot ((r\\equiv r)\\equiv s)\\supset q),(((r\\supset q)\\supset ((p\\supset r)\\lor p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1001011001010000 és 0000000011111111"]
          ["\\(\\{ (\\lnot (p\\land p)\\equiv ((s\\land q)\\supset s)),(\\lnot (p\\lor q)\\supset (q\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1101101110000000 és 1100111111111111"]
          ["\\(\\{ ((r\\equiv ((q\\lor (q\\equiv s))\\lor p))\\lor q),((q\\supset (s\\supset (s\\land q)))\\supset (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0111111110111111 és 0001011100000101"]
          ["\\(\\{ ((p\\equiv p)\\land ((s\\equiv (s\\supset s))\\supset p)),(\\lnot p\\land (q\\equiv (r\\lor \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 1000000000000000 és 0000001010000000"]
          ["\\(\\{ \\lnot (r\\land ((q\\supset p)\\supset (r\\lor r))),\\lnot (\\lnot s\\supset (s\\equiv (r\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1110100111001100 és 0010010110000010"]
          ["\\(\\{ ((s\\equiv (q\\supset p))\\land ((q\\lor s)\\lor p)),((((p\\supset q)\\lor s)\\equiv (q\\equiv r))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0101000101010101 és 0011101100000011"]
          ["\\(\\{ ((q\\supset q)\\equiv ((r\\equiv p)\\equiv (r\\lor r))),((r\\supset (s\\supset ((q\\lor q)\\supset s)))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 0111011101010101"]
          ["\\(\\{ ((s\\land ((p\\equiv r)\\land (s\\equiv p)))\\supset s),\\lnot \\lnot \\lnot \\lnot (q\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1101011111111111 és 1101111111110101"]
          ["\\(\\{ (q\\land \\lnot (((s\\lor r)\\lor q)\\supset r)),(\\lnot (((p\\equiv p)\\equiv q)\\equiv q)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000111000001100 és 0000010001010101"]
          ["\\(\\{ \\lnot (q\\land ((\\lnot p\\lor r)\\supset q)),(((q\\land q)\\supset (p\\supset s))\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1100111011110000"]
          ["\\(\\{ ((\\lnot (s\\lor (q\\supset s))\\lor r)\\lor p),(q\\supset (\\lnot ((r\\land r)\\equiv q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0011011111111111 és 1100111011111100"]
          ["\\(\\{ (q\\lor (q\\equiv ((s\\lor r)\\land \\lnot r))),\\lnot ((((r\\equiv p)\\land q)\\supset q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111111 és 1100111100000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((p\\land (p\\land (r\\supset r)))\\land p)\\lor s), (\\lnot \\lnot p\\equiv (s\\land (q\\lor s))) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot (s\\supset (p\\equiv q))\\supset r)), ((\\lnot (r\\equiv (p\\lor p))\\land p)\\lor r) \\}\\)"
         "\\(\\{ ((p\\supset ((s\\lor (r\\equiv p))\\lor p))\\supset q), (((q\\lor s)\\supset (s\\land p))\\land (p\\supset s)) \\}\\)"
         "\\(\\{ (\\lnot r\\supset \\lnot (q\\supset (p\\equiv r))), ((p\\land (q\\supset (s\\lor (p\\lor q))))\\supset p) \\}\\)"
         "\\(\\{ ((((q\\equiv p)\\lor (r\\equiv q))\\lor p)\\land q), (q\\equiv ((s\\lor (s\\lor (q\\lor s)))\\lor p)) \\}\\)"
         "\\(\\{ ((p\\equiv \\lnot r)\\supset ((r\\land s)\\land q)), \\lnot (((r\\supset \\lnot r)\\land s)\\equiv s) \\}\\)"
         "\\(\\{ ((q\\supset (s\\supset (s\\land p)))\\lor (p\\land q)), \\lnot \\lnot (r\\supset ((r\\equiv r)\\supset s)) \\}\\)"
         "\\(\\{ \\lnot (s\\equiv \\lnot ((r\\supset r)\\land p)), ((p\\land r)\\land ((s\\land s)\\land (r\\supset q))) \\}\\)"
         "\\(\\{ ((s\\lor ((s\\supset (p\\supset q))\\lor p))\\land q), (((r\\equiv p)\\lor \\lnot r)\\equiv (r\\equiv q)) \\}\\)"
         "\\(\\{ (s\\supset ((q\\lor r)\\lor (p\\lor (p\\equiv q)))), ((r\\supset r)\\lor (\\lnot \\lnot r\\supset r)) \\}\\)"
         "\\(\\{ (((q\\land p)\\equiv (q\\supset s))\\land (s\\lor s)), (((p\\supset p)\\equiv r)\\equiv (p\\equiv (s\\equiv r))) \\}\\)"
         "\\(\\{ ((s\\land (s\\equiv (r\\lor p)))\\land (q\\supset r)), (r\\lor (s\\land ((p\\equiv (p\\supset s))\\equiv p))) \\}\\)"
         "\\(\\{ (((r\\supset p)\\supset p)\\supset (\\lnot q\\lor q)), (((q\\lor (r\\equiv p))\\lor (q\\equiv q))\\equiv q) \\}\\)"
]
  :wrong [
          ["\\(\\{ (r\\land ((((p\\equiv r)\\lor p)\\lor s)\\supset r)),(((r\\lor r)\\equiv (s\\lor s))\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1010101110010110"]
          ["\\(\\{ (r\\land \\lnot ((r\\supset p)\\lor (r\\supset s))),((r\\supset s)\\lor (p\\supset (s\\lor (q\\equiv s)))) \\}\\)" "az igazságtáblák főoszlopai: 0010000100000000 és 1111111111111101"]
          ["\\(\\{ ((p\\lor (s\\equiv s))\\supset (\\lnot r\\equiv r)),(((p\\land (p\\equiv (p\\land q)))\\supset r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0001000010000000 és 0111111101011101"]
          ["\\(\\{ (q\\equiv (((s\\land p)\\land p)\\land (r\\land p))),((p\\supset (s\\supset q))\\land \\lnot (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011100001 és 0101101000001010"]
          ["\\(\\{ \\lnot \\lnot (\\lnot q\\supset \\lnot s),((s\\lor ((s\\lor r)\\equiv s))\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1001111110101111 és 1110100101110010"]
          ["\\(\\{ \\lnot ((p\\lor (r\\equiv r))\\land (q\\land r)),((q\\equiv (r\\supset q))\\lor (\\lnot p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000010 és 1111111111111111"]
          ["\\(\\{ (\\lnot (p\\supset \\lnot r)\\supset (q\\equiv p)),\\lnot ((p\\supset (\\lnot p\\equiv s))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001111 és 0001011001010000"]
          ["\\(\\{ (((p\\land p)\\equiv (q\\supset s))\\land (p\\lor s)),((\\lnot (r\\lor p)\\equiv r)\\land (q\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0001010011110101 és 0000000000001100"]
          ["\\(\\{ (\\lnot q\\land (\\lnot p\\lor (r\\lor p))),(r\\equiv ((q\\land (s\\supset r))\\supset (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1100011011110000 és 0010010100111011"]
          ["\\(\\{ (\\lnot ((q\\equiv s)\\supset r)\\equiv (r\\supset r)),\\lnot (\\lnot (q\\land s)\\supset (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1001000001000100 és 0010010100100010"]
          ["\\(\\{ (((s\\land q)\\supset p)\\equiv (s\\land (r\\land p))),\\lnot ((p\\land ((s\\lor r)\\land s))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0000010100010001 és 1110100110001000"]
          ["\\(\\{ (((p\\supset q)\\equiv p)\\supset (\\lnot s\\land r)),(\\lnot \\lnot (s\\equiv p)\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1101111101110010 és 1001100101011010"]
          ["\\(\\{ \\lnot ((p\\land (p\\land p))\\equiv (p\\supset s)),((p\\land (r\\land r))\\land ((q\\equiv q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1101011100101010 és 0000000000000000"]
          ["\\(\\{ (((s\\land q)\\supset p)\\equiv \\lnot (s\\land s)),(((q\\lor s)\\equiv (p\\supset (r\\supset r)))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 1001011110101010 és 1010000011111111"]
          ["\\(\\{ \\lnot (\\lnot r\\equiv (\\lnot q\\equiv q)),(p\\supset (\\lnot (\\lnot s\\land s)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111011001100 és 1101111110001111"]
          ["\\(\\{ (\\lnot (s\\supset s)\\land (p\\land (r\\supset p))),(\\lnot (s\\land q)\\supset ((q\\lor s)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1001011111111111"]
          ["\\(\\{ (((s\\supset (q\\lor (s\\land s)))\\equiv s)\\equiv r),((p\\lor r)\\equiv (q\\equiv (p\\supset \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 1010000100011001 és 1110001011110000"]
]}]