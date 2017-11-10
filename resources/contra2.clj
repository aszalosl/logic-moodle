[{:question "Jelölje meg a kielégíthetetlen formulákat!"
  :good [
    "\\( (q\\land (q\\equiv \\lnot q)) \\)"
    "\\( (q\\land (\\lnot q\\land q)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv q) \\)"
    "\\( \\lnot ((p\\lor p)\\supset p) \\)"
    "\\( (p\\land \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot q\\land (q\\land q)) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv q) \\)"
    "\\( ((q\\land q)\\land \\lnot q) \\)"
    "\\( (p\\land (p\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\lor \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (p\\land p)) \\)"
    "\\( ((p\\land \\lnot p)\\land p) \\)"
    "\\( \\lnot (q\\lor (q\\supset q)) \\)"
    "\\( (p\\land (\\lnot p\\land p)) \\)"
    "\\( (q\\land \\lnot q) \\)"
    "\\( \\lnot (q\\supset (p\\supset p)) \\)"
    "\\( \\lnot (q\\supset (p\\supset q)) \\)"
    "\\( \\lnot ((q\\supset p)\\lor q) \\)"
    "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
    "\\( \\lnot (q\\supset (q\\land q)) \\)"
    "\\( (q\\land \\lnot (p\\lor q)) \\)"
    "\\( (q\\land (\\lnot p\\land p)) \\)"
    "\\( \\lnot ((p\\lor p)\\supset p) \\)"
    "\\( (p\\land (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot (q\\supset (q\\equiv q)) \\)"
    "\\( \\lnot (q\\lor (q\\supset p)) \\)"
    "\\( (\\lnot (q\\equiv q)\\land q) \\)"
    "\\( (q\\land \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot q\\land (q\\land p)) \\)"
    "\\( (\\lnot q\\land (q\\land q)) \\)"
  ]
  :wrong [
    ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "az igazságtábla főoszlopa: 1000 "]
    ["\\( (\\lnot p\\land (q\\equiv p)) \\)" "az igazságtábla főoszlopa: 1000 "]
    ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "az igazságtábla főoszlopa: 1000 "]
    ["\\( (\\lnot p\\land \\lnot q) \\)" "az igazságtábla főoszlopa: 1000 "]
    ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "az igazságtábla főoszlopa: 1000 "]
    ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "az igazságtábla főoszlopa: 0100 "]
    ["\\( (q\\land (\\lnot p\\land q)) \\)" "az igazságtábla főoszlopa: 0100 "]
    ["\\( ((p\\equiv \\lnot q)\\land q) \\)" "az igazságtábla főoszlopa: 0100 "]
    ["\\( (q\\land \\lnot (p\\equiv q)) \\)" "az igazságtábla főoszlopa: 0100 "]
    ["\\( (q\\land (p\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 0100 "]
    ["\\( \\lnot (p\\land (q\\equiv q)) \\)" "az igazságtábla főoszlopa: 1100 "]
    ["\\( \\lnot ((q\\supset p)\\land p) \\)" "az igazságtábla főoszlopa: 1100 "]
    ["\\( \\lnot ((p\\lor q)\\land p) \\)" "az igazságtábla főoszlopa: 1100 "]
    ["\\( ((\\lnot q\\land q)\\equiv p) \\)" "az igazságtábla főoszlopa: 1100 "]
    ["\\( \\lnot (q\\equiv (q\\equiv p)) \\)" "az igazságtábla főoszlopa: 1100 "]
    ["\\( (p\\land (p\\supset \\lnot q)) \\)" "az igazságtábla főoszlopa: 0010 "]
    ["\\( ((p\\lor p)\\land \\lnot q) \\)" "az igazságtábla főoszlopa: 0010 "]
    ["\\( ((\\lnot p\\equiv q)\\land p) \\)" "az igazságtábla főoszlopa: 0010 "]
    ["\\( \\lnot ((q\\equiv p)\\lor q) \\)" "az igazságtábla főoszlopa: 0010 "]
    ["\\( ((\\lnot p\\equiv q)\\land p) \\)" "az igazságtábla főoszlopa: 0010 "]
    ["\\( (q\\supset (q\\equiv \\lnot q)) \\)" "az igazságtábla főoszlopa: 1010 "]
    ["\\( \\lnot ((q\\equiv q)\\supset q) \\)" "az igazságtábla főoszlopa: 1010 "]
    ["\\( ((q\\supset q)\\equiv \\lnot q) \\)" "az igazságtábla főoszlopa: 1010 "]
    ["\\( (q\\equiv (\\lnot p\\equiv p)) \\)" "az igazságtábla főoszlopa: 1010 "]
    ["\\( \\lnot ((q\\lor q)\\lor q) \\)" "az igazságtábla főoszlopa: 1010 "]
    ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "az igazságtábla főoszlopa: 0110 "]
    ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "az igazságtábla főoszlopa: 0110 "]
    ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "az igazságtábla főoszlopa: 0110 "]
    ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "az igazságtábla főoszlopa: 0110 "]
    ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "az igazságtábla főoszlopa: 0110 "]
    ["\\( (p\\supset \\lnot (q\\land q)) \\)" "az igazságtábla főoszlopa: 1110 "]
    ["\\( (q\\supset (q\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 1110 "]
    ["\\( \\lnot ((p\\land q)\\land p) \\)" "az igazságtábla főoszlopa: 1110 "]
    ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "az igazságtábla főoszlopa: 1110 "]
    ["\\( (p\\supset (q\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 1110 "]
    ["\\( (p\\land ((q\\lor q)\\equiv p)) \\)" "az igazságtábla főoszlopa: 0001 "]
    ["\\( (q\\land (p\\equiv (p\\equiv p))) \\)" "az igazságtábla főoszlopa: 0001 "]
    ["\\( ((p\\supset (q\\land p))\\land p) \\)" "az igazságtábla főoszlopa: 0001 "]
    ["\\( (q\\equiv ((p\\lor q)\\equiv p)) \\)" "az igazságtábla főoszlopa: 0001 "]
    ["\\( (((p\\lor q)\\land q)\\land p) \\)" "az igazságtábla főoszlopa: 0001 "]
    ["\\( ((p\\lor (p\\land p))\\equiv q) \\)" "az igazságtábla főoszlopa: 1001 "]
    ["\\( ((q\\lor q)\\equiv p) \\)" "az igazságtábla főoszlopa: 1001 "]
    ["\\( ((p\\lor q)\\supset (p\\land q)) \\)" "az igazságtábla főoszlopa: 1001 "]
    ["\\( (q\\equiv (p\\land (q\\equiv q))) \\)" "az igazságtábla főoszlopa: 1001 "]
    ["\\( (q\\equiv ((p\\supset q)\\supset p)) \\)" "az igazságtábla főoszlopa: 1001 "]
    ["\\( (((p\\supset q)\\lor p)\\supset q) \\)" "az igazságtábla főoszlopa: 0101 "]
    ["\\( ((q\\land (p\\lor q))\\lor q) \\)" "az igazságtábla főoszlopa: 0101 "]
    ["\\( (((q\\equiv q)\\lor q)\\supset q) \\)" "az igazságtábla főoszlopa: 0101 "]
    ["\\( (q\\equiv ((p\\supset q)\\lor p)) \\)" "az igazságtábla főoszlopa: 0101 "]
    ["\\( ((\\lnot q\\supset q)\\land q) \\)" "az igazságtábla főoszlopa: 0101 "]
    ["\\( (\\lnot (p\\land p)\\lor q) \\)" "az igazságtábla főoszlopa: 1101 "]
    ["\\( ((p\\equiv (q\\equiv q))\\supset q) \\)" "az igazságtábla főoszlopa: 1101 "]
    ["\\( (((q\\supset p)\\supset p)\\supset q) \\)" "az igazságtábla főoszlopa: 1101 "]
    ["\\( (p\\supset (p\\supset (q\\lor q))) \\)" "az igazságtábla főoszlopa: 1101 "]
    ["\\( ((\\lnot p\\equiv q)\\supset q) \\)" "az igazságtábla főoszlopa: 1101 "]
    ["\\( (p\\land (q\\supset (p\\lor q))) \\)" "az igazságtábla főoszlopa: 0011 "]
    ["\\( (p\\land (p\\supset (q\\supset p))) \\)" "az igazságtábla főoszlopa: 0011 "]
    ["\\( (p\\lor (p\\land (q\\land q))) \\)" "az igazságtábla főoszlopa: 0011 "]
    ["\\( ((p\\supset (q\\land p))\\supset p) \\)" "az igazságtábla főoszlopa: 0011 "]
    ["\\( (p\\land (q\\supset (q\\lor p))) \\)" "az igazságtábla főoszlopa: 0011 "]
    ["\\( ((q\\land p)\\equiv q) \\)" "az igazságtábla főoszlopa: 1011 "]
    ["\\( ((q\\land (p\\land p))\\equiv q) \\)" "az igazságtábla főoszlopa: 1011 "]
    ["\\( (q\\equiv (q\\land (q\\supset p))) \\)" "az igazságtábla főoszlopa: 1011 "]
    ["\\( ((q\\lor q)\\supset p) \\)" "az igazságtábla főoszlopa: 1011 "]
    ["\\( (q\\supset (q\\land (p\\equiv q))) \\)" "az igazságtábla főoszlopa: 1011 "]
    ["\\( ((p\\supset (p\\equiv q))\\equiv q) \\)" "az igazságtábla főoszlopa: 0111 "]
    ["\\( ((p\\lor q)\\lor (q\\lor p)) \\)" "az igazságtábla főoszlopa: 0111 "]
    ["\\( (((p\\lor p)\\supset q)\\supset q) \\)" "az igazságtábla főoszlopa: 0111 "]
    ["\\( ((q\\supset q)\\supset (p\\lor q)) \\)" "az igazságtábla főoszlopa: 0111 "]
    ["\\( ((p\\supset (q\\equiv p))\\supset q) \\)" "az igazságtábla főoszlopa: 0111 "]
    ["\\( (p\\supset (p\\lor (p\\land p))) \\)" "az igazságtábla főoszlopa: 1111 "]
    ["\\( (((q\\equiv q)\\land p)\\equiv p) \\)" "az igazságtábla főoszlopa: 1111 "]
    ["\\( ((q\\land p)\\supset (p\\lor q)) \\)" "az igazságtábla főoszlopa: 1111 "]
    ["\\( (q\\supset (q\\equiv (q\\land q))) \\)" "az igazságtábla főoszlopa: 1111 "]
    ["\\( ((p\\land q)\\equiv (q\\land p)) \\)" "az igazságtábla főoszlopa: 1111 "]
]}]
