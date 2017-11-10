[{:question "Jelölje meg azokat a formulákat, melyeknek a \\( (q\\equiv (q\\supset \\lnot q)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (q\\land \\lnot (p\\lor q)) \\)"
         "\\( (\\lnot (q\\supset q)\\land q) \\)"
         "\\( (q\\land \\lnot (p\\supset q)) \\)"
         "\\( (q\\land (\\lnot p\\equiv p)) \\)"
         "\\( ((p\\land \\lnot q)\\land q) \\)"]

  :wrong [
            ["\\( ((p\\equiv q)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot p\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot (p\\lor (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\land (q\\equiv (q\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((q\\supset q)\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\lor (p\\lor p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\equiv ((p\\supset q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\equiv (p\\lor \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((p\\equiv q)\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset (q\\lor q))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((p\\equiv p)\\land q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot ((q\\supset p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot ((q\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\land (q\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot q\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot (q\\land (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((p\\land q)\\equiv q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\equiv (q\\lor (q\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((p\\land q)\\lor q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset p)\\equiv (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\lor ((p\\equiv q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\lor p)\\lor (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\lor ((q\\equiv q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\supset (p\\lor (q\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\land \\lnot q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot q\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\supset (\\lnot p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\lor q)\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\equiv ((q\\equiv q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset (p\\land p))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((q\\equiv q)\\supset p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (p\\lor ((p\\land p)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\supset p)\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset (p\\land q))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\equiv q)\\lor (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\land \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\land \\lnot (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\lor p)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot q\\land (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\supset \\lnot (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\equiv (p\\lor p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((p\\equiv q)\\land (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((q\\land p)\\supset q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (q\\lor (p\\equiv (q\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( (((p\\land p)\\land p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\land q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\lor p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]
            ["\\( ((q\\supset p)\\lor (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0000 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( \\lnot (p\\lor (q\\land q)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
         "\\( \\lnot (q\\lor (q\\equiv q)) \\)"
         "\\( \\lnot (q\\lor (q\\supset q)) \\)"
         "\\( \\lnot ((q\\land q)\\equiv q) \\)"
         "\\( ((\\lnot p\\land p)\\land q) \\)"
         "\\( \\lnot ((p\\equiv q)\\supset p) \\)"
         "\\( \\lnot (\\lnot q\\supset p) \\)"
         "\\( ((p\\supset q)\\land \\lnot q) \\)"
         "\\( \\lnot ((p\\land p)\\lor q) \\)"
         "\\( \\lnot ((q\\equiv p)\\supset p) \\)"]

  :wrong [
            ["\\( \\lnot ((q\\lor p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (q\\equiv (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot ((q\\equiv p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\land (p\\land (p\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (((p\\equiv p)\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\lor (q\\land (p\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((p\\equiv p)\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((p\\equiv (q\\equiv q))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (\\lnot p\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\lor ((q\\equiv p)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\equiv p)\\lor (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (p\\equiv (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot ((q\\land p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((\\lnot q\\land p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\equiv (q\\land \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot ((p\\supset q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\land (q\\supset p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\equiv (q\\lor (q\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\land q)\\land (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\equiv (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((p\\equiv (p\\supset p))\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\supset ((q\\land q)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\land p)\\equiv (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\equiv (q\\land (q\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (q\\equiv (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (\\lnot (q\\supset q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\supset q)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((\\lnot p\\land q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((p\\land (p\\land p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\equiv p)\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\land (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\equiv ((q\\supset p)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((p\\supset (p\\land q))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((\\lnot q\\supset p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\lor ((q\\equiv p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\equiv ((q\\equiv q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (\\lnot p\\land (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (p\\land (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((\\lnot q\\land p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\lor q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( \\lnot (q\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\supset \\lnot (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\land (p\\lor (p\\equiv q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\equiv ((p\\equiv p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((\\lnot q\\land q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( ((q\\lor q)\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (p\\equiv (p\\lor (q\\equiv q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (q\\supset ((p\\lor q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (\\lnot (p\\land p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]
            ["\\( (((q\\equiv q)\\lor p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1000 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((q\\lor p)\\equiv \\lnot p) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (p\\supset (q\\supset p)) \\)"
         "\\( \\lnot (q\\lor (q\\supset p)) \\)"
         "\\( \\lnot ((p\\lor p)\\equiv p) \\)"
         "\\( \\lnot ((p\\supset q)\\lor p) \\)"
         "\\( \\lnot ((q\\supset q)\\lor p) \\)"
         "\\( (\\lnot (p\\lor p)\\land q) \\)"
         "\\( \\lnot (q\\supset (p\\land p)) \\)"
         "\\( (\\lnot p\\equiv (p\\lor q)) \\)"
         "\\( \\lnot (p\\lor \\lnot q) \\)"
         "\\( \\lnot (q\\supset (p\\equiv q)) \\)"]

  :wrong [
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((p\\supset p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\equiv \\lnot q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((p\\equiv p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\land p)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (p\\land ((q\\equiv p)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\equiv p)\\lor (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\equiv ((q\\land q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\lor p)\\equiv (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\lor q)\\equiv (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\supset p)\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\lor q)\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\supset q)\\supset (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot (p\\land (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (\\lnot q\\land (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\equiv \\lnot (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot (p\\land (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\land q)\\land (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\equiv ((q\\supset q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\land p)\\lor (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\equiv ((p\\lor q)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (p\\equiv (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\supset ((q\\lor p)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\equiv (p\\supset (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\supset ((q\\equiv q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (p\\supset (q\\land \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (\\lnot q\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((q\\land p)\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\land ((p\\land q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\equiv q)\\lor \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((q\\equiv p)\\lor q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((q\\supset p)\\supset q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\supset (p\\equiv q))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (p\\lor (p\\supset (p\\supset p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( \\lnot ((q\\lor q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (q\\supset (q\\equiv \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\equiv (p\\lor p))\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\supset p)\\supset (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((q\\land (q\\supset q))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( ((p\\land p)\\supset (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (p\\land (q\\supset (p\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((p\\lor p)\\equiv q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((q\\lor p)\\lor q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]
            ["\\( (((p\\supset p)\\equiv q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0100 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((q\\equiv p)\\equiv \\lnot q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (p\\supset p) \\)"
         "\\( \\lnot ((p\\equiv p)\\lor q) \\)"
         "\\( \\lnot (q\\supset (q\\lor p)) \\)"
         "\\( (q\\land (p\\land \\lnot p)) \\)"
         "\\( (\\lnot q\\equiv q) \\)"
         "\\( \\lnot ((q\\lor q)\\lor p) \\)"
         "\\( (\\lnot q\\equiv (p\\supset q)) \\)"
         "\\( \\lnot (q\\lor (p\\land p)) \\)"
         "\\( \\lnot ((q\\lor p)\\lor p) \\)"
         "\\( (\\lnot p\\equiv (q\\supset p)) \\)"
         "\\( \\lnot (p\\equiv (q\\lor p)) \\)"
         "\\( ((q\\supset \\lnot p)\\land q) \\)"
         "\\( ((\\lnot q\\equiv p)\\land q) \\)"
         "\\( ((\\lnot p\\equiv q)\\land q) \\)"
         "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
         "\\( (p\\supset (q\\land \\lnot q)) \\)"
         "\\( \\lnot ((q\\lor p)\\land p) \\)"
         "\\( (\\lnot (p\\equiv p)\\equiv p) \\)"
         "\\( (p\\supset \\lnot p) \\)"
         "\\( \\lnot ((p\\supset p)\\supset p) \\)"]

  :wrong [
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\supset (\\lnot p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot ((q\\lor q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\land (p\\equiv (q\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\supset p)\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\supset p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\supset (p\\supset q))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\lor (q\\equiv q))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\supset (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (p\\equiv ((q\\lor q)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (p\\supset ((p\\equiv p)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (\\lnot (q\\lor p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot (q\\land (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot ((p\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot ((p\\land q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\equiv (q\\equiv p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\supset q)\\supset (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\supset (p\\lor q))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\supset q)\\equiv (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((q\\lor p)\\equiv q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((q\\land q)\\lor q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\lor p)\\land (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\equiv p)\\lor (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\land \\lnot q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\equiv (\\lnot q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (p\\supset (q\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\lor q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((p\\supset q)\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\land (q\\lor (p\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((q\\equiv p)\\supset p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\supset (p\\supset p))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\equiv (p\\lor p))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\lor p)\\lor (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (p\\equiv (p\\lor (p\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\land p)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (\\lnot q\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( \\lnot ((q\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\land (p\\lor p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\lor (q\\lor q))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((p\\equiv q)\\supset p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((p\\lor q)\\lor q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((q\\supset (p\\supset p))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (q\\supset ((q\\land p)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( (((p\\lor p)\\supset q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]
            ["\\( ((p\\supset p)\\lor (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1100 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( \\lnot ((p\\equiv q)\\lor q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (q\\land \\lnot q) \\)"
         "\\( (\\lnot p\\equiv (p\\land p)) \\)"
         "\\( \\lnot (q\\supset q) \\)"
         "\\( (p\\equiv \\lnot (p\\land p)) \\)"
         "\\( ((q\\equiv \\lnot q)\\land p) \\)"
         "\\( (p\\equiv \\lnot (p\\land q)) \\)"
         "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
         "\\( (\\lnot (p\\equiv q)\\land p) \\)"
         "\\( (p\\land \\lnot (q\\land p)) \\)"
         "\\( ((p\\lor p)\\land \\lnot q) \\)"]

  :wrong [
            ["\\( \\lnot ((q\\equiv p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\equiv q)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\supset (q\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\lor p)\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((q\\land p)\\lor p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\land (q\\land (q\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((p\\equiv q)\\land p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((q\\land p)\\supset p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((q\\equiv p)\\equiv p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\lor ((q\\lor p)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\land (p\\lor q))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\land \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( \\lnot (q\\supset (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\equiv (p\\equiv \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( \\lnot ((q\\land q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\supset (\\lnot p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\lor (q\\equiv p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\equiv (q\\land (p\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\land ((p\\supset q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\lor (p\\supset (q\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((p\\supset p)\\land p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\land (p\\lor p))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\lor p)\\land (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((q\\lor q)\\supset q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( \\lnot ((q\\supset q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\supset (\\lnot p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\equiv q)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\lor \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\land (q\\land q))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\supset (p\\land p))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\lor p)\\supset (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((p\\land p)\\supset p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\lor q)\\supset (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\lor (p\\lor (p\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\supset ((p\\supset p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( \\lnot (\\lnot q\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot p\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\equiv q)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\supset \\lnot (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (q\\land (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((p\\equiv p)\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\lor \\lnot q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (p\\equiv (p\\land (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (\\lnot (p\\equiv p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( (((p\\supset p)\\equiv q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\lor q)\\lor (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]
            ["\\( ((q\\land (q\\lor q))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0010 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (\\lnot q\\equiv (p\\equiv p)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( ((p\\land \\lnot p)\\land p) \\)"
         "\\( (\\lnot (q\\equiv q)\\land p) \\)"
         "\\( (p\\land (\\lnot p\\land q)) \\)"
         "\\( \\lnot (q\\supset (q\\lor q)) \\)"
         "\\( \\lnot (p\\supset (q\\supset p)) \\)"
         "\\( (\\lnot (q\\supset p)\\equiv p) \\)"
         "\\( \\lnot (p\\lor (q\\lor q)) \\)"
         "\\( \\lnot (p\\lor (q\\lor p)) \\)"
         "\\( \\lnot ((q\\lor p)\\lor p) \\)"
         "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
         "\\( (\\lnot p\\equiv (p\\land q)) \\)"
         "\\( (p\\land (p\\land \\lnot q)) \\)"
         "\\( ((\\lnot q\\land p)\\land p) \\)"
         "\\( (\\lnot (p\\equiv q)\\land p) \\)"
         "\\( (q\\equiv \\lnot (q\\lor p)) \\)"
         "\\( \\lnot ((q\\equiv q)\\supset q) \\)"
         "\\( (\\lnot q\\equiv (q\\equiv q)) \\)"
         "\\( \\lnot ((p\\supset p)\\supset q) \\)"
         "\\( ((q\\land q)\\supset \\lnot q) \\)"
         "\\( ((p\\equiv p)\\supset \\lnot q) \\)"]

  :wrong [
            ["\\( ((q\\land \\lnot p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot ((q\\supset q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (\\lnot (q\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((q\\supset q)\\land (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((q\\lor q)\\lor (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\supset (q\\land (q\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\lor (q\\land (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (q\\supset ((p\\equiv q)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\lor ((q\\supset p)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\equiv p)\\lor (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot (\\lnot p\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot (p\\land (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((q\\lor q)\\lor q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((p\\equiv p)\\equiv p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((q\\equiv q)\\supset q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\supset (\\lnot q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\land ((p\\lor p)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((q\\equiv p)\\supset q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\lor ((q\\land q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\supset ((p\\equiv q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot ((q\\equiv q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot ((p\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\land (p\\supset (q\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot (p\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (q\\equiv (q\\lor (q\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((p\\land p)\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\land (p\\lor p))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((q\\land (p\\lor p))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\equiv (p\\lor (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((p\\land p)\\lor p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot (p\\lor (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( \\lnot ((p\\land q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\lor p)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (q\\land ((p\\land p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((q\\equiv q)\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (((p\\lor q)\\lor q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\supset (\\lnot p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\supset (q\\lor q))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( ((p\\supset q)\\equiv (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (\\lnot (p\\supset q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]
            ["\\( (p\\supset ((p\\equiv q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1010 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (p\\equiv \\lnot q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (\\lnot q\\equiv q) \\)"
         "\\( \\lnot (p\\supset (p\\lor p)) \\)"
         "\\( (p\\equiv \\lnot (p\\land p)) \\)"
         "\\( \\lnot (q\\lor (q\\supset q)) \\)"
         "\\( ((p\\land p)\\land \\lnot p) \\)"
         "\\( \\lnot ((q\\lor p)\\equiv p) \\)"
         "\\( (q\\equiv (q\\supset \\lnot p)) \\)"
         "\\( (\\lnot (q\\land p)\\land q) \\)"
         "\\( \\lnot (q\\supset (p\\land q)) \\)"
         "\\( (q\\land \\lnot (q\\supset p)) \\)"
         "\\( \\lnot (q\\lor (p\\supset q)) \\)"
         "\\( (p\\land \\lnot (q\\land p)) \\)"
         "\\( (\\lnot (p\\land q)\\equiv p) \\)"
         "\\( \\lnot (p\\supset (p\\land q)) \\)"
         "\\( (\\lnot p\\equiv (q\\land p)) \\)"
         "\\( (\\lnot q\\equiv (p\\land p)) \\)"
         "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
         "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
         "\\( (\\lnot (q\\land q)\\equiv p) \\)"
         "\\( (\\lnot q\\equiv p) \\)"]

  :wrong [
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((\\lnot p\\equiv p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((\\lnot p\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\equiv (\\lnot q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\lor q)\\land (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\land (q\\land q))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (((q\\lor p)\\lor p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (((p\\supset q)\\equiv q)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\supset (q\\land q))\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\lor ((q\\lor p)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\equiv p)\\land (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot (\\lnot p\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\equiv (p\\equiv \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\land p)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\land (\\lnot q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (((q\\equiv q)\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\lor (q\\equiv (q\\supset p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\equiv (p\\equiv (p\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\land (q\\supset (p\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\equiv (p\\lor q))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\supset q)\\equiv (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (((p\\supset p)\\land q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((\\lnot p\\equiv q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot ((p\\supset p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\supset (\\lnot p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\land ((q\\supset q)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\equiv ((q\\equiv q)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\supset (p\\lor q))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\lor (p\\equiv q))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\supset (q\\lor p))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\lor (p\\equiv (q\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\lor (p\\land p))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\land q)\\supset (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (\\lnot (q\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot (q\\land (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( \\lnot (p\\land (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\land (p\\lor (q\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((p\\equiv q)\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\land (p\\supset (p\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( ((q\\land (q\\equiv p))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\lor (p\\land (p\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\supset (q\\equiv (q\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (q\\lor (q\\equiv (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]
            ["\\( (p\\supset ((q\\lor p)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0110 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (q\\supset (q\\equiv \\lnot p)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (p\\supset p) \\)"
         "\\( ((p\\supset \\lnot p)\\equiv p) \\)"
         "\\( (p\\land \\lnot (q\\supset q)) \\)"
         "\\( \\lnot (p\\lor (p\\equiv p)) \\)"
         "\\( (q\\land (p\\equiv \\lnot p)) \\)"
         "\\( \\lnot ((p\\land p)\\lor q) \\)"
         "\\( \\lnot ((p\\lor p)\\lor q) \\)"
         "\\( ((p\\equiv q)\\land \\lnot p) \\)"
         "\\( \\lnot ((q\\land q)\\lor p) \\)"
         "\\( (\\lnot q\\equiv (p\\supset q)) \\)"
         "\\( (\\lnot (p\\equiv q)\\land q) \\)"
         "\\( \\lnot ((q\\equiv p)\\lor p) \\)"
         "\\( ((p\\supset \\lnot q)\\land q) \\)"
         "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
         "\\( ((p\\supset \\lnot q)\\land q) \\)"
         "\\( (p\\equiv (\\lnot p\\equiv p)) \\)"
         "\\( \\lnot ((q\\equiv q)\\land p) \\)"
         "\\( (\\lnot p\\equiv (p\\equiv p)) \\)"
         "\\( \\lnot (p\\land (p\\lor p)) \\)"
         "\\( ((p\\equiv \\lnot q)\\equiv q) \\)"
         "\\( \\lnot (q\\equiv (q\\lor p)) \\)"
         "\\( (\\lnot q\\land (p\\land p)) \\)"
         "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
         "\\( (\\lnot q\\equiv (p\\lor q)) \\)"
         "\\( ((p\\equiv \\lnot q)\\land p) \\)"
         "\\( \\lnot ((p\\land q)\\lor q) \\)"
         "\\( (q\\supset \\lnot (q\\lor p)) \\)"
         "\\( (\\lnot q\\equiv (p\\supset p)) \\)"
         "\\( \\lnot ((q\\land q)\\lor q) \\)"
         "\\( (\\lnot q\\land (q\\equiv q)) \\)"
         "\\( (q\\equiv \\lnot p) \\)"
         "\\( (\\lnot (q\\land q)\\equiv p) \\)"
         "\\( (\\lnot p\\equiv q) \\)"
         "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
         "\\( \\lnot (p\\equiv q) \\)"
         "\\( (p\\supset \\lnot (q\\land q)) \\)"
         "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
         "\\( \\lnot ((p\\land q)\\land q) \\)"
         "\\( \\lnot ((q\\land q)\\land p) \\)"
         "\\( \\lnot ((p\\land p)\\land q) \\)"]

  :wrong [
            ["\\( ((p\\equiv (p\\supset p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\equiv ((p\\lor p)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (((q\\land q)\\land q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\supset ((p\\equiv p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\land ((p\\equiv q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\lor (p\\land p))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\lor (q\\equiv (p\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\supset (p\\land p))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\land ((p\\land q)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (((p\\supset p)\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (((p\\equiv q)\\lor q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\land ((p\\supset p)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\supset p)\\lor \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((p\\supset q)\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\supset ((q\\equiv q)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\equiv ((p\\land q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (((q\\land q)\\lor q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\equiv q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\supset ((p\\lor q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((p\\lor p)\\land (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (p\\equiv ((q\\land q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\equiv ((q\\lor p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\equiv (q\\equiv q))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\land ((p\\lor q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (((p\\equiv p)\\lor p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\equiv ((q\\equiv p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((q\\lor (q\\equiv q))\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( (q\\supset (p\\land (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((\\lnot p\\supset q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]
            ["\\( ((p\\supset q)\\lor (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1110 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( \\lnot \\lnot (p\\land q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (q\\land \\lnot (q\\equiv q)) \\)"
         "\\( \\lnot ((q\\supset q)\\lor p) \\)"
         "\\( (\\lnot (q\\equiv q)\\land p) \\)"
         "\\( \\lnot (q\\supset (q\\lor q)) \\)"
         "\\( \\lnot ((p\\land q)\\supset q) \\)"
         "\\( ((p\\land q)\\land (p\\supset q)) \\)"
         "\\( (q\\land (p\\land (p\\lor p))) \\)"
         "\\( (((q\\lor q)\\land p)\\land p) \\)"
         "\\( ((q\\lor p)\\equiv (p\\equiv q)) \\)"
         "\\( (((q\\lor p)\\equiv p)\\equiv q) \\)"]

  :wrong [
            ["\\( (\\lnot p\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (\\lnot (p\\land q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\equiv (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\land \\lnot (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (\\lnot (p\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\land (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\equiv q)\\lor (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\lor (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\land (q\\supset q))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (((q\\land p)\\supset q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\supset ((p\\supset q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((\\lnot p\\supset q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (\\lnot p\\lor (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\equiv p)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\equiv q)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot ((q\\land p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\land p)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (((p\\supset p)\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (((q\\supset p)\\lor q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (((p\\equiv q)\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\land (q\\supset p))\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((p\\lor q)\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\lor ((p\\supset q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\lor q)\\equiv (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\equiv \\lnot (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\equiv \\lnot (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\supset (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot ((q\\supset q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\land (p\\supset (q\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\equiv ((p\\supset q)\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\lor (p\\land (q\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\lor q)\\supset (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (((q\\lor p)\\lor p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\supset ((p\\supset q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((\\lnot p\\equiv q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( \\lnot (p\\land (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\land \\lnot (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\land \\lnot q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((\\lnot p\\land q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\equiv p)\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( ((q\\equiv q)\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\supset ((p\\lor p)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\land (p\\land (q\\equiv q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\supset (q\\land (q\\supset p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (p\\lor (q\\land (p\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]
            ["\\( (q\\equiv ((p\\supset q)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0001 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (((p\\lor q)\\land p)\\equiv q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (q\\equiv (q\\land q)) \\)"
         "\\( ((\\lnot p\\land q)\\land p) \\)"
         "\\( \\lnot ((p\\land q)\\supset p) \\)"
         "\\( \\lnot (q\\supset (p\\supset p)) \\)"
         "\\( (\\lnot (q\\land q)\\equiv q) \\)"
         "\\( \\lnot ((q\\land q)\\lor p) \\)"
         "\\( (\\lnot p\\land (q\\supset p)) \\)"
         "\\( \\lnot ((q\\equiv p)\\supset q) \\)"
         "\\( \\lnot ((p\\equiv q)\\supset q) \\)"
         "\\( \\lnot (\\lnot p\\supset q) \\)"
         "\\( (((q\\lor p)\\equiv p)\\equiv q) \\)"
         "\\( (q\\equiv ((q\\lor q)\\supset p)) \\)"
         "\\( (((p\\supset p)\\equiv p)\\land q) \\)"
         "\\( ((p\\supset (p\\supset q))\\equiv p) \\)"
         "\\( (((p\\land q)\\lor q)\\land p) \\)"
         "\\( (q\\equiv \\lnot \\lnot p) \\)"
         "\\( ((q\\equiv p)\\equiv (q\\equiv q)) \\)"
         "\\( ((p\\supset p)\\supset (q\\equiv p)) \\)"
         "\\( (p\\equiv ((p\\equiv p)\\equiv q)) \\)"
         "\\( ((q\\lor p)\\supset (p\\equiv q)) \\)"]

  :wrong [
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot ((p\\lor p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv \\lnot (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (q\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot (q\\land (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (q\\lor (q\\land (p\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\supset q)\\land (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\lor (q\\supset q))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (q\\equiv (p\\land (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv ((p\\land q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\supset (\\lnot p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot (p\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot ((p\\supset q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\supset (p\\equiv p))\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\equiv (q\\lor p))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv (p\\equiv (p\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\equiv \\lnot q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv (p\\lor (q\\supset p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\equiv q)\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (q\\land \\lnot (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot \\lnot \\lnot p \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot (q\\lor (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot ((q\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\land q)\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (((q\\equiv p)\\lor q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\equiv q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\equiv (p\\land p))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\lor (p\\equiv \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (q\\supset ((q\\lor p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\equiv \\lnot (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((p\\supset p)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (\\lnot q\\equiv (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\land p)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\land (q\\equiv p))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\lor (p\\land p))\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\lor (p\\land (q\\lor q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( ((q\\land p)\\lor (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (((q\\lor q)\\lor p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]
            ["\\( (p\\supset ((p\\supset q)\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1001 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((q\\land (p\\lor q))\\lor q) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (p\\land (p\\supset \\lnot p)) \\)"
         "\\( \\lnot (q\\equiv q) \\)"
         "\\( (\\lnot p\\land (q\\land p)) \\)"
         "\\( (\\lnot q\\equiv (q\\land q)) \\)"
         "\\( (\\lnot (p\\supset p)\\land p) \\)"
         "\\( (q\\land (p\\supset \\lnot p)) \\)"
         "\\( \\lnot (q\\supset (p\\land p)) \\)"
         "\\( (\\lnot p\\land (p\\lor q)) \\)"
         "\\( (q\\land (p\\supset \\lnot p)) \\)"
         "\\( ((p\\supset \\lnot q)\\land q) \\)"
         "\\( ((q\\lor (q\\lor q))\\land p) \\)"
         "\\( (((q\\lor p)\\equiv q)\\equiv p) \\)"
         "\\( (q\\land (p\\land (p\\land q))) \\)"
         "\\( ((p\\supset p)\\land (q\\land p)) \\)"
         "\\( ((p\\supset (q\\equiv p))\\land p) \\)"
         "\\( (q\\equiv ((q\\land q)\\equiv q)) \\)"
         "\\( (((q\\equiv p)\\lor q)\\land q) \\)"
         "\\( ((p\\supset (q\\supset p))\\equiv q) \\)"
         "\\( (((q\\equiv q)\\lor q)\\land q) \\)"
         "\\( (((q\\supset q)\\lor q)\\equiv q) \\)"]

  :wrong [
            ["\\( \\lnot (q\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\equiv (\\lnot q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (q\\equiv (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\supset \\lnot (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\equiv q)\\land (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\equiv ((p\\equiv q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((\\lnot p\\lor q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\land (p\\equiv q))\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\lor (p\\lor (p\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\supset (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\supset \\lnot (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\lor q)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\equiv \\lnot (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\supset q)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\equiv ((p\\land q)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\land p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (((p\\lor p)\\supset p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((\\lnot p\\supset q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\lor q)\\lor (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (((q\\land p)\\equiv p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\equiv p)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\supset \\lnot (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (p\\supset (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot ((p\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot ((p\\equiv q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\land p)\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\supset ((p\\lor p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot \\lnot p \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\lor q)\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\supset p)\\equiv (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\equiv p)\\supset (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (p\\equiv (p\\equiv \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\supset \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\equiv (p\\land \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( \\lnot ((p\\land p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\supset (p\\equiv \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\equiv (q\\supset q))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (((q\\supset q)\\supset p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((q\\supset (q\\lor p))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( ((p\\supset q)\\equiv (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\lor ((p\\lor p)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]
            ["\\( (q\\supset ((q\\lor q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0101 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (q\\lor ((p\\land p)\\supset q)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (q\\equiv (q\\land q)) \\)"
         "\\( (q\\land (\\lnot q\\land q)) \\)"
         "\\( (\\lnot p\\equiv (p\\lor p)) \\)"
         "\\( (\\lnot (p\\lor p)\\equiv p) \\)"
         "\\( (\\lnot p\\land (p\\land p)) \\)"
         "\\( \\lnot ((q\\supset p)\\equiv p) \\)"
         "\\( \\lnot (p\\lor (q\\lor q)) \\)"
         "\\( (p\\equiv (\\lnot p\\land q)) \\)"
         "\\( \\lnot (q\\lor p) \\)"
         "\\( \\lnot ((q\\lor p)\\lor q) \\)"
         "\\( (\\lnot (p\\lor p)\\land q) \\)"
         "\\( \\lnot (q\\equiv (p\\land q)) \\)"
         "\\( (q\\equiv (p\\supset \\lnot q)) \\)"
         "\\( (q\\land (\\lnot q\\equiv p)) \\)"
         "\\( (q\\equiv (p\\supset \\lnot q)) \\)"
         "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
         "\\( (p\\equiv (p\\land \\lnot p)) \\)"
         "\\( ((q\\land \\lnot q)\\equiv p) \\)"
         "\\( ((p\\supset q)\\land \\lnot p) \\)"
         "\\( \\lnot (p\\lor (p\\land q)) \\)"
         "\\( ((p\\equiv (p\\lor q))\\land q) \\)"
         "\\( ((q\\land p)\\land q) \\)"
         "\\( (q\\equiv (p\\lor (p\\equiv q))) \\)"
         "\\( \\lnot \\lnot (p\\land q) \\)"
         "\\( (q\\land ((p\\land q)\\land q)) \\)"
         "\\( ((q\\supset p)\\equiv (p\\supset q)) \\)"
         "\\( ((q\\equiv q)\\equiv (p\\equiv q)) \\)"
         "\\( (p\\equiv ((q\\lor q)\\land q)) \\)"
         "\\( (q\\equiv (p\\equiv (p\\supset p))) \\)"
         "\\( (\\lnot \\lnot p\\equiv q) \\)"
         "\\( ((p\\supset q)\\land (q\\lor q)) \\)"
         "\\( ((p\\land q)\\lor (q\\land q)) \\)"
         "\\( ((q\\supset (q\\land q))\\land q) \\)"
         "\\( (((q\\equiv p)\\lor p)\\supset q) \\)"
         "\\( (q\\land ((q\\lor q)\\lor p)) \\)"
         "\\( (((p\\lor q)\\lor q)\\supset q) \\)"
         "\\( (p\\supset ((p\\lor q)\\supset q)) \\)"
         "\\( (((q\\supset q)\\supset p)\\supset q) \\)"
         "\\( (((p\\lor p)\\lor q)\\supset q) \\)"
         "\\( (p\\supset ((p\\equiv q)\\land p)) \\)"]

  :wrong [
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( \\lnot ((p\\equiv p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\land q)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (((p\\equiv p)\\lor q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (q\\supset (p\\land (p\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\supset p)\\equiv (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\supset (q\\lor p))\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( \\lnot (q\\land (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\supset (p\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\land (p\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (((q\\equiv p)\\supset q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\lor p)\\equiv (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (q\\supset ((q\\equiv q)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\supset \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\equiv q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\lor q)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\supset (q\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\land (q\\supset (p\\land q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\supset p)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\land (p\\lor p))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\lor (p\\lor p))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\land \\lnot (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((q\\supset q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( \\lnot (q\\land (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( (p\\land (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\lor (q\\land q))\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((\\lnot q\\supset p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]
            ["\\( ((p\\land p)\\supset (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1101 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((p\\lor (q\\equiv p))\\land p) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( ((\\lnot q\\equiv q)\\land p) \\)"
         "\\( (p\\land (q\\equiv \\lnot q)) \\)"
         "\\( \\lnot (q\\supset (q\\equiv q)) \\)"
         "\\( (\\lnot q\\land (q\\land q)) \\)"
         "\\( (q\\land (q\\supset \\lnot q)) \\)"
         "\\( \\lnot ((p\\lor p)\\supset q) \\)"
         "\\( \\lnot (q\\equiv (p\\lor q)) \\)"
         "\\( (p\\land \\lnot (p\\supset q)) \\)"
         "\\( \\lnot (p\\supset (q\\land q)) \\)"
         "\\( \\lnot (q\\lor (p\\equiv q)) \\)"
         "\\( (p\\land ((p\\lor p)\\supset q)) \\)"
         "\\( ((p\\land p)\\land (p\\supset q)) \\)"
         "\\( (q\\land ((p\\lor p)\\equiv q)) \\)"
         "\\( (p\\land ((p\\equiv q)\\land p)) \\)"
         "\\( ((q\\land p)\\land (q\\equiv p)) \\)"
         "\\( (((q\\land p)\\supset p)\\land p) \\)"
         "\\( (((q\\supset q)\\lor q)\\land p) \\)"
         "\\( ((q\\supset (q\\land p))\\land p) \\)"
         "\\( (p\\lor ((p\\land q)\\land q)) \\)"
         "\\( (p\\equiv (p\\supset p)) \\)"]

  :wrong [
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\lor q)\\equiv \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot p \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\supset p)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot ((q\\land p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\equiv p)\\equiv (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\lor ((q\\land q)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (p\\supset ((p\\land p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot q\\lor (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\lor ((q\\supset p)\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot (p\\equiv p)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\land \\lnot p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot (p\\lor (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (p\\equiv (\\lnot p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (p\\supset (p\\supset \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\supset p)\\supset (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\land ((p\\lor q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (((p\\supset q)\\supset q)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\supset ((p\\equiv q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (((q\\land q)\\equiv p)\\supset q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot \\lnot q\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\land q)\\land \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot ((q\\equiv p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot q\\equiv (q\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (p\\supset (\\lnot p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (((p\\lor q)\\land q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\land ((p\\lor q)\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot p\\lor (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\supset (p\\land (q\\land p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\equiv (q\\lor \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\supset (q\\land (q\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( \\lnot (p\\lor (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\equiv q)\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (\\lnot p\\equiv (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\land q)\\supset \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\equiv p)\\supset (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\land (q\\lor (p\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((p\\supset p)\\equiv (p\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( ((q\\land p)\\lor (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (q\\equiv ((q\\lor p)\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]
            ["\\( (p\\lor ((p\\land q)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0011 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((q\\land (p\\lor q))\\supset p) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( \\lnot (p\\lor \\lnot p) \\)"
         "\\( (q\\land (p\\land \\lnot q)) \\)"
         "\\( ((q\\equiv \\lnot q)\\land q) \\)"
         "\\( \\lnot ((q\\land q)\\equiv q) \\)"
         "\\( (\\lnot (p\\lor q)\\land p) \\)"
         "\\( \\lnot ((q\\lor q)\\lor p) \\)"
         "\\( ((p\\supset q)\\land \\lnot q) \\)"
         "\\( ((p\\equiv q)\\land \\lnot q) \\)"
         "\\( ((\\lnot q\\land p)\\equiv q) \\)"
         "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
         "\\( (p\\land (q\\supset \\lnot p)) \\)"
         "\\( (\\lnot (q\\land p)\\land p) \\)"
         "\\( (p\\land (q\\supset \\lnot p)) \\)"
         "\\( (\\lnot q\\land (p\\lor q)) \\)"
         "\\( ((q\\land p)\\equiv \\lnot p) \\)"
         "\\( \\lnot ((q\\equiv q)\\land q) \\)"
         "\\( \\lnot ((q\\supset p)\\supset q) \\)"
         "\\( (q\\equiv (\\lnot q\\equiv q)) \\)"
         "\\( (q\\supset (p\\land \\lnot q)) \\)"
         "\\( (q\\equiv \\lnot (q\\equiv q)) \\)"
         "\\( (q\\equiv (p\\equiv (p\\lor q))) \\)"
         "\\( (q\\land ((p\\supset p)\\equiv p)) \\)"
         "\\( ((p\\lor \\lnot q)\\equiv q) \\)"
         "\\( ((q\\land q)\\land (p\\lor p)) \\)"
         "\\( (p\\land (q\\lor (q\\equiv p))) \\)"
         "\\( ((q\\lor q)\\equiv (p\\lor p)) \\)"
         "\\( ((p\\equiv q)\\land (q\\equiv p)) \\)"
         "\\( (p\\equiv (\\lnot q\\supset q)) \\)"
         "\\( ((p\\land (q\\supset q))\\equiv q) \\)"
         "\\( (((p\\equiv p)\\supset p)\\equiv q) \\)"
         "\\( (p\\equiv ((q\\supset q)\\lor p)) \\)"
         "\\( (((p\\equiv q)\\supset p)\\land p) \\)"
         "\\( ((p\\supset (q\\lor p))\\land p) \\)"
         "\\( (p\\lor ((p\\land p)\\land p)) \\)"
         "\\( (p\\land (p\\supset (p\\lor p))) \\)"
         "\\( (((q\\lor p)\\equiv p)\\lor p) \\)"
         "\\( (q\\equiv (p\\land (q\\land p))) \\)"
         "\\( (q\\supset (p\\land (q\\land p))) \\)"
         "\\( ((p\\supset q)\\supset (p\\equiv q)) \\)"
         "\\( ((p\\equiv p)\\land (q\\supset p)) \\)"]

  :wrong [
            ["\\( \\lnot (p\\lor (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\equiv (p\\equiv \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( \\lnot (q\\land (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((q\\land q)\\lor (q\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\supset (q\\equiv (p\\lor p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (((q\\supset q)\\equiv p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv (p\\equiv (q\\supset q))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\equiv (q\\supset \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\supset \\lnot (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\land (q\\lor (p\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\lor (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((q\\supset (p\\lor p))\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((p\\equiv (q\\lor p))\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (\\lnot (p\\land q)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( \\lnot ((q\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\supset (q\\supset \\lnot p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((q\\land q)\\land (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (q\\lor ((q\\lor q)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv ((p\\lor q)\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\supset ((p\\supset p)\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv \\lnot (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((p\\land \\lnot p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 0110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((q\\land \\lnot p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( ((q\\lor q)\\lor (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 0101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv (p\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (((p\\land q)\\lor q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 0111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]
            ["\\( (p\\equiv (\\lnot p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 1011 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( ((p\\supset q)\\equiv (q\\lor q)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( ((q\\supset \\lnot q)\\land q) \\)"
         "\\( (q\\land \\lnot (p\\lor q)) \\)"
         "\\( (p\\land (\\lnot p\\land p)) \\)"
         "\\( (\\lnot (q\\supset q)\\land q) \\)"
         "\\( (\\lnot p\\land (p\\land p)) \\)"
         "\\( (\\lnot p\\land (q\\land q)) \\)"
         "\\( ((p\\equiv \\lnot q)\\land q) \\)"
         "\\( ((q\\supset \\lnot p)\\land q) \\)"
         "\\( (\\lnot q\\equiv (q\\land p)) \\)"
         "\\( (q\\equiv (q\\supset \\lnot p)) \\)"
         "\\( \\lnot (p\\supset (q\\land q)) \\)"
         "\\( (p\\land \\lnot (q\\lor q)) \\)"
         "\\( \\lnot (p\\equiv (p\\land q)) \\)"
         "\\( (p\\equiv \\lnot (p\\land q)) \\)"
         "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
         "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
         "\\( \\lnot (p\\equiv q) \\)"
         "\\( (q\\equiv \\lnot (p\\land p)) \\)"
         "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
         "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
         "\\( (p\\land (q\\lor (p\\land q))) \\)"
         "\\( (q\\land ((p\\land q)\\equiv q)) \\)"
         "\\( ((p\\equiv (q\\equiv p))\\land p) \\)"
         "\\( (p\\land ((p\\equiv q)\\equiv p)) \\)"
         "\\( ((q\\lor (q\\lor q))\\land p) \\)"
         "\\( (q\\lor \\lnot (p\\supset p)) \\)"
         "\\( ((q\\lor q)\\land q) \\)"
         "\\( ((p\\lor (q\\equiv q))\\supset q) \\)"
         "\\( (q\\land (p\\supset (q\\supset p))) \\)"
         "\\( (q\\land ((q\\lor q)\\equiv q)) \\)"
         "\\( ((p\\lor (p\\land q))\\land p) \\)"
         "\\( ((q\\land q)\\equiv (p\\equiv q)) \\)"
         "\\( (p\\lor ((p\\supset p)\\land p)) \\)"
         "\\( ((q\\land p)\\lor (p\\land p)) \\)"
         "\\( (p\\land ((p\\equiv q)\\supset q)) \\)"
         "\\( ((q\\equiv q)\\supset (p\\lor q)) \\)"
         "\\( ((q\\supset p)\\supset (p\\land p)) \\)"
         "\\( (q\\lor (p\\land (q\\supset p))) \\)"
         "\\( \\lnot \\lnot (p\\lor q) \\)"
         "\\( (p\\lor (q\\land \\lnot p)) \\)"]

  :wrong [
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot ((p\\supset p)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\supset p)\\land \\lnot q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot (q\\land (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((q\\supset q)\\equiv (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (((p\\land p)\\equiv q)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (q\\supset ((p\\land q)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\lor q)\\lor (q\\supset q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot (q\\lor (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot (p\\land (q\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (q\\equiv (q\\land \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (p\\supset (p\\land \\lnot q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\land q)\\lor (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((q\\supset p)\\equiv (q\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((\\lnot q\\supset q)\\supset p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((q\\supset p)\\lor (q\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot ((q\\land q)\\lor p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot ((p\\supset p)\\land q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( \\lnot ((p\\land q)\\land p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (q\\equiv (q\\equiv (q\\equiv p))) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\land p)\\supset (q\\lor q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\equiv q)\\lor (p\\land p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (((p\\supset p)\\lor p)\\lor q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (\\lnot p\\equiv (q\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1000, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (\\lnot (q\\equiv q)\\equiv p) \\)" "a hipotézis igazságtáblájának főoszlopa: 1100, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (\\lnot (p\\supset p)\\equiv q) \\)" "a hipotézis igazságtáblájának főoszlopa: 1010, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (p\\supset \\lnot (p\\equiv q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1110, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((q\\equiv p)\\land (p\\supset p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1001, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( (p\\equiv ((q\\land p)\\land q)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1101, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\lor q)\\supset (p\\lor p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1011, míg a konklúzió igazságtáblájának főoszlopa 0111 "]
            ["\\( ((p\\supset q)\\lor (p\\equiv p)) \\)" "a hipotézis igazságtáblájának főoszlopa: 1111, míg a konklúzió igazságtáblájának főoszlopa 0111 "]]}

 {:question "Jelölje meg azokat a formulákat, melyeknek a \\( (p\\supset ((p\\equiv p)\\lor p)) \\) formula logikai következménye! (Külön-külön)"
  :good [
         "\\( (\\lnot p\\equiv (p\\lor p)) \\)"
         "\\( ((q\\land p)\\land \\lnot q) \\)"
         "\\( (q\\equiv (q\\supset \\lnot q)) \\)"
         "\\( ((p\\supset \\lnot p)\\land p) \\)"
         "\\( ((\\lnot p\\land p)\\land p) \\)"
         "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
         "\\( (p\\equiv \\lnot (q\\supset p)) \\)"
         "\\( (\\lnot (p\\supset q)\\equiv q) \\)"
         "\\( ((q\\land \\lnot p)\\equiv p) \\)"
         "\\( (p\\equiv (\\lnot p\\land q)) \\)"
         "\\( (\\lnot p\\equiv (p\\lor q)) \\)"
         "\\( \\lnot (p\\lor (q\\equiv p)) \\)"
         "\\( \\lnot (q\\supset (p\\land q)) \\)"
         "\\( \\lnot (q\\supset (q\\land p)) \\)"
         "\\( ((q\\land p)\\equiv \\lnot q) \\)"
         "\\( (p\\equiv (\\lnot p\\equiv p)) \\)"
         "\\( (p\\supset \\lnot (p\\supset p)) \\)"
         "\\( (\\lnot (p\\supset p)\\equiv p) \\)"
         "\\( (\\lnot p\\lor \\lnot p) \\)"
         "\\( \\lnot ((p\\lor p)\\land p) \\)"
         "\\( (p\\land \\lnot (p\\equiv q)) \\)"
         "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
         "\\( (p\\equiv (p\\supset \\lnot q)) \\)"
         "\\( \\lnot (p\\supset (q\\land p)) \\)"
         "\\( (\\lnot q\\land (q\\lor p)) \\)"
         "\\( ((q\\equiv \\lnot q)\\equiv q) \\)"
         "\\( (\\lnot q\\equiv (p\\supset p)) \\)"
         "\\( (q\\supset \\lnot q) \\)"
         "\\( \\lnot ((q\\land p)\\lor q) \\)"
         "\\( (p\\equiv (q\\equiv \\lnot p)) \\)"
         "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
         "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
         "\\( (q\\equiv \\lnot (p\\land p)) \\)"
         "\\( (p\\equiv \\lnot (q\\land q)) \\)"
         "\\( (\\lnot p\\equiv (q\\land q)) \\)"
         "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
         "\\( ((q\\land p)\\supset \\lnot q) \\)"
         "\\( ((q\\land \\lnot p)\\equiv q) \\)"
         "\\( \\lnot ((q\\land q)\\land p) \\)"
         "\\( (q\\supset (q\\supset \\lnot p)) \\)"
         "\\( ((p\\equiv p)\\supset (p\\land q)) \\)"
         "\\( (p\\land ((p\\equiv p)\\equiv q)) \\)"
         "\\( (((p\\land p)\\supset q)\\land p) \\)"
         "\\( ((q\\land p)\\land (q\\land q)) \\)"
         "\\( ((p\\land q)\\land (q\\equiv p)) \\)"
         "\\( ((q\\land p)\\lor (q\\equiv p)) \\)"
         "\\( ((q\\land p)\\lor (q\\equiv p)) \\)"
         "\\( ((q\\equiv (q\\equiv q))\\equiv p) \\)"
         "\\( ((q\\equiv p)\\land (q\\equiv p)) \\)"
         "\\( ((q\\equiv p)\\land (p\\equiv q)) \\)"
         "\\( ((q\\lor q)\\lor (q\\land p)) \\)"
         "\\( (((p\\land q)\\lor q)\\lor q) \\)"
         "\\( ((q\\lor p)\\equiv (p\\supset q)) \\)"
         "\\( (q\\land (p\\lor q)) \\)"
         "\\( (q\\lor (q\\land (p\\lor p))) \\)"
         "\\( ((q\\equiv p)\\lor (q\\land q)) \\)"
         "\\( (\\lnot p\\lor (q\\land p)) \\)"
         "\\( (((q\\supset p)\\supset p)\\equiv q) \\)"
         "\\( ((p\\lor p)\\supset q) \\)"
         "\\( (((p\\supset q)\\lor q)\\lor q) \\)"
         "\\( (\\lnot (p\\equiv p)\\lor p) \\)"
         "\\( (((q\\equiv q)\\lor q)\\land p) \\)"
         "\\( ((q\\equiv q)\\equiv p) \\)"
         "\\( (((q\\supset p)\\equiv q)\\lor p) \\)"
         "\\( (p\\lor (p\\land p)) \\)"
         "\\( ((p\\lor (q\\land q))\\equiv p) \\)"
         "\\( ((p\\lor q)\\equiv (p\\land p)) \\)"
         "\\( (q\\equiv ((p\\supset q)\\land p)) \\)"
         "\\( ((q\\equiv p)\\lor (q\\supset p)) \\)"
         "\\( ((p\\lor \\lnot q)\\lor p) \\)"
         "\\( ((p\\land q)\\lor (q\\lor p)) \\)"
         "\\( (q\\equiv ((q\\lor p)\\equiv q)) \\)"
         "\\( (p\\lor (\\lnot q\\supset q)) \\)"
         "\\( (p\\equiv (q\\supset (q\\supset p))) \\)"
         "\\( ((q\\supset (p\\land q))\\equiv p) \\)"
         "\\( (p\\equiv (p\\land (p\\lor q))) \\)"
         "\\( ((q\\lor (q\\supset p))\\lor p) \\)"
         "\\( (p\\lor ((p\\supset q)\\lor p)) \\)"
         "\\( (((p\\land p)\\lor p)\\equiv p) \\)"
         "\\( (p\\lor ((p\\land q)\\supset p)) \\)"]
  :wrong []}]
