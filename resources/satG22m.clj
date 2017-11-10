[{:question "Jelölje meg a kielégíthetető formulahalmazokat!"
  :good [
         "\\( \\{\\lnot ((q\\lor p)\\lor q),\\ \\lnot p\\land q\\equiv p\\} \\)"
         "\\( \\{\\lnot q\\land (p\\equiv q),\\ \\lnot p\\equiv p\\equiv p\\} \\)"
         "\\( \\{\\lnot (p\\lor q\\lor q),\\ q\\supset \\lnot p\\land p\\} \\)"
         "\\( \\{\\lnot (p\\supset q)\\equiv q,\\ \\lnot (p\\land (p\\supset q))\\} \\)"
         "\\( \\{\\lnot p\\land \\lnot q,\\ (q\\equiv q)\\land p\\equiv q\\} \\)"
         "\\( \\{\\lnot (p\\land p\\lor q),\\ (p\\land q\\equiv p)\\lor q\\} \\)"
         "\\( \\{\\lnot (q\\equiv p\\supset q),\\ q\\lor p\\equiv p\\land p\\} \\)"
         "\\( \\{\\lnot (p\\lor q),\\ (q\\equiv q)\\land p\\equiv p\\} \\)"
         "\\( \\{\\lnot (p\\land q\\equiv q),\\ \\lnot (p\\lor (q\\equiv p))\\} \\)"
         "\\( \\{\\lnot (q\\equiv q\\land p),\\ p\\equiv q\\equiv \\lnot q\\} \\)"
         "\\( \\{(q\\supset \\lnot p)\\land q,\\ p\\lor p\\equiv \\lnot q\\} \\)"
         "\\( \\{\\lnot (q\\lor p\\supset p),\\ q\\supset \\lnot p\\land q\\} \\)"
         "\\( \\{\\lnot (q\\lor p\\equiv p),\\ q\\lor ((q\\equiv p)\\equiv p)\\} \\)"
         "\\( \\{\\lnot (\\lnot q\\lor p),\\ ((q\\equiv p)\\supset p)\\supset q\\} \\)"
         "\\( \\{\\lnot (q\\land p)\\equiv q,\\ q\\equiv p\\lor q\\supset q\\} \\)"
         "\\( \\{q\\land \\lnot (q\\supset p),\\ (q\\supset p)\\lor (p\\supset q)\\} \\)"
         "\\( \\{\\lnot (q\\land p\\lor p),\\ \\lnot q\\land (p\\supset q)\\} \\)"
         "\\( \\{\\lnot q\\equiv q\\equiv p,\\ q\\equiv p\\supset \\lnot q\\} \\)"
         "\\( \\{\\lnot p\\land p\\equiv p,\\ \\lnot ((p\\supset p)\\supset p)\\} \\)"
         "\\( \\{p\\supset (\\lnot p\\equiv p),\\ \\lnot ((q\\lor p)\\land q)\\} \\)"
         "\\( \\{\\lnot ((p\\equiv p)\\supset p),\\ \\lnot (q\\lor q)\\equiv p\\} \\)"
         "\\( \\{\\lnot ((q\\equiv p)\\equiv q),\\ \\lnot q\\equiv q\\supset p\\} \\)"
         "\\( \\{\\lnot (p\\lor p\\land p),\\ q\\equiv p\\land (p\\supset p)\\} \\)"
         "\\( \\{\\lnot ((p\\supset q)\\supset p),\\ (p\\land p\\equiv q)\\equiv p\\} \\)"
         "\\( \\{(p\\supset p)\\land \\lnot p,\\ p\\equiv p\\land q\\land q\\} \\)"
         "\\( \\{\\lnot p\\land (q\\equiv q),\\ p\\lor \\lnot (q\\lor p)\\} \\)"
         "\\( \\{p\\lor q\\supset \\lnot p,\\ (q\\supset p)\\lor p\\equiv p\\} \\)"
         "\\( \\{\\lnot p\\equiv q\\equiv q,\\ \\lnot \\lnot (q\\equiv q)\\} \\)"
         "\\( \\{\\lnot (p\\lor p\\supset q),\\ q\\land p\\equiv \\lnot p\\} \\)"
         "\\( \\{(\\lnot q\\equiv p)\\land p,\\ q\\supset p\\land \\lnot q\\} \\)"
         "\\( \\{p\\land \\lnot q\\land p,\\ \\lnot (p\\land p)\\equiv q\\} \\)"
         "\\( \\{\\lnot ((q\\equiv p)\\lor q),\\ q\\supset \\lnot (q\\supset p)\\} \\)"
         "\\( \\{(q\\supset \\lnot p)\\land p,\\ p\\equiv p\\lor (q\\supset q)\\} \\)"
         "\\( \\{p\\lor q\\equiv \\lnot q,\\ \\lnot p\\supset q\\equiv p\\} \\)"
         "\\( \\{p\\supset \\lnot q\\equiv p,\\ p\\equiv p\\lor q\\equiv p\\} \\)"
         "\\( \\{(\\lnot q\\equiv p)\\land p,\\ p\\land (p\\lor q)\\supset p\\} \\)"
         "\\( \\{\\lnot q\\equiv q\\supset q,\\ \\lnot (q\\lor p\\land p)\\} \\)"
         "\\( \\{q\\equiv \\lnot (q\\supset q),\\ \\lnot (p\\land (q\\lor p))\\} \\)"
         "\\( \\{(p\\supset q)\\supset \\lnot q,\\ \\lnot ((q\\equiv p)\\lor q)\\} \\)"
         "\\( \\{q\\supset \\lnot (p\\supset q),\\ q\\supset q\\equiv \\lnot q\\} \\)"
         "\\( \\{q\\equiv q\\land \\lnot q,\\ p\\equiv q\\supset \\lnot q\\} \\)"
         "\\( \\{q\\supset (p\\equiv \\lnot p),\\ q\\land q\\supset \\lnot p\\} \\)"
         "\\( \\{q\\supset \\lnot (q\\land q),\\ p\\equiv (q\\equiv p)\\equiv p\\} \\)"
         "\\( \\{p\\equiv \\lnot (p\\equiv q),\\ p\\supset (p\\supset q\\equiv p)\\} \\)"
         "\\( \\{\\lnot ((q\\supset p)\\supset q),\\ (p\\supset p\\supset q)\\supset p\\} \\)"
         "\\( \\{\\lnot q\\land (p\\equiv p),\\ (q\\supset p)\\lor p\\land q\\} \\)"
         "\\( \\{q\\land q\\supset \\lnot q,\\ q\\lor q\\land q\\lor p\\} \\)"
         "\\( \\{q\\equiv \\lnot (q\\supset q),\\ p\\lor (p\\land p\\supset q)\\} \\)"
         "\\( \\{\\lnot p\\equiv q,\\ (p\\equiv \\lnot q)\\land q\\} \\)"
         "\\( \\{q\\equiv \\lnot p,\\ p\\equiv \\lnot p\\land p\\} \\)"
         "\\( \\{p\\equiv \\lnot q,\\ \\lnot ((p\\supset q)\\lor q)\\} \\)"
         "\\( \\{q\\equiv p\\supset \\lnot p,\\ q\\supset \\lnot p\\land p\\} \\)"
         "\\( \\{p\\equiv q\\supset \\lnot q,\\ \\lnot q\\equiv p\\lor p\\} \\)"
         "\\( \\{q\\lor q\\equiv \\lnot p,\\ \\lnot p\\land q\\equiv q\\} \\)"
         "\\( \\{q\\lor q\\equiv \\lnot p,\\ q\\land q\\land (p\\equiv p)\\} \\)"
         "\\( \\{\\lnot (q\\equiv p\\lor p),\\ p\\supset (q\\equiv p)\\lor q\\} \\)"
         "\\( \\{p\\equiv \\lnot (q\\lor q),\\ p\\land (p\\lor (q\\supset p))\\} \\)"
         "\\( \\{q\\lor q\\equiv \\lnot p,\\ p\\lor q\\land q\\equiv p\\} \\)"
         "\\( \\{q\\land q\\equiv \\lnot p,\\ \\lnot (p\\equiv q)\\lor q\\} \\)"
         "\\( \\{\\lnot p\\equiv q\\land q,\\ (q\\equiv p)\\equiv q\\equiv p\\} \\)"
         "\\( \\{\\lnot ((q\\equiv p)\\land q),\\ (p\\equiv q)\\land \\lnot p\\} \\)"
         "\\( \\{q\\supset \\lnot (q\\supset p),\\ \\lnot (p\\lor q\\equiv p)\\} \\)"
         "\\( \\{\\lnot ((q\\land q)\\land p),\\ p\\supset \\lnot p\\} \\)"
         "\\( \\{\\lnot ((q\\supset p)\\land q),\\ \\lnot (p\\supset p\\land q)\\} \\)"
         "\\( \\{q\\lor q\\supset \\lnot p,\\ q\\supset \\lnot q\\} \\)"
         "\\( \\{q\\supset q\\supset \\lnot p,\\ \\lnot p\\equiv q\\} \\)"
         "\\( \\{\\lnot ((p\\land p)\\land q),\\ \\lnot q\\lor \\lnot p\\} \\)"
         "\\( \\{q\\supset \\lnot (p\\land q),\\ q\\equiv p\\} \\)"
         "\\( \\{\\lnot (p\\land q\\land q),\\ (q\\lor q\\land p)\\land q\\} \\)"
         "\\( \\{\\lnot (q\\supset p)\\equiv q,\\ p\\supset q\\land q\\} \\)"
         "\\( \\{\\lnot (q\\land p\\land q),\\ (q\\land p\\lor p)\\land p\\} \\)"
         "\\( \\{q\\supset \\lnot (p\\land p),\\ q\\lor p\\land q\\supset p\\} \\)"
         "\\( \\{q\\land p\\supset \\lnot p,\\ (q\\equiv p)\\supset q\\land q\\} \\)"
         "\\( \\{\\lnot ((q\\land p)\\land p),\\ (q\\lor p)\\land q\\equiv q\\} \\)"
         "\\( \\{p\\land (q\\equiv p\\equiv p),\\ p\\equiv p\\supset p\\supset q\\} \\)"
         "\\( \\{(q\\equiv p\\equiv q)\\land q,\\ \\lnot p\\equiv \\lnot q\\} \\)"
         "\\( \\{q\\supset p\\lor p\\equiv q,\\ (p\\lor (p\\supset q))\\land q\\} \\)"
         "\\( \\{p\\land q\\equiv p\\equiv p,\\ q\\lor p\\land p\\equiv q\\} \\)"
         "\\( \\{(q\\land q\\land q)\\land p,\\ \\lnot \\lnot p\\land p\\} \\)"
         "\\( \\{p\\supset q\\lor q\\equiv p,\\ (q\\supset q)\\land q\\supset p\\} \\)"
         "\\( \\{(p\\lor q\\equiv p)\\equiv q,\\ q\\land q\\lor p\\land p\\} \\)"
         "\\( \\{p\\land (p\\equiv q),\\ p\\land \\lnot q\\supset p\\} \\)"
         "\\( \\{q\\land p\\equiv p\\lor q,\\ \\lnot (p\\lor q)\\} \\)"
         "\\( \\{p\\equiv p\\land q\\lor q,\\ p\\equiv \\lnot q\\land q\\} \\)"
         "\\( \\{(q\\equiv p\\equiv q)\\equiv q,\\ (\\lnot q\\equiv p)\\equiv p\\} \\)"
         "\\( \\{q\\equiv \\lnot p\\supset p,\\ \\lnot ((q\\equiv p)\\land q)\\} \\)"
         "\\( \\{q\\supset q\\equiv q\\equiv p,\\ ((p\\equiv p)\\land p)\\land q\\} \\)"
         "\\( \\{(p\\lor q)\\land p\\equiv q,\\ q\\equiv (p\\equiv p)\\supset p\\} \\)"
         "\\( \\{p\\equiv q\\supset q\\equiv q,\\ q\\land (p\\supset q\\supset p)\\} \\)"
         "\\( \\{q\\land (q\\lor q)\\equiv p,\\ q\\lor \\lnot (p\\land p)\\} \\)"
         "\\( \\{(q\\lor q)\\land q\\equiv p,\\ p\\land (p\\supset p)\\lor p\\} \\)"
         "\\( \\{(q\\equiv p)\\equiv p\\supset p,\\ q\\supset q\\supset q\\land p\\} \\)"
         "\\( \\{q\\equiv q\\land p\\lor p,\\ q\\lor p\\lor q\\} \\)"
         "\\( \\{q\\equiv (p\\equiv p)\\supset p,\\ p\\land q\\supset q\\lor p\\} \\)"
         "\\( \\{\\lnot (q\\equiv q)\\lor q,\\ \\lnot ((q\\equiv p)\\lor p)\\} \\)"
         "\\( \\{q\\equiv q\\land p\\supset q,\\ p\\equiv \\lnot p\\equiv p\\} \\)"
         "\\( \\{q\\equiv q\\supset q\\land q,\\ \\lnot (q\\equiv p\\land p)\\} \\)"
         "\\( \\{\\lnot (q\\supset p)\\lor q,\\ p\\supset q\\equiv \\lnot p\\} \\)"
         "\\( \\{(p\\lor q\\equiv p)\\supset q,\\ (q\\equiv p\\supset p)\\land p\\} \\)"
         "\\( \\{(q\\lor q)\\land (p\\supset p),\\ p\\equiv q\\supset q\\equiv q\\} \\)"
         "\\( \\{q\\lor \\lnot q\\supset q,\\ q\\equiv (p\\supset p)\\lor p\\} \\)"
         "\\( \\{((p\\lor q)\\lor p)\\land q,\\ p\\supset p\\supset (q\\equiv p)\\} \\)"
         "\\( \\{(q\\lor \\lnot q)\\land q,\\ (q\\land p\\supset p)\\land p\\} \\)"
         "\\( \\{(q\\lor q)\\lor q\\lor q,\\ q\\equiv q\\land (p\\equiv q)\\} \\)"
         "\\( \\{q\\land (\\lnot q\\supset p),\\ (q\\lor p)\\land (p\\lor q)\\} \\)"
         "\\( \\{q\\land (q\\lor q\\supset q),\\ (p\\supset q)\\lor p\\lor p\\} \\)"
         "\\( \\{q\\lor (q\\equiv p\\lor p),\\ \\lnot ((q\\lor q)\\lor p)\\} \\)"
         "\\( \\{(p\\lor q\\supset q)\\lor q,\\ (p\\supset \\lnot p)\\land q\\} \\)"
         "\\( \\{p\\lor q\\lor p\\supset q,\\ q\\land \\lnot q\\equiv p\\} \\)"
         "\\( \\{\\lnot p\\lor (p\\supset q),\\ \\lnot (q\\equiv q\\supset q)\\} \\)"
         "\\( \\{p\\equiv p\\land q,\\ \\lnot (q\\lor q)\\equiv p\\} \\)"
         "\\( \\{(p\\supset p\\equiv p)\\supset q,\\ \\lnot ((q\\equiv p)\\land p)\\} \\)"
         "\\( \\{p\\supset p\\supset p\\land q,\\ (q\\equiv p)\\land (q\\lor q)\\} \\)"
         "\\( \\{p\\supset p\\land q\\lor q,\\ p\\equiv (q\\lor q)\\lor q\\} \\)"
         "\\( \\{(p\\supset q)\\lor q\\land q,\\ q\\lor q\\lor p\\land q\\} \\)"
         "\\( \\{p\\supset (p\\equiv q),\\ p\\equiv p\\land q\\land q\\} \\)"
         "\\( \\{(q\\supset p)\\supset (q\\equiv p),\\ (q\\supset \\lnot p)\\supset p\\} \\)"
         "\\( \\{q\\land (q\\supset p)\\equiv p,\\ q\\land (p\\lor q)\\supset p\\} \\)"
         "\\( \\{(q\\equiv p)\\equiv q\\supset p,\\ p\\equiv q\\land p\\equiv q\\} \\)"
         "\\( \\{(q\\equiv p)\\lor (p\\supset q),\\ (q\\land p)\\land q\\supset q\\} \\)"
         "\\( \\{(q\\lor p)\\land (p\\lor p),\\ p\\land \\lnot (p\\supset q)\\} \\)"
         "\\( \\{p\\land (p\\supset p\\supset p),\\ \\lnot (q\\land q\\land q)\\} \\)"
         "\\( \\{p\\land (p\\lor q\\equiv p),\\ q\\equiv p\\supset \\lnot p\\} \\)"
         "\\( \\{p\\land (p\\lor q),\\ p\\supset (\\lnot p\\equiv q)\\} \\)"
         "\\( \\{p\\land (q\\lor (q\\supset q)),\\ p\\land (q\\lor q\\land p)\\} \\)"
         "\\( \\{((q\\equiv q)\\supset p)\\lor p,\\ (q\\supset q)\\land (p\\equiv q)\\} \\)"
         "\\( \\{(p\\lor p\\supset p)\\supset p,\\ (p\\equiv q\\equiv p)\\lor q\\} \\)"
         "\\( \\{(q\\land q\\supset p)\\land p,\\ q\\lor (q\\equiv p\\lor q)\\} \\)"
         "\\( \\{p\\lor ((p\\supset p)\\supset p),\\ (p\\supset q)\\supset p\\land q\\} \\)"
         "\\( \\{(q\\equiv p)\\land q\\lor p,\\ q\\supset p\\lor p\\lor p\\} \\)"
         "\\( \\{((q\\equiv q)\\lor p)\\land p,\\ (q\\land p\\lor q)\\lor p\\} \\)"
         "\\( \\{((p\\equiv q)\\supset p)\\land p,\\ (q\\equiv q)\\lor (q\\supset p)\\} \\)"
         "\\( \\{(q\\lor p)\\lor p\\supset p,\\ \\lnot ((p\\equiv q)\\supset q)\\} \\)"
         "\\( \\{q\\supset q\\land (p\\equiv q),\\ \\lnot (p\\land (q\\equiv q))\\} \\)"
         "\\( \\{p\\lor q\\supset q\\supset p,\\ q\\equiv \\lnot (q\\lor p)\\} \\)"
         "\\( \\{q\\equiv (p\\lor p)\\land q,\\ q\\supset \\lnot (p\\supset p)\\} \\)"
         "\\( \\{((p\\equiv q)\\supset p)\\supset p,\\ \\lnot (q\\equiv p\\lor p)\\} \\)"
         "\\( \\{p\\lor (q\\supset p\\land p),\\ p\\equiv p\\land \\lnot q\\} \\)"
         "\\( \\{p\\lor (q\\equiv p)\\lor p,\\ p\\land q\\land q\\land q\\} \\)"
         "\\( \\{((q\\equiv p)\\supset q)\\supset p,\\ (p\\equiv q)\\land (q\\supset p)\\} \\)"
         "\\( \\{q\\equiv p\\land (p\\supset q),\\ (q\\equiv q\\supset p)\\lor q\\} \\)"
         "\\( \\{q\\land (q\\lor q)\\supset p,\\ q\\supset p\\equiv p\\equiv q\\} \\)"
         "\\( \\{q\\supset (q\\land p)\\land q,\\ p\\lor \\lnot q\\land q\\} \\)"
         "\\( \\{p\\lor (p\\lor q\\supset p),\\ (q\\supset p\\equiv q)\\equiv q\\} \\)"
         "\\( \\{p\\equiv q\\lor q\\lor p,\\ (p\\lor q\\lor q)\\lor q\\} \\)"
         "\\( \\{q\\equiv (q\\supset p)\\land q,\\ ((p\\equiv p)\\lor p)\\lor q\\} \\)"
         "\\( \\{q\\lor (\\lnot q\\equiv p),\\ \\lnot (q\\supset p\\lor p)\\} \\)"
         "\\( \\{q\\equiv (p\\supset q)\\lor q,\\ (q\\equiv q)\\land \\lnot p\\} \\)"
         "\\( \\{q\\lor (p\\supset p)\\land p,\\ p\\equiv p\\supset \\lnot q\\} \\)"
         "\\( \\{(q\\equiv q\\equiv p)\\lor q,\\ (p\\supset q)\\supset \\lnot q\\} \\)"
         "\\( \\{p\\land (q\\equiv q)\\lor q,\\ \\lnot (q\\equiv p\\lor p)\\} \\)"
         "\\( \\{(q\\land p\\equiv p)\\equiv q,\\ q\\lor q\\supset \\lnot p\\} \\)"
         "\\( \\{(q\\equiv p)\\supset p\\lor q,\\ p\\land (p\\supset (p\\equiv q))\\} \\)"
         "\\( \\{((p\\lor p)\\lor q)\\lor p,\\ q\\equiv (p\\supset q)\\supset p\\} \\)"
         "\\( \\{(q\\lor p)\\lor q,\\ q\\land q\\equiv p\\supset p\\} \\)"
         "\\( \\{\\lnot q\\supset p\\land p,\\ p\\land p\\supset q\\lor q\\} \\)"
         "\\( \\{p\\lor (p\\supset p\\equiv q),\\ p\\land (q\\lor (p\\supset p))\\} \\)"
         "\\( \\{(q\\equiv q)\\equiv p\\lor q,\\ q\\supset (q\\equiv q)\\land p\\} \\)"
         "\\( \\{(q\\supset q\\land p)\\supset p,\\ p\\lor q\\equiv q\\supset q\\} \\)"
         "\\( \\{q\\land p\\lor q\\lor p,\\ p\\lor q\\lor (q\\equiv q)\\} \\)"
         "\\( \\{q\\equiv p\\equiv p\\equiv q,\\ \\lnot p\\land (q\\equiv p)\\} \\)"
         "\\( \\{(q\\equiv p)\\supset (p\\equiv q),\\ \\lnot (q\\land p)\\land q\\} \\)"
         "\\( \\{p\\lor (q\\supset p\\supset p),\\ p\\supset q\\land \\lnot q\\} \\)"
         "\\( \\{p\\supset (q\\supset q)\\land p,\\ \\lnot (p\\land q)\\equiv p\\} \\)"
         "\\( \\{p\\lor q\\lor \\lnot p,\\ \\lnot (q\\lor q\\land p)\\} \\)"
         "\\( \\{q\\lor p\\supset q\\lor p,\\ p\\equiv \\lnot q\\} \\)"
         "\\( \\{\\lnot p\\lor (q\\equiv q),\\ q\\equiv \\lnot p\\land q\\} \\)"
         "\\( \\{q\\lor (q\\supset q\\supset p),\\ q\\equiv q\\supset q\\land p\\} \\)"
         "\\( \\{(p\\lor \\lnot q)\\lor q,\\ (p\\equiv q\\supset q)\\equiv q\\} \\)"
         "\\( \\{p\\supset p\\land (p\\equiv p),\\ (p\\lor p\\lor q)\\land q\\} \\)"
         "\\( \\{p\\lor (q\\land q\\equiv q),\\ q\\lor (p\\lor q\\equiv q)\\} \\)"
         "\\( \\{\\lnot q\\supset (q\\equiv q),\\ (p\\land p)\\land (q\\equiv q)\\} \\)"
         "\\( \\{(p\\supset q\\supset q)\\lor q,\\ q\\supset q\\land p\\} \\)"
         "\\( \\{p\\land q\\lor (p\\supset p),\\ (q\\equiv p\\lor p)\\supset q\\} \\)"
         "\\( \\{(p\\supset q)\\lor \\lnot q,\\ p\\equiv (q\\equiv q)\\land p\\} \\)"
  ]
  :wrong [
          ["\\( \\{\\lnot (\\lnot q\\lor q),\\ \\lnot (q\\lor p)\\land q\\} \\)" "az igazságtáblák főoszlopai 0000 és 0000"]
          ["\\( \\{q\\land (\\lnot q\\equiv q),\\ \\lnot ((p\\lor q)\\lor p)\\} \\)" "az igazságtáblák főoszlopai 0000 és 1000"]
          ["\\( \\{(\\lnot q\\equiv q)\\land p,\\ (p\\equiv \\lnot q)\\land q\\} \\)" "az igazságtáblák főoszlopai 0000 és 0100"]
          ["\\( \\{q\\equiv \\lnot (q\\lor q),\\ \\lnot p\\} \\)" "az igazságtáblák főoszlopai 0000 és 1100"]
          ["\\( \\{\\lnot (\\lnot p\\lor p),\\ \\lnot (q\\equiv p)\\land p\\} \\)" "az igazságtáblák főoszlopai 0000 és 0010"]
          ["\\( \\{q\\land q\\land \\lnot q,\\ \\lnot ((p\\equiv q)\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 0000 és 1010"]
          ["\\( \\{(\\lnot p\\land q)\\land p,\\ \\lnot (q\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 0000 és 0110"]
          ["\\( \\{\\lnot q\\land q,\\ \\lnot (q\\equiv q\\supset p)\\} \\)" "az igazságtáblák főoszlopai 0000 és 1110"]
          ["\\( \\{q\\land (\\lnot p\\equiv p),\\ (p\\equiv p\\lor q)\\equiv q\\} \\)" "az igazságtáblák főoszlopai 0000 és 0001"]
          ["\\( \\{p\\land \\lnot (q\\equiv q),\\ p\\lor q\\equiv q\\land p\\} \\)" "az igazságtáblák főoszlopai 0000 és 1001"]
          ["\\( \\{\\lnot (q\\supset q),\\ q\\land q\\land q\\lor q\\} \\)" "az igazságtáblák főoszlopai 0000 és 0101"]
          ["\\( \\{\\lnot ((p\\supset p)\\lor p),\\ p\\supset q\\lor \\lnot p\\} \\)" "az igazságtáblák főoszlopai 0000 és 1101"]
          ["\\( \\{\\lnot (q\\lor (q\\equiv q)),\\ p\\equiv p\\equiv p\\lor p\\} \\)" "az igazságtáblák főoszlopai 0000 és 0011"]
          ["\\( \\{\\lnot (q\\supset q)\\land q,\\ (q\\supset p)\\lor p\\land q\\} \\)" "az igazságtáblák főoszlopai 0000 és 1011"]
          ["\\( \\{p\\land \\lnot (q\\supset p),\\ q\\land (q\\lor q)\\lor p\\} \\)" "az igazságtáblák főoszlopai 0000 és 0111"]
          ["\\( \\{\\lnot (p\\supset q\\supset q),\\ (q\\equiv q)\\lor (q\\equiv q)\\} \\)" "az igazságtáblák főoszlopai 0000 és 1111"]
          ["\\( \\{(q\\equiv p)\\land \\lnot p,\\ \\lnot (q\\supset q\\lor p)\\} \\)" "az igazságtáblák főoszlopai 1000 és 0000"]
          ["\\( \\{\\lnot (q\\lor q\\lor p),\\ \\lnot q\\equiv q\\land p\\} \\)" "az igazságtáblák főoszlopai 1000 és 0100"]
          ["\\( \\{\\lnot p\\land (p\\equiv q),\\ p\\land \\lnot (q\\lor q)\\} \\)" "az igazságtáblák főoszlopai 1000 és 0010"]
          ["\\( \\{\\lnot (q\\equiv p\\supset q),\\ \\lnot (q\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 1000 és 0110"]
          ["\\( \\{\\lnot (q\\equiv p\\supset q),\\ (q\\supset q)\\supset p\\land q\\} \\)" "az igazságtáblák főoszlopai 1000 és 0001"]
          ["\\( \\{p\\supset q\\equiv \\lnot q,\\ q\\equiv q\\land p\\supset q\\} \\)" "az igazságtáblák főoszlopai 1000 és 0101"]
          ["\\( \\{\\lnot (q\\land q\\lor p),\\ (p\\supset p\\lor q)\\supset p\\} \\)" "az igazságtáblák főoszlopai 1000 és 0011"]
          ["\\( \\{\\lnot p\\land \\lnot q,\\ \\lnot q\\supset p\\lor p\\} \\)" "az igazságtáblák főoszlopai 1000 és 0111"]
          ["\\( \\{(q\\land q)\\land \\lnot p,\\ \\lnot (q\\supset p\\supset p)\\} \\)" "az igazságtáblák főoszlopai 0100 és 0000"]
          ["\\( \\{\\lnot (q\\supset p\\land p),\\ \\lnot (q\\lor p\\lor p)\\} \\)" "az igazságtáblák főoszlopai 0100 és 1000"]
          ["\\( \\{q\\land q\\land \\lnot p,\\ \\lnot ((p\\equiv q)\\lor q)\\} \\)" "az igazságtáblák főoszlopai 0100 és 0010"]
          ["\\( \\{\\lnot (q\\supset p),\\ \\lnot p\\land p\\equiv q\\} \\)" "az igazságtáblák főoszlopai 0100 és 1010"]
          ["\\( \\{\\lnot (q\\land p)\\land q,\\ (p\\land q\\land q)\\land q\\} \\)" "az igazságtáblák főoszlopai 0100 és 0001"]
          ["\\( \\{\\lnot (q\\supset p),\\ p\\equiv q\\equiv p\\supset p\\} \\)" "az igazságtáblák főoszlopai 0100 és 1001"]
          ["\\( \\{\\lnot (p\\equiv q)\\land q,\\ ((q\\equiv q)\\supset p)\\lor p\\} \\)" "az igazságtáblák főoszlopai 0100 és 0011"]
          ["\\( \\{q\\land (p\\equiv \\lnot q),\\ q\\supset (q\\supset p)\\lor p\\} \\)" "az igazságtáblák főoszlopai 0100 és 1011"]
          ["\\( \\{p\\supset q\\land \\lnot p,\\ q\\land \\lnot (p\\supset q)\\} \\)" "az igazságtáblák főoszlopai 1100 és 0000"]
          ["\\( \\{(p\\equiv \\lnot q)\\equiv q,\\ \\lnot q\\land (p\\lor p)\\} \\)" "az igazságtáblák főoszlopai 1100 és 0010"]
          ["\\( \\{\\lnot (p\\equiv q\\supset q),\\ (p\\land p\\land q)\\land p\\} \\)" "az igazságtáblák főoszlopai 1100 és 0001"]
          ["\\( \\{\\lnot p\\land p\\equiv p,\\ (q\\lor q\\equiv p)\\equiv q\\} \\)" "az igazságtáblák főoszlopai 1100 és 0011"]
          ["\\( \\{p\\equiv \\lnot (q\\land p),\\ p\\land q\\land \\lnot q\\} \\)" "az igazságtáblák főoszlopai 0010 és 0000"]
          ["\\( \\{\\lnot q\\land p\\land p,\\ \\lnot p\\land (q\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 0010 és 1000"]
          ["\\( \\{\\lnot q\\land (p\\lor q),\\ (q\\land q)\\land \\lnot p\\} \\)" "az igazságtáblák főoszlopai 0010 és 0100"]
          ["\\( \\{\\lnot ((q\\equiv p)\\lor q),\\ q\\equiv \\lnot q\\equiv p\\} \\)" "az igazságtáblák főoszlopai 0010 és 1100"]
          ["\\( \\{\\lnot q\\land (p\\lor p),\\ q\\land (p\\supset p)\\land p\\} \\)" "az igazságtáblák főoszlopai 0010 és 0001"]
          ["\\( \\{\\lnot p\\equiv p\\land q,\\ p\\equiv \\lnot q\\supset q\\} \\)" "az igazságtáblák főoszlopai 0010 és 1001"]
          ["\\( \\{p\\land (p\\supset \\lnot q),\\ (q\\supset p\\lor q)\\land q\\} \\)" "az igazságtáblák főoszlopai 0010 és 0101"]
          ["\\( \\{\\lnot (p\\supset (q\\equiv p)),\\ (p\\equiv p)\\land (p\\supset q)\\} \\)" "az igazságtáblák főoszlopai 0010 és 1101"]
          ["\\( \\{q\\supset (\\lnot p\\equiv p),\\ \\lnot (p\\lor q)\\land q\\} \\)" "az igazságtáblák főoszlopai 1010 és 0000"]
          ["\\( \\{\\lnot q\\land q\\equiv q,\\ \\lnot (p\\land q)\\land q\\} \\)" "az igazságtáblák főoszlopai 1010 és 0100"]
          ["\\( \\{\\lnot q\\land (q\\supset p),\\ p\\land p\\equiv p\\supset q\\} \\)" "az igazságtáblák főoszlopai 1010 és 0001"]
          ["\\( \\{\\lnot (q\\equiv q)\\equiv q,\\ p\\supset q\\equiv p\\lor q\\} \\)" "az igazságtáblák főoszlopai 1010 és 0101"]
          ["\\( \\{\\lnot (p\\land p)\\equiv q,\\ q\\equiv \\lnot (q\\land q)\\} \\)" "az igazságtáblák főoszlopai 0110 és 0000"]
          ["\\( \\{\\lnot (p\\equiv q\\land q),\\ \\lnot (\\lnot p\\supset q)\\} \\)" "az igazságtáblák főoszlopai 0110 és 1000"]
          ["\\( \\{q\\land q\\equiv \\lnot p,\\ p\\land (q\\land p\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 0110 és 0001"]
          ["\\( \\{\\lnot p\\equiv q\\lor q,\\ p\\equiv (q\\lor p)\\land q\\} \\)" "az igazságtáblák főoszlopai 0110 és 1001"]
          ["\\( \\{q\\supset p\\supset \\lnot p,\\ p\\lor p\\equiv \\lnot p\\} \\)" "az igazságtáblák főoszlopai 1110 és 0000"]
          ["\\( \\{q\\supset \\lnot p\\land q,\\ p\\land (q\\equiv p)\\land p\\} \\)" "az igazságtáblák főoszlopai 1110 és 0001"]
          ["\\( \\{(q\\lor p\\land q)\\land p,\\ \\lnot (q\\land p\\supset q)\\} \\)" "az igazságtáblák főoszlopai 0001 és 0000"]
          ["\\( \\{p\\land q\\land (p\\equiv q),\\ p\\equiv \\lnot p\\land q\\} \\)" "az igazságtáblák főoszlopai 0001 és 1000"]
          ["\\( \\{q\\land ((p\\equiv q)\\equiv q),\\ \\lnot (q\\lor q\\supset p)\\} \\)" "az igazságtáblák főoszlopai 0001 és 0100"]
          ["\\( \\{q\\land (q\\land q\\supset p),\\ p\\equiv q\\land \\lnot q\\} \\)" "az igazságtáblák főoszlopai 0001 és 1100"]
          ["\\( \\{(p\\land p)\\land (q\\lor q),\\ \\lnot (p\\lor p\\supset q)\\} \\)" "az igazságtáblák főoszlopai 0001 és 0010"]
          ["\\( \\{(q\\equiv q\\lor p)\\equiv p,\\ \\lnot (q\\equiv q)\\equiv q\\} \\)" "az igazságtáblák főoszlopai 0001 és 1010"]
          ["\\( \\{(p\\land (q\\lor p))\\land q,\\ \\lnot (q\\lor q\\equiv p)\\} \\)" "az igazságtáblák főoszlopai 0001 és 0110"]
          ["\\( \\{p\\land p\\land q,\\ \\lnot ((p\\land p)\\land q)\\} \\)" "az igazságtáblák főoszlopai 0001 és 1110"]
          ["\\( \\{q\\land (q\\supset q)\\equiv p,\\ q\\land q\\equiv \\lnot q\\} \\)" "az igazságtáblák főoszlopai 1001 és 0000"]
          ["\\( \\{p\\equiv (q\\supset q)\\supset q,\\ q\\land q\\land \\lnot p\\} \\)" "az igazságtáblák főoszlopai 1001 és 0100"]
          ["\\( \\{(p\\supset q)\\land q\\equiv p,\\ \\lnot (q\\land q)\\land p\\} \\)" "az igazságtáblák főoszlopai 1001 és 0010"]
          ["\\( \\{(q\\equiv q)\\supset q\\equiv p,\\ \\lnot (p\\land p)\\equiv q\\} \\)" "az igazságtáblák főoszlopai 1001 és 0110"]
          ["\\( \\{(p\\supset p\\land q)\\land q,\\ \\lnot (p\\equiv p)\\land p\\} \\)" "az igazságtáblák főoszlopai 0101 és 0000"]
          ["\\( \\{(q\\supset q)\\supset q\\lor q,\\ \\lnot (p\\lor q)\\} \\)" "az igazságtáblák főoszlopai 0101 és 1000"]
          ["\\( \\{(p\\supset p)\\lor p\\supset q,\\ \\lnot (p\\lor q)\\equiv q\\} \\)" "az igazságtáblák főoszlopai 0101 és 0010"]
          ["\\( \\{(p\\supset p\\lor p)\\supset q,\\ (q\\equiv p)\\equiv \\lnot p\\} \\)" "az igazságtáblák főoszlopai 0101 és 1010"]
          ["\\( \\{p\\supset (q\\equiv p),\\ \\lnot (p\\supset q)\\land q\\} \\)" "az igazságtáblák főoszlopai 1101 és 0000"]
          ["\\( \\{p\\land q\\land q\\equiv p,\\ p\\land \\lnot (q\\land q)\\} \\)" "az igazságtáblák főoszlopai 1101 és 0010"]
          ["\\( \\{(p\\land q)\\land q\\lor p,\\ q\\lor q\\equiv \\lnot q\\} \\)" "az igazságtáblák főoszlopai 0011 és 0000"]
          ["\\( \\{q\\lor \\lnot q\\supset p,\\ \\lnot (q\\lor p\\land p)\\} \\)" "az igazságtáblák főoszlopai 0011 és 1000"]
          ["\\( \\{\\lnot p\\supset p\\land q,\\ \\lnot p\\equiv p\\lor q\\} \\)" "az igazságtáblák főoszlopai 0011 és 0100"]
          ["\\( \\{(q\\equiv q)\\lor q\\equiv p,\\ \\lnot ((p\\equiv p)\\supset p)\\} \\)" "az igazságtáblák főoszlopai 0011 és 1100"]
          ["\\( \\{(q\\equiv p\\lor p)\\lor p,\\ \\lnot (p\\lor p)\\land p\\} \\)" "az igazságtáblák főoszlopai 1011 és 0000"]
          ["\\( \\{p\\lor (q\\equiv p\\land p),\\ \\lnot p\\land q\\} \\)" "az igazságtáblák főoszlopai 1011 és 0100"]
          ["\\( \\{q\\equiv p\\supset (p\\equiv q),\\ (p\\equiv \\lnot p)\\land p\\} \\)" "az igazságtáblák főoszlopai 0111 és 0000"]
          ["\\( \\{\\lnot (p\\equiv q)\\lor q,\\ (p\\equiv q)\\land \\lnot q\\} \\)" "az igazságtáblák főoszlopai 0111 és 1000"]
          ["\\( \\{(p\\lor (p\\supset q))\\lor q,\\ \\lnot (p\\supset p\\lor p)\\} \\)" "az igazságtáblák főoszlopai 1111 és 0000"]
]}]
