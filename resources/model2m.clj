[ {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0 és \\( \\varrho (q) \\)=0!"
  :good [
         "\\( q\\land q\\lor q\\supset p\\lor q \\)"
         "\\( p\\supset (p\\equiv p\\land p)\\lor p \\)"
         "\\( (q\\supset \\lnot q)\\supset q\\supset q \\)"
         "\\( \\lnot (p\\supset p\\land q\\equiv q) \\)"
         "\\( q\\lor (q\\supset q)\\lor p\\lor p \\)"
         "\\( (q\\land q)\\land p\\land p\\supset q \\)"
         "\\( \\lnot (\\lnot p\\equiv q\\land p) \\)"
]
  :wrong [
          ["\\( \\lnot p\\supset (q\\equiv q)\\land q \\)" "az eredeti formula: \\((\\lnot p\\supset ((q\\equiv q)\\land q))\\)<br>az igazságtábla főoszlopa: 0111"]
          ["\\( \\lnot (p\\supset (p\\equiv p\\land q)) \\)" "az eredeti formula: \\(\\lnot (p\\supset (p\\equiv (p\\land q)))\\)<br>az igazságtábla főoszlopa: 0010"]
          ["\\( (p\\supset \\lnot p)\\land (p\\lor q) \\)" "az eredeti formula: \\(((p\\supset \\lnot p)\\land (p\\lor q))\\)<br>az igazságtábla főoszlopa: 0100"]
          ["\\( \\lnot ((p\\equiv p)\\equiv \\lnot q) \\)" "az eredeti formula: \\(\\lnot ((p\\equiv p)\\equiv \\lnot q)\\)<br>az igazságtábla főoszlopa: 0101"]
          ["\\( p\\lor p\\lor (\\lnot q\\supset p) \\)" "az eredeti formula: \\((p\\lor (p\\lor (\\lnot q\\supset p)))\\)<br>az igazságtábla főoszlopa: 0111"]
          ["\\( q\\land q\\lor \\lnot (q\\supset q) \\)" "az eredeti formula: \\(((q\\land q)\\lor \\lnot (q\\supset q))\\)<br>az igazságtábla főoszlopa: 0101"]
          ["\\( (q\\lor q)\\lor \\lnot p\\supset p \\)" "az eredeti formula: \\((((q\\lor q)\\lor \\lnot p)\\supset p)\\)<br>az igazságtábla főoszlopa: 0011"]
          ["\\( \\lnot q\\equiv (q\\lor q)\\land q \\)" "az eredeti formula: \\((\\lnot q\\equiv ((q\\lor q)\\land q))\\)<br>az igazságtábla főoszlopa: 0000"]
]}

 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=0 és \\( \\varrho (q) \\)=1!"
  :good [
         "\\( \\lnot \\lnot (p\\supset q\\lor q) \\)"
         "\\( p\\lor q\\equiv p\\supset q\\supset q \\)"
         "\\( (q\\equiv q)\\lor \\lnot (q\\equiv q) \\)"
         "\\( \\lnot (q\\lor (q\\supset p))\\supset p \\)"
         "\\( (\\lnot (p\\equiv p)\\equiv q)\\supset p \\)"
         "\\( p\\supset \\lnot ((p\\supset p)\\supset p) \\)"
         "\\( \\lnot (p\\supset p\\land q)\\equiv p \\)"
         "\\( q\\supset ((p\\supset q)\\land q\\equiv q) \\)"
]
  :wrong [
          ["\\( q\\land \\lnot (p\\lor p)\\equiv p \\)" "az eredeti formula: \\(((q\\land \\lnot (p\\lor p))\\equiv p)\\)<br>az igazságtábla főoszlopa: 1000"]
          ["\\( p\\equiv (p\\equiv q)\\lor (p\\supset q) \\)" "az eredeti formula: \\((p\\equiv ((p\\equiv q)\\lor (p\\supset q)))\\)<br>az igazságtábla főoszlopa: 0001"]
          ["\\( \\lnot ((q\\lor p)\\lor p\\lor p) \\)" "az eredeti formula: \\(\\lnot ((q\\lor p)\\lor (p\\lor p))\\)<br>az igazságtábla főoszlopa: 1000"]
          ["\\( \\lnot \\lnot (p\\land \\lnot p) \\)" "az eredeti formula: \\(\\lnot \\lnot (p\\land \\lnot p)\\)<br>az igazságtábla főoszlopa: 0000"]
          ["\\( (q\\supset p\\lor (q\\equiv p))\\land q \\)" "az eredeti formula: \\(((q\\supset (p\\lor (q\\equiv p)))\\land q)\\)<br>az igazságtábla főoszlopa: 0001"]
          ["\\( p\\lor \\lnot (p\\supset p\\supset p) \\)" "az eredeti formula: \\((p\\lor \\lnot (p\\supset (p\\supset p)))\\)<br>az igazságtábla főoszlopa: 0011"]
          ["\\( (p\\land q)\\land p\\equiv p\\equiv p \\)" "az eredeti formula: \\((((p\\land q)\\land p)\\equiv (p\\equiv p))\\)<br>az igazságtábla főoszlopa: 0001"]
]}

 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1 és \\( \\varrho (q) \\)=0!"
  :good [
         "\\( (p\\land q\\equiv \\lnot p)\\equiv p \\)"
         "\\( (q\\equiv p)\\equiv q\\land p\\lor q \\)"
         "\\( (q\\supset (p\\equiv p))\\supset (q\\equiv q) \\)"
         "\\( p\\land (q\\equiv q\\equiv p)\\lor q \\)"
         "\\( \\lnot (p\\land (p\\land q)\\land p) \\)"
         "\\( \\lnot q\\lor ((p\\equiv p)\\supset p) \\)"
         "\\( q\\supset q\\equiv q\\lor p\\lor q \\)"
         "\\( (p\\land p\\equiv p)\\lor (q\\supset p) \\)"
         "\\( (p\\lor p\\supset p\\lor p)\\land p \\)"
]
  :wrong [
          ["\\( \\lnot q\\equiv (q\\lor p)\\land q \\)" "az eredeti formula: \\((\\lnot q\\equiv ((q\\lor p)\\land q))\\)<br>az igazságtábla főoszlopa: 0000"]
          ["\\( ((p\\equiv q)\\land q\\land p)\\land q \\)" "az eredeti formula: \\((((p\\equiv q)\\land (q\\land p))\\land q)\\)<br>az igazságtábla főoszlopa: 0001"]
          ["\\( p\\lor p\\supset q\\equiv p\\lor q \\)" "az eredeti formula: \\((((p\\lor p)\\supset q)\\equiv (p\\lor q))\\)<br>az igazságtábla főoszlopa: 0101"]
          ["\\( (q\\equiv q)\\equiv p\\lor q\\supset q \\)" "az eredeti formula: \\(((q\\equiv q)\\equiv ((p\\lor q)\\supset q))\\)<br>az igazságtábla főoszlopa: 1101"]
          ["\\( (q\\supset q)\\land (q\\lor (p\\equiv q)) \\)" "az eredeti formula: \\(((q\\supset q)\\land (q\\lor (p\\equiv q)))\\)<br>az igazságtábla főoszlopa: 1101"]
          ["\\( (p\\equiv p\\supset q)\\equiv q\\lor p \\)" "az eredeti formula: \\(((p\\equiv (p\\supset q))\\equiv (q\\lor p))\\)<br>az igazságtábla főoszlopa: 1001"]
]}

 {:question "Jelölje meg az alábbi formulák közül azokat, melyeknek modellje az a \\( \\varrho \\) interpretáció, ahol \\( \\varrho (p) \\)=1 és \\( \\varrho (q) \\)=1!"
  :good [
         "\\( \\lnot \\lnot (p\\equiv p\\lor q) \\)"
         "\\( (q\\lor q\\equiv p\\land q)\\land q \\)"
         "\\( ((q\\lor p)\\lor (p\\equiv q))\\lor p \\)"
         "\\( \\lnot q\\supset (q\\land p\\equiv q) \\)"
         "\\( ((q\\supset q)\\supset (q\\equiv p))\\lor q \\)"
         "\\( (q\\equiv q)\\lor \\lnot (p\\land q) \\)"
         "\\( p\\supset q\\lor q\\equiv q\\lor q \\)"
         "\\( (q\\lor (p\\land q\\equiv p))\\land p \\)"
         "\\( (p\\supset q\\equiv p)\\land p\\supset q \\)"
         "\\( (q\\lor q)\\land p\\lor (q\\equiv q) \\)"
]
  :wrong [
          ["\\( (p\\equiv q)\\land \\lnot (p\\equiv q) \\)" "az eredeti formula: \\(((p\\equiv q)\\land \\lnot (p\\equiv q))\\)<br>az igazságtábla főoszlopa: 0000"]
          ["\\( p\\land \\lnot (p\\lor q\\land p) \\)" "az eredeti formula: \\((p\\land \\lnot (p\\lor (q\\land p)))\\)<br>az igazságtábla főoszlopa: 0000"]
          ["\\( \\lnot (p\\lor q\\equiv q\\lor q) \\)" "az eredeti formula: \\(\\lnot ((p\\lor q)\\equiv (q\\lor q))\\)<br>az igazságtábla főoszlopa: 0010"]
          ["\\( \\lnot ((p\\equiv q)\\equiv p\\equiv p) \\)" "az eredeti formula: \\(\\lnot ((p\\equiv q)\\equiv (p\\equiv p))\\)<br>az igazságtábla főoszlopa: 0110"]
          ["\\( \\lnot ((p\\land p)\\land q\\land q) \\)" "az eredeti formula: \\(\\lnot ((p\\land p)\\land (q\\land q))\\)<br>az igazságtábla főoszlopa: 1110"]
]}]

