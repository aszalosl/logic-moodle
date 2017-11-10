[{:question "Jelölje meg a kielégíthető, de nem érvényes formulákat!"
  :good [
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv q) \\)"
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( \\lnot ((p\\lor p)\\lor q) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv p) \\)"
    "\\( (\\lnot p\\land (q\\lor q)) \\)"
    "\\( \\lnot ((q\\land p)\\equiv q) \\)"
    "\\( (q\\land \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (p\\lor q)) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( (p\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((p\\land \\lnot p)\\equiv p) \\)"
    "\\( (p\\equiv (p\\land \\lnot p)) \\)"
    "\\( \\lnot ((p\\lor p)\\lor p) \\)"
    "\\( \\lnot (p\\land p) \\)"
    "\\( \\lnot ((q\\lor p)\\supset q) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( \\lnot ((q\\land p)\\equiv p) \\)"
    "\\( \\lnot (p\\supset (q\\land q)) \\)"
    "\\( (p\\land (p\\equiv \\lnot q)) \\)"
    "\\( (q\\supset (p\\land \\lnot q)) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot q \\)"
    "\\( (q\\supset \\lnot (q\\supset q)) \\)"
    "\\( \\lnot ((q\\lor q)\\lor q) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( \\lnot (q\\land (p\\land p)) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( (q\\equiv (p\\lor (q\\equiv p))) \\)"
    "\\( (((p\\supset q)\\land p)\\land p) \\)"
    "\\( ((p\\lor q)\\land (q\\equiv p)) \\)"
    "\\( (p\\land ((q\\equiv p)\\land p)) \\)"
    "\\( ((q\\land p)\\land (p\\land q)) \\)"
    "\\( ((p\\land (q\\lor p))\\equiv q) \\)"
    "\\( ((p\\land (q\\equiv q))\\equiv q) \\)"
    "\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)"
    "\\( ((p\\supset p)\\land (q\\equiv p)) \\)"
    "\\( (p\\equiv (q\\land (p\\equiv p))) \\)"
    "\\( (((q\\lor q)\\land q)\\land q) \\)"
    "\\( (q\\land (p\\equiv (p\\equiv q))) \\)"
    "\\( ((q\\equiv (q\\lor q))\\supset q) \\)"
    "\\( ((p\\supset p)\\land q) \\)"
    "\\( (((p\\supset p)\\lor q)\\land q) \\)"
    "\\( ((q\\lor (p\\lor p))\\supset q) \\)"
    "\\( ((q\\lor (p\\lor q))\\supset q) \\)"
    "\\( (p\\supset (q\\land (q\\land q))) \\)"
    "\\( ((p\\land (q\\land p))\\equiv p) \\)"
    "\\( ((q\\land p)\\equiv (p\\lor p)) \\)"
    "\\( (p\\land ((q\\equiv q)\\supset p)) \\)"
    "\\( (p\\land ((p\\lor p)\\equiv p)) \\)"
    "\\( (p\\equiv (p\\lor (q\\equiv q))) \\)"
    "\\( (p\\land (p\\supset (q\\equiv q))) \\)"
    "\\( ((p\\supset (p\\land p))\\equiv p) \\)"
    "\\( (\\lnot q\\lor p) \\)"
    "\\( ((q\\land (p\\land q))\\equiv q) \\)"
    "\\( ((p\\land q)\\equiv q) \\)"
    "\\( (q\\supset ((q\\equiv p)\\land p)) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\supset p)) \\)"
    "\\( ((p\\land p)\\equiv (q\\supset p)) \\)"
    "\\( ((p\\supset p)\\supset (p\\lor q)) \\)"
    "\\( ((q\\lor \\lnot p)\\supset q) \\)"
    "\\( (q\\lor (\\lnot p\\equiv q)) \\)"
    "\\( (p\\lor (q\\equiv (p\\supset p))) \\)"
  ]
  :wrong [
    ["\\( \\lnot (p\\supset p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (p\\land (q\\land \\lnot q)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\land (p\\equiv \\lnot p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\land (\\lnot p\\equiv p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((\\lnot q\\equiv q)\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (p\\equiv p)\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\land p)\\supset q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\land \\lnot q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\land (p\\land \\lnot q)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((p\\land p)\\equiv \\lnot p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (p\\lor q)\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\land q)\\equiv q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (q\\lor p)\\land p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (p\\land (p\\equiv \\lnot p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (q\\equiv q)\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\equiv q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\land (\\lnot q\\land p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\land q)\\supset q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (p\\land p)\\land p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((q\\land \\lnot q)\\land p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (q\\supset q)\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (p\\land \\lnot (q\\lor p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((p\\land p)\\equiv p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((q\\land p)\\land \\lnot p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot q\\land q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (p\\land (p\\equiv \\lnot p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\supset q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((p\\lor p)\\land \\lnot p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot (q\\land q)\\equiv q) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( ((p\\land (p\\land p))\\supset p) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\supset (p\\lor (q\\lor p))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((\\lnot p\\land p)\\supset q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\supset ((p\\equiv q)\\supset p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\supset (p\\lor p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\supset ((q\\land q)\\lor p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((p\\lor p)\\lor (p\\supset p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\supset (p\\supset p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\equiv ((p\\supset p)\\land p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((q\\equiv (q\\land q))\\lor p) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((q\\equiv (p\\equiv q))\\supset p) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\lor ((p\\land p)\\equiv p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor (q\\equiv (p\\land q))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\lor (p\\equiv p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor (q\\supset (p\\lor p))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((p\\land (p\\equiv q))\\supset q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((q\\equiv (p\\equiv q))\\equiv p) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((p\\equiv (p\\lor p))\\lor p) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\supset (q\\lor (p\\land p))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((q\\land (p\\land p))\\supset q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((q\\land (p\\land p))\\supset q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\equiv (p\\lor p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (p\\equiv ((p\\land p)\\lor p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\supset (q\\lor (p\\land p))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (((q\\equiv p)\\equiv p)\\equiv q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\supset (p\\lor \\lnot p)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( ((\\lnot p\\land q)\\supset q) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor ((q\\land p)\\equiv q)) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (q\\lor (p\\supset (p\\lor q))) \\)" "az igazságtábla főoszlopa: 1111"]
    ["\\( (((p\\land p)\\equiv p)\\lor q) \\)" "az igazságtábla főoszlopa: 1111"]
]}]
