[{:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((r\\equiv s)\\supset s)\\lor ((q\\lor q)\\equiv p)), ((r\\equiv s)\\equiv (\\lnot s\\equiv \\lnot q)) \\}\\)"
         "\\(\\{ ((\\lnot q\\land s)\\supset (s\\supset \\lnot p)), (\\lnot ((s\\lor q)\\lor r)\\supset \\lnot p) \\}\\)"
         "\\(\\{ ((r\\supset (r\\land s))\\land ((p\\lor s)\\supset q)), ((p\\equiv ((q\\lor r)\\equiv p))\\supset (s\\lor s)) \\}\\)"
         "\\(\\{ (r\\supset (\\lnot (r\\land p)\\equiv (p\\land r))), (((r\\lor q)\\land p)\\equiv \\lnot \\lnot r) \\}\\)"
         "\\(\\{ \\lnot \\lnot (r\\lor \\lnot (p\\lor p)), ((s\\land q)\\supset \\lnot ((r\\equiv p)\\equiv p)) \\}\\)"
         "\\(\\{ ((q\\supset (s\\equiv r))\\lor ((r\\supset q)\\supset s)), \\lnot (((p\\supset r)\\equiv r)\\lor (q\\land q)) \\}\\)"
         "\\(\\{ ((\\lnot p\\equiv r)\\equiv (p\\land \\lnot r)), (\\lnot (p\\lor (q\\land (s\\supset q)))\\lor r) \\}\\)"
         "\\(\\{ ((q\\supset \\lnot q)\\lor ((s\\equiv r)\\lor s)), ((((r\\supset s)\\land p)\\equiv p)\\supset (s\\equiv s)) \\}\\)"
         "\\(\\{ (q\\lor (p\\equiv (\\lnot (q\\equiv q)\\land p))), ((\\lnot q\\equiv (s\\supset r))\\land (r\\supset r)) \\}\\)"
         "\\(\\{ (\\lnot q\\supset \\lnot \\lnot \\lnot s), ((p\\supset s)\\supset (\\lnot s\\equiv (r\\equiv q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\land (s\\supset r))\\supset (s\\supset (s\\lor s))),(q\\land \\lnot (((s\\land r)\\supset r)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0000110100001010"]
          ["\\(\\{ (\\lnot \\lnot (s\\equiv (q\\equiv q))\\land r),\\lnot (\\lnot \\lnot \\lnot q\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0001000100100010 és 1100010000101111"]
          ["\\(\\{ (\\lnot \\lnot (q\\lor p)\\land (p\\lor q)),((r\\supset q)\\land (((p\\supset q)\\supset r)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1110011011001111"]
          ["\\(\\{ \\lnot (\\lnot \\lnot p\\land \\lnot p),\\lnot ((s\\equiv s)\\lor \\lnot (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0000000100000101"]
          ["\\(\\{ (\\lnot s\\equiv \\lnot ((r\\lor r)\\equiv p)),(((p\\lor q)\\equiv s)\\equiv ((q\\supset q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0111011110011001 és 0101111110100101"]
          ["\\(\\{ (s\\land (\\lnot q\\lor \\lnot (q\\lor q))),\\lnot ((\\lnot s\\lor (r\\supset r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0100010001010000 és 1100111011110000"]
          ["\\(\\{ \\lnot ((p\\equiv p)\\lor ((p\\land q)\\land s)),(((s\\equiv \\lnot s)\\supset (p\\equiv r))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000110 és 0110010011010101"]
          ["\\(\\{ \\lnot ((s\\supset q)\\equiv (r\\supset \\lnot q)),(\\lnot ((q\\supset p)\\land (s\\supset p))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0111000001010011 és 0000000010000000"]
          ["\\(\\{ (r\\land (((q\\supset q)\\land p)\\land (q\\lor s))),((p\\equiv r)\\equiv (\\lnot (q\\equiv s)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010011 és 1111111000111100"]
          ["\\(\\{ (p\\equiv (\\lnot s\\lor (q\\land (r\\land p)))),\\lnot \\lnot (s\\land ((q\\land q)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0101010110101011 és 0101010101010101"]
          ["\\(\\{ \\lnot (s\\lor \\lnot (\\lnot r\\lor q)),(\\lnot (p\\lor p)\\equiv ((r\\land s)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1010111010001010 és 0000000101111110"]
          ["\\(\\{ ((((s\\lor s)\\land q)\\equiv s)\\equiv (s\\supset q)),(((q\\land (r\\equiv (r\\land p)))\\supset s)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1100001100111111 és 0000111100000101"]
          ["\\(\\{ (q\\lor (((\\lnot p\\equiv s)\\land r)\\supset s)),(((q\\supset s)\\lor \\lnot (q\\supset r))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1101111111011111 és 0010111100001111"]
          ["\\(\\{ (p\\equiv ((p\\lor (p\\supset p))\\lor (r\\equiv r))),\\lnot \\lnot ((s\\equiv \\lnot p)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0101100111111111"]
          ["\\(\\{ (\\lnot \\lnot p\\lor ((s\\land p)\\equiv p)),((p\\land (q\\land r))\\land ((q\\supset s)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0000000000000011"]
          ["\\(\\{ (((r\\supset s)\\land q)\\equiv (p\\supset (r\\equiv s))),((\\lnot s\\supset (q\\supset s))\\supset (r\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0010100011101011 és 1111011000101011"]
          ["\\(\\{ ((r\\supset q)\\equiv (\\lnot (q\\land q)\\supset s)),(s\\lor ((\\lnot s\\equiv p)\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0110101011101111 és 0101110111010101"]
          ["\\(\\{ (((r\\lor r)\\lor (p\\supset (r\\equiv p)))\\supset q),\\lnot (p\\lor \\lnot ((q\\lor p)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0010111101001111 és 1100111100000000"]
          ["\\(\\{ (\\lnot (s\\land q)\\supset (q\\land \\lnot s)),(q\\supset (r\\lor (s\\lor (r\\lor (s\\land p))))) \\}\\)" "az igazságtáblák főoszlopai: 0000110100001111 és 1111111111110111"]
          ["\\(\\{ \\lnot ((r\\lor q)\\supset ((r\\supset s)\\lor s)),(\\lnot (s\\land \\lnot r)\\supset (r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000100010 és 1110100101110111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((r\\supset r)\\lor \\lnot \\lnot \\lnot q), ((r\\land (\\lnot (p\\land p)\\equiv r))\\equiv q) \\}\\)"
         "\\(\\{ ((r\\supset (s\\land r))\\lor (\\lnot r\\supset q)), (((q\\supset r)\\lor (p\\equiv q))\\lor (q\\lor s)) \\}\\)"
         "\\(\\{ ((r\\supset (p\\lor \\lnot q))\\lor (q\\supset p)), (((r\\lor s)\\supset p)\\supset (s\\lor (s\\land r))) \\}\\)"
         "\\(\\{ (((s\\supset \\lnot (p\\lor q))\\lor p)\\lor q), ((s\\supset r)\\supset (p\\lor (q\\supset (r\\land p)))) \\}\\)"
         "\\(\\{ \\lnot (s\\supset (r\\lor ((s\\supset q)\\land q))), (r\\lor \\lnot (((p\\supset r)\\land p)\\lor q)) \\}\\)"
         "\\(\\{ ((p\\supset (q\\lor p))\\lor (q\\land (q\\land r))), (((r\\supset q)\\lor (q\\lor (q\\land r)))\\supset s) \\}\\)"
         "\\(\\{ (\\lnot (s\\supset p)\\land ((r\\lor q)\\supset p)), \\lnot ((\\lnot s\\supset q)\\supset (s\\land p)) \\}\\)"
         "\\(\\{ (((r\\lor s)\\supset ((s\\supset q)\\lor p))\\supset s), (\\lnot (p\\equiv s)\\supset ((p\\land r)\\lor s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (\\lnot (p\\supset p)\\land r)\\land s),(((q\\equiv r)\\land (r\\lor p))\\lor (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 0010000000101111"]
          ["\\(\\{ (\\lnot ((q\\lor q)\\supset (r\\land q))\\land p),(q\\equiv (s\\land (q\\equiv ((q\\equiv p)\\supset r)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001100 és 1000111011110001"]
          ["\\(\\{ (\\lnot \\lnot s\\supset (q\\land (s\\land q))),((\\lnot q\\supset p)\\equiv (p\\lor (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101111 és 0010100000000000"]
          ["\\(\\{ ((p\\lor s)\\equiv ((s\\land (p\\supset s))\\supset r)),\\lnot ((q\\lor p)\\lor (q\\supset (p\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 0011000001111011 és 0000111000000000"]
          ["\\(\\{ ((r\\land ((p\\lor r)\\lor p))\\equiv (q\\supset q)),(\\lnot ((s\\equiv (q\\lor s))\\land p)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0010010010110011 és 0011001100111111"]
          ["\\(\\{ (q\\land (p\\supset ((s\\lor s)\\equiv (q\\land r)))),(r\\equiv (q\\supset \\lnot \\lnot (r\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001001 és 0001010010111111"]
          ["\\(\\{ (((s\\lor (p\\supset p))\\equiv p)\\supset (q\\supset r)),((r\\lor \\lnot q)\\land ((q\\supset q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0000111100000011"]
          ["\\(\\{ ((s\\supset \\lnot q)\\equiv (p\\lor (p\\lor r))),(s\\equiv ((q\\land r)\\land \\lnot (s\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0011010000000110 és 1001110001101000"]
          ["\\(\\{ ((r\\land p)\\equiv ((p\\equiv s)\\lor (r\\equiv r))),(((r\\lor r)\\supset (r\\supset r))\\land (s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0001011010011001 és 0101000101010101"]
          ["\\(\\{ ((r\\land q)\\lor (((r\\equiv q)\\equiv q)\\equiv s)),((\\lnot s\\supset p)\\lor \\lnot (s\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1011111111111011 és 0101010111111111"]
          ["\\(\\{ ((\\lnot p\\land (q\\supset (s\\lor r)))\\land p),((s\\supset (q\\supset q))\\land (q\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000000 és 0000110100001010"]
          ["\\(\\{ ((q\\supset r)\\lor (\\lnot (p\\lor s)\\land s)),(\\lnot (s\\land (r\\supset (r\\land s)))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0000111100000000"]
          ["\\(\\{ \\lnot \\lnot (\\lnot q\\supset (p\\equiv r)),\\lnot (s\\lor (p\\lor (\\lnot s\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1110111100111111 és 1001110100000000"]
          ["\\(\\{ (r\\land ((q\\lor q)\\supset ((p\\land r)\\lor r))),\\lnot \\lnot \\lnot ((s\\equiv p)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1100011001101010"]
          ["\\(\\{ \\lnot ((q\\supset (r\\land q))\\lor (p\\supset q)),(q\\lor (\\lnot \\lnot r\\lor (p\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000000 és 1111111100111111"]
          ["\\(\\{ ((p\\equiv (p\\supset q))\\equiv \\lnot (p\\land p)),(\\lnot (q\\lor \\lnot (q\\supset p))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000101000001000 és 0000111000000000"]
          ["\\(\\{ ((q\\land q)\\lor ((q\\equiv r)\\equiv \\lnot r)),(r\\land ((q\\equiv (q\\supset \\lnot q))\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111100011111 és 0000000100110011"]
          ["\\(\\{ (\\lnot \\lnot s\\lor \\lnot (q\\lor p)),(((s\\equiv s)\\supset (s\\equiv q))\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1101111101010101 és 1000000001100000"]
          ["\\(\\{ (((q\\lor r)\\equiv q)\\equiv (s\\land (r\\land q))),(q\\equiv (q\\lor ((s\\supset p)\\lor (p\\land q)))) \\}\\)" "az igazságtáblák főoszlopai: 0011000111010001 és 0101101010001111"]
          ["\\(\\{ \\lnot ((r\\supset ((p\\supset q)\\lor p))\\supset s),\\lnot (((r\\land r)\\land s)\\supset (r\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1010111010101010 és 0010000100000000"]
          ["\\(\\{ (p\\land ((s\\land p)\\equiv (q\\land (s\\land p)))),\\lnot (((s\\lor s)\\equiv s)\\supset (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001101111 és 1101101111101110"]
          ["\\(\\{ ((((s\\lor s)\\supset (s\\equiv p))\\land p)\\supset p),(p\\land (r\\supset (p\\land \\lnot (r\\equiv q)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0000000011111100"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\lor (r\\lor r))\\lor \\lnot (s\\equiv p)), ((q\\equiv (((q\\land p)\\supset q)\\supset p))\\equiv r) \\}\\)"
         "\\(\\{ ((\\lnot s\\equiv s)\\lor ((s\\equiv p)\\lor r)), ((p\\land s)\\lor \\lnot (\\lnot r\\supset p)) \\}\\)"
         "\\(\\{ (\\lnot (s\\equiv (r\\equiv s))\\supset (s\\lor q)), ((r\\supset \\lnot p)\\land ((p\\land s)\\supset r)) \\}\\)"
         "\\(\\{ ((s\\lor ((r\\equiv p)\\supset (q\\land q)))\\supset s), ((\\lnot p\\supset r)\\lor (p\\equiv (r\\supset r))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (s\\supset (\\lnot p\\land ((q\\equiv q)\\lor s))),(r\\supset \\lnot (p\\equiv \\lnot (p\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1101111110101010 és 1110111111111111"]
          ["\\(\\{ (s\\equiv (p\\supset ((s\\equiv p)\\lor (s\\equiv q)))),(q\\equiv (\\lnot (\\lnot r\\equiv p)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0100100011011111 és 0010110000100011"]
          ["\\(\\{ (\\lnot (p\\land (r\\lor (p\\land p)))\\lor q),((p\\equiv p)\\land (r\\land ((r\\equiv q)\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1100111110001111 és 0000001000000000"]
          ["\\(\\{ ((r\\equiv (q\\equiv r))\\supset (p\\supset (s\\land p))),\\lnot (\\lnot p\\equiv (p\\supset (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1101011111010101 és 0000000100000101"]
          ["\\(\\{ (p\\lor ((((s\\land s)\\equiv p)\\supset p)\\land r)),((r\\equiv p)\\lor (r\\equiv (s\\equiv (p\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 0001000111111111 és 1111100111110111"]
          ["\\(\\{ \\lnot (q\\lor (((p\\lor q)\\land q)\\land p)),(r\\land ((q\\lor p)\\lor \\lnot (q\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0000001100110011"]
          ["\\(\\{ (((p\\supset (r\\supset s))\\land p)\\lor \\lnot q),\\lnot (\\lnot (p\\land p)\\supset (s\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111101 és 0101101010000000"]
          ["\\(\\{ (\\lnot ((p\\equiv \\lnot s)\\equiv p)\\equiv r),((((q\\supset q)\\lor p)\\lor (q\\supset q))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1011111110011001 és 1100111111111111"]
          ["\\(\\{ (((q\\land s)\\land (s\\supset q))\\lor (r\\equiv p)),(p\\land (\\lnot r\\equiv ((p\\equiv p)\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1110110100110111 és 0000000011100110"]
          ["\\(\\{ (q\\equiv (s\\land (p\\supset ((s\\land q)\\land p)))),(\\lnot (q\\equiv q)\\equiv (p\\lor (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1000100111110101 és 1001110100000000"]
          ["\\(\\{ ((s\\equiv r)\\supset (q\\land (\\lnot q\\lor q))),(p\\equiv \\lnot (((p\\land s)\\land q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0110111101101111 és 1001110101010000"]
          ["\\(\\{ (\\lnot (s\\land r)\\supset ((q\\equiv p)\\equiv s)),\\lnot \\lnot ((q\\land q)\\supset (s\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101000110110101 és 1101111011110101"]
          ["\\(\\{ (\\lnot (q\\supset s)\\supset \\lnot \\lnot p),\\lnot \\lnot ((r\\lor (q\\equiv q))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0111100001011001"]
          ["\\(\\{ (((s\\equiv (s\\equiv q))\\lor \\lnot q)\\land p),\\lnot (r\\supset (p\\land \\lnot (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0011001100110011"]
          ["\\(\\{ (s\\supset (p\\land ((q\\supset (s\\equiv q))\\equiv q))),((\\lnot (p\\supset p)\\land q)\\lor (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101111 és 0000010100000101"]
          ["\\(\\{ (((p\\lor \\lnot r)\\land s)\\lor (s\\lor s)),(\\lnot ((p\\lor s)\\equiv (r\\land p))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 1001111100111111"]
          ["\\(\\{ \\lnot (p\\supset ((p\\land (q\\supset s))\\land q)),(\\lnot q\\land (s\\lor ((q\\land s)\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111010 és 0100111001010000"]
          ["\\(\\{ (((s\\supset (p\\land s))\\lor (r\\land p))\\land s),((p\\supset \\lnot (s\\land (q\\lor p)))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0001010101010101 és 1100111110101111"]
          ["\\(\\{ ((s\\lor r)\\lor \\lnot \\lnot (p\\supset p)),((p\\land \\lnot (p\\equiv p))\\equiv (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111111 és 1100010111111100"]
          ["\\(\\{ ((p\\supset q)\\lor \\lnot (\\lnot q\\supset q)),(p\\lor ((q\\lor q)\\supset ((s\\supset r)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 1100111011111111"]
          ["\\(\\{ ((q\\equiv (q\\lor r))\\land (q\\equiv (r\\land q))),(\\lnot (q\\equiv s)\\lor (\\lnot p\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1100100000001011 és 0101101011011010"]
          ["\\(\\{ ((s\\equiv p)\\land (s\\supset ((q\\equiv s)\\supset p))),\\lnot (((r\\lor s)\\supset p)\\supset \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1001110101010101 és 0010011000110011"]
          ["\\(\\{ (((s\\lor p)\\equiv s)\\equiv ((s\\equiv q)\\equiv s)),(s\\supset ((s\\supset r)\\supset (r\\lor (q\\supset s)))) \\}\\)" "az igazságtáblák főoszlopai: 0000001111100101 és 1111111111111111"]
          ["\\(\\{ ((q\\equiv (r\\supset s))\\equiv (p\\supset \\lnot p)),(r\\equiv (r\\lor (\\lnot (r\\land s)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0011011111010010 és 1100011011111111"]
          ["\\(\\{ ((r\\land (p\\lor (p\\supset p)))\\supset (p\\equiv q)),\\lnot \\lnot \\lnot (\\lnot p\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1100111000101111 és 1000001000000000"]
          ["\\(\\{ ((s\\lor (p\\equiv q))\\land ((p\\land r)\\supset s)),(\\lnot ((q\\land (q\\supset q))\\land s)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1101011101011101 és 1111001111111011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot \\lnot (r\\land (\\lnot r\\lor s)), (\\lnot ((r\\land s)\\land r)\\supset (r\\equiv s)) \\}\\)"
         "\\(\\{ (((\\lnot q\\supset s)\\equiv q)\\lor (q\\supset s)), (\\lnot (r\\lor (r\\supset p))\\equiv (r\\supset s)) \\}\\)"
         "\\(\\{ (r\\lor ((((p\\lor r)\\lor q)\\land r)\\lor p)), ((\\lnot \\lnot q\\equiv (s\\equiv p))\\lor s) \\}\\)"
         "\\(\\{ \\lnot ((p\\supset (q\\lor s))\\land \\lnot s), ((r\\lor p)\\supset (s\\land (p\\supset (q\\supset s)))) \\}\\)"
         "\\(\\{ ((s\\lor \\lnot q)\\land ((r\\equiv p)\\supset p)), (r\\lor ((p\\land (r\\equiv r))\\lor (p\\equiv q))) \\}\\)"
         "\\(\\{ ((\\lnot q\\lor (r\\land s))\\lor (p\\lor p)), (((r\\supset \\lnot (p\\supset q))\\supset s)\\land r) \\}\\)"
         "\\(\\{ ((\\lnot r\\supset r)\\land (s\\land (p\\lor r))), \\lnot (((s\\lor s)\\lor p)\\supset (s\\supset p)) \\}\\)"
         "\\(\\{ \\lnot (\\lnot q\\supset ((s\\lor s)\\land r)), ((p\\equiv ((r\\supset s)\\land s))\\lor (p\\equiv r)) \\}\\)"
         "\\(\\{ \\lnot (r\\land ((q\\lor s)\\lor (p\\lor p))), ((q\\supset s)\\supset ((p\\supset s)\\lor (q\\equiv r))) \\}\\)"
         "\\(\\{ ((q\\land (((r\\supset q)\\lor q)\\equiv r))\\lor s), (((s\\land ((q\\equiv q)\\lor s))\\lor s)\\lor q) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\land \\lnot ((p\\supset (r\\lor q))\\supset p)),(\\lnot ((s\\lor r)\\land p)\\land (s\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000000 és 1000010001000000"]
          ["\\(\\{ (((r\\lor q)\\land q)\\equiv (r\\land (q\\equiv p))),\\lnot ((p\\lor r)\\equiv \\lnot \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1100110111110011 és 0110011010101010"]
          ["\\(\\{ \\lnot ((q\\supset (q\\equiv (p\\lor r)))\\land p),(((s\\land (p\\supset r))\\land r)\\land (r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0000000100010001"]
          ["\\(\\{ (((q\\supset q)\\supset (r\\equiv (p\\lor p)))\\lor q),((r\\land (r\\land (s\\land r)))\\lor (s\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111100111111 és 1001111110111111"]
          ["\\(\\{ (s\\equiv (p\\equiv (p\\equiv ((r\\lor r)\\supset p)))),((s\\equiv ((s\\land s)\\land s))\\lor \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0110010011010101 és 1100111011110000"]
          ["\\(\\{ (p\\land (s\\equiv (((s\\lor s)\\lor r)\\equiv r))),((\\lnot \\lnot s\\lor (p\\lor p))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000000011010001 és 0101010101010101"]
          ["\\(\\{ (\\lnot q\\supset (q\\supset (q\\land (p\\supset r)))),(\\lnot (p\\equiv r)\\supset ((p\\land q)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 1110111100111111"]
          ["\\(\\{ ((\\lnot r\\land s)\\lor (\\lnot q\\lor p)),\\lnot ((r\\land q)\\supset (p\\supset (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0010011000000010"]
          ["\\(\\{ ((((q\\lor r)\\supset p)\\equiv (p\\land q))\\land r),(((q\\supset p)\\land (q\\supset s))\\land (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100000011 és 0000000000010001"]
          ["\\(\\{ (q\\land (r\\supset \\lnot ((s\\lor r)\\supset p))),(\\lnot (p\\supset s)\\equiv (r\\supset (r\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001100 és 0010111000101010"]
          ["\\(\\{ \\lnot \\lnot (((p\\supset s)\\land q)\\land s),(\\lnot r\\supset ((\\lnot r\\land s)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000101 és 0111001111111111"]
          ["\\(\\{ \\lnot (((s\\supset q)\\equiv \\lnot r)\\equiv p),((p\\supset p)\\equiv (\\lnot p\\supset (p\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1010111101100011 és 1101101111111111"]
          ["\\(\\{ ((s\\supset p)\\land ((r\\equiv q)\\land (r\\supset p))),((q\\supset ((s\\supset q)\\equiv r))\\lor (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1000000000100011 és 1111111011111111"]
          ["\\(\\{ (\\lnot ((q\\equiv s)\\equiv (s\\land q))\\supset s),((s\\land p)\\supset (\\lnot (p\\equiv p)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0101110111011111 és 1100111101101111"]
          ["\\(\\{ (((q\\equiv s)\\land \\lnot s)\\land \\lnot q),(\\lnot (q\\land r)\\equiv ((p\\land q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1000000000100000 és 1101100011011110"]
          ["\\(\\{ (q\\supset (((r\\lor s)\\supset s)\\land (r\\land p))),((s\\land r)\\lor (((s\\lor r)\\equiv r)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110001 és 1001001111111111"]
          ["\\(\\{ \\lnot \\lnot (q\\lor \\lnot \\lnot r),(\\lnot (p\\lor (q\\equiv r))\\equiv (r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0011111100111111 és 0010000011111111"]
          ["\\(\\{ ((r\\lor p)\\supset ((p\\land (s\\equiv r))\\land r)),((p\\land \\lnot (q\\lor q))\\lor (q\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1110100100010001 és 0101111111111111"]
          ["\\(\\{ ((\\lnot ((r\\land r)\\equiv q)\\lor r)\\equiv r),(((q\\lor p)\\supset p)\\land \\lnot (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1100110000001011 és 1000111010001000"]
          ["\\(\\{ \\lnot ((q\\equiv \\lnot (r\\land r))\\supset r),(((r\\lor s)\\lor p)\\equiv \\lnot (q\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0010111000001100 és 0110001100000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\land (q\\lor (q\\lor q)))\\lor (p\\supset s)), ((q\\equiv ((s\\supset (r\\land p))\\supset r))\\equiv p) \\}\\)"
         "\\(\\{ (((q\\supset (s\\equiv p))\\lor (q\\land q))\\land q), (\\lnot ((q\\supset p)\\equiv (s\\supset p))\\supset p) \\}\\)"
         "\\(\\{ \\lnot ((q\\equiv (q\\supset r))\\supset (s\\lor p)), (\\lnot ((q\\supset (p\\equiv r))\\supset p)\\lor r) \\}\\)"
         "\\(\\{ (p\\lor ((q\\land q)\\supset (\\lnot q\\lor p))), (\\lnot s\\lor ((p\\lor (q\\supset q))\\equiv s)) \\}\\)"
         "\\(\\{ (\\lnot s\\lor (\\lnot q\\land (q\\lor s))), ((r\\lor q)\\land ((q\\lor (q\\land p))\\lor q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((\\lnot s\\land \\lnot (q\\equiv r))\\equiv r),\\lnot ((r\\land r)\\lor (p\\equiv (q\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1111011011100100 és 1110011011000000"]
          ["\\(\\{ ((p\\lor (q\\lor r))\\land (q\\supset (r\\lor r))),((p\\supset (p\\land s))\\supset ((s\\lor p)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0011111111110011 és 0001000110111011"]
          ["\\(\\{ \\lnot (((p\\supset r)\\lor r)\\lor (q\\lor q)),(q\\supset ((q\\land p)\\supset (q\\equiv (s\\land q)))) \\}\\)" "az igazságtáblák főoszlopai: 0010011001000000 és 1100111011111101"]
          ["\\(\\{ (\\lnot r\\equiv ((q\\land s)\\supset (r\\land q))),((p\\land (q\\supset p))\\supset \\lnot (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1111000000101000 és 1111011111001100"]
          ["\\(\\{ (s\\supset \\lnot (r\\equiv \\lnot (s\\supset s))),((q\\supset (r\\land (s\\lor (r\\supset s))))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 0011001100110001"]
          ["\\(\\{ \\lnot ((r\\equiv (p\\supset p))\\land (r\\supset p)),\\lnot (s\\land (q\\land \\lnot \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1111001111001100 és 1100011000000110"]
          ["\\(\\{ ((q\\lor ((r\\supset q)\\land (p\\land r)))\\lor p),((r\\land q)\\land (s\\land \\lnot (r\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 0000000100000000"]
          ["\\(\\{ (\\lnot (s\\lor (s\\equiv s))\\land (s\\land q)),(((s\\lor r)\\equiv (q\\land s))\\equiv (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 1001011000000001"]
          ["\\(\\{ (s\\supset ((q\\supset \\lnot (p\\land p))\\land p)),((q\\lor p)\\equiv \\lnot (p\\lor (q\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111010 és 1100011100000000"]
          ["\\(\\{ (q\\equiv (q\\supset (\\lnot (q\\lor r)\\supset p))),\\lnot ((\\lnot (r\\supset q)\\equiv r)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0010101010001111 és 1001011010101001"]
          ["\\(\\{ ((\\lnot p\\equiv (r\\lor p))\\land (r\\land q)),\\lnot ((r\\equiv p)\\equiv \\lnot (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000000 és 1100011101111111"]
          ["\\(\\{ ((p\\supset p)\\land ((q\\lor r)\\lor \\lnot s)),(q\\land ((p\\equiv (s\\land r))\\equiv (r\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1000011010111111 és 0000001000001101"]
          ["\\(\\{ (r\\land (((q\\land p)\\land (p\\lor s))\\land r)),(q\\supset (\\lnot (p\\equiv (s\\equiv r))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000011 és 1100111011110110"]
          ["\\(\\{ (r\\land (p\\supset \\lnot ((r\\land p)\\supset p))),((s\\lor (q\\supset p))\\supset (s\\supset \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000000 és 1101111111111010"]
          ["\\(\\{ ((p\\equiv r)\\supset (s\\lor (s\\land \\lnot p))),\\lnot ((r\\equiv r)\\lor (s\\supset (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0111011111011101 és 0001011000000000"]
          ["\\(\\{ (s\\supset (q\\land (\\lnot p\\land (p\\supset r)))),(r\\equiv ((((q\\equiv q)\\lor p)\\supset r)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1001111110101010 és 1100011011111111"]
          ["\\(\\{ ((s\\equiv p)\\supset (q\\equiv \\lnot (s\\equiv s))),\\lnot ((p\\supset (r\\equiv r))\\land (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111010 és 0000001011111111"]
          ["\\(\\{ (((s\\equiv r)\\equiv q)\\land (p\\equiv (q\\supset q))),\\lnot ((r\\land (s\\equiv (s\\supset r)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0000101011101001 és 1100011000011110"]
          ["\\(\\{ ((r\\land (p\\equiv \\lnot r))\\lor (p\\lor p)),\\lnot \\lnot (\\lnot r\\supset (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001111111111 és 1011001101110111"]
          ["\\(\\{ (((s\\supset (s\\equiv q))\\lor q)\\supset \\lnot r),((r\\lor s)\\equiv (r\\equiv (p\\land (s\\lor q)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011100 és 0101011100011011"]
          ["\\(\\{ \\lnot (\\lnot \\lnot p\\lor (r\\supset s)),\\lnot \\lnot ((\\lnot r\\lor q)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0010010100000000 és 0111011101110101"]
          ["\\(\\{ (\\lnot ((s\\lor s)\\land (p\\lor s))\\land p),(((s\\land p)\\land (s\\land q))\\land (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010101010 és 0000000000000101"]
          ["\\(\\{ \\lnot ((\\lnot r\\supset s)\\land (p\\lor q)),(((\\lnot p\\land q)\\land r)\\lor (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1100000110001000 és 1011111110111011"]
          ["\\(\\{ ((((s\\equiv q)\\equiv q)\\land (p\\land r))\\lor r),\\lnot \\lnot \\lnot ((q\\land r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0001110100000010"]
          ["\\(\\{ (s\\lor ((q\\lor q)\\equiv ((p\\equiv q)\\equiv r))),(((p\\land r)\\supset (r\\land p))\\equiv (p\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1111010111110111 és 1100011010111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot \\lnot (s\\lor p)\\lor (s\\land r)), (((((q\\land s)\\land r)\\lor p)\\lor r)\\lor q) \\}\\)"
         "\\(\\{ (((r\\land r)\\equiv r)\\lor (s\\equiv (r\\equiv r))), ((((r\\lor p)\\land \\lnot s)\\supset s)\\supset p) \\}\\)"
         "\\(\\{ (\\lnot \\lnot ((q\\land p)\\land s)\\supset q), \\lnot ((r\\supset r)\\lor \\lnot \\lnot s) \\}\\)"
         "\\(\\{ ((q\\lor s)\\supset (s\\lor ((q\\equiv s)\\land q))), ((p\\equiv (p\\land s))\\supset (s\\supset (p\\equiv r))) \\}\\)"
         "\\(\\{ (\\lnot s\\equiv (p\\land \\lnot (q\\lor s))), ((\\lnot p\\equiv p)\\supset (\\lnot r\\lor q)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (r\\lor \\lnot (q\\supset s)), \\lnot ((r\\supset (p\\lor r))\\equiv (s\\supset s)) \\}\\)"
         "\\(\\{ ((r\\lor p)\\equiv ((p\\supset p)\\lor (s\\supset q))), (\\lnot (r\\equiv s)\\equiv ((p\\land s)\\land s)) \\}\\)"
         "\\(\\{ \\lnot (\\lnot q\\supset ((s\\equiv s)\\supset s)), ((q\\supset ((q\\lor p)\\supset r))\\supset (p\\land p)) \\}\\)"
         "\\(\\{ (q\\lor (((p\\supset s)\\lor (p\\equiv p))\\land r)), ((p\\lor q)\\equiv ((s\\equiv (r\\supset s))\\equiv p)) \\}\\)"
         "\\(\\{ ((((p\\supset r)\\supset p)\\equiv q)\\equiv (p\\equiv s)), ((q\\equiv (q\\equiv p))\\lor (q\\equiv (s\\land r))) \\}\\)"
         "\\(\\{ (((s\\lor \\lnot p)\\supset p)\\land \\lnot s), ((p\\supset (s\\supset p))\\lor (p\\equiv (r\\equiv q))) \\}\\)"
         "\\(\\{ \\lnot (q\\lor ((r\\lor (s\\lor s))\\lor p)), ((((q\\land p)\\lor p)\\supset p)\\land (r\\supset q)) \\}\\)"
         "\\(\\{ (((s\\equiv (q\\equiv (s\\land q)))\\supset p)\\supset p), (\\lnot (s\\land q)\\equiv (r\\supset (q\\land s))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((s\\supset (q\\land (\\lnot s\\equiv q)))\\equiv q),\\lnot \\lnot (((q\\land q)\\land p)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0101100011011010 és 1100011011111111"]
          ["\\(\\{ ((q\\lor ((p\\equiv q)\\lor \\lnot p))\\supset s),\\lnot \\lnot (\\lnot r\\lor (s\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101111101110101 és 1111100111101101"]
          ["\\(\\{ ((\\lnot r\\land p)\\supset \\lnot (r\\land p)),((q\\supset p)\\equiv (\\lnot s\\land (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010111111 és 1000100010100010"]
          ["\\(\\{ (\\lnot (((s\\lor q)\\land p)\\supset r)\\supset r),((s\\supset (q\\land s))\\equiv \\lnot (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111011101110011 és 1001000100111010"]
          ["\\(\\{ ((\\lnot r\\equiv (s\\lor (p\\equiv q)))\\equiv s),((q\\lor p)\\land ((r\\land r)\\supset (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0110000000100110 és 0000100111011101"]
          ["\\(\\{ (p\\land (q\\supset (q\\land ((q\\lor s)\\equiv q)))),((q\\land s)\\land \\lnot ((s\\supset r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0000010000000100"]
          ["\\(\\{ \\lnot (p\\lor \\lnot \\lnot (q\\lor p)),\\lnot ((r\\equiv (p\\supset r))\\lor (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 1110100100000000"]
          ["\\(\\{ (\\lnot (r\\lor \\lnot p)\\equiv (s\\land s)),((q\\supset \\lnot q)\\supset (q\\land \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1010000111100110 és 0000111100001111"]
          ["\\(\\{ ((p\\land (r\\supset (p\\equiv p)))\\supset (p\\land p)),(\\lnot (((r\\equiv p)\\equiv s)\\land r)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0011001100110011"]
          ["\\(\\{ (\\lnot \\lnot s\\lor (r\\equiv (q\\supset q))),((\\lnot (q\\land s)\\lor r)\\supset (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0111010111110111 és 0011101100110111"]
          ["\\(\\{ ((r\\supset \\lnot \\lnot r)\\equiv \\lnot r),\\lnot ((s\\lor s)\\supset \\lnot (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1101100000101100 és 0010011000010001"]
          ["\\(\\{ (((s\\equiv \\lnot \\lnot r)\\equiv s)\\supset p),(\\lnot (s\\lor r)\\lor ((s\\land p)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1110101011111111 és 1111111111111011"]
          ["\\(\\{ (((p\\supset r)\\land ((r\\lor q)\\supset r))\\land q),(\\lnot ((q\\lor r)\\equiv r)\\equiv (s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000011100000011 és 1001001110100110"]
          ["\\(\\{ (((r\\lor r)\\land ((s\\lor s)\\equiv q))\\supset r),\\lnot ((s\\lor r)\\equiv \\lnot (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111101100111111 és 0101001001010101"]
          ["\\(\\{ (s\\lor (q\\supset ((p\\land r)\\supset (s\\supset p)))),\\lnot ((p\\supset s)\\land (q\\land (r\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1100000111111010"]
          ["\\(\\{ (\\lnot q\\land \\lnot \\lnot (r\\equiv q)),((s\\lor (s\\lor (s\\equiv (s\\equiv s))))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1100010000100000 és 0001000100110011"]
          ["\\(\\{ \\lnot ((\\lnot r\\lor \\lnot r)\\equiv r),\\lnot (p\\equiv (s\\lor (s\\lor (s\\supset q)))) \\}\\)" "az igazságtáblák főoszlopai: 1101101011111111 és 1101111100000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot ((p\\land \\lnot (s\\supset p))\\lor q), (r\\land ((q\\lor (p\\lor q))\\lor \\lnot q)) \\}\\)"
         "\\(\\{ (((r\\equiv q)\\equiv (p\\supset r))\\equiv (p\\supset p)), ((r\\equiv ((p\\lor s)\\lor p))\\supset (q\\equiv p)) \\}\\)"
         "\\(\\{ (((\\lnot p\\supset (s\\lor p))\\supset q)\\lor p), ((\\lnot ((p\\equiv p)\\supset q)\\lor s)\\equiv p) \\}\\)"
         "\\(\\{ \\lnot ((p\\land r)\\supset (p\\lor (r\\supset p))), (\\lnot p\\land \\lnot (p\\supset \\lnot q)) \\}\\)"
         "\\(\\{ \\lnot (s\\supset \\lnot \\lnot (q\\lor q)), \\lnot \\lnot \\lnot ((s\\supset s)\\lor r) \\}\\)"
         "\\(\\{ \\lnot (s\\lor \\lnot ((p\\land r)\\supset s)), (r\\supset ((q\\lor ((r\\lor s)\\equiv p))\\supset r)) \\}\\)"
         "\\(\\{ (r\\lor \\lnot \\lnot (q\\equiv (s\\land r))), \\lnot (q\\land (q\\land (q\\equiv (r\\equiv q)))) \\}\\)"
         "\\(\\{ \\lnot \\lnot (q\\supset (r\\land (p\\supset q))), (\\lnot ((r\\land s)\\lor p)\\supset (r\\supset q)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot \\lnot (q\\lor s)\\lor q), (\\lnot (q\\equiv q)\\lor ((s\\equiv r)\\land r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((p\\equiv q)\\lor (p\\land q)), ((r\\supset ((s\\lor q)\\equiv p))\\supset \\lnot r) \\}\\)"
         "\\(\\{ (q\\equiv ((p\\equiv q)\\lor ((p\\land q)\\supset r))), (r\\supset \\lnot ((p\\lor q)\\lor (r\\lor q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\land r)\\land (((s\\land q)\\lor r)\\supset q)),(((q\\land \\lnot q)\\supset (p\\supset q))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 0100010101010101"]
          ["\\(\\{ (((r\\equiv s)\\land r)\\equiv (p\\land \\lnot p)),(((s\\supset s)\\equiv s)\\lor \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1110100101101110 és 0100101011111111"]
          ["\\(\\{ (q\\supset (r\\land (((r\\supset q)\\equiv q)\\lor s))),((\\lnot r\\lor ((q\\supset q)\\lor r))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0101010101010101"]
          ["\\(\\{ (\\lnot ((r\\supset p)\\equiv (r\\equiv r))\\land q),((p\\land r)\\land ((r\\lor r)\\supset (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0000000000110011"]
          ["\\(\\{ (s\\equiv (p\\supset (p\\supset (s\\equiv (s\\supset r))))),((s\\supset (q\\equiv (p\\equiv q)))\\lor \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0111100100111011 és 1101111111111111"]
          ["\\(\\{ ((\\lnot p\\supset s)\\supset \\lnot (r\\land s)),\\lnot ((q\\lor p)\\land ((p\\equiv s)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111101110 és 1100100000000000"]
          ["\\(\\{ ((q\\equiv (r\\supset (q\\supset r)))\\land \\lnot p),(p\\land (((r\\lor q)\\supset \\lnot s)\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000001010000000 és 0000000000011111"]
          ["\\(\\{ ((r\\land s)\\supset (\\lnot (q\\land r)\\lor q)),\\lnot (q\\equiv (((r\\lor q)\\equiv s)\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0110010111110000"]
          ["\\(\\{ (\\lnot (s\\land (r\\equiv r))\\lor (q\\equiv p)),((s\\land s)\\lor ((q\\land s)\\land (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1100111000001111 és 0101010101010101"]
          ["\\(\\{ ((q\\supset s)\\supset (((r\\lor p)\\equiv r)\\supset p)),(r\\equiv ((s\\land r)\\supset ((q\\equiv q)\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0001011011111111 és 0000110010100010"]
          ["\\(\\{ (p\\land (((q\\supset q)\\lor \\lnot r)\\lor r)),((p\\lor q)\\equiv (s\\equiv (p\\supset (q\\lor p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1001011011010101"]
          ["\\(\\{ ((s\\land s)\\equiv ((q\\lor p)\\equiv (p\\land r))),((r\\lor (r\\supset ((r\\equiv r)\\land s)))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0101000110011001 és 0010101010001111"]
          ["\\(\\{ ((r\\lor (s\\supset (r\\supset q)))\\land (p\\land p)),(((p\\equiv r)\\equiv ((q\\equiv q)\\supset q))\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 1111011100111111"]
          ["\\(\\{ (q\\land ((s\\supset s)\\land ((r\\land s)\\land p))),(s\\land (r\\equiv \\lnot ((p\\equiv p)\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000001 és 0100000101000100"]
          ["\\(\\{ (p\\lor ((r\\equiv r)\\lor (p\\lor (s\\supset q)))),((((p\\land (q\\lor r))\\land r)\\lor s)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 1001000001000111"]
          ["\\(\\{ (\\lnot (((q\\equiv s)\\lor r)\\supset r)\\land r),(\\lnot \\lnot \\lnot p\\equiv (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0010000100000000 és 0010110101001100"]
          ["\\(\\{ ((s\\land p)\\equiv (r\\land (\\lnot q\\equiv q))),(r\\lor (((s\\equiv p)\\supset s)\\supset (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1100010110101010 és 1111111111111111"]
          ["\\(\\{ (p\\equiv (\\lnot ((q\\equiv q)\\land s)\\equiv q)),(p\\supset \\lnot ((r\\equiv (q\\supset p))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1000110111110000 és 1111011011100110"]
          ["\\(\\{ (((r\\supset r)\\equiv ((s\\lor q)\\lor s))\\supset q),((p\\supset ((q\\supset q)\\supset (p\\lor s)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1010111110101111 és 0000000011111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot \\lnot (p\\lor (p\\supset r))\\land s), \\lnot (p\\lor ((s\\land q)\\supset (q\\land r))) \\}\\)"
         "\\(\\{ (p\\supset (r\\supset (\\lnot p\\equiv (q\\supset s)))), ((q\\land p)\\supset (s\\land ((s\\lor p)\\supset r))) \\}\\)"
         "\\(\\{ (s\\lor (q\\supset \\lnot (p\\lor (q\\lor p)))), (s\\lor \\lnot (((p\\supset s)\\land q)\\lor r)) \\}\\)"
         "\\(\\{ (((s\\land s)\\supset r)\\land \\lnot (r\\supset p)), \\lnot (p\\lor (\\lnot (q\\lor r)\\equiv s)) \\}\\)"
         "\\(\\{ ((s\\equiv ((s\\lor q)\\supset p))\\supset (p\\supset r)), (\\lnot (((r\\lor q)\\land s)\\equiv s)\\equiv r) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (\\lnot p\\supset r)\\land q), (((q\\supset r)\\supset r)\\lor (p\\land \\lnot s)) \\}\\)"
         "\\(\\{ ((s\\lor (q\\lor q))\\lor (r\\lor (p\\lor r))), (q\\land ((p\\lor s)\\equiv (q\\supset (p\\land r)))) \\}\\)"
         "\\(\\{ (q\\land (\\lnot (q\\supset s)\\supset (s\\equiv p))), ((s\\supset (r\\lor s))\\land \\lnot \\lnot q) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (p\\equiv r)\\land \\lnot r), \\lnot (\\lnot (s\\land s)\\supset \\lnot r) \\}\\)"
         "\\(\\{ \\lnot (((r\\land (p\\lor p))\\supset q)\\land r), (\\lnot r\\lor (s\\lor \\lnot (q\\supset p))) \\}\\)"
         "\\(\\{ ((r\\equiv (q\\land p))\\lor ((s\\lor r)\\equiv q)), \\lnot (((s\\land s)\\equiv (q\\supset q))\\equiv q) \\}\\)"
         "\\(\\{ (\\lnot r\\lor (\\lnot \\lnot p\\lor s)), (((r\\equiv s)\\supset p)\\supset (q\\land (s\\supset r))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((r\\land (q\\equiv q))\\equiv (r\\land p))\\land p),((((s\\equiv r)\\supset p)\\equiv p)\\supset (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000101100 és 0110011001010101"]
          ["\\(\\{ \\lnot (q\\land \\lnot (s\\land (s\\lor q))),\\lnot (((p\\supset s)\\equiv (r\\land p))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1100110111110101 és 1001011010100010"]
          ["\\(\\{ (\\lnot ((p\\land q)\\supset p)\\equiv \\lnot s),\\lnot ((p\\land \\lnot p)\\land (s\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0101010111010101 és 1100011000000000"]
          ["\\(\\{ ((r\\land p)\\supset ((\\lnot r\\equiv s)\\supset p)),((s\\supset p)\\land (p\\lor ((q\\equiv q)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111011111111 és 0001100111111111"]
          ["\\(\\{ (\\lnot p\\supset (s\\land (\\lnot q\\equiv s))),((s\\supset ((q\\equiv s)\\supset (q\\land s)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0101000111111111 és 0000000011111111"]
          ["\\(\\{ (((s\\equiv (p\\supset r))\\equiv (q\\supset s))\\land r),\\lnot (s\\equiv (\\lnot p\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001000010011 és 1101000111010101"]
          ["\\(\\{ ((p\\lor q)\\land (((q\\land q)\\equiv p)\\land p)),(p\\lor \\lnot ((q\\lor s)\\lor \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001111 és 0001011011111111"]
          ["\\(\\{ (((p\\equiv p)\\lor \\lnot s)\\equiv (q\\supset r)),(((q\\lor s)\\land s)\\supset (q\\supset \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 1111101001100110 és 1101111111111010"]
          ["\\(\\{ ((q\\lor r)\\lor \\lnot ((r\\supset s)\\equiv p)),\\lnot ((p\\supset r)\\equiv (s\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100111111 és 1010111010011001"]
          ["\\(\\{ ((q\\lor (p\\land s))\\land (p\\supset (r\\supset p))),\\lnot ((r\\equiv s)\\supset (r\\supset (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111101011111 és 0010011000000000"]
          ["\\(\\{ \\lnot (s\\lor ((r\\supset s)\\supset \\lnot p)),(\\lnot (s\\supset p)\\lor \\lnot (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0010111000001000 és 1101111111110000"]
          ["\\(\\{ ((p\\land (p\\lor q))\\land \\lnot (s\\supset q)),((s\\supset (q\\land (q\\equiv q)))\\land (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001010000 és 0001010110101010"]
          ["\\(\\{ (\\lnot (q\\lor s)\\supset ((r\\supset q)\\land q)),\\lnot (\\lnot (\\lnot p\\land p)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011111 és 1100011010000000"]
          ["\\(\\{ \\lnot (\\lnot (r\\lor (p\\equiv q))\\equiv r),(\\lnot \\lnot (r\\supset q)\\supset (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0001010111110011 és 0011011000110011"]
          ["\\(\\{ \\lnot (\\lnot r\\supset (s\\lor (r\\lor p))),(((\\lnot (s\\land p)\\supset p)\\supset r)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1010111000000000 és 0000000010110011"]
          ["\\(\\{ ((\\lnot (r\\lor r)\\lor q)\\supset (q\\equiv s)),\\lnot (\\lnot (r\\lor (r\\supset r))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1011011001110101 és 1111101100000000"]
          ["\\(\\{ \\lnot (((s\\supset p)\\land p)\\supset (s\\lor s)),\\lnot ((((q\\supset r)\\supset p)\\equiv s)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0001111000101010 és 1100011110101010"]
          ["\\(\\{ \\lnot (q\\lor (\\lnot r\\lor \\lnot s)),((q\\lor s)\\land (r\\supset (s\\supset (s\\lor r)))) \\}\\)" "az igazságtáblák főoszlopai: 0010011000010000 és 0101111101011111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot ((s\\equiv p)\\lor ((s\\land r)\\land q)), (q\\supset (((q\\land r)\\land q)\\supset (r\\lor p))) \\}\\)"
         "\\(\\{ (\\lnot q\\lor \\lnot ((s\\supset s)\\supset q)), (p\\supset \\lnot (p\\supset (q\\lor (q\\equiv s)))) \\}\\)"
         "\\(\\{ ((s\\land ((q\\lor q)\\equiv p))\\supset (p\\supset q)), (\\lnot s\\land \\lnot ((p\\equiv q)\\lor r)) \\}\\)"
         "\\(\\{ (((s\\lor (p\\land r))\\supset q)\\supset (s\\supset s)), \\lnot (((r\\equiv q)\\land s)\\equiv (p\\supset r)) \\}\\)"
         "\\(\\{ ((\\lnot q\\land p)\\lor \\lnot \\lnot s), ((s\\supset (r\\lor s))\\lor (q\\supset (p\\land p))) \\}\\)"
         "\\(\\{ \\lnot (r\\equiv \\lnot (r\\equiv (q\\supset s))), (\\lnot ((p\\equiv q)\\lor s)\\supset (p\\supset q)) \\}\\)"
         "\\(\\{ ((p\\equiv (s\\equiv q))\\supset (q\\land (q\\equiv p))), \\lnot ((p\\supset (q\\supset s))\\supset (q\\lor s)) \\}\\)"
         "\\(\\{ (p\\supset (((q\\equiv r)\\lor q)\\lor (r\\equiv s))), (q\\lor \\lnot \\lnot \\lnot \\lnot p) \\}\\)"
         "\\(\\{ ((p\\supset r)\\equiv \\lnot (p\\land (q\\lor p))), ((\\lnot r\\supset p)\\equiv \\lnot \\lnot p) \\}\\)"
         "\\(\\{ (p\\lor ((q\\land p)\\land \\lnot (s\\equiv q))), (((s\\lor s)\\supset (q\\equiv (p\\supset p)))\\supset p) \\}\\)"
         "\\(\\{ (r\\supset (r\\equiv ((\\lnot p\\land p)\\lor s))), \\lnot ((s\\supset (s\\lor s))\\supset (s\\land p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((p\\lor (r\\land r))\\supset (s\\land (s\\lor q))),\\lnot (((p\\supset \\lnot q)\\equiv s)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1111110101010101 és 1100011001100101"]
          ["\\(\\{ (((p\\land q)\\supset (q\\equiv (r\\equiv r)))\\land r),((((q\\land q)\\land q)\\equiv r)\\land (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001100110000 és 0110010000100011"]
          ["\\(\\{ (\\lnot ((q\\equiv s)\\lor \\lnot s)\\lor s),\\lnot \\lnot (q\\lor \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000111111111111"]
          ["\\(\\{ ((q\\equiv s)\\land (((s\\land q)\\land s)\\supset q)),\\lnot ((((p\\supset s)\\land p)\\land r)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1000000001100101 és 0000111100011110"]
          ["\\(\\{ ((q\\lor (r\\supset q))\\lor (q\\lor (p\\supset r))),(((q\\equiv r)\\land (s\\supset r))\\equiv (p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1001100101101111"]
          ["\\(\\{ (((p\\supset q)\\supset q)\\land \\lnot \\lnot s),((r\\land (p\\land r))\\supset (q\\equiv (r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0000010101010101 és 1110011010101111"]
          ["\\(\\{ ((\\lnot r\\equiv r)\\land (\\lnot q\\land q)),((q\\land s)\\lor \\lnot \\lnot (p\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0011011111111111"]
          ["\\(\\{ (\\lnot (r\\lor \\lnot r)\\land (p\\equiv q)),(r\\lor \\lnot (r\\equiv ((p\\equiv s)\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111111101110111"]
          ["\\(\\{ \\lnot ((s\\lor q)\\supset (r\\land (q\\lor r))),(((r\\supset q)\\lor (q\\land q))\\supset (s\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0110111001001100 és 1011111110111111"]
          ["\\(\\{ (q\\lor (\\lnot ((s\\land s)\\supset p)\\land q)),((((r\\supset (p\\lor s))\\land s)\\supset p)\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0001010101010101"]
          ["\\(\\{ (\\lnot (s\\equiv s)\\supset (\\lnot q\\supset s)),(((q\\lor r)\\equiv \\lnot s)\\lor (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111101011111 és 0111100011111111"]
          ["\\(\\{ ((p\\lor ((s\\supset s)\\supset r))\\supset (r\\equiv r)),\\lnot (q\\land ((p\\supset (p\\land p))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1110111000000000 és 1100011000001000"]
          ["\\(\\{ (q\\supset ((s\\supset (s\\lor \\lnot p))\\lor p)),(p\\equiv ((((p\\land s)\\supset p)\\supset q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0001011001110101"]
          ["\\(\\{ ((p\\equiv \\lnot r)\\land ((s\\equiv s)\\lor q)),(((r\\land q)\\supset q)\\land ((p\\equiv r)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000001100001100 és 1100111100111111"]
          ["\\(\\{ \\lnot (q\\supset (p\\land (q\\equiv (q\\equiv p)))),((r\\supset s)\\supset (q\\equiv \\lnot (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000000 és 0010111101110010"]
          ["\\(\\{ ((p\\supset q)\\equiv (p\\equiv (\\lnot p\\supset s))),((q\\lor s)\\supset ((r\\supset q)\\supset (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1001100001001111 és 1011011110110001"]
          ["\\(\\{ (\\lnot ((r\\land q)\\land (q\\land p))\\land p),(((\\lnot r\\lor \\lnot r)\\equiv q)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000010 és 0011111111111111"]
          ["\\(\\{ ((p\\lor (s\\lor q))\\land ((q\\lor s)\\lor s)),(r\\supset ((r\\equiv q)\\land (p\\equiv (s\\lor q)))) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011111 és 1110110111001111"]
          ["\\(\\{ ((p\\supset r)\\supset (\\lnot \\lnot r\\equiv r)),((s\\equiv (s\\supset p))\\lor ((s\\land r)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1110111001001100 és 0001101111111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((p\\equiv (s\\lor q))\\lor (q\\lor q))\\land s), (((p\\lor q)\\lor s)\\lor (q\\land (r\\supset s))) \\}\\)"
         "\\(\\{ (((p\\supset (q\\land s))\\supset (s\\lor p))\\equiv s), (((s\\equiv p)\\land (r\\supset p))\\equiv (r\\supset q)) \\}\\)"
         "\\(\\{ \\lnot (r\\equiv (\\lnot r\\equiv \\lnot q)), (\\lnot (q\\lor p)\\lor \\lnot (p\\land s)) \\}\\)"
         "\\(\\{ (s\\supset \\lnot ((\\lnot r\\equiv q)\\land q)), (\\lnot (s\\equiv p)\\lor (q\\lor (q\\lor s))) \\}\\)"
         "\\(\\{ \\lnot ((q\\land r)\\equiv ((s\\land p)\\equiv p)), (\\lnot p\\equiv (((q\\lor r)\\land s)\\land p)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (r\\land r)\\supset (p\\equiv q)), ((((s\\equiv s)\\land s)\\lor s)\\equiv (p\\lor q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\supset \\lnot (q\\supset ((r\\supset p)\\land q))),((q\\supset s)\\supset (\\lnot q\\supset \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1101111110001111"]
          ["\\(\\{ ((r\\equiv (q\\equiv p))\\lor ((p\\land q)\\equiv r)),\\lnot (\\lnot s\\supset (p\\equiv (s\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1110110111000011 és 0001010100000000"]
          ["\\(\\{ ((r\\supset (r\\land q))\\land \\lnot (q\\equiv s)),((q\\equiv ((p\\lor (p\\supset q))\\land r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0100101001001010 és 0000110000000011"]
          ["\\(\\{ ((r\\lor p)\\equiv (p\\supset ((p\\equiv r)\\supset s))),\\lnot ((q\\equiv ((s\\land r)\\equiv p))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000001000111101 és 1100110000000001"]
          ["\\(\\{ ((r\\land s)\\land ((s\\supset p)\\lor \\lnot s)),((s\\supset (r\\equiv p))\\lor ((s\\lor p)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 1111111110111011"]
          ["\\(\\{ \\lnot (\\lnot \\lnot (s\\equiv q)\\supset s),(((s\\equiv q)\\lor ((p\\lor q)\\land s))\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1001011010100000 és 0111111110111011"]
          ["\\(\\{ (q\\lor \\lnot (s\\equiv \\lnot \\lnot s)),((p\\lor ((s\\supset r)\\supset (q\\lor r)))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1000110010110011"]
          ["\\(\\{ (((r\\land (s\\supset r))\\supset p)\\equiv (s\\land r)),((((s\\land s)\\supset s)\\equiv \\lnot q)\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0010001010010001 és 1101110111110101"]
          ["\\(\\{ ((p\\equiv \\lnot ((q\\lor s)\\lor q))\\supset r),\\lnot (q\\lor ((r\\supset r)\\lor (s\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1011011101111111 és 0010011000000000"]
          ["\\(\\{ (((p\\lor s)\\equiv (p\\equiv r))\\equiv (p\\land q)),((\\lnot q\\equiv (r\\equiv q))\\land \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1011110011000011 és 1110000010001100"]
          ["\\(\\{ ((((r\\lor q)\\equiv (s\\land s))\\land r)\\equiv p),((q\\supset (s\\supset (r\\equiv r)))\\equiv (p\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1110101010010001 és 0001101000000110"]
          ["\\(\\{ (s\\land (\\lnot (s\\supset q)\\supset (p\\equiv q))),(\\lnot (s\\supset ((q\\lor s)\\land p))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0101010100000101 és 0001000100000000"]
          ["\\(\\{ (((p\\supset ((s\\equiv s)\\equiv p))\\land s)\\lor r),\\lnot ((r\\equiv (s\\equiv (q\\lor s)))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0111011100110011 és 0010011011000000"]
          ["\\(\\{ (\\lnot \\lnot p\\equiv (s\\supset (p\\equiv q))),(\\lnot (r\\supset (p\\supset r))\\equiv (q\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0001011010101111 és 0001001100001100"]
          ["\\(\\{ \\lnot \\lnot \\lnot ((p\\equiv q)\\land r),((q\\land (p\\land p))\\lor ((q\\land r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100010000000010 és 1001111110101111"]
          ["\\(\\{ \\lnot (((\\lnot s\\supset r)\\equiv s)\\land r),((s\\lor \\lnot p)\\lor (r\\equiv (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1110101000101110 és 1111111111011101"]
          ["\\(\\{ (p\\land (((s\\equiv r)\\supset p)\\supset (p\\land p))),((s\\land r)\\lor (q\\equiv (r\\supset (r\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111111 és 0011111100011111"]
          ["\\(\\{ ((s\\land \\lnot ((r\\supset r)\\equiv p))\\lor r),((q\\equiv (r\\land q))\\lor (r\\supset \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0111001100110011 és 1111110111101111"]
          ["\\(\\{ ((r\\equiv p)\\lor \\lnot ((r\\supset q)\\supset p)),\\lnot (\\lnot \\lnot p\\equiv (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110111100110011 és 0000001111111100"]
          ["\\(\\{ \\lnot \\lnot ((p\\lor p)\\lor (r\\supset q)),(\\lnot p\\land \\lnot ((p\\equiv s)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1000010000000000"]
          ["\\(\\{ \\lnot (\\lnot (s\\equiv \\lnot q)\\supset q),((((s\\lor r)\\supset q)\\land \\lnot r)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1001011010100000 és 0111111101111100"]
          ["\\(\\{ \\lnot (r\\equiv ((q\\supset r)\\supset \\lnot q)),((q\\supset (r\\land q))\\equiv ((q\\supset q)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1101110111001111 és 0000110010111111"]
          ["\\(\\{ (\\lnot ((r\\equiv \\lnot p)\\land r)\\lor s),(\\lnot (s\\land (s\\equiv (p\\lor p)))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0001000100100010"]
          ["\\(\\{ (s\\supset (\\lnot r\\equiv ((r\\land p)\\equiv q))),\\lnot (r\\lor ((q\\equiv r)\\supset (r\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111010 és 0010011000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\land (\\lnot q\\lor s))\\equiv \\lnot p), ((p\\supset \\lnot r)\\equiv \\lnot (s\\equiv q)) \\}\\)"
         "\\(\\{ (((s\\supset (q\\lor r))\\supset p)\\equiv (s\\supset r)), (((p\\land r)\\land p)\\land (\\lnot s\\lor r)) \\}\\)"
         "\\(\\{ (((s\\land s)\\supset (r\\supset q))\\equiv \\lnot s), \\lnot ((s\\lor s)\\land ((p\\lor q)\\land q)) \\}\\)"
         "\\(\\{ \\lnot (q\\land ((r\\lor p)\\lor (s\\lor s))), \\lnot (((s\\equiv (q\\land p))\\land r)\\land p) \\}\\)"
         "\\(\\{ (\\lnot (s\\lor \\lnot q)\\lor (r\\supset p)), (((r\\supset s)\\land s)\\equiv \\lnot (q\\equiv q)) \\}\\)"
         "\\(\\{ (\\lnot ((r\\lor r)\\lor \\lnot s)\\lor p), ((s\\lor \\lnot s)\\lor (r\\land (s\\land q))) \\}\\)"
         "\\(\\{ ((p\\supset q)\\lor (p\\lor (\\lnot s\\equiv s))), (q\\supset (s\\supset ((s\\supset (r\\land q))\\lor q))) \\}\\)"
         "\\(\\{ ((q\\land ((q\\land s)\\supset (s\\land p)))\\equiv r), ((((p\\supset (r\\equiv q))\\lor p)\\land r)\\lor r) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (q\\supset q)\\land (q\\lor p)), (((s\\supset s)\\lor s)\\lor \\lnot (q\\land p)) \\}\\)"
         "\\(\\{ (p\\land ((p\\equiv (r\\lor p))\\lor \\lnot p)), ((q\\land (q\\land s))\\lor ((r\\supset p)\\land r)) \\}\\)"
         "\\(\\{ (((p\\supset r)\\lor s)\\land (p\\equiv \\lnot q)), \\lnot (p\\land ((p\\equiv \\lnot r)\\lor s)) \\}\\)"
         "\\(\\{ ((r\\equiv \\lnot r)\\supset \\lnot (r\\land q)), (s\\supset (p\\equiv ((p\\lor \\lnot p)\\equiv r))) \\}\\)"
         "\\(\\{ (\\lnot (q\\lor s)\\lor (r\\supset \\lnot p)), (\\lnot ((s\\equiv p)\\lor (r\\equiv s))\\equiv p) \\}\\)"
         "\\(\\{ ((p\\equiv q)\\supset \\lnot \\lnot (q\\supset p)), (\\lnot (\\lnot (q\\supset r)\\equiv q)\\equiv q) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (q\\supset q)\\lor \\lnot p), \\lnot \\lnot \\lnot (q\\lor (q\\equiv q)) \\}\\)"
         "\\(\\{ (\\lnot ((s\\equiv p)\\supset r)\\supset (s\\lor r)), (p\\lor \\lnot (s\\supset (\\lnot s\\supset q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((r\\equiv q)\\equiv (\\lnot (q\\land r)\\lor p)),\\lnot ((\\lnot \\lnot r\\supset p)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1111101100100011 és 1110100111001100"]
          ["\\(\\{ \\lnot (s\\land (q\\supset (\\lnot r\\supset r))),((s\\equiv (p\\equiv q))\\supset ((p\\equiv q)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101110 és 1011111111011011"]
          ["\\(\\{ ((((s\\supset r)\\lor p)\\land (r\\land s))\\land s),((q\\equiv (s\\supset q))\\equiv ((s\\lor q)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 1001000011111111"]
          ["\\(\\{ (((r\\supset s)\\supset \\lnot \\lnot p)\\supset r),\\lnot ((q\\lor p)\\lor ((p\\equiv p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100110011 és 1000111000000000"]
          ["\\(\\{ \\lnot (r\\land ((q\\supset (r\\equiv p))\\land p)),(s\\land (((q\\land r)\\equiv (q\\lor p))\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000101100 és 0000010101010001"]
          ["\\(\\{ ((\\lnot \\lnot \\lnot p\\equiv p)\\lor r),\\lnot ((q\\lor s)\\supset (q\\equiv (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0011001101110011 és 0001011100011100"]
          ["\\(\\{ (((s\\supset \\lnot (q\\supset q))\\lor q)\\land s),\\lnot ((s\\supset q)\\supset (r\\equiv (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000101 és 0010011000000000"]
          ["\\(\\{ (((r\\lor p)\\lor q)\\land (q\\equiv (r\\lor s))),\\lnot ((\\lnot p\\supset p)\\equiv (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0010001001000111 és 0001000111101110"]
          ["\\(\\{ ((((q\\lor s)\\land s)\\lor r)\\land \\lnot p),\\lnot ((r\\equiv s)\\supset \\lnot (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0100011000000000 és 0011011000010001"]
          ["\\(\\{ ((s\\equiv \\lnot p)\\equiv (q\\equiv \\lnot p)),(\\lnot ((r\\equiv r)\\supset r)\\lor (s\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1001100001100101 és 1111110111011101"]
          ["\\(\\{ (\\lnot (s\\equiv (q\\supset r))\\supset (s\\lor s)),((((p\\supset r)\\supset r)\\land r)\\equiv (r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0111010111011101 és 0010110111001100"]
          ["\\(\\{ (p\\equiv \\lnot (q\\equiv (r\\equiv (s\\lor q)))),((q\\supset (q\\lor \\lnot r))\\supset \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0110000101011100 és 1111111111001100"]
          ["\\(\\{ (((r\\land r)\\equiv q)\\equiv (q\\lor \\lnot q)),\\lnot \\lnot (p\\supset (s\\equiv \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1111000100100011 és 1101011111011010"]
          ["\\(\\{ (((s\\land s)\\land p)\\supset \\lnot (p\\supset p)),\\lnot (q\\equiv ((r\\land (s\\lor p))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011101010 és 1111011100001111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((s\\land p)\\lor ((s\\supset r)\\lor (p\\lor p))), \\lnot ((((p\\equiv r)\\land r)\\land r)\\land q) \\}\\)"
         "\\(\\{ (\\lnot (q\\lor (s\\land s))\\lor (s\\land r)), \\lnot \\lnot (\\lnot (r\\lor q)\\supset s) \\}\\)"
         "\\(\\{ \\lnot \\lnot (s\\supset ((s\\equiv s)\\supset r)), (((p\\lor r)\\supset (p\\supset p))\\lor (s\\equiv r)) \\}\\)"
         "\\(\\{ ((r\\lor p)\\lor \\lnot ((p\\supset s)\\supset s)), \\lnot (\\lnot \\lnot q\\equiv (p\\equiv r)) \\}\\)"
         "\\(\\{ (q\\supset (q\\equiv \\lnot (\\lnot s\\equiv r))), ((p\\lor s)\\lor (\\lnot q\\equiv (r\\supset p))) \\}\\)"
         "\\(\\{ ((s\\land r)\\land (r\\supset ((q\\lor p)\\equiv s))), ((\\lnot \\lnot (p\\land r)\\land p)\\lor s) \\}\\)"
         "\\(\\{ (s\\land (q\\lor (p\\equiv (r\\lor \\lnot s)))), (\\lnot (((q\\equiv s)\\lor q)\\land q)\\equiv r) \\}\\)"
         "\\(\\{ ((r\\land s)\\lor (\\lnot q\\supset (q\\lor q))), ((s\\supset ((r\\land q)\\supset r))\\supset (s\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot s\\equiv ((r\\lor (p\\land p))\\equiv s)),\\lnot ((r\\land q)\\lor ((p\\land r)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111100010000000 és 0010111011000000"]
          ["\\(\\{ \\lnot ((\\lnot p\\lor p)\\lor \\lnot r),(\\lnot (\\lnot \\lnot s\\equiv r)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0011011000000000 és 0111011101110111"]
          ["\\(\\{ \\lnot ((p\\land p)\\lor (q\\land \\lnot p)),((p\\supset (\\lnot r\\supset r))\\equiv (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100000010000000 és 1101100101101111"]
          ["\\(\\{ (((\\lnot p\\land s)\\equiv s)\\supset \\lnot p),\\lnot \\lnot (q\\equiv (s\\land (r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1101011111010101 és 1101011110100101"]
          ["\\(\\{ ((r\\land s)\\equiv ((\\lnot r\\supset p)\\supset r)),((p\\supset (s\\land q))\\lor ((p\\supset s)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0011000000111101 és 1101011110100101"]
          ["\\(\\{ (s\\land (p\\supset (r\\supset (s\\supset (r\\land q))))),\\lnot (((q\\supset (p\\equiv q))\\land p)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0101010101000101 és 0101010110101010"]
          ["\\(\\{ ((r\\equiv r)\\lor (p\\equiv \\lnot (p\\lor p))),((s\\supset p)\\supset ((q\\lor s)\\land (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1100011001000000 és 0101010101010101"]
          ["\\(\\{ (((s\\lor r)\\lor s)\\land (q\\supset \\lnot s)),(p\\supset ((r\\lor (q\\lor q))\\land (p\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0101011101110010 és 1100011010000000"]
          ["\\(\\{ (((s\\land p)\\equiv r)\\equiv ((q\\equiv p)\\lor s)),(\\lnot \\lnot (r\\land \\lnot s)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1110111100111001 és 0001111100101111"]
          ["\\(\\{ ((\\lnot r\\lor (q\\supset s))\\equiv (q\\land s)),\\lnot \\lnot \\lnot \\lnot (p\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0010000010000111 és 1100111110001111"]
          ["\\(\\{ ((p\\lor (s\\land ((q\\lor s)\\equiv p)))\\supset q),(((p\\lor (s\\supset s))\\lor (s\\equiv s))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1101111110001111 és 0001011011111111"]
          ["\\(\\{ (p\\equiv \\lnot (q\\equiv \\lnot (q\\equiv q))),(((r\\lor p)\\lor p)\\land \\lnot (s\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000001111 és 0001000100000000"]
          ["\\(\\{ ((((s\\lor r)\\supset r)\\supset q)\\equiv (r\\land r)),(((\\lnot (p\\supset q)\\land p)\\land p)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1001010001000011 és 0000000011111111"]
          ["\\(\\{ (((q\\lor \\lnot (p\\lor s))\\land p)\\supset s),\\lnot ((p\\equiv r)\\lor \\lnot (p\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1101011101011101 és 0011011010001100"]
          ["\\(\\{ \\lnot ((q\\supset (\\lnot p\\lor p))\\supset r),(((p\\lor q)\\lor ((p\\lor r)\\supset s))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1110011011001100 és 1111111111111111"]
          ["\\(\\{ (((s\\land p)\\lor (p\\supset r))\\supset \\lnot r),((p\\supset (q\\lor p))\\supset (s\\supset (q\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001100 és 1001111110101111"]
          ["\\(\\{ (\\lnot (p\\lor p)\\supset (q\\land (p\\supset p))),((p\\equiv (q\\equiv \\lnot q))\\land (q\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000011011111111 és 0000000100000000"]
          ["\\(\\{ (((s\\lor (q\\lor p))\\land (r\\equiv r))\\equiv s),(((q\\supset (q\\land q))\\equiv r)\\equiv (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1101100110101010 és 0001001110010001"]
          ["\\(\\{ ((s\\equiv (s\\supset (p\\land s)))\\lor (q\\equiv s)),(((r\\land s)\\land s)\\supset \\lnot (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1001101011110101 és 1111111111101110"]
          ["\\(\\{ (s\\lor (p\\land ((r\\supset r)\\lor (r\\land s)))),((q\\land ((s\\equiv (r\\lor s))\\equiv r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0101010111111111 és 0000100100000001"]
          ["\\(\\{ \\lnot (q\\equiv \\lnot ((p\\lor s)\\lor r)),((((q\\land p)\\lor (r\\land q))\\land r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1010000100001111 és 1101010111111101"]
          ["\\(\\{ ((r\\supset (s\\equiv s))\\lor ((r\\lor s)\\land q)),(p\\lor ((p\\equiv (p\\equiv p))\\land (s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001111 és 0000000011111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((p\\land (r\\equiv (r\\land s)))\\equiv q)\\supset p), \\lnot (((s\\lor p)\\land \\lnot s)\\land s) \\}\\)"
         "\\(\\{ (\\lnot q\\lor (p\\supset (\\lnot s\\supset p))), (q\\supset \\lnot \\lnot ((r\\land q)\\supset p)) \\}\\)"
         "\\(\\{ \\lnot (s\\land \\lnot ((q\\land r)\\supset s)), ((p\\equiv (s\\supset ((r\\supset p)\\lor r)))\\lor q) \\}\\)"
         "\\(\\{ (p\\supset ((p\\land q)\\supset \\lnot (r\\equiv q))), (((s\\supset s)\\equiv \\lnot s)\\equiv (q\\land p)) \\}\\)"
         "\\(\\{ (s\\lor ((s\\supset ((p\\land p)\\land r))\\lor s)), ((r\\equiv (q\\supset r))\\equiv (\\lnot s\\lor p)) \\}\\)"
         "\\(\\{ ((r\\equiv ((s\\land r)\\supset q))\\equiv (q\\equiv r)), ((((p\\land r)\\supset s)\\land q)\\land (r\\lor q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((p\\equiv (r\\lor q))\\equiv (\\lnot p\\land q)),((p\\equiv q)\\supset (((s\\lor s)\\lor q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0011101000100000 és 1001111111111111"]
          ["\\(\\{ ((r\\land ((r\\land q)\\equiv r))\\lor (q\\supset s)),\\lnot (q\\equiv (r\\lor \\lnot (q\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110111 és 1011100010111100"]
          ["\\(\\{ ((q\\lor (r\\lor r))\\equiv \\lnot (s\\supset q)),\\lnot ((q\\lor (s\\equiv q))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1011001110010000 és 0001011100001111"]
          ["\\(\\{ (((q\\supset r)\\lor \\lnot p)\\equiv (p\\equiv p)),\\lnot (q\\equiv (\\lnot q\\equiv (s\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1110001100001100 és 1001011001010101"]
          ["\\(\\{ (((p\\lor s)\\lor p)\\lor ((r\\lor p)\\supset p)),(((p\\equiv (p\\lor q))\\land s)\\land (p\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0100010001010101"]
          ["\\(\\{ (r\\land ((p\\equiv p)\\equiv (r\\lor (p\\supset r)))),\\lnot (q\\equiv (s\\land (p\\lor (p\\land q)))) \\}\\)" "az igazságtáblák főoszlopai: 0010001100000000 és 0000111101011010"]
          ["\\(\\{ ((r\\land r)\\equiv (p\\lor (r\\equiv (p\\land q)))),((q\\equiv p)\\supset \\lnot (p\\equiv (q\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0001000010110011 és 1111111111111100"]
          ["\\(\\{ (((s\\equiv \\lnot q)\\land q)\\lor (q\\lor s)),(s\\land ((r\\equiv r)\\equiv ((r\\equiv r)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011111 és 0101010001010101"]
          ["\\(\\{ \\lnot ((q\\equiv ((r\\land s)\\supset p))\\lor r),(((p\\land s)\\lor s)\\land ((r\\supset p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1110011001000000 és 0101010101010101"]
          ["\\(\\{ ((p\\lor r)\\lor (q\\lor \\lnot (p\\supset q))),\\lnot \\lnot (q\\equiv (r\\land (s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0011111111111111 és 1110010000100011"]
          ["\\(\\{ (((q\\supset s)\\supset p)\\lor (s\\land \\lnot r)),(((s\\lor p)\\equiv r)\\lor ((r\\land s)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0101011111111111 és 1011111100110011"]
          ["\\(\\{ \\lnot (q\\equiv (s\\supset (q\\land (q\\land q)))),(p\\lor ((p\\land (p\\lor s))\\lor (q\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1001000010100000 és 1001000011111111"]
          ["\\(\\{ \\lnot \\lnot \\lnot (\\lnot q\\supset s),((r\\land (q\\equiv s))\\lor (s\\lor \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1001011010100000 és 1101011111110101"]
          ["\\(\\{ ((r\\land r)\\lor (\\lnot (s\\equiv s)\\land p)),(s\\supset (((s\\lor s)\\supset s)\\equiv \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1111110110101110"]
          ["\\(\\{ (p\\lor ((p\\land s)\\lor (s\\supset \\lnot s))),(p\\equiv \\lnot ((p\\equiv r)\\supset (s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111111 és 1011111100000000"]
          ["\\(\\{ ((p\\lor (r\\supset \\lnot r))\\supset (p\\supset s)),(((q\\land r)\\supset (q\\lor (q\\equiv p)))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1111011111010101 és 1100111111111111"]
          ["\\(\\{ (\\lnot (((q\\supset q)\\lor s)\\supset r)\\equiv s),(((p\\lor s)\\equiv q)\\land (r\\lor (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0110000101100110 és 0001000000000011"]
          ["\\(\\{ \\lnot (p\\supset (s\\lor \\lnot \\lnot q)),\\lnot ((s\\supset r)\\equiv \\lnot (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000100000 és 0111100110010111"]
          ["\\(\\{ \\lnot (r\\supset (s\\equiv (s\\lor \\lnot q))),(((p\\lor p)\\equiv ((p\\land r)\\land r))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0011001100100000 és 0101010111011101"]
          ["\\(\\{ (((q\\lor \\lnot q)\\lor \\lnot r)\\land s),(((r\\lor (\\lnot p\\equiv q))\\lor s)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0100010101010101 és 1010011011111111"]
          ["\\(\\{ \\lnot (\\lnot ((p\\land s)\\supset s)\\supset p),(((q\\land s)\\supset p)\\land (\\lnot q\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0001111000000000 és 0100001101011111"]
          ["\\(\\{ (r\\equiv ((q\\land p)\\supset \\lnot (p\\equiv r))),(\\lnot (s\\lor (s\\equiv (p\\equiv s)))\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000001010000000 és 0101111101011111"]
          ["\\(\\{ ((((q\\equiv q)\\lor (s\\equiv p))\\supset s)\\land r),((q\\land (p\\land p))\\land ((r\\equiv p)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0001001100110011 és 0000000000000011"]
          ["\\(\\{ \\lnot ((p\\lor ((q\\land r)\\supset p))\\supset q),((\\lnot (r\\lor p)\\lor s)\\lor (q\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 1111111101010101"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (p\\lor ((s\\lor p)\\supset \\lnot (s\\supset q))), ((\\lnot s\\supset (p\\lor p))\\supset (q\\supset s)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((s\\lor s)\\lor (s\\lor p)), ((r\\equiv (\\lnot q\\land r))\\equiv (q\\supset p)) \\}\\)"
         "\\(\\{ ((s\\land (p\\lor p))\\lor (r\\equiv \\lnot r)), ((r\\land p)\\lor (\\lnot (q\\lor r)\\supset r)) \\}\\)"
         "\\(\\{ ((r\\supset s)\\supset ((\\lnot s\\lor q)\\supset p)), ((\\lnot \\lnot \\lnot q\\supset s)\\lor p) \\}\\)"
         "\\(\\{ (((q\\lor q)\\lor ((p\\equiv r)\\land r))\\land s), \\lnot \\lnot ((p\\lor p)\\lor (p\\supset s)) \\}\\)"
         "\\(\\{ (((s\\lor s)\\lor s)\\supset \\lnot (p\\equiv r)), ((r\\lor s)\\land (\\lnot q\\lor (p\\equiv q))) \\}\\)"
         "\\(\\{ ((q\\lor q)\\supset ((p\\equiv \\lnot r)\\land s)), ((((r\\lor (q\\lor p))\\lor s)\\land q)\\equiv p) \\}\\)"
         "\\(\\{ (((r\\equiv s)\\supset (p\\supset q))\\land (r\\lor q)), ((s\\supset (s\\lor q))\\lor (q\\equiv \\lnot p)) \\}\\)"
         "\\(\\{ ((p\\equiv s)\\equiv ((s\\lor q)\\supset (r\\supset p))), ((p\\equiv ((s\\supset r)\\land p))\\equiv \\lnot s) \\}\\)"
         "\\(\\{ (((q\\lor (q\\equiv q))\\lor (s\\equiv s))\\equiv p), (\\lnot (q\\supset \\lnot (s\\equiv q))\\lor q) \\}\\)"
         "\\(\\{ ((p\\supset (p\\lor q))\\lor \\lnot (p\\land p)), (\\lnot (q\\lor r)\\supset (q\\supset (s\\supset s))) \\}\\)"
         "\\(\\{ (r\\lor (\\lnot \\lnot q\\equiv (s\\land p))), (((q\\supset q)\\equiv r)\\lor ((r\\land s)\\equiv r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((\\lnot s\\land p)\\equiv ((q\\equiv s)\\supset p)),(((r\\land \\lnot r)\\supset (p\\supset r))\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1001000001101010 és 1111111111111111"]
          ["\\(\\{ (((q\\lor p)\\equiv s)\\lor ((q\\equiv s)\\lor q)),((s\\land r)\\equiv (((s\\lor q)\\supset p)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1001111111111111 és 0000000010010001"]
          ["\\(\\{ \\lnot ((p\\supset (p\\supset s))\\land (q\\lor s)),((r\\land p)\\land ((q\\land q)\\land (r\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1001111010101010 és 0000000000000001"]
          ["\\(\\{ \\lnot \\lnot ((q\\lor s)\\equiv \\lnot s),(s\\lor \\lnot ((\\lnot q\\lor p)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000010010001010 és 1101010111110101"]
          ["\\(\\{ (p\\supset (p\\land ((q\\equiv (q\\land s))\\land r))),(((q\\equiv (r\\lor p))\\equiv p)\\equiv (q\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000001 és 0111010000110101"]
          ["\\(\\{ ((q\\lor (r\\equiv \\lnot s))\\land (r\\equiv q)),((s\\land ((p\\land q)\\land p))\\land (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0110010000100011 és 0000000000000001"]
          ["\\(\\{ ((q\\land (p\\supset (s\\lor (p\\supset s))))\\equiv q),((\\lnot p\\equiv \\lnot (q\\supset r))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1100101000001101 és 1110110100000011"]
          ["\\(\\{ \\lnot (s\\supset (q\\supset (q\\land (p\\equiv p)))),\\lnot (q\\equiv (r\\equiv (p\\land (r\\equiv q)))) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000101 és 1110011011100000"]
          ["\\(\\{ (\\lnot (s\\supset (q\\equiv (r\\supset q)))\\equiv r),(r\\land (q\\supset \\lnot \\lnot (s\\lor q))) \\}\\)" "az igazságtáblák főoszlopai: 1001110110001100 és 0001001100110011"]
          ["\\(\\{ (\\lnot \\lnot ((s\\land q)\\lor s)\\land q),\\lnot ((r\\supset p)\\lor ((s\\lor p)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000010100000101 és 0011001100000000"]
          ["\\(\\{ (p\\lor ((\\lnot (s\\supset s)\\lor s)\\lor r)),((\\lnot (s\\land (p\\supset p))\\equiv p)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0111011111111111 és 0111011111111011"]
          ["\\(\\{ ((s\\equiv p)\\lor ((q\\land s)\\equiv (p\\lor r))),((r\\equiv p)\\equiv (r\\lor (s\\equiv (p\\lor q)))) \\}\\)" "az igazságtáblák főoszlopai: 1111111101010101 és 1001000010111011"]
          ["\\(\\{ ((s\\supset r)\\land ((r\\lor q)\\lor \\lnot r)),\\lnot (\\lnot (s\\land q)\\lor (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 0000010100000000"]
          ["\\(\\{ (q\\land ((s\\lor r)\\equiv (q\\equiv (s\\lor p)))),\\lnot ((r\\lor q)\\equiv (q\\lor (s\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000111000000111 és 1010000010010000"]
          ["\\(\\{ ((p\\equiv q)\\lor (\\lnot (p\\supset p)\\land p)),(\\lnot (r\\land ((r\\supset s)\\equiv p))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 1100111010001111 és 0011001100100010"]
          ["\\(\\{ \\lnot ((r\\lor p)\\land (p\\land (r\\supset p))),(((s\\supset p)\\equiv (s\\equiv r))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1110111011110110"]
          ["\\(\\{ (r\\equiv ((p\\equiv (r\\equiv q))\\equiv (r\\equiv q))),(r\\supset (s\\land \\lnot (r\\land (s\\equiv r)))) \\}\\)" "az igazságtáblák főoszlopai: 1111101100110011 és 1110100111001100"]
          ["\\(\\{ (p\\equiv (((p\\lor q)\\land p)\\lor \\lnot p)),(\\lnot (s\\supset r)\\lor ((s\\lor r)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0111111101111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (q\\supset (((p\\land (s\\supset q))\\supset q)\\lor s)), (((p\\lor q)\\land (p\\lor s))\\lor \\lnot s) \\}\\)"
         "\\(\\{ ((r\\lor \\lnot (p\\equiv (q\\equiv r)))\\land p), (((p\\land q)\\supset s)\\supset ((p\\land r)\\land q)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((s\\supset r)\\land (q\\supset r)), (((\\lnot s\\equiv q)\\land (s\\lor p))\\supset r) \\}\\)"
         "\\(\\{ ((((p\\lor s)\\land p)\\land (s\\supset q))\\lor q), (\\lnot \\lnot (r\\land s)\\equiv \\lnot r) \\}\\)"
         "\\(\\{ ((s\\supset p)\\lor ((p\\lor p)\\lor (s\\lor r))), (p\\equiv (\\lnot q\\lor ((p\\equiv q)\\lor q))) \\}\\)"
         "\\(\\{ \\lnot ((q\\equiv \\lnot q)\\equiv \\lnot s), (\\lnot \\lnot ((p\\equiv q)\\lor p)\\land p) \\}\\)"
         "\\(\\{ ((q\\supset p)\\land (s\\equiv (s\\land \\lnot q))), ((((r\\equiv r)\\land (r\\land q))\\supset p)\\supset r) \\}\\)"
         "\\(\\{ (\\lnot r\\lor (((r\\land q)\\land q)\\supset q)), \\lnot ((r\\land (p\\supset s))\\land \\lnot s) \\}\\)"
         "\\(\\{ (((q\\land q)\\lor (q\\land r))\\land (p\\lor q)), (((r\\supset r)\\equiv p)\\lor \\lnot (p\\lor r)) \\}\\)"
         "\\(\\{ (q\\lor \\lnot (((r\\supset s)\\equiv s)\\lor r)), (((q\\supset q)\\equiv (s\\lor (r\\equiv q)))\\lor s) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((q\\equiv (p\\equiv \\lnot q))\\supset q)\\land s),\\lnot (s\\land (r\\supset (r\\supset \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 0000010101010101 és 1000001110111011"]
          ["\\(\\{ (\\lnot \\lnot (s\\supset s)\\land (p\\land r)),(r\\supset (((q\\land q)\\equiv (p\\supset p))\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 1111110111111101"]
          ["\\(\\{ \\lnot (\\lnot \\lnot s\\land (p\\supset p)),\\lnot ((r\\land (r\\lor s))\\land (r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1000001001101010 és 1111101111001100"]
          ["\\(\\{ ((r\\supset q)\\land ((p\\supset (r\\lor s))\\supset s)),(\\lnot ((p\\land (r\\land q))\\equiv s)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0110111101001101 és 1101110111111101"]
          ["\\(\\{ \\lnot ((q\\supset (q\\land r))\\lor (q\\equiv q)),((p\\lor q)\\lor ((r\\land (q\\land p))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111000001100 és 0000111111111111"]
          ["\\(\\{ ((s\\lor r)\\equiv (s\\land ((p\\supset s)\\land s))),\\lnot (\\lnot \\lnot r\\lor \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1111100000111101 és 0010111001001100"]
          ["\\(\\{ \\lnot (p\\lor (\\lnot q\\lor \\lnot q)),(s\\lor ((s\\supset (p\\land s))\\equiv (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000000 és 1111011101110111"]
          ["\\(\\{ (\\lnot (p\\land \\lnot s)\\equiv \\lnot p),((p\\equiv q)\\supset ((s\\equiv p)\\equiv (q\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1100011001101010 és 0101111111110101"]
          ["\\(\\{ (s\\lor ((q\\supset (p\\lor q))\\lor (r\\lor q))),(q\\supset \\lnot (\\lnot (q\\land p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1101111111110000"]
          ["\\(\\{ ((p\\land r)\\land ((s\\lor r)\\land \\lnot p)),((s\\lor (r\\land p))\\land \\lnot (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0100010000000000"]
          ["\\(\\{ ((q\\supset s)\\equiv (\\lnot r\\supset (p\\land s))),(r\\supset ((s\\land ((q\\equiv q)\\equiv s))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0011010011111101 és 1110100111001100"]
          ["\\(\\{ (q\\equiv ((\\lnot r\\equiv q)\\equiv (s\\lor q))),(q\\land \\lnot (((s\\equiv r)\\lor q)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0110110110101100 és 0000100100001100"]
          ["\\(\\{ ((s\\supset (q\\equiv \\lnot r))\\supset (q\\land p)),((\\lnot (r\\lor p)\\equiv p)\\equiv (q\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0110011001001111 és 1011010001100000"]
          ["\\(\\{ ((p\\equiv (r\\equiv p))\\equiv (s\\equiv (s\\supset s))),((s\\land (s\\equiv \\lnot s))\\land \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1010001100011001 és 0000000000000000"]
          ["\\(\\{ \\lnot \\lnot (((p\\supset p)\\lor s)\\equiv s),(p\\equiv (((q\\equiv p)\\land p)\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0100010011010101 és 1100011010001010"]
          ["\\(\\{ (p\\equiv \\lnot (r\\equiv (r\\supset (q\\equiv p)))),\\lnot (s\\lor (r\\equiv (q\\equiv (s\\supset q)))) \\}\\)" "az igazságtáblák főoszlopai: 0001010000000010 és 0010111010101000"]
          ["\\(\\{ \\lnot (((s\\supset s)\\equiv r)\\land (r\\supset s)),((r\\equiv \\lnot \\lnot r)\\land (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1110110111101110 és 1000011000000000"]
          ["\\(\\{ ((r\\lor (r\\land q))\\equiv (r\\land (r\\lor s))),\\lnot (\\lnot (r\\equiv (s\\lor q))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0011100100111001"]
          ["\\(\\{ (((r\\land r)\\land s)\\land \\lnot (q\\land p)),((s\\supset (p\\land q))\\lor ((q\\lor r)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111111110101111"]
          ["\\(\\{ (\\lnot q\\lor \\lnot ((s\\equiv q)\\equiv p)),\\lnot ((q\\equiv (r\\land p))\\supset (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111011111010 és 1100111011000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((q\\equiv \\lnot (p\\land q))\\lor (p\\equiv s)), ((s\\land s)\\equiv ((q\\lor s)\\land (p\\land r))) \\}\\)"
         "\\(\\{ ((q\\land (s\\supset p))\\equiv (p\\land (p\\lor s))), (\\lnot (r\\equiv \\lnot s)\\equiv (r\\lor p)) \\}\\)"
         "\\(\\{ (((p\\supset q)\\land r)\\equiv (p\\supset (r\\supset r))), (r\\lor \\lnot (s\\land (r\\lor (p\\supset p)))) \\}\\)"
         "\\(\\{ (((r\\land r)\\supset (r\\lor r))\\land (s\\supset q)), ((\\lnot ((p\\supset r)\\land s)\\equiv q)\\supset r) \\}\\)"
         "\\(\\{ (s\\land ((s\\equiv r)\\equiv (r\\lor (p\\equiv s)))), ((((s\\lor q)\\land r)\\land s)\\lor (r\\land p)) \\}\\)"
         "\\(\\{ (((r\\equiv q)\\equiv s)\\lor ((p\\land q)\\equiv r)), (\\lnot \\lnot (s\\lor q)\\equiv (p\\land r)) \\}\\)"
         "\\(\\{ \\lnot ((s\\equiv q)\\land (\\lnot s\\equiv r)), ((\\lnot (s\\supset r)\\land p)\\lor (s\\equiv r)) \\}\\)"
         "\\(\\{ (s\\lor ((r\\equiv p)\\land ((s\\lor r)\\lor s))), \\lnot \\lnot ((q\\lor s)\\lor \\lnot s) \\}\\)"
         "\\(\\{ ((q\\equiv \\lnot q)\\supset \\lnot (r\\lor s)), ((q\\equiv \\lnot q)\\supset \\lnot (p\\land r)) \\}\\)"
         "\\(\\{ (((r\\equiv q)\\lor q)\\equiv ((s\\supset s)\\supset r)), ((s\\supset q)\\land ((r\\land r)\\equiv (s\\equiv q))) \\}\\)"
         "\\(\\{ ((\\lnot (q\\supset q)\\supset (r\\lor r))\\equiv q), \\lnot (r\\supset \\lnot (s\\supset (r\\supset r))) \\}\\)"
         "\\(\\{ ((s\\lor r)\\equiv (((q\\land p)\\supset q)\\land q)), (\\lnot (q\\supset s)\\lor (\\lnot r\\supset q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot \\lnot \\lnot (r\\lor (p\\equiv q)),\\lnot (q\\equiv \\lnot (q\\lor (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0010011011000000 és 1100000111001111"]
          ["\\(\\{ ((p\\supset ((r\\lor q)\\land r))\\supset (r\\lor r)),((q\\supset s)\\land (s\\land (\\lnot s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0011111101111111 és 0001000100000000"]
          ["\\(\\{ (((s\\equiv r)\\supset ((q\\lor q)\\lor p))\\equiv q),((s\\equiv (r\\lor p))\\land (q\\land \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1011101010001111 és 0000011000000000"]
          ["\\(\\{ (\\lnot \\lnot (s\\equiv p)\\supset \\lnot s),((q\\equiv p)\\supset ((r\\land (r\\equiv q))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1101110110101010 és 1010111111111001"]
          ["\\(\\{ ((r\\land ((r\\equiv r)\\equiv r))\\equiv (r\\land r)),((r\\supset (p\\lor q))\\supset ((r\\supset q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1101100000101100 és 0111011101110101"]
          ["\\(\\{ (\\lnot (r\\supset s)\\equiv ((q\\lor s)\\land r)),(((s\\supset (s\\land r))\\lor (r\\equiv p))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001110 és 0010010111111111"]
          ["\\(\\{ (s\\supset (r\\equiv (r\\land \\lnot (p\\supset p)))),((s\\land \\lnot (p\\supset r))\\equiv (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111101110 és 0000010001111011"]
          ["\\(\\{ (\\lnot ((r\\lor q)\\equiv (q\\lor r))\\equiv s),(((r\\lor (q\\equiv r))\\lor \\lnot r)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1001110110101010 és 0000000011111111"]
          ["\\(\\{ (\\lnot (r\\lor (q\\lor (s\\equiv q)))\\land s),(q\\land (\\lnot (s\\equiv s)\\land (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 0000000000000000"]
          ["\\(\\{ (s\\equiv (s\\lor ((p\\land s)\\land (p\\supset p)))),(q\\equiv (((q\\land s)\\land s)\\lor (p\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 1100100000000000"]
          ["\\(\\{ \\lnot \\lnot ((r\\land (q\\equiv p))\\supset p),(\\lnot (s\\equiv p)\\equiv ((s\\land s)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1100010011111111 és 0011000000011110"]
          ["\\(\\{ ((r\\supset s)\\supset \\lnot (r\\lor (q\\equiv r))),(((q\\supset r)\\lor p)\\land (p\\land (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0010111111101110 és 0000000000010001"]
          ["\\(\\{ \\lnot ((p\\land (s\\land q))\\lor (p\\supset s)),(s\\land (p\\equiv (((p\\land p)\\land p)\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0001111000101010 és 0000000000000000"]
          ["\\(\\{ \\lnot ((q\\land \\lnot (p\\supset p))\\lor q),\\lnot (p\\equiv \\lnot \\lnot (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0001000111101110"]
          ["\\(\\{ ((p\\lor (q\\equiv q))\\land ((q\\equiv r)\\equiv q)),\\lnot (((p\\supset q)\\land p)\\land (s\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011010011 és 1100011011110000"]
          ["\\(\\{ (\\lnot ((q\\supset q)\\lor (s\\equiv p))\\equiv p),(((r\\supset \\lnot r)\\lor \\lnot q)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1101111100000000 és 1110111111111111"]
          ["\\(\\{ (((r\\supset q)\\land s)\\lor (\\lnot s\\equiv p)),\\lnot ((q\\land (q\\supset s))\\supset (p\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010111101111 és 0000111000000000"]
          ["\\(\\{ \\lnot (((\\lnot p\\supset p)\\equiv q)\\equiv s),(\\lnot ((r\\equiv p)\\lor (q\\supset s))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1001101101011010 és 0000011000001000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ \\lnot (p\\land \\lnot (\\lnot q\\land q)), ((s\\supset (r\\equiv s))\\lor (\\lnot q\\supset s)) \\}\\)"
         "\\(\\{ (((r\\land (r\\land p))\\equiv r)\\lor (q\\equiv r)), ((s\\supset p)\\lor ((r\\supset q)\\equiv \\lnot r)) \\}\\)"
         "\\(\\{ (\\lnot ((s\\equiv p)\\land q)\\equiv \\lnot p), ((r\\lor s)\\supset ((q\\lor q)\\equiv \\lnot q)) \\}\\)"
         "\\(\\{ ((r\\lor r)\\supset (r\\supset ((q\\equiv p)\\supset q))), (p\\supset ((r\\land s)\\lor (q\\land \\lnot s))) \\}\\)"
         "\\(\\{ (\\lnot ((q\\supset r)\\land r)\\land \\lnot p), (\\lnot (r\\land q)\\equiv (p\\equiv (q\\land r))) \\}\\)"
         "\\(\\{ ((r\\supset (q\\supset r))\\equiv (q\\lor \\lnot q)), (s\\lor ((q\\equiv (r\\land s))\\land (p\\supset q))) \\}\\)"
         "\\(\\{ (q\\supset (q\\equiv ((s\\land (q\\land s))\\land p))), (p\\equiv \\lnot (\\lnot (q\\equiv s)\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\lor p)\\supset (s\\supset (\\lnot p\\lor p))),\\lnot ((s\\lor r)\\supset \\lnot (p\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0111011100000111"]
          ["\\(\\{ ((q\\land s)\\lor (p\\equiv ((p\\supset p)\\land p))),((r\\lor s)\\equiv (\\lnot p\\equiv \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011100000101 és 0110010111000111"]
          ["\\(\\{ (s\\lor ((p\\land s)\\lor \\lnot (s\\equiv q))),(\\lnot (\\lnot p\\equiv q)\\land (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0101111101011111 és 1100100110001101"]
          ["\\(\\{ \\lnot \\lnot ((s\\equiv s)\\equiv (s\\lor r)),((\\lnot (s\\supset (s\\equiv s))\\supset p)\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0110101110001000 és 0001011011111111"]
          ["\\(\\{ (\\lnot ((r\\lor r)\\supset p)\\lor (r\\land s)),(r\\equiv ((s\\lor (p\\land (p\\land p)))\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100010001 és 0010110100011001"]
          ["\\(\\{ (p\\land (r\\supset (\\lnot q\\supset \\lnot s))),\\lnot \\lnot (q\\supset (\\lnot r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011101111 és 1111111111110111"]
          ["\\(\\{ (\\lnot ((p\\lor r)\\lor q)\\lor (q\\lor r)),\\lnot (r\\supset (((q\\equiv r)\\land p)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100111111 és 0011001100010000"]
          ["\\(\\{ ((p\\lor q)\\land \\lnot (q\\land (p\\land r))),\\lnot (r\\supset ((r\\equiv p)\\land (r\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000010 és 0011001100110000"]
          ["\\(\\{ ((p\\equiv \\lnot r)\\lor (s\\lor (s\\land r))),\\lnot ((p\\land (p\\supset r))\\equiv (q\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0111011111011101 és 0000001110110000"]
          ["\\(\\{ ((s\\supset ((s\\land r)\\lor \\lnot q))\\land q),(((((r\\land r)\\lor s)\\equiv s)\\lor p)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001011 és 0000100000001111"]
          ["\\(\\{ ((q\\lor r)\\land (s\\land \\lnot (p\\supset r))),(((\\lnot s\\lor p)\\land s)\\equiv (s\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000100 és 1000011000000000"]
          ["\\(\\{ (((q\\equiv (r\\lor p))\\supset s)\\equiv (s\\land s)),((r\\supset p)\\land ((r\\supset q)\\equiv (p\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1111001011011111 és 0010000000111111"]
          ["\\(\\{ ((s\\lor (\\lnot p\\land q))\\supset (q\\supset q)),\\lnot (q\\lor (p\\supset (\\lnot p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0001011001010000"]
          ["\\(\\{ \\lnot ((p\\land (s\\land (p\\land p)))\\equiv r),(((s\\supset s)\\lor ((p\\lor s)\\land q))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0011001101100110 és 1101110111111111"]
          ["\\(\\{ (\\lnot p\\equiv ((q\\lor r)\\equiv (s\\lor p))),\\lnot (((q\\land (q\\equiv r))\\lor s)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1010111111000000 és 0101011001010000"]
          ["\\(\\{ ((((s\\land s)\\supset (p\\equiv r))\\equiv s)\\supset s),(((s\\equiv (p\\supset (p\\supset p)))\\equiv p)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 0101110111111111"]
          ["\\(\\{ ((s\\equiv \\lnot (q\\lor q))\\supset (s\\supset q)),(((p\\land s)\\lor q)\\lor (p\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1001111110101111 és 0000111101011111"]
          ["\\(\\{ (((r\\lor p)\\equiv q)\\supset ((s\\supset q)\\supset p)),((\\lnot (q\\equiv s)\\equiv p)\\land (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0111111011111111 és 1000000000000010"]
          ["\\(\\{ (\\lnot \\lnot (s\\lor p)\\equiv (s\\lor q)),((p\\supset (s\\supset (s\\equiv p)))\\supset (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1100100011011111 és 0001011000110011"]
          ["\\(\\{ \\lnot (q\\lor ((p\\lor r)\\lor (q\\supset r))),((((s\\land (q\\equiv s))\\supset p)\\land p)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 0010011000000000 és 1111011110110011"]
          ["\\(\\{ (((p\\supset \\lnot r)\\lor (p\\land s))\\supset s),((q\\lor (p\\land (q\\equiv q)))\\supset (q\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101110111 és 1110111011110011"]
          ["\\(\\{ \\lnot (r\\supset ((s\\lor q)\\equiv (q\\equiv q))),(\\lnot ((q\\land (r\\lor p))\\equiv r)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0010000100010011 és 1110011011001100"]
          ["\\(\\{ (p\\land (r\\land \\lnot \\lnot \\lnot q)),((q\\lor q)\\lor ((s\\lor (p\\equiv r))\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110000 és 0000111101111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ \\lnot \\lnot ((\\lnot q\\land q)\\equiv r), (r\\supset ((p\\land \\lnot (p\\supset q))\\land r)) \\}\\)"
         "\\(\\{ ((((s\\equiv p)\\lor r)\\land r)\\lor (r\\equiv q)), (((s\\land q)\\lor (q\\lor (q\\equiv q)))\\supset s) \\}\\)"
         "\\(\\{ ((q\\lor p)\\equiv \\lnot (r\\supset (q\\land q))), ((\\lnot s\\lor (r\\supset p))\\lor (s\\lor q)) \\}\\)"
         "\\(\\{ (\\lnot (p\\lor \\lnot p)\\lor (s\\land s)), (\\lnot \\lnot (r\\supset s)\\supset \\lnot q) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((s\\lor p)\\supset (\\lnot q\\land (p\\land r))),\\lnot (p\\lor (r\\land \\lnot \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110100110000 és 1100010100000000"]
          ["\\(\\{ (r\\supset (((r\\lor r)\\equiv q)\\equiv (q\\supset q))),((p\\equiv (\\lnot r\\land q))\\land (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111100111101111 és 0000000000000100"]
          ["\\(\\{ ((r\\supset s)\\lor (r\\land ((q\\equiv p)\\supset p))),((r\\land ((s\\equiv p)\\lor p))\\land (p\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0001000100010001"]
          ["\\(\\{ ((p\\supset (q\\supset r))\\equiv (\\lnot q\\lor r)),(((q\\supset q)\\lor (p\\land q))\\land (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0000000100010001"]
          ["\\(\\{ ((p\\supset ((r\\land r)\\supset p))\\supset (r\\equiv p)),((p\\land p)\\land \\lnot ((r\\land p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100110011 és 0000000000000010"]
          ["\\(\\{ ((p\\supset r)\\lor (q\\land (r\\land (r\\supset s)))),\\lnot ((s\\lor (q\\equiv q))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111011110110011 és 0001011100000101"]
          ["\\(\\{ ((p\\supset r)\\supset \\lnot (s\\equiv (s\\equiv r))),\\lnot (((q\\supset r)\\equiv p)\\lor (p\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1110111011001100 és 0010111000001000"]
          ["\\(\\{ \\lnot ((s\\lor s)\\lor (q\\equiv (r\\land p))),(\\lnot \\lnot q\\equiv ((p\\supset r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000101000 és 1100101000001011"]
          ["\\(\\{ \\lnot ((q\\supset r)\\land (p\\lor (r\\land q))),(((q\\supset s)\\lor ((r\\equiv r)\\equiv p))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1100010100001100 és 0001011011110101"]
          ["\\(\\{ (((p\\supset r)\\lor (s\\supset s))\\supset (p\\lor r)),(((q\\equiv ((r\\land r)\\equiv s))\\supset p)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0011011111111111 és 0000000011111111"]
          ["\\(\\{ (\\lnot ((p\\land s)\\equiv p)\\land (q\\lor s)),((s\\equiv p)\\lor \\lnot (r\\lor \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001010 és 1111111101010101"]
          ["\\(\\{ ((\\lnot s\\equiv p)\\supset \\lnot (s\\land s)),((q\\supset r)\\land \\lnot (r\\equiv (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111111 és 1100010010000000"]
          ["\\(\\{ (p\\land (p\\supset (q\\supset (p\\land (s\\equiv r))))),(((s\\lor s)\\lor (s\\lor \\lnot s))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0000000011111001 és 0001000100110011"]
          ["\\(\\{ (((p\\supset (r\\lor q))\\land (q\\land q))\\lor p),\\lnot ((p\\lor q)\\equiv (\\lnot p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 0100101111111111"]
          ["\\(\\{ (((s\\land (r\\equiv q))\\land s)\\land (q\\lor p)),((r\\supset s)\\equiv \\lnot ((q\\land s)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000001 és 1011101001001000"]
          ["\\(\\{ \\lnot ((((q\\equiv q)\\land s)\\lor s)\\supset q),((\\lnot ((p\\land q)\\lor p)\\land s)\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0101011001010000 és 1010111011001100"]
          ["\\(\\{ (\\lnot q\\land ((s\\equiv \\lnot p)\\supset q)),\\lnot (\\lnot (s\\land r)\\supset \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1000111011010000 és 0010001100100010"]
          ["\\(\\{ (p\\land \\lnot ((p\\lor \\lnot r)\\equiv p)),((\\lnot p\\land s)\\lor \\lnot (r\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0111011111001100"]
          ["\\(\\{ (((p\\land p)\\lor r)\\land \\lnot \\lnot s),((s\\equiv (r\\land (p\\land r)))\\supset (p\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 0001000101010101 és 1111110101110111"]
          ["\\(\\{ \\lnot \\lnot ((\\lnot q\\equiv q)\\lor s),\\lnot (s\\lor (r\\land \\lnot \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0101011101010101 és 1010111010001000"]
          ["\\(\\{ \\lnot (((s\\supset q)\\land q)\\lor (q\\equiv r)),(\\lnot ((s\\equiv p)\\land (r\\land p))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0011011011010000 és 1100011011111111"]
          ["\\(\\{ ((q\\equiv \\lnot r)\\land (q\\lor \\lnot p)),((r\\lor s)\\equiv ((s\\lor \\lnot p)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001100 és 1011110100101101"]
          ["\\(\\{ \\lnot ((s\\supset \\lnot p)\\lor (q\\lor r)),((s\\supset (p\\lor s))\\supset \\lnot (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0010011001000000 és 1111110111001100"]
          ["\\(\\{ (((r\\lor p)\\lor s)\\equiv (q\\land \\lnot r)),(q\\lor \\lnot (s\\supset ((r\\land r)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1010011100001100 és 0010111100001111"]
          ["\\(\\{ (q\\equiv ((q\\supset q)\\equiv (\\lnot q\\land q))),((p\\supset q)\\land ((q\\lor s)\\equiv (s\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1100101000001000 és 1000000000000101"]
          ["\\(\\{ \\lnot \\lnot (((r\\supset q)\\equiv q)\\land q),(r\\lor ((p\\land s)\\equiv \\lnot \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0000101000001111 és 1111011111110111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((r\\lor (\\lnot (q\\land p)\\supset q))\\supset q), ((r\\supset (s\\lor p))\\supset ((r\\lor q)\\equiv p)) \\}\\)"
         "\\(\\{ ((r\\land (q\\lor r))\\equiv (q\\equiv (r\\equiv r))), \\lnot (r\\supset ((p\\equiv q)\\equiv (q\\supset s))) \\}\\)"
         "\\(\\{ (((p\\lor (q\\lor r))\\equiv \\lnot p)\\lor p), (((q\\supset (r\\equiv q))\\equiv q)\\equiv \\lnot q) \\}\\)"
         "\\(\\{ ((r\\lor (r\\lor r))\\lor (s\\land (q\\lor s))), \\lnot ((r\\land (p\\equiv p))\\equiv (p\\lor r)) \\}\\)"
         "\\(\\{ (\\lnot ((s\\lor r)\\supset s)\\lor (q\\supset s)), \\lnot ((q\\supset (q\\lor s))\\supset \\lnot r) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot (s\\equiv \\lnot ((s\\lor s)\\lor r)),((s\\supset ((s\\lor q)\\land p))\\lor (p\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1111101111011101 és 1101111111111111"]
          ["\\(\\{ ((q\\lor \\lnot r)\\land (r\\land (q\\equiv q))),(((p\\lor p)\\equiv r)\\equiv (\\lnot p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000000 és 0001000010110011"]
          ["\\(\\{ (p\\land \\lnot \\lnot (r\\land (s\\land s))),((s\\equiv q)\\equiv (r\\land \\lnot \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000010001 és 0101100110011001"]
          ["\\(\\{ ((p\\equiv ((p\\lor q)\\lor p))\\lor \\lnot r),\\lnot (((s\\supset r)\\lor (s\\lor r))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1100011010000000"]
          ["\\(\\{ \\lnot (((s\\supset s)\\equiv s)\\supset (q\\lor q)),((p\\supset q)\\lor \\lnot \\lnot (s\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0100111001010000 és 1100111111011111"]
          ["\\(\\{ ((q\\land r)\\equiv (p\\supset \\lnot (s\\lor p))),(((\\lnot (r\\supset q)\\supset r)\\supset s)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0001010011111100 és 0000000001010101"]
          ["\\(\\{ \\lnot \\lnot (((s\\land s)\\land q)\\land p),\\lnot (r\\land (p\\supset \\lnot (p\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100010111001111"]
          ["\\(\\{ (\\lnot ((q\\lor s)\\equiv s)\\supset (s\\land q)),((p\\equiv (s\\land ((r\\supset p)\\land q)))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1100110100001101 és 0000011100000101"]
          ["\\(\\{ (((p\\lor r)\\land (p\\supset p))\\equiv (r\\supset s)),((p\\supset q)\\equiv \\lnot (p\\supset (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0010011011011101 és 0000111010001111"]
          ["\\(\\{ ((((r\\supset q)\\lor p)\\lor q)\\equiv (r\\lor q)),(((q\\supset s)\\land r)\\equiv \\lnot (r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0001101010111111 és 0010110100001110"]
          ["\\(\\{ \\lnot (((q\\equiv p)\\land (r\\land r))\\supset p),((r\\lor r)\\land ((p\\supset (q\\lor p))\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000001010000000 és 0011001100110011"]
          ["\\(\\{ ((q\\lor ((p\\land r)\\land \\lnot q))\\supset s),((((s\\lor q)\\equiv q)\\land (p\\equiv r))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 1101111111010101 és 0100101010100011"]
          ["\\(\\{ \\lnot (p\\land \\lnot ((p\\lor q)\\land s)),((q\\equiv (p\\lor (s\\supset q)))\\supset (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011010101 és 1001000011110011"]
          ["\\(\\{ ((r\\lor s)\\lor \\lnot \\lnot (q\\equiv r)),(q\\lor ((p\\lor (q\\equiv \\lnot p))\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1111011101110111 és 1100111111111111"]
          ["\\(\\{ (q\\lor (\\lnot (q\\land s)\\land (q\\land r))),((\\lnot p\\lor (r\\equiv r))\\supset (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0000000011111111"]
          ["\\(\\{ (\\lnot p\\equiv \\lnot (s\\equiv \\lnot q)),\\lnot (s\\supset (\\lnot s\\land (r\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1001010111011010 és 0101010101010101"]
          ["\\(\\{ \\lnot (s\\land (r\\equiv ((s\\lor s)\\land p))),((s\\supset (s\\lor p))\\equiv (p\\equiv (q\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1000011111101110 és 0100000111100101"]
          ["\\(\\{ (r\\land (r\\equiv \\lnot \\lnot (q\\supset s))),(\\lnot (r\\lor \\lnot s)\\equiv (r\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011000000110001 és 0001001100100010"]
          ["\\(\\{ \\lnot (q\\equiv ((q\\supset q)\\lor (p\\land p))),(\\lnot ((q\\land (q\\supset p))\\land s)\\supset r) \\}\\)" "az igazságtáblák főoszlopai: 1100000011110000 és 0011011100110111"]
          ["\\(\\{ (((p\\land q)\\equiv \\lnot (s\\land r))\\lor p),(\\lnot s\\equiv \\lnot (\\lnot r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0001000111111111 és 1101000000011110"]
          ["\\(\\{ (p\\supset (s\\supset ((q\\land s)\\supset (s\\land r)))),((\\lnot r\\land (r\\land q))\\lor (s\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111011 és 0101010101010101"]
          ["\\(\\{ (q\\supset (\\lnot (p\\land r)\\equiv \\lnot p)),(r\\supset (((s\\supset r)\\land s)\\equiv \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110011 és 1110110111101110"]
          ["\\(\\{ (q\\lor (\\lnot p\\supset (q\\land (q\\supset r)))),\\lnot (((s\\land s)\\supset (q\\equiv p))\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1000101011111010"]
          ["\\(\\{ ((p\\lor s)\\supset (s\\land (q\\supset (p\\equiv r)))),\\lnot (((q\\supset s)\\supset q)\\lor (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1101110101010001 és 1001011000000000"]
          ["\\(\\{ ((\\lnot q\\lor s)\\supset \\lnot (p\\supset q)),(\\lnot (r\\lor p)\\lor (r\\land (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0001111001111010 és 1111100100010001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (s\\supset (\\lnot s\\supset (q\\supset \\lnot q))), ((\\lnot r\\lor s)\\supset ((s\\equiv p)\\equiv q)) \\}\\)"
         "\\(\\{ ((r\\supset (r\\lor p))\\supset (s\\equiv (q\\supset r))), ((r\\lor s)\\lor (r\\supset (p\\supset \\lnot p))) \\}\\)"
         "\\(\\{ (((r\\land \\lnot p)\\lor r)\\equiv \\lnot s), ((p\\equiv (q\\supset q))\\lor (\\lnot s\\lor q)) \\}\\)"
         "\\(\\{ ((\\lnot (p\\supset s)\\supset q)\\lor (s\\equiv q)), ((q\\equiv ((r\\lor r)\\equiv (q\\supset q)))\\lor p) \\}\\)"
         "\\(\\{ ((p\\land (r\\lor p))\\supset \\lnot (s\\land s)), ((s\\land q)\\lor ((s\\equiv p)\\lor (p\\land q))) \\}\\)"
         "\\(\\{ ((q\\land (r\\lor p))\\supset (r\\equiv \\lnot r)), (\\lnot (\\lnot q\\lor (s\\equiv s))\\lor r) \\}\\)"
         "\\(\\{ \\lnot (r\\land (q\\equiv ((q\\land p)\\lor r))), \\lnot ((\\lnot q\\equiv r)\\lor (r\\equiv r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot s\\supset (\\lnot s\\equiv (p\\equiv r))),((\\lnot r\\land q)\\land (q\\equiv (r\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1111110111110111 és 0000100000001100"]
          ["\\(\\{ ((r\\supset r)\\land \\lnot ((p\\supset s)\\equiv p)),(\\lnot (s\\lor r)\\lor \\lnot \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1101001100101010 és 1010111011111111"]
          ["\\(\\{ ((q\\equiv (q\\equiv ((q\\equiv q)\\equiv s)))\\land p),(\\lnot ((s\\equiv p)\\lor q)\\equiv (r\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000001101010 és 1001111101101100"]
          ["\\(\\{ ((s\\land (q\\lor s))\\land (r\\land \\lnot s)),((r\\equiv ((q\\land p)\\supset (r\\lor s)))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0001000100000000 és 0000001000000011"]
          ["\\(\\{ ((((p\\equiv p)\\equiv q)\\equiv r)\\supset (p\\supset r)),((r\\lor r)\\equiv ((q\\supset p)\\supset \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0010010011001100"]
          ["\\(\\{ (\\lnot p\\lor ((r\\land (r\\lor s))\\land q)),(\\lnot q\\lor ((s\\land (p\\land q))\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100011110000011 és 1100111111111111"]
          ["\\(\\{ (\\lnot (r\\land (r\\land s))\\lor (p\\equiv s)),\\lnot ((r\\land q)\\supset ((q\\land q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0000000100000011"]
          ["\\(\\{ (\\lnot \\lnot r\\equiv (r\\supset (q\\supset r))),\\lnot ((q\\supset r)\\supset (r\\equiv (s\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0000110010110011 és 0110011001100010"]
          ["\\(\\{ (q\\equiv ((\\lnot (r\\land r)\\supset q)\\supset s)),\\lnot ((r\\lor q)\\supset (\\lnot r\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0010001010100101 és 0011011000110000"]
          ["\\(\\{ ((r\\land p)\\land (r\\land (p\\lor (s\\land r)))),((p\\equiv (q\\land s))\\equiv ((r\\lor r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 1010010011100011"]
          ["\\(\\{ (p\\lor ((q\\lor s)\\land \\lnot \\lnot q)),((\\lnot s\\lor r)\\supset ((p\\supset p)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 1110011011111111"]
          ["\\(\\{ (((s\\equiv r)\\lor (r\\supset (s\\supset q)))\\supset s),(\\lnot p\\equiv (((s\\land r)\\lor r)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 1110000110100010"]
          ["\\(\\{ (\\lnot ((q\\lor r)\\land p)\\lor \\lnot p),((\\lnot r\\lor s)\\equiv (p\\land (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010100000 és 0010010100100010"]
          ["\\(\\{ ((q\\equiv q)\\equiv (s\\equiv ((s\\supset s)\\supset r))),\\lnot ((s\\equiv s)\\land (s\\supset (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1010011110100110 és 0100001000000000"]
          ["\\(\\{ \\lnot \\lnot \\lnot \\lnot (p\\land q),(((p\\equiv s)\\lor r)\\equiv \\lnot (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001111 és 0110011010001000"]
          ["\\(\\{ ((((r\\supset r)\\equiv (p\\supset q))\\equiv p)\\equiv p),((q\\land (s\\lor (q\\equiv p)))\\supset \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1110110000101111 és 1100111011110000"]
          ["\\(\\{ (\\lnot (s\\lor s)\\equiv \\lnot (q\\supset s)),((\\lnot \\lnot p\\equiv p)\\equiv (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0100100101011111 és 0101100100000000"]
          ["\\(\\{ ((\\lnot (r\\lor q)\\supset (p\\supset s))\\land r),((q\\supset (q\\land ((r\\lor s)\\equiv q)))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0000111111111111"]
          ["\\(\\{ (r\\land ((r\\supset (\\lnot s\\equiv p))\\lor s)),((p\\lor p)\\supset \\lnot (q\\equiv (p\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 0011000100110011 és 1100111110111100"]
          ["\\(\\{ ((q\\equiv (\\lnot q\\lor s))\\land (p\\lor p)),\\lnot ((p\\supset q)\\land \\lnot (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000010000101 és 1100001111111101"]
          ["\\(\\{ (q\\land ((\\lnot r\\supset r)\\lor \\lnot q)),((s\\land \\lnot \\lnot (r\\supset s))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0000111100000011 és 1001000001100101"]
          ["\\(\\{ ((s\\lor ((q\\equiv r)\\equiv p))\\equiv (r\\land p)),((\\lnot s\\equiv q)\\equiv (p\\land \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1010010100111011 és 1001001000110101"]
          ["\\(\\{ ((q\\land ((q\\land s)\\supset p))\\land (r\\supset p)),(((r\\supset p)\\equiv (s\\lor r))\\supset (q\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000100001111 és 1101111010001000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\land ((q\\supset s)\\supset p))\\supset (r\\equiv p)), ((p\\supset (q\\lor r))\\equiv (p\\lor (r\\equiv p))) \\}\\)"
         "\\(\\{ \\lnot (p\\equiv (\\lnot r\\land \\lnot q)), ((r\\land ((q\\equiv s)\\supset q))\\supset (s\\land r)) \\}\\)"
         "\\(\\{ (((s\\lor p)\\equiv p)\\equiv ((p\\supset s)\\equiv r)), (s\\lor (((s\\equiv \\lnot p)\\equiv s)\\equiv p)) \\}\\)"
         "\\(\\{ ((s\\lor \\lnot r)\\lor (s\\land (q\\land p))), \\lnot (r\\land \\lnot \\lnot (s\\supset s)) \\}\\)"
         "\\(\\{ ((p\\equiv s)\\land ((q\\equiv \\lnot p)\\supset p)), (((s\\land r)\\equiv (q\\supset q))\\equiv (p\\supset r)) \\}\\)"
         "\\(\\{ ((((r\\supset s)\\equiv p)\\equiv r)\\lor (p\\equiv p)), (\\lnot q\\lor ((s\\lor q)\\equiv (s\\supset q))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\lor s)\\supset \\lnot \\lnot (q\\land p)),(\\lnot r\\lor (p\\equiv ((s\\lor r)\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1001011010101111 és 1110100111111111"]
          ["\\(\\{ ((q\\equiv s)\\equiv (((q\\land r)\\equiv r)\\lor p)),\\lnot (q\\equiv \\lnot (p\\lor (q\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1010000011100101 és 0011001110001111"]
          ["\\(\\{ ((r\\equiv (q\\land q))\\land (q\\land (p\\land r))),((p\\equiv (q\\supset s))\\equiv \\lnot (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000011 és 0001101010000010"]
          ["\\(\\{ ((q\\land p)\\lor (q\\supset (r\\lor (s\\equiv p)))),((p\\land r)\\equiv (\\lnot (s\\land p)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1000001001001100"]
          ["\\(\\{ ((q\\supset p)\\lor (\\lnot p\\equiv (r\\supset r))),(p\\land (q\\land (\\lnot p\\equiv (p\\lor s)))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0000000000000000"]
          ["\\(\\{ ((p\\equiv p)\\lor ((s\\land s)\\supset (s\\supset r))),(r\\land ((r\\lor q)\\equiv \\lnot (p\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 1111111110111011 és 0010001100000000"]
          ["\\(\\{ (((r\\equiv \\lnot s)\\supset r)\\lor (r\\land p)),(\\lnot (\\lnot p\\lor (q\\equiv q))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 0000000001010101"]
          ["\\(\\{ \\lnot (s\\lor (q\\supset ((r\\lor r)\\lor r))),\\lnot (\\lnot r\\supset (p\\land \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000001000 és 1110100100000000"]
          ["\\(\\{ ((r\\land ((q\\supset q)\\lor \\lnot p))\\lor p),(((r\\equiv (p\\lor r))\\land \\lnot q)\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0000001111111111 és 0000000001110000"]
          ["\\(\\{ ((p\\lor (p\\lor s))\\supset (r\\land (s\\equiv r))),(\\lnot (p\\equiv p)\\lor (\\lnot r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1011111100010001 és 0001000010000000"]
          ["\\(\\{ (\\lnot ((r\\equiv q)\\lor p)\\land (p\\supset p)),(((p\\land s)\\lor s)\\lor ((p\\equiv q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000010010000000 és 0101111101011111"]
          ["\\(\\{ ((\\lnot r\\supset q)\\supset \\lnot (r\\lor q)),(\\lnot ((r\\supset q)\\supset q)\\supset (q\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 1110011011000000 és 0011111100111111"]
          ["\\(\\{ (\\lnot (q\\equiv ((s\\supset r)\\lor r))\\lor s),((\\lnot q\\supset \\lnot (s\\land s))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1111010111110101 és 0101011101010101"]
          ["\\(\\{ ((r\\equiv s)\\lor (r\\equiv (p\\supset (p\\land p)))),(q\\equiv ((s\\equiv r)\\land \\lnot \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 1110010000010001"]
          ["\\(\\{ ((s\\supset (s\\land r))\\equiv (r\\land \\lnot q)),((p\\supset r)\\lor ((\\lnot q\\lor r)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0101011001110100 és 1111011110111111"]
          ["\\(\\{ (\\lnot (s\\equiv (q\\lor p))\\lor (p\\supset s)),((\\lnot s\\supset (q\\lor r))\\land (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111111111 és 0000000000001111"]
          ["\\(\\{ ((r\\land (r\\supset (p\\lor q)))\\lor \\lnot q),(p\\land (((s\\land p)\\equiv r)\\land (s\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111110011 és 0000000000010001"]
          ["\\(\\{ ((\\lnot (s\\equiv r)\\equiv (p\\land s))\\land r),(\\lnot (s\\supset q)\\land ((r\\lor q)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100000000 és 0001011000010000"]
          ["\\(\\{ (s\\land \\lnot \\lnot ((r\\equiv p)\\supset s)),(p\\supset ((p\\supset \\lnot p)\\lor (s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 1111111110111011"]
          ["\\(\\{ \\lnot (((p\\lor p)\\supset (q\\lor p))\\supset p),\\lnot ((r\\lor (r\\lor (q\\lor r)))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1100111100000000 és 1110011000000000"]
          ["\\(\\{ \\lnot (\\lnot s\\lor (s\\lor \\lnot p)),(\\lnot (p\\supset s)\\land ((p\\land p)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0001011000000000 és 0000000000001010"]
          ["\\(\\{ (((q\\lor q)\\supset \\lnot r)\\supset (r\\land p)),((r\\lor s)\\lor (\\lnot p\\equiv (r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0011011000110011 és 0111011111111111"]
          ["\\(\\{ (((p\\land q)\\lor \\lnot s)\\land \\lnot q),((q\\land (\\lnot (p\\lor q)\\equiv r))\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 1000110010100000 és 0101010101011101"]
          ["\\(\\{ (\\lnot (r\\lor (s\\equiv s))\\lor (q\\supset q)),((\\lnot r\\supset (\\lnot r\\land q))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 0000000000111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ ((s\\supset \\lnot (q\\equiv p))\\supset (q\\equiv q)), (\\lnot (\\lnot \\lnot q\\land p)\\lor p) \\}\\)"
         "\\(\\{ ((q\\land s)\\supset (((q\\equiv r)\\equiv p)\\lor r)), \\lnot (p\\equiv (s\\supset \\lnot (q\\land r))) \\}\\)"
         "\\(\\{ (((p\\land r)\\supset (q\\lor r))\\land (r\\lor s)), (((r\\supset r)\\equiv s)\\land (\\lnot s\\lor s)) \\}\\)"
         "\\(\\{ ((p\\supset (s\\equiv (r\\equiv p)))\\supset \\lnot p), \\lnot ((p\\lor r)\\land (r\\land (q\\land s))) \\}\\)"
         "\\(\\{ ((q\\lor r)\\equiv ((\\lnot q\\lor r)\\land p)), \\lnot (q\\lor \\lnot ((q\\equiv p)\\land s)) \\}\\)"
         "\\(\\{ ((q\\lor q)\\lor (r\\land (r\\lor (r\\lor s)))), \\lnot ((\\lnot p\\land s)\\supset (q\\lor p)) \\}\\)"
         "\\(\\{ (\\lnot (q\\land p)\\land (s\\supset (p\\lor s))), \\lnot (p\\lor (((r\\land s)\\supset p)\\supset s)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot (\\lnot q\\land q)\\land s), \\lnot ((q\\land s)\\land ((p\\supset p)\\supset r)) \\}\\)"
         "\\(\\{ \\lnot \\lnot (s\\lor \\lnot (p\\lor s)), \\lnot (((s\\equiv r)\\land p)\\equiv (p\\supset r)) \\}\\)"
         "\\(\\{ ((q\\land s)\\lor (\\lnot r\\lor \\lnot s)), ((r\\lor s)\\lor (p\\land (r\\supset (p\\land s)))) \\}\\)"
         "\\(\\{ (\\lnot ((r\\land r)\\land r)\\supset (r\\lor q)), \\lnot (s\\supset (((p\\lor p)\\equiv p)\\lor p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot ((s\\lor r)\\land q)\\land (p\\lor q)),\\lnot (((q\\lor q)\\supset (r\\equiv r))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0000000111111000 és 1100000111111111"]
          ["\\(\\{ ((p\\land \\lnot r)\\land ((q\\equiv s)\\equiv p)),((s\\lor p)\\equiv \\lnot (p\\supset (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000011000100 és 1001110111111111"]
          ["\\(\\{ ((r\\equiv (s\\equiv s))\\land ((r\\lor s)\\equiv q)),(\\lnot (r\\lor r)\\land (s\\equiv (r\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0010000001000100 és 1110100000001100"]
          ["\\(\\{ (\\lnot ((s\\lor q)\\lor (r\\land r))\\equiv p),(\\lnot \\lnot \\lnot p\\equiv \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0111111110000000 és 1001000111010101"]
          ["\\(\\{ (s\\land ((r\\land (q\\land s))\\land (r\\equiv s))),(((q\\lor r)\\equiv q)\\lor ((p\\land r)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000001 és 1110101000111111"]
          ["\\(\\{ (((r\\supset r)\\lor ((r\\equiv p)\\land r))\\land r),((r\\land (q\\land (p\\equiv q)))\\land (r\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0000001000000011"]
          ["\\(\\{ (r\\supset ((s\\lor (s\\equiv q))\\equiv \\lnot q)),\\lnot \\lnot \\lnot \\lnot (p\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1111100111111110 és 0000111111111111"]
          ["\\(\\{ (r\\equiv (\\lnot p\\land (\\lnot s\\land p))),(p\\equiv \\lnot \\lnot \\lnot (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1110100101001100 és 0011001111001100"]
          ["\\(\\{ ((((q\\supset s)\\land p)\\lor s)\\lor (s\\supset p)),(r\\land (s\\supset \\lnot ((s\\supset p)\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1101110111111111 és 0001001100100010"]
          ["\\(\\{ (\\lnot q\\equiv (((r\\equiv s)\\lor p)\\equiv p)),\\lnot ((r\\lor r)\\supset (p\\supset \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0111001000001000 és 0011011000110011"]
          ["\\(\\{ ((q\\supset p)\\equiv (q\\lor (\\lnot r\\equiv s))),((q\\equiv p)\\land ((p\\land p)\\lor (p\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 0111101111101111 és 1100011000001111"]
          ["\\(\\{ (p\\land \\lnot (\\lnot (r\\land s)\\supset q)),((s\\supset r)\\supset (((q\\land q)\\equiv s)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000011100000 és 1111111101101111"]
          ["\\(\\{ (\\lnot ((s\\lor (q\\land s))\\lor p)\\supset p),(((s\\equiv q)\\supset p)\\land (p\\supset (p\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0101010111111111 és 0101001010110011"]
          ["\\(\\{ ((q\\equiv ((p\\lor q)\\equiv r))\\equiv (q\\land r)),\\lnot (\\lnot \\lnot (q\\lor q)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 1110100001111111 és 0101101001011010"]
          ["\\(\\{ (s\\equiv ((s\\supset s)\\supset (s\\equiv (s\\supset s)))),\\lnot (q\\supset ((q\\lor r)\\equiv (q\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1100100011111111 és 0010011100001010"]
          ["\\(\\{ (\\lnot (q\\land (r\\lor (q\\lor r)))\\supset r),\\lnot (\\lnot (p\\supset (r\\land p))\\equiv r) \\}\\)" "az igazságtáblák főoszlopai: 0011111100111111 és 0011001111111111"]
          ["\\(\\{ \\lnot (r\\equiv ((s\\land \\lnot p)\\land p)),\\lnot \\lnot (r\\equiv ((s\\equiv q)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 0111100100110011"]
          ["\\(\\{ ((q\\land q)\\lor (q\\land (p\\lor (p\\equiv q)))),((r\\lor q)\\land ((r\\land q)\\land (q\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0000001000000011"]
          ["\\(\\{ \\lnot (\\lnot (q\\supset p)\\equiv (p\\equiv q)),((p\\lor ((r\\lor s)\\equiv q))\\lor (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1100000100001111 és 1010001011111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((q\\lor p)\\supset (((r\\equiv s)\\land p)\\supset p)), \\lnot (\\lnot q\\equiv (s\\land \\lnot r)) \\}\\)"
         "\\(\\{ ((((s\\lor s)\\supset q)\\supset q)\\supset (p\\supset p)), ((s\\lor p)\\supset \\lnot (r\\lor (r\\supset s))) \\}\\)"
         "\\(\\{ (\\lnot \\lnot r\\lor (p\\supset (p\\supset p))), ((r\\lor \\lnot s)\\lor (r\\equiv \\lnot p)) \\}\\)"
         "\\(\\{ \\lnot ((s\\equiv q)\\equiv (s\\lor (q\\lor q))), (((r\\supset p)\\equiv \\lnot r)\\equiv \\lnot p) \\}\\)"
         "\\(\\{ (((q\\supset p)\\supset \\lnot r)\\land (q\\supset q)), (((q\\lor (s\\lor s))\\land (q\\equiv r))\\supset q) \\}\\)"
         "\\(\\{ ((q\\equiv \\lnot (p\\land q))\\lor (r\\land q)), ((q\\land \\lnot p)\\lor (r\\land (r\\land q))) \\}\\)"
         "\\(\\{ ((((q\\equiv q)\\lor q)\\land (r\\equiv p))\\supset q), ((((r\\supset (q\\supset p))\\land s)\\land s)\\supset r) \\}\\)"
         "\\(\\{ (s\\lor ((s\\lor q)\\equiv (q\\land (r\\lor q)))), ((p\\equiv p)\\equiv ((p\\supset s)\\lor (p\\supset q))) \\}\\)"
         "\\(\\{ (p\\lor (p\\supset (\\lnot (s\\equiv r)\\equiv q))), \\lnot \\lnot (\\lnot r\\equiv \\lnot q) \\}\\)"
         "\\(\\{ \\lnot ((r\\land p)\\land \\lnot (r\\land s)), ((((r\\equiv p)\\equiv r)\\equiv (s\\equiv s))\\supset p) \\}\\)"
         "\\(\\{ (q\\land ((s\\land (p\\lor p))\\supset \\lnot q)), (q\\lor (s\\supset ((p\\lor p)\\land (r\\supset p)))) \\}\\)"
         "\\(\\{ \\lnot \\lnot (((s\\equiv r)\\lor r)\\supset q), ((r\\lor s)\\equiv \\lnot ((q\\lor p)\\supset r)) \\}\\)"
         "\\(\\{ (((s\\supset q)\\supset q)\\equiv (r\\land (s\\land p))), ((s\\lor r)\\supset \\lnot (s\\land (s\\lor r))) \\}\\)"
         "\\(\\{ (\\lnot (s\\supset s)\\lor (\\lnot p\\supset q)), ((q\\supset (r\\lor \\lnot p))\\supset \\lnot p) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((q\\land q)\\lor (r\\land (p\\land r)))\\supset p),(\\lnot \\lnot r\\supset (\\lnot s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011111111 és 1111110111011101"]
          ["\\(\\{ (s\\equiv (\\lnot \\lnot r\\equiv (s\\land s))),\\lnot (((r\\supset p)\\supset (q\\land q))\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0011000010110011 és 1110100111111100"]
          ["\\(\\{ ((\\lnot p\\lor p)\\supset ((r\\equiv p)\\land r)),\\lnot ((p\\supset r)\\land ((r\\supset r)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0010000110110011 és 0010100101001100"]
          ["\\(\\{ \\lnot ((p\\equiv \\lnot p)\\supset (s\\lor r)),(((s\\equiv (s\\lor s))\\land s)\\lor \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0010111010000000 és 1101110110101010"]
          ["\\(\\{ (q\\lor \\lnot (r\\supset (r\\lor (p\\equiv r)))),(\\lnot (q\\lor (s\\equiv p))\\land (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0010111100001111 és 0000000000000000"]
          ["\\(\\{ ((q\\land (q\\equiv s))\\land ((p\\land s)\\land r)),(((q\\equiv (p\\land r))\\supset s)\\supset (s\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000001 és 1001111111111111"]
          ["\\(\\{ ((s\\land r)\\lor ((p\\land r)\\equiv (r\\supset r))),\\lnot ((s\\equiv p)\\equiv ((q\\equiv q)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0011000100110011 és 0110101001100110"]
          ["\\(\\{ (\\lnot (q\\lor p)\\lor ((p\\supset s)\\land s)),((r\\equiv q)\\land ((p\\land q)\\lor \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 1101111101010101 és 1100010000000011"]
          ["\\(\\{ (\\lnot \\lnot (r\\equiv p)\\land (q\\supset s)),(((p\\land r)\\lor r)\\equiv (\\lnot r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100100100110001 és 1010100001001000"]
          ["\\(\\{ ((((s\\land q)\\equiv s)\\lor q)\\lor (r\\lor p)),((s\\lor p)\\land (((q\\land p)\\land q)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1011111111111111 és 0100000111000011"]
          ["\\(\\{ (s\\land \\lnot ((p\\land (q\\land s))\\land q)),\\lnot \\lnot ((q\\lor p)\\supset (r\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000100 és 1111111101110111"]
          ["\\(\\{ \\lnot ((\\lnot p\\supset r)\\land (q\\land q)),(((p\\lor p)\\supset q)\\equiv \\lnot (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1100010111110000 és 1111111110111100"]
          ["\\(\\{ \\lnot (q\\lor (p\\supset (p\\equiv (r\\lor r)))),(s\\land (q\\lor \\lnot (q\\land \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 0011011001000000 és 0100010100000101"]
          ["\\(\\{ (p\\land \\lnot (q\\lor (p\\equiv (r\\supset s)))),(\\lnot \\lnot (p\\lor (r\\supset s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000100000 és 0101010101010101"]
          ["\\(\\{ (((r\\supset (s\\land r))\\supset \\lnot q)\\lor r),((r\\lor q)\\land (s\\supset ((s\\supset q)\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110011 és 0001110100101111"]
          ["\\(\\{ ((((r\\equiv p)\\land s)\\lor r)\\supset \\lnot r),(\\lnot \\lnot p\\land (s\\land (s\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 1110100111001100 és 0000000001010101"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((r\\supset \\lnot p)\\land (r\\lor s))\\lor p), ((s\\lor q)\\supset \\lnot (q\\land (r\\lor r))) \\}\\)"
         "\\(\\{ ((p\\supset q)\\supset ((r\\land r)\\lor (q\\supset r))), ((r\\lor (q\\equiv s))\\equiv (p\\lor \\lnot q)) \\}\\)"
         "\\(\\{ ((p\\supset ((q\\land s)\\equiv q))\\supset (q\\supset r)), (r\\lor (((q\\supset (q\\lor r))\\supset p)\\land p)) \\}\\)"
         "\\(\\{ (r\\lor ((q\\equiv p)\\supset ((r\\lor q)\\land r))), (((q\\supset q)\\supset p)\\lor ((p\\supset s)\\supset q)) \\}\\)"
         "\\(\\{ ((\\lnot r\\supset q)\\equiv \\lnot (q\\equiv r)), ((\\lnot (p\\supset r)\\lor (q\\supset r))\\supset s) \\}\\)"
         "\\(\\{ (\\lnot (r\\supset s)\\equiv ((q\\equiv s)\\supset r)), ((r\\supset (\\lnot \\lnot p\\lor s))\\land s) \\}\\)"
         "\\(\\{ ((p\\equiv r)\\lor ((q\\supset s)\\land \\lnot s)), \\lnot (s\\land (p\\supset ((q\\lor r)\\lor p))) \\}\\)"
         "\\(\\{ ((q\\land s)\\equiv (\\lnot (r\\equiv r)\\lor r)), (s\\lor (((s\\land s)\\land (q\\land r))\\supset q)) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\lor ((s\\lor (p\\lor r))\\land q)), ((r\\lor (r\\land q))\\land (p\\equiv \\lnot s)) \\}\\)"
         "\\(\\{ (((r\\lor (r\\equiv p))\\supset (r\\land q))\\lor p), (s\\lor ((p\\supset s)\\equiv (q\\lor (p\\supset p)))) \\}\\)"
         "\\(\\{ (r\\supset \\lnot \\lnot ((p\\supset r)\\equiv p)), (q\\supset (q\\supset \\lnot (q\\supset \\lnot p))) \\}\\)"
         "\\(\\{ \\lnot ((\\lnot s\\equiv q)\\equiv \\lnot r), ((\\lnot s\\equiv q)\\equiv (p\\equiv (s\\supset q))) \\}\\)"
         "\\(\\{ ((s\\lor p)\\land (s\\supset (\\lnot q\\lor p))), (((s\\lor p)\\supset s)\\lor (s\\equiv (p\\land r))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (q\\supset \\lnot p)\\land (s\\equiv s)),(\\lnot r\\lor (p\\supset ((q\\lor r)\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 1110111111111111"]
          ["\\(\\{ ((s\\supset p)\\equiv (q\\lor ((r\\land s)\\supset q))),(((r\\equiv r)\\lor p)\\land (\\lnot r\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1000010000011111 és 0000000010000000"]
          ["\\(\\{ ((\\lnot q\\supset q)\\equiv (s\\supset (p\\lor p))),((r\\land r)\\land ((p\\supset (p\\lor p))\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 0101100010001111 és 0000001100000011"]
          ["\\(\\{ (((q\\lor ((s\\equiv s)\\lor q))\\lor s)\\equiv q),((r\\equiv q)\\land ((r\\supset p)\\supset (q\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 0001101001101111 és 0010010000000001"]
          ["\\(\\{ \\lnot ((p\\land \\lnot (r\\equiv r))\\land r),\\lnot (s\\supset (((r\\lor r)\\supset q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 0110011000010000"]
          ["\\(\\{ ((((q\\equiv (q\\equiv q))\\supset p)\\lor p)\\equiv r),((\\lnot (\\lnot q\\equiv s)\\equiv s)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0010000010110011 és 0011111100111111"]
          ["\\(\\{ (\\lnot (r\\land r)\\land ((s\\lor r)\\lor r)),(r\\equiv (q\\equiv \\lnot (\\lnot r\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0110000101000100 és 1110001001001111"]
          ["\\(\\{ (p\\equiv (\\lnot p\\lor (p\\lor (p\\land p)))),((\\lnot (r\\land s)\\supset s)\\equiv (q\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0101000011010101"]
          ["\\(\\{ ((s\\lor (q\\equiv q))\\equiv (s\\lor \\lnot p)),\\lnot ((q\\equiv r)\\lor (s\\lor (q\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011011111111 és 0010111010001000"]
          ["\\(\\{ ((r\\supset (p\\supset s))\\supset (r\\equiv (s\\lor q))),(((s\\equiv p)\\lor (p\\lor p))\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1011011001110011 és 1001100111110000"]
          ["\\(\\{ (((q\\equiv s)\\supset ((r\\lor p)\\equiv q))\\land s),(\\lnot ((s\\land q)\\land s)\\lor (q\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0101010001010101 és 1100111111111111"]
          ["\\(\\{ \\lnot ((s\\land r)\\lor (r\\supset (s\\land q))),(p\\land \\lnot ((p\\land s)\\supset (r\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0010010100100010 és 0000000000000100"]
          ["\\(\\{ (p\\lor (((s\\supset \\lnot q)\\land s)\\land q)),\\lnot ((q\\equiv \\lnot (q\\lor p))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0000010111111111 és 0000100011111111"]
          ["\\(\\{ \\lnot ((s\\equiv (q\\equiv p))\\lor (p\\equiv r)),(((s\\lor q)\\equiv (r\\supset s))\\equiv (p\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0010001101001000 és 1010001000000011"]
          ["\\(\\{ \\lnot (q\\lor (s\\supset ((q\\lor r)\\supset q))),((s\\equiv \\lnot (\\lnot p\\supset s))\\land s) \\}\\)" "az igazságtáblák főoszlopai: 0010011000010000 és 0000000001000000"]
          ["\\(\\{ ((s\\land (\\lnot s\\equiv s))\\land (p\\lor s)),\\lnot \\lnot (\\lnot (r\\land q)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0000111100001111"]
          ["\\(\\{ (q\\supset ((s\\lor \\lnot q)\\land (r\\lor q))),(\\lnot \\lnot (r\\equiv r)\\land (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110101 és 0100010000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (\\lnot ((p\\land q)\\supset s)\\equiv (s\\supset p)), (s\\supset ((p\\lor p)\\land \\lnot (p\\supset s))) \\}\\)"
         "\\(\\{ ((q\\equiv (p\\lor s))\\equiv ((p\\land s)\\land q)), (\\lnot \\lnot (s\\equiv \\lnot s)\\supset p) \\}\\)"
         "\\(\\{ ((r\\lor s)\\equiv \\lnot ((s\\lor r)\\equiv s)), ((((p\\equiv q)\\supset p)\\land \\lnot r)\\supset p) \\}\\)"
         "\\(\\{ \\lnot ((((q\\supset q)\\supset s)\\equiv q)\\equiv p), (\\lnot (s\\supset p)\\equiv ((s\\land s)\\equiv q)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((p\\equiv p)\\equiv (((r\\equiv p)\\lor q)\\equiv r)),((q\\lor p)\\supset ((p\\lor (p\\supset s))\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0001100000001100 és 1101111111111111"]
          ["\\(\\{ ((\\lnot \\lnot p\\land s)\\equiv \\lnot p),(q\\equiv ((r\\supset p)\\supset ((s\\land p)\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 0000000010101010 és 1110010001100101"]
          ["\\(\\{ ((r\\land ((q\\supset s)\\lor p))\\land (s\\land s)),(\\lnot (((p\\equiv p)\\land r)\\equiv q)\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010001 és 0000000000001111"]
          ["\\(\\{ (((q\\land s)\\equiv q)\\lor \\lnot \\lnot s),((s\\land (r\\land (p\\land (s\\equiv s))))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1101110101011101 és 1101011101010101"]
          ["\\(\\{ (\\lnot ((p\\equiv r)\\lor \\lnot r)\\equiv p),(\\lnot (\\lnot (s\\lor r)\\land p)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 1110100100000000 és 1100111111111111"]
          ["\\(\\{ (q\\lor ((\\lnot r\\land q)\\supset (q\\lor q))),((p\\supset p)\\land (q\\land ((r\\supset r)\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1100111111111111 és 0000000000001111"]
          ["\\(\\{ (\\lnot ((r\\equiv (p\\supset q))\\lor r)\\land s),(q\\land (p\\equiv (p\\land ((q\\supset r)\\lor r)))) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000100 és 0000011000001011"]
          ["\\(\\{ (\\lnot (s\\land q)\\supset ((r\\supset q)\\land s)),(((p\\supset (r\\supset q))\\land p)\\lor (p\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0100010101000101 és 0011001111111111"]
          ["\\(\\{ (((s\\land \\lnot s)\\land p)\\land (p\\supset q)),((s\\supset r)\\lor (s\\lor (q\\land (r\\lor r)))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111111111111111"]
          ["\\(\\{ (q\\land (s\\equiv (((p\\supset p)\\supset p)\\lor q))),((s\\land (\\lnot q\\supset p))\\lor (r\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 0011011101110111"]
          ["\\(\\{ ((p\\lor (((q\\land q)\\land p)\\land q))\\supset r),\\lnot (q\\land ((q\\land (r\\supset r))\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1111011110110011 és 1100010000000010"]
          ["\\(\\{ \\lnot (\\lnot (r\\equiv s)\\lor (r\\land p)),\\lnot (\\lnot (q\\equiv s)\\lor (q\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110001000 és 0001011000000000"]
          ["\\(\\{ (r\\equiv (r\\equiv \\lnot ((p\\lor q)\\equiv q))),((((p\\lor r)\\lor p)\\land s)\\land (s\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0001000000001000 és 0001000101010101"]
          ["\\(\\{ (\\lnot ((r\\lor q)\\land \\lnot s)\\equiv p),(((q\\supset (p\\land q))\\lor p)\\land (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0001110111010101 és 0000010000000101"]
          ["\\(\\{ (q\\lor ((p\\supset ((p\\land r)\\equiv q))\\equiv q)),(q\\land (\\lnot \\lnot \\lnot p\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100111111 és 0000001100001111"]
          ["\\(\\{ \\lnot (r\\supset (s\\supset ((s\\land p)\\land p))),((q\\equiv ((s\\supset s)\\land (s\\land p)))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0010010100000000 és 0000011101010101"]
          ["\\(\\{ (((r\\lor q)\\lor ((q\\equiv s)\\supset p))\\supset r),((q\\land r)\\supset (((q\\lor q)\\land s)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1011011100110011 és 1110111111111101"]
          ["\\(\\{ (r\\lor (s\\land \\lnot (\\lnot q\\equiv q))),\\lnot (\\lnot (p\\lor q)\\lor \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 0111001101110111 és 0000111100001111"]
          ["\\(\\{ \\lnot (s\\supset (r\\supset ((r\\land q)\\lor q))),(\\lnot r\\supset ((q\\land q)\\supset \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 0010011000010000 és 1111111111110011"]
          ["\\(\\{ ((s\\lor r)\\supset (\\lnot (r\\supset r)\\supset r)),((r\\lor ((q\\lor q)\\equiv q))\\equiv \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 1110001100111100"]
          ["\\(\\{ (((r\\supset r)\\lor (s\\lor r))\\land (p\\equiv r)),((r\\land r)\\land (p\\lor ((p\\land s)\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1110100100110011 és 0000001100110011"]
          ["\\(\\{ (q\\equiv ((r\\supset s)\\land (q\\equiv (q\\supset r)))),(\\lnot ((p\\land q)\\supset p)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1111111001110001 és 0000000000000000"]
          ["\\(\\{ (((r\\lor s)\\land r)\\supset ((r\\lor p)\\land r)),(q\\land (((p\\supset p)\\land \\lnot q)\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1111101111111111 és 0000101100000000"]
          ["\\(\\{ (((p\\supset s)\\land (q\\equiv q))\\land (p\\land p)),(((p\\land (s\\equiv (r\\lor s)))\\equiv q)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 0101111101110111"]
          ["\\(\\{ ((\\lnot p\\land (q\\land q))\\supset (s\\land s)),(((s\\supset p)\\lor \\lnot (r\\land p))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 1101010101010101 és 1111111111111111"]
          ["\\(\\{ ((s\\supset ((q\\land s)\\lor r))\\supset (q\\land q)),(((p\\land s)\\lor p)\\supset (p\\equiv (r\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 0110111101001111 és 1110111110110011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot (s\\land (p\\equiv p))\\equiv (q\\land r)), (\\lnot (r\\supset \\lnot r)\\lor (q\\lor s)) \\}\\)"
         "\\(\\{ \\lnot ((p\\lor p)\\supset (p\\supset (q\\land p))), (((q\\supset r)\\lor (p\\land (q\\land p)))\\lor r) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((q\\lor s)\\lor \\lnot r), ((q\\lor (s\\lor p))\\land ((q\\equiv s)\\land s)) \\}\\)"
         "\\(\\{ (s\\land (\\lnot \\lnot p\\supset (p\\land p))), ((\\lnot p\\land p)\\supset (q\\supset \\lnot p)) \\}\\)"
         "\\(\\{ (r\\supset ((p\\equiv (s\\land (p\\land q)))\\lor s)), ((p\\lor (\\lnot s\\land r))\\equiv \\lnot s) \\}\\)"
         "\\(\\{ (s\\land (((p\\lor p)\\land p)\\lor \\lnot q)), ((\\lnot (q\\supset r)\\land (p\\equiv r))\\supset p) \\}\\)"
         "\\(\\{ \\lnot (((p\\land p)\\equiv (q\\land s))\\lor r), \\lnot \\lnot (((q\\supset s)\\equiv q)\\supset p) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (r\\supset q)\\equiv (r\\supset q)), ((r\\equiv r)\\equiv \\lnot \\lnot (p\\equiv r)) \\}\\)"
         "\\(\\{ ((s\\equiv s)\\supset (s\\lor (r\\land (r\\lor p)))), (q\\lor (s\\lor (((q\\supset q)\\land r)\\land r))) \\}\\)"
]
  :wrong [
          ["\\(\\{ (q\\equiv ((((q\\equiv p)\\lor q)\\lor p)\\lor r)),(((p\\supset q)\\lor p)\\equiv (q\\equiv (q\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0010101010001111 és 0000101000000000"]
          ["\\(\\{ ((s\\supset q)\\supset (\\lnot (q\\supset r)\\land p)),\\lnot ((((p\\lor q)\\supset r)\\equiv s)\\lor s) \\}\\)" "az igazságtáblák főoszlopai: 0101011001011100 és 1010110110100010"]
          ["\\(\\{ ((q\\land \\lnot \\lnot (p\\land q))\\land s),(q\\supset ((q\\supset ((p\\land r)\\lor p))\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000101 és 1100111011110011"]
          ["\\(\\{ ((q\\land p)\\land \\lnot \\lnot \\lnot r),(\\lnot ((s\\lor r)\\land p)\\equiv (p\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001100 és 0101100101001000"]
          ["\\(\\{ (p\\equiv (s\\land ((p\\supset s)\\land \\lnot p))),((r\\land (((s\\supset p)\\supset r)\\land p))\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1000001010000000 és 1101011101111101"]
          ["\\(\\{ (p\\equiv \\lnot ((s\\lor r)\\supset \\lnot r)),(p\\lor \\lnot (s\\supset (s\\equiv (q\\lor q)))) \\}\\)" "az igazságtáblák főoszlopai: 1110111100110011 és 0101010111111111"]
          ["\\(\\{ ((q\\lor (p\\land r))\\equiv ((p\\supset p)\\equiv q)),((r\\supset r)\\supset (((s\\land r)\\land r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100001000101111 és 1111101100010001"]
          ["\\(\\{ (s\\equiv ((s\\equiv \\lnot s)\\land \\lnot p)),((\\lnot p\\supset \\lnot (p\\lor s))\\supset p) \\}\\)" "az igazságtáblák főoszlopai: 1001111000101010 és 0101010111111111"]
          ["\\(\\{ ((p\\land (s\\supset r))\\land (q\\lor (p\\equiv q))),((s\\equiv (r\\supset \\lnot (q\\equiv p)))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001011 és 0000000000000110"]
          ["\\(\\{ ((((r\\land s)\\equiv r)\\lor (q\\lor r))\\lor q),\\lnot (s\\equiv (((q\\supset s)\\land q)\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100111111 és 0101010101010000"]
          ["\\(\\{ (\\lnot ((s\\land p)\\equiv s)\\equiv (p\\supset p)),((p\\land q)\\supset ((p\\supset p)\\equiv (p\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 0101100100000000 és 1100111010001111"]
          ["\\(\\{ ((q\\lor q)\\equiv (p\\land \\lnot (q\\land q))),((\\lnot \\lnot r\\lor r)\\land (r\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 0001000100010001"]
          ["\\(\\{ (((s\\land \\lnot \\lnot p)\\equiv p)\\equiv q),(s\\lor (((p\\land r)\\supset (p\\equiv q))\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 0000101100100101 és 0101111111111111"]
          ["\\(\\{ ((p\\land r)\\land (((q\\lor p)\\land r)\\equiv q)),(\\lnot ((p\\lor p)\\equiv p)\\equiv (q\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000100011 és 0010011000001100"]
          ["\\(\\{ \\lnot (\\lnot (q\\lor p)\\supset (q\\land r)),(p\\supset \\lnot \\lnot \\lnot (s\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111000000000 és 1101011110000000"]
          ["\\(\\{ ((s\\land \\lnot (s\\equiv p))\\land (p\\supset r)),(((s\\equiv p)\\land ((q\\land s)\\equiv r))\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 0101010100000000 és 1000110111111111"]
          ["\\(\\{ (r\\land (p\\land (\\lnot (r\\lor p)\\supset r))),((\\lnot s\\equiv s)\\land (r\\equiv (r\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 0000000000110011 és 0000001000000000"]
          ["\\(\\{ ((s\\lor p)\\supset (q\\land (\\lnot s\\supset r))),(\\lnot ((s\\land r)\\supset r)\\equiv (r\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1001111100000111 és 0000101010000000"]
          ["\\(\\{ (((s\\supset p)\\land s)\\equiv ((q\\supset r)\\land r)),((\\lnot p\\supset q)\\lor \\lnot (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1111111110011001 és 1100111111111111"]
          ["\\(\\{ (((p\\land s)\\lor (s\\supset \\lnot s))\\equiv r),(((q\\supset q)\\supset (s\\land p))\\lor (s\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0111011100110011 és 0000111001010101"]
          ["\\(\\{ ((((s\\land p)\\equiv r)\\supset q)\\equiv (p\\lor q)),(p\\supset (\\lnot (r\\lor s)\\land (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1110101011101111 és 1100011010000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((\\lnot r\\equiv q)\\land ((s\\lor s)\\equiv q)), ((s\\supset (\\lnot q\\land s))\\equiv \\lnot s) \\}\\)"
         "\\(\\{ (\\lnot p\\supset ((s\\supset r)\\land \\lnot p)), \\lnot (s\\land (\\lnot (p\\land s)\\equiv s)) \\}\\)"
         "\\(\\{ (p\\equiv (\\lnot (s\\lor \\lnot q)\\supset q)), ((s\\land (r\\lor (q\\lor q)))\\lor (r\\land r)) \\}\\)"
         "\\(\\{ (p\\equiv (s\\supset (q\\equiv (q\\supset \\lnot q)))), (\\lnot ((q\\lor s)\\land (p\\lor r))\\lor s) \\}\\)"
         "\\(\\{ ((q\\land r)\\lor (q\\supset \\lnot (q\\lor q))), ((r\\land s)\\supset \\lnot (s\\lor (q\\supset s))) \\}\\)"
         "\\(\\{ \\lnot (\\lnot (q\\equiv (r\\lor p))\\equiv q), ((p\\lor (r\\equiv s))\\land ((s\\equiv r)\\equiv s)) \\}\\)"
         "\\(\\{ (q\\supset \\lnot (((r\\equiv p)\\supset r)\\lor s)), ((q\\land p)\\supset (\\lnot q\\lor (s\\supset q))) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((q\\lor s)\\supset (q\\supset r)), ((r\\land ((q\\lor (p\\equiv r))\\equiv s))\\equiv s) \\}\\)"
         "\\(\\{ ((s\\land ((s\\supset r)\\land p))\\lor (p\\lor p)), (\\lnot s\\lor ((r\\supset p)\\lor \\lnot r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot ((s\\land p)\\equiv ((q\\lor p)\\equiv q)),(((p\\land q)\\lor (s\\supset r))\\supset (s\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1100011011011010 és 1111111111011001"]
          ["\\(\\{ (r\\equiv (((r\\equiv q)\\equiv (q\\lor r))\\land s)),((s\\supset ((p\\land s)\\lor q))\\land \\lnot q) \\}\\)" "az igazságtáblák főoszlopai: 1111100001001101 és 1000111011110000"]
          ["\\(\\{ (r\\supset (p\\supset \\lnot \\lnot (p\\land s))),(p\\supset (s\\lor (\\lnot s\\lor \\lnot p))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111011101 és 1101111111111111"]
          ["\\(\\{ (s\\lor (q\\land ((p\\lor s)\\supset (s\\land q)))),((s\\equiv r)\\lor (((r\\land q)\\supset r)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0101110101010101 és 1011111111111111"]
          ["\\(\\{ ((q\\supset (s\\supset r))\\supset ((s\\equiv s)\\supset s)),(\\lnot s\\lor (s\\supset (q\\land (s\\equiv q)))) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 1001110110101111"]
          ["\\(\\{ (((q\\equiv r)\\land ((p\\land p)\\lor r))\\lor q),(((r\\lor r)\\land q)\\equiv \\lnot (q\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0010111100101111 és 0000110100001100"]
          ["\\(\\{ ((s\\equiv \\lnot s)\\equiv ((p\\supset r)\\lor s)),((r\\supset q)\\supset (((q\\equiv q)\\supset r)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0010010110001000 és 0011011100110001"]
          ["\\(\\{ ((p\\land (q\\lor (q\\land q)))\\land (r\\supset r)),(s\\equiv (((p\\supset p)\\land q)\\equiv \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000001111 és 1100001000001000"]
          ["\\(\\{ ((\\lnot s\\lor s)\\supset (r\\lor \\lnot r)),(((q\\supset (s\\supset q))\\land q)\\equiv (s\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0110101011001011"]
          ["\\(\\{ \\lnot (\\lnot (r\\equiv \\lnot p)\\land s),((\\lnot (p\\equiv p)\\lor p)\\land (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001110111101110 és 0000000000000101"]
          ["\\(\\{ (((\\lnot r\\land (r\\land r))\\lor r)\\equiv r),((r\\land ((s\\supset q)\\land (s\\equiv q)))\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000000 és 1101011011010001"]
          ["\\(\\{ (q\\equiv (r\\lor ((r\\lor p)\\land (p\\supset r)))),((r\\supset p)\\supset \\lnot ((r\\lor q)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1110010011000011 és 0011111100101010"]
          ["\\(\\{ ((((r\\equiv s)\\land q)\\supset p)\\equiv (p\\equiv q)),(s\\lor ((s\\lor q)\\land ((s\\land s)\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010001111 és 0101111101011111"]
          ["\\(\\{ \\lnot ((p\\lor (p\\supset s))\\supset (p\\supset p)),((p\\supset (p\\supset s))\\equiv ((p\\supset p)\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0001011100000000 és 0001110100011001"]
          ["\\(\\{ \\lnot ((r\\supset q)\\supset (r\\land (p\\land p))),(p\\land (p\\land ((r\\supset (q\\land s))\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 1110111111001100 és 0000000011001101"]
          ["\\(\\{ ((q\\equiv q)\\equiv (\\lnot p\\equiv \\lnot q)),((p\\lor p)\\equiv (s\\land \\lnot \\lnot q)) \\}\\)" "az igazságtáblák főoszlopai: 1100110001110000 és 1100001100000101"]
          ["\\(\\{ ((\\lnot p\\supset s)\\equiv \\lnot \\lnot p),\\lnot (s\\lor ((p\\lor q)\\land (r\\lor s))) \\}\\)" "az igazságtáblák főoszlopai: 1001110111111111 és 1001111010001000"]
          ["\\(\\{ \\lnot ((s\\land \\lnot s)\\supset (s\\land r)),((q\\supset q)\\lor (p\\land ((q\\land p)\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0001010100000000 és 1100111111111111"]
          ["\\(\\{ ((((s\\equiv p)\\lor (r\\equiv p))\\supset q)\\supset s),((p\\land q)\\supset \\lnot (p\\lor (s\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1111011101110101 és 1101111100001000"]
          ["\\(\\{ (\\lnot q\\lor ((p\\equiv q)\\equiv (p\\equiv s))),(((p\\equiv r)\\land ((r\\lor q)\\supset q))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110101 és 0000100100000011"]
          ["\\(\\{ ((s\\lor p)\\land ((p\\land p)\\supset \\lnot p)),(q\\lor \\lnot \\lnot ((s\\supset r)\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 0100010010000000 és 1011111111111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot ((s\\land p)\\supset p)\\supset \\lnot p), (\\lnot \\lnot (s\\lor s)\\land (r\\land s)) \\}\\)"
         "\\(\\{ ((\\lnot (r\\land p)\\equiv (q\\lor q))\\lor r), ((s\\equiv \\lnot \\lnot p)\\land (s\\equiv r)) \\}\\)"
         "\\(\\{ (r\\lor (p\\lor (((r\\land q)\\supset p)\\lor s))), ((\\lnot (p\\equiv r)\\equiv (s\\equiv p))\\supset p) \\}\\)"
         "\\(\\{ (((s\\supset p)\\lor r)\\land ((r\\supset p)\\land p)), ((\\lnot p\\lor (r\\land p))\\land (s\\lor s)) \\}\\)"
         "\\(\\{ ((q\\land (s\\supset p))\\equiv \\lnot (s\\land r)), (s\\equiv ((\\lnot (p\\equiv p)\\equiv q)\\lor r)) \\}\\)"
         "\\(\\{ ((p\\lor (p\\equiv (s\\equiv p)))\\supset (s\\supset r)), (r\\equiv ((s\\lor (r\\land r))\\land (q\\supset q))) \\}\\)"
         "\\(\\{ \\lnot ((r\\lor (p\\land q))\\equiv (r\\land q)), ((r\\equiv (p\\supset p))\\lor (s\\lor \\lnot s)) \\}\\)"
         "\\(\\{ (r\\lor ((\\lnot (p\\lor q)\\land r)\\supset q)), (\\lnot (p\\equiv (r\\supset s))\\supset (s\\equiv p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (((p\\equiv p)\\land s)\\supset ((s\\equiv r)\\land p)),((r\\equiv (q\\land q))\\land ((r\\supset r)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 1000001010011001 és 0110010000000001"]
          ["\\(\\{ ((s\\equiv (s\\equiv (q\\land p)))\\land (p\\lor s)),(((p\\equiv s)\\land s)\\land (r\\equiv (r\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0000000010001111 és 0001010000000001"]
          ["\\(\\{ ((((q\\land p)\\land s)\\equiv q)\\supset (q\\lor q)),\\lnot \\lnot ((p\\lor q)\\supset (s\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 1100111000000000"]
          ["\\(\\{ ((((r\\equiv q)\\supset p)\\land p)\\supset (p\\lor r)),((r\\lor \\lnot (q\\equiv s))\\supset \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111111 és 1011110110101110"]
          ["\\(\\{ (p\\equiv \\lnot ((q\\supset s)\\lor \\lnot r)),((s\\equiv (p\\land p))\\equiv ((s\\lor q)\\equiv r)) \\}\\)" "az igazságtáblák főoszlopai: 1111111100000010 és 1111001111111001"]
          ["\\(\\{ ((\\lnot p\\equiv p)\\equiv (s\\lor (q\\supset r))),((p\\equiv s)\\equiv \\lnot ((p\\supset r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0010011001001000 és 1110011001001100"]
          ["\\(\\{ \\lnot (r\\supset (s\\land ((r\\land s)\\equiv s))),((s\\land (r\\lor s))\\land ((s\\lor r)\\lor r)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100100010 és 0101010101010101"]
          ["\\(\\{ (p\\lor \\lnot ((s\\equiv s)\\equiv (p\\lor s))),((s\\land \\lnot (p\\land q))\\equiv (p\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1001001111111111 és 1000001000001000"]
          ["\\(\\{ ((p\\equiv (\\lnot (p\\equiv q)\\supset s))\\equiv r),(((q\\supset q)\\equiv (p\\equiv s))\\equiv (p\\equiv q)) \\}\\)" "az igazságtáblák főoszlopai: 1111110110010011 és 1001111100100101"]
          ["\\(\\{ \\lnot ((r\\land (q\\equiv p))\\land \\lnot s),(p\\supset (r\\land (r\\lor \\lnot (p\\equiv s)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000000011 és 1111011110110011"]
          ["\\(\\{ ((\\lnot q\\lor (r\\land s))\\equiv \\lnot s),(\\lnot (s\\land \\lnot s)\\lor (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 1000010001100100 és 1101110111111111"]
          ["\\(\\{ \\lnot ((r\\equiv q)\\equiv (p\\land (r\\supset p))),((\\lnot q\\supset p)\\equiv ((r\\equiv r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1110010011011100 és 1100101100000000"]
          ["\\(\\{ (\\lnot s\\equiv \\lnot \\lnot (s\\supset s)),(\\lnot p\\equiv ((s\\supset p)\\equiv (p\\lor r))) \\}\\)" "az igazságtáblák főoszlopai: 1000011001101010 és 0110101110000000"]
          ["\\(\\{ \\lnot (p\\land (((p\\equiv p)\\lor r)\\land s)),((r\\lor p)\\land (p\\land (s\\supset (p\\equiv p)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011000011110 és 0000000010101010"]
          ["\\(\\{ \\lnot ((s\\land (r\\land s))\\supset (r\\land q)),(\\lnot ((q\\supset (s\\lor s))\\supset p)\\equiv q) \\}\\)" "az igazságtáblák főoszlopai: 0001000100010000 és 0001101000001000"]
          ["\\(\\{ \\lnot ((q\\supset q)\\equiv (p\\equiv \\lnot p)),\\lnot ((p\\supset p)\\lor (p\\land (q\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1100111110111111 és 0000000010000000"]
          ["\\(\\{ (\\lnot r\\lor (s\\supset (\\lnot p\\equiv r))),((r\\lor s)\\lor \\lnot ((q\\supset r)\\lor q)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111101110 és 0111011101110111"]
          ["\\(\\{ \\lnot (((q\\equiv q)\\land r)\\lor (r\\supset p)),((((s\\supset s)\\equiv q)\\lor (s\\supset q))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 0011000100000000 és 0000111100001111"]
          ["\\(\\{ \\lnot ((((s\\equiv r)\\lor r)\\land q)\\land s),\\lnot (q\\equiv (\\lnot q\\equiv \\lnot r)) \\}\\)" "az igazságtáblák főoszlopai: 1100001111111110 és 1111000111001100"]
          ["\\(\\{ ((r\\supset \\lnot \\lnot (r\\land q))\\lor r),((((q\\equiv p)\\equiv r)\\land (r\\land r))\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1111101111111111 és 0000000100000011"]
          ["\\(\\{ (((s\\land q)\\supset p)\\equiv ((r\\equiv q)\\land p)),(s\\lor (((q\\equiv r)\\equiv (s\\lor r))\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000010100100011 és 1111011101110111"]
          ["\\(\\{ ((r\\land p)\\land ((r\\supset q)\\equiv (r\\land r))),(r\\lor \\lnot \\lnot (\\lnot s\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000011 és 0111011110111011"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ ((s\\lor s)\\lor (((s\\supset p)\\lor p)\\lor s)), \\lnot \\lnot ((p\\supset (q\\supset q))\\equiv p) \\}\\)"
         "\\(\\{ (\\lnot s\\supset (((r\\supset p)\\land r)\\supset q)), (\\lnot (s\\lor p)\\supset ((s\\equiv r)\\lor r)) \\}\\)"
         "\\(\\{ ((r\\supset s)\\lor ((p\\lor p)\\supset \\lnot p)), (((q\\equiv p)\\land p)\\land ((q\\supset q)\\supset p)) \\}\\)"
         "\\(\\{ (((p\\equiv q)\\land p)\\supset (r\\land (p\\equiv p))), ((r\\equiv (r\\equiv q))\\lor \\lnot (q\\equiv s)) \\}\\)"
         "\\(\\{ (((p\\lor (s\\land s))\\supset (p\\equiv r))\\equiv r), ((r\\lor ((r\\equiv s)\\lor q))\\land (s\\lor q)) \\}\\)"
         "\\(\\{ (r\\supset ((p\\supset q)\\equiv (s\\equiv (r\\land r)))), (p\\lor (r\\supset (\\lnot p\\lor (s\\equiv r)))) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((q\\supset (((p\\land s)\\equiv q)\\equiv p))\\supset p),((p\\supset (s\\equiv (s\\equiv q)))\\supset (s\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0000111011111111 és 0000010100110101"]
          ["\\(\\{ ((q\\lor ((s\\equiv r)\\supset (s\\land q)))\\equiv p),((s\\land \\lnot (q\\land s))\\lor (r\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1011011001101111 és 0111001101110011"]
          ["\\(\\{ (((s\\equiv q)\\supset (s\\equiv s))\\land (s\\supset s)),(\\lnot (\\lnot s\\supset \\lnot r)\\land q) \\}\\)" "az igazságtáblák főoszlopai: 1101110001011010 és 0000010100000010"]
          ["\\(\\{ (((r\\supset (r\\lor p))\\lor s)\\equiv (s\\lor s)),(q\\equiv \\lnot \\lnot ((q\\supset p)\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0111000011010101 és 1001101001100101"]
          ["\\(\\{ \\lnot \\lnot (s\\equiv (s\\supset (q\\equiv p))),((((q\\supset (s\\equiv s))\\supset r)\\land s)\\lor q) \\}\\)" "az igazságtáblák főoszlopai: 0100100010000101 és 0001111100011111"]
          ["\\(\\{ (r\\land (\\lnot \\lnot s\\equiv (q\\equiv s))),((\\lnot p\\land s)\\lor (p\\supset (p\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0000001100000011 és 1101011111010101"]
          ["\\(\\{ (((r\\lor q)\\lor \\lnot q)\\equiv \\lnot q),(\\lnot (q\\supset q)\\equiv (\\lnot s\\lor p)) \\}\\)" "az igazságtáblák főoszlopai: 1110101111110000 és 0101100100000000"]
          ["\\(\\{ (p\\equiv (\\lnot ((s\\land r)\\lor p)\\land p)),(((((s\\supset p)\\land q)\\supset q)\\supset p)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 1101111101010101"]
          ["\\(\\{ ((s\\lor s)\\lor ((s\\equiv (p\\land q))\\supset r)),(((p\\equiv r)\\land s)\\land ((q\\lor s)\\lor s)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101111111 és 0100000100010001"]
          ["\\(\\{ \\lnot (p\\equiv (((s\\equiv r)\\lor p)\\supset q)),((q\\lor q)\\equiv (r\\equiv ((s\\land s)\\supset s))) \\}\\)" "az igazságtáblák főoszlopai: 0110111111110000 és 1110001000100011"]
          ["\\(\\{ (((p\\land \\lnot s)\\equiv (r\\equiv s))\\land s),((p\\supset (q\\supset (q\\supset \\lnot r)))\\land p) \\}\\)" "az igazságtáblák főoszlopai: 0100010001000100 és 0000000011111100"]
          ["\\(\\{ ((r\\equiv (r\\land r))\\lor (r\\supset (q\\lor p))),(\\lnot (s\\lor (p\\land r))\\supset \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1101011111110111"]
          ["\\(\\{ ((\\lnot (s\\land r)\\land (s\\land s))\\land q),((\\lnot ((r\\lor q)\\lor q)\\land p)\\equiv s) \\}\\)" "az igazságtáblák főoszlopai: 0000000100000100 és 1001110101101010"]
          ["\\(\\{ ((p\\equiv (r\\lor (q\\land r)))\\lor (p\\supset s)),((p\\land (p\\equiv s))\\lor (s\\land (r\\land s))) \\}\\)" "az igazságtáblák főoszlopai: 1111111111110111 és 0001000101010101"]
          ["\\(\\{ (((q\\supset p)\\land (r\\land q))\\lor (s\\land r)),((\\lnot s\\lor (q\\equiv q))\\equiv (q\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 0001001100010011 és 1101101101011010"]
          ["\\(\\{ (r\\lor \\lnot ((q\\equiv r)\\lor (s\\supset p))),((((r\\equiv r)\\equiv (q\\supset r))\\land s)\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0011011100110011 és 0111001100110111"]
          ["\\(\\{ (r\\land (\\lnot ((p\\equiv q)\\lor s)\\land p)),\\lnot ((p\\equiv (q\\land (r\\equiv r)))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0000000000100000 és 1100000001111111"]
          ["\\(\\{ (((\\lnot p\\lor s)\\lor p)\\equiv (s\\land r)),((q\\lor q)\\equiv ((r\\equiv s)\\lor (q\\equiv p))) \\}\\)" "az igazságtáblák főoszlopai: 0000000010010001 és 0010101011101111"]
          ["\\(\\{ (s\\land (\\lnot r\\equiv (r\\land (r\\lor s)))),((\\lnot r\\supset p)\\land (s\\supset (s\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0001000000000000 és 0001001110101111"]
          ["\\(\\{ (((q\\lor (p\\supset q))\\land p)\\land (q\\equiv q)),(\\lnot ((q\\equiv p)\\equiv (q\\land r))\\lor r) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000000 és 1111111100111111"]
          ["\\(\\{ (p\\supset (((p\\lor s)\\equiv r)\\equiv \\lnot p)),((r\\land q)\\equiv (\\lnot s\\equiv (p\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1110011111001100 és 1001111110100110"]
          ["\\(\\{ (\\lnot ((p\\lor p)\\lor (q\\supset s))\\equiv p),(((p\\supset s)\\lor (r\\lor r))\\land (r\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1101111100000000 és 1111001111110111"]
          ["\\(\\{ (((r\\equiv s)\\lor (r\\lor r))\\equiv (s\\equiv s)),(q\\supset (r\\lor \\lnot (r\\lor (p\\supset p)))) \\}\\)" "az igazságtáblák főoszlopai: 1010001101000100 és 1111111111110011"]
          ["\\(\\{ \\lnot ((\\lnot q\\lor s)\\equiv (r\\equiv q)),(((s\\equiv p)\\land s)\\supset \\lnot \\lnot s) \\}\\)" "az igazságtáblák főoszlopai: 0011101111010110 és 1101110111111111"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=0 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (\\lnot r\\equiv (r\\supset (\\lnot r\\supset s))), \\lnot (\\lnot (s\\lor s)\\land (q\\equiv p)) \\}\\)"
         "\\(\\{ (\\lnot p\\supset (\\lnot (s\\land p)\\supset p)), (p\\land (((\\lnot p\\supset p)\\supset s)\\lor r)) \\}\\)"
         "\\(\\{ ((\\lnot p\\lor \\lnot s)\\supset \\lnot s), ((r\\land q)\\supset (r\\supset (\\lnot p\\equiv s))) \\}\\)"
         "\\(\\{ ((\\lnot p\\lor r)\\supset ((s\\lor q)\\land p)), ((r\\lor q)\\lor ((p\\equiv r)\\lor (p\\equiv r))) \\}\\)"
         "\\(\\{ ((p\\lor (p\\supset (p\\supset p)))\\supset (q\\lor q)), \\lnot (p\\land ((q\\equiv (s\\equiv p))\\supset r)) \\}\\)"
         "\\(\\{ (s\\land ((s\\supset \\lnot s)\\supset (q\\lor p))), ((((p\\supset r)\\lor q)\\lor s)\\equiv (s\\equiv p)) \\}\\)"
         "\\(\\{ (((p\\equiv q)\\land q)\\lor (p\\land (s\\land p))), (((r\\land r)\\lor q)\\supset (p\\lor (r\\supset s))) \\}\\)"
         "\\(\\{ ((\\lnot s\\equiv q)\\supset ((r\\land p)\\supset q)), \\lnot \\lnot (q\\supset ((q\\land s)\\supset p)) \\}\\)"
         "\\(\\{ \\lnot \\lnot ((\\lnot r\\equiv s)\\land p), \\lnot ((\\lnot p\\equiv q)\\land (p\\land s)) \\}\\)"
         "\\(\\{ (p\\lor (r\\land (p\\land ((p\\lor r)\\supset r)))), ((p\\land (p\\supset p))\\lor ((s\\lor r)\\equiv r)) \\}\\)"
         "\\(\\{ (((p\\land (s\\lor q))\\land (p\\equiv s))\\supset p), (\\lnot ((q\\lor p)\\land (r\\land p))\\lor p) \\}\\)"
         "\\(\\{ ((r\\supset p)\\lor (r\\supset (s\\lor \\lnot s))), (p\\lor (((p\\lor p)\\supset \\lnot r)\\supset s)) \\}\\)"
]
  :wrong [
          ["\\(\\{ ((s\\land q)\\equiv (s\\land (r\\lor (s\\land p)))),\\lnot (\\lnot ((q\\equiv p)\\lor s)\\supset q) \\}\\)" "az igazságtáblák főoszlopai: 1101110001101111 és 0001011010100000"]
          ["\\(\\{ (r\\land (\\lnot \\lnot r\\land (p\\supset r))),(((s\\equiv p)\\land p)\\equiv (p\\land (s\\supset r))) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1100011010010001"]
          ["\\(\\{ ((s\\supset s)\\equiv (s\\lor (p\\equiv (s\\supset q)))),((p\\equiv r)\\land ((s\\land s)\\lor (p\\equiv s))) \\}\\)" "az igazságtáblák főoszlopai: 0100100000000000 és 1100100100010001"]
          ["\\(\\{ (q\\supset (s\\lor \\lnot ((p\\equiv p)\\supset p))),(\\lnot s\\equiv ((s\\supset r)\\supset (s\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1101111111110101 és 1011100001111010"]
          ["\\(\\{ ((q\\supset r)\\equiv ((s\\lor (q\\lor s))\\land q)),\\lnot (q\\supset \\lnot \\lnot \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0010101010000011 és 0011011000000011"]
          ["\\(\\{ \\lnot (q\\supset (((r\\lor s)\\equiv q)\\land q)),((s\\supset p)\\lor ((q\\supset s)\\land \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001000 és 1101111111111111"]
          ["\\(\\{ \\lnot ((q\\land q)\\lor (q\\equiv (p\\lor p))),((r\\lor r)\\equiv ((s\\supset \\lnot q)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111011110000 és 1100001000000111"]
          ["\\(\\{ (((p\\lor s)\\lor (q\\supset s))\\supset (s\\supset r)),(((s\\lor q)\\supset (r\\supset p))\\equiv (r\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1011111110111011 és 1100001000000000"]
          ["\\(\\{ (q\\land (s\\equiv (r\\supset \\lnot (r\\equiv q)))),\\lnot (\\lnot (s\\land s)\\equiv (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000001000000110 és 1001110110011001"]
          ["\\(\\{ \\lnot (((s\\lor q)\\equiv (s\\supset r))\\equiv q),(\\lnot (s\\equiv (p\\lor p))\\land \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0011010110010100 és 0100000110001000"]
          ["\\(\\{ \\lnot (\\lnot \\lnot r\\land (q\\lor r)),((q\\equiv q)\\lor ((s\\lor p)\\land (r\\equiv r))) \\}\\)" "az igazságtáblák főoszlopai: 1110100111001100 és 1100011000000000"]
          ["\\(\\{ (p\\supset ((\\lnot q\\supset r)\\supset (s\\land r))),((r\\supset (r\\lor q))\\equiv ((s\\supset p)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1111011111010001 és 0100101010110011"]
          ["\\(\\{ ((\\lnot r\\lor q)\\supset \\lnot (s\\land q)),\\lnot ((s\\lor q)\\lor (s\\supset (r\\supset p))) \\}\\)" "az igazságtáblák főoszlopai: 1111011111111010 és 0010011000000000"]
          ["\\(\\{ (((q\\land r)\\land (q\\lor (r\\land p)))\\equiv r),\\lnot \\lnot (q\\equiv ((s\\land s)\\supset r)) \\}\\)" "az igazságtáblák főoszlopai: 1110101000101111 és 0110101011001011"]
          ["\\(\\{ ((p\\land r)\\supset (\\lnot s\\land \\lnot q)),((q\\equiv ((p\\land s)\\land r))\\equiv (q\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 1100111010101100 és 1100011111100001"]
          ["\\(\\{ ((r\\supset \\lnot q)\\equiv (p\\lor (r\\supset r))),\\lnot (((q\\lor r)\\equiv \\lnot r)\\supset s) \\}\\)" "az igazságtáblák főoszlopai: 1101110000000010 és 0001111000001000"]
          ["\\(\\{ (((s\\supset r)\\equiv q)\\supset ((p\\equiv p)\\land s)),((p\\equiv r)\\lor ((p\\land q)\\supset (q\\land r))) \\}\\)" "az igazságtáblák főoszlopai: 1111010010110100 és 1110111100111011"]
          ["\\(\\{ ((((p\\land s)\\lor p)\\lor (p\\land r))\\lor q),\\lnot \\lnot (\\lnot (s\\supset r)\\land r) \\}\\)" "az igazságtáblák főoszlopai: 0000111111111111 és 0010001000000000"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=0!"
  :good [
         "\\(\\{ (((s\\equiv s)\\equiv \\lnot s)\\supset (r\\supset q)), ((s\\land p)\\equiv (\\lnot r\\equiv (q\\lor p))) \\}\\)"
         "\\(\\{ ((r\\lor r)\\supset (s\\supset ((q\\land p)\\lor s))), ((s\\supset p)\\land ((s\\lor (r\\lor q))\\lor s)) \\}\\)"
         "\\(\\{ (\\lnot r\\supset (s\\equiv ((r\\supset p)\\supset q))), ((\\lnot r\\land p)\\lor (p\\equiv (p\\lor q))) \\}\\)"
         "\\(\\{ ((\\lnot \\lnot p\\land q)\\lor \\lnot r), ((r\\lor r)\\equiv \\lnot (p\\land \\lnot r)) \\}\\)"
         "\\(\\{ ((\\lnot (q\\supset (s\\equiv p))\\supset r)\\supset p), (((q\\supset s)\\equiv (p\\equiv p))\\land (q\\land r)) \\}\\)"
         "\\(\\{ (\\lnot \\lnot p\\land \\lnot (r\\supset s)), ((\\lnot s\\lor p)\\lor (r\\lor (r\\land p))) \\}\\)"
         "\\(\\{ (((r\\lor s)\\land q)\\lor ((p\\supset q)\\supset p)), ((\\lnot p\\supset r)\\equiv \\lnot (s\\equiv p)) \\}\\)"
         "\\(\\{ (((s\\equiv p)\\equiv s)\\supset (r\\land (r\\equiv p))), (s\\supset ((q\\land r)\\lor ((q\\supset s)\\lor p))) \\}\\)"
         "\\(\\{ (((q\\land (q\\lor q))\\equiv \\lnot r)\\supset r), (\\lnot ((q\\supset r)\\land r)\\supset (r\\lor s)) \\}\\)"
         "\\(\\{ (\\lnot q\\supset (p\\land (r\\land (p\\supset q)))), (\\lnot \\lnot s\\supset (s\\lor (p\\land s))) \\}\\)"
         "\\(\\{ ((r\\lor (p\\equiv p))\\land (p\\equiv (q\\equiv r))), \\lnot (r\\equiv ((s\\land (p\\supset q))\\land p)) \\}\\)"
]
  :wrong [
          ["\\(\\{ \\lnot \\lnot ((r\\supset s)\\land (q\\lor s)),\\lnot ((s\\supset s)\\equiv ((q\\supset p)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0101110101011101 és 1000110010101010"]
          ["\\(\\{ ((s\\land (q\\land p))\\land \\lnot \\lnot r),((q\\land ((r\\land q)\\equiv s))\\equiv (r\\supset s)) \\}\\)" "az igazságtáblák főoszlopai: 0000000000000001 és 0010100010101011"]
          ["\\(\\{ \\lnot \\lnot (s\\land (r\\supset (q\\supset q))),((p\\lor (r\\supset p))\\supset (q\\equiv \\lnot p)) \\}\\)" "az igazságtáblák főoszlopai: 0100010101010101 és 0011101101110000"]
          ["\\(\\{ ((r\\land ((q\\equiv (q\\lor r))\\lor q))\\land p),(\\lnot \\lnot \\lnot s\\supset \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 0000000000100011 és 1111110111011101"]
          ["\\(\\{ ((((q\\lor q)\\land (p\\equiv s))\\supset q)\\land r),((r\\supset \\lnot (r\\supset s))\\land (q\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0000001100110011 és 0000010100000100"]
          ["\\(\\{ ((r\\land s)\\equiv ((r\\supset p)\\supset (r\\supset p))),((\\lnot s\\equiv r)\\equiv ((p\\lor r)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011000010010001 és 0000101000101100"]
          ["\\(\\{ (((r\\lor q)\\equiv q)\\equiv \\lnot (q\\equiv p)),\\lnot (s\\equiv (((r\\lor r)\\supset s)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 0011110100100000 és 0010011110100010"]
          ["\\(\\{ ((((s\\lor s)\\supset q)\\equiv (r\\supset p))\\supset s),(((p\\lor r)\\land r)\\supset \\lnot (s\\supset q)) \\}\\)" "az igazságtáblák főoszlopai: 0111011101010101 és 1111111111011100"]
          ["\\(\\{ \\lnot (p\\land (r\\lor \\lnot (q\\land q))),\\lnot (s\\equiv (s\\land (q\\supset (r\\equiv q)))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010001100 és 0001000100000100"]
          ["\\(\\{ (((s\\lor r)\\equiv r)\\supset ((q\\lor s)\\equiv s)),(((p\\land s)\\lor p)\\equiv ((q\\supset q)\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1100110001001101 és 1100111111111111"]
          ["\\(\\{ (p\\equiv \\lnot \\lnot \\lnot (s\\equiv s)),\\lnot ((r\\lor s)\\lor (p\\lor (r\\equiv q))) \\}\\)" "az igazságtáblák főoszlopai: 1100011010000000 és 0010111000000000"]
          ["\\(\\{ (((p\\land (s\\supset p))\\lor (s\\land r))\\equiv q),((s\\equiv (p\\supset p))\\lor \\lnot (q\\supset p)) \\}\\)" "az igazságtáblák főoszlopai: 1101011100001111 és 0101111101010101"]
          ["\\(\\{ (q\\supset ((s\\lor s)\\land \\lnot (r\\equiv s))),(((s\\supset r)\\supset r)\\equiv ((q\\supset q)\\equiv s)) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110100 és 1111111001011101"]
          ["\\(\\{ ((r\\equiv (r\\land (s\\equiv p)))\\lor (s\\supset s)),\\lnot ((p\\land p)\\land ((r\\supset q)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 1111110111111111 és 1100011000001000"]
          ["\\(\\{ (r\\land (r\\supset ((q\\land (s\\supset p))\\lor r))),\\lnot \\lnot \\lnot (q\\land (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0011001100110011 és 1100011000001000"]
          ["\\(\\{ (\\lnot \\lnot \\lnot s\\equiv (q\\supset s)),((p\\land s)\\land (p\\equiv ((q\\land r)\\land q))) \\}\\)" "az igazságtáblák főoszlopai: 1000010001100000 és 0000000000000001"]
          ["\\(\\{ (s\\land (s\\lor ((q\\supset s)\\equiv (p\\land q)))),\\lnot (p\\supset (\\lnot (q\\land r)\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0101010101010101 és 0000000101110011"]
          ["\\(\\{ (s\\land ((q\\supset (s\\equiv p))\\equiv (p\\land r))),((p\\equiv q)\\supset (\\lnot (r\\land q)\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0001010000010001 és 0100111111110100"]
          ["\\(\\{ (p\\equiv (((p\\supset r)\\supset r)\\equiv \\lnot q)),(r\\land (((s\\lor r)\\supset (p\\supset s))\\equiv p)) \\}\\)" "az igazságtáblák főoszlopai: 1111000101110000 és 0010001000010001"]
]}

 {:question "Jelölje meg az alábbi formulahalmazok közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1, \\( \\varrho (r) \\)=1 és \\( \\varrho (s) \\)=1!"
  :good [
         "\\(\\{ (((s\\supset q)\\land r)\\equiv ((s\\lor q)\\land p)), (((p\\equiv s)\\lor ((s\\equiv p)\\land s))\\land q) \\}\\)"
         "\\(\\{ ((q\\land (s\\lor ((r\\land r)\\lor q)))\\supset s), (p\\land ((s\\lor (q\\lor r))\\equiv (r\\land s))) \\}\\)"
         "\\(\\{ ((\\lnot q\\supset s)\\land (q\\equiv (s\\land q))), ((p\\supset r)\\equiv ((r\\equiv p)\\lor (s\\lor p))) \\}\\)"
         "\\(\\{ ((q\\lor (q\\equiv r))\\supset ((q\\land p)\\supset p)), (((s\\lor q)\\land r)\\lor \\lnot (s\\supset r)) \\}\\)"
         "\\(\\{ (((p\\lor s)\\lor p)\\land ((p\\supset r)\\equiv r)), (q\\lor (p\\lor ((q\\equiv (p\\land q))\\supset r))) \\}\\)"
         "\\(\\{ (((p\\equiv (s\\supset p))\\lor \\lnot r)\\lor s), \\lnot \\lnot (s\\land (q\\equiv (r\\land r))) \\}\\)"
         "\\(\\{ ((p\\equiv (q\\lor (\\lnot p\\land s)))\\lor r), \\lnot ((r\\land q)\\supset (q\\land \\lnot p)) \\}\\)"
         "\\(\\{ (r\\land (s\\supset (s\\lor ((p\\lor s)\\lor r)))), ((((\\lnot s\\supset q)\\land q)\\equiv p)\\supset q) \\}\\)"
         "\\(\\{ (\\lnot \\lnot p\\land (q\\lor (p\\lor p))), \\lnot ((s\\land q)\\land \\lnot (s\\land q)) \\}\\)"
         "\\(\\{ \\lnot (\\lnot ((p\\land q)\\equiv s)\\land r), (\\lnot \\lnot (s\\land (q\\equiv s))\\supset q) \\}\\)"
         "\\(\\{ \\lnot (\\lnot \\lnot q\\land \\lnot q), (p\\lor (q\\supset (p\\equiv \\lnot (q\\lor q)))) \\}\\)"
         "\\(\\{ ((s\\lor (r\\land r))\\land ((q\\land r)\\land p)), ((q\\lor (q\\lor (r\\lor s)))\\lor (p\\equiv q)) \\}\\)"
         "\\(\\{ (s\\land ((\\lnot r\\land \\lnot p)\\supset r)), ((q\\land q)\\lor (\\lnot (p\\equiv p)\\land r)) \\}\\)"
]
  :wrong [
          ["\\(\\{ (\\lnot (q\\land r)\\lor (q\\supset (r\\land r))),(\\lnot (q\\land (p\\supset s))\\land (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 1111111111111111 és 0000000000001010"]
          ["\\(\\{ ((p\\equiv s)\\lor (q\\lor (p\\supset (r\\equiv s)))),(\\lnot (p\\lor r)\\equiv \\lnot \\lnot r) \\}\\)" "az igazságtáblák főoszlopai: 1111111111011111 és 0001000000101100"]
          ["\\(\\{ (\\lnot ((p\\equiv s)\\equiv (q\\lor s))\\equiv q),((r\\lor s)\\equiv ((r\\equiv p)\\land \\lnot s)) \\}\\)" "az igazságtáblák főoszlopai: 0000110111111010 és 0010011110101010"]
          ["\\(\\{ (\\lnot p\\land ((r\\lor (q\\equiv s))\\equiv q)),((\\lnot \\lnot p\\land s)\\supset (r\\land q)) \\}\\)" "az igazságtáblák főoszlopai: 0100010000000000 és 1100011101101011"]
          ["\\(\\{ (p\\lor ((r\\lor p)\\lor (s\\equiv (s\\equiv s)))),(r\\land (q\\land (q\\equiv (q\\land \\lnot s)))) \\}\\)" "az igazságtáblák főoszlopai: 0111101111111111 és 0000000000000010"]
          ["\\(\\{ ((((q\\equiv q)\\lor (s\\supset q))\\land s)\\equiv p),(\\lnot p\\equiv (p\\supset ((s\\lor q)\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 1001110100000101 és 1101001111010000"]
          ["\\(\\{ \\lnot (((q\\supset p)\\supset (q\\equiv q))\\lor s),((\\lnot r\\land q)\\equiv (s\\equiv (s\\supset q))) \\}\\)" "az igazságtáblák főoszlopai: 0001011010101010 és 1100011101110110"]
          ["\\(\\{ (((s\\land q)\\supset s)\\equiv (r\\equiv (q\\equiv q))),(s\\supset (\\lnot p\\equiv (\\lnot r\\lor p))) \\}\\)" "az igazságtáblák főoszlopai: 0010000000101100 és 1111111110101010"]
          ["\\(\\{ ((s\\supset p)\\land (\\lnot (q\\land p)\\land s)),\\lnot \\lnot ((q\\supset (s\\equiv s))\\equiv p) \\}\\)" "az igazságtáblák főoszlopai: 0000010000000000 és 0000111111110000"]
          ["\\(\\{ ((q\\supset q)\\lor ((r\\lor p)\\equiv (p\\supset q))),\\lnot ((s\\equiv (q\\equiv p))\\lor (s\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 1110111111111111 és 1001101101001010"]
          ["\\(\\{ (q\\land \\lnot (q\\lor (s\\lor (p\\land r)))),((r\\supset \\lnot s)\\land \\lnot (q\\land p)) \\}\\)" "az igazságtáblák főoszlopai: 0000011000000000 és 1100010000001000"]
          ["\\(\\{ (((s\\supset s)\\equiv (p\\land p))\\supset (s\\equiv s)),(\\lnot q\\land (q\\lor (r\\supset (p\\land s)))) \\}\\)" "az igazságtáblák főoszlopai: 1101111100000000 és 1100111011010000"]
          ["\\(\\{ ((p\\supset r)\\equiv ((s\\supset r)\\land \\lnot p)),((\\lnot (r\\equiv p)\\equiv s)\\equiv \\lnot p) \\}\\)" "az igazságtáblák főoszlopai: 1010101111001100 és 1010001100011001"]
          ["\\(\\{ (\\lnot \\lnot r\\land ((q\\supset q)\\lor s)),\\lnot \\lnot (s\\land \\lnot (p\\land s)) \\}\\)" "az igazságtáblák főoszlopai: 0001001100110011 és 0100010001000000"]
          ["\\(\\{ (\\lnot (q\\equiv q)\\equiv ((q\\land r)\\lor q)),(\\lnot ((r\\supset q)\\land \\lnot q)\\lor p) \\}\\)" "az igazságtáblák főoszlopai: 1100111011110000 és 0000111111111111"]
          ["\\(\\{ (((s\\land q)\\equiv (\\lnot q\\lor p))\\lor q),(\\lnot (\\lnot s\\supset r)\\equiv (p\\land r)) \\}\\)" "az igazságtáblák főoszlopai: 0000111100001111 és 0111011101000100"]
          ["\\(\\{ \\lnot ((q\\supset s)\\land ((p\\lor s)\\lor q)),((q\\lor p)\\lor ((r\\lor r)\\land (p\\land p))) \\}\\)" "az igazságtáblák főoszlopai: 1001011000001010 és 0000111111111111"]
]}]