[{:question "Jelölje meg az érvényes formulákat!"
  :good [
    "\\( ((\\lnot q\\supset q)\\equiv q) \\)"
    "\\( (q\\equiv (q\\equiv (p\\supset p))) \\)"
    "\\( (((p\\land p)\\land q)\\supset p) \\)"
    "\\( \\lnot (\\lnot q\\equiv q) \\)"
    "\\( (((q\\supset q)\\equiv p)\\supset p) \\)"
    "\\( (p\\lor (q\\supset (p\\supset q))) \\)"
    "\\( (q\\lor (q\\lor \\lnot q)) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\supset q)) \\)"
    "\\( (p\\equiv (p\\land (p\\land p))) \\)"
    "\\( (q\\lor (q\\supset (q\\equiv q))) \\)"
    "\\( (p\\supset ((q\\supset p)\\lor p)) \\)"
    "\\( ((p\\lor (p\\lor p))\\supset p) \\)"
    "\\( ((p\\lor \\lnot q)\\lor q) \\)"
    "\\( ((q\\supset p)\\lor q) \\)"
    "\\( (p\\lor (p\\supset (p\\supset p))) \\)"
    "\\( ((p\\supset p)\\lor p) \\)"
    "\\( (\\lnot p\\lor (p\\equiv p)) \\)"
    "\\( ((q\\lor q)\\lor (p\\supset p)) \\)"
    "\\( ((q\\land p)\\supset (p\\supset q)) \\)"
    "\\( ((q\\supset p)\\lor (q\\lor p)) \\)"
    "\\( ((\\lnot q\\equiv q)\\supset q) \\)"
    "\\( (q\\equiv q) \\)"
    "\\( (q\\supset ((q\\lor p)\\land q)) \\)"
    "\\( (q\\supset ((p\\lor p)\\supset p)) \\)"
    "\\( (((q\\lor p)\\equiv p)\\lor q) \\)"
    "\\( ((p\\supset p)\\lor (q\\supset p)) \\)"
    "\\( ((p\\lor (p\\supset q))\\lor q) \\)"
    "\\( (p\\equiv ((p\\supset p)\\land p)) \\)"
    "\\( ((q\\land q)\\lor (q\\equiv q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\equiv q)) \\)"
  ]
  :wrong [
    ["\\( ((p\\land q)\\land \\lnot p) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (p\\supset (q\\supset p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (q\\equiv (q\\supset \\lnot q)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot q\\land (q\\lor q)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( \\lnot (q\\supset (q\\lor p)) \\)" "az igazságtábla főoszlopa: 0000"]
    ["\\( (\\lnot q\\land (q\\equiv p)) \\)" "az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot ((p\\lor p)\\lor q) \\)" "az igazságtábla főoszlopa: 1000"]
    ["\\( ((q\\equiv p)\\land \\lnot q) \\)" "az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot ((q\\lor p)\\lor p) \\)" "az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "az igazságtábla főoszlopa: 1000"]
    ["\\( \\lnot ((q\\lor q)\\supset p) \\)" "az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot (p\\lor \\lnot q) \\)" "az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot ((q\\land q)\\supset p) \\)" "az igazságtábla főoszlopa: 0100"]
    ["\\( (q\\land (p\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 0100"]
    ["\\( \\lnot ((q\\land p)\\equiv q) \\)" "az igazságtábla főoszlopa: 0100"]
    ["\\( (p\\supset (p\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 1100"]
    ["\\( ((q\\equiv \\lnot p)\\equiv q) \\)" "az igazságtábla főoszlopa: 1100"]
    ["\\( ((q\\supset q)\\supset \\lnot p) \\)" "az igazságtábla főoszlopa: 1100"]
    ["\\( (p\\equiv \\lnot (q\\equiv q)) \\)" "az igazságtábla főoszlopa: 1100"]
    ["\\( \\lnot ((p\\supset p)\\equiv p) \\)" "az igazságtábla főoszlopa: 1100"]
    ["\\( \\lnot (p\\supset (q\\lor q)) \\)" "az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (q\\lor (p\\supset q)) \\)" "az igazságtábla főoszlopa: 0010"]
    ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "az igazságtábla főoszlopa: 0010"]
    ["\\( (\\lnot q\\land p) \\)" "az igazságtábla főoszlopa: 0010"]
    ["\\( \\lnot (p\\supset (p\\land q)) \\)" "az igazságtábla főoszlopa: 0010"]
    ["\\( (p\\equiv (\\lnot p\\equiv q)) \\)" "az igazságtábla főoszlopa: 1010"]
    ["\\( (\\lnot (p\\equiv p)\\equiv q) \\)" "az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot (q\\land (p\\supset p)) \\)" "az igazságtábla főoszlopa: 1010"]
    ["\\( (q\\equiv (\\lnot p\\equiv p)) \\)" "az igazságtábla főoszlopa: 1010"]
    ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "az igazságtábla főoszlopa: 0110"]
    ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "az igazságtábla főoszlopa: 0110"]
    ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "az igazságtábla főoszlopa: 0110"]
    ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "az igazságtábla főoszlopa: 0110"]
    ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "az igazságtábla főoszlopa: 0110"]
    ["\\( \\lnot ((p\\equiv q)\\land p) \\)" "az igazságtábla főoszlopa: 1110"]
    ["\\( (q\\supset (p\\equiv \\lnot q)) \\)" "az igazságtábla főoszlopa: 1110"]
    ["\\( ((q\\land p)\\supset \\lnot p) \\)" "az igazságtábla főoszlopa: 1110"]
    ["\\( (\\lnot p\\equiv (p\\supset q)) \\)" "az igazságtábla főoszlopa: 1110"]
    ["\\( (p\\supset (p\\supset \\lnot q)) \\)" "az igazságtábla főoszlopa: 1110"]
    ["\\( ((p\\land (p\\supset p))\\land q) \\)" "az igazságtábla főoszlopa: 0001"]
    ["\\( (q\\land ((q\\equiv p)\\equiv q)) \\)" "az igazságtábla főoszlopa: 0001"]
    ["\\( ((p\\equiv (p\\land q))\\equiv p) \\)" "az igazságtábla főoszlopa: 0001"]
    ["\\( (q\\land (p\\land (p\\supset p))) \\)" "az igazságtábla főoszlopa: 0001"]
    ["\\( ((p\\land q)\\equiv (q\\equiv q)) \\)" "az igazságtábla főoszlopa: 0001"]
    ["\\( ((q\\equiv q)\\supset (p\\equiv q)) \\)" "az igazságtábla főoszlopa: 1001"]
    ["\\( ((p\\equiv q)\\land (q\\supset p)) \\)" "az igazságtábla főoszlopa: 1001"]
    ["\\( ((\\lnot q\\supset q)\\equiv p) \\)" "az igazságtábla főoszlopa: 1001"]
    ["\\( ((q\\equiv q)\\supset (q\\equiv p)) \\)" "az igazságtábla főoszlopa: 1001"]
    ["\\( ((p\\land (p\\lor q))\\equiv q) \\)" "az igazságtábla főoszlopa: 1001"]
    ["\\( (((p\\land q)\\supset p)\\supset q) \\)" "az igazságtábla főoszlopa: 0101"]
    ["\\( (((p\\land p)\\land q)\\lor q) \\)" "az igazságtábla főoszlopa: 0101"]
    ["\\( (q\\equiv (q\\lor (p\\supset p))) \\)" "az igazságtábla főoszlopa: 0101"]
    ["\\( (((q\\land p)\\land p)\\lor q) \\)" "az igazságtábla főoszlopa: 0101"]
    ["\\( (q\\lor (q\\equiv (p\\equiv p))) \\)" "az igazságtábla főoszlopa: 0101"]
    ["\\( (((p\\lor q)\\equiv q)\\lor q) \\)" "az igazságtábla főoszlopa: 1101"]
    ["\\( ((q\\land (p\\land q))\\equiv p) \\)" "az igazságtábla főoszlopa: 1101"]
    ["\\( (q\\equiv (q\\lor (p\\lor p))) \\)" "az igazságtábla főoszlopa: 1101"]
    ["\\( (p\\equiv (q\\land (p\\equiv q))) \\)" "az igazságtábla főoszlopa: 1101"]
    ["\\( (p\\supset ((p\\land q)\\land q)) \\)" "az igazságtábla főoszlopa: 1101"]
    ["\\( (p\\land (p\\supset (q\\supset q))) \\)" "az igazságtábla főoszlopa: 0011"]
    ["\\( ((q\\supset (q\\land q))\\land p) \\)" "az igazságtábla főoszlopa: 0011"]
    ["\\( ((p\\land (q\\lor p))\\land p) \\)" "az igazságtábla főoszlopa: 0011"]
    ["\\( (((p\\land p)\\supset p)\\supset p) \\)" "az igazságtábla főoszlopa: 0011"]
    ["\\( (((p\\land p)\\land p)\\lor p) \\)" "az igazságtábla főoszlopa: 0011"]
    ["\\( (q\\supset ((q\\equiv p)\\land q)) \\)" "az igazságtábla főoszlopa: 1011"]
    ["\\( (q\\equiv ((q\\equiv p)\\land p)) \\)" "az igazságtábla főoszlopa: 1011"]
    ["\\( (q\\supset (p\\equiv q)) \\)" "az igazságtábla főoszlopa: 1011"]
    ["\\( ((\\lnot q\\supset q)\\supset p) \\)" "az igazságtábla főoszlopa: 1011"]
    ["\\( ((q\\land q)\\supset (q\\supset p)) \\)" "az igazságtábla főoszlopa: 1011"]
    ["\\( (q\\lor ((p\\equiv p)\\supset p)) \\)" "az igazságtábla főoszlopa: 0111"]
    ["\\( (((p\\equiv p)\\equiv p)\\lor q) \\)" "az igazságtábla főoszlopa: 0111"]
    ["\\( ((\\lnot q\\supset p)\\lor p) \\)" "az igazságtábla főoszlopa: 0111"]
    ["\\( (((p\\equiv q)\\lor q)\\equiv q) \\)" "az igazságtábla főoszlopa: 0111"]
    ["\\( ((p\\supset (p\\equiv q))\\equiv q) \\)" "az igazságtábla főoszlopa: 0111"]
]}]
