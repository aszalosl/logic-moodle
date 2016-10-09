[{:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0 és \\( \\varrho (q) \\)=0!"
  :good [
         "\\( \\lnot ((q\\supset p)\\equiv (q\\lor q)) \\)"
         "\\( ((((p\\supset q)\\lor q)\\equiv p)\\equiv q) \\)"
         "\\( ((\\lnot q\\supset q)\\lor \\lnot p) \\)"
         "\\( \\lnot (((p\\land q)\\land q)\\land q) \\)"
         "\\( (p\\supset (q\\land ((p\\lor p)\\land p))) \\)"
         "\\( (q\\supset (p\\equiv \\lnot (q\\supset q))) \\)"
         "\\( (p\\equiv \\lnot ((q\\land p)\\equiv p)) \\)"
         "\\( \\lnot ((p\\equiv p)\\equiv (q\\lor q)) \\)"
         "\\( (\\lnot q\\lor \\lnot (q\\equiv p)) \\)"
         "\\( ((q\\lor (p\\equiv p))\\equiv (p\\equiv p)) \\)"
         "\\( ((p\\lor (p\\land q))\\equiv (p\\lor q)) \\)"
         "\\( (p\\supset (q\\land (q\\land (q\\equiv q)))) \\)"
         "\\( (((q\\supset p)\\supset q)\\equiv (q\\land p)) \\)"
         "\\( (((q\\supset q)\\equiv (p\\equiv q))\\lor p) \\)"
         "\\( \\lnot (q\\land (p\\lor (p\\lor p))) \\)"
         "\\( \\lnot \\lnot (q\\supset (q\\supset p)) \\)"]

  :wrong [
          ["\\( ((p\\land q)\\land (p\\supset (p\\equiv q))) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( \\lnot ((p\\lor p)\\supset (p\\land p)) \\)" "az igazságtábla főoszlopa: 0000"]
          ["\\( ((p\\land q)\\land (q\\supset (q\\land q))) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( (p\\lor (q\\equiv (p\\lor (q\\supset p)))) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( \\lnot \\lnot ((p\\equiv p)\\supset q) \\)" "az igazságtábla főoszlopa: 0101"]
          ["\\( (((p\\land p)\\equiv (p\\land q))\\supset p) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( ((p\\equiv (p\\land p))\\land (p\\lor q)) \\)" "az igazságtábla főoszlopa: 0111"]
          ["\\( (p\\land ((q\\supset q)\\supset \\lnot q)) \\)" "az igazságtábla főoszlopa: 0010"]
          ["\\( (\\lnot (q\\equiv p)\\land (q\\supset q)) \\)" "az igazságtábla főoszlopa: 0110"]
          ["\\( (q\\land ((q\\lor q)\\lor \\lnot p)) \\)" "az igazságtábla főoszlopa: 0101"]
          ["\\( ((q\\lor q)\\equiv \\lnot (q\\land p)) \\)" "az igazságtábla főoszlopa: 0100"]
          ["\\( (((q\\supset p)\\land p)\\land (q\\equiv p)) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( (q\\lor ((q\\supset p)\\land (q\\land q))) \\)" "az igazságtábla főoszlopa: 0101"]
          ["\\( ((\\lnot (q\\equiv p)\\lor p)\\land q) \\)" "az igazságtábla főoszlopa: 0101"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0 és \\( \\varrho (q) \\)=1!"
  :good [
         "\\( (\\lnot ((q\\supset p)\\lor q)\\equiv p) \\)"
         "\\( ((\\lnot \\lnot p\\supset q)\\land q) \\)"
         "\\( (p\\lor (q\\land (q\\equiv (p\\lor q)))) \\)"
         "\\( ((q\\land (q\\equiv (q\\equiv p)))\\supset p) \\)"
         "\\( (q\\lor ((\\lnot p\\supset p)\\lor p)) \\)"
         "\\( ((q\\equiv p)\\supset \\lnot (q\\equiv p)) \\)"
         "\\( (\\lnot (p\\land p)\\supset (p\\equiv p)) \\)"
         "\\( \\lnot \\lnot \\lnot \\lnot q \\)"
         "\\( ((q\\supset \\lnot \\lnot q)\\land q) \\)"
         "\\( \\lnot ((p\\lor p)\\land (p\\land p)) \\)"
         "\\( ((p\\supset q)\\supset ((q\\lor p)\\land q)) \\)"
         "\\( (((q\\supset \\lnot q)\\supset q)\\equiv q) \\)"
         "\\( ((q\\land p)\\equiv ((q\\supset q)\\equiv p)) \\)"
         "\\( (p\\equiv (\\lnot (p\\supset p)\\land p)) \\)"
         "\\( (((\\lnot q\\land p)\\supset p)\\lor p) \\)"
         "\\( (\\lnot (q\\lor (q\\equiv q))\\supset p) \\)"
         "\\( ((p\\equiv (q\\land q))\\supset (p\\land q)) \\)"]

  :wrong [
          ["\\( ((p\\lor p)\\land ((p\\land q)\\lor q)) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( (\\lnot (p\\supset p)\\lor (p\\land p)) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( \\lnot ((p\\land (q\\equiv q))\\lor q) \\)" "az igazságtábla főoszlopa: 1000"]
          ["\\( (\\lnot (p\\land (p\\supset p))\\supset p) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( (q\\equiv (p\\land ((p\\lor q)\\land p))) \\)" "az igazságtábla főoszlopa: 1001"]
          ["\\( ((q\\land (p\\equiv q))\\equiv \\lnot p) \\)" "az igazságtábla főoszlopa: 0010"]
          ["\\( (p\\land (p\\supset ((q\\equiv q)\\land q))) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( \\lnot (\\lnot p\\lor (p\\lor q)) \\)" "az igazságtábla főoszlopa: 0000"]
          ["\\( (((p\\land p)\\lor \\lnot q)\\lor p) \\)" "az igazságtábla főoszlopa: 1011"]
          ["\\( \\lnot \\lnot (p\\land (q\\land p)) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( ((((q\\lor q)\\equiv p)\\land q)\\lor p) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( \\lnot (\\lnot (q\\equiv p)\\equiv q) \\)" "az igazságtábla főoszlopa: 0011"]
          ["\\( \\lnot ((p\\equiv \\lnot p)\\lor q) \\)" "az igazságtábla főoszlopa: 1010"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1 és \\( \\varrho (q) \\)=0!"
  :good [
         "\\( (q\\equiv ((p\\supset (q\\land q))\\land q)) \\)"
         "\\( (p\\land (q\\lor ((q\\supset q)\\equiv p))) \\)"
         "\\( ((p\\lor p)\\equiv \\lnot (q\\equiv p)) \\)"
         "\\( \\lnot ((p\\supset q)\\lor \\lnot p) \\)"
         "\\( ((p\\lor p)\\lor (p\\land (q\\equiv q))) \\)"
         "\\( (q\\equiv (q\\lor ((q\\lor p)\\land q))) \\)"
         "\\( \\lnot ((q\\equiv p)\\equiv (q\\supset p)) \\)"
         "\\( (\\lnot (p\\land q)\\supset (p\\supset p)) \\)"
         "\\( ((q\\equiv p)\\equiv (p\\equiv (p\\equiv q))) \\)"
         "\\( ((q\\supset (q\\equiv p))\\equiv \\lnot q) \\)"
         "\\( (q\\supset ((\\lnot q\\equiv q)\\land q)) \\)"
         "\\( (((p\\equiv q)\\land p)\\supset (q\\lor p)) \\)"
         "\\( ((q\\equiv q)\\lor ((p\\land p)\\land q)) \\)"
         "\\( ((\\lnot (p\\land p)\\supset p)\\land p) \\)"
         "\\( (\\lnot q\\equiv (\\lnot q\\lor p)) \\)"]

  :wrong [
          ["\\( \\lnot ((p\\supset q)\\supset \\lnot p) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( (q\\equiv (p\\lor (q\\land (p\\supset p)))) \\)" "az igazságtábla főoszlopa: 1101"]
          ["\\( ((((p\\supset q)\\supset q)\\equiv p)\\land q) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( (q\\land (((p\\land p)\\equiv p)\\lor q)) \\)" "az igazságtábla főoszlopa: 0101"]
          ["\\( ((q\\lor p)\\equiv (p\\land (q\\equiv p))) \\)" "az igazságtábla főoszlopa: 1001"]
          ["\\( (p\\land \\lnot (q\\equiv (q\\equiv p))) \\)" "az igazságtábla főoszlopa: 0000"]
          ["\\( ((\\lnot q\\supset (q\\land q))\\land p) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( ((p\\lor (q\\equiv q))\\supset (p\\land q)) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( ((p\\supset q)\\lor ((p\\equiv p)\\supset q)) \\)" "az igazságtábla főoszlopa: 1101"]
          ["\\( (((q\\lor \\lnot q)\\equiv p)\\equiv q) \\)" "az igazságtábla főoszlopa: 1001"]
          ["\\( \\lnot (q\\equiv (q\\equiv (q\\lor p))) \\)" "az igazságtábla főoszlopa: 1000"]
          ["\\( \\lnot ((p\\land (q\\equiv q))\\lor q) \\)" "az igazságtábla főoszlopa: 1000"]
          ["\\( ((q\\equiv q)\\land (p\\land (q\\equiv p))) \\)" "az igazságtábla főoszlopa: 0001"]
          ["\\( \\lnot ((q\\equiv p)\\equiv (q\\lor q)) \\)" "az igazságtábla főoszlopa: 1100"]
          ["\\( (((p\\land p)\\supset (p\\lor q))\\supset q) \\)" "az igazságtábla főoszlopa: 0101"]]}


 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1 és \\( \\varrho (q) \\)=1!"
  :good [
         "\\( (((p\\land (p\\supset q))\\equiv q)\\supset p) \\)"
         "\\( \\lnot \\lnot ((q\\equiv q)\\lor p) \\)"
         "\\( (\\lnot ((q\\lor q)\\supset q)\\supset p) \\)"
         "\\( ((p\\land q)\\supset ((q\\lor p)\\land p)) \\)"
         "\\( (p\\lor ((\\lnot p\\land p)\\supset q)) \\)"
         "\\( (\\lnot (q\\supset q)\\lor (q\\land q)) \\)"
         "\\( ((p\\supset q)\\supset (p\\equiv (p\\lor p))) \\)"
         "\\( ((\\lnot q\\lor p)\\equiv (q\\equiv q)) \\)"
         "\\( (q\\equiv (p\\supset (p\\lor (p\\equiv p)))) \\)"
         "\\( (\\lnot (p\\land \\lnot p)\\lor p) \\)"
         "\\( (\\lnot \\lnot q\\supset (q\\equiv q)) \\)"
         "\\( (q\\lor (q\\equiv \\lnot (q\\lor q))) \\)"
         "\\( (((p\\supset \\lnot p)\\lor p)\\supset q) \\)"
         "\\( ((((q\\supset p)\\supset q)\\land q)\\lor q) \\)"
         "\\( (((q\\land (p\\equiv q))\\lor p)\\land p) \\)"
         "\\( \\lnot \\lnot (\\lnot p\\supset p) \\)"
         "\\( ((q\\land p)\\land (q\\lor (q\\lor p))) \\)"
         "\\( (\\lnot (p\\supset p)\\lor (q\\land p)) \\)"
         "\\( ((q\\land q)\\equiv ((q\\lor p)\\land p)) \\)"
         "\\( ((q\\land p)\\land ((p\\equiv q)\\supset q)) \\)"
         "\\( (p\\land ((p\\supset (q\\supset p))\\equiv p)) \\)"
         "\\( (((q\\lor p)\\land (q\\land q))\\lor p) \\)"]

  :wrong [
          ["\\( (\\lnot (q\\supset q)\\lor \\lnot q) \\)" "az igazságtábla főoszlopa: 1010"]
          ["\\( \\lnot \\lnot (p\\equiv \\lnot p) \\)" "az igazságtábla főoszlopa: 0000"]
          ["\\( \\lnot \\lnot (q\\land \\lnot p) \\)" "az igazságtábla főoszlopa: 0100"]
          ["\\( \\lnot \\lnot \\lnot (p\\lor q) \\)" "az igazságtábla főoszlopa: 1000"]
          ["\\( (((q\\lor p)\\lor q)\\equiv \\lnot q) \\)" "az igazságtábla főoszlopa: 0010"]
          ["\\( \\lnot ((q\\land p)\\land (q\\land q)) \\)" "az igazságtábla főoszlopa: 1110"]
          ["\\( (\\lnot (p\\equiv q)\\lor \\lnot q) \\)" "az igazságtábla főoszlopa: 1110"]
          ["\\( \\lnot (p\\land (q\\supset (q\\lor p))) \\)" "az igazságtábla főoszlopa: 1100"]]}]
