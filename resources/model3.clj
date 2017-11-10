[{:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0 és \\( \\varrho (r) \\)=0!"
  :good [
         "\\( \\lnot ((q\\equiv r)\\supset (r\\land q)) \\)"
         "\\( (\\lnot (r\\land q)\\supset (q\\supset r)) \\)"
         "\\( \\lnot ((q\\land q)\\land (p\\lor q)) \\)"
         "\\( ((r\\land (p\\land r))\\lor \\lnot q) \\)"
         "\\( (\\lnot (p\\equiv (q\\land q))\\equiv q) \\)"
         "\\( ((q\\equiv \\lnot r)\\supset (q\\lor r)) \\)"
         "\\( \\lnot (p\\land \\lnot \\lnot p) \\)"
         "\\( \\lnot (((q\\equiv q)\\lor p)\\equiv q) \\)"
         "\\( (((q\\land (p\\equiv q))\\equiv r)\\lor q) \\)"
         "\\( ((\\lnot p\\equiv r)\\equiv (p\\land q)) \\)"
         "\\( (q\\supset ((p\\equiv r)\\supset (r\\equiv r))) \\)"
         "\\( (((r\\lor q)\\land r)\\supset (r\\lor q)) \\)"
         "\\( (\\lnot (\\lnot q\\supset r)\\lor r) \\)"
         "\\( ((r\\supset ((q\\lor q)\\land p))\\lor r) \\)"
         "\\( (\\lnot r\\supset ((p\\lor q)\\equiv q)) \\)"
         "\\( \\lnot ((r\\equiv r)\\supset (q\\lor q)) \\)"]

  :wrong [
          ["\\( (q\\land (r\\supset ((r\\supset q)\\lor p))) \\)" "az igazságtábla főoszlopa: 00110011"]
          ["\\( ((r\\lor (p\\equiv q))\\equiv (q\\lor q)) \\)" "az igazságtábla főoszlopa: 00011011"]
          ["\\( (\\lnot (r\\equiv p)\\equiv (r\\supset q)) \\)" "az igazságtábla főoszlopa: 00011110"]
          ["\\( ((p\\equiv (r\\land (p\\land r)))\\equiv p) \\)" "az igazságtábla főoszlopa: 00000101"]
          ["\\( (\\lnot q\\supset (\\lnot r\\equiv q)) \\)" "az igazságtábla főoszlopa: 01110111"]
          ["\\( (p\\equiv (r\\supset (r\\lor (p\\lor q)))) \\)" "az igazságtábla főoszlopa: 00001111"]
          ["\\( (\\lnot p\\land ((q\\lor q)\\land r)) \\)" "az igazságtábla főoszlopa: 00010000"]
          ["\\( ((p\\lor q)\\equiv (\\lnot p\\lor r)) \\)" "az igazságtábla főoszlopa: 00110101"]
          ["\\( (r\\land ((p\\equiv q)\\lor (p\\land q))) \\)" "az igazságtábla főoszlopa: 01000001"]
          ["\\( \\lnot (\\lnot (p\\land r)\\lor r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (r\\land ((p\\supset q)\\lor (r\\lor q))) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( ((r\\land (q\\lor \\lnot r))\\land q) \\)" "az igazságtábla főoszlopa: 00010001"]
          ["\\( \\lnot (p\\lor \\lnot (r\\land q)) \\)" "az igazságtábla főoszlopa: 00010000"]
          ["\\( (((q\\land p)\\equiv \\lnot p)\\land p) \\)" "az igazságtábla főoszlopa: 00001100"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=0 és \\( \\varrho (r) \\)=1!"
  :good [
         "\\( ((r\\lor r)\\equiv (r\\supset (p\\supset q))) \\)"
         "\\( \\lnot ((p\\supset q)\\equiv (q\\land r)) \\)"
         "\\( (((q\\equiv r)\\equiv (r\\equiv r))\\equiv p) \\)"
         "\\( ((r\\supset (q\\land p))\\supset (q\\lor r)) \\)"
         "\\( (r\\supset ((q\\equiv p)\\lor (q\\equiv r))) \\)"
         "\\( (\\lnot r\\supset (q\\equiv (p\\lor q))) \\)"
         "\\( ((r\\supset (p\\equiv p))\\land (q\\equiv q)) \\)"
         "\\( ((\\lnot r\\equiv \\lnot q)\\lor r) \\)"
         "\\( (\\lnot r\\equiv \\lnot (p\\equiv q)) \\)"
         "\\( (r\\land (p\\lor \\lnot \\lnot r)) \\)"
         "\\( (p\\supset (((q\\lor p)\\lor q)\\land r)) \\)"
         "\\( \\lnot ((q\\supset p)\\supset (q\\equiv r)) \\)"]

  :wrong [
          ["\\( ((r\\land (p\\land r))\\land \\lnot q) \\)" "az igazságtábla főoszlopa: 00000100"]
          ["\\( \\lnot (\\lnot \\lnot r\\supset r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (\\lnot (q\\equiv p)\\equiv (p\\equiv q)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (\\lnot (r\\supset \\lnot r)\\supset p) \\)" "az igazságtábla főoszlopa: 10101111"]
          ["\\( (r\\land (((p\\supset q)\\supset r)\\equiv q)) \\)" "az igazságtábla főoszlopa: 00010001"]
          ["\\( (q\\land \\lnot (\\lnot q\\equiv r)) \\)" "az igazságtábla főoszlopa: 00010001"]
          ["\\( (((r\\lor p)\\equiv r)\\land (r\\equiv q)) \\)" "az igazságtábla főoszlopa: 10010001"]
          ["\\( (((r\\land p)\\land \\lnot q)\\land p) \\)" "az igazságtábla főoszlopa: 00000100"]
          ["\\( (((q\\supset r)\\lor (q\\land p))\\supset q) \\)" "az igazságtábla főoszlopa: 00110011"]
          ["\\( (r\\supset ((p\\land p)\\equiv \\lnot q)) \\)" "az igazságtábla főoszlopa: 10111110"]
          ["\\( ((p\\equiv \\lnot (q\\equiv p))\\land q) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (q\\lor (\\lnot r\\land (q\\equiv r))) \\)" "az igazságtábla főoszlopa: 10111011"]
          ["\\( (((q\\supset r)\\lor q)\\supset (r\\equiv p)) \\)" "az igazságtábla főoszlopa: 10100101"]
          ["\\( ((\\lnot q\\equiv p)\\land \\lnot r) \\)" "az igazságtábla főoszlopa: 00101000"]
          ["\\( (p\\land ((r\\lor p)\\land (r\\lor r))) \\)" "az igazságtábla főoszlopa: 00000101"]
          ["\\( ((r\\lor r)\\supset ((q\\equiv q)\\equiv p)) \\)" "az igazságtábla főoszlopa: 10101111"]
          ["\\( (((q\\equiv q)\\equiv (r\\supset q))\\lor q) \\)" "az igazságtábla főoszlopa: 10111011"]
          ["\\( (\\lnot (q\\equiv r)\\land (p\\lor p)) \\)" "az igazságtábla főoszlopa: 00000110"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1 és \\( \\varrho (r) \\)=0!"
  :good [
         "\\( (r\\supset \\lnot ((q\\lor r)\\equiv r)) \\)"
         "\\( (((r\\lor q)\\equiv p)\\lor (q\\supset q)) \\)"
         "\\( ((r\\lor q)\\equiv (q\\lor \\lnot p)) \\)"
         "\\( (((q\\supset \\lnot r)\\equiv p)\\supset q) \\)"
         "\\( \\lnot ((\\lnot q\\equiv q)\\equiv q) \\)"
         "\\( (r\\equiv ((r\\lor (r\\land r))\\land p)) \\)"
         "\\( \\lnot ((p\\equiv \\lnot q)\\supset r) \\)"
         "\\( (((p\\supset (q\\supset q))\\equiv q)\\supset q) \\)"
         "\\( \\lnot (p\\lor (q\\land (q\\supset r))) \\)"
         "\\( ((p\\lor r)\\equiv (\\lnot q\\lor p)) \\)"
         "\\( \\lnot (\\lnot q\\land (p\\land r)) \\)"
         "\\( \\lnot \\lnot \\lnot (p\\land p) \\)"
         "\\( ((r\\supset p)\\lor (p\\land (r\\equiv q))) \\)"
         "\\( ((p\\equiv \\lnot r)\\supset (q\\land q)) \\)"
         "\\( ((r\\supset q)\\lor ((r\\land q)\\lor p)) \\)"
         "\\( (((r\\land r)\\supset p)\\equiv (p\\supset r)) \\)"
         "\\( (\\lnot (q\\supset (q\\supset q))\\equiv r) \\)"
         "\\( \\lnot ((p\\lor (p\\land q))\\land q) \\)"]

  :wrong [
          ["\\( (\\lnot q\\land (q\\equiv (p\\land r))) \\)" "az igazságtábla főoszlopa: 11001000"]
          ["\\( (r\\equiv \\lnot (p\\land (p\\supset p))) \\)" "az igazságtábla főoszlopa: 01011010"]
          ["\\( \\lnot ((r\\supset \\lnot p)\\lor r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( ((q\\equiv q)\\supset ((r\\land p)\\lor r)) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( ((p\\land r)\\lor (r\\equiv (p\\equiv p))) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( (\\lnot (p\\supset p)\\land (r\\lor r)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (\\lnot (p\\equiv p)\\land \\lnot r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( ((r\\equiv ((p\\supset q)\\supset q))\\equiv q) \\)" "az igazságtábla főoszlopa: 01011001"]
          ["\\( (((p\\land p)\\supset \\lnot p)\\equiv p) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( ((q\\lor q)\\supset (p\\equiv (p\\supset p))) \\)" "az igazságtábla főoszlopa: 11001111"]
          ["\\( (((r\\equiv \\lnot p)\\land p)\\lor p) \\)" "az igazságtábla főoszlopa: 00001111"]
          ["\\( (r\\land (q\\lor (q\\supset (q\\equiv q)))) \\)" "az igazságtábla főoszlopa: 01010101"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0, \\( \\varrho (q) \\)=1 és \\( \\varrho (r) \\)=1!"
  :good [
         "\\( (\\lnot (p\\equiv q)\\lor (q\\equiv r)) \\)"
         "\\( (((q\\land p)\\equiv r)\\supset (q\\equiv r)) \\)"
         "\\( \\lnot ((p\\lor p)\\land (p\\land q)) \\)"
         "\\( (r\\equiv (q\\equiv (p\\supset (r\\land p)))) \\)"
         "\\( ((p\\supset (q\\equiv p))\\supset (q\\land r)) \\)"
         "\\( \\lnot (((r\\supset p)\\land p)\\land r) \\)"
         "\\( ((r\\land q)\\lor \\lnot (p\\land p)) \\)"
         "\\( ((q\\lor (p\\lor q))\\land (r\\lor q)) \\)"
         "\\( ((r\\lor p)\\supset ((r\\equiv r)\\supset r)) \\)"
         "\\( ((\\lnot (p\\lor p)\\lor r)\\equiv r) \\)"
         "\\( ((p\\supset (p\\supset (r\\supset p)))\\lor p) \\)"
         "\\( \\lnot \\lnot (p\\equiv (p\\land r)) \\)"
         "\\( (((p\\land (q\\land q))\\land p)\\supset r) \\)"
         "\\( \\lnot (p\\equiv ((q\\supset r)\\supset r)) \\)"
         "\\( \\lnot \\lnot (\\lnot q\\supset q) \\)"
         "\\( ((r\\lor (r\\lor r))\\land (r\\lor q)) \\)"
         "\\( (q\\supset (r\\land (q\\lor \\lnot p))) \\)"
         "\\( (((r\\equiv r)\\lor q)\\supset (p\\supset p)) \\)"
         "\\( (\\lnot (r\\land (p\\equiv p))\\lor q) \\)"]

  :wrong [
          ["\\( (p\\equiv ((p\\supset (r\\lor r))\\lor r)) \\)" "az igazságtábla főoszlopa: 00000101"]
          ["\\( (p\\land (q\\supset (\\lnot p\\equiv q))) \\)" "az igazságtábla főoszlopa: 00001100"]
          ["\\( \\lnot ((r\\land (q\\lor r))\\supset r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (\\lnot p\\supset (\\lnot r\\land q)) \\)" "az igazságtábla főoszlopa: 00101111"]
          ["\\( ((q\\lor q)\\equiv (p\\land (q\\lor q))) \\)" "az igazságtábla főoszlopa: 11001111"]
          ["\\( (r\\supset ((r\\land (r\\land r))\\equiv p)) \\)" "az igazságtábla főoszlopa: 10101111"]
          ["\\( (p\\lor ((q\\land r)\\equiv \\lnot q)) \\)" "az igazságtábla főoszlopa: 00101111"]
          ["\\( (\\lnot (\\lnot q\\lor q)\\land q) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( ((p\\lor q)\\equiv ((r\\lor q)\\equiv p)) \\)" "az igazságtábla főoszlopa: 01000111"]
          ["\\( (((p\\supset p)\\land r)\\land (r\\equiv p)) \\)" "az igazságtábla főoszlopa: 00000101"]
          ["\\( (((r\\lor p)\\land (q\\equiv p))\\land r) \\)" "az igazságtábla főoszlopa: 01000001"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0 és \\( \\varrho (r) \\)=0!"
  :good [
         "\\( ((r\\supset \\lnot r)\\lor (r\\supset r)) \\)"
         "\\( ((p\\land q)\\supset (p\\lor (p\\equiv r))) \\)"
         "\\( (((p\\land r)\\lor p)\\land \\lnot r) \\)"
         "\\( (\\lnot (q\\lor q)\\lor \\lnot r) \\)"
         "\\( (((r\\equiv r)\\equiv p)\\lor \\lnot p) \\)"
         "\\( \\lnot \\lnot (q\\supset \\lnot r) \\)"
         "\\( \\lnot ((r\\lor r)\\land \\lnot q) \\)"
         "\\( (p\\lor \\lnot (r\\supset (p\\equiv r))) \\)"
         "\\( (((q\\land q)\\land p)\\supset \\lnot p) \\)"
         "\\( (\\lnot \\lnot p\\lor (r\\land q)) \\)"
         "\\( ((\\lnot p\\equiv (q\\land p))\\land p) \\)"
         "\\( ((\\lnot p\\land r)\\equiv (r\\land r)) \\)"
         "\\( \\lnot ((p\\supset (p\\lor p))\\supset r) \\)"
         "\\( ((r\\equiv \\lnot (q\\lor r))\\supset r) \\)"
         "\\( (r\\lor ((p\\land r)\\lor (r\\equiv r))) \\)"
         "\\( ((r\\supset (q\\land p))\\lor (p\\land q)) \\)"]

  :wrong [
          ["\\( \\lnot (\\lnot (r\\equiv p)\\equiv p) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( ((p\\equiv p)\\equiv ((q\\equiv q)\\land r)) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( \\lnot ((p\\equiv q)\\supset (q\\supset r)) \\)" "az igazságtábla főoszlopa: 00000010"]
          ["\\( (((p\\supset (p\\land p))\\supset q)\\land r) \\)" "az igazságtábla főoszlopa: 00010001"]
          ["\\( ((p\\supset r)\\land (p\\lor (r\\equiv p))) \\)" "az igazságtábla főoszlopa: 10100101"]
          ["\\( \\lnot ((r\\equiv r)\\equiv (r\\supset q)) \\)" "az igazságtábla főoszlopa: 01000100"]
          ["\\( (r\\lor \\lnot (p\\land \\lnot r)) \\)" "az igazságtábla főoszlopa: 11110101"]
          ["\\( (\\lnot q\\equiv ((r\\equiv p)\\land p)) \\)" "az igazságtábla főoszlopa: 00110110"]
          ["\\( ((q\\land q)\\land \\lnot (q\\lor r)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( \\lnot (((q\\lor q)\\lor r)\\supset q) \\)" "az igazságtábla főoszlopa: 01000100"]
          ["\\( ((q\\land ((r\\land r)\\supset q))\\land p) \\)" "az igazságtábla főoszlopa: 00000011"]
          ["\\( ((q\\lor p)\\supset (r\\lor (p\\land r))) \\)" "az igazságtábla főoszlopa: 11010101"]
          ["\\( \\lnot ((p\\supset (q\\lor p))\\supset p) \\)" "az igazságtábla főoszlopa: 11110000"]
          ["\\( (q\\lor (((r\\lor p)\\supset q)\\land p)) \\)" "az igazságtábla főoszlopa: 00110011"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=0 és \\( \\varrho (r) \\)=1!"
  :good [
         "\\( \\lnot ((q\\equiv p)\\land \\lnot r) \\)"
         "\\( (p\\land ((p\\land (p\\lor r))\\lor p)) \\)"
         "\\( ((\\lnot q\\lor (r\\equiv q))\\supset r) \\)"
         "\\( ((p\\supset (p\\supset p))\\lor (p\\lor r)) \\)"
         "\\( \\lnot (q\\equiv (p\\lor (r\\supset r))) \\)"
         "\\( ((p\\supset (q\\lor r))\\supset (p\\land r)) \\)"
         "\\( (((r\\equiv p)\\land r)\\equiv (p\\lor r)) \\)"
         "\\( ((p\\equiv \\lnot (q\\supset r))\\supset r) \\)"
         "\\( ((q\\supset q)\\equiv (r\\lor (p\\land r))) \\)"
         "\\( ((q\\supset (q\\land (r\\lor q)))\\equiv p) \\)"
         "\\( (\\lnot (r\\equiv q)\\land (r\\equiv p)) \\)"
         "\\( (\\lnot \\lnot (p\\land r)\\equiv r) \\)"
         "\\( (\\lnot (q\\land p)\\land (r\\land p)) \\)"
         "\\( (((q\\lor q)\\lor q)\\supset (q\\supset q)) \\)"
         "\\( (((p\\lor q)\\supset (q\\land p))\\lor p) \\)"
         "\\( (((p\\lor q)\\equiv p)\\supset (q\\lor r)) \\)"]

  :wrong [
          ["\\( (((q\\equiv q)\\equiv p)\\supset (q\\equiv r)) \\)" "az igazságtábla főoszlopa: 11111001"]
          ["\\( (q\\land ((q\\lor q)\\supset (p\\supset p))) \\)" "az igazságtábla főoszlopa: 00110011"]
          ["\\( (((q\\land \\lnot p)\\land r)\\equiv r) \\)" "az igazságtábla főoszlopa: 10111010"]
          ["\\( (p\\supset \\lnot (p\\supset (p\\supset p))) \\)" "az igazságtábla főoszlopa: 11110000"]
          ["\\( \\lnot (\\lnot (r\\supset r)\\supset p) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (p\\land (r\\supset \\lnot (p\\equiv r))) \\)" "az igazságtábla főoszlopa: 00001010"]
          ["\\( (q\\equiv (((q\\supset q)\\land p)\\equiv r)) \\)" "az igazságtábla főoszlopa: 01101001"]
          ["\\( (((p\\supset (r\\land q))\\equiv r)\\land r) \\)" "az igazságtábla főoszlopa: 01010001"]
          ["\\( ((r\\land r)\\equiv \\lnot (r\\lor p)) \\)" "az igazságtábla főoszlopa: 00001010"]
          ["\\( (p\\supset (r\\supset ((p\\supset r)\\equiv q))) \\)" "az igazságtábla főoszlopa: 11111011"]
          ["\\( ((r\\supset (p\\land p))\\land \\lnot r) \\)" "az igazságtábla főoszlopa: 10101010"]
          ["\\( (((p\\equiv \\lnot r)\\land q)\\land p) \\)" "az igazságtábla főoszlopa: 00000010"]
          ["\\( ((p\\supset \\lnot \\lnot r)\\land q) \\)" "az igazságtábla főoszlopa: 00110001"]
          ["\\( \\lnot (r\\supset (r\\supset (r\\land r))) \\)" "az igazságtábla főoszlopa: 00000000"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1 és \\( \\varrho (r) \\)=0!"
  :good [
         "\\( (((r\\supset q)\\equiv (p\\supset r))\\lor q) \\)"
         "\\( ((r\\supset r)\\land ((q\\lor q)\\lor p)) \\)"
         "\\( \\lnot \\lnot ((q\\land r)\\supset r) \\)"
         "\\( (\\lnot \\lnot p\\lor (p\\lor p)) \\)"
         "\\( ((q\\land (q\\supset p))\\land (r\\equiv r)) \\)"
         "\\( \\lnot (q\\supset ((p\\supset r)\\lor r)) \\)"
         "\\( ((r\\supset r)\\supset (q\\land (p\\equiv p))) \\)"
         "\\( (((q\\equiv q)\\land q)\\supset (r\\equiv r)) \\)"
         "\\( ((q\\equiv p)\\lor (r\\land (q\\supset p))) \\)"
         "\\( (q\\lor (((q\\supset r)\\lor r)\\lor p)) \\)"
         "\\( ((q\\lor (r\\land p))\\land (q\\lor r)) \\)"
         "\\( (\\lnot r\\supset ((p\\land p)\\land q)) \\)"
         "\\( ((p\\land (p\\supset q))\\equiv \\lnot r) \\)"
         "\\( (q\\land (r\\supset (r\\supset (p\\land q)))) \\)"
         "\\( ((q\\supset p)\\land ((r\\equiv r)\\land q)) \\)"]

  :wrong [
          ["\\( ((q\\supset r)\\land (r\\land (r\\supset r))) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( \\lnot ((\\lnot q\\equiv p)\\supset r) \\)" "az igazságtábla főoszlopa: 00101000"]
          ["\\( (\\lnot p\\equiv (q\\supset (p\\supset q))) \\)" "az igazságtábla főoszlopa: 11110000"]
          ["\\( (\\lnot p\\equiv ((p\\lor r)\\land p)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (\\lnot r\\supset \\lnot (p\\equiv q)) \\)" "az igazságtábla főoszlopa: 01111101"]
          ["\\( (\\lnot (q\\land \\lnot r)\\land r) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( \\lnot (\\lnot (r\\supset q)\\supset p) \\)" "az igazságtábla főoszlopa: 01000000"]
          ["\\( \\lnot (p\\supset (p\\supset (q\\lor q))) \\)" "az igazságtábla főoszlopa: 00001100"]
          ["\\( \\lnot (q\\land (r\\lor (r\\supset r))) \\)" "az igazságtábla főoszlopa: 11001100"]
          ["\\( (p\\supset \\lnot (p\\lor (p\\equiv r))) \\)" "az igazságtábla főoszlopa: 11110000"]
          ["\\( (((q\\equiv r)\\land p)\\land (p\\supset q)) \\)" "az igazságtábla főoszlopa: 00000001"]
          ["\\( ((\\lnot p\\equiv q)\\land (r\\supset r)) \\)" "az igazságtábla főoszlopa: 00111100"]
          ["\\( \\lnot (r\\equiv \\lnot (r\\lor q)) \\)" "az igazságtábla főoszlopa: 11011101"]
          ["\\( (r\\land \\lnot (\\lnot q\\equiv q)) \\)" "az igazságtábla főoszlopa: 01010101"]
          ["\\( (((p\\equiv r)\\land (r\\land p))\\land q) \\)" "az igazságtábla főoszlopa: 00000001"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1, \\( \\varrho (q) \\)=1 és \\( \\varrho (r) \\)=1!"
  :good [
         "\\( ((r\\equiv q)\\lor (q\\equiv (q\\supset r))) \\)"
         "\\( ((q\\equiv (\\lnot q\\land p))\\lor r) \\)"
         "\\( (((p\\supset \\lnot r)\\lor q)\\land r) \\)"
         "\\( (r\\lor (p\\supset ((q\\equiv r)\\lor q))) \\)"
         "\\( (p\\land (((p\\supset r)\\land p)\\lor q)) \\)"
         "\\( ((((q\\land r)\\land q)\\supset r)\\equiv p) \\)"
         "\\( (((q\\lor q)\\supset p)\\land (r\\land p)) \\)"
         "\\( ((r\\supset p)\\land ((r\\supset p)\\supset r)) \\)"
         "\\( (((p\\land r)\\land q)\\land (q\\lor r)) \\)"
         "\\( (((q\\lor q)\\land p)\\land (r\\land p)) \\)"
         "\\( (q\\lor \\lnot \\lnot (q\\lor p)) \\)"
         "\\( (((p\\equiv p)\\supset p)\\lor (q\\supset q)) \\)"
         "\\( ((\\lnot q\\equiv \\lnot p)\\lor r) \\)"
         "\\( (r\\supset (((q\\equiv r)\\lor q)\\land q)) \\)"
         "\\( (((r\\lor r)\\supset r)\\land (p\\equiv q)) \\)"
         "\\( \\lnot \\lnot (q\\lor (q\\supset p)) \\)"]

  :wrong [
          ["\\( \\lnot (((q\\land p)\\lor q)\\supset p) \\)" "az igazságtábla főoszlopa: 00110000"]
          ["\\( \\lnot (p\\supset (p\\lor (p\\land r))) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (r\\land ((p\\equiv \\lnot r)\\equiv q)) \\)" "az igazságtábla főoszlopa: 00010100"]
          ["\\( \\lnot (q\\supset (p\\supset (p\\lor q))) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( \\lnot (q\\lor (\\lnot p\\lor p)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( ((r\\supset p)\\supset \\lnot (q\\lor p)) \\)" "az igazságtábla főoszlopa: 11010000"]
          ["\\( ((q\\land q)\\land \\lnot (q\\lor p)) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( \\lnot ((r\\lor (q\\supset q))\\equiv p) \\)" "az igazságtábla főoszlopa: 11110000"]
          ["\\( ((q\\lor \\lnot q)\\supset \\lnot q) \\)" "az igazságtábla főoszlopa: 11001100"]
          ["\\( \\lnot \\lnot \\lnot (r\\supset r) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( \\lnot (p\\supset (p\\land (r\\equiv r))) \\)" "az igazságtábla főoszlopa: 00000000"]
          ["\\( (((p\\supset p)\\equiv r)\\land \\lnot p) \\)" "az igazságtábla főoszlopa: 01010000"]
          ["\\( \\lnot (r\\supset (p\\land (r\\supset q))) \\)" "az igazságtábla főoszlopa: 01010100"]
          ["\\( (\\lnot (\\lnot q\\lor r)\\land q) \\)" "az igazságtábla főoszlopa: 00100010"]]}]
