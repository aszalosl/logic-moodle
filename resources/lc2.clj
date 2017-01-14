[{:question "Jelölje meg a \\( \\{\\lnot (p\\lor (q\\supset q))\\), \\((\\lnot q\\land \\lnot p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (p\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (\\lnot (q\\supset p)\\land p) \\)"
    "\\( \\lnot ((q\\land p)\\supset p) \\)"
    "\\( (p\\land (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (\\lnot q\\supset p) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot (\\lnot q\\supset p) \\)"
    "\\( ((\\lnot q\\land p)\\equiv q) \\)"
    "\\( \\lnot (q\\supset p) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (q\\land \\lnot p) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (q\\equiv q)) \\)"
    "\\( \\lnot ((q\\land p)\\lor p) \\)"
    "\\( ((p\\supset p)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\lor p)\\land p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( (p\\land (\\lnot q\\equiv p)) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( \\lnot (p\\supset (q\\lor q)) \\)"
    "\\( \\lnot (p\\supset (p\\supset q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor q) \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv p) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot q) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((q\\land q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (q\\equiv (q\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\land (q\\land q)) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (q\\land p) \\)"
    "\\( ((q\\equiv p)\\land (q\\land q)) \\)"
    "\\( \\lnot (p\\supset \\lnot q) \\)"
    "\\( ((p\\supset (q\\land q))\\equiv p) \\)"
    "\\( (((q\\land p)\\equiv q)\\land q) \\)"
    "\\( (p\\equiv (q\\land (p\\supset q))) \\)"
    "\\( (p\\equiv (q\\equiv (q\\supset q))) \\)"
    "\\( (((p\\equiv p)\\land p)\\equiv q) \\)"
    "\\( ((q\\equiv q)\\equiv (q\\equiv p)) \\)"
    "\\( (((q\\supset q)\\supset p)\\equiv q) \\)"
    "\\( (q\\lor ((p\\land q)\\land q)) \\)"
    "\\( (q\\lor ((q\\supset q)\\land q)) \\)"
    "\\( (q\\lor (q\\equiv \\lnot q)) \\)"
    "\\( (((p\\lor q)\\equiv q)\\land q) \\)"
    "\\( (q\\lor ((p\\lor p)\\land q)) \\)"
    "\\( ((p\\lor (p\\lor q))\\supset q) \\)"
    "\\( ((q\\lor q)\\lor (p\\supset q)) \\)"
    "\\( (p\\equiv ((p\\supset q)\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\land q)) \\)"
    "\\( ((q\\lor (p\\lor p))\\equiv q) \\)"
    "\\( (p\\lor \\lnot (p\\supset p)) \\)"
    "\\( ((q\\supset (q\\supset p))\\land p) \\)"
    "\\( ((p\\supset (p\\supset p))\\equiv p) \\)"
    "\\( ((q\\supset q)\\land (p\\land p)) \\)"
    "\\( ((q\\lor (p\\supset p))\\land p) \\)"
    "\\( ((q\\lor (q\\land q))\\supset p) \\)"
    "\\( (p\\equiv ((q\\supset p)\\supset p)) \\)"
    "\\( ((p\\lor (p\\lor q))\\supset p) \\)"
    "\\( ((q\\land (q\\equiv p))\\equiv q) \\)"
    "\\( ((p\\lor q)\\supset p) \\)"
    "\\( (q\\lor \\lnot (p\\supset q)) \\)"
    "\\( (((q\\lor p)\\land p)\\lor q) \\)"
    "\\( (p\\lor (\\lnot p\\supset q)) \\)"
    "\\( ((\\lnot q\\supset p)\\lor q) \\)"
    "\\( ((p\\equiv (q\\equiv p))\\lor p) \\)"
    "\\( (p\\supset ((p\\land p)\\lor p)) \\)"
    "\\( ((p\\supset q)\\supset (p\\equiv p)) \\)"
    "\\( (p\\supset (p\\lor (q\\lor p))) \\)"
    "\\( ((p\\supset p)\\lor (p\\supset p)) \\)"
    "\\( ((p\\equiv \\lnot p)\\supset p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(p\\land (\\lnot p\\equiv p))\\), \\((q\\land (\\lnot q\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (p\\lor q)\\land p) \\)"
    "\\( \\lnot (p\\lor (p\\supset q)) \\)"
    "\\( (\\lnot (p\\lor p)\\land p) \\)"
    "\\( \\lnot ((q\\land q)\\equiv q) \\)"
    "\\( (\\lnot (p\\supset p)\\land p) \\)"
    "\\( ((q\\equiv p)\\land \\lnot p) \\)"
    "\\( \\lnot (p\\lor (q\\lor p)) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( (\\lnot q\\land (p\\equiv q)) \\)"
    "\\( ((p\\supset \\lnot p)\\land q) \\)"
    "\\( ((p\\supset \\lnot q)\\land q) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( (\\lnot p\\land (p\\lor q)) \\)"
    "\\( (\\lnot (q\\lor p)\\equiv p) \\)"
    "\\( \\lnot (p\\equiv (p\\supset p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\equiv q) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( (p\\supset (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset p) \\)"
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( \\lnot ((p\\land p)\\supset q) \\)"
    "\\( (p\\equiv (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (p\\supset (q\\lor q)) \\)"
    "\\( (p\\land (q\\supset \\lnot p)) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot ((q\\land q)\\land q) \\)"
    "\\( \\lnot (q\\equiv (p\\supset p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset q) \\)"
    "\\( (q\\supset \\lnot (q\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot (p\\equiv (p\\supset q)) \\)"
    "\\( (q\\land (p\\equiv (q\\equiv q))) \\)"
    "\\( ((p\\supset q)\\equiv (p\\lor p)) \\)"
    "\\( ((\\lnot p\\supset p)\\land q) \\)"
    "\\( (q\\land (q\\land (q\\equiv p))) \\)"
    "\\( (((q\\equiv q)\\equiv q)\\land p) \\)"
    "\\( (q\\equiv ((p\\supset p)\\equiv p)) \\)"
    "\\( ((p\\supset p)\\supset (p\\equiv q)) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( ((p\\equiv (q\\supset q))\\equiv q) \\)"
    "\\( ((p\\land q)\\lor (q\\equiv p)) \\)"
    "\\( (((p\\land p)\\equiv p)\\equiv q) \\)"
    "\\( (q\\lor (p\\land q)) \\)"
    "\\( (q\\equiv (q\\lor (q\\supset p))) \\)"
    "\\( ((p\\land (q\\equiv p))\\lor q) \\)"
    "\\( (((p\\lor p)\\supset p)\\land q) \\)"
    "\\( ((p\\equiv (q\\supset p))\\equiv q) \\)"
    "\\( ((p\\lor (q\\land q))\\equiv q) \\)"
    "\\( (p\\supset (q\\equiv (p\\lor q))) \\)"
    "\\( ((q\\lor p)\\equiv q) \\)"
    "\\( ((p\\land (q\\equiv q))\\supset q) \\)"
    "\\( (p\\equiv (p\\supset (q\\lor p))) \\)"
    "\\( ((p\\equiv (q\\equiv q))\\land p) \\)"
    "\\( ((p\\land p)\\land (p\\lor q)) \\)"
    "\\( (p\\lor (p\\equiv (q\\supset q))) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\lor p)) \\)"
    "\\( ((q\\supset (p\\land q))\\lor p) \\)"
    "\\( ((p\\equiv q)\\lor (q\\supset p)) \\)"
    "\\( ((q\\land (q\\supset q))\\supset p) \\)"
    "\\( ((p\\equiv (q\\supset p))\\equiv p) \\)"
    "\\( (q\\supset (p\\lor \\lnot q)) \\)"
    "\\( (p\\lor (\\lnot p\\land q)) \\)"
    "\\( (q\\lor (p\\land (p\\supset p))) \\)"
    "\\( ((q\\lor q)\\lor (p\\land p)) \\)"
    "\\( (p\\equiv (p\\equiv (q\\lor p))) \\)"
    "\\( ((p\\supset q)\\supset (p\\lor q)) \\)"
    "\\( (q\\supset ((q\\lor p)\\supset q)) \\)"
    "\\( ((q\\equiv q)\\land (q\\supset q)) \\)"
    "\\( ((q\\lor (p\\equiv p))\\lor p) \\)"
    "\\( ((p\\land q)\\supset (p\\lor p)) \\)"
    "\\( (p\\lor (q\\lor (q\\equiv q))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot q\\equiv (q\\lor q))\\), \\((p\\supset (\\lnot q\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\land q)\\land \\lnot p) \\)"
    "\\( (q\\land \\lnot (q\\supset q)) \\)"
    "\\( \\lnot (q\\supset (q\\lor p)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv q) \\)"
    "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
    "\\( \\lnot ((p\\lor q)\\lor p) \\)"
    "\\( \\lnot ((q\\lor q)\\lor p) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv q) \\)"
    "\\( \\lnot (p\\lor (q\\land q)) \\)"
    "\\( \\lnot ((q\\land q)\\lor p) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( ((q\\land p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot p\\land (p\\lor q)) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (q\\land \\lnot (q\\supset p)) \\)"
    "\\( ((q\\equiv q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset p) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv p) \\)"
    "\\( (p\\equiv (\\lnot q\\land q)) \\)"
    "\\( ((p\\supset p)\\land \\lnot p) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor q) \\)"
    "\\( (p\\land \\lnot (q\\land p)) \\)"
    "\\( ((q\\supset \\lnot q)\\land p) \\)"
    "\\( (\\lnot (q\\land p)\\land p) \\)"
    "\\( (\\lnot q\\land (p\\land p)) \\)"
    "\\( (\\lnot q\\equiv (q\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (q\\equiv q)) \\)"
    "\\( ((q\\supset p)\\land \\lnot q) \\)"
    "\\( ((p\\equiv \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv q) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot p) \\)"
    "\\( \\lnot (q\\land (p\\land p)) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\land q)) \\)"
    "\\( ((q\\supset (p\\lor p))\\equiv q) \\)"
    "\\( (((p\\equiv q)\\land q)\\land p) \\)"
    "\\( ((q\\equiv (p\\lor q))\\equiv p) \\)"
    "\\( ((q\\land p)\\land (q\\land q)) \\)"
    "\\( ((p\\equiv (q\\equiv p))\\land p) \\)"
    "\\( (((p\\supset p)\\land q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( ((p\\land (q\\supset q))\\equiv q) \\)"
    "\\( ((q\\land (q\\equiv q))\\equiv p) \\)"
    "\\( ((p\\land q)\\equiv (q\\lor p)) \\)"
    "\\( (q\\land ((q\\supset q)\\lor p)) \\)"
    "\\( ((q\\lor (q\\land p))\\lor q) \\)"
    "\\( ((p\\land (p\\land q))\\lor q) \\)"
    "\\( ((p\\supset (p\\lor q))\\equiv q) \\)"
    "\\( ((p\\supset (p\\lor p))\\equiv q) \\)"
    "\\( (p\\supset (q\\land (q\\supset q))) \\)"
    "\\( ((p\\land p)\\supset q) \\)"
    "\\( ((q\\equiv (p\\lor q))\\lor q) \\)"
    "\\( ((p\\land (p\\supset p))\\supset q) \\)"
    "\\( (\\lnot p\\lor (p\\supset q)) \\)"
    "\\( (((p\\lor q)\\lor q)\\land p) \\)"
    "\\( (p\\land ((q\\supset q)\\supset p)) \\)"
    "\\( ((p\\supset \\lnot q)\\supset p) \\)"
    "\\( (((p\\land p)\\supset p)\\supset p) \\)"
    "\\( ((\\lnot q\\supset p)\\land p) \\)"
    "\\( (((p\\land q)\\equiv q)\\lor p) \\)"
    "\\( (((p\\land q)\\equiv q)\\lor p) \\)"
    "\\( ((p\\supset p)\\land (q\\supset p)) \\)"
    "\\( ((q\\lor p)\\supset (p\\land p)) \\)"
    "\\( (((p\\land q)\\equiv q)\\lor p) \\)"
    "\\( ((q\\lor q)\\lor (p\\lor q)) \\)"
    "\\( ((q\\equiv (p\\lor p))\\supset q) \\)"
    "\\( ((q\\lor (q\\equiv p))\\equiv q) \\)"
    "\\( (\\lnot p\\supset q) \\)"
    "\\( (p\\lor ((q\\land q)\\lor q)) \\)"
    "\\( (q\\supset (q\\lor (q\\supset q))) \\)"
    "\\( ((p\\equiv (p\\lor q))\\lor q) \\)"
    "\\( ((q\\equiv q)\\lor \\lnot p) \\)"
    "\\( (q\\lor (q\\supset (p\\supset p))) \\)"
    "\\( ((q\\equiv q)\\lor (q\\lor q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\land q)\\land \\lnot q)\\), \\(\\lnot (q\\equiv (p\\lor q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\land q)\\equiv q) \\)"
    "\\( (\\lnot (q\\supset p)\\land p) \\)"
    "\\( ((q\\lor q)\\land \\lnot q) \\)"
    "\\( ((q\\land \\lnot q)\\land p) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( (\\lnot p\\land (q\\equiv p)) \\)"
    "\\( (p\\equiv \\lnot (q\\supset p)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( ((\\lnot q\\equiv p)\\land q) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( \\lnot ((q\\land q)\\supset p) \\)"
    "\\( ((p\\lor q)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset \\lnot q)\\land q) \\)"
    "\\( \\lnot ((q\\lor p)\\land p) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
    "\\( (p\\supset \\lnot (p\\equiv p)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( ((q\\land \\lnot q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (q\\lor p)) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( (p\\land (p\\supset \\lnot q)) \\)"
    "\\( (p\\equiv \\lnot (p\\land q)) \\)"
    "\\( \\lnot (p\\supset q) \\)"
    "\\( (q\\equiv \\lnot (q\\supset q)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (q\\land (q\\land q)) \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( ((q\\equiv q)\\supset \\lnot q) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( \\lnot ((p\\land q)\\land p) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( (p\\supset (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot p) \\)"
    "\\( (((q\\land p)\\equiv p)\\land p) \\)"
    "\\( ((p\\land (q\\supset q))\\land q) \\)"
    "\\( ((p\\equiv (q\\lor p))\\equiv q) \\)"
    "\\( (p\\land (p\\land q)) \\)"
    "\\( ((p\\lor p)\\land (q\\land p)) \\)"
    "\\( (((q\\equiv p)\\equiv p)\\equiv p) \\)"
    "\\( (q\\equiv (p\\lor (p\\lor p))) \\)"
    "\\( (q\\equiv (p\\land (p\\lor p))) \\)"
    "\\( ((q\\lor p)\\supset (q\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\land q)\\lor q)) \\)"
    "\\( ((q\\equiv (q\\land q))\\land q) \\)"
    "\\( ((q\\equiv (p\\lor q))\\land q) \\)"
    "\\( (q\\lor (q\\land \\lnot p)) \\)"
    "\\( ((p\\supset p)\\supset q) \\)"
    "\\( ((p\\equiv p)\\land (q\\lor q)) \\)"
    "\\( (\\lnot (p\\equiv q)\\supset q) \\)"
    "\\( (q\\equiv ((q\\land q)\\lor p)) \\)"
    "\\( (p\\supset (q\\land (p\\supset q))) \\)"
    "\\( (((q\\land p)\\equiv p)\\lor q) \\)"
    "\\( (((p\\lor q)\\lor p)\\equiv q) \\)"
    "\\( ((p\\land p)\\land (p\\supset p)) \\)"
    "\\( (((q\\land p)\\land q)\\lor p) \\)"
    "\\( ((\\lnot p\\lor p)\\land p) \\)"
    "\\( (p\\lor \\lnot (q\\equiv q)) \\)"
    "\\( (p\\lor (p\\lor (p\\land q))) \\)"
    "\\( ((q\\lor (p\\land q))\\supset p) \\)"
    "\\( (q\\supset (p\\land (p\\land p))) \\)"
    "\\( (((q\\land q)\\land q)\\supset p) \\)"
    "\\( (p\\lor ((q\\lor p)\\supset p)) \\)"
    "\\( ((q\\lor p)\\equiv (p\\lor p)) \\)"
    "\\( (p\\lor ((p\\supset p)\\supset q)) \\)"
    "\\( (p\\equiv ((q\\land q)\\supset p)) \\)"
    "\\( ((p\\lor (q\\equiv p))\\equiv p) \\)"
    "\\( (q\\lor ((q\\supset p)\\supset p)) \\)"
    "\\( (p\\lor \\lnot (q\\supset p)) \\)"
    "\\( ((q\\supset p)\\supset (p\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\lor (p\\land q)) \\)"
    "\\( (p\\lor ((q\\land p)\\supset p)) \\)"
    "\\( (p\\equiv (p\\land (p\\land p))) \\)"
    "\\( ((p\\supset p)\\lor (p\\land q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\supset (q\\equiv q))\\), \\((p\\equiv \\lnot (p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor (p\\supset p)) \\)"
    "\\( \\lnot (q\\lor (q\\equiv q)) \\)"
    "\\( \\lnot ((q\\lor q)\\supset q) \\)"
    "\\( (p\\land (p\\supset \\lnot p)) \\)"
    "\\( ((\\lnot q\\equiv q)\\land q) \\)"
    "\\( \\lnot ((q\\land q)\\lor p) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv p) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( (q\\land \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\lor q)\\supset p) \\)"
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( \\lnot (q\\supset p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( (\\lnot p\\land (q\\equiv q)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv q) \\)"
    "\\( \\lnot ((q\\supset q)\\supset p) \\)"
    "\\( (p\\land (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (q\\lor (q\\equiv p)) \\)"
    "\\( \\lnot (p\\supset (q\\equiv p)) \\)"
    "\\( (\\lnot q\\land (p\\lor p)) \\)"
    "\\( \\lnot (p\\supset (q\\lor q)) \\)"
    "\\( ((q\\supset q)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\lor q) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot q) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( ((q\\supset p)\\supset \\lnot q) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (((p\\lor p)\\equiv q)\\land p) \\)"
    "\\( ((q\\supset q)\\supset (p\\land q)) \\)"
    "\\( (((q\\lor p)\\land q)\\land p) \\)"
    "\\( (p\\land ((p\\equiv p)\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\land (q\\lor p)) \\)"
    "\\( (p\\equiv (q\\land (q\\lor p))) \\)"
    "\\( ((p\\land (p\\equiv p))\\equiv q) \\)"
    "\\( (((q\\lor q)\\lor q)\\equiv p) \\)"
    "\\( (q\\equiv ((q\\lor p)\\land p)) \\)"
    "\\( ((p\\equiv q)\\land (q\\supset p)) \\)"
    "\\( ((p\\supset (q\\land q))\\land q) \\)"
    "\\( (((p\\equiv q)\\land q)\\lor q) \\)"
    "\\( (((q\\supset q)\\lor q)\\equiv q) \\)"
    "\\( (((p\\land q)\\lor q)\\land q) \\)"
    "\\( (((p\\land q)\\supset p)\\supset q) \\)"
    "\\( ((p\\supset (p\\supset q))\\lor q) \\)"
    "\\( (q\\lor \\lnot (p\\land p)) \\)"
    "\\( (p\\supset (p\\supset (q\\equiv p))) \\)"
    "\\( ((q\\equiv (p\\lor q))\\lor q) \\)"
    "\\( ((p\\supset q)\\equiv (p\\supset p)) \\)"
    "\\( (p\\land (p\\land (q\\supset p))) \\)"
    "\\( (((p\\land q)\\supset q)\\equiv p) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv p)) \\)"
    "\\( (p\\equiv (p\\equiv (p\\land p))) \\)"
    "\\( (((q\\supset p)\\land q)\\lor p) \\)"
    "\\( ((p\\equiv p)\\equiv (q\\supset p)) \\)"
    "\\( (p\\equiv ((q\\lor p)\\lor q)) \\)"
    "\\( ((q\\land (p\\supset p))\\supset p) \\)"
    "\\( ((q\\equiv q)\\supset (q\\supset p)) \\)"
    "\\( (p\\lor ((p\\lor q)\\supset p)) \\)"
    "\\( ((p\\equiv \\lnot q)\\lor q) \\)"
    "\\( (((q\\lor p)\\lor p)\\lor q) \\)"
    "\\( (p\\lor (q\\lor (p\\land p))) \\)"
    "\\( (\\lnot (p\\equiv q)\\lor q) \\)"
    "\\( (((q\\lor p)\\supset q)\\equiv q) \\)"
    "\\( ((p\\supset (q\\equiv p))\\lor p) \\)"
    "\\( ((p\\supset (q\\land q))\\lor p) \\)"
    "\\( (p\\supset (p\\land (q\\supset p))) \\)"
    "\\( ((q\\supset p)\\lor (p\\lor q)) \\)"
    "\\( ((q\\supset q)\\lor q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((p\\land \\lnot q)\\land q)\\), \\((\\lnot q\\equiv (p\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot ((p\\land q)\\supset p) \\)"
    "\\( (q\\land (\\lnot q\\land p)) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( \\lnot (q\\supset (p\\equiv p)) \\)"
    "\\( (\\lnot q\\land (p\\supset q)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( (\\lnot q\\equiv (p\\land q)) \\)"
    "\\( \\lnot ((p\\lor q)\\supset p) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land q) \\)"
    "\\( ((q\\supset \\lnot p)\\land q) \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( \\lnot ((q\\equiv q)\\supset p) \\)"
    "\\( (p\\supset (p\\supset \\lnot p)) \\)"
    "\\( ((\\lnot p\\land p)\\equiv p) \\)"
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( \\lnot ((p\\lor q)\\supset q) \\)"
    "\\( (\\lnot (p\\land q)\\land p) \\)"
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (p\\lor q)\\equiv q) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (p\\equiv p)) \\)"
    "\\( ((p\\lor q)\\supset \\lnot q) \\)"
    "\\( (q\\equiv (\\lnot q\\land q)) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (q\\supset \\lnot (p\\land p)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
    "\\( (p\\supset \\lnot (p\\land q)) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( ((p\\supset (q\\land p))\\land p) \\)"
    "\\( (p\\equiv (q\\lor \\lnot p)) \\)"
    "\\( (p\\land ((p\\equiv q)\\lor q)) \\)"
    "\\( ((p\\land q)\\land (q\\land q)) \\)"
    "\\( ((p\\lor q)\\land (p\\equiv q)) \\)"
    "\\( ((q\\lor p)\\supset (p\\land q)) \\)"
    "\\( ((p\\land (q\\supset p))\\equiv q) \\)"
    "\\( (((q\\land p)\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\land (p\\supset q))) \\)"
    "\\( ((p\\supset q)\\equiv (q\\supset p)) \\)"
    "\\( (((q\\equiv p)\\supset p)\\land q) \\)"
    "\\( (q\\land (q\\lor (q\\supset p))) \\)"
    "\\( (q\\equiv (q\\equiv (q\\lor q))) \\)"
    "\\( (q\\land (p\\equiv (p\\land q))) \\)"
    "\\( (((p\\supset p)\\lor p)\\supset q) \\)"
    "\\( (p\\equiv ((q\\supset p)\\equiv q)) \\)"
    "\\( (((p\\lor p)\\supset q)\\lor q) \\)"
    "\\( ((q\\land (q\\land p))\\equiv p) \\)"
    "\\( (((p\\land q)\\lor p)\\supset q) \\)"
    "\\( ((\\lnot q\\supset p)\\supset q) \\)"
    "\\( ((p\\equiv q)\\equiv q) \\)"
    "\\( ((p\\equiv p)\\land (p\\lor p)) \\)"
    "\\( (p\\equiv ((q\\land p)\\supset p)) \\)"
    "\\( ((p\\land p)\\lor (p\\lor p)) \\)"
    "\\( (p\\land (\\lnot q\\supset p)) \\)"
    "\\( ((q\\land (q\\lor q))\\supset p) \\)"
    "\\( (((p\\equiv q)\\supset p)\\equiv p) \\)"
    "\\( (((p\\supset q)\\equiv p)\\equiv q) \\)"
    "\\( (((q\\lor q)\\supset p)\\lor p) \\)"
    "\\( (\\lnot q\\lor (q\\land p)) \\)"
    "\\( ((q\\supset q)\\land (q\\lor p)) \\)"
    "\\( (((p\\equiv p)\\supset q)\\lor p) \\)"
    "\\( ((q\\lor q)\\lor p) \\)"
    "\\( ((p\\land \\lnot q)\\lor q) \\)"
    "\\( (((q\\equiv p)\\lor p)\\equiv p) \\)"
    "\\( (q\\supset ((p\\equiv q)\\supset q)) \\)"
    "\\( (((p\\supset p)\\supset q)\\supset q) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\equiv q)) \\)"
    "\\( (q\\equiv ((p\\supset p)\\supset q)) \\)"
    "\\( (p\\lor (p\\supset (q\\equiv q))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\lor (p\\supset p))\\), \\((q\\equiv \\lnot (q\\supset p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land (\\lnot p\\equiv p)) \\)"
    "\\( (p\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot (q\\lor \\lnot q) \\)"
    "\\( (q\\land (\\lnot q\\equiv q)) \\)"
    "\\( (p\\land (\\lnot q\\land q)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot (q\\lor p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot p) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( \\lnot (q\\supset (q\\land p)) \\)"
    "\\( ((p\\supset \\lnot q)\\land q) \\)"
    "\\( (q\\equiv (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( (p\\equiv (p\\land \\lnot p)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((p\\land p)\\land p) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset p) \\)"
    "\\( (p\\supset \\lnot (q\\supset p)) \\)"
    "\\( \\lnot (p\\equiv (q\\land p)) \\)"
    "\\( (p\\land \\lnot (q\\equiv p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land p) \\)"
    "\\( ((q\\supset \\lnot q)\\land p) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot q) \\)"
    "\\( ((q\\supset q)\\supset \\lnot q) \\)"
    "\\( (q\\supset \\lnot (q\\lor q)) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( ((q\\lor q)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (q\\land p)) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( (p\\land (\\lnot q\\supset q)) \\)"
    "\\( ((q\\supset p)\\equiv q) \\)"
    "\\( ((p\\supset (q\\land q))\\land p) \\)"
    "\\( ((q\\supset (p\\land p))\\equiv q) \\)"
    "\\( ((p\\land (p\\land q))\\land q) \\)"
    "\\( ((q\\land q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\lor (q\\land p)) \\)"
    "\\( (q\\equiv (p\\land (q\\supset p))) \\)"
    "\\( (p\\equiv ((q\\land p)\\lor q)) \\)"
    "\\( (((p\\supset p)\\land p)\\equiv q) \\)"
    "\\( ((q\\equiv (q\\supset q))\\lor q) \\)"
    "\\( (q\\land ((q\\supset p)\\supset q)) \\)"
    "\\( ((q\\lor q)\\land q) \\)"
    "\\( (q\\equiv (\\lnot q\\lor q)) \\)"
    "\\( (((q\\lor q)\\equiv q)\\supset q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\lor q) \\)"
    "\\( (p\\supset ((p\\supset p)\\land q)) \\)"
    "\\( (((p\\land q)\\equiv p)\\lor q) \\)"
    "\\( ((q\\lor q)\\lor \\lnot p) \\)"
    "\\( (((p\\land q)\\land p)\\equiv p) \\)"
    "\\( (p\\land ((p\\supset q)\\supset p)) \\)"
    "\\( (p\\equiv (q\\equiv q)) \\)"
    "\\( (p\\lor (p\\lor (q\\land p))) \\)"
    "\\( ((q\\lor (q\\supset p))\\supset p) \\)"
    "\\( (((q\\supset q)\\supset p)\\lor p) \\)"
    "\\( (p\\lor ((q\\land p)\\equiv q)) \\)"
    "\\( (q\\supset (q\\equiv (p\\land q))) \\)"
    "\\( (((q\\supset p)\\equiv q)\\equiv q) \\)"
    "\\( (((p\\lor q)\\lor q)\\supset p) \\)"
    "\\( (q\\supset ((p\\lor p)\\land q)) \\)"
    "\\( ((p\\equiv (p\\land q))\\supset q) \\)"
    "\\( ((q\\lor p)\\land (p\\lor q)) \\)"
    "\\( ((p\\equiv q)\\supset (p\\lor q)) \\)"
    "\\( ((q\\lor (q\\lor p))\\lor p) \\)"
    "\\( (((p\\equiv q)\\lor q)\\equiv q) \\)"
    "\\( (q\\supset (p\\equiv (q\\land p))) \\)"
    "\\( ((q\\equiv q)\\land (p\\equiv p)) \\)"
    "\\( (p\\supset (q\\supset (q\\lor q))) \\)"
    "\\( ((p\\supset q)\\lor (p\\lor p)) \\)"
    "\\( ((p\\equiv (p\\supset p))\\supset p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\land \\lnot q)\\land q)\\), \\((q\\land ((p\\land p)\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\supset \\lnot p)\\equiv p) \\)"
    "\\( (p\\land (\\lnot p\\land p)) \\)"
    "\\( \\lnot (p\\supset (q\\supset q)) \\)"
    "\\( \\lnot ((q\\land q)\\equiv q) \\)"
    "\\( ((p\\land p)\\land \\lnot p) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( \\lnot ((q\\lor q)\\supset p) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( ((\\lnot p\\land q)\\land q) \\)"
    "\\( \\lnot (q\\equiv (p\\land q)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor p)) \\)"
    "\\( \\lnot (p\\land (q\\lor p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\land p) \\)"
    "\\( (p\\equiv \\lnot (q\\equiv q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\equiv p) \\)"
    "\\( (p\\equiv (\\lnot q\\land q)) \\)"
    "\\( ((p\\equiv \\lnot q)\\land p) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor q) \\)"
    "\\( \\lnot (p\\supset (q\\equiv p)) \\)"
    "\\( ((\\lnot q\\equiv q)\\equiv q) \\)"
    "\\( ((q\\land \\lnot q)\\equiv q) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\land \\lnot p)) \\)"
    "\\( (q\\supset \\lnot (q\\lor q)) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\land (p\\lor p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\land p) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (p\\land (p\\equiv (q\\land q))) \\)"
    "\\( (((p\\lor p)\\land p)\\land q) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\lor p)) \\)"
    "\\( (p\\land (q\\land (q\\equiv q))) \\)"
    "\\( ((p\\supset p)\\supset (p\\land q)) \\)"
    "\\( ((q\\lor q)\\equiv p) \\)"
    "\\( (q\\equiv (p\\lor (q\\land p))) \\)"
    "\\( (((q\\supset q)\\equiv q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( (((p\\supset p)\\supset p)\\equiv q) \\)"
    "\\( (q\\land (\\lnot q\\supset q)) \\)"
    "\\( (((p\\land q)\\equiv p)\\land q) \\)"
    "\\( ((q\\lor (q\\land q))\\lor q) \\)"
    "\\( (((p\\supset p)\\lor q)\\supset q) \\)"
    "\\( ((q\\equiv q)\\supset (q\\lor q)) \\)"
    "\\( (((q\\lor p)\\lor p)\\supset q) \\)"
    "\\( (p\\supset ((p\\equiv q)\\equiv p)) \\)"
    "\\( (((q\\supset p)\\supset p)\\supset q) \\)"
    "\\( ((p\\supset q)\\lor (q\\equiv p)) \\)"
    "\\( (((q\\supset q)\\equiv p)\\supset q) \\)"
    "\\( ((p\\supset p)\\supset (p\\land p)) \\)"
    "\\( ((p\\lor \\lnot p)\\equiv p) \\)"
    "\\( ((q\\land (q\\land p))\\lor p) \\)"
    "\\( ((p\\equiv (q\\supset p))\\land p) \\)"
    "\\( ((p\\land p)\\lor (p\\land p)) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\supset p) \\)"
    "\\( ((q\\supset p)\\land (p\\supset p)) \\)"
    "\\( (q\\supset ((q\\supset p)\\land q)) \\)"
    "\\( (q\\equiv ((q\\land p)\\land q)) \\)"
    "\\( ((q\\supset p)\\lor (q\\land p)) \\)"
    "\\( (((p\\land p)\\lor q)\\lor p) \\)"
    "\\( ((q\\equiv (q\\land p))\\equiv p) \\)"
    "\\( (q\\equiv (p\\equiv (q\\land p))) \\)"
    "\\( (((q\\land p)\\lor p)\\lor q) \\)"
    "\\( (q\\lor (p\\lor (p\\land q))) \\)"
    "\\( ((p\\land p)\\lor (q\\equiv q)) \\)"
    "\\( ((p\\equiv \\lnot p)\\supset p) \\)"
    "\\( (p\\supset (p\\supset (p\\supset p))) \\)"
    "\\( ((p\\land q)\\lor (q\\equiv q)) \\)"
    "\\( (((q\\lor q)\\supset q)\\lor q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\land p)\\equiv p)\\), \\(((q\\land (p\\supset q))\\equiv p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\land q)\\equiv q) \\)"
    "\\( \\lnot ((q\\supset p)\\lor q) \\)"
    "\\( \\lnot ((p\\land q)\\supset q) \\)"
    "\\( \\lnot ((q\\supset p)\\lor q) \\)"
    "\\( (\\lnot q\\land q) \\)"
    "\\( ((p\\equiv q)\\land \\lnot p) \\)"
    "\\( \\lnot ((p\\lor q)\\lor p) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv p) \\)"
    "\\( \\lnot (p\\lor \\lnot q) \\)"
    "\\( (\\lnot (q\\land p)\\land q) \\)"
    "\\( (q\\land (q\\equiv \\lnot p)) \\)"
    "\\( \\lnot (q\\equiv (q\\land p)) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( (\\lnot p\\equiv (p\\equiv p)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( (p\\supset (q\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((q\\supset q)\\supset p) \\)"
    "\\( (p\\land \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot (q\\equiv (q\\lor p)) \\)"
    "\\( (\\lnot (q\\land p)\\equiv p) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( (p\\land (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv q) \\)"
    "\\( (q\\supset (\\lnot q\\equiv q)) \\)"
    "\\( (p\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( \\lnot (q\\lor q) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( \\lnot (q\\land p) \\)"
    "\\( \\lnot (q\\land (q\\land p)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\land q)) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( ((p\\land (p\\equiv q))\\land q) \\)"
    "\\( (q\\land ((q\\supset p)\\land p)) \\)"
    "\\( ((q\\supset (p\\land q))\\land q) \\)"
    "\\( ((p\\lor (q\\supset p))\\land q) \\)"
    "\\( ((p\\land p)\\land (q\\land p)) \\)"
    "\\( (p\\equiv (q\\land (q\\supset q))) \\)"
    "\\( (q\\equiv (p\\equiv (p\\equiv p))) \\)"
    "\\( (q\\equiv ((p\\land p)\\land p)) \\)"
    "\\( (((q\\supset q)\\supset q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv \\lnot q) \\)"
    "\\( (q\\land ((p\\land p)\\equiv p)) \\)"
    "\\( (q\\land ((q\\lor q)\\lor p)) \\)"
    "\\( (q\\equiv (q\\supset (p\\equiv p))) \\)"
    "\\( ((p\\equiv (q\\lor q))\\equiv p) \\)"
    "\\( (q\\land (p\\supset (p\\equiv p))) \\)"
    "\\( (p\\supset ((q\\equiv q)\\land q)) \\)"
    "\\( (p\\supset (p\\land (q\\equiv p))) \\)"
    "\\( ((p\\land \\lnot q)\\supset q) \\)"
    "\\( (p\\supset ((p\\equiv q)\\land q)) \\)"
    "\\( (p\\supset ((p\\lor q)\\equiv q)) \\)"
    "\\( (p\\land ((p\\land q)\\supset q)) \\)"
    "\\( (p\\lor (p\\land (q\\land p))) \\)"
    "\\( (p\\land (q\\supset (p\\supset q))) \\)"
    "\\( ((q\\equiv (p\\lor p))\\equiv q) \\)"
    "\\( ((p\\supset \\lnot p)\\supset p) \\)"
    "\\( ((q\\lor q)\\supset (p\\land q)) \\)"
    "\\( ((q\\land (p\\equiv p))\\supset p) \\)"
    "\\( (((q\\lor p)\\lor q)\\equiv p) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\supset p) \\)"
    "\\( (q\\supset (p\\equiv q)) \\)"
    "\\( ((q\\land q)\\lor (q\\lor p)) \\)"
    "\\( ((p\\land (p\\equiv p))\\lor q) \\)"
    "\\( ((q\\supset p)\\supset (p\\land p)) \\)"
    "\\( ((q\\lor q)\\equiv (p\\supset q)) \\)"
    "\\( (((p\\supset q)\\supset p)\\lor q) \\)"
    "\\( ((q\\equiv p)\\lor (q\\lor p)) \\)"
    "\\( ((p\\lor p)\\supset (p\\supset p)) \\)"
    "\\( (q\\equiv (q\\land (q\\equiv q))) \\)"
    "\\( (q\\lor ((p\\land p)\\supset p)) \\)"
    "\\( ((p\\lor q)\\lor (q\\supset q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(q\\land (\\lnot q\\land q))\\), \\((((p\\lor q)\\equiv p)\\supset q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\lor (p\\supset q)) \\)"
    "\\( ((\\lnot p\\equiv p)\\land q) \\)"
    "\\( \\lnot ((q\\equiv q)\\lor p) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( (\\lnot (q\\lor q)\\land q) \\)"
    "\\( (\\lnot p\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( ((\\lnot q\\land p)\\equiv q) \\)"
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor p)\\supset p) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( \\lnot (p\\lor (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor p) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( (p\\equiv \\lnot (p\\supset p)) \\)"
    "\\( \\lnot (p\\land (p\\lor q)) \\)"
    "\\( (p\\supset (p\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\land (q\\supset p)) \\)"
    "\\( \\lnot (q\\equiv (q\\equiv p)) \\)"
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( \\lnot (p\\supset (p\\equiv q)) \\)"
    "\\( (p\\land \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot (q\\land p)\\equiv p) \\)"
    "\\( ((\\lnot q\\equiv p)\\land p) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (q\\equiv (p\\supset p)) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( ((q\\supset p)\\supset \\lnot q) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( \\lnot (q\\land p) \\)"
    "\\( \\lnot ((p\\equiv q)\\land p) \\)"
    "\\( (((q\\land p)\\land p)\\land q) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv q)) \\)"
    "\\( ((p\\land q)\\land (q\\land q)) \\)"
    "\\( (((q\\supset p)\\lor p)\\equiv q) \\)"
    "\\( (p\\land ((q\\equiv p)\\lor q)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\supset q)) \\)"
    "\\( (q\\equiv (p\\land (q\\supset p))) \\)"
    "\\( (((q\\lor q)\\lor q)\\equiv p) \\)"
    "\\( (q\\equiv (p\\land (q\\equiv q))) \\)"
    "\\( ((q\\land (q\\land q))\\equiv p) \\)"
    "\\( (((q\\land q)\\equiv p)\\equiv p) \\)"
    "\\( (q\\land (\\lnot p\\supset q)) \\)"
    "\\( ((p\\equiv p)\\land (q\\lor q)) \\)"
    "\\( (q\\lor ((p\\equiv p)\\supset q)) \\)"
    "\\( (q\\land ((p\\land q)\\supset p)) \\)"
    "\\( (p\\supset (p\\land (q\\land p))) \\)"
    "\\( ((p\\supset q)\\equiv (q\\supset q)) \\)"
    "\\( (p\\supset ((q\\lor q)\\land p)) \\)"
    "\\( (q\\lor ((p\\lor p)\\equiv q)) \\)"
    "\\( ((p\\lor q)\\supset q) \\)"
    "\\( (p\\land (p\\land (p\\equiv p))) \\)"
    "\\( (p\\land (p\\lor q)) \\)"
    "\\( ((p\\lor (q\\supset q))\\supset p) \\)"
    "\\( ((p\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\lor q)) \\)"
    "\\( (q\\supset (p\\lor (q\\equiv p))) \\)"
    "\\( (((q\\equiv p)\\land p)\\equiv q) \\)"
    "\\( ((q\\land (p\\land q))\\equiv q) \\)"
    "\\( ((q\\supset p)\\equiv (q\\equiv q)) \\)"
    "\\( (q\\supset (p\\lor (q\\equiv p))) \\)"
    "\\( ((p\\equiv (p\\supset p))\\lor q) \\)"
    "\\( (q\\lor ((p\\land q)\\lor p)) \\)"
    "\\( (\\lnot q\\supset (p\\land p)) \\)"
    "\\( ((p\\lor q)\\land (p\\equiv p)) \\)"
    "\\( (p\\lor ((q\\lor q)\\land q)) \\)"
    "\\( ((q\\supset q)\\lor (q\\equiv p)) \\)"
    "\\( ((\\lnot p\\lor p)\\lor q) \\)"
    "\\( (p\\supset (p\\supset p)) \\)"
    "\\( (p\\lor ((p\\land p)\\supset p)) \\)"
    "\\( ((q\\land (p\\land q))\\supset q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(p\\land (p\\equiv \\lnot p))\\), \\((((p\\lor p)\\supset q)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land \\lnot (q\\supset q)) \\)"
    "\\( \\lnot (q\\supset (q\\land q)) \\)"
    "\\( (\\lnot (p\\lor q)\\land q) \\)"
    "\\( (\\lnot (p\\lor q)\\land p) \\)"
    "\\( \\lnot (\\lnot p\\lor p) \\)"
    "\\( \\lnot ((q\\lor p)\\lor q) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( ((q\\equiv p)\\land \\lnot p) \\)"
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (q\\land (q\\equiv \\lnot p)) \\)"
    "\\( ((q\\land q)\\land \\lnot p) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( \\lnot (q\\equiv (p\\land q)) \\)"
    "\\( ((p\\equiv p)\\equiv \\lnot p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( \\lnot (p\\lor (p\\land p)) \\)"
    "\\( (p\\supset (q\\land \\lnot p)) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( ((p\\equiv \\lnot q)\\land p) \\)"
    "\\( ((q\\supset \\lnot p)\\land p) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv q) \\)"
    "\\( (\\lnot (p\\land q)\\equiv p) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv q) \\)"
    "\\( \\lnot ((p\\lor q)\\land q) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv q) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( (q\\supset \\lnot (p\\supset p)) \\)"
    "\\( \\lnot (q\\land (q\\equiv q)) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( \\lnot ((q\\land q)\\equiv p) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( \\lnot (q\\land (p\\land p)) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( ((q\\lor (p\\land q))\\land p) \\)"
    "\\( ((p\\supset p)\\equiv (q\\land p)) \\)"
    "\\( ((p\\land (p\\land q))\\land q) \\)"
    "\\( (q\\equiv (q\\supset (p\\lor p))) \\)"
    "\\( (p\\equiv (p\\supset (p\\equiv q))) \\)"
    "\\( ((q\\land (q\\land q))\\equiv p) \\)"
    "\\( ((q\\land p)\\lor (q\\equiv p)) \\)"
    "\\( (((p\\equiv p)\\supset p)\\equiv q) \\)"
    "\\( ((q\\supset p)\\equiv (p\\supset q)) \\)"
    "\\( (q\\equiv (p\\equiv (q\\supset q))) \\)"
    "\\( (((q\\lor q)\\supset q)\\supset q) \\)"
    "\\( (q\\equiv (p\\supset (p\\supset p))) \\)"
    "\\( (((q\\equiv q)\\land q)\\land q) \\)"
    "\\( (q\\land ((p\\equiv p)\\equiv q)) \\)"
    "\\( (((p\\equiv p)\\lor p)\\land q) \\)"
    "\\( (((p\\land q)\\lor p)\\supset q) \\)"
    "\\( (p\\supset (p\\equiv (p\\supset q))) \\)"
    "\\( (p\\supset ((p\\lor q)\\supset q)) \\)"
    "\\( ((p\\land p)\\supset (q\\lor q)) \\)"
    "\\( ((p\\equiv (q\\land q))\\lor q) \\)"
    "\\( (p\\lor (q\\land (p\\land p))) \\)"
    "\\( (p\\land (q\\lor (p\\supset p))) \\)"
    "\\( (p\\lor ((p\\land q)\\land q)) \\)"
    "\\( (p\\land p) \\)"
    "\\( ((p\\supset (q\\lor p))\\land p) \\)"
    "\\( (p\\lor (p\\lor (q\\supset p))) \\)"
    "\\( (q\\supset ((p\\supset p)\\supset p)) \\)"
    "\\( ((p\\supset p)\\supset (q\\supset p)) \\)"
    "\\( ((q\\equiv p)\\equiv (p\\supset q)) \\)"
    "\\( (q\\equiv (p\\land q)) \\)"
    "\\( (q\\equiv (p\\supset q)) \\)"
    "\\( (p\\lor ((q\\supset p)\\supset q)) \\)"
    "\\( ((p\\lor (q\\equiv p))\\equiv p) \\)"
    "\\( ((\\lnot q\\equiv p)\\lor q) \\)"
    "\\( (((p\\supset q)\\lor q)\\supset q) \\)"
    "\\( ((q\\supset (p\\land p))\\lor q) \\)"
    "\\( (q\\lor ((q\\supset q)\\lor p)) \\)"
    "\\( ((p\\land (p\\supset q))\\supset p) \\)"
    "\\( (((q\\land p)\\lor q)\\supset q) \\)"
    "\\( (((q\\supset q)\\land q)\\supset q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((p\\land q)\\land \\lnot p)\\), \\(((\\lnot q\\land p)\\lor p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot p\\land p)\\land q) \\)"
    "\\( ((\\lnot q\\land q)\\land p) \\)"
    "\\( (\\lnot (p\\supset p)\\land q) \\)"
    "\\( (p\\land (q\\land \\lnot q)) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor p) \\)"
    "\\( (\\lnot p\\land \\lnot q) \\)"
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\supset q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\supset p) \\)"
    "\\( ((\\lnot p\\equiv q)\\land q) \\)"
    "\\( (q\\land (p\\supset \\lnot p)) \\)"
    "\\( ((q\\land q)\\land \\lnot p) \\)"
    "\\( (q\\land (q\\land \\lnot p)) \\)"
    "\\( (\\lnot (q\\supset p)\\land q) \\)"
    "\\( (p\\equiv \\lnot (p\\supset p)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset q)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\land (p\\land p)) \\)"
    "\\( \\lnot (\\lnot p\\supset p) \\)"
    "\\( (p\\land \\lnot q) \\)"
    "\\( (\\lnot (q\\land q)\\land p) \\)"
    "\\( (p\\land \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot (p\\supset q) \\)"
    "\\( (p\\land (q\\supset \\lnot p)) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( ((p\\equiv p)\\land \\lnot q) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (p\\equiv (p\\land \\lnot q)) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( \\lnot ((q\\land p)\\land p) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( (q\\supset (p\\equiv \\lnot q)) \\)"
    "\\( ((p\\supset p)\\land (p\\land q)) \\)"
    "\\( (q\\land ((q\\lor p)\\equiv p)) \\)"
    "\\( (q\\land ((q\\lor p)\\equiv p)) \\)"
    "\\( (p\\equiv (p\\supset (p\\supset q))) \\)"
    "\\( (q\\land ((p\\supset p)\\supset p)) \\)"
    "\\( (q\\equiv (q\\equiv (p\\equiv q))) \\)"
    "\\( (((p\\equiv p)\\supset q)\\equiv p) \\)"
    "\\( ((p\\equiv p)\\land (q\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\equiv q)) \\)"
    "\\( (p\\equiv (q\\lor q)) \\)"
    "\\( ((q\\lor q)\\land (q\\lor p)) \\)"
    "\\( ((p\\lor \\lnot p)\\equiv q) \\)"
    "\\( (q\\land (p\\supset (p\\lor p))) \\)"
    "\\( ((p\\equiv (p\\lor p))\\land q) \\)"
    "\\( ((p\\supset (p\\supset p))\\equiv q) \\)"
    "\\( ((p\\supset q)\\lor \\lnot p) \\)"
    "\\( (p\\supset (p\\equiv (p\\equiv q))) \\)"
    "\\( (q\\lor (p\\equiv (q\\land q))) \\)"
    "\\( (q\\equiv ((q\\lor p)\\lor q)) \\)"
    "\\( \\lnot \\lnot (p\\supset q) \\)"
    "\\( (((q\\supset q)\\lor q)\\equiv p) \\)"
    "\\( ((p\\lor (p\\land p))\\lor p) \\)"
    "\\( (p\\lor ((q\\supset p)\\land q)) \\)"
    "\\( ((p\\supset (p\\supset p))\\supset p) \\)"
    "\\( (((p\\lor p)\\equiv p)\\equiv p) \\)"
    "\\( (q\\supset ((q\\lor p)\\supset p)) \\)"
    "\\( ((p\\equiv (q\\lor q))\\lor p) \\)"
    "\\( (p\\lor (\\lnot q\\lor p)) \\)"
    "\\( (q\\supset ((p\\lor p)\\lor p)) \\)"
    "\\( ((q\\lor (p\\lor p))\\equiv p) \\)"
    "\\( (p\\lor ((q\\supset q)\\land q)) \\)"
    "\\( (((q\\lor q)\\supset p)\\supset p) \\)"
    "\\( (((q\\land q)\\equiv p)\\supset q) \\)"
    "\\( (p\\equiv ((p\\land q)\\equiv q)) \\)"
    "\\( (\\lnot (q\\equiv p)\\lor p) \\)"
    "\\( ((p\\land q)\\equiv (q\\land p)) \\)"
    "\\( ((q\\equiv q)\\lor (q\\supset p)) \\)"
    "\\( ((q\\land (q\\supset p))\\supset p) \\)"
    "\\( (((p\\land q)\\lor p)\\equiv p) \\)"
    "\\( (((p\\supset q)\\equiv p)\\supset q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv \\lnot q)\\), \\((q\\supset ((q\\lor p)\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land (q\\land \\lnot q)) \\)"
    "\\( (q\\land \\lnot (q\\lor q)) \\)"
    "\\( ((p\\land q)\\land \\lnot q) \\)"
    "\\( \\lnot (q\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot (p\\equiv p)\\land p) \\)"
    "\\( \\lnot (p\\lor (q\\lor p)) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( (\\lnot p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( (q\\land \\lnot (p\\land q)) \\)"
    "\\( (\\lnot (q\\land p)\\land q) \\)"
    "\\( (q\\land \\lnot (p\\lor p)) \\)"
    "\\( ((q\\supset \\lnot p)\\land q) \\)"
    "\\( \\lnot (q\\supset (p\\lor p)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((p\\supset p)\\supset p) \\)"
    "\\( \\lnot (p\\land (p\\equiv p)) \\)"
    "\\( \\lnot (p\\land (q\\lor p)) \\)"
    "\\( (\\lnot p\\land (q\\equiv q)) \\)"
    "\\( (\\lnot (q\\lor q)\\land p) \\)"
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( (\\lnot (q\\land p)\\land p) \\)"
    "\\( (p\\land (\\lnot q\\equiv p)) \\)"
    "\\( (p\\land \\lnot (p\\land q)) \\)"
    "\\( (\\lnot q\\land \\lnot q) \\)"
    "\\( (q\\equiv (q\\land \\lnot q)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv q) \\)"
    "\\( ((\\lnot q\\land q)\\equiv q) \\)"
    "\\( (q\\equiv (p\\land \\lnot p)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((q\\lor q)\\land p) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( ((q\\supset p)\\land (q\\land q)) \\)"
    "\\( (p\\land (q\\land (q\\land q))) \\)"
    "\\( (((p\\equiv q)\\lor p)\\equiv q) \\)"
    "\\( ((q\\lor p)\\land (p\\equiv q)) \\)"
    "\\( (p\\land ((q\\equiv p)\\equiv p)) \\)"
    "\\( (((p\\supset q)\\supset p)\\equiv q) \\)"
    "\\( (q\\equiv ((p\\lor q)\\land p)) \\)"
    "\\( ((p\\lor (p\\land p))\\equiv q) \\)"
    "\\( (q\\equiv (p\\equiv (q\\supset q))) \\)"
    "\\( (p\\equiv (q\\land (p\\supset q))) \\)"
    "\\( (p\\equiv ((p\\land p)\\equiv q)) \\)"
    "\\( (q\\lor ((q\\equiv p)\\land q)) \\)"
    "\\( (q\\equiv (p\\lor (p\\supset q))) \\)"
    "\\( (q\\equiv (p\\lor (p\\supset q))) \\)"
    "\\( (((q\\land q)\\equiv p)\\equiv p) \\)"
    "\\( (p\\equiv (p\\land (q\\land p))) \\)"
    "\\( (\\lnot q\\supset (p\\equiv q)) \\)"
    "\\( ((q\\equiv (q\\equiv p))\\supset q) \\)"
    "\\( (q\\lor ((p\\lor q)\\equiv q)) \\)"
    "\\( ((p\\supset q)\\lor (q\\land p)) \\)"
    "\\( (((q\\lor q)\\equiv q)\\supset p) \\)"
    "\\( ((q\\equiv q)\\supset (p\\lor p)) \\)"
    "\\( (p\\land ((q\\land p)\\supset p)) \\)"
    "\\( ((q\\supset (q\\lor q))\\equiv p) \\)"
    "\\( (p\\land ((q\\supset p)\\equiv p)) \\)"
    "\\( (q\\equiv (q\\land (q\\land p))) \\)"
    "\\( ((\\lnot q\\supset p)\\equiv p) \\)"
    "\\( ((q\\equiv (p\\supset q))\\supset p) \\)"
    "\\( (q\\supset ((p\\equiv p)\\land p)) \\)"
    "\\( (\\lnot (q\\lor p)\\lor p) \\)"
    "\\( (q\\lor (p\\lor (q\\land q))) \\)"
    "\\( (\\lnot (q\\lor p)\\supset p) \\)"
    "\\( ((q\\lor p)\\land (q\\equiv q)) \\)"
    "\\( (p\\lor (q\\equiv (q\\supset q))) \\)"
    "\\( ((q\\equiv p)\\equiv (p\\land q)) \\)"
    "\\( ((p\\lor p)\\lor (p\\supset p)) \\)"
    "\\( ((q\\lor (p\\land q))\\equiv q) \\)"
    "\\( ((p\\lor (q\\supset q))\\lor p) \\)"
    "\\( ((q\\equiv q)\\lor p) \\)"
    "\\( (p\\supset ((q\\lor p)\\equiv p)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\equiv (p\\land p))\\), \\(((p\\equiv (p\\supset p))\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((p\\land p)\\supset p) \\)"
    "\\( (\\lnot p\\land (p\\lor p)) \\)"
    "\\( \\lnot (p\\lor (q\\supset q)) \\)"
    "\\( ((p\\land p)\\land \\lnot p) \\)"
    "\\( \\lnot (q\\supset (p\\equiv p)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( \\lnot (q\\supset (p\\lor p)) \\)"
    "\\( (\\lnot (p\\land q)\\land q) \\)"
    "\\( ((p\\equiv \\lnot q)\\land q) \\)"
    "\\( (q\\equiv \\lnot (q\\land p)) \\)"
    "\\( (\\lnot p\\land (q\\lor q)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( \\lnot (p\\lor (p\\land p)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (p\\lor q)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( (\\lnot q\\land (p\\lor q)) \\)"
    "\\( \\lnot (p\\supset (p\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land p) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( (\\lnot q\\land \\lnot q) \\)"
    "\\( (q\\supset (\\lnot p\\equiv p)) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv q) \\)"
    "\\( (q\\equiv (q\\equiv \\lnot q)) \\)"
    "\\( (\\lnot q\\land (q\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (q\\land p)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( (p\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot (p\\land (q\\lor q)) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( (((q\\lor p)\\land p)\\land q) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\land q)) \\)"
    "\\( (q\\land ((q\\equiv q)\\land p)) \\)"
    "\\( (((q\\lor p)\\supset q)\\land p) \\)"
    "\\( ((q\\land q)\\land p) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\equiv q)) \\)"
    "\\( ((p\\lor q)\\equiv (p\\land q)) \\)"
    "\\( ((q\\equiv p)\\land (p\\equiv q)) \\)"
    "\\( ((p\\lor (p\\lor p))\\equiv q) \\)"
    "\\( ((q\\equiv (p\\equiv q))\\equiv q) \\)"
    "\\( (q\\land ((p\\lor p)\\supset q)) \\)"
    "\\( (q\\equiv (q\\supset (q\\lor q))) \\)"
    "\\( (((q\\land q)\\equiv p)\\equiv p) \\)"
    "\\( (q\\equiv (q\\equiv q)) \\)"
    "\\( (((p\\supset p)\\land q)\\lor q) \\)"
    "\\( ((p\\land (q\\supset p))\\supset q) \\)"
    "\\( ((q\\lor p)\\supset (p\\supset q)) \\)"
    "\\( (p\\supset (q\\land (q\\lor p))) \\)"
    "\\( (p\\supset ((q\\lor q)\\land q)) \\)"
    "\\( (q\\lor (q\\lor (p\\equiv q))) \\)"
    "\\( ((q\\supset (p\\land p))\\land p) \\)"
    "\\( (\\lnot (q\\equiv q)\\lor p) \\)"
    "\\( (p\\land ((q\\supset q)\\lor p)) \\)"
    "\\( (p\\land (p\\lor (p\\equiv q))) \\)"
    "\\( ((p\\equiv p)\\supset (p\\land p)) \\)"
    "\\( (((q\\lor p)\\land q)\\supset p) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\land q)) \\)"
    "\\( (q\\supset (p\\lor (q\\land p))) \\)"
    "\\( ((q\\supset p)\\equiv (p\\equiv p)) \\)"
    "\\( (q\\supset ((p\\lor q)\\equiv p)) \\)"
    "\\( (q\\lor (p\\land \\lnot q)) \\)"
    "\\( (((q\\land q)\\lor p)\\lor q) \\)"
    "\\( ((q\\land q)\\lor (p\\land p)) \\)"
    "\\( (q\\lor (p\\land p)) \\)"
    "\\( ((q\\lor p)\\lor p) \\)"
    "\\( ((q\\equiv p)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\supset (p\\supset q))\\lor p) \\)"
    "\\( ((q\\supset q)\\equiv (q\\equiv q)) \\)"
    "\\( (q\\supset (p\\supset (p\\lor p))) \\)"
    "\\( (\\lnot (p\\lor p)\\lor p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(p\\land \\lnot (p\\land p))\\), \\((p\\lor ((q\\land p)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot q\\land q)\\land q) \\)"
    "\\( (p\\land (\\lnot p\\land q)) \\)"
    "\\( \\lnot ((p\\land q)\\supset q) \\)"
    "\\( (\\lnot (p\\equiv p)\\land p) \\)"
    "\\( (p\\land (\\lnot p\\land p)) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( (p\\equiv (q\\land \\lnot p)) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\supset p) \\)"
    "\\( (\\lnot p\\land (q\\lor p)) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor p) \\)"
    "\\( (q\\land (q\\equiv \\lnot p)) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( (p\\supset (\\lnot p\\land q)) \\)"
    "\\( ((p\\lor q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv p) \\)"
    "\\( \\lnot (p\\lor (q\\land p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\equiv q) \\)"
    "\\( ((p\\land p)\\land \\lnot q) \\)"
    "\\( \\lnot (p\\supset (q\\equiv p)) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\lor q)\\land p) \\)"
    "\\( ((q\\supset \\lnot q)\\land p) \\)"
    "\\( \\lnot q \\)"
    "\\( (q\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\supset p)\\land q) \\)"
    "\\( \\lnot ((q\\equiv q)\\land q) \\)"
    "\\( ((p\\equiv \\lnot q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( ((q\\lor q)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land q) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( \\lnot ((q\\equiv p)\\land p) \\)"
    "\\( ((q\\equiv (p\\lor p))\\land p) \\)"
    "\\( ((p\\equiv q)\\land (q\\lor p)) \\)"
    "\\( ((q\\equiv (q\\lor p))\\land p) \\)"
    "\\( (((q\\land p)\\equiv q)\\land q) \\)"
    "\\( ((p\\equiv (q\\land p))\\equiv p) \\)"
    "\\( \\lnot (\\lnot p\\equiv q) \\)"
    "\\( (p\\equiv (q\\land (q\\lor p))) \\)"
    "\\( (q\\equiv (p\\land (p\\land p))) \\)"
    "\\( (\\lnot \\lnot p\\equiv q) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\land q)) \\)"
    "\\( ((q\\supset (p\\land q))\\supset q) \\)"
    "\\( (q\\lor (q\\land (p\\equiv q))) \\)"
    "\\( ((q\\equiv (p\\land p))\\equiv p) \\)"
    "\\( (q\\land (p\\lor q)) \\)"
    "\\( (q\\lor ((p\\supset p)\\land q)) \\)"
    "\\( (\\lnot (p\\land p)\\lor q) \\)"
    "\\( ((q\\lor p)\\equiv (q\\lor q)) \\)"
    "\\( ((p\\supset (q\\land q))\\lor q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\lor q) \\)"
    "\\( (((p\\land q)\\land q)\\equiv p) \\)"
    "\\( (p\\lor ((q\\equiv q)\\supset p)) \\)"
    "\\( (p\\lor ((q\\equiv p)\\equiv q)) \\)"
    "\\( (p\\lor (q\\land \\lnot q)) \\)"
    "\\( (p\\land (q\\supset (p\\lor p))) \\)"
    "\\( (p\\lor ((p\\land p)\\land q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\supset p)) \\)"
    "\\( (p\\lor \\lnot (p\\lor q)) \\)"
    "\\( (q\\equiv ((p\\lor p)\\land q)) \\)"
    "\\( ((p\\lor q)\\supset (p\\lor p)) \\)"
    "\\( ((q\\land (p\\land q))\\equiv q) \\)"
    "\\( (\\lnot p\\supset q) \\)"
    "\\( (q\\lor (p\\lor p)) \\)"
    "\\( ((p\\lor p)\\lor (q\\land q)) \\)"
    "\\( (p\\lor ((p\\lor q)\\lor p)) \\)"
    "\\( (q\\lor (p\\lor (p\\lor q))) \\)"
    "\\( ((p\\lor p)\\equiv (p\\lor p)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\equiv q)) \\)"
    "\\( (q\\supset (q\\lor (q\\land p))) \\)"
    "\\( (p\\equiv (p\\land (q\\supset p))) \\)"
    "\\( ((\\lnot p\\lor p)\\lor q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (p\\supset q)\\equiv q)\\), \\((\\lnot (q\\lor p)\\equiv p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\supset (q\\supset p)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot (p\\equiv p)\\land p) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv q) \\)"
    "\\( \\lnot ((p\\supset q)\\lor p) \\)"
    "\\( \\lnot (q\\lor (q\\lor p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( ((\\lnot q\\land p)\\equiv q) \\)"
    "\\( ((\\lnot q\\equiv p)\\land q) \\)"
    "\\( ((p\\equiv \\lnot q)\\land q) \\)"
    "\\( (q\\land (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot p\\equiv (p\\lor q)) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( (\\lnot p\\land (p\\supset p)) \\)"
    "\\( \\lnot (p\\land (q\\lor p)) \\)"
    "\\( (p\\supset \\lnot (p\\lor p)) \\)"
    "\\( ((p\\equiv \\lnot q)\\equiv q) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\lor (p\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( (\\lnot (p\\land q)\\equiv p) \\)"
    "\\( (q\\equiv (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot ((p\\land q)\\lor q) \\)"
    "\\( \\lnot ((p\\supset p)\\land q) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv (q\\equiv p)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( \\lnot ((q\\land q)\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv p) \\)"
    "\\( (q\\supset (q\\equiv \\lnot p)) \\)"
    "\\( \\lnot ((q\\lor q)\\land p) \\)"
    "\\( \\lnot (q\\land (q\\land p)) \\)"
    "\\( (\\lnot q\\equiv (q\\supset p)) \\)"
    "\\( (((q\\land q)\\supset p)\\land q) \\)"
    "\\( (q\\equiv (q\\equiv (q\\land p))) \\)"
    "\\( ((\\lnot q\\lor p)\\equiv q) \\)"
    "\\( ((p\\supset q)\\land (q\\land p)) \\)"
    "\\( ((p\\lor (p\\land p))\\land q) \\)"
    "\\( (((q\\equiv q)\\supset p)\\equiv q) \\)"
    "\\( ((p\\land p)\\equiv q) \\)"
    "\\( ((q\\lor q)\\equiv p) \\)"
    "\\( (((q\\land q)\\land q)\\equiv p) \\)"
    "\\( ((p\\land (p\\supset p))\\equiv q) \\)"
    "\\( (q\\land (q\\supset (p\\equiv p))) \\)"
    "\\( ((p\\supset (q\\supset p))\\land q) \\)"
    "\\( (((q\\land p)\\land p)\\lor q) \\)"
    "\\( (q\\land ((p\\lor p)\\equiv p)) \\)"
    "\\( ((q\\supset p)\\equiv (p\\land q)) \\)"
    "\\( (q\\equiv ((q\\land q)\\lor p)) \\)"
    "\\( (p\\supset (p\\equiv q)) \\)"
    "\\( (p\\supset (p\\land (q\\land q))) \\)"
    "\\( ((\\lnot q\\supset p)\\supset q) \\)"
    "\\( (q\\lor (q\\equiv p)) \\)"
    "\\( ((\\lnot q\\supset p)\\land p) \\)"
    "\\( (((p\\equiv q)\\land p)\\lor p) \\)"
    "\\( ((p\\supset (p\\land p))\\equiv p) \\)"
    "\\( ((p\\lor (p\\supset q))\\land p) \\)"
    "\\( (p\\lor (p\\lor (p\\lor p))) \\)"
    "\\( ((q\\supset p)\\equiv (p\\supset p)) \\)"
    "\\( (p\\equiv ((p\\supset q)\\equiv q)) \\)"
    "\\( ((q\\supset \\lnot q)\\lor p) \\)"
    "\\( (((q\\land q)\\lor p)\\equiv p) \\)"
    "\\( (\\lnot q\\lor (q\\equiv p)) \\)"
    "\\( (p\\lor (q\\equiv (q\\equiv q))) \\)"
    "\\( ((q\\land (q\\equiv q))\\lor p) \\)"
    "\\( (q\\lor (p\\land (q\\equiv q))) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\lor p)) \\)"
    "\\( ((p\\lor (q\\land p))\\lor q) \\)"
    "\\( (q\\supset (q\\land (p\\equiv p))) \\)"
    "\\( (q\\supset ((p\\supset p)\\lor q)) \\)"
    "\\( ((p\\equiv p)\\lor (p\\equiv p)) \\)"
    "\\( ((q\\supset q)\\lor (q\\land p)) \\)"
    "\\( (p\\supset ((q\\lor q)\\lor p)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot q\\land (p\\equiv q))\\), \\((\\lnot p\\land \\lnot p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((q\\equiv p)\\supset q) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv q)\\supset q) \\)"
    "\\( \\lnot ((q\\lor p)\\lor p) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv p) \\)"
    "\\( \\lnot (p\\equiv (p\\equiv p)) \\)"
    "\\( \\lnot (p\\land (p\\lor p)) \\)"
    "\\( (p\\supset (p\\equiv \\lnot p)) \\)"
    "\\( (p\\equiv (\\lnot q\\land q)) \\)"
    "\\( \\lnot ((q\\supset q)\\land q) \\)"
    "\\( (\\lnot p\\equiv (p\\equiv q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( \\lnot \\lnot \\lnot q \\)"
    "\\( \\lnot (q\\land q) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( (q\\equiv (\\lnot p\\land q)) \\)"
    "\\( \\lnot (p\\land q) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot p) \\)"
    "\\( (\\lnot \\lnot p\\equiv q) \\)"
    "\\( ((q\\equiv (p\\equiv p))\\equiv p) \\)"
    "\\( ((p\\equiv q)\\lor (q\\land p)) \\)"
    "\\( ((p\\lor (p\\land q))\\equiv q) \\)"
    "\\( ((p\\supset p)\\supset (q\\equiv p)) \\)"
    "\\( (p\\supset ((p\\land p)\\supset q)) \\)"
    "\\( ((q\\equiv (p\\lor p))\\lor q) \\)"
    "\\( (p\\supset (q\\land (p\\land q))) \\)"
    "\\( ((q\\equiv (p\\supset q))\\supset q) \\)"
    "\\( (p\\supset (p\\equiv (q\\land p))) \\)"
    "\\( ((p\\lor p)\\lor (p\\equiv q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\land p)) \\)"
    "\\( ((q\\land (q\\land q))\\supset p) \\)"
    "\\( (q\\equiv (q\\land (p\\lor p))) \\)"
    "\\( (q\\equiv (p\\land (q\\equiv p))) \\)"
    "\\( ((q\\equiv (p\\equiv p))\\equiv q) \\)"
    "\\( ((p\\equiv p)\\lor (p\\supset p)) \\)"
    "\\( (q\\equiv ((p\\supset p)\\land q)) \\)"
    "\\( ((p\\lor q)\\supset (p\\equiv p)) \\)"
    "\\( (p\\lor (q\\lor (p\\equiv p))) \\)"
  ]
  :wrong [
            ["\\( (q\\land (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( \\lnot (p\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( ((p\\lor q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land ((q\\supset q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\land ((q\\lor q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( ((q\\lor \\lnot p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( \\lnot ((q\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\land (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land ((q\\land q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (((q\\supset p)\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (((q\\land p)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\lor ((q\\equiv q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( \\lnot ((p\\land p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (\\lnot q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( ((q\\land (p\\land q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land (p\\supset (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\land ((q\\land q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (\\lnot (q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\equiv ((q\\lor p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (q\\land (q\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( (p\\lor (q\\land (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
            ["\\( ((p\\equiv (p\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1100 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((q\\equiv p)\\supset q)\\), \\(((p\\lor q)\\equiv \\lnot q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (\\lnot (q\\supset q)\\land q) \\)"
    "\\( (p\\land (q\\land \\lnot q)) \\)"
    "\\( (\\lnot (p\\equiv p)\\land q) \\)"
    "\\( \\lnot ((q\\equiv q)\\lor q) \\)"
    "\\( (p\\equiv (q\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( \\lnot ((p\\equiv q)\\supset p) \\)"
    "\\( \\lnot ((p\\lor q)\\lor p) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( (\\lnot p\\land (q\\land q)) \\)"
    "\\( (q\\land (\\lnot q\\equiv p)) \\)"
    "\\( (\\lnot p\\land (q\\land q)) \\)"
    "\\( ((p\\supset \\lnot q)\\equiv q) \\)"
    "\\( ((q\\supset q)\\supset \\lnot p) \\)"
    "\\( \\lnot (\\lnot p\\supset p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( (p\\supset (p\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( ((q\\equiv \\lnot p)\\land p) \\)"
    "\\( \\lnot (q\\lor \\lnot p) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( (p\\land \\lnot q) \\)"
    "\\( (q\\equiv (\\lnot p\\equiv p)) \\)"
    "\\( (p\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( (q\\supset \\lnot (p\\supset q)) \\)"
    "\\( (q\\supset (q\\land \\lnot q)) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot q) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( \\lnot ((q\\supset p)\\land q) \\)"
    "\\( \\lnot ((p\\equiv q)\\land p) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( \\lnot (q\\land (p\\equiv q)) \\)"
    "\\( ((p\\supset (p\\supset q))\\land p) \\)"
    "\\( ((q\\equiv p)\\land (q\\land q)) \\)"
    "\\( (q\\land ((p\\land q)\\land p)) \\)"
    "\\( (q\\land ((q\\equiv q)\\supset p)) \\)"
    "\\( (((p\\supset q)\\equiv p)\\land q) \\)"
    "\\( ((p\\equiv q)\\lor (q\\equiv p)) \\)"
    "\\( (q\\equiv ((p\\equiv p)\\equiv p)) \\)"
    "\\( (((q\\equiv q)\\supset p)\\equiv q) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\equiv p)) \\)"
    "\\( (p\\equiv (q\\land (q\\supset q))) \\)"
    "\\( ((p\\equiv (q\\lor p))\\supset q) \\)"
    "\\( (q\\lor (p\\land (p\\land q))) \\)"
    "\\( (((q\\land q)\\supset p)\\supset q) \\)"
    "\\( (((q\\equiv q)\\supset q)\\lor q) \\)"
    "\\( (q\\land (q\\land (q\\lor q))) \\)"
    "\\( (p\\supset (\\lnot p\\lor q)) \\)"
    "\\( (\\lnot p\\lor (q\\land p)) \\)"
    "\\( (q\\equiv ((q\\land q)\\lor p)) \\)"
    "\\( (\\lnot q\\supset (p\\supset q)) \\)"
    "\\( (\\lnot p\\lor (q\\lor q)) \\)"
    "\\( ((p\\equiv (q\\supset p))\\land p) \\)"
    "\\( ((p\\lor p)\\land (p\\supset p)) \\)"
    "\\( ((p\\land p)\\lor (p\\lor p)) \\)"
    "\\( ((p\\land p)\\equiv (p\\supset p)) \\)"
    "\\( (p\\land ((q\\supset q)\\supset p)) \\)"
    "\\( (((q\\equiv p)\\lor p)\\lor p) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\land q)) \\)"
    "\\( (q\\supset (q\\land (p\\land p))) \\)"
    "\\( (p\\equiv (\\lnot q\\supset p)) \\)"
    "\\( ((q\\lor (p\\land q))\\supset p) \\)"
    "\\( ((p\\lor (p\\equiv q))\\equiv p) \\)"
    "\\( (q\\equiv (q\\equiv (p\\lor q))) \\)"
    "\\( (q\\lor ((q\\supset q)\\land p)) \\)"
    "\\( (((q\\supset p)\\supset q)\\lor p) \\)"
    "\\( (((q\\equiv p)\\lor q)\\equiv q) \\)"
    "\\( ((p\\equiv q)\\lor (q\\supset q)) \\)"
    "\\( (((p\\lor q)\\supset q)\\lor p) \\)"
    "\\( (p\\equiv (p\\land (p\\land p))) \\)"
    "\\( ((q\\land (p\\lor p))\\supset p) \\)"
    "\\( (((q\\lor q)\\lor q)\\supset q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\supset q)\\equiv q)\\), \\((q\\supset (p\\land \\lnot q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( (\\lnot q\\land \\lnot p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( ((q\\supset p)\\land \\lnot p) \\)"
    "\\( ((p\\equiv p)\\equiv \\lnot p) \\)"
    "\\( ((q\\supset q)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\lor p)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset q)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv q) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\land q) \\)"
    "\\( ((\\lnot p\\land p)\\equiv q) \\)"
    "\\( \\lnot (q\\land (p\\supset p)) \\)"
    "\\( ((\\lnot q\\land p)\\equiv p) \\)"
    "\\( \\lnot ((q\\land p)\\land p) \\)"
    "\\( (q\\supset (p\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((p\\supset q)\\land p) \\)"
    "\\( (q\\supset (p\\supset \\lnot p)) \\)"
    "\\( ((q\\lor p)\\equiv (q\\land p)) \\)"
    "\\( (q\\equiv ((p\\supset q)\\supset p)) \\)"
    "\\( (q\\equiv ((p\\supset q)\\supset p)) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\supset p)) \\)"
    "\\( ((p\\equiv q)\\land (p\\equiv q)) \\)"
    "\\( (q\\lor (q\\equiv (p\\land p))) \\)"
    "\\( ((q\\land q)\\lor \\lnot p) \\)"
    "\\( (q\\lor ((p\\lor p)\\supset q)) \\)"
    "\\( (q\\lor ((p\\lor q)\\equiv q)) \\)"
    "\\( (p\\equiv ((p\\supset q)\\land p)) \\)"
    "\\( ((p\\lor p)\\equiv (p\\lor q)) \\)"
    "\\( ((q\\land q)\\equiv (q\\land p)) \\)"
    "\\( (((q\\land q)\\equiv p)\\lor p) \\)"
    "\\( ((q\\supset p)\\equiv (p\\equiv p)) \\)"
    "\\( ((q\\supset p)\\land (p\\supset p)) \\)"
    "\\( (p\\supset ((q\\equiv p)\\lor p)) \\)"
    "\\( ((q\\land p)\\supset (q\\supset q)) \\)"
    "\\( (q\\equiv \\lnot \\lnot q) \\)"
    "\\( ((q\\lor p)\\lor (q\\equiv p)) \\)"
    "\\( (q\\equiv ((q\\lor q)\\land q)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot q\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\land \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (q\\equiv ((q\\supset p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (q\\equiv (q\\supset (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (p\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (((p\\supset p)\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (q\\land \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot p\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (((p\\lor p)\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( \\lnot \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (((p\\equiv p)\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\lor (p\\lor q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (p\\land \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( \\lnot (p\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot (q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\supset (q\\equiv p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((q\\equiv q)\\supset (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((q\\supset (q\\land q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (q\\equiv ((q\\lor p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( \\lnot (q\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot p\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\land p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((p\\equiv (p\\land q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (q\\lor ((q\\land p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( (p\\lor (q\\equiv (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
            ["\\( ((q\\supset (p\\lor p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1010 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\lor p)\\), \\((\\lnot (p\\land p)\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot q\\land p)\\land q) \\)"
    "\\( \\lnot (p\\lor (p\\supset p)) \\)"
    "\\( ((q\\land \\lnot p)\\land p) \\)"
    "\\( (\\lnot (p\\land p)\\land p) \\)"
    "\\( \\lnot (p\\lor (p\\equiv p)) \\)"
    "\\( \\lnot (q\\lor p) \\)"
    "\\( ((q\\supset p)\\land \\lnot p) \\)"
    "\\( ((q\\supset p)\\land \\lnot p) \\)"
    "\\( (\\lnot q\\land (p\\equiv q)) \\)"
    "\\( \\lnot ((p\\land p)\\lor q) \\)"
    "\\( \\lnot (\\lnot q\\lor p) \\)"
    "\\( \\lnot (q\\equiv (q\\land p)) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( \\lnot ((q\\supset p)\\lor p) \\)"
    "\\( \\lnot ((q\\supset p)\\lor p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( (p\\supset (q\\land \\lnot p)) \\)"
    "\\( ((\\lnot q\\land q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( ((p\\equiv \\lnot q)\\land p) \\)"
    "\\( (p\\land (q\\supset \\lnot q)) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
    "\\( (p\\land (\\lnot q\\land p)) \\)"
    "\\( (\\lnot (q\\land q)\\land p) \\)"
    "\\( \\lnot ((q\\equiv q)\\land q) \\)"
    "\\( ((q\\supset q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((q\\supset q)\\land q) \\)"
    "\\( (q\\equiv \\lnot (p\\supset p)) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( \\lnot (q\\land (p\\lor p)) \\)"
    "\\( \\lnot ((q\\supset p)\\equiv q) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\land p) \\)"
    "\\( ((p\\land q)\\lor (p\\land q)) \\)"
    "\\( ((p\\land q)\\land (p\\land q)) \\)"
    "\\( (q\\land ((q\\supset p)\\land p)) \\)"
    "\\( (((q\\land p)\\lor q)\\land p) \\)"
    "\\( (p\\equiv (q\\lor q)) \\)"
    "\\( ((q\\equiv p)\\land (p\\supset q)) \\)"
    "\\( ((q\\lor (q\\land p))\\equiv p) \\)"
    "\\( ((q\\lor p)\\equiv (q\\land p)) \\)"
    "\\( ((q\\equiv p)\\land (p\\supset p)) \\)"
    "\\( (q\\land ((q\\equiv q)\\lor q)) \\)"
    "\\( ((p\\equiv (p\\land q))\\land q) \\)"
    "\\( (q\\land (q\\lor p)) \\)"
    "\\( ((q\\land (p\\supset p))\\land q) \\)"
    "\\( (q\\lor \\lnot (q\\supset p)) \\)"
    "\\( (p\\supset ((p\\equiv q)\\land q)) \\)"
    "\\( (p\\supset (q\\equiv (p\\equiv p))) \\)"
    "\\( (q\\lor \\lnot (p\\lor p)) \\)"
    "\\( ((p\\supset (p\\land q))\\lor q) \\)"
    "\\( (p\\supset (q\\land (p\\lor p))) \\)"
    "\\( (((p\\lor p)\\supset p)\\equiv p) \\)"
    "\\( (((p\\land p)\\land q)\\lor p) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\lor p)) \\)"
    "\\( (((p\\land q)\\equiv q)\\land p) \\)"
    "\\( (p\\lor (q\\land (q\\equiv p))) \\)"
    "\\( (((p\\lor q)\\supset p)\\lor p) \\)"
    "\\( (((q\\lor p)\\land q)\\supset p) \\)"
    "\\( (q\\supset ((p\\supset p)\\supset p)) \\)"
    "\\( ((q\\supset p)\\land (q\\equiv q)) \\)"
    "\\( ((p\\equiv p)\\land (q\\supset p)) \\)"
    "\\( (q\\equiv (p\\supset (p\\equiv q))) \\)"
    "\\( ((q\\lor p)\\equiv (q\\equiv q)) \\)"
    "\\( (((p\\lor q)\\supset q)\\supset q) \\)"
    "\\( ((p\\equiv q)\\supset (q\\land q)) \\)"
    "\\( ((p\\equiv q)\\supset (q\\lor p)) \\)"
    "\\( (q\\supset (p\\supset (p\\lor q))) \\)"
    "\\( ((p\\equiv p)\\land (p\\supset p)) \\)"
    "\\( (p\\supset (p\\land (q\\supset q))) \\)"
    "\\( (p\\supset (q\\equiv (q\\land p))) \\)"
    "\\( (p\\lor (p\\supset q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\lor (q\\lor p))\\), \\(\\lnot ((p\\land q)\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((p\\lor q)\\lor q) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot ((p\\lor p)\\lor q) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( \\lnot ((p\\lor q)\\land p) \\)"
    "\\( (p\\supset (q\\equiv \\lnot q)) \\)"
    "\\( ((p\\land p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\lor (q\\land p)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset q) \\)"
    "\\( (q\\supset (p\\land \\lnot p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\land q) \\)"
    "\\( \\lnot ((q\\land q)\\lor q) \\)"
    "\\( (q\\supset \\lnot (q\\supset q)) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( (q\\equiv (q\\land \\lnot p)) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( \\lnot (p\\land (q\\lor q)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (((p\\supset p)\\supset q)\\equiv p) \\)"
    "\\( (((q\\supset q)\\supset p)\\equiv q) \\)"
    "\\( ((q\\land p)\\equiv (p\\lor q)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\supset q)) \\)"
    "\\( \\lnot (p\\equiv \\lnot q) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\supset q) \\)"
    "\\( (((p\\supset q)\\equiv q)\\supset q) \\)"
    "\\( (((q\\equiv q)\\land p)\\supset q) \\)"
    "\\( (p\\supset (\\lnot q\\supset q)) \\)"
    "\\( (p\\supset ((q\\supset p)\\land q)) \\)"
    "\\( (q\\equiv ((q\\land q)\\land p)) \\)"
    "\\( ((\\lnot q\\equiv p)\\supset p) \\)"
    "\\( (q\\equiv ((q\\lor q)\\land p)) \\)"
    "\\( (q\\supset (p\\lor (q\\supset p))) \\)"
    "\\( (q\\supset (p\\land (p\\equiv q))) \\)"
    "\\( (q\\equiv (q\\land (p\\equiv p))) \\)"
    "\\( ((q\\supset (p\\lor q))\\lor p) \\)"
    "\\( ((q\\lor p)\\supset (q\\lor p)) \\)"
    "\\( (p\\lor (p\\equiv (q\\land p))) \\)"
    "\\( ((q\\land (q\\lor p))\\supset q) \\)"
  ]
  :wrong [
            ["\\( (p\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot q\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (((p\\land q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\land (p\\supset (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (((q\\lor p)\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((\\lnot p\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\land \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((p\\land q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((q\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((q\\equiv (p\\supset p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot q\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (((p\\lor p)\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((p\\lor (q\\lor p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot q\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\land \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\equiv \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((p\\equiv p)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot (q\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((p\\equiv (q\\land p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((q\\supset q)\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( \\lnot (q\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( \\lnot (p\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((q\\supset \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (q\\equiv (p\\lor (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( (((p\\equiv p)\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
            ["\\( ((p\\equiv (p\\equiv q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot q\\land (p\\equiv q))\\), \\((q\\land ((p\\land p)\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\land q)\\land q) \\)"
    "\\( \\lnot (p\\lor (q\\equiv q)) \\)"
    "\\( (\\lnot (q\\supset p)\\land p) \\)"
    "\\( \\lnot ((q\\land p)\\supset q) \\)"
    "\\( (\\lnot p\\land (p\\lor p)) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( \\lnot ((p\\lor q)\\lor q) \\)"
    "\\( \\lnot (q\\supset (p\\equiv q)) \\)"
    "\\( (q\\land \\lnot (p\\land p)) \\)"
    "\\( (q\\equiv (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor p)) \\)"
    "\\( (q\\land (p\\supset \\lnot q)) \\)"
    "\\( ((q\\lor p)\\supset \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (q\\equiv p)) \\)"
    "\\( (p\\equiv (\\lnot p\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\land p)\\land p) \\)"
    "\\( ((q\\supset \\lnot q)\\land p) \\)"
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( (\\lnot q\\land (p\\land p)) \\)"
    "\\( (p\\land \\lnot (p\\equiv q)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land p) \\)"
    "\\( (\\lnot q\\land \\lnot q) \\)"
    "\\( (\\lnot q\\equiv (q\\equiv q)) \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( \\lnot (q\\land (p\\supset p)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv q) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (p\\supset (p\\land \\lnot q)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor q)\\land p) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( (((p\\equiv p)\\land q)\\land p) \\)"
    "\\( ((q\\equiv p)\\land q) \\)"
    "\\( (((p\\equiv q)\\lor p)\\equiv q) \\)"
    "\\( (q\\land ((q\\land p)\\land q)) \\)"
    "\\( ((p\\equiv p)\\land (q\\land p)) \\)"
    "\\( (((q\\supset p)\\supset q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( (p\\equiv ((p\\supset p)\\supset q)) \\)"
    "\\( (p\\equiv (q\\lor q)) \\)"
    "\\( ((p\\equiv q)\\land (q\\equiv q)) \\)"
    "\\( (((q\\supset p)\\lor q)\\supset q) \\)"
    "\\( ((q\\equiv (q\\lor q))\\land q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\land q) \\)"
    "\\( ((q\\supset \\lnot p)\\supset q) \\)"
    "\\( (q\\land ((q\\supset q)\\land q)) \\)"
    "\\( (((p\\lor q)\\supset q)\\lor q) \\)"
    "\\( ((p\\equiv p)\\supset (p\\supset q)) \\)"
    "\\( ((p\\lor p)\\supset (q\\land q)) \\)"
    "\\( (p\\supset (q\\land (p\\equiv q))) \\)"
    "\\( ((\\lnot p\\supset q)\\supset q) \\)"
    "\\( ((p\\land p)\\land (q\\supset q)) \\)"
    "\\( ((q\\lor (q\\supset q))\\supset p) \\)"
    "\\( (p\\lor ((q\\lor p)\\land p)) \\)"
    "\\( (p\\land ((q\\supset q)\\supset p)) \\)"
    "\\( ((q\\supset (p\\lor p))\\land p) \\)"
    "\\( (q\\supset ((q\\supset p)\\lor p)) \\)"
    "\\( (((p\\equiv q)\\lor p)\\lor p) \\)"
    "\\( (q\\supset (q\\supset (p\\lor p))) \\)"
    "\\( ((q\\land (p\\lor q))\\supset p) \\)"
    "\\( (((p\\supset q)\\supset q)\\equiv p) \\)"
    "\\( ((p\\lor q)\\lor p) \\)"
    "\\( ((p\\land q)\\equiv (q\\equiv p)) \\)"
    "\\( (q\\lor ((q\\equiv q)\\equiv p)) \\)"
    "\\( (p\\lor (q\\lor (p\\land p))) \\)"
    "\\( (q\\lor ((q\\supset p)\\land p)) \\)"
    "\\( (q\\supset ((q\\supset q)\\lor p)) \\)"
    "\\( ((q\\land (q\\supset p))\\supset q) \\)"
    "\\( ((q\\equiv q)\\supset (p\\equiv p)) \\)"
    "\\( ((p\\equiv p)\\land (p\\supset p)) \\)"
    "\\( (q\\supset (p\\supset (q\\supset p))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\supset q)\\equiv q)\\), \\(((q\\lor p)\\equiv (p\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor q) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv q) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
    "\\( \\lnot ((q\\supset q)\\land p) \\)"
    "\\( \\lnot (p\\land p) \\)"
    "\\( (p\\supset (p\\supset \\lnot p)) \\)"
    "\\( (q\\supset (p\\land \\lnot q)) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( (p\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\lor p)) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( (q\\supset \\lnot (p\\land p)) \\)"
    "\\( (q\\equiv (p\\land (q\\lor p))) \\)"
    "\\( (((p\\lor p)\\lor p)\\equiv q) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\equiv p) \\)"
    "\\( ((p\\land (q\\equiv q))\\equiv q) \\)"
    "\\( (p\\equiv ((p\\land q)\\lor q)) \\)"
    "\\( ((p\\equiv (p\\land q))\\lor q) \\)"
    "\\( ((p\\land q)\\lor (p\\supset q)) \\)"
    "\\( (((q\\lor q)\\lor p)\\equiv q) \\)"
    "\\( (((p\\land p)\\equiv q)\\lor q) \\)"
    "\\( (p\\supset (q\\land (q\\land q))) \\)"
    "\\( (p\\lor (q\\supset (p\\equiv q))) \\)"
    "\\( ((q\\equiv q)\\land (q\\supset p)) \\)"
    "\\( ((q\\equiv p)\\equiv (p\\supset q)) \\)"
    "\\( \\lnot (\\lnot p\\land q) \\)"
    "\\( ((q\\land q)\\equiv (p\\land q)) \\)"
    "\\( (q\\supset (p\\supset (q\\equiv q))) \\)"
    "\\( ((p\\supset q)\\lor (p\\land p)) \\)"
    "\\( ((q\\land p)\\supset (p\\land p)) \\)"
    "\\( ((p\\supset (q\\supset p))\\lor p) \\)"
    "\\( ((p\\equiv \\lnot p)\\supset p) \\)"
  ]
  :wrong [
            ["\\( (p\\land (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((q\\land q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((q\\supset (q\\land q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\lor (p\\lor (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((q\\lor q)\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( \\lnot (p\\supset (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot (p\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((p\\lor (q\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((p\\supset q)\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((p\\land (q\\equiv p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\land \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot q\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( ((q\\land p)\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (((p\\supset p)\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\lor ((p\\supset q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (((q\\land q)\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( \\lnot (\\lnot p\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (q\\land ((p\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (q\\equiv (q\\supset (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (p\\land (q\\supset (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
            ["\\( (((q\\land q)\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1001 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv (q\\land \\lnot p))\\), \\((((p\\lor q)\\lor q)\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land (q\\land \\lnot q)) \\)"
    "\\( (\\lnot (p\\lor q)\\land p) \\)"
    "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
    "\\( (p\\land \\lnot (q\\supset q)) \\)"
    "\\( (\\lnot q\\equiv (q\\land q)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor q) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( ((q\\supset \\lnot p)\\land q) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( (\\lnot p\\land (p\\supset q)) \\)"
    "\\( ((q\\equiv \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((p\\land p)\\land p) \\)"
    "\\( (p\\equiv (q\\equiv \\lnot q)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( ((p\\supset \\lnot q)\\equiv p) \\)"
    "\\( (p\\equiv (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot (q\\lor q)\\land p) \\)"
    "\\( ((q\\supset \\lnot q)\\land p) \\)"
    "\\( \\lnot ((q\\lor p)\\supset q) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( (q\\supset \\lnot q) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv q) \\)"
    "\\( \\lnot ((p\\land q)\\lor q) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv p)) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( \\lnot ((q\\land p)\\land p) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( \\lnot ((q\\land q)\\land p) \\)"
    "\\( \\lnot (p\\equiv (p\\supset q)) \\)"
    "\\( ((q\\land (p\\lor q))\\land p) \\)"
    "\\( (p\\land (p\\supset (q\\land p))) \\)"
    "\\( (p\\equiv ((q\\lor p)\\equiv q)) \\)"
    "\\( (q\\land ((p\\land p)\\equiv q)) \\)"
    "\\( (p\\equiv (p\\supset (q\\land q))) \\)"
    "\\( \\lnot \\lnot (p\\equiv q) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\equiv q) \\)"
    "\\( ((p\\equiv q)\\land (q\\supset q)) \\)"
    "\\( ((q\\lor (q\\lor q))\\equiv p) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\equiv p)) \\)"
    "\\( (((q\\supset q)\\land q)\\lor q) \\)"
    "\\( (q\\lor ((q\\equiv p)\\land q)) \\)"
    "\\( (q\\land (q\\supset q)) \\)"
    "\\( (q\\lor (p\\equiv \\lnot p)) \\)"
    "\\( (q\\equiv (q\\supset (q\\lor p))) \\)"
    "\\( ((p\\supset (p\\supset q))\\lor q) \\)"
    "\\( (p\\equiv (q\\land (p\\equiv q))) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\supset q)) \\)"
    "\\( ((p\\lor p)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\supset (p\\land q))\\lor q) \\)"
    "\\( (((q\\supset q)\\equiv p)\\land p) \\)"
    "\\( (((q\\equiv q)\\lor p)\\supset p) \\)"
    "\\( ((p\\lor p)\\lor (p\\land p)) \\)"
    "\\( (p\\lor \\lnot (p\\supset p)) \\)"
    "\\( (((p\\supset q)\\supset p)\\land p) \\)"
    "\\( ((q\\land (q\\lor p))\\supset p) \\)"
    "\\( ((p\\lor p)\\equiv (p\\lor q)) \\)"
    "\\( (q\\equiv ((q\\lor q)\\land p)) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\land q)) \\)"
    "\\( (((p\\equiv p)\\supset q)\\supset p) \\)"
    "\\( (((q\\equiv q)\\supset p)\\lor q) \\)"
    "\\( (p\\equiv (q\\supset (p\\land q))) \\)"
    "\\( (((q\\lor p)\\supset q)\\supset q) \\)"
    "\\( ((p\\supset (q\\land p))\\supset q) \\)"
    "\\( (q\\equiv (q\\lor \\lnot p)) \\)"
    "\\( ((q\\lor p)\\lor (p\\equiv p)) \\)"
    "\\( ((q\\equiv (q\\lor q))\\lor q) \\)"
    "\\( (q\\supset (\\lnot q\\supset q)) \\)"
    "\\( (p\\supset (q\\equiv (q\\land p))) \\)"
    "\\( (p\\lor ((q\\lor q)\\equiv q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv (p\\land \\lnot q))\\), \\((q\\lor (p\\supset (p\\land q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((q\\equiv p)\\supset q) \\)"
    "\\( (\\lnot p\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\supset p)\\supset p) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( (p\\supset (\\lnot q\\land q)) \\)"
    "\\( ((q\\equiv \\lnot q)\\equiv p) \\)"
    "\\( (p\\supset (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (q\\equiv q)) \\)"
    "\\( \\lnot ((q\\land q)\\land q) \\)"
    "\\( (q\\supset \\lnot (q\\lor p)) \\)"
    "\\( (\\lnot q\\equiv (p\\equiv p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( (p\\supset \\lnot (p\\supset q)) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (p\\equiv (q\\equiv (p\\equiv p))) \\)"
    "\\( (q\\equiv (p\\land (p\\land p))) \\)"
    "\\( (p\\equiv ((q\\land q)\\land q)) \\)"
    "\\( ((p\\land p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\land p)) \\)"
    "\\( ((q\\supset q)\\equiv (p\\supset q)) \\)"
    "\\( ((p\\supset q)\\lor (p\\land q)) \\)"
    "\\( (p\\equiv (p\\land (q\\equiv p))) \\)"
    "\\( (p\\equiv (q\\land (q\\supset p))) \\)"
    "\\( (p\\supset ((p\\lor p)\\supset q)) \\)"
    "\\( (\\lnot p\\supset (q\\supset p)) \\)"
    "\\( (((q\\equiv p)\\supset p)\\equiv p) \\)"
    "\\( (p\\equiv ((q\\lor p)\\lor p)) \\)"
    "\\( (q\\supset ((p\\equiv p)\\land p)) \\)"
    "\\( (q\\equiv (p\\land (p\\equiv q))) \\)"
    "\\( ((q\\land p)\\supset (q\\equiv p)) \\)"
    "\\( (q\\supset (q\\equiv (p\\supset p))) \\)"
    "\\( (q\\lor (q\\lor \\lnot q)) \\)"
    "\\( (q\\lor (p\\lor (q\\supset p))) \\)"
    "\\( (p\\lor (q\\equiv (q\\land q))) \\)"
  ]
  :wrong [
            ["\\( (p\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (q\\land (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (((p\\supset p)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((q\\supset (q\\land p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (((p\\lor p)\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((q\\land (p\\lor q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot (p\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( \\lnot (q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\land (q\\equiv p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((q\\equiv p)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (p\\land ((q\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((q\\lor q)\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot (p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( \\lnot (\\lnot q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (q\\land ((q\\lor p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\land (q\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\lor \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\land q)\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot (p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (p\\equiv (p\\supset (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\equiv p)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( ((p\\lor (p\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
            ["\\( (q\\equiv ((q\\land p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot p\\land \\lnot q)\\), \\((p\\land (q\\supset (q\\supset p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot p\\equiv p)\\land q) \\)"
    "\\( (\\lnot (p\\supset q)\\land q) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( ((\\lnot q\\land q)\\land p) \\)"
    "\\( (q\\land \\lnot (p\\supset q)) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot ((p\\land p)\\lor q) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset q) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( ((q\\land q)\\land \\lnot p) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv p) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( (\\lnot p\\lor \\lnot p) \\)"
    "\\( \\lnot ((p\\land p)\\lor p) \\)"
    "\\( ((p\\land p)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\land q)\\equiv p) \\)"
    "\\( (p\\land \\lnot (q\\land p)) \\)"
    "\\( (\\lnot q\\equiv (p\\lor q)) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( (\\lnot (p\\land q)\\land p) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( \\lnot ((q\\lor p)\\land q) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv q) \\)"
    "\\( ((q\\supset p)\\land \\lnot q) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv q) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( (p\\supset (q\\supset \\lnot p)) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( (((p\\lor p)\\equiv q)\\land q) \\)"
    "\\( ((q\\lor (q\\equiv p))\\land p) \\)"
    "\\( (((q\\supset q)\\equiv p)\\land q) \\)"
    "\\( \\lnot \\lnot (p\\land q) \\)"
    "\\( ((q\\lor (q\\lor q))\\land p) \\)"
    "\\( (\\lnot \\lnot p\\equiv q) \\)"
    "\\( (((q\\supset p)\\supset q)\\equiv p) \\)"
    "\\( (q\\equiv (p\\lor (p\\land p))) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\supset p)) \\)"
    "\\( ((p\\equiv q)\\land (p\\equiv q)) \\)"
    "\\( ((q\\equiv q)\\land q) \\)"
    "\\( ((q\\land p)\\equiv (q\\supset p)) \\)"
    "\\( (q\\land (p\\lor (q\\land q))) \\)"
    "\\( ((q\\lor (p\\supset p))\\supset q) \\)"
    "\\( (q\\land ((q\\land p)\\lor q)) \\)"
    "\\( (p\\supset ((q\\equiv q)\\equiv q)) \\)"
    "\\( (((p\\lor q)\\lor q)\\equiv q) \\)"
    "\\( ((p\\land (p\\lor q))\\supset q) \\)"
    "\\( (p\\supset (p\\equiv q)) \\)"
    "\\( (((p\\supset q)\\equiv q)\\equiv q) \\)"
    "\\( ((p\\equiv (p\\supset q))\\lor p) \\)"
    "\\( (p\\equiv (\\lnot p\\lor p)) \\)"
    "\\( (((q\\land p)\\supset q)\\land p) \\)"
    "\\( ((q\\land (p\\land p))\\lor p) \\)"
    "\\( (((p\\lor p)\\supset p)\\land p) \\)"
    "\\( (p\\lor (q\\supset \\lnot q)) \\)"
    "\\( (p\\equiv (q\\lor (p\\lor p))) \\)"
    "\\( ((q\\lor (p\\lor q))\\equiv p) \\)"
    "\\( ((p\\lor q)\\supset p) \\)"
    "\\( ((p\\lor p)\\lor \\lnot q) \\)"
    "\\( ((p\\supset q)\\supset (q\\land q)) \\)"
    "\\( (q\\equiv (p\\supset q)) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\lor p) \\)"
    "\\( (p\\lor ((q\\supset q)\\land q)) \\)"
    "\\( (p\\lor ((p\\supset q)\\equiv q)) \\)"
    "\\( (q\\supset ((q\\land p)\\supset q)) \\)"
    "\\( ((p\\land (q\\equiv q))\\equiv p) \\)"
    "\\( (p\\supset ((q\\supset p)\\supset p)) \\)"
    "\\( ((q\\equiv q)\\lor (p\\supset p)) \\)"
    "\\( ((p\\equiv p)\\lor \\lnot q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((p\\supset q)\\equiv \\lnot q)\\), \\((p\\equiv (p\\equiv (q\\supset p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot ((p\\lor q)\\lor q) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\land \\lnot p) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (p\\equiv p)) \\)"
    "\\( \\lnot (p\\land (q\\supset p)) \\)"
    "\\( ((p\\lor q)\\supset \\lnot p) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv p) \\)"
    "\\( ((\\lnot p\\land p)\\equiv q) \\)"
    "\\( (q\\equiv \\lnot (q\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset p)) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv q) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((q\\supset p)\\land q) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot p) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\equiv \\lnot q) \\)"
    "\\( ((q\\land (p\\lor q))\\equiv p) \\)"
    "\\( (p\\equiv (q\\lor (q\\land p))) \\)"
    "\\( (((q\\equiv q)\\supset q)\\equiv p) \\)"
    "\\( (q\\equiv p) \\)"
    "\\( (p\\supset (p\\equiv (p\\supset q))) \\)"
    "\\( (\\lnot p\\lor q) \\)"
    "\\( (q\\lor (p\\equiv (p\\land q))) \\)"
    "\\( (q\\lor (p\\equiv (q\\lor q))) \\)"
    "\\( (q\\equiv (p\\lor (q\\lor p))) \\)"
    "\\( (p\\equiv (p\\lor (q\\land q))) \\)"
    "\\( ((p\\land p)\\lor (p\\equiv q)) \\)"
    "\\( (p\\lor \\lnot (p\\lor q)) \\)"
    "\\( ((q\\lor (q\\land p))\\supset p) \\)"
    "\\( ((q\\lor (p\\lor q))\\equiv p) \\)"
    "\\( ((p\\equiv q)\\supset (q\\supset q)) \\)"
    "\\( (((q\\supset q)\\supset q)\\equiv q) \\)"
    "\\( (q\\lor ((q\\supset p)\\lor p)) \\)"
    "\\( (p\\equiv (p\\lor p)) \\)"
    "\\( ((q\\lor q)\\lor (q\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((q\\supset \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((q\\lor p)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\lor (p\\supset p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (((p\\supset p)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\lor (p\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( \\lnot ((q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( \\lnot (p\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\land ((q\\equiv q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\supset (q\\land q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\lor \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (p\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((q\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (\\lnot p\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\land (q\\land p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\equiv (q\\supset (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (p\\land (p\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\lor q)\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (\\lnot q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((q\\lor (p\\equiv q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (q\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( (\\lnot (q\\land p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
            ["\\( ((p\\land (p\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot q\\equiv (p\\supset q))\\), \\(((q\\lor p)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((p\\land q)\\supset p) \\)"
    "\\( (q\\land \\lnot (p\\supset q)) \\)"
    "\\( (q\\land (p\\equiv \\lnot p)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot (q\\lor q)\\land q) \\)"
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( \\lnot (\\lnot q\\supset p) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv q) \\)"
    "\\( \\lnot ((q\\supset p)\\equiv p) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (\\lnot q\\equiv (p\\land q)) \\)"
    "\\( ((q\\equiv \\lnot p)\\land q) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (p\\lor q)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (p\\equiv p)) \\)"
    "\\( (p\\supset \\lnot (p\\lor q)) \\)"
    "\\( (p\\supset (q\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\land (p\\lor p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land p) \\)"
    "\\( (p\\land \\lnot (p\\land q)) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv q) \\)"
    "\\( (\\lnot q\\equiv (p\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( (q\\supset (p\\equiv \\lnot p)) \\)"
    "\\( ((q\\equiv q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((q\\land q)\\lor q) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot p) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (\\lnot q\\lor \\lnot p) \\)"
    "\\( (((q\\lor q)\\supset p)\\land q) \\)"
    "\\( ((p\\land (p\\supset q))\\land q) \\)"
    "\\( ((q\\supset p)\\land q) \\)"
    "\\( (p\\land (q\\lor (q\\equiv p))) \\)"
    "\\( (q\\land (p\\land (p\\supset q))) \\)"
    "\\( (p\\equiv (\\lnot q\\supset q)) \\)"
    "\\( ((\\lnot p\\supset p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\lor q)) \\)"
    "\\( (((q\\lor p)\\land q)\\equiv p) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\supset p)) \\)"
    "\\( ((q\\equiv (q\\supset q))\\land q) \\)"
    "\\( ((p\\supset p)\\land q) \\)"
    "\\( ((q\\equiv (q\\land q))\\land q) \\)"
    "\\( ((q\\equiv (p\\equiv p))\\land q) \\)"
    "\\( (q\\land (p\\supset (q\\equiv p))) \\)"
    "\\( (q\\lor \\lnot (q\\lor p)) \\)"
    "\\( (((p\\lor p)\\land p)\\supset q) \\)"
    "\\( (p\\supset (p\\land (p\\land q))) \\)"
    "\\( (p\\supset (p\\supset (p\\supset q))) \\)"
    "\\( (q\\lor (p\\supset (q\\lor q))) \\)"
    "\\( (p\\land (q\\supset (q\\lor p))) \\)"
    "\\( ((p\\lor (p\\supset q))\\land p) \\)"
    "\\( ((p\\lor (p\\lor q))\\land p) \\)"
    "\\( ((p\\equiv (q\\equiv q))\\land p) \\)"
    "\\( ((p\\supset p)\\supset (p\\lor p)) \\)"
    "\\( ((q\\supset p)\\lor (q\\land p)) \\)"
    "\\( (q\\supset (p\\land (p\\equiv q))) \\)"
    "\\( (q\\supset (p\\land (q\\lor p))) \\)"
    "\\( (q\\supset (p\\lor p)) \\)"
    "\\( (q\\supset ((p\\equiv q)\\equiv q)) \\)"
    "\\( (p\\lor ((q\\equiv q)\\supset q)) \\)"
    "\\( (((p\\equiv q)\\lor p)\\supset p) \\)"
    "\\( ((q\\lor q)\\lor (p\\land p)) \\)"
    "\\( ((q\\supset (p\\land p))\\equiv p) \\)"
    "\\( (q\\lor ((q\\supset p)\\land p)) \\)"
    "\\( (p\\lor (\\lnot q\\lor q)) \\)"
    "\\( (((q\\lor p)\\land q)\\supset q) \\)"
    "\\( (p\\lor (q\\supset (p\\lor q))) \\)"
    "\\( ((p\\lor q)\\supset (p\\lor q)) \\)"
    "\\( (q\\supset ((p\\supset p)\\equiv q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((q\\land q)\\lor p)\\), \\((((p\\land q)\\land p)\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\supset p)\\equiv p) \\)"
    "\\( \\lnot (q\\lor (p\\lor p)) \\)"
    "\\( \\lnot (q\\lor (q\\lor p)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor p) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot p) \\)"
    "\\( (q\\equiv (q\\equiv \\lnot p)) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv p) \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv q) \\)"
    "\\( \\lnot (q\\land q) \\)"
    "\\( \\lnot (q\\land (q\\equiv q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( (\\lnot q\\lor \\lnot q) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot q) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( ((p\\equiv p)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\land (q\\supset p))\\equiv q) \\)"
    "\\( (q\\equiv (p\\lor p)) \\)"
    "\\( (p\\equiv ((q\\supset p)\\supset q)) \\)"
    "\\( ((q\\lor p)\\equiv (q\\land p)) \\)"
    "\\( (p\\supset ((q\\supset q)\\land q)) \\)"
    "\\( ((p\\lor q)\\supset q) \\)"
    "\\( (p\\supset (q\\land (q\\land q))) \\)"
    "\\( (q\\lor (q\\equiv (p\\land p))) \\)"
    "\\( ((p\\land p)\\supset (q\\land p)) \\)"
    "\\( (q\\supset ((q\\lor p)\\land p)) \\)"
    "\\( (q\\supset ((p\\lor q)\\equiv p)) \\)"
    "\\( ((p\\lor q)\\supset (p\\land p)) \\)"
    "\\( (p\\lor (p\\lor (q\\supset p))) \\)"
    "\\( ((\\lnot q\\lor p)\\lor p) \\)"
    "\\( ((q\\supset q)\\supset (q\\supset q)) \\)"
    "\\( (p\\supset ((q\\land q)\\lor p)) \\)"
    "\\( (q\\supset (p\\supset (p\\lor q))) \\)"
    "\\( (q\\lor ((q\\lor p)\\equiv p)) \\)"
    "\\( (((p\\supset q)\\land q)\\equiv q) \\)"
  ]
  :wrong [
            ["\\( (q\\land (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\land (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (p\\land \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\land ((q\\equiv q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((q\\supset (q\\equiv p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (p\\land ((q\\lor p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\equiv (q\\lor p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (\\lnot (p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\land \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((q\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (p\\land (p\\equiv (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (p\\equiv (\\lnot p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\equiv (q\\land p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( \\lnot (p\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( \\lnot ((q\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (p\\land \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\equiv q)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\equiv (p\\supset (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((q\\equiv (q\\land q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\lor (p\\equiv q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\land p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((p\\land p)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (((q\\equiv p)\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( ((q\\land (q\\equiv p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
            ["\\( (q\\lor (p\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1000 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\equiv \\lnot q)\\land q)\\), \\((p\\equiv (\\lnot q\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land \\lnot (q\\equiv p)) \\)"
    "\\( ((\\lnot p\\land q)\\land q) \\)"
    "\\( \\lnot (q\\supset (p\\equiv q)) \\)"
    "\\( (\\lnot q\\equiv (q\\land p)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor p)) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv q)) \\)"
    "\\( (p\\equiv (q\\equiv \\lnot q)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv q) \\)"
    "\\( (\\lnot p\\land (p\\equiv p)) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( (p\\supset (q\\equiv \\lnot p)) \\)"
    "\\( ((q\\equiv \\lnot q)\\lor q) \\)"
    "\\( (\\lnot (p\\land q)\\supset q) \\)"
    "\\( (q\\land (q\\equiv (p\\equiv p))) \\)"
    "\\( ((q\\supset (p\\supset p))\\land q) \\)"
    "\\( (q\\land (q\\lor (p\\lor p))) \\)"
    "\\( (p\\supset ((q\\land p)\\equiv p)) \\)"
    "\\( (((q\\supset q)\\land p)\\supset q) \\)"
    "\\( (q\\lor ((q\\land p)\\equiv p)) \\)"
    "\\( (p\\supset ((q\\equiv q)\\land q)) \\)"
    "\\( (q\\lor ((q\\equiv p)\\lor q)) \\)"
    "\\( (q\\lor (p\\equiv (q\\supset p))) \\)"
    "\\( ((p\\equiv q)\\supset (p\\lor p)) \\)"
    "\\( ((p\\lor (p\\land p))\\lor q) \\)"
    "\\( ((q\\supset (p\\lor p))\\equiv p) \\)"
    "\\( ((q\\lor q)\\lor (p\\lor p)) \\)"
    "\\( ((p\\land (q\\lor q))\\supset p) \\)"
    "\\( (q\\supset (p\\lor (q\\supset q))) \\)"
    "\\( ((q\\equiv (q\\supset p))\\supset p) \\)"
    "\\( (q\\supset (p\\supset (p\\equiv q))) \\)"
    "\\( ((p\\lor q)\\lor \\lnot p) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((p\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (((p\\land q)\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (((p\\lor q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((q\\lor (p\\land p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((p\\lor p)\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\land (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\equiv (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (((q\\lor p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\equiv (q\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (((p\\land p)\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\supset (q\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( \\lnot ((p\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( \\lnot ((q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (\\lnot (p\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\land ((q\\land p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\equiv ((q\\equiv q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\land (q\\supset (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\supset ((q\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (\\lnot q\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((p\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( \\lnot (q\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (((q\\equiv p)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (p\\equiv ((q\\supset p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( ((q\\supset (p\\land q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
            ["\\( (q\\supset ((q\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1100 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\supset p)\\), \\((\\lnot q\\land (p\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor (q\\supset p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\lor p) \\)"
    "\\( \\lnot (p\\equiv (p\\land p)) \\)"
    "\\( (\\lnot q\\land q) \\)"
    "\\( (\\lnot p\\equiv (p\\land p)) \\)"
    "\\( ((q\\land \\lnot p)\\equiv p) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( (\\lnot p\\land (q\\equiv p)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot (p\\lor (q\\lor p)) \\)"
    "\\( \\lnot (q\\supset (p\\equiv q)) \\)"
    "\\( \\lnot ((p\\lor q)\\supset p) \\)"
    "\\( \\lnot ((p\\lor q)\\supset p) \\)"
    "\\( (\\lnot p\\land (q\\lor q)) \\)"
    "\\( (q\\land \\lnot (q\\supset p)) \\)"
    "\\( (p\\supset \\lnot (p\\lor p)) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
    "\\( (p\\supset (q\\land \\lnot q)) \\)"
    "\\( \\lnot ((p\\land q)\\lor p) \\)"
    "\\( \\lnot p \\)"
    "\\( (\\lnot (q\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor q) \\)"
    "\\( ((p\\lor q)\\land \\lnot q) \\)"
    "\\( (\\lnot (p\\lor q)\\equiv q) \\)"
    "\\( ((q\\land \\lnot q)\\equiv q) \\)"
    "\\( ((p\\equiv p)\\land \\lnot q) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv q) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot q) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (p\\supset (\\lnot q\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( \\lnot (p\\land (q\\land q)) \\)"
    "\\( (((q\\lor q)\\equiv p)\\land q) \\)"
    "\\( (p\\land ((p\\equiv q)\\equiv p)) \\)"
    "\\( (((q\\supset p)\\equiv q)\\land q) \\)"
    "\\( (((p\\land q)\\land p)\\land q) \\)"
    "\\( ((p\\land (p\\equiv q))\\land q) \\)"
    "\\( (p\\equiv (q\\equiv (q\\equiv q))) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\supset p)) \\)"
    "\\( (q\\equiv (p\\lor p)) \\)"
    "\\( (((q\\supset q)\\equiv q)\\equiv p) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\equiv q)) \\)"
    "\\( (q\\land (q\\supset (q\\lor p))) \\)"
    "\\( (((q\\lor p)\\lor q)\\land q) \\)"
    "\\( ((p\\equiv (p\\land p))\\equiv q) \\)"
    "\\( (q\\equiv (p\\equiv (p\\land p))) \\)"
    "\\( (q\\lor ((q\\land p)\\land q)) \\)"
    "\\( ((p\\land p)\\supset (q\\land q)) \\)"
    "\\( ((q\\land q)\\lor (p\\equiv q)) \\)"
    "\\( (((q\\equiv q)\\supset p)\\supset q) \\)"
    "\\( (p\\equiv (p\\land (p\\land q))) \\)"
    "\\( (p\\supset ((q\\land p)\\land q)) \\)"
    "\\( ((p\\equiv (p\\equiv p))\\lor p) \\)"
    "\\( (p\\land (p\\lor \\lnot p)) \\)"
    "\\( (((p\\lor p)\\supset q)\\supset p) \\)"
    "\\( ((q\\equiv (p\\lor q))\\supset p) \\)"
    "\\( (p\\equiv (p\\supset (q\\lor p))) \\)"
    "\\( (((q\\lor q)\\lor p)\\supset p) \\)"
    "\\( (q\\supset (p\\land (q\\lor p))) \\)"
    "\\( (q\\supset (p\\land (q\\lor p))) \\)"
    "\\( ((p\\lor (q\\land q))\\equiv p) \\)"
    "\\( ((q\\lor p)\\equiv (p\\lor p)) \\)"
    "\\( ((q\\lor p)\\lor (q\\lor p)) \\)"
    "\\( (q\\lor ((p\\supset p)\\supset p)) \\)"
    "\\( (p\\lor ((p\\supset q)\\equiv q)) \\)"
    "\\( (((p\\land q)\\equiv q)\\equiv p) \\)"
    "\\( (\\lnot p\\supset (q\\land q)) \\)"
    "\\( ((p\\equiv (p\\equiv p))\\equiv p) \\)"
    "\\( ((q\\land q)\\supset (q\\lor q)) \\)"
    "\\( (q\\supset ((p\\equiv p)\\land q)) \\)"
    "\\( (q\\lor (q\\supset q)) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\supset p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(q\\land (p\\equiv \\lnot q))\\), \\(\\lnot ((q\\supset q)\\supset q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\equiv (p\\lor p)) \\)"
    "\\( (p\\land (q\\land \\lnot p)) \\)"
    "\\( (q\\land \\lnot (p\\supset p)) \\)"
    "\\( (q\\land \\lnot q) \\)"
    "\\( \\lnot (p\\supset (q\\equiv q)) \\)"
    "\\( (q\\equiv (\\lnot q\\land p)) \\)"
    "\\( \\lnot (\\lnot q\\supset p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( (\\lnot p\\land (q\\equiv p)) \\)"
    "\\( (\\lnot p\\land \\lnot q) \\)"
    "\\( \\lnot (q\\equiv (q\\land p)) \\)"
    "\\( (q\\land (\\lnot p\\equiv q)) \\)"
    "\\( \\lnot (p\\lor (q\\supset p)) \\)"
    "\\( \\lnot (q\\supset p) \\)"
    "\\( ((p\\land q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv q) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
    "\\( (p\\supset (\\lnot p\\land p)) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv p) \\)"
    "\\( \\lnot (p\\land (p\\lor q)) \\)"
    "\\( (\\lnot q\\equiv (q\\lor p)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( (\\lnot p\\equiv (q\\land p)) \\)"
    "\\( \\lnot (q\\lor (p\\supset q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( \\lnot (q\\land (q\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\lor p)) \\)"
    "\\( (\\lnot q\\equiv (p\\equiv p)) \\)"
    "\\( \\lnot q \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( (q\\equiv (\\lnot p\\land q)) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( (q\\supset \\lnot (p\\lor p)) \\)"
    "\\( (((p\\supset p)\\land p)\\land q) \\)"
    "\\( (q\\land ((p\\equiv q)\\equiv q)) \\)"
    "\\( (p\\land ((q\\lor q)\\land q)) \\)"
    "\\( ((p\\land q)\\land (q\\land q)) \\)"
    "\\( ((q\\land p)\\land (q\\supset p)) \\)"
    "\\( ((p\\lor (q\\land p))\\equiv q) \\)"
    "\\( ((q\\equiv q)\\equiv (q\\equiv p)) \\)"
    "\\( ((p\\land (p\\lor q))\\equiv q) \\)"
    "\\( ((p\\land (p\\land p))\\equiv q) \\)"
    "\\( ((q\\equiv (p\\supset p))\\equiv p) \\)"
    "\\( (((p\\land p)\\supset p)\\supset q) \\)"
    "\\( (q\\land (q\\supset (p\\lor q))) \\)"
    "\\( (q\\lor (q\\lor (q\\land q))) \\)"
    "\\( (((p\\lor p)\\equiv p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\equiv (p\\lor p))) \\)"
    "\\( (((p\\land p)\\lor p)\\supset q) \\)"
    "\\( (p\\supset ((p\\supset q)\\land p)) \\)"
    "\\( ((p\\supset q)\\lor (q\\land q)) \\)"
    "\\( ((p\\lor (q\\lor q))\\supset q) \\)"
    "\\( ((p\\land p)\\supset (p\\equiv q)) \\)"
    "\\( (p\\equiv (q\\supset (q\\equiv q))) \\)"
    "\\( (p\\lor \\lnot (q\\supset q)) \\)"
    "\\( ((q\\equiv p)\\equiv (q\\land q)) \\)"
    "\\( (p\\lor (p\\land (p\\equiv q))) \\)"
    "\\( (((p\\land p)\\supset p)\\equiv p) \\)"
    "\\( (((p\\land p)\\lor q)\\supset p) \\)"
    "\\( ((q\\supset q)\\supset (q\\supset p)) \\)"
    "\\( ((q\\equiv (p\\land q))\\lor p) \\)"
    "\\( (p\\lor ((q\\lor p)\\supset p)) \\)"
    "\\( ((p\\land p)\\equiv (q\\lor p)) \\)"
    "\\( (q\\equiv (q\\equiv (p\\lor q))) \\)"
    "\\( ((q\\equiv (p\\lor p))\\supset q) \\)"
    "\\( (((p\\lor q)\\equiv q)\\supset q) \\)"
    "\\( (p\\lor (\\lnot p\\supset q)) \\)"
    "\\( ((p\\lor q)\\equiv (p\\equiv p)) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\equiv p)) \\)"
    "\\( (q\\supset (p\\supset (p\\equiv p))) \\)"
    "\\( ((p\\supset p)\\lor q) \\)"
    "\\( ((q\\lor (p\\supset q))\\lor p) \\)"
    "\\( (p\\lor (p\\lor (p\\equiv p))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\lor p)\\land \\lnot p)\\), \\((\\lnot (p\\land p)\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (q\\equiv (p\\supset \\lnot q)) \\)"
    "\\( (q\\equiv \\lnot (p\\land q)) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( \\lnot (p\\lor \\lnot q) \\)"
    "\\( \\lnot ((p\\supset p)\\land p) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset p) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv p) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\equiv q)\\land q) \\)"
    "\\( \\lnot (p\\land q) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( (q\\lor ((q\\land p)\\lor q)) \\)"
    "\\( (q\\land ((p\\equiv p)\\lor q)) \\)"
    "\\( ((q\\equiv (q\\land q))\\equiv q) \\)"
    "\\( (q\\land ((q\\equiv q)\\lor p)) \\)"
    "\\( (q\\land (p\\lor q)) \\)"
    "\\( (q\\equiv (q\\lor (p\\lor q))) \\)"
    "\\( (((p\\land p)\\supset q)\\lor q) \\)"
    "\\( ((p\\land (q\\supset p))\\supset q) \\)"
    "\\( ((p\\land (q\\supset q))\\supset q) \\)"
    "\\( ((q\\land p)\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot p\\supset (q\\land q)) \\)"
    "\\( (\\lnot (p\\equiv q)\\lor p) \\)"
    "\\( ((p\\lor q)\\equiv (q\\supset q)) \\)"
    "\\( ((q\\land (q\\equiv q))\\lor p) \\)"
    "\\( (\\lnot (p\\equiv q)\\lor q) \\)"
    "\\( ((q\\land p)\\supset (q\\land q)) \\)"
    "\\( ((q\\land p)\\supset (q\\equiv p)) \\)"
    "\\( ((q\\supset p)\\lor (q\\supset q)) \\)"
    "\\( ((p\\land q)\\supset (p\\lor p)) \\)"
    "\\( (q\\lor (q\\supset (p\\land p))) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (\\lnot (q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((q\\lor (q\\lor q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (p\\equiv ((q\\equiv q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((q\\supset (p\\lor q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (q\\supset ((p\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( \\lnot (p\\supset (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( \\lnot ((q\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((q\\equiv q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (p\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (p\\equiv (q\\land (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((p\\lor p)\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (((q\\land p)\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( \\lnot (q\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( \\lnot ((p\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (\\lnot (q\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((\\lnot p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((q\\equiv (q\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (((p\\lor q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((p\\supset q)\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (q\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (\\lnot p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (\\lnot q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((p\\supset q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (((q\\lor p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (((q\\equiv q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( ((q\\equiv p)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
            ["\\( (((q\\equiv p)\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0110 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\land (q\\supset \\lnot p))\\), \\((q\\supset (\\lnot p\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\lor q)\\land \\lnot p) \\)"
    "\\( (\\lnot (p\\land p)\\land q) \\)"
    "\\( \\lnot (q\\equiv (p\\land q)) \\)"
    "\\( (q\\land \\lnot (p\\lor p)) \\)"
    "\\( ((p\\equiv \\lnot q)\\land q) \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( \\lnot ((q\\equiv q)\\land p) \\)"
    "\\( ((q\\equiv \\lnot p)\\equiv q) \\)"
    "\\( \\lnot (p\\lor (p\\land q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv q) \\)"
    "\\( (q\\supset (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( ((q\\supset q)\\supset q) \\)"
    "\\( ((q\\equiv (q\\supset q))\\lor q) \\)"
    "\\( (((q\\land q)\\land q)\\lor q) \\)"
    "\\( (\\lnot (q\\supset q)\\lor q) \\)"
    "\\( (q\\lor ((q\\equiv q)\\supset q)) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\supset q) \\)"
    "\\( ((p\\land p)\\supset (q\\lor q)) \\)"
    "\\( (\\lnot \\lnot p\\supset q) \\)"
    "\\( ((q\\equiv (p\\lor p))\\lor q) \\)"
    "\\( (p\\equiv ((p\\lor p)\\land q)) \\)"
    "\\( (q\\equiv (p\\supset (q\\equiv p))) \\)"
    "\\( ((q\\lor p)\\lor (p\\land p)) \\)"
    "\\( ((q\\lor p)\\lor (q\\land q)) \\)"
    "\\( ((q\\equiv (p\\land p))\\supset q) \\)"
    "\\( ((q\\lor p)\\land (p\\supset p)) \\)"
    "\\( (((q\\supset q)\\equiv q)\\equiv q) \\)"
    "\\( ((q\\land (q\\lor p))\\equiv q) \\)"
    "\\( (p\\supset ((q\\land q)\\supset p)) \\)"
    "\\( \\lnot \\lnot (p\\supset p) \\)"
    "\\( (p\\supset ((p\\supset q)\\supset q)) \\)"
  ]
  :wrong [
            ["\\( ((q\\supset \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (\\lnot q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (((q\\land p)\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (p\\equiv (p\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (((p\\lor q)\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (q\\supset (p\\equiv (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot (p\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (\\lnot p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot (p\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\equiv \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (p\\land (p\\equiv (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\equiv q)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((q\\supset (p\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\equiv q)\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (\\lnot (q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot ((p\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot (q\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((q\\equiv q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (p\\land (q\\supset (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((p\\supset q)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (\\lnot q\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (q\\supset (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (((p\\lor p)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( ((\\lnot p\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
            ["\\( (p\\lor (q\\supset (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\supset p)\\land q)\\), \\((q\\land ((q\\supset q)\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\land \\lnot q)\\land p) \\)"
    "\\( (\\lnot (p\\land p)\\land p) \\)"
    "\\( \\lnot ((p\\equiv p)\\lor p) \\)"
    "\\( (\\lnot (q\\supset p)\\land p) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( \\lnot ((q\\lor p)\\lor q) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( \\lnot ((p\\supset q)\\supset q) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor p) \\)"
    "\\( (q\\equiv \\lnot (p\\land q)) \\)"
    "\\( ((p\\supset \\lnot q)\\land q) \\)"
    "\\( (\\lnot (q\\equiv p)\\land q) \\)"
    "\\( \\lnot (p\\lor (p\\equiv q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor p) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot q)) \\)"
    "\\( (p\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset p) \\)"
    "\\( \\lnot (\\lnot p\\supset p) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (p\\land q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( (p\\land \\lnot (p\\land q)) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( (p\\land \\lnot (p\\equiv q)) \\)"
    "\\( ((q\\supset q)\\supset \\lnot q) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((q\\lor q)\\land q) \\)"
    "\\( ((q\\supset q)\\land \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( (q\\equiv (\\lnot q\\lor p)) \\)"
    "\\( ((q\\supset q)\\land (q\\land p)) \\)"
    "\\( ((p\\equiv (q\\lor q))\\land q) \\)"
    "\\( (q\\land ((p\\equiv q)\\land q)) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\land (p\\supset p)) \\)"
    "\\( (p\\equiv (q\\lor (q\\land q))) \\)"
    "\\( ((q\\supset q)\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\land q)) \\)"
    "\\( ((p\\equiv (q\\equiv p))\\equiv p) \\)"
    "\\( (\\lnot q\\supset (p\\land q)) \\)"
    "\\( (q\\lor ((q\\land q)\\lor q)) \\)"
    "\\( ((q\\lor q)\\land (p\\lor q)) \\)"
    "\\( ((p\\supset (q\\equiv q))\\land q) \\)"
    "\\( ((q\\land q)\\lor q) \\)"
    "\\( (p\\supset (q\\equiv (p\\lor q))) \\)"
    "\\( ((q\\land p)\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot p\\lor (q\\lor q)) \\)"
    "\\( ((p\\supset q)\\lor (q\\land p)) \\)"
    "\\( ((p\\equiv q)\\lor (p\\supset q)) \\)"
    "\\( (((p\\lor q)\\land p)\\lor p) \\)"
    "\\( ((p\\lor (q\\land p))\\lor p) \\)"
    "\\( ((q\\supset (q\\equiv q))\\equiv p) \\)"
    "\\( (p\\land (q\\equiv (p\\land q))) \\)"
    "\\( ((q\\land p)\\lor p) \\)"
    "\\( (((q\\equiv q)\\equiv q)\\supset p) \\)"
    "\\( (q\\supset (p\\lor (q\\supset p))) \\)"
    "\\( ((p\\lor \\lnot q)\\lor p) \\)"
    "\\( (p\\lor (q\\equiv p)) \\)"
    "\\( ((q\\land q)\\supset (q\\supset p)) \\)"
    "\\( ((p\\supset (p\\land q))\\supset q) \\)"
    "\\( ((q\\lor (p\\equiv q))\\supset q) \\)"
    "\\( (q\\lor ((q\\equiv q)\\land p)) \\)"
    "\\( ((p\\equiv (q\\land p))\\equiv q) \\)"
    "\\( (p\\lor ((q\\equiv p)\\supset p)) \\)"
    "\\( (((p\\equiv q)\\equiv p)\\supset q) \\)"
    "\\( (((q\\equiv q)\\lor q)\\lor p) \\)"
    "\\( ((p\\land \\lnot p)\\supset q) \\)"
    "\\( (p\\equiv (p\\lor (p\\land q))) \\)"
    "\\( (q\\supset ((q\\land q)\\lor q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot p\\land (q\\lor p))\\), \\(((q\\equiv q)\\equiv (p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land \\lnot (q\\equiv q)) \\)"
    "\\( (p\\land (\\lnot p\\land q)) \\)"
    "\\( \\lnot (q\\lor \\lnot q) \\)"
    "\\( \\lnot (q\\supset (q\\lor p)) \\)"
    "\\( \\lnot (q\\supset (q\\supset q)) \\)"
    "\\( \\lnot (p\\lor (p\\lor q)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( \\lnot (q\\lor (p\\lor p)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( ((q\\equiv p)\\land \\lnot p) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv q) \\)"
    "\\( (\\lnot p\\land (q\\land q)) \\)"
    "\\( (q\\land (q\\supset \\lnot p)) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( \\lnot (p\\lor (q\\equiv p)) \\)"
    "\\( (p\\supset \\lnot (p\\lor p)) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset p) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( (\\lnot p\\land (p\\supset p)) \\)"
    "\\( (q\\equiv \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor q) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( \\lnot (p\\supset (p\\land q)) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot q) \\)"
    "\\( (\\lnot q\\land (p\\supset p)) \\)"
    "\\( (q\\supset \\lnot (q\\lor p)) \\)"
    "\\( ((q\\equiv q)\\land \\lnot q) \\)"
    "\\( (q\\supset (\\lnot p\\land p)) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\land p) \\)"
    "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
    "\\( (p\\equiv (p\\supset (p\\supset q))) \\)"
    "\\( (q\\equiv ((q\\lor p)\\supset p)) \\)"
    "\\( ((q\\land q)\\equiv (q\\supset p)) \\)"
    "\\( (p\\land (q\\lor (p\\equiv q))) \\)"
    "\\( (q\\equiv (p\\lor (q\\equiv p))) \\)"
    "\\( ((p\\equiv q)\\equiv (q\\equiv q)) \\)"
    "\\( ((q\\equiv p)\\lor (p\\land q)) \\)"
    "\\( ((q\\lor q)\\equiv (p\\land p)) \\)"
    "\\( (p\\equiv (\\lnot q\\supset q)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\land q)) \\)"
    "\\( ((q\\equiv (q\\lor q))\\land q) \\)"
    "\\( ((q\\supset (q\\equiv q))\\supset q) \\)"
    "\\( ((p\\supset (p\\supset p))\\equiv q) \\)"
    "\\( (q\\equiv (q\\equiv (q\\lor q))) \\)"
    "\\( (q\\equiv ((q\\land p)\\supset q)) \\)"
    "\\( (((p\\land q)\\lor p)\\supset q) \\)"
    "\\( (p\\supset (q\\land (p\\land p))) \\)"
    "\\( (p\\supset ((p\\equiv p)\\equiv q)) \\)"
    "\\( (q\\lor (\\lnot p\\lor q)) \\)"
    "\\( (((p\\supset q)\\equiv p)\\equiv p) \\)"
    "\\( ((p\\lor (q\\supset q))\\equiv p) \\)"
    "\\( (p\\land (p\\supset (p\\equiv p))) \\)"
    "\\( ((q\\lor q)\\equiv (p\\equiv q)) \\)"
    "\\( ((p\\lor p)\\equiv (q\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\land q)\\supset q)) \\)"
    "\\( ((p\\lor q)\\supset (q\\supset p)) \\)"
    "\\( (q\\equiv ((q\\land q)\\land p)) \\)"
    "\\( (q\\supset ((q\\lor q)\\supset p)) \\)"
    "\\( (q\\equiv (q\\land (p\\lor p))) \\)"
    "\\( ((q\\land q)\\supset (p\\land p)) \\)"
    "\\( (q\\lor ((q\\equiv p)\\equiv q)) \\)"
    "\\( (((p\\lor p)\\supset q)\\equiv q) \\)"
    "\\( ((p\\lor p)\\lor q) \\)"
    "\\( ((p\\lor q)\\lor (p\\lor q)) \\)"
    "\\( (\\lnot \\lnot p\\lor q) \\)"
    "\\( ((p\\equiv (p\\lor p))\\lor p) \\)"
    "\\( (((p\\lor q)\\land q)\\supset q) \\)"
    "\\( (q\\lor ((p\\equiv p)\\lor q)) \\)"
    "\\( ((p\\equiv p)\\lor q) \\)"
    "\\( (q\\supset (q\\supset (q\\lor p))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\lor q)\\supset p)\\), \\(((p\\supset (q\\equiv p))\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( (q\\land (q\\equiv \\lnot p)) \\)"
    "\\( (q\\land (\\lnot q\\equiv p)) \\)"
    "\\( (q\\land \\lnot (q\\supset p)) \\)"
    "\\( \\lnot (p\\land (p\\lor q)) \\)"
    "\\( (p\\supset \\lnot (p\\lor q)) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot q)) \\)"
    "\\( ((p\\supset q)\\land \\lnot p) \\)"
    "\\( (\\lnot p\\land (q\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (p\\supset (p\\land \\lnot q)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv q) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( (q\\equiv ((p\\equiv p)\\lor p)) \\)"
    "\\( (q\\lor \\lnot (q\\supset p)) \\)"
    "\\( ((q\\equiv q)\\equiv q) \\)"
    "\\( ((p\\equiv p)\\supset (q\\lor q)) \\)"
    "\\( (q\\land (q\\equiv (p\\lor q))) \\)"
    "\\( (p\\supset ((p\\equiv q)\\land p)) \\)"
    "\\( ((p\\equiv (q\\supset p))\\supset q) \\)"
    "\\( ((p\\land (q\\equiv p))\\equiv p) \\)"
    "\\( (((q\\equiv p)\\land p)\\equiv p) \\)"
    "\\( ((p\\lor (q\\land p))\\supset q) \\)"
    "\\( (q\\lor (p\\lor (p\\lor q))) \\)"
    "\\( (q\\equiv ((p\\lor q)\\equiv q)) \\)"
    "\\( ((q\\equiv (p\\equiv q))\\lor q) \\)"
    "\\( (((q\\equiv p)\\supset q)\\lor p) \\)"
    "\\( (p\\equiv ((p\\lor q)\\supset p)) \\)"
    "\\( (q\\supset ((p\\lor p)\\supset p)) \\)"
    "\\( ((p\\lor p)\\supset p) \\)"
    "\\( (q\\equiv (q\\land q)) \\)"
    "\\( ((q\\equiv q)\\lor (p\\supset q)) \\)"
    "\\( ((q\\supset q)\\lor (q\\land p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot (p\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (q\\supset \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((q\\supset q)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (((q\\equiv q)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (((p\\land p)\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((p\\land (q\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((p\\land q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot (q\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (((q\\lor p)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((q\\equiv (q\\equiv q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((p\\supset (p\\equiv p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (((q\\lor q)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((p\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot ((q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (((p\\supset q)\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (p\\equiv ((q\\equiv q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (p\\equiv (p\\lor (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (\\lnot (q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot ((q\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((q\\supset \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( \\lnot ((q\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (p\\land (p\\equiv (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (\\lnot p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( ((q\\lor \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
            ["\\( (q\\supset (p\\land (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((q\\land q)\\supset p)\\), \\((p\\equiv (q\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\supset p) \\)"
    "\\( (q\\land (p\\supset \\lnot p)) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset \\lnot q)\\equiv q) \\)"
    "\\( ((q\\land \\lnot p)\\land q) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( (p\\supset (q\\land \\lnot p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\equiv p) \\)"
    "\\( \\lnot ((q\\equiv q)\\equiv p) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( \\lnot (p\\land (q\\land p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\equiv q)) \\)"
    "\\( ((p\\supset (q\\equiv q))\\supset q) \\)"
    "\\( (q\\lor (q\\land (q\\supset q))) \\)"
    "\\( (q\\lor ((q\\supset q)\\equiv q)) \\)"
    "\\( (((q\\land p)\\equiv p)\\land q) \\)"
    "\\( (q\\land (q\\lor (p\\land p))) \\)"
    "\\( ((p\\supset q)\\land (q\\equiv q)) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\land p)) \\)"
    "\\( (((p\\land q)\\equiv p)\\lor q) \\)"
    "\\( (((p\\equiv p)\\supset p)\\supset q) \\)"
    "\\( (\\lnot q\\supset \\lnot p) \\)"
    "\\( (p\\lor ((p\\lor q)\\lor p)) \\)"
    "\\( (q\\lor (p\\lor (p\\land q))) \\)"
    "\\( ((\\lnot p\\equiv q)\\lor q) \\)"
    "\\( ((p\\equiv (q\\land p))\\equiv q) \\)"
    "\\( (((p\\land p)\\lor q)\\lor q) \\)"
    "\\( (q\\supset (p\\supset (p\\supset q))) \\)"
    "\\( (p\\supset (p\\equiv (p\\lor q))) \\)"
    "\\( (q\\lor (q\\supset (p\\lor p))) \\)"
    "\\( (p\\lor (p\\supset (p\\supset p))) \\)"
    "\\( ((p\\supset (q\\lor p))\\lor q) \\)"
  ]
  :wrong [
            ["\\( ((p\\supset \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((p\\supset q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (\\lnot q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((q\\land q)\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((p\\land (q\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (p\\land ((q\\lor q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\supset (q\\supset (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( \\lnot (q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\equiv \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( \\lnot (q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\land ((p\\land q)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (p\\lor (q\\land (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (p\\lor \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (\\lnot p\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((p\\supset q)\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (((q\\supset p)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((q\\lor q)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (((p\\land p)\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((q\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( ((p\\land \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( \\lnot (q\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (((q\\equiv p)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (((q\\supset p)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (p\\land (q\\supset (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
            ["\\( (q\\supset ((q\\land q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\lor \\lnot q)\\), \\((p\\land (q\\lor \\lnot q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land \\lnot (p\\land p)) \\)"
    "\\( (q\\land (\\lnot p\\land p)) \\)"
    "\\( ((\\lnot p\\land p)\\land q) \\)"
    "\\( (q\\land \\lnot (q\\lor q)) \\)"
    "\\( (q\\equiv \\lnot q) \\)"
    "\\( \\lnot (\\lnot q\\supset p) \\)"
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( ((q\\land \\lnot p)\\equiv p) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( \\lnot ((q\\lor p)\\supset p) \\)"
    "\\( (\\lnot (p\\lor q)\\equiv p) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( \\lnot (p\\lor (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\land p) \\)"
    "\\( \\lnot ((p\\supset p)\\land p) \\)"
    "\\( ((p\\lor p)\\supset \\lnot p) \\)"
    "\\( ((p\\equiv p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor q) \\)"
    "\\( \\lnot (p\\supset (q\\land q)) \\)"
    "\\( (\\lnot (q\\lor q)\\land p) \\)"
    "\\( \\lnot (q\\lor \\lnot p) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot q) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv q) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv q) \\)"
    "\\( ((q\\equiv q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\supset q)) \\)"
    "\\( \\lnot ((q\\supset p)\\equiv q) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (((q\\supset p)\\land q)\\land q) \\)"
    "\\( ((q\\land p)\\land (p\\lor p)) \\)"
    "\\( (q\\land ((q\\supset p)\\land q)) \\)"
    "\\( \\lnot \\lnot (p\\land q) \\)"
    "\\( (((q\\lor q)\\equiv p)\\land q) \\)"
    "\\( (p\\equiv ((q\\supset p)\\supset q)) \\)"
    "\\( (p\\equiv (q\\land (p\\lor q))) \\)"
    "\\( (((q\\equiv q)\\supset p)\\equiv q) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\lor (p\\equiv q)) \\)"
    "\\( (q\\land (q\\equiv (p\\equiv p))) \\)"
    "\\( (((p\\equiv q)\\lor p)\\supset q) \\)"
    "\\( (q\\land (p\\supset p)) \\)"
    "\\( (\\lnot \\lnot q\\land q) \\)"
    "\\( ((q\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv (q\\land p)) \\)"
    "\\( ((p\\land p)\\supset (q\\land p)) \\)"
    "\\( (q\\lor ((p\\land q)\\equiv p)) \\)"
    "\\( (p\\supset ((p\\supset q)\\land p)) \\)"
    "\\( ((p\\lor (p\\land p))\\supset q) \\)"
    "\\( (\\lnot (q\\equiv q)\\lor p) \\)"
    "\\( (\\lnot (p\\lor p)\\supset p) \\)"
    "\\( (p\\equiv ((q\\land p)\\supset p)) \\)"
    "\\( ((q\\supset (p\\equiv q))\\land p) \\)"
    "\\( (q\\equiv ((q\\land q)\\equiv p)) \\)"
    "\\( (((p\\equiv q)\\equiv p)\\supset p) \\)"
    "\\( ((p\\lor (q\\lor p))\\equiv p) \\)"
    "\\( (q\\supset (q\\supset (p\\equiv q))) \\)"
    "\\( (q\\supset (\\lnot q\\lor p)) \\)"
    "\\( ((q\\lor q)\\supset (p\\lor p)) \\)"
    "\\( ((p\\lor (q\\equiv p))\\equiv p) \\)"
    "\\( ((p\\lor q)\\lor (p\\land q)) \\)"
    "\\( (q\\equiv (q\\lor (p\\supset q))) \\)"
    "\\( ((q\\supset (p\\lor p))\\equiv p) \\)"
    "\\( ((q\\equiv (p\\land p))\\supset p) \\)"
    "\\( (p\\supset ((p\\equiv p)\\supset p)) \\)"
    "\\( ((q\\lor p)\\lor \\lnot p) \\)"
    "\\( (p\\lor ((q\\land q)\\supset q)) \\)"
    "\\( (\\lnot q\\lor (q\\land q)) \\)"
    "\\( (p\\supset (p\\equiv (q\\supset q))) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((p\\lor q)\\equiv \\lnot p)\\), \\(((q\\land q)\\equiv (p\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
    "\\( (p\\land \\lnot (q\\lor p)) \\)"
    "\\( (\\lnot (q\\supset q)\\land p) \\)"
    "\\( \\lnot (p\\supset (q\\supset p)) \\)"
    "\\( (p\\land (p\\equiv \\lnot p)) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( (p\\equiv (\\lnot p\\land q)) \\)"
    "\\( (\\lnot p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot (q\\lor (p\\land p)) \\)"
    "\\( ((p\\equiv q)\\land \\lnot p) \\)"
    "\\( ((q\\supset \\lnot p)\\land q) \\)"
    "\\( (q\\land (q\\supset \\lnot p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor p) \\)"
    "\\( \\lnot ((p\\land q)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset q)) \\)"
    "\\( (p\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( ((p\\equiv p)\\land \\lnot p) \\)"
    "\\( ((q\\equiv q)\\land \\lnot p) \\)"
    "\\( ((p\\supset p)\\land \\lnot p) \\)"
    "\\( ((q\\supset \\lnot p)\\land p) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
    "\\( ((\\lnot p\\equiv q)\\land p) \\)"
    "\\( \\lnot ((q\\lor p)\\supset q) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( \\lnot ((q\\equiv q)\\supset q) \\)"
    "\\( (\\lnot q\\land (q\\supset q)) \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( \\lnot (p\\land (p\\land q)) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( ((p\\lor (p\\land p))\\land q) \\)"
    "\\( ((q\\equiv (q\\supset p))\\land q) \\)"
    "\\( (((q\\equiv p)\\land p)\\land q) \\)"
    "\\( (((p\\lor q)\\land p)\\land q) \\)"
    "\\( (p\\land (p\\supset (q\\lor q))) \\)"
    "\\( ((p\\lor q)\\supset (q\\land p)) \\)"
    "\\( ((q\\equiv p)\\lor (q\\land p)) \\)"
    "\\( (p\\equiv (q\\land (p\\supset p))) \\)"
    "\\( \\lnot (p\\equiv \\lnot q) \\)"
    "\\( ((q\\supset q)\\supset (q\\equiv p)) \\)"
    "\\( (q\\equiv ((q\\land q)\\supset q)) \\)"
    "\\( ((q\\supset (p\\lor p))\\supset q) \\)"
    "\\( ((q\\lor q)\\land (q\\supset q)) \\)"
    "\\( (q\\land ((p\\supset p)\\supset q)) \\)"
    "\\( ((p\\land q)\\lor (q\\land q)) \\)"
    "\\( (p\\supset ((q\\supset p)\\supset q)) \\)"
    "\\( ((p\\land p)\\supset (q\\lor q)) \\)"
    "\\( (q\\equiv ((q\\supset p)\\supset p)) \\)"
    "\\( (p\\equiv (p\\land (q\\equiv p))) \\)"
    "\\( ((q\\supset q)\\land (p\\supset q)) \\)"
    "\\( (q\\equiv ((q\\land q)\\equiv p)) \\)"
    "\\( (((q\\land p)\\lor p)\\lor p) \\)"
    "\\( ((p\\supset (q\\supset q))\\land p) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\lor p) \\)"
    "\\( (p\\land (\\lnot p\\supset p)) \\)"
    "\\( (q\\supset (q\\equiv (q\\supset p))) \\)"
    "\\( (p\\equiv (p\\lor q)) \\)"
    "\\( (p\\lor (p\\equiv (q\\lor p))) \\)"
    "\\( (q\\supset (q\\supset (p\\land q))) \\)"
    "\\( (((q\\land q)\\lor q)\\supset p) \\)"
    "\\( (q\\lor ((p\\equiv q)\\supset q)) \\)"
    "\\( ((q\\equiv (p\\supset q))\\lor q) \\)"
    "\\( ((p\\equiv q)\\equiv (q\\land p)) \\)"
    "\\( (((q\\lor p)\\equiv p)\\supset p) \\)"
    "\\( (\\lnot (q\\equiv p)\\lor q) \\)"
    "\\( (((p\\lor q)\\supset p)\\lor q) \\)"
    "\\( (q\\equiv (q\\land (p\\supset p))) \\)"
    "\\( (p\\supset (p\\lor (p\\equiv p))) \\)"
    "\\( ((q\\lor (q\\land p))\\supset q) \\)"
    "\\( (p\\supset ((p\\equiv p)\\supset p)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (p\\land q)\\land q)\\), \\((p\\lor (p\\equiv \\lnot q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\land (p\\lor q)) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( (q\\land (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( \\lnot (q\\supset (q\\equiv p)) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( (p\\supset (q\\equiv \\lnot q)) \\)"
    "\\( (p\\supset \\lnot p) \\)"
    "\\( \\lnot p \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( (q\\equiv (q\\land \\lnot p)) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (q\\lor (q\\land (q\\equiv q))) \\)"
    "\\( (\\lnot q\\supset q) \\)"
    "\\( (q\\lor ((q\\supset q)\\supset q)) \\)"
    "\\( ((p\\supset (q\\equiv p))\\land q) \\)"
    "\\( (((p\\equiv q)\\supset q)\\land q) \\)"
    "\\( (((q\\equiv q)\\land p)\\supset q) \\)"
    "\\( ((q\\supset p)\\supset (q\\equiv p)) \\)"
    "\\( (p\\supset ((q\\land q)\\lor q)) \\)"
    "\\( ((p\\land (q\\lor q))\\equiv p) \\)"
    "\\( ((p\\land (p\\supset q))\\equiv p) \\)"
    "\\( ((p\\equiv (q\\equiv q))\\lor q) \\)"
    "\\( (((p\\lor q)\\supset p)\\supset p) \\)"
    "\\( (((q\\lor p)\\supset p)\\equiv p) \\)"
    "\\( (((q\\lor p)\\lor p)\\lor p) \\)"
    "\\( (q\\lor \\lnot \\lnot p) \\)"
    "\\( ((p\\supset (p\\land p))\\lor q) \\)"
    "\\( ((p\\supset (q\\lor p))\\lor q) \\)"
    "\\( (((p\\equiv q)\\lor q)\\lor p) \\)"
    "\\( (q\\supset (p\\supset (p\\lor p))) \\)"
    "\\( ((q\\land p)\\supset (p\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot q\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((q\\supset p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\land (q\\lor q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (p\\equiv ((q\\land q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (((q\\lor p)\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (p\\equiv ((p\\equiv q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\equiv p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (q\\equiv (q\\supset (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (((q\\supset p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\lor (p\\land q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (\\lnot p\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( \\lnot (q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((q\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( \\lnot ((p\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\equiv (p\\land q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\equiv (q\\equiv q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\supset p)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\lor p)\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (q\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (p\\equiv (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (((p\\equiv p)\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( (((p\\equiv q)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
            ["\\( ((p\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\supset \\lnot p)\\land q)\\), \\((q\\lor ((p\\land q)\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\lor p)\\land \\lnot p) \\)"
    "\\( (q\\land \\lnot (q\\equiv p)) \\)"
    "\\( (\\lnot (q\\land p)\\land q) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( ((p\\supset \\lnot q)\\equiv q) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( ((q\\lor p)\\supset \\lnot p) \\)"
    "\\( ((q\\equiv \\lnot q)\\equiv p) \\)"
    "\\( (p\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( (\\lnot p\\equiv (q\\equiv q)) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (p\\supset (p\\land \\lnot q)) \\)"
    "\\( (q\\land (p\\supset (p\\equiv q))) \\)"
    "\\( ((q\\supset (p\\equiv q))\\supset q) \\)"
    "\\( ((q\\lor q)\\land (p\\supset p)) \\)"
    "\\( ((p\\land (q\\lor q))\\lor q) \\)"
    "\\( ((p\\equiv p)\\land (q\\lor q)) \\)"
    "\\( (p\\equiv (q\\land (q\\equiv p))) \\)"
    "\\( (p\\supset (q\\equiv (q\\supset q))) \\)"
    "\\( (p\\supset (q\\equiv (p\\land p))) \\)"
    "\\( ((q\\land (q\\equiv p))\\equiv p) \\)"
    "\\( (p\\supset ((p\\lor p)\\land q)) \\)"
    "\\( ((q\\equiv p)\\supset q) \\)"
    "\\( (p\\lor (p\\lor q)) \\)"
    "\\( ((q\\land (q\\supset q))\\lor p) \\)"
    "\\( ((\\lnot q\\land p)\\lor q) \\)"
    "\\( (p\\lor ((q\\supset p)\\supset p)) \\)"
    "\\( ((q\\land q)\\lor (q\\supset p)) \\)"
    "\\( (p\\supset (p\\land (q\\supset q))) \\)"
    "\\( (p\\supset ((q\\supset p)\\supset p)) \\)"
    "\\( (((q\\equiv q)\\lor p)\\lor q) \\)"
    "\\( (q\\equiv (q\\land (q\\land q))) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((p\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((p\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (((q\\supset p)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( ((q\\lor q)\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (((q\\supset q)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (q\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (p\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((q\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (\\lnot \\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (((q\\equiv q)\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (((q\\supset p)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (q\\supset \\lnot \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((p\\land q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (\\lnot q\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((p\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (q\\land (p\\equiv (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( ((p\\supset q)\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( ((p\\lor p)\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (q\\supset ((q\\equiv q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot (p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( \\lnot ((p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (q\\land (p\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( ((p\\equiv q)\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (((q\\equiv p)\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
            ["\\( (p\\lor ((q\\lor p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0100 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (p\\equiv q)\\equiv q)\\), \\((p\\equiv (p\\supset \\lnot q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\supset (p\\lor q)) \\)"
    "\\( \\lnot (q\\supset (q\\equiv q)) \\)"
    "\\( (p\\land (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot ((p\\equiv p)\\lor p) \\)"
    "\\( (q\\land \\lnot (p\\supset q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot p) \\)"
    "\\( \\lnot ((p\\lor q)\\lor q) \\)"
    "\\( (q\\land (\\lnot p\\land q)) \\)"
    "\\( \\lnot (p\\equiv (q\\lor p)) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (\\lnot (p\\land q)\\land q) \\)"
    "\\( (q\\land (q\\land \\lnot p)) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv p) \\)"
    "\\( \\lnot ((p\\supset p)\\land p) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\lor (p\\land p)) \\)"
    "\\( (p\\supset (p\\equiv \\lnot p)) \\)"
    "\\( (p\\equiv (p\\supset \\lnot q)) \\)"
    "\\( (p\\land \\lnot q) \\)"
    "\\( ((p\\land p)\\land \\lnot q) \\)"
    "\\( \\lnot ((p\\lor p)\\supset q) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( \\lnot \\lnot \\lnot q \\)"
    "\\( (q\\supset (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (q\\land (q\\lor q)) \\)"
    "\\( \\lnot ((q\\lor q)\\land q) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot ((q\\land q)\\equiv p) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( \\lnot ((p\\lor p)\\land q) \\)"
    "\\( \\lnot (p\\land (q\\land p)) \\)"
    "\\( \\lnot (q\\equiv (q\\supset p)) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( ((q\\lor (p\\equiv q))\\equiv p) \\)"
    "\\( ((q\\land p)\\land (p\\supset q)) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv q)) \\)"
    "\\( ((q\\supset (q\\supset p))\\land q) \\)"
    "\\( ((q\\equiv (p\\equiv p))\\land p) \\)"
    "\\( ((p\\equiv q)\\land (p\\supset q)) \\)"
    "\\( ((q\\lor (q\\land p))\\equiv p) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv \\lnot \\lnot q) \\)"
    "\\( (q\\equiv ((q\\supset q)\\equiv p)) \\)"
    "\\( (q\\land (q\\supset (q\\lor p))) \\)"
    "\\( (q\\lor (q\\land (p\\lor q))) \\)"
    "\\( (q\\lor (\\lnot p\\land p)) \\)"
    "\\( (\\lnot (p\\supset p)\\lor q) \\)"
    "\\( (((p\\supset q)\\equiv q)\\land q) \\)"
    "\\( (p\\supset ((q\\land p)\\lor q)) \\)"
    "\\( (q\\lor ((p\\supset q)\\lor q)) \\)"
    "\\( ((p\\supset q)\\lor (q\\land p)) \\)"
    "\\( (q\\lor (q\\lor (q\\equiv p))) \\)"
    "\\( (p\\equiv ((p\\lor p)\\land q)) \\)"
    "\\( (((p\\land p)\\lor q)\\land p) \\)"
    "\\( (((p\\supset q)\\lor q)\\supset p) \\)"
    "\\( (p\\land (p\\lor (p\\land q))) \\)"
    "\\( (((p\\lor p)\\land q)\\lor p) \\)"
    "\\( ((q\\equiv (q\\land q))\\supset p) \\)"
    "\\( (p\\lor (\\lnot q\\lor p)) \\)"
    "\\( ((p\\land q)\\lor (q\\supset p)) \\)"
    "\\( (q\\equiv ((q\\supset p)\\land q)) \\)"
    "\\( ((q\\land (p\\supset p))\\supset p) \\)"
    "\\( (((q\\lor p)\\lor p)\\supset p) \\)"
    "\\( (q\\equiv (p\\supset (q\\equiv p))) \\)"
    "\\( (q\\lor (p\\land (q\\lor p))) \\)"
    "\\( ((q\\equiv (p\\land q))\\supset p) \\)"
    "\\( ((q\\supset (p\\land q))\\supset p) \\)"
    "\\( (p\\equiv ((q\\lor p)\\supset p)) \\)"
    "\\( ((q\\supset q)\\lor (p\\supset p)) \\)"
    "\\( (p\\supset (p\\equiv (p\\supset p))) \\)"
    "\\( (((q\\equiv q)\\equiv p)\\supset p) \\)"
    "\\( (p\\supset ((q\\lor p)\\lor p)) \\)"
    "\\( (p\\supset (q\\equiv q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv p)\\equiv \\lnot q)\\), \\(\\lnot ((p\\supset p)\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot q\\land p)\\equiv q) \\)"
    "\\( (\\lnot q\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv (\\lnot p\\land q)) \\)"
    "\\( \\lnot (p\\equiv (q\\supset p)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor q) \\)"
    "\\( ((\\lnot p\\equiv p)\\equiv p) \\)"
    "\\( \\lnot ((p\\equiv p)\\equiv p) \\)"
    "\\( \\lnot (p\\lor (p\\land q)) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( (\\lnot p\\equiv (p\\supset p)) \\)"
    "\\( \\lnot (q\\land (p\\lor q)) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset q) \\)"
    "\\( (q\\supset (\\lnot q\\land q)) \\)"
    "\\( \\lnot ((p\\supset p)\\land q) \\)"
    "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( (q\\supset \\lnot (p\\land q)) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (((q\\equiv q)\\supset q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\lor (q\\land p)) \\)"
    "\\( ((q\\supset q)\\supset (p\\equiv q)) \\)"
    "\\( ((p\\supset p)\\equiv (p\\equiv q)) \\)"
    "\\( (q\\equiv ((p\\lor q)\\land p)) \\)"
    "\\( ((p\\lor p)\\supset (q\\lor q)) \\)"
    "\\( (p\\supset (q\\lor (p\\equiv q))) \\)"
    "\\( (p\\supset ((q\\land q)\\lor q)) \\)"
    "\\( ((p\\land (q\\lor p))\\supset q) \\)"
    "\\( (q\\equiv (p\\lor q)) \\)"
    "\\( \\lnot (q\\land \\lnot p) \\)"
    "\\( ((q\\land (p\\supset q))\\supset p) \\)"
    "\\( (p\\lor ((q\\lor p)\\equiv p)) \\)"
    "\\( (q\\supset p) \\)"
    "\\( ((q\\land q)\\supset (q\\supset p)) \\)"
    "\\( ((q\\supset (q\\lor p))\\lor p) \\)"
    "\\( (p\\supset ((q\\lor p)\\supset p)) \\)"
    "\\( (p\\supset (p\\equiv (q\\supset q))) \\)"
    "\\( ((p\\equiv p)\\lor (q\\land p)) \\)"
    "\\( ((p\\land q)\\lor (q\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( ((p\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\lor p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (\\lnot q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (q\\land (p\\lor (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (q\\land (p\\lor (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\land p)\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (p\\equiv ((q\\lor p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\land q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (\\lnot p\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\land p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( \\lnot (q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (p\\land ((p\\supset p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((p\\land (q\\lor q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((p\\supset (q\\land q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\land (p\\supset p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (p\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (\\lnot p\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( \\lnot ((p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (((p\\lor q)\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((p\\lor \\lnot p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (((q\\land q)\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((q\\equiv p)\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( \\lnot (q\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (\\lnot p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( \\lnot (p\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (((q\\equiv q)\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (q\\land (q\\supset (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( ((p\\lor \\lnot p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
            ["\\( (((q\\equiv p)\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1010 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\supset \\lnot (q\\supset p))\\), \\(((p\\land p)\\equiv \\lnot q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\lor \\lnot q) \\)"
    "\\( ((\\lnot p\\equiv q)\\land q) \\)"
    "\\( (q\\land (\\lnot p\\equiv q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (q\\land (q\\equiv \\lnot p)) \\)"
    "\\( (\\lnot p\\lor \\lnot p) \\)"
    "\\( (q\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( \\lnot ((p\\supset p)\\supset p) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( \\lnot (\\lnot p\\supset p) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\land q)) \\)"
    "\\( (q\\equiv (\\lnot p\\land q)) \\)"
    "\\( (q\\supset \\lnot (q\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\equiv q)) \\)"
    "\\( ((q\\land (p\\lor p))\\lor q) \\)"
    "\\( (q\\land (p\\supset (p\\equiv p))) \\)"
    "\\( (((q\\land p)\\supset q)\\land q) \\)"
    "\\( ((q\\equiv (q\\land q))\\supset q) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\land q) \\)"
    "\\( (\\lnot p\\lor (q\\land p)) \\)"
    "\\( (q\\lor \\lnot (p\\lor q)) \\)"
    "\\( (p\\supset ((p\\lor q)\\supset q)) \\)"
    "\\( (((q\\equiv p)\\supset q)\\equiv q) \\)"
    "\\( (p\\supset ((q\\land q)\\equiv p)) \\)"
    "\\( (q\\lor ((p\\lor p)\\lor p)) \\)"
    "\\( (((p\\land p)\\lor q)\\lor q) \\)"
    "\\( ((p\\equiv q)\\supset (p\\land p)) \\)"
    "\\( (((q\\lor p)\\lor q)\\lor p) \\)"
    "\\( (p\\lor ((p\\supset p)\\equiv q)) \\)"
    "\\( (((q\\equiv p)\\equiv p)\\supset q) \\)"
    "\\( (((p\\supset p)\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv ((q\\land p)\\lor p)) \\)"
    "\\( (((p\\supset p)\\equiv p)\\supset p) \\)"
    "\\( (\\lnot (p\\equiv p)\\supset p) \\)"
  ]
  :wrong [
            ["\\( (q\\land (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( \\lnot ((q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((q\\supset q)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\lor (p\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (q\\supset (q\\land (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( \\lnot ((q\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot q\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot q\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (q\\land ((q\\lor p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\equiv p)\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\lor (q\\land q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot p\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot q\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( \\lnot (q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\land (q\\equiv (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\equiv (p\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\land (p\\supset (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\equiv (q\\equiv p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (p\\land \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( \\lnot ((p\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (q\\land ((q\\land p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( (q\\equiv ((p\\lor q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((p\\supset \\lnot q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
            ["\\( ((q\\land (q\\supset q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0110 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\land p)\\lor p)\\), \\(((p\\land q)\\supset \\lnot p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\supset \\lnot (p\\land p)) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( (p\\supset (q\\supset \\lnot q)) \\)"
    "\\( (q\\supset (p\\supset \\lnot q)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (p\\land (q\\land q)) \\)"
    "\\( \\lnot ((p\\land q)\\land q) \\)"
    "\\( ((p\\land (q\\equiv q))\\supset q) \\)"
    "\\( (\\lnot (p\\lor q)\\lor q) \\)"
    "\\( (q\\lor ((q\\lor p)\\supset q)) \\)"
    "\\( ((q\\equiv (p\\lor p))\\lor q) \\)"
    "\\( ((q\\supset q)\\land (p\\supset q)) \\)"
    "\\( (p\\supset (q\\lor (p\\equiv p))) \\)"
    "\\( ((p\\supset p)\\lor (p\\land q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\equiv q)) \\)"
    "\\( ((q\\supset q)\\supset (p\\supset p)) \\)"
    "\\( (p\\equiv (p\\land (q\\supset q))) \\)"
  ]
  :wrong [
            ["\\( ((q\\land \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (\\lnot (q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot ((p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\supset \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\land ((p\\land p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\equiv (p\\land (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (((q\\lor q)\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (p\\land ((q\\lor q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\land (p\\supset p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((p\\lor q)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (q\\lor (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (\\lnot q\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\lor q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\supset q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\land ((q\\supset p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (p\\land (p\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\supset ((q\\land p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((p\\equiv q)\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (p\\lor (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot ((p\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (p\\equiv (q\\land (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\land ((p\\equiv q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((p\\supset p)\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (((q\\equiv p)\\supset p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (\\lnot q\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((\\lnot q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( \\lnot ((q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\land (p\\land (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (((q\\land p)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\supset p)\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (((q\\equiv p)\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( ((q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
            ["\\( (q\\lor (q\\equiv (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\equiv p)\\equiv q)\\), \\((q\\equiv ((q\\lor p)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\supset (q\\supset q)) \\)"
    "\\( (q\\land (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot ((q\\equiv q)\\lor p) \\)"
    "\\( (p\\land (p\\supset \\lnot p)) \\)"
    "\\( (q\\equiv \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\lor (q\\lor p)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( (\\lnot q\\land \\lnot p) \\)"
    "\\( \\lnot (p\\lor (q\\lor p)) \\)"
    "\\( \\lnot (p\\lor (q\\land q)) \\)"
    "\\( (\\lnot q\\equiv (p\\land q)) \\)"
    "\\( ((p\\land q)\\equiv \\lnot q) \\)"
    "\\( (q\\land (\\lnot q\\equiv p)) \\)"
    "\\( ((p\\equiv \\lnot q)\\land q) \\)"
    "\\( (q\\land \\lnot (q\\equiv p)) \\)"
    "\\( (\\lnot q\\equiv (q\\equiv p)) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\supset p)) \\)"
    "\\( \\lnot ((q\\supset q)\\land p) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( (\\lnot (q\\lor p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( ((q\\land p)\\equiv \\lnot p) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( \\lnot ((q\\lor q)\\land q) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( \\lnot ((q\\supset p)\\supset q) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( \\lnot (q\\lor (q\\land q)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( \\lnot ((p\\lor p)\\land q) \\)"
    "\\( (q\\equiv \\lnot (q\\supset p)) \\)"
    "\\( ((q\\supset p)\\supset \\lnot q) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( (((p\\equiv q)\\equiv p)\\land p) \\)"
    "\\( (p\\land ((p\\land p)\\equiv q)) \\)"
    "\\( (q\\land ((q\\equiv p)\\land p)) \\)"
    "\\( ((q\\lor (q\\lor q))\\land p) \\)"
    "\\( (((q\\land p)\\land q)\\land p) \\)"
    "\\( (q\\equiv (q\\equiv (p\\equiv q))) \\)"
    "\\( ((p\\lor q)\\equiv (p\\land q)) \\)"
    "\\( (((p\\land q)\\lor p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\land (q\\supset q))) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\equiv p)) \\)"
    "\\( ((p\\supset (q\\lor q))\\land q) \\)"
    "\\( (((p\\lor p)\\supset p)\\equiv q) \\)"
    "\\( (((q\\equiv q)\\land q)\\land q) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\lor p)) \\)"
    "\\( ((q\\land (q\\supset q))\\land q) \\)"
    "\\( (((p\\supset q)\\supset p)\\supset q) \\)"
    "\\( (p\\supset (q\\land (q\\equiv p))) \\)"
    "\\( (\\lnot q\\supset (p\\supset q)) \\)"
    "\\( \\lnot (\\lnot q\\land p) \\)"
    "\\( (q\\lor \\lnot p) \\)"
    "\\( ((p\\lor (p\\equiv q))\\land p) \\)"
    "\\( ((p\\land (p\\supset p))\\land p) \\)"
    "\\( (((q\\equiv q)\\lor p)\\land p) \\)"
    "\\( (p\\land ((p\\land p)\\equiv p)) \\)"
    "\\( (((p\\lor p)\\land p)\\land p) \\)"
    "\\( (q\\supset (\\lnot p\\supset p)) \\)"
    "\\( (((q\\lor p)\\equiv p)\\lor p) \\)"
    "\\( ((q\\land p)\\equiv (q\\land q)) \\)"
    "\\( ((p\\equiv q)\\lor (p\\lor p)) \\)"
    "\\( (q\\supset ((p\\land p)\\equiv q)) \\)"
    "\\( ((q\\equiv (p\\land p))\\supset p) \\)"
    "\\( ((q\\lor p)\\lor (p\\land p)) \\)"
    "\\( ((q\\equiv p)\\supset (q\\lor p)) \\)"
    "\\( (p\\lor ((p\\lor q)\\lor p)) \\)"
    "\\( (q\\lor (p\\equiv \\lnot q)) \\)"
    "\\( (q\\lor (q\\equiv (q\\land q))) \\)"
    "\\( ((q\\land (p\\land p))\\supset p) \\)"
    "\\( (q\\lor ((p\\land q)\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\equiv p)) \\)"
    "\\( (q\\supset ((q\\lor p)\\land q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(\\lnot p\\land (p\\equiv p))\\), \\(((q\\equiv p)\\equiv (q\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\equiv q)\\land \\lnot p) \\)"
    "\\( \\lnot ((p\\equiv q)\\supset q) \\)"
    "\\( ((q\\land \\lnot p)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( (\\lnot q\\land (p\\equiv q)) \\)"
    "\\( (\\lnot (p\\equiv p)\\equiv p) \\)"
    "\\( (\\lnot p\\land (q\\equiv q)) \\)"
    "\\( \\lnot (p\\land (p\\supset p)) \\)"
    "\\( (p\\supset (\\lnot q\\land q)) \\)"
    "\\( ((q\\equiv q)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset p)\\land \\lnot q) \\)"
    "\\( (p\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (q\\supset q)) \\)"
    "\\( (q\\supset \\lnot (q\\lor q)) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((p\\lor p)\\land q) \\)"
    "\\( \\lnot ((q\\land q)\\land p) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( \\lnot (q\\land (p\\land p)) \\)"
    "\\( (q\\equiv (p\\land (q\\lor p))) \\)"
    "\\( ((p\\equiv q)\\equiv (q\\supset q)) \\)"
    "\\( (q\\equiv p) \\)"
    "\\( ((p\\equiv p)\\land (q\\equiv p)) \\)"
    "\\( ((p\\land p)\\equiv (q\\lor q)) \\)"
    "\\( (q\\lor (q\\equiv (q\\lor p))) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\supset q)) \\)"
    "\\( (q\\equiv (q\\lor p)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\lor q)) \\)"
    "\\( (((p\\equiv q)\\lor q)\\lor q) \\)"
    "\\( (p\\lor ((q\\lor q)\\supset p)) \\)"
    "\\( (q\\equiv ((p\\supset q)\\land p)) \\)"
    "\\( ((p\\equiv q)\\lor (p\\lor p)) \\)"
    "\\( (((q\\land q)\\lor q)\\supset p) \\)"
    "\\( ((q\\supset q)\\equiv (q\\supset p)) \\)"
    "\\( ((p\\land (q\\supset p))\\supset p) \\)"
    "\\( (((p\\lor p)\\equiv p)\\lor p) \\)"
    "\\( ((p\\lor q)\\lor (p\\equiv q)) \\)"
    "\\( (\\lnot (q\\supset q)\\supset p) \\)"
    "\\( (q\\equiv ((q\\supset q)\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( (q\\land \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((p\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((q\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (p\\land ((p\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (((q\\lor q)\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (((p\\supset p)\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((q\\land p)\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( \\lnot ((q\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((q\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((p\\land p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((p\\land q)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (q\\lor ((q\\lor q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (p\\land ((p\\supset p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (q\\lor ((q\\equiv q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( \\lnot (q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot (q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (q\\land ((q\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (q\\land ((q\\equiv q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((q\\supset q)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (p\\equiv ((q\\land p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( \\lnot ((q\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((p\\equiv q)\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (q\\land (\\lnot q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( ((p\\land p)\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
            ["\\( (p\\lor (p\\equiv (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1001 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\supset (q\\equiv \\lnot q))\\), \\((((p\\supset q)\\land q)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( ((p\\lor q)\\land \\lnot p) \\)"
    "\\( ((p\\land q)\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (q\\equiv \\lnot (q\\land p)) \\)"
    "\\( ((\\lnot p\\equiv q)\\equiv q) \\)"
    "\\( (p\\supset (q\\equiv \\lnot q)) \\)"
    "\\( ((q\\equiv p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\land p) \\)"
    "\\( \\lnot (p\\equiv (p\\equiv p)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( (p\\supset \\lnot (p\\land q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\land q) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot p) \\)"
    "\\( (q\\land (q\\land (p\\supset q))) \\)"
    "\\( (((p\\equiv q)\\land p)\\lor q) \\)"
    "\\( (((p\\lor q)\\land q)\\lor q) \\)"
    "\\( (q\\equiv ((q\\lor q)\\equiv q)) \\)"
    "\\( (\\lnot q\\supset q) \\)"
    "\\( (q\\lor ((p\\lor p)\\supset q)) \\)"
    "\\( (\\lnot p\\lor (q\\land p)) \\)"
    "\\( ((q\\lor (p\\lor q))\\equiv q) \\)"
    "\\( ((p\\equiv (q\\supset q))\\supset q) \\)"
    "\\( (p\\supset (q\\land (q\\supset p))) \\)"
    "\\( (((q\\equiv p)\\supset p)\\lor p) \\)"
    "\\( (((p\\lor q)\\lor p)\\lor q) \\)"
    "\\( (q\\lor ((p\\equiv q)\\supset q)) \\)"
    "\\( (((p\\supset q)\\lor q)\\equiv q) \\)"
    "\\( ((p\\supset (q\\land q))\\equiv q) \\)"
    "\\( ((p\\equiv p)\\lor (p\\land p)) \\)"
    "\\( ((p\\land p)\\equiv p) \\)"
    "\\( ((p\\supset (q\\supset q))\\lor q) \\)"
    "\\( ((q\\supset p)\\lor (p\\lor q)) \\)"
    "\\( ((p\\supset p)\\land (p\\supset p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((q\\land q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( \\lnot ((p\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\land (p\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\equiv (\\lnot p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (p\\lor ((p\\lor p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\equiv ((q\\supset p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot (p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( \\lnot ((p\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((\\lnot p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (((p\\lor q)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((q\\lor (q\\land q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((p\\lor p)\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((p\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot q\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot q\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (p\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (\\lnot q\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\equiv ((q\\lor p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\equiv ((p\\supset p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (p\\lor \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((q\\lor (p\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((q\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (q\\equiv \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( \\lnot ((p\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( \\lnot ((p\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((q\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( ((p\\equiv q)\\lor (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (p\\land (p\\lor \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
            ["\\( (p\\equiv ((p\\lor p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\supset p)\\land p)\\), \\(((q\\lor q)\\equiv (p\\lor q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\supset q)\\supset p) \\)"
    "\\( (p\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (q\\supset q)) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (q\\supset \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( \\lnot (q\\land (p\\equiv q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\land q) \\)"
    "\\( ((p\\land p)\\supset (q\\land q)) \\)"
    "\\( (q\\lor ((q\\lor p)\\equiv q)) \\)"
    "\\( (p\\supset (q\\land p)) \\)"
    "\\( (((q\\lor p)\\lor q)\\equiv q) \\)"
    "\\( (p\\supset (p\\supset (q\\land q))) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\supset p) \\)"
    "\\( (q\\supset ((q\\lor p)\\lor p)) \\)"
    "\\( (\\lnot \\lnot q\\equiv q) \\)"
    "\\( ((p\\equiv p)\\land (q\\supset q)) \\)"
    "\\( (\\lnot (p\\supset q)\\supset p) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot ((q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot q\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\supset q)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((q\\lor p)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((q\\land q)\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\supset q)\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((q\\lor q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\equiv (p\\supset p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\supset \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\supset \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\equiv ((p\\land q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\supset p)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\land (p\\land q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\equiv ((q\\land q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\supset (p\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\lor ((p\\lor q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\land (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot (p\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot ((p\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\supset (p\\supset q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\equiv (q\\equiv (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((q\\supset q)\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\equiv (p\\lor p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\lor p)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((p\\equiv (p\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\land \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\land (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\equiv (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\equiv p)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((p\\supset p)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( ((q\\land (p\\land q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (((q\\equiv q)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
            ["\\( (p\\equiv (q\\supset (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\supset \\lnot (q\\lor p))\\), \\((p\\lor (\\lnot q\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot q\\land q)\\land q) \\)"
    "\\( (\\lnot (q\\land q)\\land q) \\)"
    "\\( (q\\land (q\\land \\lnot q)) \\)"
    "\\( ((p\\land q)\\land \\lnot p) \\)"
    "\\( (p\\land (\\lnot q\\equiv q)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset p) \\)"
    "\\( (q\\land \\lnot (p\\lor p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( ((q\\land p)\\equiv \\lnot q) \\)"
    "\\( (q\\land (p\\equiv \\lnot q)) \\)"
    "\\( (\\lnot (p\\land q)\\land q) \\)"
    "\\( (\\lnot (p\\equiv p)\\equiv p) \\)"
    "\\( \\lnot (p\\lor (p\\land p)) \\)"
    "\\( \\lnot (p\\land (p\\supset p)) \\)"
    "\\( \\lnot ((p\\lor p)\\lor p) \\)"
    "\\( ((q\\supset q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (p\\supset (p\\supset q)) \\)"
    "\\( (\\lnot (q\\lor p)\\equiv q) \\)"
    "\\( (\\lnot (p\\land q)\\equiv p) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor q) \\)"
    "\\( (\\lnot q\\land (p\\lor p)) \\)"
    "\\( \\lnot (q\\land (q\\land q)) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((p\\equiv p)\\land \\lnot q) \\)"
    "\\( \\lnot (q\\lor (p\\land q)) \\)"
    "\\( \\lnot ((q\\supset p)\\supset q) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( \\lnot (p\\land (p\\equiv q)) \\)"
    "\\( (p\\supset (p\\land \\lnot q)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv p)) \\)"
    "\\( \\lnot (q\\equiv (q\\supset p)) \\)"
    "\\( ((q\\land p)\\supset \\lnot q) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv q)) \\)"
    "\\( ((p\\equiv (p\\equiv q))\\land p) \\)"
    "\\( (q\\land (p\\land (p\\equiv p))) \\)"
    "\\( (((p\\land q)\\land p)\\land q) \\)"
    "\\( ((q\\land p)\\equiv (p\\equiv p)) \\)"
    "\\( (((p\\land q)\\lor p)\\equiv q) \\)"
    "\\( ((p\\lor q)\\supset (p\\equiv q)) \\)"
    "\\( ((q\\land q)\\equiv (p\\lor p)) \\)"
    "\\( ((q\\lor (q\\lor q))\\equiv p) \\)"
    "\\( (p\\equiv (q\\equiv (p\\supset p))) \\)"
    "\\( (q\\equiv (q\\lor (q\\equiv q))) \\)"
    "\\( (((q\\supset p)\\equiv p)\\land q) \\)"
    "\\( (((p\\land q)\\equiv q)\\supset q) \\)"
    "\\( (q\\land ((q\\land p)\\supset q)) \\)"
    "\\( (((q\\lor p)\\land q)\\lor q) \\)"
    "\\( (((p\\lor p)\\land q)\\equiv p) \\)"
    "\\( (q\\lor ((p\\lor q)\\supset q)) \\)"
    "\\( ((p\\equiv (q\\land p))\\lor q) \\)"
    "\\( (q\\lor \\lnot (p\\lor p)) \\)"
    "\\( ((p\\lor (p\\land p))\\supset q) \\)"
    "\\( (p\\lor ((q\\supset p)\\equiv q)) \\)"
    "\\( (p\\equiv (p\\supset (q\\lor p))) \\)"
    "\\( (p\\land (p\\lor (q\\equiv q))) \\)"
    "\\( ((q\\supset q)\\supset p) \\)"
    "\\( ((\\lnot p\\lor p)\\equiv p) \\)"
    "\\( (q\\supset (q\\land (p\\equiv q))) \\)"
    "\\( ((q\\land q)\\supset (q\\supset p)) \\)"
    "\\( (q\\supset (q\\land (p\\equiv q))) \\)"
    "\\( (q\\supset ((q\\land q)\\supset p)) \\)"
    "\\( (q\\supset ((q\\land p)\\equiv q)) \\)"
    "\\( (((q\\lor q)\\lor p)\\lor q) \\)"
    "\\( (((p\\lor p)\\equiv q)\\supset p) \\)"
    "\\( ((p\\supset (q\\land q))\\supset q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\equiv q) \\)"
    "\\( ((\\lnot q\\equiv p)\\lor q) \\)"
    "\\( ((q\\land p)\\supset (q\\equiv p)) \\)"
    "\\( ((q\\land q)\\lor (q\\supset q)) \\)"
    "\\( ((q\\equiv q)\\land (q\\supset q)) \\)"
    "\\( ((q\\supset q)\\lor (q\\supset q)) \\)"
    "\\( ((p\\land (q\\equiv q))\\equiv p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\lor p)\\), \\(((\\lnot q\\lor p)\\lor p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\lor (q\\lor q)) \\)"
    "\\( (\\lnot p\\land (p\\equiv q)) \\)"
    "\\( \\lnot (q\\lor (p\\lor p)) \\)"
    "\\( \\lnot (q\\equiv (p\\supset q)) \\)"
    "\\( (\\lnot q\\land (p\\supset q)) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv p) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset p) \\)"
    "\\( (p\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( \\lnot (p\\land (p\\supset p)) \\)"
    "\\( ((p\\supset p)\\land \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (p\\equiv p)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset p)) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot q) \\)"
    "\\( (\\lnot q\\land (p\\supset p)) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( ((\\lnot q\\land p)\\equiv p) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (p\\equiv (q\\land (p\\lor q))) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\equiv p)) \\)"
    "\\( ((q\\equiv p)\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\land q)) \\)"
    "\\( ((p\\land (q\\lor p))\\equiv q) \\)"
    "\\( (q\\lor ((q\\equiv p)\\lor q)) \\)"
    "\\( (p\\equiv ((q\\lor q)\\land p)) \\)"
    "\\( (p\\supset ((q\\land q)\\lor q)) \\)"
    "\\( (((q\\land p)\\land p)\\equiv p) \\)"
    "\\( ((q\\equiv (p\\supset q))\\equiv q) \\)"
    "\\( ((p\\land (q\\land q))\\equiv q) \\)"
    "\\( (q\\equiv (p\\land (q\\land p))) \\)"
    "\\( ((p\\supset p)\\supset (q\\supset p)) \\)"
    "\\( (((q\\equiv p)\\land q)\\equiv q) \\)"
    "\\( ((p\\equiv p)\\land (q\\supset p)) \\)"
    "\\( (((p\\land p)\\land p)\\supset p) \\)"
    "\\( (((q\\equiv q)\\equiv p)\\supset p) \\)"
    "\\( (q\\supset ((p\\supset p)\\lor q)) \\)"
    "\\( (\\lnot q\\lor (q\\supset q)) \\)"
    "\\( ((p\\supset q)\\supset (q\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( (p\\land (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((q\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\supset (p\\supset p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\supset (p\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\equiv (q\\equiv q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (\\lnot (p\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\land q)\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (q\\lor (q\\land (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\lor ((q\\land p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (q\\lor (p\\equiv (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (\\lnot p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\land (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\land (p\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((q\\equiv (p\\supset q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (((q\\supset q)\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\lor ((p\\supset q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( \\lnot ((q\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( \\lnot (p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((q\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\land q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( ((p\\equiv p)\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (((q\\supset q)\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
            ["\\( (((q\\land p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\supset q)\\equiv p)\\), \\(((q\\supset p)\\equiv (p\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (p\\land p)\\land q) \\)"
    "\\( (\\lnot (q\\land p)\\equiv q) \\)"
    "\\( (\\lnot (p\\land q)\\land q) \\)"
    "\\( (\\lnot q\\equiv (q\\land p)) \\)"
    "\\( \\lnot ((p\\lor q)\\equiv p) \\)"
    "\\( ((q\\equiv \\lnot p)\\equiv q) \\)"
    "\\( ((q\\lor p)\\supset \\lnot p) \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( ((q\\equiv q)\\land \\lnot p) \\)"
    "\\( ((\\lnot q\\equiv q)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( \\lnot ((q\\land p)\\land p) \\)"
    "\\( (\\lnot q\\lor \\lnot p) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( ((q\\supset (q\\lor p))\\supset q) \\)"
    "\\( (((q\\equiv q)\\lor p)\\supset q) \\)"
    "\\( (((p\\supset p)\\lor p)\\land q) \\)"
    "\\( (q\\land (\\lnot p\\supset q)) \\)"
    "\\( ((q\\supset q)\\equiv (q\\lor q)) \\)"
    "\\( (q\\lor ((p\\land p)\\equiv q)) \\)"
    "\\( ((q\\equiv p)\\lor q) \\)"
    "\\( (q\\lor \\lnot (q\\lor p)) \\)"
    "\\( ((q\\equiv q)\\land (p\\supset q)) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\land p)) \\)"
    "\\( ((q\\lor (p\\land p))\\lor p) \\)"
    "\\( ((p\\lor (q\\supset p))\\supset p) \\)"
    "\\( (q\\lor ((p\\supset p)\\equiv p)) \\)"
    "\\( (q\\equiv ((p\\lor q)\\equiv q)) \\)"
    "\\( (((q\\supset q)\\supset p)\\lor q) \\)"
    "\\( ((p\\lor q)\\supset (q\\equiv q)) \\)"
    "\\( (q\\supset (q\\lor \\lnot p)) \\)"
    "\\( ((p\\equiv p)\\land (p\\equiv p)) \\)"
    "\\( (q\\equiv (q\\land (q\\lor p))) \\)"
    "\\( ((p\\equiv \\lnot p)\\supset p) \\)"
  ]
  :wrong [
            ["\\( ((\\lnot p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (\\lnot p\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot (p\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot (q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (q\\land (q\\land (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\equiv ((p\\equiv p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((p\\lor (p\\equiv p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot ((q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\land \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot (\\lnot q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\land (q\\land (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((q\\lor p)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((q\\equiv q)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((p\\lor (q\\lor p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((p\\land \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (\\lnot p\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot (q\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (((p\\land q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((p\\equiv p)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\lor (q\\equiv (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (q\\equiv ((q\\equiv p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( \\lnot (p\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (\\lnot p\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\land (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((\\lnot p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((q\\equiv p)\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( ((q\\lor (q\\land p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (p\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
            ["\\( (((q\\lor q)\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\equiv (q\\supset q))\\), \\((p\\equiv ((p\\supset q)\\supset p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\supset (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot \\lnot \\lnot p \\)"
    "\\( (\\lnot p\\lor \\lnot p) \\)"
    "\\( (p\\supset (p\\supset \\lnot p)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( \\lnot (p\\land (p\\equiv q)) \\)"
    "\\( \\lnot ((q\\supset p)\\land q) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( ((p\\equiv (q\\lor q))\\lor q) \\)"
    "\\( (p\\supset (q\\land (p\\equiv q))) \\)"
    "\\( (p\\supset (q\\land (q\\lor q))) \\)"
    "\\( ((\\lnot q\\supset p)\\supset q) \\)"
    "\\( ((q\\lor (p\\lor q))\\equiv q) \\)"
    "\\( (\\lnot (q\\supset p)\\supset q) \\)"
    "\\( (p\\lor (p\\lor (p\\equiv p))) \\)"
    "\\( (p\\equiv ((q\\supset q)\\land p)) \\)"
    "\\( (p\\supset (p\\supset p)) \\)"
    "\\( ((p\\supset (q\\lor p))\\lor p) \\)"
  ]
  :wrong [
            ["\\( (p\\land (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (\\lnot p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\land (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (\\lnot q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\supset (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\land ((p\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\equiv ((p\\equiv p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\land (p\\lor (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (((p\\land p)\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\supset (p\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( \\lnot ((q\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\supset q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( \\lnot (q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\lor q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv (p\\equiv (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv (p\\land (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\lor p)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\equiv ((p\\land p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((q\\supset p)\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\lor (q\\lor p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\land (q\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\equiv (q\\lor (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv (q\\lor (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((q\\supset p)\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\supset ((q\\equiv q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\lor (q\\equiv (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( \\lnot (q\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\lor q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\land \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((p\\land (p\\lor p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((q\\equiv p)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\lor ((q\\equiv p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (p\\land (q\\lor (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( (q\\supset (p\\lor \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
            ["\\( ((q\\lor p)\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1100 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\land p)\\land p)\\), \\((\\lnot (p\\supset p)\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor (p\\equiv q)) \\)"
    "\\( ((p\\supset \\lnot q)\\land p) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( ((\\lnot q\\land p)\\land p) \\)"
    "\\( \\lnot (p\\supset (q\\lor q)) \\)"
    "\\( \\lnot (q\\equiv (p\\supset p)) \\)"
    "\\( (q\\supset \\lnot (q\\lor p)) \\)"
    "\\( \\lnot (q\\land (p\\supset q)) \\)"
    "\\( ((p\\land \\lnot p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv p) \\)"
    "\\( (p\\supset (\\lnot q\\land p)) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (p\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\equiv q) \\)"
    "\\( (p\\lor ((p\\supset q)\\supset p)) \\)"
    "\\( (p\\land (p\\lor p)) \\)"
    "\\( (p\\equiv ((p\\lor p)\\supset p)) \\)"
    "\\( ((q\\supset (p\\lor p))\\land p) \\)"
    "\\( (q\\equiv (p\\land q)) \\)"
    "\\( (p\\equiv ((q\\lor p)\\lor q)) \\)"
    "\\( (((q\\equiv p)\\equiv p)\\supset p) \\)"
    "\\( (((q\\land q)\\lor p)\\supset p) \\)"
    "\\( (q\\supset (p\\lor \\lnot q)) \\)"
    "\\( (q\\lor (p\\equiv (q\\supset p))) \\)"
    "\\( (((p\\lor p)\\equiv q)\\supset p) \\)"
    "\\( (((q\\land p)\\equiv q)\\supset p) \\)"
    "\\( ((p\\supset p)\\supset (p\\lor q)) \\)"
    "\\( (p\\lor (q\\equiv (q\\equiv q))) \\)"
    "\\( (q\\lor (q\\supset (q\\equiv q))) \\)"
    "\\( (p\\lor ((q\\land q)\\supset q)) \\)"
    "\\( ((p\\lor (q\\supset p))\\lor q) \\)"
    "\\( ((q\\equiv (p\\lor q))\\lor p) \\)"
    "\\( (((q\\land p)\\lor p)\\equiv p) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot ((q\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (p\\supset \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (((q\\equiv q)\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\land (q\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((q\\land p)\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((\\lnot q\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\land \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (\\lnot p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((\\lnot p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (p\\land (q\\equiv (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\equiv (p\\land (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\land (q\\lor (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (\\lnot q\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (p\\land \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot ((q\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\equiv p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((q\\supset (p\\equiv q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\equiv ((p\\lor p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\land p)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\land (q\\supset p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\lor p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( \\lnot ((p\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\equiv (p\\supset q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\land q)\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( (q\\land ((p\\equiv q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
            ["\\( ((p\\supset q)\\lor (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1010 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\lor q)\\supset q)\\), \\((q\\equiv \\lnot p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( (\\lnot (q\\land q)\\land p) \\)"
    "\\( (\\lnot q\\equiv (p\\lor q)) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\equiv (p\\equiv q)) \\)"
    "\\( \\lnot (q\\land (q\\supset q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset q) \\)"
    "\\( \\lnot ((q\\lor q)\\lor q) \\)"
    "\\( (\\lnot q\\lor \\lnot q) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset q)\\supset \\lnot p) \\)"
    "\\( (p\\supset (q\\equiv \\lnot p)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( ((q\\supset (q\\equiv p))\\land p) \\)"
    "\\( ((p\\equiv (p\\equiv p))\\lor p) \\)"
    "\\( ((p\\supset (p\\lor p))\\supset p) \\)"
    "\\( (p\\land (p\\land (p\\lor p))) \\)"
    "\\( (p\\equiv (p\\equiv (p\\land p))) \\)"
    "\\( (((q\\land p)\\land p)\\equiv q) \\)"
    "\\( ((q\\land q)\\supset (q\\equiv p)) \\)"
    "\\( (p\\lor (p\\lor \\lnot q)) \\)"
    "\\( ((p\\land (p\\equiv q))\\equiv q) \\)"
    "\\( ((q\\supset p)\\lor \\lnot q) \\)"
    "\\( ((\\lnot p\\supset p)\\lor q) \\)"
    "\\( ((p\\lor q)\\lor q) \\)"
    "\\( (p\\equiv (q\\supset (p\\land q))) \\)"
    "\\( (((p\\lor p)\\lor p)\\lor q) \\)"
    "\\( (p\\lor ((q\\supset p)\\supset p)) \\)"
    "\\( ((q\\supset q)\\lor (q\\lor p)) \\)"
    "\\( (p\\lor (\\lnot p\\lor q)) \\)"
    "\\( ((q\\land q)\\lor (q\\supset p)) \\)"
    "\\( ((q\\equiv (q\\supset q))\\equiv q) \\)"
    "\\( (((q\\equiv q)\\supset q)\\equiv q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (\\lnot (q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (((p\\land q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((p\\equiv p)\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((p\\supset p)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((q\\supset q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (\\lnot (q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot (p\\lor (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\equiv (q\\supset (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\equiv (q\\equiv (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (((q\\land p)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((p\\land p)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot ((p\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((q\\supset p)\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((p\\lor q)\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((q\\lor q)\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (((p\\supset q)\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot ((p\\land p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( ((p\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (p\\equiv \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot (p\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (p\\land ((q\\land q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( \\lnot (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (q\\equiv ((q\\supset q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
            ["\\( (p\\supset (p\\land (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0110 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\equiv p)\\land p)\\), \\((\\lnot q\\lor \\lnot p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( (\\lnot q\\land p) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
    "\\( (\\lnot (p\\land q)\\land p) \\)"
    "\\( ((p\\land q)\\equiv \\lnot p) \\)"
    "\\( (p\\equiv \\lnot (p\\equiv q)) \\)"
    "\\( (\\lnot q\\equiv (p\\equiv p)) \\)"
    "\\( (q\\supset (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot (q\\equiv (q\\equiv q)) \\)"
    "\\( (q\\equiv (\\lnot p\\equiv p)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( ((p\\land \\lnot q)\\equiv p) \\)"
    "\\( (q\\supset (q\\equiv \\lnot p)) \\)"
    "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
    "\\( (((q\\supset q)\\equiv p)\\lor p) \\)"
    "\\( ((p\\land p)\\lor (p\\land q)) \\)"
    "\\( (p\\equiv (\\lnot q\\lor q)) \\)"
    "\\( ((p\\land q)\\lor (p\\lor p)) \\)"
    "\\( ((q\\land p)\\lor (p\\lor p)) \\)"
    "\\( (q\\supset ((q\\equiv p)\\equiv q)) \\)"
    "\\( (((q\\land q)\\land q)\\supset p) \\)"
    "\\( \\lnot \\lnot (q\\supset p) \\)"
    "\\( (q\\supset (q\\supset (p\\lor p))) \\)"
    "\\( ((q\\supset p)\\lor (p\\land q)) \\)"
    "\\( (p\\lor ((p\\land p)\\lor q)) \\)"
    "\\( (((p\\lor q)\\supset p)\\supset p) \\)"
    "\\( (q\\equiv ((p\\supset q)\\lor q)) \\)"
    "\\( (q\\lor (p\\land (p\\supset p))) \\)"
    "\\( ((q\\supset (p\\lor p))\\equiv p) \\)"
    "\\( ((q\\equiv q)\\lor (q\\land p)) \\)"
    "\\( (p\\lor (p\\supset (p\\land p))) \\)"
    "\\( (p\\equiv (p\\lor p)) \\)"
    "\\( (q\\lor (q\\supset p)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\lor p)) \\)"
  ]
  :wrong [
            ["\\( (q\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot (p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\land ((p\\land p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((q\\lor p)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((q\\equiv p)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((q\\equiv p)\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((q\\supset \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (\\lnot q\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\land (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\supset \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\land ((p\\lor p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\equiv (p\\equiv (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\supset ((q\\equiv p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((p\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot ((q\\supset p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot ((p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\land (q\\equiv (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((p\\equiv q)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\lor ((q\\supset q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\supset ((q\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( ((\\lnot p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (p\\supset \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (((p\\equiv p)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\equiv (p\\land (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\land (q\\land (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
            ["\\( (q\\lor (q\\lor (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv \\lnot (p\\land q))\\), \\((((q\\supset q)\\land q)\\land p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot (q\\equiv q)\\land p) \\)"
    "\\( (p\\land (\\lnot p\\land q)) \\)"
    "\\( \\lnot (q\\supset (p\\lor q)) \\)"
    "\\( (\\lnot (q\\equiv q)\\land p) \\)"
    "\\( (\\lnot (p\\land p)\\land p) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( ((\\lnot q\\land p)\\equiv q) \\)"
    "\\( \\lnot ((q\\lor q)\\lor p) \\)"
    "\\( ((q\\equiv p)\\land \\lnot p) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv q) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( \\lnot (q\\supset (p\\land p)) \\)"
    "\\( ((q\\land p)\\equiv \\lnot q) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (q\\land p)\\land q) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( ((q\\equiv \\lnot p)\\equiv q) \\)"
    "\\( \\lnot ((q\\land p)\\lor p) \\)"
    "\\( (p\\supset (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot (p\\land (q\\supset q)) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\supset q) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor q) \\)"
    "\\( ((p\\land \\lnot q)\\land p) \\)"
    "\\( \\lnot (p\\supset (q\\land p)) \\)"
    "\\( ((q\\land q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset q) \\)"
    "\\( (\\lnot (p\\equiv q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\equiv \\lnot p) \\)"
    "\\( (q\\supset (\\lnot q\\land p)) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( ((q\\supset p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\land (q\\land q)) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\supset q)\\equiv p) \\)"
    "\\( ((q\\land p)\\land (p\\equiv p)) \\)"
    "\\( ((p\\land q)\\equiv (p\\equiv p)) \\)"
    "\\( ((q\\supset q)\\supset (p\\land q)) \\)"
    "\\( (((q\\lor p)\\equiv q)\\equiv p) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv q)) \\)"
    "\\( (q\\equiv (p\\land (q\\supset p))) \\)"
    "\\( ((q\\land (p\\equiv p))\\equiv p) \\)"
    "\\( (((p\\equiv q)\\equiv p)\\equiv p) \\)"
    "\\( ((q\\lor q)\\equiv (p\\land p)) \\)"
    "\\( (((q\\lor q)\\lor q)\\equiv p) \\)"
    "\\( (q\\lor (p\\land (p\\land q))) \\)"
    "\\( ((p\\equiv (q\\land q))\\equiv p) \\)"
    "\\( ((q\\land \\lnot p)\\lor q) \\)"
    "\\( (((p\\land q)\\supset p)\\supset q) \\)"
    "\\( ((p\\land q)\\lor q) \\)"
    "\\( (q\\lor ((q\\lor p)\\supset q)) \\)"
    "\\( (q\\lor ((p\\lor p)\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\lor (p\\supset q)) \\)"
    "\\( (p\\supset ((p\\land q)\\land p)) \\)"
    "\\( (((p\\lor p)\\supset q)\\lor q) \\)"
    "\\( (p\\land ((q\\land q)\\lor p)) \\)"
    "\\( (p\\equiv ((p\\lor p)\\equiv p)) \\)"
    "\\( (((q\\lor p)\\lor p)\\land p) \\)"
    "\\( (((q\\supset p)\\land q)\\lor p) \\)"
    "\\( (p\\lor (q\\land (q\\land p))) \\)"
    "\\( (p\\lor (q\\supset \\lnot q)) \\)"
    "\\( ((q\\land q)\\supset (p\\lor p)) \\)"
    "\\( ((p\\lor q)\\equiv (p\\land p)) \\)"
    "\\( ((q\\supset (p\\equiv q))\\lor p) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\supset p) \\)"
    "\\( (((q\\lor p)\\supset q)\\equiv q) \\)"
    "\\( (q\\lor ((p\\land p)\\lor p)) \\)"
    "\\( (q\\equiv ((q\\lor p)\\equiv q)) \\)"
    "\\( (q\\lor (\\lnot p\\supset p)) \\)"
    "\\( ((\\lnot p\\lor q)\\equiv q) \\)"
    "\\( (q\\supset (q\\lor q)) \\)"
    "\\( ((p\\lor \\lnot p)\\lor p) \\)"
    "\\( ((q\\land (p\\supset q))\\supset q) \\)"
    "\\( (((q\\supset q)\\lor p)\\lor p) \\)"
    "\\( ((q\\supset q)\\lor \\lnot p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\supset (q\\equiv p))\\), \\((((p\\supset q)\\land q)\\equiv p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\supset \\lnot q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor \\lnot q) \\)"
    "\\( ((p\\land q)\\land \\lnot p) \\)"
    "\\( \\lnot (p\\supset (p\\equiv p)) \\)"
    "\\( \\lnot (q\\supset (p\\lor q)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\lor (q\\land q)) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( ((q\\land \\lnot p)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor q)\\lor p) \\)"
    "\\( \\lnot (p\\lor (q\\supset p)) \\)"
    "\\( \\lnot (q\\equiv (q\\land p)) \\)"
    "\\( (p\\equiv \\lnot (p\\lor q)) \\)"
    "\\( (q\\land (p\\supset \\lnot p)) \\)"
    "\\( ((\\lnot q\\equiv p)\\land q) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset p) \\)"
    "\\( (p\\supset (\\lnot p\\land q)) \\)"
    "\\( (p\\supset \\lnot (p\\lor p)) \\)"
    "\\( ((q\\land \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv p) \\)"
    "\\( ((\\lnot q\\land p)\\land p) \\)"
    "\\( \\lnot (p\\supset (p\\supset q)) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv (q\\lor p)) \\)"
    "\\( (\\lnot q\\land p) \\)"
    "\\( ((q\\supset q)\\equiv \\lnot q) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\equiv \\lnot p)) \\)"
    "\\( ((q\\lor p)\\supset \\lnot q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( (q\\supset \\lnot (p\\lor p)) \\)"
    "\\( (q\\supset (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( ((q\\land (q\\equiv q))\\land p) \\)"
    "\\( ((q\\supset p)\\equiv q) \\)"
    "\\( ((p\\lor q)\\land (q\\equiv p)) \\)"
    "\\( ((p\\lor p)\\land (q\\equiv p)) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\land p) \\)"
    "\\( ((q\\land (q\\equiv q))\\equiv p) \\)"
    "\\( ((p\\equiv q)\\land (q\\supset q)) \\)"
    "\\( (q\\equiv (p\\lor (p\\land q))) \\)"
    "\\( (p\\equiv ((q\\land q)\\land q)) \\)"
    "\\( ((q\\equiv p)\\lor (q\\land p)) \\)"
    "\\( ((q\\land \\lnot p)\\lor q) \\)"
    "\\( (q\\equiv (q\\lor (q\\supset p))) \\)"
    "\\( (q\\land (p\\equiv (p\\land p))) \\)"
    "\\( (q\\equiv (q\\supset (q\\land q))) \\)"
    "\\( (((p\\equiv p)\\land q)\\land q) \\)"
    "\\( ((p\\equiv (q\\equiv q))\\supset q) \\)"
    "\\( (\\lnot q\\supset (q\\equiv p)) \\)"
    "\\( (p\\supset ((q\\equiv p)\\equiv p)) \\)"
    "\\( (q\\lor (q\\lor (q\\equiv p))) \\)"
    "\\( (((q\\land q)\\equiv p)\\lor q) \\)"
    "\\( (((q\\supset p)\\land p)\\lor p) \\)"
    "\\( (p\\lor ((p\\equiv p)\\equiv p)) \\)"
    "\\( (p\\equiv (q\\supset q)) \\)"
    "\\( (p\\land ((q\\lor p)\\equiv p)) \\)"
    "\\( ((p\\lor p)\\land (p\\lor q)) \\)"
    "\\( (q\\supset ((q\\land p)\\equiv q)) \\)"
    "\\( \\lnot (\\lnot p\\land q) \\)"
    "\\( ((q\\supset q)\\supset (q\\supset p)) \\)"
    "\\( ((\\lnot q\\supset p)\\equiv p) \\)"
    "\\( (((p\\supset q)\\equiv q)\\equiv p) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\lor p)) \\)"
    "\\( ((p\\lor q)\\equiv (q\\equiv q)) \\)"
    "\\( (p\\lor (q\\land (p\\lor q))) \\)"
    "\\( (p\\lor \\lnot (p\\equiv q)) \\)"
    "\\( (\\lnot (p\\lor q)\\supset p) \\)"
    "\\( (q\\supset ((q\\land q)\\supset q)) \\)"
    "\\( (((p\\lor p)\\land q)\\supset p) \\)"
    "\\( (((p\\supset q)\\lor q)\\lor p) \\)"
    "\\( ((p\\lor (q\\equiv q))\\lor p) \\)"
    "\\( (p\\lor ((p\\equiv p)\\lor q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\lor \\lnot p)\\), \\((((q\\land q)\\lor q)\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\supset q) \\)"
    "\\( \\lnot (q\\supset (p\\supset q)) \\)"
    "\\( (\\lnot p\\land (p\\land p)) \\)"
    "\\( \\lnot (p\\lor (p\\supset q)) \\)"
    "\\( ((q\\land p)\\land \\lnot q) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor p) \\)"
    "\\( \\lnot (q\\equiv (p\\supset q)) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (q\\land (p\\supset \\lnot q)) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (p\\lor q)\\equiv p) \\)"
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( (p\\supset (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot ((p\\land p)\\land p) \\)"
    "\\( (q\\equiv \\lnot (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\lor p)\\land p) \\)"
    "\\( ((\\lnot p\\land p)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (p\\supset q)) \\)"
    "\\( \\lnot (p\\supset (p\\equiv q)) \\)"
    "\\( (\\lnot q\\land (p\\lor q)) \\)"
    "\\( \\lnot (p\\supset (q\\land q)) \\)"
    "\\( \\lnot ((p\\supset p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\land q)) \\)"
    "\\( ((q\\equiv \\lnot p)\\equiv p) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( ((q\\supset q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\land (q\\lor q)) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\land q)) \\)"
    "\\( (\\lnot q\\equiv (q\\supset p)) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( ((q\\land (p\\lor p))\\land q) \\)"
    "\\( (q\\land (p\\lor (p\\lor p))) \\)"
    "\\( (q\\land (q\\supset p)) \\)"
    "\\( (p\\land ((q\\supset p)\\supset q)) \\)"
    "\\( ((q\\land (q\\lor p))\\land p) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\supset p)) \\)"
    "\\( ((p\\lor p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\lor (p\\lor p))) \\)"
    "\\( (q\\equiv (p\\equiv (p\\supset p))) \\)"
    "\\( (((q\\equiv q)\\supset p)\\equiv q) \\)"
    "\\( (((q\\land q)\\equiv q)\\land q) \\)"
    "\\( (\\lnot \\lnot q\\land q) \\)"
    "\\( ((\\lnot p\\supset q)\\land q) \\)"
    "\\( (((q\\supset q)\\land q)\\land q) \\)"
    "\\( (q\\land (p\\supset (p\\supset p))) \\)"
    "\\( (q\\lor ((p\\land q)\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\land p)\\land q)) \\)"
    "\\( ((q\\equiv q)\\supset (p\\supset q)) \\)"
    "\\( ((p\\lor (q\\lor q))\\supset q) \\)"
    "\\( (p\\supset ((p\\equiv p)\\land q)) \\)"
    "\\( (p\\land (\\lnot q\\lor p)) \\)"
    "\\( ((p\\supset (q\\supset p))\\supset p) \\)"
    "\\( ((p\\land (p\\lor q))\\land p) \\)"
    "\\( ((p\\equiv (p\\supset q))\\lor p) \\)"
    "\\( (((q\\supset q)\\lor p)\\equiv p) \\)"
    "\\( (q\\supset (p\\lor (p\\lor p))) \\)"
    "\\( (q\\supset (q\\land (q\\supset p))) \\)"
    "\\( (p\\lor ((p\\lor q)\\supset p)) \\)"
    "\\( (\\lnot (q\\land q)\\lor p) \\)"
    "\\( ((q\\land q)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\supset q)\\supset (q\\land q)) \\)"
    "\\( (p\\lor ((p\\equiv q)\\supset p)) \\)"
    "\\( ((p\\supset (p\\equiv q))\\equiv q) \\)"
    "\\( ((q\\supset (p\\land p))\\equiv p) \\)"
    "\\( ((p\\supset q)\\supset (p\\lor q)) \\)"
    "\\( ((q\\lor (q\\lor q))\\supset q) \\)"
    "\\( (p\\supset (p\\lor (q\\lor q))) \\)"
    "\\( (q\\lor (q\\lor (q\\supset q))) \\)"
    "\\( (p\\equiv (p\\land p)) \\)"
    "\\( (((q\\supset q)\\lor q)\\lor p) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((p\\equiv \\lnot q)\\land p)\\), \\((p\\supset ((p\\supset q)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\supset (p\\lor q)) \\)"
    "\\( ((q\\land \\lnot q)\\land q) \\)"
    "\\( (\\lnot (q\\equiv q)\\land q) \\)"
    "\\( \\lnot (p\\lor (p\\equiv p)) \\)"
    "\\( \\lnot ((p\\land p)\\lor q) \\)"
    "\\( (q\\equiv (p\\land \\lnot q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\supset q) \\)"
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( ((p\\land q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\lor q)\\supset p) \\)"
    "\\( (q\\land \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (q\\lor p)) \\)"
    "\\( (\\lnot (p\\land q)\\equiv q) \\)"
    "\\( (\\lnot (p\\equiv q)\\equiv q) \\)"
    "\\( ((q\\equiv \\lnot q)\\equiv p) \\)"
    "\\( (p\\supset \\lnot (p\\lor q)) \\)"
    "\\( (p\\supset (p\\equiv \\lnot p)) \\)"
    "\\( (\\lnot p\\equiv (q\\supset q)) \\)"
    "\\( \\lnot (p\\supset (p\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot q) \\)"
    "\\( (p\\land (\\lnot p\\equiv q)) \\)"
    "\\( ((q\\supset \\lnot p)\\land p) \\)"
    "\\( ((q\\land q)\\supset \\lnot q) \\)"
    "\\( (\\lnot (p\\supset p)\\equiv q) \\)"
    "\\( \\lnot (q\\land (p\\supset p)) \\)"
    "\\( (q\\supset (\\lnot p\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( (p\\equiv (\\lnot q\\land p)) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (q\\supset (p\\supset \\lnot p)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv p) \\)"
    "\\( (p\\land ((q\\land p)\\land p)) \\)"
    "\\( (p\\land (p\\equiv q)) \\)"
    "\\( ((q\\equiv (q\\equiv p))\\land q) \\)"
    "\\( ((p\\equiv (p\\equiv q))\\land p) \\)"
    "\\( ((q\\land (q\\lor p))\\land p) \\)"
    "\\( ((p\\equiv p)\\supset (q\\equiv p)) \\)"
    "\\( ((q\\land (q\\supset q))\\equiv p) \\)"
    "\\( (p\\equiv ((q\\land q)\\lor q)) \\)"
    "\\( ((q\\equiv (q\\equiv p))\\equiv q) \\)"
    "\\( (q\\equiv ((p\\lor p)\\lor p)) \\)"
    "\\( (q\\land (q\\supset (q\\lor p))) \\)"
    "\\( (((p\\lor q)\\land q)\\lor q) \\)"
    "\\( (q\\land ((q\\supset p)\\equiv p)) \\)"
    "\\( ((q\\land (q\\land q))\\lor q) \\)"
    "\\( (q\\equiv (q\\supset (p\\supset p))) \\)"
    "\\( ((q\\lor p)\\supset (p\\supset q)) \\)"
    "\\( (p\\supset (q\\lor (q\\land p))) \\)"
    "\\( (q\\equiv (p\\equiv (q\\supset p))) \\)"
    "\\( (p\\supset (q\\lor \\lnot p)) \\)"
    "\\( (p\\supset (q\\lor (p\\supset q))) \\)"
    "\\( ((p\\supset (p\\lor q))\\equiv p) \\)"
    "\\( (p\\land (p\\land (p\\equiv p))) \\)"
    "\\( (p\\lor (q\\land (p\\land q))) \\)"
    "\\( (((q\\supset q)\\equiv p)\\lor p) \\)"
    "\\( (p\\land (p\\supset (p\\land p))) \\)"
    "\\( ((\\lnot q\\lor p)\\lor p) \\)"
    "\\( (q\\supset ((p\\supset p)\\supset p)) \\)"
    "\\( (q\\supset (p\\land p)) \\)"
    "\\( ((q\\land q)\\supset (p\\lor p)) \\)"
    "\\( ((q\\lor (q\\land p))\\supset p) \\)"
    "\\( (p\\lor \\lnot (q\\equiv p)) \\)"
    "\\( (q\\lor ((p\\equiv q)\\equiv q)) \\)"
    "\\( ((p\\land (q\\lor p))\\lor q) \\)"
    "\\( ((p\\equiv (q\\land q))\\supset p) \\)"
    "\\( ((p\\lor p)\\lor (p\\lor q)) \\)"
    "\\( ((q\\supset p)\\equiv (q\\supset p)) \\)"
    "\\( (((p\\equiv p)\\supset p)\\equiv p) \\)"
    "\\( (q\\supset ((p\\land q)\\equiv p)) \\)"
    "\\( (((q\\equiv q)\\supset q)\\supset q) \\)"
    "\\( (((p\\supset p)\\equiv q)\\equiv q) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\supset (q\\land p))\\), \\((p\\land (p\\equiv (p\\land p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot ((p\\lor p)\\supset q) \\)"
    "\\( (p\\land \\lnot (p\\equiv q)) \\)"
    "\\( \\lnot (p\\equiv (q\\land p)) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor q) \\)"
    "\\( (p\\land (p\\supset \\lnot q)) \\)"
    "\\( (\\lnot q\\equiv (p\\equiv p)) \\)"
    "\\( \\lnot (q\\land (p\\lor q)) \\)"
    "\\( \\lnot (q\\equiv (q\\equiv q)) \\)"
    "\\( (\\lnot q\\land (p\\equiv p)) \\)"
    "\\( ((p\\land \\lnot p)\\equiv q) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( (q\\supset (p\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( (p\\land (q\\lor (q\\equiv q))) \\)"
    "\\( (p\\land ((q\\supset p)\\land p)) \\)"
    "\\( ((\\lnot p\\lor q)\\supset p) \\)"
    "\\( \\lnot \\lnot (p\\lor p) \\)"
    "\\( ((q\\land p)\\lor p) \\)"
    "\\( ((q\\land (p\\supset q))\\supset p) \\)"
    "\\( ((q\\equiv p)\\lor (p\\lor p)) \\)"
    "\\( (((q\\equiv p)\\land p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\land (p\\land q))) \\)"
    "\\( (q\\equiv ((q\\land p)\\land p)) \\)"
    "\\( (q\\equiv ((p\\land p)\\supset q)) \\)"
    "\\( ((q\\equiv (q\\equiv p))\\lor q) \\)"
    "\\( ((q\\lor (p\\supset q))\\equiv q) \\)"
    "\\( ((q\\land (q\\supset q))\\lor p) \\)"
    "\\( ((q\\lor p)\\lor (q\\lor q)) \\)"
    "\\( ((q\\land p)\\supset (p\\lor q)) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\supset p)) \\)"
    "\\( ((q\\land q)\\lor (p\\supset p)) \\)"
    "\\( ((p\\lor p)\\supset (p\\lor q)) \\)"
    "\\( (p\\lor (p\\supset \\lnot p)) \\)"
  ]
  :wrong [
            ["\\( (p\\land (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot (\\lnot p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (q\\land (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot (q\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\supset p)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\supset (q\\lor p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\equiv (p\\supset q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\land \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot ((q\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot ((q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((q\\lor q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (p\\equiv (q\\land (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (q\\land ((q\\lor p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((p\\land q)\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot (p\\supset (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot (\\lnot q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot ((p\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (q\\land ((q\\land q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((p\\supset p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((q\\supset (q\\supset q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((q\\supset p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((\\lnot p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((p\\supset q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( \\lnot ((p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((p\\land p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((p\\supset q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( ((p\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
            ["\\( (((q\\land q)\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\land p)\\equiv p)\\), \\(((p\\lor (q\\lor q))\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( ((q\\equiv \\lnot p)\\land p) \\)"
    "\\( (p\\equiv \\lnot (q\\land p)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( ((p\\lor q)\\land \\lnot q) \\)"
    "\\( \\lnot (q\\land (q\\equiv q)) \\)"
    "\\( (\\lnot q\\lor \\lnot q) \\)"
    "\\( \\lnot ((q\\land p)\\lor q) \\)"
    "\\( \\lnot ((q\\lor p)\\land q) \\)"
    "\\( (q\\supset \\lnot (q\\supset q)) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( ((p\\land q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv q)\\land p) \\)"
    "\\( \\lnot ((q\\equiv p)\\land p) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( ((\\lnot p\\lor q)\\supset p) \\)"
    "\\( (p\\equiv (p\\supset (p\\lor p))) \\)"
    "\\( (p\\equiv ((q\\supset q)\\lor p)) \\)"
    "\\( ((p\\supset (q\\supset q))\\equiv p) \\)"
    "\\( ((p\\supset (q\\lor p))\\land p) \\)"
    "\\( (p\\equiv (q\\lor p)) \\)"
    "\\( (p\\lor ((p\\lor q)\\supset p)) \\)"
    "\\( (p\\equiv ((q\\land q)\\lor p)) \\)"
    "\\( (q\\supset (p\\equiv (q\\equiv q))) \\)"
    "\\( (q\\supset (p\\lor (q\\equiv p))) \\)"
    "\\( \\lnot \\lnot (p\\lor q) \\)"
    "\\( ((p\\equiv (q\\equiv q))\\lor q) \\)"
    "\\( (((p\\supset q)\\equiv q)\\lor q) \\)"
    "\\( ((q\\land (q\\land q))\\lor p) \\)"
    "\\( (p\\lor ((p\\lor q)\\land q)) \\)"
    "\\( ((q\\equiv q)\\lor (p\\lor p)) \\)"
    "\\( (\\lnot p\\lor (p\\equiv p)) \\)"
    "\\( (q\\supset ((q\\supset p)\\supset q)) \\)"
    "\\( (p\\lor (\\lnot q\\lor q)) \\)"
    "\\( ((p\\supset \\lnot q)\\lor q) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (p\\equiv (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (p\\equiv ((p\\lor q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((q\\supset q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (((p\\lor p)\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((\\lnot q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( \\lnot (p\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((p\\land p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (((p\\land p)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\equiv ((p\\land p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (((p\\land p)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (p\\supset ((q\\lor q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (\\lnot p\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( \\lnot ((p\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (\\lnot p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((q\\equiv \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\land (p\\lor \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( \\lnot (p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\equiv (p\\equiv (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( \\lnot ((p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((q\\supset p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( ((q\\supset (q\\equiv p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\equiv ((p\\land p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (q\\land (q\\lor (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
            ["\\( (p\\supset ((p\\lor q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\land (q\\equiv \\lnot p))\\), \\((q\\lor (q\\equiv (p\\supset q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor (p\\supset q)) \\)"
    "\\( ((p\\supset \\lnot q)\\equiv p) \\)"
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\lor (p\\supset q)) \\)"
    "\\( (\\lnot (q\\land p)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( \\lnot ((q\\equiv q)\\equiv q) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( ((p\\supset p)\\supset \\lnot q) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( ((q\\supset p)\\supset \\lnot q) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot q) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( ((p\\supset q)\\supset \\lnot p) \\)"
    "\\( ((p\\supset (q\\lor q))\\supset p) \\)"
    "\\( (p\\land ((p\\supset p)\\lor p)) \\)"
    "\\( (p\\land (p\\lor (p\\supset q))) \\)"
    "\\( (((p\\equiv q)\\supset p)\\land p) \\)"
    "\\( ((q\\supset (p\\lor q))\\supset p) \\)"
    "\\( (((q\\lor q)\\equiv p)\\lor p) \\)"
    "\\( ((p\\supset p)\\supset (q\\supset p)) \\)"
    "\\( ((p\\lor p)\\lor (p\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\supset q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\equiv p)) \\)"
    "\\( (((p\\supset q)\\equiv q)\\lor q) \\)"
    "\\( ((p\\equiv (q\\land q))\\supset q) \\)"
    "\\( (p\\equiv (q\\supset (p\\lor p))) \\)"
    "\\( ((q\\supset p)\\equiv (p\\lor p)) \\)"
    "\\( (p\\equiv (p\\lor (q\\supset p))) \\)"
    "\\( (q\\supset ((q\\equiv q)\\lor p)) \\)"
    "\\( (p\\equiv (q\\equiv (q\\equiv p))) \\)"
    "\\( (p\\supset ((q\\land q)\\supset q)) \\)"
    "\\( (p\\equiv (p\\land (p\\lor p))) \\)"
    "\\( ((p\\supset (p\\supset p))\\lor p) \\)"
  ]
  :wrong [
            ["\\( ((\\lnot q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((\\lnot p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (\\lnot (q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\land (p\\lor p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\land (q\\equiv q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((p\\lor q)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (\\lnot (p\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( \\lnot ((q\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( \\lnot ((p\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (\\lnot (p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((\\lnot q\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((p\\supset q)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (((q\\land q)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((p\\land (p\\supset q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((\\lnot p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\lor q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (\\lnot (p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (p\\supset (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (((p\\land q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\land (q\\land q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (((q\\lor p)\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (p\\supset ((q\\lor q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( \\lnot (q\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((p\\supset q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (p\\equiv (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((q\\equiv (q\\supset q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( ((p\\equiv q)\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (q\\lor (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
            ["\\( (((p\\land p)\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\land \\lnot (p\\land q))\\), \\(((p\\land q)\\supset (q\\supset p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\equiv (p\\land q)) \\)"
    "\\( (\\lnot q\\equiv (p\\lor q)) \\)"
    "\\( ((p\\lor p)\\land \\lnot q) \\)"
    "\\( (\\lnot (p\\equiv q)\\land p) \\)"
    "\\( ((q\\land p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (p\\equiv p)) \\)"
    "\\( (\\lnot q\\land (q\\supset q)) \\)"
    "\\( \\lnot ((q\\land p)\\lor q) \\)"
    "\\( (\\lnot (p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( ((p\\lor p)\\supset \\lnot q) \\)"
    "\\( \\lnot ((q\\land p)\\land q) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (q\\supset (q\\equiv \\lnot p)) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( ((q\\lor p)\\land (q\\supset p)) \\)"
    "\\( (p\\equiv (p\\supset (q\\supset q))) \\)"
    "\\( (((p\\supset p)\\lor q)\\supset p) \\)"
    "\\( (p\\land (q\\supset (p\\land p))) \\)"
    "\\( (((p\\lor q)\\equiv p)\\land p) \\)"
    "\\( (q\\supset (p\\land (q\\supset q))) \\)"
    "\\( (q\\supset (p\\equiv (q\\equiv q))) \\)"
    "\\( (q\\equiv (p\\land (p\\equiv q))) \\)"
    "\\( (((q\\lor q)\\land q)\\supset p) \\)"
    "\\( ((q\\lor p)\\supset (p\\lor p)) \\)"
    "\\( ((p\\lor (q\\lor p))\\lor p) \\)"
    "\\( ((p\\supset (q\\land p))\\equiv q) \\)"
    "\\( (q\\equiv (p\\supset (q\\equiv p))) \\)"
    "\\( (q\\lor ((q\\equiv q)\\equiv p)) \\)"
    "\\( \\lnot \\lnot (p\\lor q) \\)"
    "\\( (p\\lor (q\\equiv (p\\lor q))) \\)"
    "\\( ((q\\land p)\\supset (q\\lor q)) \\)"
    "\\( (q\\lor ((q\\supset p)\\lor q)) \\)"
    "\\( ((q\\lor q)\\supset (q\\lor q)) \\)"
    "\\( (p\\supset (p\\lor (q\\equiv q))) \\)"
  ]
  :wrong [
            ["\\( (p\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (\\lnot q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (p\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (p\\equiv ((p\\land p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((q\\land (q\\supset q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((q\\lor q)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (((p\\supset q)\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (p\\supset (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (q\\equiv (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (p\\supset (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (q\\land ((q\\supset q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (((q\\lor p)\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((q\\land (p\\land p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (q\\supset (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (\\lnot (q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (p\\supset (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((p\\equiv (q\\lor q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((p\\lor q)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (q\\land ((p\\supset q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (((p\\equiv q)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (q\\equiv \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((q\\equiv p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (p\\land ((q\\supset q)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((p\\supset q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( (q\\equiv ((q\\land p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
            ["\\( ((p\\supset (q\\lor q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0010 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\lor q)\\supset \\lnot q)\\), \\(\\lnot (p\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\equiv (q\\land p)) \\)"
    "\\( (\\lnot p\\equiv (q\\land p)) \\)"
    "\\( \\lnot (q\\equiv (q\\lor p)) \\)"
    "\\( \\lnot (p\\supset (q\\land p)) \\)"
    "\\( (\\lnot p\\equiv (p\\land q)) \\)"
    "\\( \\lnot ((q\\land p)\\lor q) \\)"
    "\\( (q\\supset (p\\equiv \\lnot p)) \\)"
    "\\( (q\\supset (\\lnot q\\land q)) \\)"
    "\\( ((p\\equiv p)\\equiv \\lnot q) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( (q\\supset \\lnot (q\\supset p)) \\)"
    "\\( (p\\supset \\lnot (q\\land q)) \\)"
    "\\( (p\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (q\\supset \\lnot (p\\equiv q)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( ((q\\lor (q\\equiv q))\\land p) \\)"
    "\\( ((p\\lor (q\\land q))\\land p) \\)"
    "\\( ((p\\lor (q\\supset q))\\supset p) \\)"
    "\\( (p\\land ((q\\lor q)\\supset p)) \\)"
    "\\( (((q\\supset q)\\lor p)\\supset p) \\)"
    "\\( ((p\\lor (q\\lor q))\\supset p) \\)"
    "\\( (q\\supset ((q\\supset q)\\supset p)) \\)"
    "\\( ((q\\lor q)\\supset (q\\supset p)) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\land q)) \\)"
    "\\( ((q\\equiv p)\\lor (p\\lor p)) \\)"
    "\\( (q\\lor (q\\lor (p\\land p))) \\)"
    "\\( ((q\\land q)\\lor (p\\lor q)) \\)"
    "\\( ((q\\supset (p\\land q))\\supset p) \\)"
    "\\( (((q\\lor p)\\equiv p)\\supset p) \\)"
    "\\( (p\\lor q) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\supset p)) \\)"
    "\\( (q\\lor (q\\equiv (q\\lor q))) \\)"
    "\\( (q\\equiv \\lnot \\lnot q) \\)"
    "\\( (p\\supset (p\\lor (p\\lor p))) \\)"
    "\\( (p\\lor (p\\supset (p\\lor p))) \\)"
  ]
  :wrong [
            ["\\( (q\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot ((q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\supset q)\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (q\\land ((p\\land q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (((q\\land q)\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot ((p\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot (p\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (q\\equiv ((q\\lor p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\equiv (p\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\supset p)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (q\\equiv (q\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (\\lnot (p\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot ((p\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\equiv q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\land p)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\equiv q)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (\\lnot (q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (\\lnot (q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((p\\lor p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\equiv (q\\land p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (q\\equiv ((q\\land p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( ((q\\lor q)\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
            ["\\( (q\\lor (q\\lor \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0110 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\lor (q\\lor q))\\), \\(\\lnot ((p\\equiv q)\\land p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\supset \\lnot (q\\equiv q)) \\)"
    "\\( \\lnot (q\\equiv (q\\equiv q)) \\)"
    "\\( \\lnot ((p\\supset p)\\land q) \\)"
    "\\( \\lnot (p\\equiv (q\\equiv p)) \\)"
    "\\( (\\lnot (p\\equiv q)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (q\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( (q\\supset (p\\equiv (q\\equiv q))) \\)"
    "\\( ((q\\land q)\\supset (p\\land p)) \\)"
    "\\( ((q\\lor q)\\supset (q\\land p)) \\)"
    "\\( (q\\supset ((p\\lor p)\\land p)) \\)"
    "\\( (\\lnot q\\lor (p\\land q)) \\)"
    "\\( (p\\supset (\\lnot q\\lor q)) \\)"
    "\\( (q\\equiv ((q\\supset q)\\supset q)) \\)"
    "\\( ((q\\land q)\\supset (p\\lor q)) \\)"
    "\\( ((p\\supset q)\\supset (p\\supset p)) \\)"
    "\\( (\\lnot q\\lor q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot ((q\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot (q\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((q\\equiv \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\equiv q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\equiv ((p\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (((p\\equiv q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\supset (p\\equiv q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\equiv (p\\supset (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (\\lnot (q\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot ((p\\supset q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot ((p\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (((p\\supset q)\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\supset q)\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((q\\equiv (p\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\equiv ((p\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\lor ((q\\lor p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (\\lnot p\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot (p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\supset \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot (q\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\land (q\\equiv (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\equiv q)\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (((p\\supset q)\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\lor p)\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\equiv q)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\lor ((q\\lor p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot (q\\supset (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((q\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\supset \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\land (q\\equiv (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\lor q)\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\land (q\\supset (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( ((p\\supset q)\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (p\\land (p\\lor (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
            ["\\( (q\\lor (q\\lor (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\supset (\\lnot q\\equiv q))\\), \\((p\\land (q\\lor (p\\supset q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\equiv (p\\land p)) \\)"
    "\\( (q\\land \\lnot (p\\supset p)) \\)"
    "\\( (\\lnot p\\land (p\\land q)) \\)"
    "\\( (p\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot ((p\\supset p)\\lor p) \\)"
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( \\lnot ((q\\lor p)\\lor p) \\)"
    "\\( (\\lnot q\\land (q\\equiv p)) \\)"
    "\\( (\\lnot p\\equiv (q\\supset p)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( ((q\\lor p)\\land \\lnot p) \\)"
    "\\( ((q\\land \\lnot p)\\land q) \\)"
    "\\( ((q\\lor p)\\equiv \\lnot p) \\)"
    "\\( ((\\lnot q\\equiv p)\\land q) \\)"
    "\\( ((q\\equiv \\lnot p)\\land q) \\)"
    "\\( (p\\supset \\lnot p) \\)"
    "\\( (p\\equiv (q\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\land p) \\)"
    "\\( (p\\supset \\lnot (q\\equiv q)) \\)"
    "\\( ((p\\equiv p)\\land \\lnot p) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor q) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( \\lnot (p\\supset (p\\land q)) \\)"
    "\\( (\\lnot q\\equiv (q\\lor p)) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (q\\land (p\\equiv p)) \\)"
    "\\( (q\\supset (p\\land \\lnot p)) \\)"
    "\\( (q\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( \\lnot ((q\\lor q)\\land q) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( (p\\supset (q\\supset \\lnot p)) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (p\\equiv (\\lnot q\\land p)) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv q) \\)"
    "\\( (((p\\equiv q)\\equiv q)\\land q) \\)"
    "\\( ((p\\supset (q\\land p))\\land p) \\)"
    "\\( ((p\\lor p)\\land (p\\supset q)) \\)"
    "\\( (((q\\lor p)\\supset q)\\equiv p) \\)"
    "\\( (((p\\equiv q)\\lor q)\\equiv p) \\)"
    "\\( ((q\\land (q\\equiv q))\\equiv p) \\)"
    "\\( (\\lnot \\lnot p\\equiv q) \\)"
    "\\( ((q\\land (p\\supset p))\\equiv p) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\equiv p) \\)"
    "\\( (q\\equiv (\\lnot p\\supset p)) \\)"
    "\\( (((q\\equiv q)\\lor p)\\supset q) \\)"
    "\\( ((q\\land (q\\equiv q))\\land q) \\)"
    "\\( ((p\\lor (q\\equiv q))\\land q) \\)"
    "\\( (q\\land ((p\\equiv q)\\supset p)) \\)"
    "\\( (q\\land (q\\supset (q\\lor q))) \\)"
    "\\( (q\\equiv ((q\\lor p)\\lor p)) \\)"
    "\\( ((q\\lor (q\\equiv p))\\lor q) \\)"
    "\\( (p\\supset ((p\\supset p)\\land q)) \\)"
    "\\( (((p\\equiv q)\\supset q)\\supset q) \\)"
    "\\( ((p\\supset q)\\land (q\\equiv q)) \\)"
    "\\( ((p\\equiv (q\\supset q))\\lor p) \\)"
    "\\( ((p\\lor p)\\lor (q\\land p)) \\)"
    "\\( (p\\land (p\\lor (q\\land q))) \\)"
    "\\( (p\\land ((p\\supset p)\\equiv p)) \\)"
    "\\( (p\\land ((p\\supset p)\\lor q)) \\)"
    "\\( (q\\supset (q\\supset (p\\land p))) \\)"
    "\\( (q\\equiv ((p\\supset q)\\equiv p)) \\)"
    "\\( (p\\lor (p\\lor (p\\equiv q))) \\)"
    "\\( ((p\\lor q)\\equiv p) \\)"
    "\\( (((q\\supset p)\\supset q)\\supset p) \\)"
    "\\( ((q\\lor p)\\lor (p\\land p)) \\)"
    "\\( (p\\lor (\\lnot q\\supset q)) \\)"
    "\\( (q\\lor (p\\equiv (p\\equiv p))) \\)"
    "\\( (((q\\supset p)\\supset q)\\lor p) \\)"
    "\\( (p\\lor (q\\lor (p\\lor q))) \\)"
    "\\( ((q\\supset p)\\lor (q\\equiv q)) \\)"
    "\\( ((q\\equiv \\lnot q)\\supset p) \\)"
    "\\( (((q\\equiv p)\\equiv p)\\supset q) \\)"
    "\\( ((p\\supset p)\\lor (q\\land p)) \\)"
    "\\( (\\lnot q\\lor (q\\lor q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv q)\\supset \\lnot q)\\), \\((p\\equiv (p\\equiv (p\\equiv q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( ((p\\land \\lnot q)\\equiv q) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\lor q) \\)"
    "\\( (p\\equiv (q\\land \\lnot p)) \\)"
    "\\( (p\\supset \\lnot (q\\supset p)) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv p) \\)"
    "\\( \\lnot ((q\\land p)\\lor p) \\)"
    "\\( \\lnot (\\lnot p\\supset p) \\)"
    "\\( (\\lnot p\\land (p\\equiv p)) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (q\\lor p)) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( (\\lnot q\\land (p\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (p\\supset q)) \\)"
    "\\( \\lnot (p\\land q) \\)"
    "\\( \\lnot (q\\land (p\\lor p)) \\)"
    "\\( (p\\supset (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\equiv q) \\)"
    "\\( ((q\\equiv (q\\supset q))\\equiv p) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\equiv p)) \\)"
    "\\( ((q\\equiv p)\\land (q\\equiv q)) \\)"
    "\\( (q\\equiv ((p\\land p)\\lor p)) \\)"
    "\\( (p\\equiv (q\\equiv (q\\supset p))) \\)"
    "\\( ((q\\land q)\\equiv (q\\lor p)) \\)"
    "\\( ((p\\land (q\\equiv p))\\equiv p) \\)"
    "\\( (p\\supset q) \\)"
    "\\( (((p\\lor q)\\equiv q)\\lor q) \\)"
    "\\( ((q\\land (q\\supset q))\\supset p) \\)"
    "\\( ((q\\land q)\\supset (q\\equiv p)) \\)"
    "\\( (q\\supset (q\\equiv (q\\land p))) \\)"
    "\\( (((q\\lor p)\\lor q)\\equiv p) \\)"
    "\\( (p\\lor ((q\\lor q)\\supset p)) \\)"
    "\\( ((p\\supset p)\\equiv (q\\equiv q)) \\)"
    "\\( (p\\lor ((q\\land q)\\equiv q)) \\)"
    "\\( (((p\\land q)\\lor q)\\supset q) \\)"
    "\\( ((p\\supset (p\\land q))\\lor p) \\)"
    "\\( (p\\equiv (p\\land (p\\lor q))) \\)"
  ]
  :wrong [
            ["\\( (p\\land (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (\\lnot q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (p\\land (p\\supset (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\equiv \\lnot p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\land (p\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (((p\\land p)\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( \\lnot (q\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( \\lnot (p\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (p\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\land (p\\lor p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\land (p\\lor p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (((q\\equiv q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\lor q)\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (q\\land \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( \\lnot ((q\\supset p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (((p\\equiv q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\supset \\lnot q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\land (p\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (p\\equiv ((q\\supset p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( \\lnot ((p\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\supset \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (p\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((q\\land (p\\land q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (((q\\lor q)\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( ((p\\lor (q\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
            ["\\( (q\\lor (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1001 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((q\\supset p)\\supset q)\\), \\(((q\\equiv (q\\lor p))\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor (q\\equiv q)) \\)"
    "\\( (q\\land \\lnot (p\\supset q)) \\)"
    "\\( (q\\land (p\\land \\lnot p)) \\)"
    "\\( \\lnot (p\\lor \\lnot p) \\)"
    "\\( \\lnot (p\\supset (p\\land p)) \\)"
    "\\( \\lnot ((q\\supset p)\\equiv p) \\)"
    "\\( ((q\\supset p)\\land \\lnot p) \\)"
    "\\( ((q\\supset p)\\land \\lnot p) \\)"
    "\\( ((p\\equiv q)\\land \\lnot q) \\)"
    "\\( (p\\equiv (\\lnot p\\land q)) \\)"
    "\\( (\\lnot (p\\land q)\\land q) \\)"
    "\\( \\lnot (q\\supset (q\\equiv p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\land q) \\)"
    "\\( (q\\land (p\\supset \\lnot q)) \\)"
    "\\( ((\\lnot p\\land p)\\equiv p) \\)"
    "\\( \\lnot ((q\\supset p)\\land p) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot p) \\)"
    "\\( ((q\\supset q)\\equiv \\lnot p) \\)"
    "\\( \\lnot ((q\\supset p)\\land p) \\)"
    "\\( (\\lnot p\\equiv (q\\land p)) \\)"
    "\\( (\\lnot (p\\lor q)\\equiv q) \\)"
    "\\( \\lnot (q\\lor \\lnot p) \\)"
    "\\( \\lnot (q\\lor (p\\supset q)) \\)"
    "\\( (\\lnot q\\land (p\\lor p)) \\)"
    "\\( (\\lnot q\\equiv (q\\supset q)) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((q\\supset q)\\land \\lnot q) \\)"
    "\\( (q\\supset (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot (q\\lor (q\\land q)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot ((q\\land p)\\land p) \\)"
    "\\( (p\\supset (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (p\\land (q\\land p)) \\)"
    "\\( \\lnot (p\\land q) \\)"
    "\\( (p\\supset (p\\equiv \\lnot q)) \\)"
    "\\( (q\\equiv (q\\supset p)) \\)"
    "\\( ((q\\equiv (p\\equiv p))\\land p) \\)"
    "\\( (q\\land (p\\land (p\\supset q))) \\)"
    "\\( (((q\\equiv p)\\land q)\\land q) \\)"
    "\\( ((q\\land q)\\equiv (q\\supset p)) \\)"
    "\\( ((q\\lor (q\\land p))\\equiv p) \\)"
    "\\( (((q\\lor p)\\land p)\\equiv q) \\)"
    "\\( ((p\\land (q\\supset p))\\equiv q) \\)"
    "\\( ((p\\equiv q)\\lor (q\\land p)) \\)"
    "\\( ((p\\lor (q\\land p))\\equiv q) \\)"
    "\\( (q\\land (p\\supset p)) \\)"
    "\\( (((q\\equiv q)\\supset q)\\lor q) \\)"
    "\\( (q\\land ((p\\supset p)\\land q)) \\)"
    "\\( ((p\\supset p)\\land (q\\lor q)) \\)"
    "\\( (q\\equiv ((q\\lor q)\\equiv q)) \\)"
    "\\( (p\\equiv ((p\\lor p)\\land q)) \\)"
    "\\( ((p\\land p)\\supset (p\\equiv q)) \\)"
    "\\( ((p\\land (p\\land p))\\supset q) \\)"
    "\\( (((p\\lor q)\\supset q)\\lor q) \\)"
    "\\( (\\lnot (q\\equiv p)\\supset q) \\)"
    "\\( (p\\land ((q\\equiv p)\\equiv q)) \\)"
    "\\( ((p\\supset (p\\supset p))\\land p) \\)"
    "\\( (p\\lor ((q\\equiv p)\\land q)) \\)"
    "\\( ((p\\lor (q\\equiv q))\\supset p) \\)"
    "\\( ((q\\land (p\\land q))\\lor p) \\)"
    "\\( (q\\equiv (q\\land (p\\land q))) \\)"
    "\\( ((q\\land q)\\equiv (q\\land p)) \\)"
    "\\( ((p\\equiv (p\\supset q))\\equiv q) \\)"
    "\\( (q\\supset (p\\equiv (q\\lor p))) \\)"
    "\\( (q\\supset (q\\supset p)) \\)"
    "\\( (\\lnot (q\\supset p)\\lor p) \\)"
    "\\( ((q\\equiv p)\\equiv (q\\land p)) \\)"
    "\\( (q\\lor ((p\\equiv q)\\equiv q)) \\)"
    "\\( (((q\\land q)\\equiv p)\\supset q) \\)"
    "\\( (p\\lor (q\\land \\lnot p)) \\)"
    "\\( ((p\\lor (p\\supset q))\\lor p) \\)"
    "\\( ((p\\lor (q\\land p))\\supset p) \\)"
    "\\( ((p\\lor (p\\equiv p))\\lor p) \\)"
    "\\( (q\\supset (p\\equiv (p\\land q))) \\)"
    "\\( (p\\supset (q\\lor \\lnot q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((\\lnot q\\equiv q)\\equiv q)\\), \\((\\lnot (p\\lor q)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot q\\land \\lnot p) \\)"
    "\\( \\lnot ((p\\lor p)\\lor q) \\)"
    "\\( (\\lnot (q\\supset p)\\equiv p) \\)"
    "\\( (\\lnot q\\land (p\\equiv q)) \\)"
    "\\( \\lnot (\\lnot p\\supset q) \\)"
    "\\( \\lnot (p\\land (q\\lor p)) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv p) \\)"
    "\\( (\\lnot p\\land (q\\supset q)) \\)"
    "\\( ((p\\supset p)\\land \\lnot p) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv p) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( (q\\supset \\lnot (p\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (p\\equiv p)) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( ((p\\land \\lnot p)\\equiv q) \\)"
    "\\( (p\\equiv \\lnot (p\\supset q)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv p) \\)"
    "\\( \\lnot (p\\land (p\\supset q)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (p\\supset \\lnot (q\\lor q)) \\)"
    "\\( (\\lnot q\\equiv \\lnot p) \\)"
    "\\( ((p\\land (q\\supset q))\\equiv q) \\)"
    "\\( ((p\\equiv q)\\lor (p\\land q)) \\)"
    "\\( ((q\\land q)\\equiv (p\\land p)) \\)"
    "\\( ((p\\land (p\\supset p))\\equiv q) \\)"
    "\\( (q\\lor ((q\\equiv p)\\lor q)) \\)"
    "\\( (((p\\supset p)\\supset p)\\supset q) \\)"
    "\\( (p\\supset (p\\supset (p\\supset q))) \\)"
    "\\( ((\\lnot p\\supset q)\\supset q) \\)"
    "\\( (((p\\land q)\\equiv p)\\lor q) \\)"
    "\\( ((p\\lor q)\\supset p) \\)"
    "\\( ((q\\lor p)\\equiv (p\\land p)) \\)"
    "\\( (q\\supset ((q\\equiv p)\\land q)) \\)"
    "\\( ((q\\equiv (p\\supset q))\\equiv p) \\)"
    "\\( ((q\\land p)\\equiv (q\\land q)) \\)"
    "\\( ((q\\supset (q\\supset q))\\lor p) \\)"
    "\\( ((p\\supset p)\\lor (q\\land p)) \\)"
    "\\( (q\\lor (p\\lor (q\\supset q))) \\)"
    "\\( (p\\supset (q\\equiv (p\\land q))) \\)"
    "\\( ((\\lnot p\\supset p)\\supset p) \\)"
  ]
  :wrong [
            ["\\( (q\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\lor q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot (p\\supset (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\lor q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((p\\supset (p\\supset q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (p\\lor ((q\\land p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (((p\\land q)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot (q\\supset (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (q\\land \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (\\lnot q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (p\\land (q\\land (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\equiv (q\\supset p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (p\\lor (p\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (((q\\equiv p)\\supset q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (q\\land (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (q\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot ((q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\equiv q)\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (((q\\equiv q)\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\lor p)\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((p\\land \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot (q\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (p\\land \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( \\lnot ((p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (p\\equiv (p\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((p\\lor (q\\equiv q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( (((q\\lor q)\\supset q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
            ["\\( ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\supset (p\\land \\lnot p))\\), \\((((q\\equiv q)\\equiv p)\\lor p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((q\\lor p)\\equiv q) \\)"
    "\\( \\lnot (q\\lor (q\\equiv p)) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( \\lnot (p\\supset (q\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\supset \\lnot q) \\)"
    "\\( (\\lnot (q\\equiv p)\\equiv p) \\)"
    "\\( \\lnot \\lnot \\lnot q \\)"
    "\\( \\lnot (q\\land (p\\equiv p)) \\)"
    "\\( \\lnot ((q\\land q)\\land q) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( \\lnot ((q\\land q)\\land p) \\)"
    "\\( (p\\lor ((q\\lor p)\\land p)) \\)"
    "\\( (((p\\lor q)\\equiv q)\\supset p) \\)"
    "\\( (((q\\land p)\\supset q)\\supset p) \\)"
    "\\( (p\\land ((p\\land p)\\lor p)) \\)"
    "\\( (p\\lor (q\\land (q\\equiv p))) \\)"
    "\\( (q\\supset ((q\\supset p)\\equiv q)) \\)"
    "\\( (p\\lor (p\\lor (q\\equiv p))) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\land p)) \\)"
    "\\( (((p\\supset p)\\supset q)\\supset p) \\)"
    "\\( ((p\\lor p)\\equiv (p\\lor q)) \\)"
    "\\( ((p\\land p)\\lor (q\\lor q)) \\)"
    "\\( ((p\\lor (p\\lor q))\\lor q) \\)"
    "\\( ((p\\supset \\lnot p)\\supset q) \\)"
    "\\( ((p\\equiv (q\\land p))\\equiv q) \\)"
    "\\( (q\\lor ((p\\lor p)\\lor p)) \\)"
    "\\( (p\\supset (q\\supset (q\\supset p))) \\)"
    "\\( ((q\\equiv p)\\supset (q\\equiv q)) \\)"
    "\\( ((p\\land q)\\supset (p\\lor q)) \\)"
    "\\( ((q\\equiv (q\\land q))\\lor p) \\)"
    "\\( (p\\supset (q\\lor (q\\supset q))) \\)"
  ]
  :wrong [
            ["\\( ((q\\land \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (\\lnot q\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((\\lnot q\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (q\\land (q\\land (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (p\\equiv (p\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (((p\\equiv p)\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (p\\supset ((p\\equiv q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (\\lnot q\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((p\\land (p\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((p\\supset q)\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((\\lnot p\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((q\\land \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((p\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((\\lnot q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (p\\land (q\\equiv (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (((p\\equiv p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((q\\land q)\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( \\lnot (\\lnot q\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (\\lnot (q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( \\lnot (p\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (p\\land (p\\land (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (q\\equiv (q\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( (((p\\land q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
            ["\\( ((p\\supset (p\\supset q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\equiv p)\\equiv \\lnot q)\\), \\((q\\supset ((q\\lor q)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\supset (q\\land \\lnot q)) \\)"
    "\\( (q\\supset \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\lor (q\\lor q)) \\)"
    "\\( (q\\equiv (\\lnot p\\land p)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv q)) \\)"
    "\\( (\\lnot q\\equiv (q\\supset p)) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( ((p\\land q)\\supset \\lnot p) \\)"
    "\\( ((\\lnot p\\land q)\\equiv q) \\)"
    "\\( (q\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (((p\\lor p)\\equiv q)\\lor p) \\)"
    "\\( ((p\\lor \\lnot q)\\lor p) \\)"
    "\\( (\\lnot (p\\lor q)\\lor p) \\)"
    "\\( (q\\supset (p\\equiv (p\\lor q))) \\)"
    "\\( (p\\lor (q\\supset (p\\land q))) \\)"
    "\\( ((q\\lor \\lnot q)\\lor q) \\)"
    "\\( (q\\lor (p\\equiv (p\\lor p))) \\)"
    "\\( ((q\\equiv q)\\lor q) \\)"
    "\\( ((q\\land p)\\equiv (p\\land q)) \\)"
    "\\( (((q\\land p)\\land q)\\supset q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot (p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\supset \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (((p\\lor q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\equiv (q\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\equiv p)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\land (p\\land q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\lor \\lnot p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (((q\\equiv p)\\supset q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot (q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot ((q\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\supset (p\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\equiv ((p\\equiv p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (((p\\supset p)\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\equiv (q\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\land (\\lnot q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (((p\\lor p)\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (q\\land (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\land q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\supset \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\land (q\\land (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\equiv (q\\equiv (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\lor p)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (p\\equiv (p\\land (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\equiv q)\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot (p\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (q\\equiv \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((\\lnot p\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot ((p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((q\\lor (p\\land q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\equiv (p\\equiv q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (q\\lor (q\\land (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (((p\\supset p)\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( (\\lnot p\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
            ["\\( ((p\\supset q)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot ((p\\equiv q)\\equiv p)\\), \\((((q\\land q)\\equiv p)\\supset q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land (q\\equiv \\lnot p)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land p)) \\)"
    "\\( (\\lnot (q\\land q)\\land p) \\)"
    "\\( ((p\\lor p)\\land \\lnot q) \\)"
    "\\( (q\\supset \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (q\\land (p\\supset p)) \\)"
    "\\( \\lnot ((p\\equiv p)\\equiv q) \\)"
    "\\( ((\\lnot q\\equiv p)\\equiv p) \\)"
    "\\( \\lnot (q\\lor (q\\land p)) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((p\\supset q)\\land p) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\land q) \\)"
    "\\( (p\\supset (q\\supset \\lnot q)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv q) \\)"
    "\\( (p\\equiv (q\\supset (p\\equiv p))) \\)"
    "\\( ((p\\supset (q\\lor p))\\land p) \\)"
    "\\( (((p\\land p)\\land p)\\lor p) \\)"
    "\\( (((p\\land q)\\equiv q)\\land p) \\)"
    "\\( ((p\\land q)\\lor p) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\supset q)) \\)"
    "\\( ((p\\lor q)\\equiv (p\\lor p)) \\)"
    "\\( ((p\\land q)\\equiv (q\\lor q)) \\)"
    "\\( (q\\supset (p\\equiv (q\\equiv q))) \\)"
    "\\( (q\\equiv (q\\equiv (q\\supset p))) \\)"
    "\\( ((q\\lor (q\\lor q))\\lor p) \\)"
    "\\( (p\\equiv ((p\\lor q)\\equiv p)) \\)"
    "\\( ((q\\supset (p\\land q))\\supset p) \\)"
    "\\( (((q\\land q)\\equiv p)\\supset q) \\)"
    "\\( (((q\\land p)\\equiv q)\\supset p) \\)"
    "\\( ((p\\equiv q)\\lor (p\\equiv p)) \\)"
    "\\( ((q\\lor (p\\equiv q))\\lor p) \\)"
    "\\( (((p\\supset p)\\supset q)\\supset q) \\)"
    "\\( (q\\lor (q\\lor (p\\equiv p))) \\)"
    "\\( ((q\\land (q\\land p))\\supset q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (\\lnot p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\lor p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\supset q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((p\\equiv q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\equiv p)\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (\\lnot q\\supset (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\lor p)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\land \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (q\\equiv \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (\\lnot p\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( \\lnot (\\lnot p\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (q\\land (p\\equiv (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\equiv p)\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (((p\\lor p)\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((p\\lor (p\\land p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (\\lnot (p\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (\\lnot (q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\equiv (p\\land p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (((q\\equiv q)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (((p\\supset q)\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((p\\supset q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (p\\land \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (q\\land (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (p\\supset \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (p\\land (q\\land (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (q\\equiv ((q\\equiv p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( (q\\lor (q\\equiv (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
            ["\\( ((q\\lor (p\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\lor (q\\lor q))\\), \\((p\\equiv (p\\land (q\\equiv q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\equiv \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((q\\supset p)\\supset q) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv q) \\)"
    "\\( ((\\lnot q\\equiv p)\\equiv p) \\)"
    "\\( \\lnot ((q\\supset q)\\equiv q) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( (q\\supset (p\\equiv \\lnot q)) \\)"
    "\\( (p\\supset \\lnot (p\\supset q)) \\)"
    "\\( (q\\supset \\lnot (p\\land p)) \\)"
    "\\( (q\\supset ((p\\equiv p)\\equiv p)) \\)"
    "\\( (p\\lor ((p\\land p)\\equiv q)) \\)"
    "\\( (q\\equiv (p\\land q)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\supset p)) \\)"
    "\\( ((\\lnot q\\supset q)\\supset p) \\)"
    "\\( (q\\equiv ((q\\lor q)\\lor q)) \\)"
    "\\( ((q\\lor p)\\lor (q\\equiv q)) \\)"
    "\\( (p\\supset ((q\\land q)\\supset p)) \\)"
    "\\( (q\\lor (q\\supset (p\\supset q))) \\)"
    "\\( (p\\supset (p\\equiv (q\\lor p))) \\)"
  ]
  :wrong [
            ["\\( (q\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\supset \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\lor p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot \\lnot (q\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (q\\lor (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\equiv \\lnot p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (p\\land (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\land ((q\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\land (p\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot (p\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot (p\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (q\\land (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\lor \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\supset q)\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\supset \\lnot p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (((q\\equiv p)\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (q\\land \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot (\\lnot p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\lor (q\\equiv p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\equiv (p\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (q\\land (q\\land (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\supset (p\\supset (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (((p\\supset q)\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (q\\lor (p\\lor (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot ((q\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\supset p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (p\\land \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((p\\equiv p)\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\equiv q)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( (((q\\equiv p)\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\land p)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\supset (p\\equiv p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
            ["\\( ((q\\equiv (p\\lor p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1010 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot q\\equiv (p\\land p))\\), \\((q\\supset (\\lnot p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( \\lnot ((q\\equiv p)\\land q) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (p\\supset (\\lnot q\\equiv p)) \\)"
    "\\( (q\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (((p\\land p)\\lor q)\\lor q) \\)"
    "\\( ((p\\land p)\\lor q) \\)"
    "\\( ((p\\lor (q\\equiv p))\\supset p) \\)"
    "\\( (p\\equiv ((q\\supset p)\\lor p)) \\)"
    "\\( (((p\\equiv q)\\supset q)\\lor q) \\)"
    "\\( (q\\supset ((p\\equiv p)\\land q)) \\)"
    "\\( ((q\\equiv q)\\lor (q\\supset q)) \\)"
    "\\( ((p\\supset q)\\lor (p\\land p)) \\)"
    "\\( ((q\\lor (p\\land q))\\supset q) \\)"
    "\\( ((\\lnot p\\equiv p)\\supset p) \\)"
  ]
  :wrong [
            ["\\( (p\\land (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (\\lnot p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\equiv (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( \\lnot ((p\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (((p\\supset p)\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\lor p)\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\land q)\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\supset \\lnot \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((p\\land (q\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((\\lnot q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (\\lnot p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\equiv (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (\\lnot p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\supset (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\equiv (p\\land p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((p\\supset q)\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\land (q\\lor (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((p\\lor q)\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\land (p\\lor (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\supset ((p\\equiv p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\land (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((\\lnot q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( \\lnot ((q\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( \\lnot (q\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( \\lnot ((q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (((q\\supset p)\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\equiv ((p\\land q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\lor \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\equiv ((p\\equiv q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\lor ((p\\equiv p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (q\\supset (q\\land (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (\\lnot p\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (\\lnot p\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((\\lnot q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((p\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\equiv \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\supset q)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\equiv ((q\\supset p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( ((q\\land q)\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\supset ((q\\land q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\land (q\\lor (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
            ["\\( (p\\lor (q\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1110 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (q\\lor q)\\equiv p)\\), \\(((q\\land q)\\land (p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\supset (p\\lor q)) \\)"
    "\\( (\\lnot q\\land (q\\land p)) \\)"
    "\\( \\lnot (p\\lor (p\\supset p)) \\)"
    "\\( (q\\equiv \\lnot (q\\land q)) \\)"
    "\\( ((p\\lor p)\\land \\lnot p) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( \\lnot (q\\lor (q\\lor p)) \\)"
    "\\( \\lnot (p\\lor (p\\lor q)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot ((p\\lor p)\\lor q) \\)"
    "\\( ((q\\supset \\lnot p)\\land q) \\)"
    "\\( (q\\land \\lnot (p\\land p)) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( (\\lnot p\\land (q\\land q)) \\)"
    "\\( ((\\lnot q\\equiv p)\\land q) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (p\\equiv q)) \\)"
    "\\( \\lnot (q\\equiv (q\\equiv p)) \\)"
    "\\( ((q\\lor p)\\supset \\lnot p) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (q\\land p)) \\)"
    "\\( ((p\\land q)\\equiv \\lnot p) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv p) \\)"
    "\\( ((p\\lor q)\\land \\lnot q) \\)"
    "\\( (\\lnot q\\land (q\\lor p)) \\)"
    "\\( \\lnot ((q\\land q)\\land q) \\)"
    "\\( ((q\\equiv q)\\equiv \\lnot q) \\)"
    "\\( (q\\supset \\lnot (p\\lor q)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv q)) \\)"
    "\\( (q\\supset (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot (q\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( \\lnot (p\\equiv q) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( (q\\equiv (\\lnot p\\land q)) \\)"
    "\\( ((q\\supset p)\\supset \\lnot q) \\)"
    "\\( \\lnot (p\\land (q\\equiv p)) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( (q\\land ((q\\lor q)\\supset p)) \\)"
    "\\( (((q\\lor p)\\equiv q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\land (q\\land q)) \\)"
    "\\( (p\\land ((p\\lor q)\\equiv q)) \\)"
    "\\( ((q\\land p)\\land (q\\lor q)) \\)"
    "\\( ((q\\lor p)\\supset (p\\equiv q)) \\)"
    "\\( ((p\\supset p)\\land (p\\equiv q)) \\)"
    "\\( ((p\\lor p)\\equiv q) \\)"
    "\\( ((q\\equiv p)\\land (q\\equiv q)) \\)"
    "\\( (q\\equiv (p\\lor (p\\lor p))) \\)"
    "\\( ((p\\supset p)\\land (q\\land q)) \\)"
    "\\( ((q\\lor (q\\supset p))\\supset q) \\)"
    "\\( ((p\\equiv (q\\lor p))\\supset q) \\)"
    "\\( ((p\\land p)\\equiv (p\\equiv q)) \\)"
    "\\( ((q\\equiv (p\\supset q))\\land q) \\)"
    "\\( (p\\supset ((q\\land q)\\lor q)) \\)"
    "\\( ((p\\land q)\\equiv p) \\)"
    "\\( (p\\supset (p\\supset (p\\equiv q))) \\)"
    "\\( (q\\equiv ((q\\lor p)\\lor q)) \\)"
    "\\( (p\\supset ((p\\land p)\\land q)) \\)"
    "\\( (p\\lor (p\\lor p)) \\)"
    "\\( (p\\land (p\\lor q)) \\)"
    "\\( (p\\land (q\\lor (p\\lor p))) \\)"
    "\\( ((p\\land p)\\land (q\\lor p)) \\)"
    "\\( ((q\\lor (p\\equiv p))\\equiv p) \\)"
    "\\( (((q\\equiv p)\\supset p)\\equiv p) \\)"
    "\\( (q\\supset ((q\\land q)\\equiv p)) \\)"
    "\\( (((q\\supset q)\\land q)\\supset p) \\)"
    "\\( (p\\equiv (q\\lor p)) \\)"
    "\\( (((q\\supset p)\\lor p)\\lor p) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\lor p) \\)"
    "\\( (((q\\land q)\\equiv p)\\supset p) \\)"
    "\\( (q\\lor (p\\equiv \\lnot q)) \\)"
    "\\( (p\\lor ((p\\supset q)\\equiv q)) \\)"
    "\\( (p\\lor (p\\equiv (q\\supset p))) \\)"
    "\\( ((p\\lor (q\\land p))\\supset p) \\)"
    "\\( ((q\\lor (q\\land q))\\supset q) \\)"
    "\\( ((q\\land q)\\supset (q\\lor q)) \\)"
    "\\( ((p\\lor p)\\lor (q\\supset q)) \\)"
    "\\( ((p\\land q)\\supset (p\\lor p)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\equiv (q\\lor q))\\), \\((p\\equiv ((q\\supset q)\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\equiv \\lnot p)\\land q) \\)"
    "\\( \\lnot ((p\\land q)\\supset p) \\)"
    "\\( (\\lnot q\\land q) \\)"
    "\\( \\lnot (q\\supset (q\\equiv q)) \\)"
    "\\( (p\\land (p\\equiv \\lnot p)) \\)"
    "\\( (q\\equiv \\lnot (p\\supset q)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot (q\\lor (p\\lor q)) \\)"
    "\\( \\lnot ((p\\land p)\\lor q) \\)"
    "\\( \\lnot (p\\lor (q\\land q)) \\)"
    "\\( ((q\\equiv \\lnot p)\\land q) \\)"
    "\\( (q\\land \\lnot (q\\land p)) \\)"
    "\\( ((\\lnot p\\equiv q)\\land q) \\)"
    "\\( ((q\\supset \\lnot p)\\equiv q) \\)"
    "\\( \\lnot ((p\\equiv q)\\lor p) \\)"
    "\\( ((p\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (p\\land (p\\lor q)) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv q)) \\)"
    "\\( (\\lnot p\\equiv (q\\equiv q)) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv p) \\)"
    "\\( ((p\\supset \\lnot q)\\land p) \\)"
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( (p\\land \\lnot (q\\land q)) \\)"
    "\\( (p\\land \\lnot (q\\equiv p)) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( (q\\equiv \\lnot (p\\supset p)) \\)"
    "\\( (q\\supset (q\\supset \\lnot q)) \\)"
    "\\( \\lnot ((q\\equiv q)\\land q) \\)"
    "\\( ((p\\land p)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\lor p)\\equiv q) \\)"
    "\\( (\\lnot (q\\land q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (p\\land (p\\land q)) \\)"
    "\\( \\lnot ((q\\land q)\\land p) \\)"
    "\\( (p\\equiv (p\\land \\lnot q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\land q) \\)"
    "\\( \\lnot (q\\land (q\\supset p)) \\)"
    "\\( ((q\\supset (p\\equiv q))\\equiv q) \\)"
    "\\( ((\\lnot p\\lor q)\\equiv p) \\)"
    "\\( ((p\\land (p\\equiv p))\\land q) \\)"
    "\\( (((p\\lor q)\\supset p)\\equiv q) \\)"
    "\\( (p\\land ((q\\equiv p)\\land p)) \\)"
    "\\( ((q\\lor (q\\land q))\\equiv p) \\)"
    "\\( ((p\\land q)\\equiv (p\\lor q)) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\land p)) \\)"
    "\\( (((q\\equiv q)\\supset q)\\equiv p) \\)"
    "\\( ((p\\land q)\\lor (q\\equiv p)) \\)"
    "\\( ((q\\equiv (q\\land q))\\land q) \\)"
    "\\( (q\\land ((q\\land q)\\equiv q)) \\)"
    "\\( (q\\equiv (q\\supset (p\\supset q))) \\)"
    "\\( \\lnot (q\\supset \\lnot q) \\)"
    "\\( (q\\land (p\\supset (p\\lor p))) \\)"
    "\\( ((\\lnot q\\land p)\\supset q) \\)"
    "\\( (p\\equiv ((q\\land p)\\land q)) \\)"
    "\\( (p\\supset ((p\\equiv p)\\land q)) \\)"
    "\\( (p\\equiv (q\\land (q\\land p))) \\)"
    "\\( (q\\equiv (\\lnot q\\supset p)) \\)"
    "\\( ((p\\lor (q\\supset q))\\supset p) \\)"
    "\\( (((q\\land p)\\lor p)\\lor p) \\)"
    "\\( ((q\\lor (q\\equiv p))\\supset p) \\)"
    "\\( (p\\lor (p\\land (q\\supset p))) \\)"
    "\\( (((q\\lor p)\\supset p)\\land p) \\)"
    "\\( (((p\\lor p)\\equiv q)\\lor p) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\land q)) \\)"
    "\\( ((q\\lor q)\\supset (p\\equiv q)) \\)"
    "\\( ((\\lnot p\\equiv q)\\supset p) \\)"
    "\\( (p\\lor (p\\lor (q\\supset p))) \\)"
    "\\( (q\\lor (p\\lor q)) \\)"
    "\\( ((q\\lor p)\\equiv (p\\supset p)) \\)"
    "\\( ((p\\supset q)\\equiv (q\\land q)) \\)"
    "\\( ((q\\equiv (p\\land p))\\supset p) \\)"
    "\\( (p\\equiv ((p\\land q)\\equiv q)) \\)"
    "\\( (((q\\land q)\\supset p)\\lor q) \\)"
    "\\( (p\\supset ((q\\supset p)\\supset p)) \\)"
    "\\( (q\\lor (p\\lor (p\\equiv q))) \\)"
    "\\( ((p\\equiv (p\\lor p))\\lor p) \\)"
    "\\( (q\\equiv ((q\\supset q)\\equiv q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv \\lnot (p\\lor p))\\), \\(((p\\land (p\\land q))\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv \\lnot (p\\land q)) \\)"
    "\\( (\\lnot (q\\land p)\\land q) \\)"
    "\\( (p\\equiv \\lnot (p\\lor q)) \\)"
    "\\( (\\lnot p\\land (p\\lor q)) \\)"
    "\\( ((p\\equiv \\lnot q)\\land q) \\)"
    "\\( ((q\\supset q)\\land \\lnot p) \\)"
    "\\( (p\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( \\lnot (p\\equiv (p\\equiv p)) \\)"
    "\\( \\lnot (p\\lor (q\\land p)) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv q)) \\)"
    "\\( ((p\\lor p)\\equiv \\lnot q) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( \\lnot (q\\equiv (p\\land p)) \\)"
    "\\( \\lnot (q\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv (\\lnot q\\land p)) \\)"
    "\\( (q\\supset \\lnot (p\\lor p)) \\)"
    "\\( ((q\\land p)\\supset \\lnot q) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( ((\\lnot q\\supset p)\\land q) \\)"
    "\\( (((p\\supset q)\\lor p)\\supset q) \\)"
    "\\( (q\\lor ((q\\land p)\\lor q)) \\)"
    "\\( ((q\\land (p\\lor p))\\lor q) \\)"
    "\\( (q\\lor (q\\land (p\\land q))) \\)"
    "\\( ((p\\supset q)\\equiv (p\\supset p)) \\)"
    "\\( (p\\supset (q\\land (p\\equiv q))) \\)"
    "\\( (((q\\lor q)\\lor p)\\supset q) \\)"
    "\\( (p\\supset (p\\equiv (q\\land q))) \\)"
    "\\( (p\\equiv ((q\\supset p)\\equiv q)) \\)"
    "\\( (((p\\lor q)\\equiv p)\\supset p) \\)"
    "\\( (\\lnot (q\\lor p)\\supset p) \\)"
    "\\( (q\\lor (p\\lor (p\\lor q))) \\)"
    "\\( ((p\\lor (q\\land q))\\lor p) \\)"
    "\\( (p\\lor ((q\\land p)\\lor q)) \\)"
    "\\( (((p\\land q)\\equiv p)\\lor p) \\)"
    "\\( (q\\lor (p\\lor (p\\equiv q))) \\)"
    "\\( (((q\\land p)\\land p)\\supset q) \\)"
    "\\( (p\\lor (\\lnot q\\lor q)) \\)"
    "\\( (((p\\equiv p)\\equiv q)\\supset q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot q\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((p\\supset q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (p\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (q\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (q\\equiv ((p\\lor q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\lor p)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\land p)\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\supset (q\\equiv p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (q\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot ((p\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\equiv p)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((p\\land (p\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\equiv (q\\lor p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (((p\\equiv q)\\supset q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (\\lnot (p\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (q\\supset \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\land (q\\supset p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\equiv p)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((p\\equiv (p\\supset q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((p\\land q)\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (p\\land (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( \\lnot (q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (q\\equiv (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((p\\equiv (p\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (q\\equiv (p\\land (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( ((q\\equiv q)\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
            ["\\( (p\\lor ((p\\land q)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (p\\land p)\\equiv q)\\), \\(((q\\supset p)\\equiv (p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv \\lnot (p\\lor q)) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor p) \\)"
    "\\( (q\\land \\lnot (p\\land q)) \\)"
    "\\( (q\\land (\\lnot q\\equiv p)) \\)"
    "\\( \\lnot ((q\\supset p)\\lor p) \\)"
    "\\( (p\\equiv \\lnot (p\\supset p)) \\)"
    "\\( (\\lnot p\\land (p\\supset q)) \\)"
    "\\( ((p\\equiv q)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (p\\lor p)) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( (p\\equiv \\lnot (q\\land q)) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (p\\land p)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( ((q\\equiv p)\\supset \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (q\\supset p)) \\)"
    "\\( (p\\supset (p\\equiv \\lnot q)) \\)"
    "\\( ((q\\equiv (q\\lor p))\\land q) \\)"
    "\\( (q\\lor (q\\land (q\\lor q))) \\)"
    "\\( ((q\\lor (p\\equiv q))\\land q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\land q) \\)"
    "\\( (q\\lor \\lnot \\lnot q) \\)"
    "\\( ((p\\lor q)\\supset (p\\supset q)) \\)"
    "\\( (p\\supset (p\\land (q\\land q))) \\)"
    "\\( ((q\\lor (p\\land p))\\equiv q) \\)"
    "\\( (p\\supset ((q\\equiv p)\\lor q)) \\)"
    "\\( ((p\\land q)\\equiv (p\\land p)) \\)"
    "\\( (p\\lor ((p\\supset q)\\land q)) \\)"
    "\\( (q\\lor ((p\\equiv q)\\supset q)) \\)"
    "\\( ((q\\lor p)\\equiv (p\\equiv p)) \\)"
    "\\( (p\\lor ((q\\supset q)\\land q)) \\)"
    "\\( ((p\\supset q)\\supset (q\\land q)) \\)"
    "\\( (p\\supset (p\\land (q\\equiv q))) \\)"
    "\\( ((p\\land (q\\equiv q))\\supset p) \\)"
    "\\( ((q\\supset p)\\supset (q\\equiv q)) \\)"
    "\\( (p\\supset ((p\\equiv p)\\supset p)) \\)"
    "\\( (\\lnot q\\supset \\lnot q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\land ((p\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\equiv ((q\\supset p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\land ((p\\lor p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\supset (p\\equiv (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (\\lnot (p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( \\lnot ((p\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\equiv (p\\equiv (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\equiv p)\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\supset p)\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\lor (q\\lor p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( \\lnot ((q\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (\\lnot q\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\equiv q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\equiv ((q\\land p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\land ((q\\supset p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (\\lnot q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\supset \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\equiv (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\equiv (q\\supset q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (q\\equiv ((p\\equiv p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( (p\\land ((p\\supset q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
            ["\\( ((q\\equiv \\lnot p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv \\lnot (p\\lor p))\\), \\((p\\equiv (\\lnot p\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\land (\\lnot q\\land p)) \\)"
    "\\( \\lnot ((p\\supset q)\\lor q) \\)"
    "\\( \\lnot ((p\\land q)\\equiv p) \\)"
    "\\( ((p\\land p)\\land \\lnot q) \\)"
    "\\( ((q\\land p)\\equiv \\lnot p) \\)"
    "\\( ((p\\supset p)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( \\lnot ((p\\equiv q)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (p\\equiv p)) \\)"
    "\\( \\lnot ((p\\lor q)\\land q) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (q\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (q\\equiv \\lnot (q\\supset p)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (q\\supset \\lnot p) \\)"
    "\\( (p\\lor ((q\\equiv q)\\equiv p)) \\)"
    "\\( (((p\\supset p)\\lor q)\\equiv p) \\)"
    "\\( (((p\\equiv q)\\lor q)\\supset p) \\)"
    "\\( \\lnot \\lnot p \\)"
    "\\( (p\\land (p\\lor (p\\lor p))) \\)"
    "\\( (p\\equiv (p\\lor (q\\land q))) \\)"
    "\\( (((q\\supset q)\\equiv q)\\supset p) \\)"
    "\\( (q\\equiv ((p\\land q)\\land q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\equiv p)) \\)"
    "\\( ((q\\equiv (q\\supset p))\\equiv q) \\)"
    "\\( (p\\lor (p\\lor (q\\lor p))) \\)"
    "\\( (p\\lor ((q\\equiv p)\\equiv p)) \\)"
    "\\( (((p\\lor p)\\lor q)\\lor q) \\)"
    "\\( ((q\\supset (p\\equiv q))\\equiv p) \\)"
    "\\( ((p\\supset \\lnot p)\\supset q) \\)"
    "\\( (p\\lor ((p\\lor p)\\supset q)) \\)"
    "\\( ((p\\equiv p)\\lor (p\\supset q)) \\)"
    "\\( (((p\\land q)\\supset q)\\lor q) \\)"
    "\\( (p\\lor ((p\\equiv p)\\lor p)) \\)"
    "\\( ((p\\lor q)\\lor (p\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\supset \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (q\\equiv ((p\\equiv q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\equiv p)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((\\lnot p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (((q\\lor q)\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\equiv \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( \\lnot ((q\\supset p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\supset \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (q\\land ((p\\lor q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\land (q\\land q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((\\lnot p\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\equiv ((q\\equiv p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((p\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (q\\equiv \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\land ((p\\equiv q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\lor p)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (((q\\land p)\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((p\\land (q\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (q\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\supset \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (p\\land (q\\equiv (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\lor (q\\land p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( ((q\\land (q\\equiv p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
            ["\\( (q\\equiv (p\\lor (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv \\lnot (p\\land p))\\), \\((q\\supset ((p\\equiv q)\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\supset (p\\supset q)) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( (\\lnot (p\\supset q)\\land p) \\)"
    "\\( ((q\\supset \\lnot p)\\land p) \\)"
    "\\( (\\lnot (q\\lor p)\\equiv q) \\)"
    "\\( (\\lnot (q\\supset q)\\equiv q) \\)"
    "\\( \\lnot (q\\land (q\\lor q)) \\)"
    "\\( \\lnot (q\\lor (p\\land q)) \\)"
    "\\( (q\\equiv \\lnot (p\\equiv p)) \\)"
    "\\( (\\lnot q\\land \\lnot q) \\)"
    "\\( (\\lnot p\\equiv (q\\lor q)) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( \\lnot ((p\\land p)\\equiv q) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( (q\\equiv \\lnot (q\\supset p)) \\)"
    "\\( (q\\equiv (q\\land \\lnot p)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( (q\\supset \\lnot (q\\supset p)) \\)"
    "\\( ((q\\supset (p\\supset q))\\land p) \\)"
    "\\( (p\\land ((p\\lor p)\\equiv p)) \\)"
    "\\( \\lnot \\lnot p \\)"
    "\\( (p\\land (p\\supset (p\\supset p))) \\)"
    "\\( ((q\\supset (q\\land q))\\equiv p) \\)"
    "\\( (p\\equiv ((p\\supset q)\\equiv q)) \\)"
    "\\( ((q\\supset (p\\land p))\\lor p) \\)"
    "\\( (p\\lor ((p\\lor q)\\equiv p)) \\)"
    "\\( ((q\\equiv (p\\supset q))\\supset p) \\)"
    "\\( ((p\\land p)\\equiv (q\\lor p)) \\)"
    "\\( (p\\lor ((p\\lor q)\\lor q)) \\)"
    "\\( (((q\\equiv q)\\supset p)\\lor q) \\)"
    "\\( (q\\lor (p\\lor p)) \\)"
    "\\( ((p\\supset q)\\supset (q\\lor p)) \\)"
    "\\( ((q\\equiv (p\\land q))\\supset p) \\)"
    "\\( (q\\supset ((p\\lor p)\\supset q)) \\)"
    "\\( (((q\\lor p)\\equiv q)\\lor p) \\)"
    "\\( (p\\lor (q\\supset (q\\equiv q))) \\)"
    "\\( (p\\lor (p\\equiv (p\\lor p))) \\)"
    "\\( (((q\\supset q)\\lor p)\\lor q) \\)"
  ]
  :wrong [
            ["\\( (\\lnot p\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((p\\land (q\\land p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (\\lnot \\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((q\\lor q)\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (p\\supset ((p\\supset p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (q\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((q\\supset p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((p\\equiv q)\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (((p\\supset p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (((q\\supset p)\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (p\\supset ((q\\supset p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (p\\land \\lnot (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((p\\land p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((q\\lor (q\\lor q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (((p\\lor q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((\\lnot p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (((p\\lor p)\\lor q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (p\\land \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (\\lnot (q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (p\\supset (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((q\\land (p\\lor p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (((q\\lor p)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( (q\\land (p\\supset (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
            ["\\( ((p\\supset q)\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot p\\equiv (q\\land q))\\), \\((p\\equiv (q\\supset (p\\land q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (p\\equiv (q\\land q)) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( (p\\equiv \\lnot q) \\)"
    "\\( \\lnot (p\\equiv (q\\lor q)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( (p\\supset \\lnot (q\\land p)) \\)"
    "\\( (q\\supset (q\\supset \\lnot p)) \\)"
    "\\( (q\\equiv (\\lnot p\\land q)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv p)) \\)"
    "\\( ((p\\equiv p)\\land (p\\lor q)) \\)"
    "\\( (q\\equiv ((p\\equiv q)\\lor q)) \\)"
    "\\( ((q\\equiv (p\\land q))\\equiv p) \\)"
    "\\( ((p\\lor \\lnot q)\\equiv p) \\)"
    "\\( (((p\\supset p)\\supset p)\\lor q) \\)"
    "\\( ((q\\lor (p\\equiv p))\\lor q) \\)"
    "\\( (((p\\lor p)\\land q)\\supset p) \\)"
    "\\( (p\\lor (p\\supset (q\\equiv q))) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\equiv p)) \\)"
    "\\( ((q\\supset (p\\lor q))\\lor q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot (q\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((q\\equiv q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\land (q\\supset p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((p\\lor q)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((q\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\supset (p\\equiv q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\land p)\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (q\\supset ((p\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot (p\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((q\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\land (p\\land (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((q\\land p)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((p\\lor p)\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\lor ((q\\land q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((q\\lor p)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\land \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (\\lnot p\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((q\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( \\lnot ((q\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((p\\land p)\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (q\\equiv ((p\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((q\\land (p\\supset p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((q\\supset p)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (\\lnot p\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((q\\land q)\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\land q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((\\lnot p\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (q\\equiv (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((p\\equiv q)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (((q\\supset p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((\\lnot q\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((q\\equiv p)\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( ((p\\lor (q\\equiv p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
            ["\\( (\\lnot (q\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (q\\equiv (p\\lor p))\\), \\((p\\lor ((q\\lor p)\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv (p\\supset \\lnot p)) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot q\\equiv (p\\lor p)) \\)"
    "\\( (\\lnot (q\\lor q)\\equiv p) \\)"
    "\\( ((p\\land p)\\supset \\lnot q) \\)"
    "\\( (q\\supset (q\\land \\lnot p)) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( \\lnot ((q\\supset p)\\land q) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (p\\equiv (q\\supset (p\\equiv q))) \\)"
    "\\( ((p\\supset (q\\land p))\\equiv q) \\)"
    "\\( (p\\lor \\lnot (p\\equiv q)) \\)"
    "\\( ((q\\supset p)\\equiv p) \\)"
    "\\( (((q\\lor p)\\lor p)\\lor q) \\)"
    "\\( (q\\lor ((p\\lor q)\\equiv p)) \\)"
    "\\( ((q\\supset q)\\lor \\lnot q) \\)"
    "\\( (q\\supset ((q\\supset q)\\lor p)) \\)"
    "\\( (p\\lor (q\\supset \\lnot p)) \\)"
    "\\( ((p\\lor q)\\lor (p\\supset q)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot ((p\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (p\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((q\\equiv q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((q\\land (p\\equiv q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((q\\lor q)\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (((q\\equiv p)\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\land ((p\\equiv p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (((p\\equiv q)\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (\\lnot p\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (p\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\equiv \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\equiv (p\\supset (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((p\\equiv q)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\supset (q\\land (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((p\\supset (p\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\equiv ((q\\land q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot ((q\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\equiv \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((\\lnot q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\equiv \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (((q\\lor q)\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\equiv ((q\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((q\\lor q)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\equiv ((q\\land p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((p\\land p)\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (\\lnot p\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (q\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( \\lnot (p\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((\\lnot q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (((p\\lor q)\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (\\lnot q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((q\\lor (p\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( ((p\\equiv (q\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (((p\\land p)\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
            ["\\( (p\\lor (q\\equiv (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0110 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\supset (p\\equiv \\lnot q))\\), \\((q\\land ((q\\equiv p)\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\supset (q\\lor q)) \\)"
    "\\( (q\\land \\lnot (p\\equiv p)) \\)"
    "\\( (\\lnot (p\\supset p)\\land p) \\)"
    "\\( ((p\\supset \\lnot p)\\land p) \\)"
    "\\( (\\lnot q\\equiv (q\\land q)) \\)"
    "\\( (p\\equiv (q\\land \\lnot p)) \\)"
    "\\( (\\lnot p\\land (q\\supset p)) \\)"
    "\\( \\lnot ((p\\lor q)\\lor q) \\)"
    "\\( ((p\\supset q)\\land \\lnot q) \\)"
    "\\( ((q\\equiv p)\\land \\lnot q) \\)"
    "\\( \\lnot ((q\\lor p)\\equiv p) \\)"
    "\\( \\lnot (q\\supset (p\\land q)) \\)"
    "\\( \\lnot (p\\equiv (p\\lor q)) \\)"
    "\\( (\\lnot (p\\equiv q)\\land q) \\)"
    "\\( \\lnot ((q\\equiv p)\\lor p) \\)"
    "\\( (p\\supset (\\lnot p\\equiv p)) \\)"
    "\\( (\\lnot p\\land \\lnot p) \\)"
    "\\( (q\\equiv (\\lnot p\\equiv q)) \\)"
    "\\( (p\\supset \\lnot p) \\)"
    "\\( ((\\lnot q\\equiv q)\\equiv p) \\)"
    "\\( \\lnot (\\lnot p\\lor q) \\)"
    "\\( (p\\land (\\lnot q\\equiv p)) \\)"
    "\\( (p\\land (\\lnot p\\equiv q)) \\)"
    "\\( ((\\lnot q\\land p)\\land p) \\)"
    "\\( (p\\land (p\\land \\lnot q)) \\)"
    "\\( \\lnot ((q\\land q)\\land q) \\)"
    "\\( (q\\equiv (p\\land \\lnot p)) \\)"
    "\\( (p\\equiv (\\lnot q\\equiv p)) \\)"
    "\\( (\\lnot q\\land \\lnot q) \\)"
    "\\( ((p\\equiv \\lnot p)\\equiv q) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( ((q\\supset \\lnot q)\\equiv p) \\)"
    "\\( \\lnot ((q\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv \\lnot (q\\lor q)) \\)"
    "\\( \\lnot (p\\land (q\\land p)) \\)"
    "\\( \\lnot ((p\\lor p)\\land q) \\)"
    "\\( \\lnot ((q\\lor q)\\land p) \\)"
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( \\lnot ((p\\equiv q)\\land q) \\)"
    "\\( ((q\\land (q\\equiv p))\\land q) \\)"
    "\\( (p\\land ((q\\equiv q)\\land q)) \\)"
    "\\( ((q\\land p)\\land (q\\supset p)) \\)"
    "\\( (p\\land ((q\\land p)\\land q)) \\)"
    "\\( (q\\equiv ((p\\lor q)\\equiv p)) \\)"
    "\\( (q\\equiv ((p\\equiv p)\\supset p)) \\)"
    "\\( (q\\equiv (p\\land (p\\equiv p))) \\)"
    "\\( ((p\\lor (p\\lor p))\\equiv q) \\)"
    "\\( (q\\equiv (p\\equiv (p\\supset p))) \\)"
    "\\( ((q\\equiv (q\\equiv p))\\equiv q) \\)"
    "\\( (q\\land (q\\lor (p\\equiv p))) \\)"
    "\\( ((p\\supset (q\\equiv q))\\supset q) \\)"
    "\\( (((q\\equiv q)\\land q)\\lor q) \\)"
    "\\( (q\\lor ((q\\land q)\\land p)) \\)"
    "\\( (q\\land (\\lnot q\\lor q)) \\)"
    "\\( ((q\\supset q)\\supset (p\\supset q)) \\)"
    "\\( ((p\\equiv q)\\lor (q\\land q)) \\)"
    "\\( (p\\equiv ((q\\supset p)\\equiv q)) \\)"
    "\\( ((\\lnot p\\supset p)\\supset q) \\)"
    "\\( (p\\supset ((q\\supset q)\\equiv q)) \\)"
    "\\( ((q\\land p)\\lor p) \\)"
    "\\( (\\lnot \\lnot p\\lor p) \\)"
    "\\( (p\\land ((q\\land p)\\supset q)) \\)"
    "\\( (p\\equiv (q\\lor (p\\supset p))) \\)"
    "\\( ((p\\supset (q\\equiv p))\\supset p) \\)"
    "\\( ((\\lnot q\\equiv p)\\supset p) \\)"
    "\\( (q\\supset (p\\land (q\\supset q))) \\)"
    "\\( (((p\\land p)\\land q)\\equiv q) \\)"
    "\\( (q\\supset ((q\\land q)\\equiv p)) \\)"
    "\\( (q\\supset ((p\\land p)\\land p)) \\)"
    "\\( (p\\lor (q\\land (q\\lor q))) \\)"
    "\\( (p\\lor (q\\land (p\\supset q))) \\)"
    "\\( ((p\\equiv (q\\lor q))\\supset p) \\)"
    "\\( (\\lnot (q\\land q)\\supset p) \\)"
    "\\( (p\\lor (\\lnot q\\supset q)) \\)"
    "\\( ((q\\lor q)\\supset (q\\equiv q)) \\)"
    "\\( (((q\\lor p)\\supset p)\\lor q) \\)"
    "\\( \\lnot (\\lnot q\\equiv q) \\)"
    "\\( (q\\supset (p\\supset q)) \\)"
    "\\( (q\\lor (q\\supset q)) \\)"
  ]
  :wrong [
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv p)\\supset \\lnot q)\\), \\((((p\\equiv p)\\land q)\\equiv p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( \\lnot (q\\lor p) \\)"
    "\\( \\lnot (q\\lor (q\\lor p)) \\)"
    "\\( ((\\lnot p\\land q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\land \\lnot p)) \\)"
    "\\( \\lnot (q\\equiv (p\\supset q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\equiv p) \\)"
    "\\( ((q\\land \\lnot q)\\equiv p) \\)"
    "\\( ((q\\supset p)\\supset \\lnot p) \\)"
    "\\( ((q\\equiv p)\\equiv \\lnot q) \\)"
    "\\( \\lnot ((q\\equiv q)\\land p) \\)"
    "\\( (\\lnot q\\equiv (p\\supset p)) \\)"
    "\\( (\\lnot (q\\equiv p)\\equiv p) \\)"
    "\\( (q\\supset \\lnot (q\\lor p)) \\)"
    "\\( (\\lnot q\\land (p\\supset p)) \\)"
    "\\( (q\\equiv (p\\equiv \\lnot p)) \\)"
    "\\( (\\lnot (p\\supset q)\\equiv p) \\)"
    "\\( ((q\\land q)\\supset \\lnot p) \\)"
    "\\( (q\\equiv \\lnot (q\\supset p)) \\)"
    "\\( (q\\supset (\\lnot q\\equiv p)) \\)"
    "\\( ((q\\land p)\\supset \\lnot q) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( (p\\equiv (q\\land (p\\supset q))) \\)"
    "\\( (p\\equiv (q\\land (p\\supset p))) \\)"
    "\\( (p\\equiv ((q\\land q)\\land q)) \\)"
    "\\( ((q\\equiv q)\\supset (p\\equiv q)) \\)"
    "\\( ((p\\land q)\\lor \\lnot p) \\)"
    "\\( (q\\lor (q\\lor (q\\equiv p))) \\)"
    "\\( ((p\\lor q)\\supset (q\\land q)) \\)"
    "\\( ((q\\lor q)\\lor (q\\equiv p)) \\)"
    "\\( ((p\\supset p)\\land (p\\supset q)) \\)"
    "\\( ((q\\supset p)\\lor p) \\)"
    "\\( (\\lnot q\\lor (q\\land p)) \\)"
    "\\( ((q\\supset (p\\land p))\\lor p) \\)"
    "\\( ((p\\lor (p\\equiv q))\\lor p) \\)"
    "\\( \\lnot (q\\land \\lnot p) \\)"
    "\\( ((q\\lor (p\\supset p))\\lor q) \\)"
    "\\( ((q\\supset q)\\lor \\lnot q) \\)"
    "\\( (q\\supset ((p\\land q)\\supset q)) \\)"
    "\\( (p\\supset (p\\land (q\\lor p))) \\)"
    "\\( ((p\\lor p)\\supset (q\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((p\\supset \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((p\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((q\\land q)\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (q\\land (q\\lor (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((p\\supset (p\\lor q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\equiv ((p\\equiv q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( \\lnot ((p\\supset p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((q\\land q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( \\lnot (q\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((p\\lor q)\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((q\\land (q\\supset q))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (((q\\equiv q)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (q\\lor (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( \\lnot ((p\\supset p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\equiv \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\land \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\land (q\\lor \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (q\\land (p\\supset (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\equiv (p\\supset (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((p\\lor (q\\lor p))\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (\\lnot p\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( \\lnot (q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\land (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (((p\\land p)\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (q\\equiv (q\\lor (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( (p\\equiv ((q\\supset q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
            ["\\( ((q\\lor p)\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1001 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\supset (q\\supset \\lnot q))\\), \\((q\\land (q\\lor (p\\lor p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land \\lnot (p\\equiv q)) \\)"
    "\\( \\lnot (q\\supset (p\\land p)) \\)"
    "\\( \\lnot (q\\supset (q\\supset p)) \\)"
    "\\( (\\lnot (p\\land p)\\land q) \\)"
    "\\( (q\\land \\lnot (p\\lor p)) \\)"
    "\\( \\lnot ((p\\land p)\\land p) \\)"
    "\\( ((p\\supset q)\\land \\lnot p) \\)"
    "\\( (p\\equiv (q\\land \\lnot q)) \\)"
    "\\( (p\\supset (\\lnot p\\equiv p)) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset p) \\)"
    "\\( (\\lnot q\\equiv (p\\land p)) \\)"
    "\\( ((p\\supset \\lnot p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\supset \\lnot q)) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( \\lnot ((q\\land q)\\equiv p) \\)"
    "\\( \\lnot (q\\land (p\\land q)) \\)"
    "\\( (\\lnot p\\lor \\lnot q) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (q\\supset (p\\supset \\lnot p)) \\)"
    "\\( ((q\\land \\lnot p)\\equiv q) \\)"
    "\\( (q\\equiv (p\\supset (q\\lor p))) \\)"
    "\\( (((q\\supset q)\\lor q)\\supset q) \\)"
    "\\( (q\\equiv (p\\supset (p\\land p))) \\)"
    "\\( ((q\\supset p)\\supset q) \\)"
    "\\( ((q\\land (q\\equiv q))\\lor q) \\)"
    "\\( ((p\\lor (q\\lor p))\\supset q) \\)"
    "\\( (((q\\lor q)\\equiv p)\\lor q) \\)"
    "\\( (p\\supset (p\\supset (q\\land q))) \\)"
    "\\( ((q\\equiv (p\\lor q))\\lor q) \\)"
    "\\( (((p\\lor q)\\lor p)\\equiv q) \\)"
    "\\( (((q\\equiv q)\\supset q)\\lor p) \\)"
    "\\( ((q\\lor (p\\lor q))\\lor q) \\)"
    "\\( ((q\\lor p)\\land (p\\supset p)) \\)"
    "\\( ((p\\lor q)\\lor (q\\land q)) \\)"
    "\\( (p\\lor (q\\lor p)) \\)"
    "\\( (((q\\lor p)\\land q)\\supset q) \\)"
    "\\( (p\\equiv ((q\\supset q)\\land p)) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\equiv q)) \\)"
    "\\( (((q\\equiv q)\\land p)\\supset p) \\)"
    "\\( (q\\equiv (q\\equiv (p\\supset p))) \\)"
  ]
  :wrong [
            ["\\( (q\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot ((p\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (q\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((p\\equiv (q\\land q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((p\\land p)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((q\\supset q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((q\\lor q)\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (q\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (\\lnot (q\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((q\\equiv (p\\lor q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (p\\equiv (q\\land (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (p\\equiv (q\\supset (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (\\lnot q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (q\\land (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (p\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (\\lnot q\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((p\\equiv q)\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((p\\equiv q)\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((q\\lor q)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((p\\lor p)\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (p\\land \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((q\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((q\\lor p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((\\lnot p\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((p\\land (p\\lor p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( ((q\\supset (q\\land q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
            ["\\( (((p\\lor q)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\supset q)\\equiv \\lnot p)\\), \\(((q\\supset p)\\supset (p\\equiv q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\land (p\\supset q)) \\)"
    "\\( \\lnot (p\\lor p) \\)"
    "\\( ((q\\equiv q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((p\\supset p)\\land p) \\)"
    "\\( (p\\equiv \\lnot (p\\supset p)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot p) \\)"
    "\\( \\lnot ((q\\equiv p)\\land q) \\)"
    "\\( (p\\supset (p\\supset \\lnot q)) \\)"
    "\\( (q\\supset (p\\supset \\lnot q)) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( (q\\lor (p\\supset (q\\lor q))) \\)"
    "\\( ((p\\supset (q\\land q))\\lor q) \\)"
    "\\( (((q\\equiv p)\\supset q)\\supset q) \\)"
    "\\( (p\\supset (p\\equiv (q\\land p))) \\)"
    "\\( ((q\\lor q)\\equiv (p\\lor q)) \\)"
    "\\( ((p\\supset p)\\supset (q\\equiv q)) \\)"
    "\\( ((q\\land q)\\lor (q\\supset q)) \\)"
    "\\( ((q\\equiv (p\\supset p))\\supset q) \\)"
    "\\( ((p\\land (p\\supset q))\\supset p) \\)"
    "\\( (((p\\land q)\\land p)\\supset q) \\)"
  ]
  :wrong [
            ["\\( ((p\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot (q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot ((q\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\equiv (p\\supset (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\land (q\\lor p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\supset (p\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\lor (p\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((p\\equiv (q\\lor q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\lor (p\\land (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot (p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\equiv \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot ((p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\land ((p\\lor q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((p\\equiv q)\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\lor (p\\lor p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\lor ((q\\equiv p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\lor (p\\land p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (((q\\lor q)\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\land \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot ((p\\lor q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\land (p\\equiv (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\equiv p)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\land (p\\supset (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\lor (p\\equiv (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((p\\land p)\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\equiv (p\\equiv (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( \\lnot ((p\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((p\\supset \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (\\lnot q\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\land ((q\\supset q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (((p\\equiv p)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\lor (q\\equiv (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (p\\land (p\\lor \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( ((q\\land p)\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
            ["\\( (q\\lor ((p\\equiv p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{\\lnot (p\\land (q\\equiv p))\\), \\(((p\\equiv (q\\land q))\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\equiv \\lnot q)\\land p) \\)"
    "\\( \\lnot (p\\supset (p\\land q)) \\)"
    "\\( (\\lnot (q\\land q)\\land p) \\)"
    "\\( (p\\land \\lnot (q\\lor q)) \\)"
    "\\( (p\\land (p\\equiv \\lnot q)) \\)"
    "\\( ((q\\lor q)\\supset \\lnot q) \\)"
    "\\( \\lnot (q\\land (q\\lor q)) \\)"
    "\\( \\lnot (q\\land (q\\equiv q)) \\)"
    "\\( (\\lnot q\\land (p\\supset p)) \\)"
    "\\( (\\lnot (q\\equiv q)\\equiv q) \\)"
    "\\( ((q\\lor q)\\equiv \\lnot p) \\)"
    "\\( (\\lnot p\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( \\lnot (q\\equiv (p\\lor p)) \\)"
    "\\( (q\\equiv \\lnot (p\\land p)) \\)"
    "\\( \\lnot (q\\land (q\\equiv p)) \\)"
    "\\( ((p\\land \\lnot q)\\equiv p) \\)"
    "\\( (\\lnot p\\equiv (p\\supset q)) \\)"
    "\\( ((q\\land p)\\supset \\lnot p) \\)"
    "\\( (p\\supset \\lnot (p\\land q)) \\)"
    "\\( ((p\\lor p)\\equiv (p\\equiv p)) \\)"
    "\\( (p\\land (p\\equiv (p\\lor q))) \\)"
    "\\( (p\\equiv (p\\lor (p\\equiv p))) \\)"
    "\\( (p\\equiv (q\\supset (p\\supset q))) \\)"
    "\\( ((p\\lor p)\\lor (p\\lor p)) \\)"
    "\\( (p\\lor (q\\supset (q\\supset p))) \\)"
    "\\( ((q\\equiv p)\\lor (p\\lor p)) \\)"
    "\\( (q\\supset (p\\equiv (p\\lor q))) \\)"
    "\\( (((q\\equiv p)\\supset q)\\supset p) \\)"
    "\\( (p\\lor (p\\equiv (q\\land q))) \\)"
    "\\( ((q\\supset p)\\supset p) \\)"
    "\\( (((q\\land q)\\lor p)\\lor p) \\)"
    "\\( ((p\\supset (p\\equiv q))\\supset q) \\)"
    "\\( ((q\\equiv p)\\supset (q\\lor p)) \\)"
    "\\( ((p\\land p)\\lor (q\\land q)) \\)"
    "\\( (q\\equiv (p\\equiv (q\\equiv p))) \\)"
    "\\( (q\\equiv (q\\land (q\\lor q))) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\equiv p)) \\)"
    "\\( (q\\supset (q\\equiv (q\\land q))) \\)"
    "\\( ((p\\land q)\\supset (p\\lor p)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot p\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((q\\lor p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (p\\equiv (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (((p\\lor q)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\lor (p\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\lor \\lnot q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (q\\lor (p\\supset (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( \\lnot ((p\\land q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( \\lnot (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (q\\equiv (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (p\\land (\\lnot q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (((q\\lor p)\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\equiv (p\\lor p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (p\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((\\lnot p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (q\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((q\\equiv \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\equiv q)\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\lor p)\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (((p\\lor q)\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (p\\supset (q\\equiv (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( \\lnot (q\\supset (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((\\lnot p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((q\\equiv p)\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( ((q\\equiv p)\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (q\\equiv (p\\lor (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
            ["\\( (p\\supset ((p\\supset q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\supset (\\lnot q\\equiv p))\\), \\((q\\supset (q\\supset (p\\equiv q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv (p\\equiv \\lnot q)) \\)"
    "\\( \\lnot ((p\\equiv p)\\supset q) \\)"
    "\\( (\\lnot q\\land (q\\equiv q)) \\)"
    "\\( \\lnot ((p\\supset q)\\land q) \\)"
    "\\( \\lnot ((q\\equiv p)\\equiv p) \\)"
    "\\( (\\lnot q\\lor \\lnot p) \\)"
    "\\( \\lnot (q\\land (p\\lor p)) \\)"
    "\\( (p\\supset \\lnot (q\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\land q)\\land p) \\)"
    "\\( (p\\equiv (\\lnot p\\supset q)) \\)"
    "\\( ((p\\lor p)\\equiv (p\\lor q)) \\)"
    "\\( (q\\supset (p\\land (q\\equiv q))) \\)"
    "\\( (((p\\lor q)\\lor p)\\supset p) \\)"
    "\\( ((q\\supset p)\\equiv (p\\equiv p)) \\)"
    "\\( (p\\supset ((q\\lor p)\\land p)) \\)"
    "\\( ((p\\equiv p)\\lor q) \\)"
    "\\( ((q\\lor p)\\lor (p\\supset q)) \\)"
    "\\( ((p\\equiv (p\\lor p))\\lor p) \\)"
    "\\( (q\\supset ((q\\land q)\\land q)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (\\lnot (p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\equiv (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\equiv \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((q\\supset (q\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (q\\lor (q\\equiv (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (\\lnot p\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (((q\\lor q)\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((q\\supset (q\\equiv p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (p\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot ((q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (\\lnot p\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\land p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\land q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\supset p)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((q\\equiv (q\\lor q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\equiv (p\\land (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\equiv (p\\supset (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\lor (q\\land (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (\\lnot (q\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot ((q\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\equiv \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\land \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\land (p\\supset (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (((p\\equiv p)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((q\\lor (q\\supset q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\supset ((p\\supset p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot \\lnot (p\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\land p)\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\land (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (p\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((\\lnot q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\land (p\\supset (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\lor q)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (((q\\land p)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (q\\lor (q\\lor (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( (p\\land ((q\\equiv q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
            ["\\( ((p\\equiv (q\\land q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\lor q)\\supset \\lnot p)\\), \\((\\lnot (q\\lor p)\\supset q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (\\lnot p\\equiv (q\\land q)) \\)"
    "\\( (\\lnot q\\equiv p) \\)"
    "\\( (\\lnot (p\\land p)\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv \\lnot p) \\)"
    "\\( (q\\equiv \\lnot p) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( (q\\supset \\lnot (q\\land p)) \\)"
    "\\( (p\\equiv (\\lnot q\\land p)) \\)"
    "\\( ((p\\supset q)\\equiv \\lnot p) \\)"
    "\\( (q\\supset \\lnot (q\\supset p)) \\)"
    "\\( (q\\lor ((q\\supset p)\\equiv p)) \\)"
    "\\( (q\\equiv (p\\supset (q\\land p))) \\)"
    "\\( (((p\\equiv p)\\supset p)\\lor q) \\)"
    "\\( (p\\lor ((p\\supset p)\\supset q)) \\)"
    "\\( (((p\\supset q)\\equiv q)\\lor p) \\)"
    "\\( (((p\\lor q)\\land q)\\equiv q) \\)"
    "\\( ((p\\supset p)\\lor (q\\equiv q)) \\)"
    "\\( (((p\\equiv p)\\land q)\\supset q) \\)"
    "\\( ((p\\lor (q\\equiv q))\\lor p) \\)"
    "\\( (q\\equiv q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((q\\equiv (p\\land q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\equiv ((p\\equiv p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\supset q)\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\supset ((q\\land p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (((q\\land p)\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\lor \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot ((p\\land p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (((q\\land q)\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((q\\lor p)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (((p\\supset q)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\supset ((p\\lor q)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (((p\\equiv q)\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\supset \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((\\lnot q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\land (q\\supset q))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (q\\equiv (p\\land (p\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (q\\land (q\\lor (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (q\\equiv (p\\lor (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (p\\equiv (p\\lor (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (\\lnot (p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (\\lnot q\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\lor q)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((q\\land (q\\equiv q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((\\lnot q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((p\\land (q\\lor p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( (((q\\supset q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
            ["\\( ((q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(\\lnot (p\\supset q)\\equiv p)\\), \\(((p\\land p)\\supset (p\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\supset (\\lnot p\\equiv q)) \\)"
    "\\( (p\\supset \\lnot q) \\)"
    "\\( \\lnot ((p\\land p)\\land q) \\)"
    "\\( (q\\supset (\\lnot p\\land q)) \\)"
    "\\( (p\\supset \\lnot (p\\equiv q)) \\)"
    "\\( ((p\\equiv q)\\supset (q\\equiv p)) \\)"
    "\\( ((q\\supset (q\\lor q))\\lor p) \\)"
    "\\( ((p\\equiv q)\\supset (p\\equiv q)) \\)"
    "\\( (p\\supset ((p\\equiv q)\\equiv q)) \\)"
    "\\( (q\\supset ((p\\lor q)\\lor p)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (\\lnot (q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\equiv (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\land (p\\equiv (p\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\supset p)\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((\\lnot q\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\supset ((p\\land q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\lor (p\\land (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\supset ((p\\lor q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((p\\lor q)\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\lor (p\\equiv q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((q\\equiv p)\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\lor ((q\\lor p)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((q\\equiv p)\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((q\\lor q)\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\lor ((q\\lor p)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\land (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\equiv (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\land (q\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((p\\land q)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((p\\lor q)\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((p\\supset q)\\supset p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\supset p)\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\supset (q\\equiv (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\lor \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\supset \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\equiv (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (\\lnot (q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((q\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\equiv (p\\equiv p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( ((p\\land p)\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\lor ((p\\equiv p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( \\lnot (p\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (p\\land (p\\equiv (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (q\\supset ((q\\land q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
            ["\\( (((p\\lor p)\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1110 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv (q\\equiv (p\\lor q)))\\), \\(((p\\supset p)\\equiv (q\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\land q)\\equiv q)\\land q) \\)"
    "\\( ((q\\supset q)\\supset (p\\land q)) \\)"
    "\\( (q\\land ((q\\lor p)\\equiv p)) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\lor q)) \\)"
    "\\( ((q\\lor q)\\land (p\\land p)) \\)"
    "\\( (((q\\equiv q)\\supset q)\\equiv p) \\)"
    "\\( ((q\\equiv p)\\equiv (q\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\supset p)\\supset q)) \\)"
    "\\( ((q\\supset p)\\land (q\\equiv p)) \\)"
    "\\( ((p\\land (q\\lor p))\\equiv q) \\)"
    "\\( ((p\\equiv p)\\supset (q\\land q)) \\)"
    "\\( (((q\\lor q)\\lor p)\\land q) \\)"
    "\\( (q\\land (p\\supset (q\\land p))) \\)"
    "\\( ((p\\supset (q\\supset q))\\equiv q) \\)"
    "\\( (((p\\land p)\\equiv p)\\equiv q) \\)"
    "\\( (p\\supset ((p\\supset q)\\lor q)) \\)"
    "\\( (p\\equiv (q\\equiv (q\\supset p))) \\)"
    "\\( (((p\\supset q)\\lor q)\\lor q) \\)"
    "\\( ((p\\land (q\\equiv q))\\supset q) \\)"
    "\\( (q\\lor ((p\\land p)\\supset q)) \\)"
    "\\( (p\\equiv (p\\supset (q\\supset q))) \\)"
    "\\( (p\\land ((p\\equiv p)\\equiv p)) \\)"
    "\\( ((p\\equiv p)\\land (p\\land p)) \\)"
    "\\( ((p\\equiv p)\\supset (p\\land p)) \\)"
    "\\( (((p\\supset p)\\lor p)\\land p) \\)"
    "\\( ((q\\equiv p)\\equiv (p\\supset q)) \\)"
    "\\( ((q\\land p)\\lor (q\\supset p)) \\)"
    "\\( (\\lnot q\\lor (p\\land q)) \\)"
    "\\( ((\\lnot q\\supset p)\\equiv p) \\)"
    "\\( (q\\supset ((p\\lor p)\\land q)) \\)"
    "\\( (q\\equiv (\\lnot p\\lor q)) \\)"
    "\\( (((q\\supset p)\\supset p)\\lor p) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\lor p)) \\)"
    "\\( (p\\lor (q\\equiv (q\\supset q))) \\)"
    "\\( (q\\lor (p\\land \\lnot q)) \\)"
    "\\( (q\\supset ((q\\lor q)\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\equiv q)) \\)"
    "\\( (((q\\equiv p)\\land q)\\supset q) \\)"
    "\\( ((p\\supset (p\\supset p))\\lor p) \\)"
    "\\( ((p\\land (p\\equiv q))\\supset q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (q\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((q\\supset p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot ((q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((q\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((q\\equiv p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (q\\land \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (\\lnot p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (q\\land (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (p\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot ((q\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (\\lnot (q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (p\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((\\lnot q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (q\\land (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (q\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((p\\equiv \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (\\lnot p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((p\\land p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot (p\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (p\\supset \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (\\lnot q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (\\lnot q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
            ["\\( (q\\supset (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1001 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\land ((p\\land q)\\land p))\\), \\(((\\lnot p\\lor q)\\land q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\lor q)\\supset p)\\equiv q) \\)"
    "\\( ((p\\lor (p\\lor p))\\land q) \\)"
    "\\( (q\\land ((p\\supset q)\\equiv p)) \\)"
    "\\( ((q\\supset (q\\supset p))\\land q) \\)"
    "\\( ((q\\equiv (p\\lor q))\\equiv p) \\)"
    "\\( ((p\\equiv p)\\supset (p\\equiv q)) \\)"
    "\\( (p\\equiv ((p\\supset p)\\supset q)) \\)"
    "\\( ((q\\equiv q)\\supset (q\\equiv p)) \\)"
    "\\( (p\\equiv (q\\land (q\\supset q))) \\)"
    "\\( ((p\\equiv q)\\land (q\\supset q)) \\)"
    "\\( (((p\\supset q)\\lor p)\\land q) \\)"
    "\\( (q\\land ((p\\supset p)\\supset q)) \\)"
    "\\( (q\\land ((p\\equiv p)\\equiv q)) \\)"
    "\\( (q\\equiv (p\\lor (p\\supset p))) \\)"
    "\\( (q\\equiv (p\\equiv p)) \\)"
    "\\( (((p\\supset q)\\supset q)\\supset q) \\)"
    "\\( (q\\equiv ((q\\supset p)\\supset p)) \\)"
    "\\( ((p\\supset q)\\lor (q\\lor q)) \\)"
    "\\( ((q\\lor p)\\supset (q\\land q)) \\)"
    "\\( (p\\supset ((p\\equiv q)\\lor q)) \\)"
    "\\( (p\\lor \\lnot (q\\equiv q)) \\)"
    "\\( (p\\land ((p\\lor p)\\lor p)) \\)"
    "\\( (p\\land (p\\lor (p\\supset p))) \\)"
    "\\( ((p\\land (q\\equiv q))\\land p) \\)"
    "\\( ((p\\land (p\\lor p))\\lor p) \\)"
    "\\( (q\\supset ((q\\supset q)\\land p)) \\)"
    "\\( ((q\\supset p)\\land (q\\supset p)) \\)"
    "\\( (\\lnot p\\supset (q\\equiv p)) \\)"
    "\\( (q\\supset (q\\supset (p\\land p))) \\)"
    "\\( (((q\\lor q)\\supset p)\\lor p) \\)"
    "\\( (p\\lor (q\\land (p\\lor q))) \\)"
    "\\( ((q\\land (p\\supset q))\\lor p) \\)"
    "\\( (q\\equiv (p\\supset (q\\land q))) \\)"
    "\\( ((q\\supset \\lnot q)\\supset p) \\)"
    "\\( (p\\equiv (q\\equiv (p\\land q))) \\)"
    "\\( (q\\supset (q\\lor (p\\land q))) \\)"
    "\\( ((p\\land (p\\lor p))\\equiv p) \\)"
    "\\( (((q\\land p)\\land q)\\supset p) \\)"
    "\\( (q\\lor (p\\supset (p\\equiv p))) \\)"
    "\\( (q\\supset (p\\supset (q\\land p))) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((q\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (p\\equiv (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (p\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (q\\supset (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot (p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( ((q\\equiv \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot q\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((p\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (\\lnot (q\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( ((p\\supset q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( ((\\lnot p\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( (p\\supset (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( ((p\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (q\\land (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
            ["\\( \\lnot ((p\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\land (q\\land (q\\equiv p)))\\), \\((((q\\supset q)\\land p)\\supset q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\lor q)\\equiv p)\\land q) \\)"
    "\\( \\lnot \\lnot (q\\land p) \\)"
    "\\( ((p\\equiv q)\\land (q\\land q)) \\)"
    "\\( ((p\\lor (p\\land q))\\land q) \\)"
    "\\( ((p\\land q)\\land (p\\equiv p)) \\)"
    "\\( (((q\\land q)\\lor q)\\equiv p) \\)"
    "\\( ((p\\equiv p)\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)"
    "\\( ((q\\equiv p)\\land (p\\supset p)) \\)"
    "\\( ((p\\lor q)\\supset (p\\equiv q)) \\)"
    "\\( (((p\\lor p)\\lor q)\\land q) \\)"
    "\\( (q\\land ((q\\land p)\\equiv p)) \\)"
    "\\( ((p\\equiv (q\\supset p))\\land q) \\)"
    "\\( ((p\\lor (q\\equiv q))\\supset q) \\)"
    "\\( (((p\\equiv p)\\supset q)\\lor q) \\)"
    "\\( ((q\\supset q)\\equiv (p\\supset q)) \\)"
    "\\( (p\\supset (q\\land p)) \\)"
    "\\( (p\\supset (q\\land (q\\supset q))) \\)"
    "\\( (((q\\lor p)\\lor p)\\supset q) \\)"
    "\\( (q\\lor (q\\equiv (p\\land p))) \\)"
    "\\( ((q\\supset (q\\lor q))\\supset p) \\)"
    "\\( (p\\lor ((q\\supset q)\\equiv p)) \\)"
    "\\( (p\\land ((p\\lor q)\\equiv p)) \\)"
    "\\( (p\\lor ((q\\equiv p)\\land p)) \\)"
    "\\( (((p\\lor q)\\land p)\\lor p) \\)"
    "\\( (((q\\lor q)\\lor q)\\supset p) \\)"
    "\\( ((p\\lor q)\\supset p) \\)"
    "\\( (q\\supset (p\\lor (p\\land p))) \\)"
    "\\( (q\\equiv ((q\\supset p)\\land q)) \\)"
    "\\( (((p\\supset q)\\equiv q)\\supset p) \\)"
    "\\( (((q\\equiv q)\\supset q)\\lor p) \\)"
    "\\( ((q\\lor q)\\lor p) \\)"
    "\\( (((p\\lor p)\\supset q)\\equiv q) \\)"
    "\\( (p\\equiv ((q\\lor p)\\supset p)) \\)"
    "\\( (((p\\supset p)\\land p)\\lor q) \\)"
    "\\( ((q\\land p)\\supset (q\\equiv p)) \\)"
    "\\( (q\\supset (q\\land (q\\lor p))) \\)"
    "\\( ((p\\equiv (p\\land q))\\lor p) \\)"
    "\\( ((q\\equiv q)\\equiv (q\\supset q)) \\)"
    "\\( (q\\equiv ((q\\equiv q)\\land q)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (\\lnot q\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot ((q\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (\\lnot (p\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (q\\supset \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((q\\equiv p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (\\lnot (q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (q\\land (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((q\\equiv q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (p\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (q\\equiv \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (\\lnot (q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (p\\supset (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (p\\land (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot ((p\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((q\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot ((q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((q\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (\\lnot (p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\equiv \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot (\\lnot q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( (p\\equiv (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\equiv p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
            ["\\( \\lnot (q\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv q)\\land (q\\land p))\\), \\(((p\\equiv p)\\supset (p\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\equiv p)\\equiv q)\\land p) \\)"
    "\\( (p\\land ((p\\land q)\\land p)) \\)"
    "\\( (p\\land ((p\\supset q)\\land q)) \\)"
    "\\( (q\\equiv (p\\lor (q\\supset p))) \\)"
    "\\( ((q\\equiv p)\\equiv (q\\lor p)) \\)"
    "\\( (((p\\equiv p)\\supset p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\land (p\\supset p))) \\)"
    "\\( (((q\\supset q)\\land q)\\equiv p) \\)"
    "\\( ((p\\equiv q)\\land (q\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\supset q)) \\)"
    "\\( (q\\land (p\\supset (p\\equiv q))) \\)"
    "\\( ((p\\land (q\\equiv p))\\lor q) \\)"
    "\\( ((q\\land (q\\equiv q))\\land q) \\)"
    "\\( (q\\land (q\\lor p)) \\)"
    "\\( (((q\\equiv q)\\lor q)\\supset q) \\)"
    "\\( (p\\supset ((p\\supset p)\\supset q)) \\)"
    "\\( ((q\\equiv (p\\supset q))\\equiv q) \\)"
    "\\( ((p\\lor (q\\land q))\\equiv q) \\)"
    "\\( (q\\lor (q\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\equiv (p\\supset q)) \\)"
    "\\( ((p\\lor \\lnot p)\\land p) \\)"
    "\\( (((q\\lor q)\\equiv q)\\equiv p) \\)"
    "\\( (p\\land ((q\\equiv q)\\supset p)) \\)"
    "\\( (p\\lor ((q\\equiv q)\\equiv p)) \\)"
    "\\( ((p\\land (p\\supset p))\\lor p) \\)"
    "\\( (((q\\supset q)\\equiv q)\\supset p) \\)"
    "\\( (q\\supset ((q\\supset q)\\equiv p)) \\)"
    "\\( (q\\supset (p\\land q)) \\)"
    "\\( (q\\supset ((q\\supset p)\\equiv q)) \\)"
    "\\( (\\lnot q\\lor (p\\land p)) \\)"
    "\\( (q\\lor (\\lnot p\\supset q)) \\)"
    "\\( (q\\lor (p\\lor (q\\lor p))) \\)"
    "\\( ((\\lnot p\\lor q)\\supset q) \\)"
    "\\( (q\\lor (\\lnot p\\equiv q)) \\)"
    "\\( (p\\lor ((q\\supset p)\\supset p)) \\)"
    "\\( ((p\\supset p)\\lor \\lnot p) \\)"
    "\\( (p\\supset ((p\\supset q)\\equiv q)) \\)"
    "\\( ((p\\equiv p)\\supset (p\\equiv p)) \\)"
    "\\( (((q\\lor q)\\equiv q)\\lor p) \\)"
    "\\( ((p\\equiv q)\\equiv (q\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( (p\\land (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot p\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (p\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (q\\land (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\supset (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\supset \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot (q\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\land \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (p\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\land (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\supset \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( ((q\\supset q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\supset (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( ((\\lnot q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (q\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot ((q\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (q\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (p\\equiv (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
            ["\\( (q\\supset \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{(((p\\equiv p)\\supset p)\\land q)\\), \\((p\\lor ((q\\supset p)\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\equiv (q\\supset p))\\land p) \\)"
    "\\( ((p\\land q)\\land (p\\supset q)) \\)"
    "\\( ((q\\equiv q)\\land (p\\land q)) \\)"
    "\\( ((q\\equiv p)\\land q) \\)"
    "\\( (q\\land (q\\supset (q\\land p))) \\)"
    "\\( (p\\equiv (q\\land (q\\lor p))) \\)"
    "\\( ((p\\equiv (p\\equiv p))\\equiv q) \\)"
    "\\( ((p\\equiv p)\\equiv (q\\equiv p)) \\)"
    "\\( ((q\\supset p)\\land (q\\equiv p)) \\)"
    "\\( (((q\\land q)\\lor q)\\equiv p) \\)"
    "\\( (((p\\land p)\\equiv p)\\land q) \\)"
    "\\( (q\\lor ((q\\supset q)\\land q)) \\)"
    "\\( (q\\lor ((q\\equiv p)\\equiv p)) \\)"
    "\\( (((q\\lor q)\\supset q)\\land q) \\)"
    "\\( (q\\equiv (\\lnot p\\lor p)) \\)"
    "\\( (p\\supset ((q\\land p)\\equiv p)) \\)"
    "\\( ((p\\land (q\\supset p))\\supset q) \\)"
    "\\( ((p\\land (q\\lor q))\\equiv p) \\)"
    "\\( ((q\\land p)\\equiv (p\\land p)) \\)"
    "\\( (p\\supset (q\\equiv (p\\lor p))) \\)"
    "\\( (p\\equiv ((p\\supset q)\\lor p)) \\)"
    "\\( (((q\\land p)\\equiv q)\\land p) \\)"
    "\\( (((p\\supset q)\\supset p)\\land p) \\)"
    "\\( (p\\lor (q\\land (q\\equiv p))) \\)"
    "\\( (p\\land (p\\land (q\\equiv q))) \\)"
    "\\( (p\\equiv (p\\lor (q\\lor p))) \\)"
    "\\( ((p\\lor (p\\lor q))\\supset p) \\)"
    "\\( ((p\\lor p)\\lor (q\\equiv p)) \\)"
    "\\( ((q\\supset (q\\supset p))\\lor p) \\)"
    "\\( (q\\supset (q\\land (p\\equiv q))) \\)"
    "\\( (p\\lor ((p\\equiv q)\\supset p)) \\)"
    "\\( ((p\\lor (q\\equiv p))\\supset p) \\)"
    "\\( (((q\\equiv p)\\lor p)\\equiv p) \\)"
    "\\( (p\\lor ((q\\lor q)\\lor p)) \\)"
    "\\( (((p\\land p)\\lor q)\\lor p) \\)"
    "\\( (p\\equiv ((q\\supset q)\\equiv p)) \\)"
    "\\( (\\lnot p\\supset (p\\equiv p)) \\)"
    "\\( ((p\\land q)\\supset q) \\)"
    "\\( (p\\supset (p\\lor (q\\land q))) \\)"
    "\\( (p\\equiv (p\\land (p\\equiv p))) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (\\lnot (p\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot ((p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\supset (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (\\lnot p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( ((q\\equiv p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\land (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\equiv (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( ((p\\land q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( \\lnot ((q\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (p\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( ((q\\equiv p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
            ["\\( ((q\\land q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\land ((q\\land p)\\land q))\\), \\((((p\\lor q)\\supset p)\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land (q\\land (p\\equiv q))) \\)"
    "\\( (((p\\equiv q)\\lor q)\\land p) \\)"
    "\\( (q\\equiv (q\\supset p)) \\)"
    "\\( (p\\equiv (p\\supset (q\\land q))) \\)"
    "\\( (p\\equiv (p\\supset (p\\equiv q))) \\)"
    "\\( ((q\\land (p\\equiv p))\\equiv p) \\)"
    "\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)"
    "\\( (q\\equiv (p\\lor (p\\land q))) \\)"
    "\\( (q\\equiv ((q\\supset p)\\land p)) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\equiv q)) \\)"
    "\\( (q\\equiv (q\\supset q)) \\)"
    "\\( ((\\lnot q\\supset q)\\land q) \\)"
    "\\( (q\\equiv (p\\supset (p\\lor q))) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\land q) \\)"
    "\\( (q\\land ((p\\land q)\\supset q)) \\)"
    "\\( ((p\\land (q\\lor p))\\supset q) \\)"
    "\\( ((q\\supset p)\\supset (p\\equiv q)) \\)"
    "\\( (p\\supset (p\\equiv (p\\supset q))) \\)"
    "\\( ((p\\supset q)\\land (p\\supset q)) \\)"
    "\\( ((p\\land q)\\equiv p) \\)"
    "\\( ((p\\land q)\\lor (p\\lor p)) \\)"
    "\\( ((p\\equiv p)\\equiv (p\\lor p)) \\)"
    "\\( (((p\\equiv p)\\supset p)\\lor p) \\)"
    "\\( (p\\land (p\\supset (p\\lor q))) \\)"
    "\\( ((p\\equiv q)\\equiv (q\\land q)) \\)"
    "\\( (q\\supset ((p\\equiv q)\\equiv q)) \\)"
    "\\( (((p\\supset q)\\land q)\\supset p) \\)"
    "\\( (q\\supset (p\\land (p\\lor q))) \\)"
    "\\( ((q\\supset q)\\equiv (q\\supset p)) \\)"
    "\\( ((q\\lor p)\\equiv (p\\lor p)) \\)"
    "\\( ((p\\lor q)\\lor p) \\)"
    "\\( ((q\\lor p)\\equiv (p\\supset p)) \\)"
    "\\( (((p\\lor q)\\lor p)\\lor p) \\)"
    "\\( (p\\lor (p\\lor (q\\lor q))) \\)"
    "\\( (q\\lor (\\lnot q\\equiv p)) \\)"
    "\\( ((p\\land (p\\supset p))\\equiv p) \\)"
    "\\( (q\\lor (q\\supset \\lnot q)) \\)"
    "\\( (((q\\supset p)\\lor p)\\lor q) \\)"
    "\\( (p\\lor (p\\equiv p)) \\)"
    "\\( (p\\supset ((p\\supset p)\\lor p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((p\\equiv q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((q\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (q\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (q\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((q\\land q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((q\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\lor (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (q\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((p\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((q\\equiv \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (p\\supset (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((q\\lor p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot ((q\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (q\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( ((q\\land \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (\\lnot (q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (q\\supset (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
            ["\\( (p\\supset (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\equiv (q\\land q))\\land q)\\), \\(((q\\supset p)\\lor (p\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land ((q\\land p)\\land p)) \\)"
    "\\( ((q\\land (q\\equiv p))\\land p) \\)"
    "\\( (((q\\equiv q)\\equiv q)\\land p) \\)"
    "\\( (((q\\lor p)\\equiv q)\\land p) \\)"
    "\\( (((q\\supset p)\\land q)\\land q) \\)"
    "\\( ((q\\lor p)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\equiv (p\\equiv p))\\equiv q) \\)"
    "\\( ((q\\equiv p)\\land (p\\supset p)) \\)"
    "\\( (p\\equiv ((p\\equiv p)\\supset q)) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\equiv q) \\)"
    "\\( (((q\\supset p)\\land q)\\lor q) \\)"
    "\\( (q\\land ((q\\supset q)\\lor q)) \\)"
    "\\( ((p\\equiv p)\\land (q\\lor q)) \\)"
    "\\( (q\\land (q\\equiv (p\\supset p))) \\)"
    "\\( ((p\\lor p)\\equiv (q\\equiv p)) \\)"
    "\\( (q\\lor (p\\supset q)) \\)"
    "\\( (((q\\supset q)\\equiv p)\\supset q) \\)"
    "\\( ((p\\lor (q\\land q))\\equiv q) \\)"
    "\\( (p\\supset ((p\\lor q)\\supset q)) \\)"
    "\\( (p\\equiv ((q\\land p)\\land p)) \\)"
    "\\( (((p\\land q)\\supset q)\\supset p) \\)"
    "\\( (((p\\lor p)\\lor p)\\lor p) \\)"
    "\\( (p\\lor ((q\\equiv q)\\equiv p)) \\)"
    "\\( (((p\\lor q)\\land p)\\land p) \\)"
    "\\( (p\\equiv (p\\supset (q\\supset p))) \\)"
    "\\( (p\\lor (p\\lor (q\\equiv p))) \\)"
    "\\( (\\lnot q\\lor p) \\)"
    "\\( (((q\\supset p)\\equiv p)\\equiv p) \\)"
    "\\( (p\\lor (p\\equiv (q\\lor p))) \\)"
    "\\( ((q\\land (p\\lor p))\\equiv q) \\)"
    "\\( (q\\lor (p\\equiv (p\\equiv p))) \\)"
    "\\( (q\\lor (p\\land (p\\lor p))) \\)"
    "\\( (p\\lor (q\\lor (p\\land p))) \\)"
    "\\( (p\\lor (q\\land (p\\equiv p))) \\)"
    "\\( ((q\\equiv (q\\equiv q))\\lor p) \\)"
    "\\( (((p\\supset q)\\supset p)\\supset p) \\)"
    "\\( (((p\\supset p)\\lor q)\\lor p) \\)"
    "\\( (q\\supset ((p\\lor q)\\supset q)) \\)"
    "\\( ((q\\land \\lnot q)\\supset p) \\)"
    "\\( (q\\supset (p\\lor (q\\lor p))) \\)"
  ]
  :wrong [
            ["\\( ((p\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((p\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (p\\land (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((\\lnot q\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot (p\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((q\\land \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((\\lnot q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((p\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (p\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot (q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot (q\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((p\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot p\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((\\lnot q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((p\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot (p\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0001 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv (q\\lor (q\\land q)))\\), \\(((p\\lor (p\\supset q))\\equiv q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv (q\\supset (q\\supset p))) \\)"
    "\\( (q\\land ((p\\land q)\\lor p)) \\)"
    "\\( (q\\land ((p\\lor q)\\land p)) \\)"
    "\\( (q\\land ((q\\lor q)\\supset p)) \\)"
    "\\( (q\\land (q\\land (q\\equiv p))) \\)"
    "\\( (q\\equiv (p\\lor p)) \\)"
    "\\( ((p\\land (p\\lor p))\\equiv q) \\)"
    "\\( (p\\equiv ((q\\land p)\\lor q)) \\)"
    "\\( ((p\\equiv p)\\equiv (q\\equiv p)) \\)"
    "\\( (p\\equiv (q\\lor (p\\land q))) \\)"
    "\\( (q\\land (q\\lor (q\\lor q))) \\)"
    "\\( ((q\\land (p\\supset q))\\land q) \\)"
    "\\( ((p\\equiv p)\\equiv q) \\)"
    "\\( ((q\\land q)\\equiv (p\\supset p)) \\)"
    "\\( ((p\\supset (p\\lor q))\\land q) \\)"
    "\\( (p\\supset ((q\\land p)\\equiv p)) \\)"
    "\\( ((p\\land (q\\lor q))\\equiv p) \\)"
    "\\( (p\\equiv ((p\\supset q)\\equiv p)) \\)"
    "\\( (p\\supset (q\\land (p\\land q))) \\)"
    "\\( ((p\\supset (p\\equiv q))\\lor q) \\)"
    "\\( (q\\equiv (q\\equiv (p\\land p))) \\)"
    "\\( ((q\\lor p)\\land (p\\land p)) \\)"
    "\\( ((p\\lor p)\\lor (q\\land p)) \\)"
    "\\( (p\\equiv (q\\supset (p\\lor q))) \\)"
    "\\( (p\\land (q\\lor p)) \\)"
    "\\( (q\\supset ((p\\land q)\\lor p)) \\)"
    "\\( (q\\equiv ((q\\land q)\\land p)) \\)"
    "\\( ((q\\land q)\\supset (q\\equiv p)) \\)"
    "\\( ((q\\supset q)\\land (q\\supset p)) \\)"
    "\\( (((q\\supset p)\\land q)\\equiv q) \\)"
    "\\( ((p\\lor q)\\lor p) \\)"
    "\\( (q\\equiv (q\\lor (p\\equiv q))) \\)"
    "\\( (q\\lor \\lnot (p\\equiv q)) \\)"
    "\\( (((p\\supset p)\\land q)\\lor p) \\)"
    "\\( (((p\\supset p)\\land q)\\lor p) \\)"
    "\\( (p\\supset ((q\\equiv p)\\supset p)) \\)"
    "\\( ((p\\equiv p)\\equiv (q\\equiv q)) \\)"
    "\\( (q\\supset (q\\supset (p\\lor q))) \\)"
    "\\( (q\\equiv (q\\land (q\\lor q))) \\)"
    "\\( (((q\\equiv q)\\lor p)\\lor q) \\)"
  ]
  :wrong [
            ["\\( ((p\\land q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot p\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( ((q\\supset q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (q\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( ((p\\supset p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot ((q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (p\\land \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot ((q\\equiv p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (q\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot ((p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (p\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (q\\supset \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (q\\supset (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( ((p\\land q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( ((\\lnot q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot (q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (\\lnot q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot (q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot (p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( ((p\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot (q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( \\lnot ((p\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot (p\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (q\\equiv \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
            ["\\( (p\\supset \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0101 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\lor (q\\lor q))\\equiv p)\\), \\(((p\\lor p)\\supset (q\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv ((p\\lor q)\\land q)) \\)"
    "\\( ((q\\supset q)\\land (p\\equiv q)) \\)"
    "\\( (q\\equiv ((p\\supset q)\\supset p)) \\)"
    "\\( ((q\\land (q\\lor p))\\equiv p) \\)"
    "\\( ((q\\supset p)\\land (p\\equiv q)) \\)"
    "\\( (p\\supset ((p\\land p)\\supset q)) \\)"
    "\\( ((p\\land (p\\supset p))\\supset q) \\)"
    "\\( (q\\equiv (q\\lor (p\\land p))) \\)"
    "\\( (q\\equiv ((q\\equiv p)\\supset q)) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\supset q) \\)"
    "\\( ((p\\supset p)\\supset (q\\supset p)) \\)"
    "\\( ((q\\supset (q\\supset p))\\lor p) \\)"
    "\\( ((p\\lor (q\\lor p))\\equiv p) \\)"
    "\\( (p\\equiv (q\\lor p)) \\)"
    "\\( ((q\\supset p)\\lor p) \\)"
    "\\( (p\\lor (p\\lor (p\\supset q))) \\)"
    "\\( ((q\\supset p)\\lor (p\\supset p)) \\)"
    "\\( (q\\lor ((p\\land q)\\supset q)) \\)"
    "\\( (p\\supset ((q\\equiv p)\\supset p)) \\)"
    "\\( (p\\equiv ((q\\supset q)\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot ((p\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((p\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((\\lnot q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\land (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\supset p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\lor q)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\equiv (q\\lor \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\land ((p\\supset q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\equiv ((q\\lor p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot q\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot (q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot (p\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((p\\lor q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot (q\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot ((q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\equiv (p\\land q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\lor (q\\equiv q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((p\\supset p)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (((q\\lor p)\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\land \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((\\lnot q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot ((p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot (p\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\land ((p\\supset p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot (q\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\equiv q)\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\equiv (p\\equiv (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot ((q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot ((q\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\land (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\lor p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\supset (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((p\\land \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (((q\\supset q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (q\\land ((p\\supset q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( (p\\lor (p\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
            ["\\( ((q\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv (p\\lor (p\\land p)))\\), \\(((q\\supset (q\\land p))\\land p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\lor p)\\lor p)\\land q) \\)"
    "\\( ((p\\lor q)\\equiv (q\\equiv p)) \\)"
    "\\( ((q\\supset q)\\equiv (q\\land p)) \\)"
    "\\( (p\\land (q\\equiv (q\\supset p))) \\)"
    "\\( (p\\land ((q\\land p)\\land q)) \\)"
    "\\( (p\\equiv (p\\equiv (p\\equiv q))) \\)"
    "\\( (p\\equiv (q\\land (p\\supset p))) \\)"
    "\\( (p\\equiv (q\\equiv (p\\equiv p))) \\)"
    "\\( (p\\equiv (q\\land q)) \\)"
    "\\( (((p\\land p)\\land p)\\equiv q) \\)"
    "\\( ((p\\equiv p)\\supset q) \\)"
    "\\( ((q\\land q)\\lor (q\\lor q)) \\)"
    "\\( ((p\\equiv p)\\equiv q) \\)"
    "\\( (q\\land ((q\\land q)\\supset q)) \\)"
    "\\( (q\\land ((q\\supset q)\\lor p)) \\)"
    "\\( ((p\\land q)\\equiv p) \\)"
    "\\( (p\\equiv ((q\\equiv p)\\land q)) \\)"
    "\\( ((p\\supset q)\\lor (q\\land p)) \\)"
    "\\( ((q\\lor q)\\lor (q\\equiv p)) \\)"
    "\\( (p\\supset (p\\equiv (q\\equiv p))) \\)"
    "\\( (((q\\land p)\\lor p)\\lor p) \\)"
    "\\( ((q\\supset (q\\equiv q))\\supset p) \\)"
    "\\( (p\\land (p\\supset (q\\equiv q))) \\)"
    "\\( ((q\\equiv (p\\equiv q))\\land p) \\)"
    "\\( (p\\land ((q\\supset q)\\lor q)) \\)"
    "\\( (((p\\lor q)\\land q)\\supset p) \\)"
    "\\( ((q\\land (p\\land q))\\equiv q) \\)"
    "\\( (q\\supset ((q\\supset p)\\lor p)) \\)"
    "\\( (((p\\equiv p)\\supset q)\\supset p) \\)"
    "\\( ((q\\equiv q)\\land (q\\supset p)) \\)"
    "\\( ((p\\land (q\\supset q))\\lor q) \\)"
    "\\( (\\lnot q\\supset (p\\land p)) \\)"
    "\\( (p\\lor ((q\\lor q)\\land q)) \\)"
    "\\( (((q\\equiv q)\\equiv p)\\lor q) \\)"
    "\\( ((p\\land q)\\equiv (p\\equiv q)) \\)"
    "\\( ((p\\land (q\\land p))\\supset q) \\)"
    "\\( (p\\supset ((p\\equiv p)\\equiv p)) \\)"
    "\\( ((q\\lor p)\\lor (p\\equiv p)) \\)"
    "\\( (q\\lor (p\\lor (q\\equiv p))) \\)"
    "\\( ((q\\land q)\\supset (q\\lor p)) \\)"
  ]
  :wrong [
            ["\\( (p\\land (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot ((p\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( ((q\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot q\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (p\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( ((p\\land q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot p\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (p\\equiv \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot ((q\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( ((\\lnot q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (p\\supset (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot (p\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\supset (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (p\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot ((p\\lor q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( (\\lnot (q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot (q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
            ["\\( \\lnot ((p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\lor q)\\supset (q\\equiv p))\\), \\(((q\\equiv q)\\supset (q\\supset p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\land p)\\equiv (p\\lor q)) \\)"
    "\\( ((q\\equiv q)\\supset (q\\equiv p)) \\)"
    "\\( ((p\\lor q)\\equiv (p\\land q)) \\)"
    "\\( (((p\\supset p)\\land q)\\equiv p) \\)"
    "\\( (((p\\equiv p)\\equiv p)\\equiv q) \\)"
    "\\( ((p\\lor p)\\supset q) \\)"
    "\\( (p\\equiv (p\\land (p\\supset q))) \\)"
    "\\( (q\\lor \\lnot (q\\lor p)) \\)"
    "\\( (((q\\lor p)\\land p)\\supset q) \\)"
    "\\( ((p\\lor (q\\lor p))\\equiv q) \\)"
    "\\( (((q\\lor q)\\lor p)\\equiv p) \\)"
    "\\( (\\lnot p\\supset \\lnot q) \\)"
    "\\( (((p\\land q)\\land p)\\equiv q) \\)"
    "\\( (((q\\land q)\\supset p)\\lor p) \\)"
    "\\( ((q\\supset p)\\land (p\\supset p)) \\)"
    "\\( (p\\supset ((p\\equiv q)\\supset p)) \\)"
    "\\( (q\\lor ((q\\land p)\\equiv q)) \\)"
    "\\( ((q\\supset \\lnot p)\\lor p) \\)"
    "\\( (((q\\equiv q)\\land p)\\supset p) \\)"
    "\\( (q\\equiv ((q\\supset q)\\equiv q)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (q\\supset (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\supset (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((\\lnot p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\supset \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\land (q\\equiv (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\supset (q\\supset p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\lor p)\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\lor (q\\lor (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((p\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (q\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((p\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((q\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\supset (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\land ((p\\equiv p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\lor (q\\lor (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((q\\supset (q\\supset q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\lor ((p\\lor p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\supset \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\equiv \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\supset p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot (p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\land ((q\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\lor ((p\\land q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\equiv ((q\\lor q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (((q\\equiv p)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot ((p\\supset p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\supset (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (p\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (\\lnot p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((q\\land p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\equiv (p\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (((p\\land p)\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( ((p\\lor p)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
            ["\\( (q\\lor ((q\\lor p)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv ((q\\lor q)\\land q))\\), \\((p\\lor ((q\\supset q)\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\land p)\\land (q\\land q)) \\)"
    "\\( (p\\land (\\lnot p\\lor q)) \\)"
    "\\( (q\\equiv (p\\equiv (p\\lor q))) \\)"
    "\\( (q\\land ((q\\supset p)\\land p)) \\)"
    "\\( ((q\\equiv (p\\lor p))\\land q) \\)"
    "\\( ((q\\lor (p\\land q))\\equiv p) \\)"
    "\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)"
    "\\( (q\\equiv (p\\land p)) \\)"
    "\\( ((p\\equiv p)\\supset (q\\equiv p)) \\)"
    "\\( \\lnot (\\lnot p\\equiv q) \\)"
    "\\( (q\\land (p\\supset (q\\lor p))) \\)"
    "\\( ((q\\equiv (q\\lor q))\\land q) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\land p)) \\)"
    "\\( (q\\land ((q\\supset q)\\equiv q)) \\)"
    "\\( ((p\\lor (q\\lor q))\\land q) \\)"
    "\\( ((p\\supset q)\\lor (q\\lor q)) \\)"
    "\\( (\\lnot p\\lor (q\\land p)) \\)"
    "\\( (((q\\equiv p)\\supset p)\\equiv q) \\)"
    "\\( (p\\supset (p\\equiv (q\\equiv p))) \\)"
    "\\( (((p\\supset p)\\supset p)\\supset q) \\)"
    "\\( (p\\lor ((p\\supset q)\\supset p)) \\)"
    "\\( (((p\\lor p)\\lor q)\\land p) \\)"
    "\\( (p\\land ((p\\lor q)\\equiv p)) \\)"
    "\\( (p\\lor ((q\\equiv p)\\equiv q)) \\)"
    "\\( (p\\land ((q\\land q)\\equiv q)) \\)"
    "\\( (((q\\lor q)\\land q)\\supset p) \\)"
    "\\( (((p\\equiv q)\\land p)\\equiv q) \\)"
    "\\( (((q\\lor q)\\lor q)\\supset p) \\)"
    "\\( ((q\\equiv (q\\supset p))\\equiv q) \\)"
    "\\( (q\\supset (p\\lor (q\\equiv p))) \\)"
    "\\( ((p\\equiv (q\\supset p))\\lor p) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\lor q) \\)"
    "\\( (((p\\equiv q)\\supset q)\\lor p) \\)"
    "\\( (\\lnot q\\supset (p\\lor q)) \\)"
    "\\( (p\\lor ((q\\lor p)\\lor p)) \\)"
    "\\( (q\\lor (q\\supset (p\\land p))) \\)"
    "\\( (q\\supset (p\\supset (p\\supset p))) \\)"
    "\\( (p\\lor (q\\supset q)) \\)"
    "\\( (((q\\lor q)\\supset q)\\lor p) \\)"
    "\\( \\lnot (p\\equiv \\lnot p) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot ((p\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((p\\supset \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (p\\equiv (p\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot q\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (q\\supset \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((q\\land q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (q\\land \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot ((q\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot p\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (q\\land \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot p\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot ((p\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (q\\supset \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((\\lnot q\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( ((\\lnot p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot p\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (p\\land (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (q\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( (\\lnot (q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
            ["\\( \\lnot (p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(((p\\supset q)\\supset p)\\equiv q)\\), \\(((q\\land (q\\land p))\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\lor q)\\equiv (p\\land q)) \\)"
    "\\( (((q\\supset q)\\equiv q)\\equiv p) \\)"
    "\\( (((q\\equiv p)\\equiv q)\\equiv q) \\)"
    "\\( (p\\equiv (q\\lor q)) \\)"
    "\\( ((q\\land q)\\equiv (p\\land p)) \\)"
    "\\( (p\\supset (q\\land (q\\lor q))) \\)"
    "\\( (q\\equiv (p\\lor q)) \\)"
    "\\( ((p\\supset q)\\lor (p\\equiv q)) \\)"
    "\\( (((q\\supset p)\\land q)\\equiv p) \\)"
    "\\( (((p\\lor q)\\lor q)\\equiv q) \\)"
    "\\( (((p\\supset q)\\land q)\\supset p) \\)"
    "\\( (q\\supset ((q\\land q)\\equiv p)) \\)"
    "\\( (p\\lor ((p\\lor q)\\equiv p)) \\)"
    "\\( (p\\lor (q\\supset \\lnot q)) \\)"
    "\\( (q\\supset (q\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\equiv q)\\land p)) \\)"
    "\\( (p\\supset ((p\\supset p)\\supset p)) \\)"
    "\\( (q\\equiv (q\\equiv (q\\supset q))) \\)"
    "\\( ((q\\supset (q\\land p))\\lor q) \\)"
    "\\( (p\\supset ((p\\lor p)\\lor q)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot (q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\equiv \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (q\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (\\lnot q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\land q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (q\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\supset (q\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\lor ((p\\land p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\lor p)\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot (p\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\land q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\equiv (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (((p\\lor p)\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (q\\land (q\\lor (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\equiv ((p\\land q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\equiv (p\\lor p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot q\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((\\lnot p\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\equiv p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (q\\supset \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\equiv \\lnot q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (p\\lor ((q\\supset q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (((q\\lor q)\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((\\lnot p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\equiv p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (p\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((q\\supset q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (p\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( \\lnot (p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\land q)\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((p\\lor (q\\equiv p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( (((p\\equiv p)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
            ["\\( ((\\lnot q\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1001 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(q\\equiv (p\\supset (p\\land p)))\\), \\((\\lnot p\\lor (q\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\equiv (q\\equiv (p\\lor p))) \\)"
    "\\( ((p\\equiv p)\\land q) \\)"
    "\\( ((q\\supset \\lnot q)\\supset q) \\)"
    "\\( (((p\\land p)\\land q)\\lor q) \\)"
    "\\( (q\\equiv (q\\lor (p\\supset p))) \\)"
    "\\( (p\\equiv (p\\land (p\\supset q))) \\)"
    "\\( (\\lnot p\\lor (p\\land q)) \\)"
    "\\( ((p\\supset q)\\lor (q\\equiv p)) \\)"
    "\\( (p\\supset ((q\\lor p)\\equiv q)) \\)"
    "\\( (p\\supset (p\\equiv (q\\land p))) \\)"
    "\\( ((p\\lor p)\\lor (q\\lor p)) \\)"
    "\\( (((p\\lor q)\\lor q)\\lor q) \\)"
    "\\( (((p\\land p)\\equiv q)\\supset q) \\)"
    "\\( (((q\\lor p)\\equiv q)\\equiv q) \\)"
    "\\( ((p\\lor (q\\lor p))\\lor q) \\)"
    "\\( ((p\\equiv q)\\equiv (p\\equiv q)) \\)"
    "\\( (q\\lor (q\\lor (q\\supset q))) \\)"
    "\\( ((q\\equiv p)\\lor (q\\supset q)) \\)"
    "\\( ((p\\equiv p)\\lor (p\\lor p)) \\)"
    "\\( (p\\supset ((p\\supset p)\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( ((\\lnot q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((q\\land q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot ((p\\supset p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot ((p\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot ((p\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((p\\equiv p)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((q\\lor p)\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\lor ((p\\equiv p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\supset ((p\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot ((q\\supset p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((p\\equiv q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (p\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (q\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\supset (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((p\\lor p)\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((p\\supset p)\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\lor (q\\land (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((p\\equiv (q\\supset p))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot (q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\equiv (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot (p\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot ((p\\land q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\land (q\\land (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\equiv \\lnot \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((q\\land (p\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\equiv ((p\\supset q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (\\lnot (q\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\land (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (p\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\equiv \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (q\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( \\lnot (q\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\land ((p\\supset p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\equiv ((q\\supset q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (p\\equiv (p\\lor \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
            ["\\( (q\\supset ((q\\supset q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1101 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\lor (q\\supset q))\\land q)\\), \\(((q\\supset p)\\equiv (q\\lor p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((p\\land q)\\land q)\\land p) \\)"
    "\\( (p\\land (q\\equiv (p\\lor p))) \\)"
    "\\( (p\\land ((q\\supset q)\\supset q)) \\)"
    "\\( (((q\\supset q)\\land p)\\land q) \\)"
    "\\( ((p\\lor q)\\land (q\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\land (p\\equiv q)) \\)"
    "\\( (p\\equiv ((q\\land q)\\lor q)) \\)"
    "\\( ((p\\land (p\\supset p))\\equiv q) \\)"
    "\\( ((p\\equiv q)\\land (p\\equiv p)) \\)"
    "\\( ((q\\equiv (p\\supset p))\\equiv p) \\)"
    "\\( (q\\lor ((p\\equiv q)\\equiv p)) \\)"
    "\\( (q\\lor (q\\land (p\\equiv q))) \\)"
    "\\( ((q\\supset (p\\supset p))\\equiv q) \\)"
    "\\( (q\\land ((p\\equiv q)\\lor q)) \\)"
    "\\( ((q\\land (q\\land p))\\lor q) \\)"
    "\\( ((p\\supset (q\\land p))\\lor q) \\)"
    "\\( (q\\lor ((q\\land q)\\equiv p)) \\)"
    "\\( (p\\supset ((p\\equiv q)\\land p)) \\)"
    "\\( (p\\supset ((q\\supset p)\\equiv q)) \\)"
    "\\( ((p\\lor p)\\supset q) \\)"
    "\\( (q\\equiv (q\\equiv (p\\land p))) \\)"
    "\\( (((p\\equiv p)\\lor p)\\land p) \\)"
    "\\( (p\\equiv (q\\supset (q\\equiv q))) \\)"
    "\\( (((p\\lor q)\\lor p)\\land p) \\)"
    "\\( ((q\\supset p)\\land (p\\lor p)) \\)"
    "\\( ((q\\land (q\\equiv q))\\supset p) \\)"
    "\\( (p\\equiv ((p\\equiv q)\\supset q)) \\)"
    "\\( ((q\\lor q)\\supset (p\\lor p)) \\)"
    "\\( (\\lnot p\\supset (q\\equiv p)) \\)"
    "\\( ((q\\equiv (q\\supset q))\\supset p) \\)"
    "\\( ((\\lnot q\\lor p)\\equiv p) \\)"
    "\\( (q\\lor (p\\equiv (q\\equiv q))) \\)"
    "\\( (p\\equiv ((q\\land p)\\equiv q)) \\)"
    "\\( (((q\\land q)\\lor p)\\lor p) \\)"
    "\\( ((p\\land p)\\lor (p\\lor q)) \\)"
    "\\( (p\\lor ((q\\land p)\\supset q)) \\)"
    "\\( (p\\lor ((q\\land q)\\equiv q)) \\)"
    "\\( (q\\equiv (q\\land (q\\equiv q))) \\)"
    "\\( (p\\supset ((p\\land p)\\supset p)) \\)"
    "\\( ((q\\equiv q)\\supset (p\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((q\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((p\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot p\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (p\\land \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot (q\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (p\\equiv \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot (q\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((p\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (q\\land (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (p\\supset (q\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (p\\land (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot (q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((q\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot p\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot (p\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((p\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (q\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot (\\lnot q\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot (q\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( \\lnot ((p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot q\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot q\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
            ["\\( (\\lnot p\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv p)\\equiv (p\\land p))\\), \\((q\\supset (q\\supset (p\\lor p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land (q\\land (p\\lor p))) \\)"
    "\\( ((p\\lor (q\\supset p))\\land q) \\)"
    "\\( ((q\\supset q)\\land (q\\land p)) \\)"
    "\\( (p\\equiv ((p\\lor q)\\equiv q)) \\)"
    "\\( (p\\land ((p\\equiv q)\\lor q)) \\)"
    "\\( ((p\\land (p\\equiv p))\\equiv q) \\)"
    "\\( (((q\\equiv q)\\equiv q)\\equiv p) \\)"
    "\\( ((p\\supset p)\\land (q\\equiv p)) \\)"
    "\\( ((q\\lor p)\\supset (q\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\lor q)\\lor q)) \\)"
    "\\( (q\\equiv ((q\\land q)\\supset q)) \\)"
    "\\( ((q\\land (q\\lor q))\\lor q) \\)"
    "\\( (q\\equiv (q\\supset (p\\supset q))) \\)"
    "\\( (q\\land (q\\equiv (p\\equiv p))) \\)"
    "\\( (((p\\equiv q)\\lor p)\\supset q) \\)"
    "\\( (\\lnot (p\\equiv q)\\supset q) \\)"
    "\\( (\\lnot p\\lor (q\\equiv p)) \\)"
    "\\( (\\lnot (q\\lor p)\\lor q) \\)"
    "\\( (p\\supset ((q\\supset q)\\equiv q)) \\)"
    "\\( ((p\\land (q\\land q))\\equiv p) \\)"
    "\\( (q\\equiv (q\\equiv p)) \\)"
    "\\( (p\\land (q\\lor (p\\lor q))) \\)"
    "\\( ((q\\supset (p\\lor q))\\equiv p) \\)"
    "\\( ((q\\supset p)\\land (p\\land p)) \\)"
    "\\( ((p\\land q)\\lor (p\\lor p)) \\)"
    "\\( (p\\lor (q\\supset (p\\land q))) \\)"
    "\\( (q\\supset (p\\land (p\\lor q))) \\)"
    "\\( ((p\\lor (q\\land q))\\supset p) \\)"
    "\\( (\\lnot q\\lor (p\\land p)) \\)"
    "\\( (\\lnot (q\\lor q)\\lor p) \\)"
    "\\( ((q\\supset (p\\lor p))\\supset p) \\)"
    "\\( ((q\\land q)\\lor (p\\lor q)) \\)"
    "\\( ((p\\supset (q\\equiv p))\\supset q) \\)"
    "\\( (\\lnot (p\\equiv q)\\lor q) \\)"
    "\\( (((q\\land p)\\equiv q)\\supset p) \\)"
    "\\( ((q\\equiv q)\\equiv (q\\equiv q)) \\)"
    "\\( (q\\supset ((p\\equiv q)\\lor q)) \\)"
    "\\( ((p\\supset p)\\lor p) \\)"
    "\\( (p\\lor (q\\lor \\lnot q)) \\)"
    "\\( ((p\\supset p)\\lor q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((q\\equiv q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot (p\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot (q\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((q\\land p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((\\lnot q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (q\\land (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (p\\equiv (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (p\\land (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((p\\land \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((p\\land p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((q\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (q\\land (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (p\\equiv (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((q\\land p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (\\lnot q\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (\\lnot p\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot (p\\lor (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((q\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( ((p\\equiv \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((q\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (\\lnot q\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot (q\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
            ["\\( (q\\supset (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\supset p)\\equiv (q\\land p))\\), \\((p\\equiv ((p\\lor q)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\land q)\\land (p\\lor q)) \\)"
    "\\( ((p\\lor (q\\equiv q))\\equiv q) \\)"
    "\\( ((q\\land q)\\land (p\\supset q)) \\)"
    "\\( (q\\land ((p\\supset q)\\land q)) \\)"
    "\\( (q\\land (p\\supset (p\\land q))) \\)"
    "\\( (p\\supset (q\\equiv (p\\land p))) \\)"
    "\\( ((q\\lor (p\\supset q))\\lor q) \\)"
    "\\( (p\\supset ((p\\equiv q)\\equiv p)) \\)"
    "\\( (((p\\land p)\\land p)\\supset q) \\)"
    "\\( (p\\supset ((p\\land q)\\equiv p)) \\)"
    "\\( ((q\\equiv q)\\land (q\\lor p)) \\)"
    "\\( (p\\equiv (q\\supset p)) \\)"
    "\\( (p\\lor ((q\\equiv p)\\equiv p)) \\)"
    "\\( (q\\lor p) \\)"
    "\\( (((q\\lor q)\\supset p)\\supset p) \\)"
    "\\( ((p\\supset q)\\equiv (p\\supset q)) \\)"
    "\\( (((q\\supset q)\\supset p)\\supset p) \\)"
    "\\( ((p\\land (q\\equiv p))\\supset p) \\)"
    "\\( (q\\supset (q\\lor p)) \\)"
    "\\( ((p\\land q)\\supset (p\\lor p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot p\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot (q\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\land \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\supset p)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot (p\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\land ((q\\land q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\land (p\\supset p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\land (p\\land p))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((q\\lor p)\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((q\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot (p\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((q\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot q\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((\\lnot q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (((p\\lor p)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\lor \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\supset ((p\\equiv q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot p\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\land (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((p\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((\\lnot q\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv \\lnot (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((q\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (((q\\land q)\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv (p\\lor (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\supset (p\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\equiv (q\\land q))\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((\\lnot p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (p\\supset (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (\\lnot q\\equiv (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((q\\equiv p)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( (q\\equiv (p\\land (p\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((q\\lor \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
            ["\\( ((q\\lor (p\\lor p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(((p\\equiv p)\\supset q)\\lor q)\\), \\((\\lnot (p\\land q)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\equiv p)\\land (q\\land q)) \\)"
    "\\( (q\\lor (q\\land \\lnot p)) \\)"
    "\\( (q\\land ((q\\lor q)\\equiv q)) \\)"
    "\\( (((p\\supset q)\\land q)\\lor q) \\)"
    "\\( (((q\\equiv q)\\lor q)\\supset q) \\)"
    "\\( ((p\\land (q\\supset q))\\supset q) \\)"
    "\\( (q\\equiv (p\\lor q)) \\)"
    "\\( (\\lnot (p\\lor p)\\lor q) \\)"
    "\\( ((p\\land p)\\supset (q\\lor q)) \\)"
    "\\( (p\\supset ((q\\equiv q)\\equiv q)) \\)"
    "\\( (q\\lor (p\\land (p\\lor q))) \\)"
    "\\( ((p\\supset (p\\supset q))\\supset q) \\)"
    "\\( ((q\\supset p)\\supset (p\\lor q)) \\)"
    "\\( (q\\lor ((p\\lor p)\\lor q)) \\)"
    "\\( ((p\\equiv (q\\lor p))\\supset p) \\)"
    "\\( ((q\\lor (q\\equiv p))\\lor p) \\)"
    "\\( (((p\\equiv p)\\supset p)\\supset p) \\)"
    "\\( (q\\supset ((p\\lor q)\\supset q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\lor p)) \\)"
    "\\( (((p\\supset p)\\supset q)\\supset q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\land (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot ((p\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\supset \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (((q\\equiv q)\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\equiv (p\\land (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((p\\equiv (q\\lor q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (((q\\lor q)\\land q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (q\\supset (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot (p\\land q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((\\lnot q\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (p\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\land ((q\\supset q)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((q\\land (p\\supset q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((p\\supset (p\\supset q))\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (((q\\lor q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((p\\land \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (\\lnot q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((p\\supset \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\supset (p\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (p\\supset (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot q\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((p\\lor p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((q\\equiv (q\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\equiv (q\\equiv (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\equiv (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (((p\\supset q)\\supset q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( \\lnot (q\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot q\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((q\\lor p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot p\\land (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot (p\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\supset \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (((p\\lor q)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( ((q\\land q)\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (p\\land (q\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
            ["\\( (q\\equiv (p\\land (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0101 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\supset (p\\land (p\\supset q)))\\), \\(((q\\lor (q\\supset p))\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\land \\lnot \\lnot p) \\)"
    "\\( ((p\\equiv (p\\land q))\\equiv p) \\)"
    "\\( (p\\land (q\\land (p\\supset q))) \\)"
    "\\( ((q\\equiv (p\\land p))\\land q) \\)"
    "\\( (p\\land ((p\\equiv q)\\land q)) \\)"
    "\\( (((p\\supset p)\\supset p)\\equiv q) \\)"
    "\\( (p\\equiv (q\\land (p\\lor q))) \\)"
    "\\( (((q\\supset q)\\land p)\\equiv q) \\)"
    "\\( (q\\equiv ((p\\equiv p)\\equiv p)) \\)"
    "\\( ((p\\supset q)\\land (p\\equiv q)) \\)"
    "\\( (q\\land (p\\lor (p\\equiv p))) \\)"
    "\\( (((q\\land q)\\equiv q)\\land q) \\)"
    "\\( (q\\lor (q\\land (p\\equiv q))) \\)"
    "\\( ((q\\supset q)\\supset (q\\land q)) \\)"
    "\\( ((q\\land (q\\equiv p))\\lor q) \\)"
    "\\( ((q\\land (p\\land p))\\equiv p) \\)"
    "\\( ((p\\lor q)\\supset (q\\land q)) \\)"
    "\\( ((p\\supset (q\\land p))\\lor q) \\)"
    "\\( (p\\supset ((p\\lor p)\\equiv q)) \\)"
    "\\( ((p\\land p)\\supset (q\\lor q)) \\)"
    "\\( ((p\\lor p)\\land (q\\supset p)) \\)"
    "\\( (((q\\land q)\\equiv q)\\supset p) \\)"
    "\\( ((p\\supset (q\\supset p))\\supset p) \\)"
    "\\( ((q\\lor p)\\equiv (q\\supset p)) \\)"
    "\\( (p\\equiv (p\\supset (p\\land p))) \\)"
    "\\( (((q\\lor p)\\lor q)\\equiv p) \\)"
    "\\( (q\\supset (p\\lor (p\\lor p))) \\)"
    "\\( (((p\\lor p)\\lor q)\\equiv p) \\)"
    "\\( (p\\equiv (q\\equiv (p\\supset q))) \\)"
    "\\( (q\\equiv (q\\equiv (q\\supset p))) \\)"
    "\\( (((q\\land q)\\land q)\\lor p) \\)"
    "\\( (p\\equiv (q\\supset p)) \\)"
    "\\( ((q\\lor p)\\lor p) \\)"
    "\\( (((q\\lor p)\\land p)\\lor q) \\)"
    "\\( ((p\\supset q)\\supset q) \\)"
    "\\( ((q\\supset p)\\supset (p\\supset p)) \\)"
    "\\( ((p\\equiv q)\\supset (q\\equiv q)) \\)"
    "\\( (p\\lor ((q\\equiv q)\\lor p)) \\)"
    "\\( ((p\\supset p)\\supset (p\\supset p)) \\)"
    "\\( (p\\lor ((q\\equiv q)\\lor q)) \\)"
  ]
  :wrong [
            ["\\( ((p\\supset \\lnot p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (p\\equiv \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot (p\\lor (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((\\lnot q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot ((q\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot (p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (q\\supset (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (p\\land \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (q\\equiv \\lnot (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot p\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot (q\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (p\\supset \\lnot (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((\\lnot p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot (q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (q\\equiv \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot ((p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((\\lnot q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot (q\\land (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((q\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot (p\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( ((q\\lor q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot p\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot (q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (p\\supset (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (q\\equiv \\lnot (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( \\lnot ((q\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
            ["\\( (q\\supset \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0011 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\equiv p)\\lor (q\\land q))\\), \\((q\\supset ((p\\lor q)\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv (p\\land (p\\lor q))) \\)"
    "\\( (p\\equiv ((q\\lor p)\\land q)) \\)"
    "\\( ((p\\supset q)\\land (q\\supset p)) \\)"
    "\\( (((q\\supset q)\\supset p)\\equiv q) \\)"
    "\\( (((q\\supset q)\\equiv p)\\equiv q) \\)"
    "\\( (q\\lor ((q\\land p)\\equiv p)) \\)"
    "\\( (p\\equiv ((q\\supset p)\\land q)) \\)"
    "\\( ((q\\land p)\\lor (p\\supset q)) \\)"
    "\\( ((p\\lor (q\\lor p))\\equiv q) \\)"
    "\\( (p\\supset ((p\\land q)\\equiv p)) \\)"
    "\\( ((q\\equiv p)\\lor (p\\lor p)) \\)"
    "\\( ((q\\supset p)\\lor (p\\equiv q)) \\)"
    "\\( ((p\\equiv (p\\equiv q))\\supset p) \\)"
    "\\( (q\\supset (q\\land (p\\equiv q))) \\)"
    "\\( ((p\\land (p\\equiv q))\\equiv q) \\)"
    "\\( ((\\lnot q\\equiv q)\\supset p) \\)"
    "\\( ((p\\equiv p)\\supset (q\\supset q)) \\)"
    "\\( ((p\\land (p\\equiv q))\\supset q) \\)"
    "\\( ((p\\lor q)\\lor (p\\supset p)) \\)"
    "\\( ((p\\land (q\\equiv q))\\equiv p) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\lor q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\lor q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\supset q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((\\lnot p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\land \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\supset \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (q\\equiv (q\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\lor \\lnot p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\lor (p\\supset p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\land p)\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot (p\\supset (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot ((p\\supset p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\land \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\equiv (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\supset (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\land q)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (((p\\equiv q)\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\equiv p)\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\lor \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (q\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (\\lnot (p\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\equiv \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot ((q\\land q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (q\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot (q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\land (q\\land (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\lor \\lnot q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (((p\\equiv q)\\equiv q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (((p\\equiv q)\\equiv p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((\\lnot q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((p\\equiv \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot (p\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (q\\supset (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( \\lnot ((q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (p\\land ((q\\lor p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\equiv (p\\land q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( (((p\\equiv q)\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
            ["\\( ((q\\lor (q\\equiv p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\land q)\\lor \\lnot p)\\), \\(((\\lnot q\\land p)\\lor q)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\land (q\\land q))\\lor q) \\)"
    "\\( (q\\land (p\\supset (q\\equiv p))) \\)"
    "\\( (((p\\supset p)\\equiv q)\\lor q) \\)"
    "\\( ((q\\equiv (p\\land q))\\supset q) \\)"
    "\\( ((p\\equiv q)\\equiv p) \\)"
    "\\( (p\\supset ((p\\lor p)\\supset q)) \\)"
    "\\( ((p\\lor q)\\equiv (q\\lor q)) \\)"
    "\\( (p\\supset ((q\\land q)\\land q)) \\)"
    "\\( (((p\\equiv q)\\land q)\\equiv p) \\)"
    "\\( (((p\\lor p)\\lor q)\\supset q) \\)"
    "\\( ((q\\equiv (q\\land p))\\equiv p) \\)"
    "\\( ((p\\lor q)\\equiv (p\\supset p)) \\)"
    "\\( (p\\lor (q\\land (p\\supset p))) \\)"
    "\\( ((q\\supset (p\\lor p))\\supset p) \\)"
    "\\( ((p\\equiv q)\\supset (p\\land q)) \\)"
    "\\( ((p\\lor \\lnot p)\\lor p) \\)"
    "\\( (q\\lor ((q\\land q)\\supset q)) \\)"
    "\\( (p\\lor ((q\\land p)\\supset q)) \\)"
    "\\( (q\\lor ((q\\equiv q)\\lor p)) \\)"
    "\\( (p\\supset ((p\\lor q)\\supset p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\lor (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (q\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\lor q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\supset q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (q\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (\\lnot (q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (\\lnot q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (q\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\land ((q\\lor q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\equiv ((p\\lor q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (((p\\lor p)\\land p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (q\\supset (p\\land (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (\\lnot (q\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (p\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (p\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot ((p\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((\\lnot q\\land p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\lor q)\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (q\\equiv ((p\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\lor \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\land q)\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (\\lnot (p\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (p\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (q\\land \\lnot (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\land (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot ((q\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\supset (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\equiv p)\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\equiv (q\\land (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\supset (p\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\equiv \\lnot p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot ((p\\land q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\lor p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot ((q\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (\\lnot (p\\supset q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( \\lnot (q\\land (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((q\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (q\\supset (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\lor q)\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (q\\equiv ((p\\lor q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( ((p\\land p)\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
            ["\\( (p\\equiv ((q\\land q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\equiv ((p\\lor p)\\land q))\\), \\((p\\equiv ((q\\lor p)\\land p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (q\\equiv ((q\\equiv p)\\supset p)) \\)"
    "\\( ((p\\supset q)\\lor \\lnot p) \\)"
    "\\( ((q\\equiv (p\\supset q))\\supset q) \\)"
    "\\( ((q\\supset p)\\equiv (p\\equiv q)) \\)"
    "\\( (q\\lor \\lnot (p\\lor q)) \\)"
    "\\( (q\\supset ((p\\supset q)\\lor q)) \\)"
    "\\( (((p\\land p)\\supset p)\\lor p) \\)"
    "\\( ((q\\land p)\\equiv (p\\land q)) \\)"
    "\\( ((p\\land q)\\supset (q\\lor q)) \\)"
    "\\( (q\\lor (p\\supset \\lnot q)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((\\lnot p\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (\\lnot (p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\lor q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\land q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot ((p\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\supset (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\land (q\\supset p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\equiv (p\\equiv (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\land (p\\supset (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\land ((q\\equiv q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\equiv (p\\supset q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((q\\lor p)\\supset q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\land (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\land \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\equiv (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((\\lnot q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (\\lnot q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot (q\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\equiv (q\\supset (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((q\\lor q)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((q\\land q)\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((q\\supset q)\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((p\\lor p)\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\supset (p\\land q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\equiv (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot (q\\supset (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\supset (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (\\lnot q\\equiv (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (\\lnot (q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot (q\\land (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\equiv ((q\\supset p)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\land ((p\\lor q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\supset q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\land (q\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\equiv q)\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( \\lnot ((q\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\equiv \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((\\lnot p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((q\\equiv p)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\land ((q\\lor q)\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\equiv (p\\equiv p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( ((p\\equiv (q\\equiv p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\land ((p\\land q)\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (((q\\lor q)\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
            ["\\( (p\\lor (q\\lor (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1101 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(p\\land (p\\equiv (p\\lor p)))\\), \\((p\\equiv ((q\\equiv p)\\supset q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((q\\supset q)\\equiv (p\\lor p)) \\)"
    "\\( (((q\\supset q)\\lor q)\\supset p) \\)"
    "\\( (p\\land (q\\supset (p\\land p))) \\)"
    "\\( ((q\\supset p)\\land (p\\land p)) \\)"
    "\\( (p\\equiv (p\\supset p)) \\)"
    "\\( (p\\lor (p\\lor (q\\supset p))) \\)"
    "\\( (q\\supset (p\\equiv (q\\land q))) \\)"
    "\\( (((p\\lor q)\\equiv p)\\lor p) \\)"
    "\\( (q\\supset (p\\equiv (p\\supset p))) \\)"
    "\\( (q\\supset ((q\\equiv q)\\supset p)) \\)"
    "\\( (((p\\equiv p)\\supset q)\\lor p) \\)"
    "\\( ((q\\supset (q\\supset p))\\equiv p) \\)"
    "\\( ((q\\supset p)\\supset (p\\lor p)) \\)"
    "\\( (p\\lor ((q\\equiv p)\\supset q)) \\)"
    "\\( ((p\\equiv (p\\lor q))\\equiv p) \\)"
    "\\( ((p\\equiv (p\\land q))\\lor p) \\)"
    "\\( (p\\lor (\\lnot q\\lor q)) \\)"
    "\\( (q\\lor (p\\supset (p\\equiv p))) \\)"
    "\\( (p\\supset ((q\\land p)\\supset p)) \\)"
    "\\( ((p\\lor p)\\lor (p\\equiv p)) \\)"
  ]
  :wrong [
            ["\\( (\\lnot (q\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot (p\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot (q\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\land (q\\equiv (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\equiv (p\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (((p\\land p)\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (((p\\lor q)\\lor q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (p\\supset (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (p\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (q\\land (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((p\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\land (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\supset (p\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((p\\land p)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((p\\equiv p)\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\land q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\land (q\\supset p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot (p\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((p\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\supset (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((p\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((p\\lor q)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\land (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((p\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (p\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\land (q\\supset p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (((p\\lor q)\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\land q)\\land (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\supset (p\\supset (q\\equiv p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\supset (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((q\\supset p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\supset (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot ((p\\supset q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (p\\equiv \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( \\lnot (q\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\land q)\\land (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (q\\equiv ((p\\supset p)\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( ((q\\equiv (p\\land p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
            ["\\( (q\\equiv ((q\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1011 "]
]}
 {:question "Jelölje meg a \\( \\{((p\\land p)\\land (p\\land p))\\), \\((p\\lor (q\\land (q\\land q)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\lor p)\\lor (p\\lor p)) \\)"
    "\\( (((q\\lor p)\\supset q)\\supset p) \\)"
    "\\( (p\\land (q\\supset (q\\lor p))) \\)"
    "\\( (p\\equiv (p\\equiv p)) \\)"
    "\\( (p\\land (q\\lor p)) \\)"
    "\\( ((q\\equiv p)\\lor \\lnot q) \\)"
    "\\( (q\\supset (p\\land (q\\lor p))) \\)"
    "\\( (q\\equiv (p\\land (q\\equiv p))) \\)"
    "\\( (((p\\lor q)\\lor q)\\equiv p) \\)"
    "\\( ((p\\equiv (p\\lor q))\\lor p) \\)"
    "\\( (((q\\equiv p)\\lor p)\\equiv p) \\)"
    "\\( ((q\\lor q)\\lor (p\\land p)) \\)"
    "\\( ((q\\lor p)\\equiv (p\\equiv p)) \\)"
    "\\( (p\\equiv (q\\supset (q\\supset p))) \\)"
    "\\( (p\\lor (q\\land (q\\land q))) \\)"
    "\\( (p\\equiv \\lnot \\lnot p) \\)"
    "\\( (p\\lor ((q\\supset q)\\lor q)) \\)"
    "\\( (q\\lor (q\\supset \\lnot q)) \\)"
    "\\( (q\\supset (q\\supset (p\\equiv p))) \\)"
    "\\( (q\\supset (p\\lor (q\\supset q))) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (\\lnot q\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\supset q)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((\\lnot p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\equiv \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\supset (\\lnot p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((p\\land q)\\land (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (((p\\equiv p)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (((p\\lor p)\\supset p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((p\\supset q)\\lor (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\land (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot ((p\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot (q\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\supset (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot (p\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot (q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\land (p\\land (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (q\\equiv ((p\\land q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (((p\\supset p)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\equiv ((p\\equiv q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\land (\\lnot p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot q\\equiv (p\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (q\\equiv (q\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\equiv (\\lnot q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\land q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (p\\land (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\equiv (q\\supset p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\equiv q)\\land (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (((p\\lor p)\\lor q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\equiv p)\\equiv (q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (q\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot ((q\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (q\\equiv (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (\\lnot p\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( \\lnot (p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (p\\supset \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((p\\equiv q)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( ((q\\lor p)\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (q\\land (p\\equiv (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
            ["\\( (((q\\supset p)\\equiv p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{((q\\supset p)\\land (p\\land p))\\), \\((q\\equiv ((p\\lor q)\\land q))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\lor (p\\equiv p))\\supset p) \\)"
    "\\( (((p\\supset p)\\lor q)\\supset p) \\)"
    "\\( ((q\\supset (q\\land q))\\supset p) \\)"
    "\\( (p\\land (p\\equiv (q\\supset p))) \\)"
    "\\( (p\\lor ((p\\equiv p)\\equiv p)) \\)"
    "\\( (q\\supset (p\\land (q\\equiv p))) \\)"
    "\\( (q\\equiv ((q\\land p)\\land q)) \\)"
    "\\( (p\\equiv ((p\\land p)\\lor q)) \\)"
    "\\( (p\\equiv (p\\lor q)) \\)"
    "\\( (q\\supset (q\\equiv (p\\lor p))) \\)"
    "\\( (((q\\land q)\\equiv p)\\supset p) \\)"
    "\\( ((p\\equiv (q\\land q))\\supset q) \\)"
    "\\( ((q\\equiv (q\\lor p))\\supset q) \\)"
    "\\( (((q\\land q)\\lor p)\\lor p) \\)"
    "\\( (((p\\supset q)\\supset q)\\lor p) \\)"
    "\\( (q\\lor (q\\supset (q\\lor q))) \\)"
    "\\( (p\\lor (p\\equiv (p\\land q))) \\)"
    "\\( (p\\supset (\\lnot q\\lor p)) \\)"
    "\\( ((q\\land q)\\equiv q) \\)"
    "\\( ((p\\lor p)\\equiv (p\\land p)) \\)"
  ]
  :wrong [
            ["\\( \\lnot (p\\lor \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (\\lnot p\\equiv (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\equiv (\\lnot p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv q)\\supset \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv p)\\land (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((q\\supset q)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\supset (p\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\lor p)\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\land (\\lnot q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot (p\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\land (p\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\supset p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv q)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\supset (q\\equiv p))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((q\\equiv (q\\equiv q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\land ((p\\lor q)\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv (p\\equiv p))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\land (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot ((p\\land p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (\\lnot (q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (\\lnot (q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot ((q\\lor q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((\\lnot q\\lor p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\lor q)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\equiv (p\\supset (q\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\lor (p\\equiv (q\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((q\\supset \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot ((q\\land q)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\equiv \\lnot q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((q\\equiv q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((q\\supset \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot (q\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( ((p\\supset \\lnot p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (p\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (((p\\lor p)\\equiv q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (p\\equiv ((p\\supset p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( (q\\land (q\\lor (p\\supset p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
            ["\\( \\lnot (p\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0011 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{(((q\\supset p)\\supset q)\\supset p)\\), \\((q\\lor (p\\lor (q\\land p)))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (p\\lor ((p\\supset q)\\supset p)) \\)"
    "\\( ((p\\supset (p\\supset p))\\equiv p) \\)"
    "\\( (p\\land (p\\equiv (p\\land p))) \\)"
    "\\( ((p\\lor q)\\land p) \\)"
    "\\( (p\\land (p\\supset (q\\lor p))) \\)"
    "\\( (((q\\lor p)\\lor p)\\supset p) \\)"
    "\\( ((\\lnot p\\supset q)\\equiv p) \\)"
    "\\( (q\\supset (p\\lor (q\\land p))) \\)"
    "\\( (\\lnot q\\lor (p\\lor p)) \\)"
    "\\( (\\lnot (q\\land q)\\lor p) \\)"
    "\\( ((p\\supset \\lnot p)\\supset q) \\)"
    "\\( (q\\lor (q\\lor (p\\lor p))) \\)"
    "\\( ((p\\lor p)\\lor (p\\lor q)) \\)"
    "\\( (p\\lor ((q\\supset p)\\supset p)) \\)"
    "\\( ((p\\supset p)\\equiv (q\\lor p)) \\)"
    "\\( (q\\lor ((p\\lor q)\\supset p)) \\)"
    "\\( (p\\supset ((q\\equiv q)\\supset p)) \\)"
    "\\( ((q\\lor (p\\equiv q))\\lor p) \\)"
    "\\( (q\\supset ((p\\land p)\\equiv p)) \\)"
    "\\( (p\\equiv (p\\land (p\\equiv p))) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\supset (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (p\\lor (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\land \\lnot (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (p\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot q\\lor \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot (p\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (q\\land (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (p\\land (q\\equiv (q\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\supset p)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (((p\\supset p)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((\\lnot q\\land p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot ((q\\supset p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\land \\lnot q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot (p\\land p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\supset p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot q \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((q\\equiv p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor p)\\land (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor q)\\supset (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor (p\\supset q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\equiv (p\\supset q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\land \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot ((q\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot ((p\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor q)\\land \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (p\\equiv (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\supset \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\lor p)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\land q)\\lor (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (((q\\land q)\\equiv q)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\equiv (p\\lor (q\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot (q\\supset (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot p\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (p\\supset \\lnot (q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( \\lnot ((p\\lor p)\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\supset \\lnot (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (q\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (p\\supset (\\lnot q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (\\lnot \\lnot p\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( ((p\\supset p)\\supset (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (((p\\land q)\\supset q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
            ["\\( (p\\equiv (p\\land (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 0111 "]
]}
 {:question "Jelölje meg a \\( \\{(((p\\supset q)\\supset q)\\supset p)\\), \\(((p\\land (q\\land q))\\supset p)\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( ((p\\lor q)\\supset (p\\land p)) \\)"
    "\\( (q\\supset ((q\\lor p)\\land p)) \\)"
    "\\( ((q\\lor (q\\lor q))\\supset p) \\)"
    "\\( ((p\\land p)\\lor (p\\equiv q)) \\)"
    "\\( (\\lnot (p\\lor q)\\lor p) \\)"
    "\\( (q\\supset (p\\equiv (p\\land q))) \\)"
    "\\( ((p\\equiv p)\\lor (q\\equiv p)) \\)"
    "\\( (((q\\land q)\\supset q)\\lor p) \\)"
    "\\( (q\\supset (p\\supset (p\\supset q))) \\)"
    "\\( (((p\\supset q)\\land p)\\supset q) \\)"
  ]
  :wrong [
            ["\\( \\lnot (q\\equiv (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\lor (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\supset (q\\equiv \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot p\\equiv (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\land ((q\\lor q)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv ((p\\supset p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv (q\\supset (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv (\\lnot q\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\land (p\\lor q))\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\lor (q\\lor (p\\land q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\equiv (p\\supset \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((q\\equiv p)\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot (q\\supset p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\supset \\lnot (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot (q\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\equiv (q\\supset \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\equiv (p\\land \\lnot q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\supset (q\\equiv p))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv (p\\land (p\\lor p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\supset (q\\equiv q))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\land (q\\equiv q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (p\\land ((q\\land p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\lor (p\\lor (q\\lor q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot (q\\lor p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\supset (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot ((p\\equiv q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\supset \\lnot q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot q\\land (p\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((q\\land q)\\land (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (((p\\equiv p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv (q\\supset (q\\supset q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((p\\land (q\\lor q))\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (((p\\equiv p)\\lor p)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (((p\\supset p)\\equiv p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\land (\\lnot q\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot ((q\\lor p)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\equiv (q\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot p\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (\\lnot (q\\land p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\supset \\lnot (q\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot (q\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( \\lnot ((q\\equiv p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv (q\\supset (q\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (((q\\supset p)\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\land ((p\\supset q)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\equiv ((q\\equiv p)\\supset q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( ((\\lnot p\\lor q)\\supset p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
            ["\\( (q\\lor ((q\\equiv p)\\supset p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0111, míg a hipotézisek igazságtábláinak főoszlopai 1011 és 1111 "]
]}
 {:question "Jelölje meg a \\( \\{((\\lnot p\\lor q)\\equiv q)\\), \\(((q\\supset p)\\lor (p\\equiv p))\\}  \\) formulahalmaz logikai következményeit!"
  :good [
    "\\( (((q\\lor p)\\lor q)\\lor p) \\)"
    "\\( ((p\\equiv (q\\land p))\\equiv q) \\)"
    "\\( (\\lnot q\\supset p) \\)"
    "\\( (q\\equiv (q\\equiv (p\\lor q))) \\)"
    "\\( ((p\\equiv q)\\supset (q\\land q)) \\)"
    "\\( (q\\supset ((p\\equiv p)\\lor q)) \\)"
    "\\( ((q\\supset q)\\lor (p\\land p)) \\)"
    "\\( (p\\supset (p\\supset (q\\equiv q))) \\)"
    "\\( (p\\lor ((q\\lor p)\\equiv q)) \\)"
    "\\( ((q\\equiv q)\\lor (p\\lor p)) \\)"
  ]
  :wrong [
            ["\\( ((p\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot (q\\lor (q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot (q\\supset (p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot (p\\land (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\supset \\lnot p)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot (p\\equiv q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\equiv \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\equiv (q\\land \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (((q\\land p)\\equiv q)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (((p\\land q)\\lor p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\lor ((p\\lor q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot \\lnot (p\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((\\lnot q\\lor p)\\lor p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot q\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\equiv (\\lnot p\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\land \\lnot p)\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\equiv p)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\land \\lnot (p\\equiv q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot (p\\equiv (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot (q\\equiv (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\equiv p)\\supset \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\land ((p\\equiv q)\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\equiv (p\\land (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\equiv q)\\supset (q\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\equiv ((p\\land q)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\land (\\lnot q\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\lor p)\\equiv (p\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\land \\lnot (p\\land p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((\\lnot q\\land p)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\lor q)\\equiv \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot (q\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\equiv \\lnot q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\equiv \\lnot (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot ((p\\supset q)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\land (p\\lor p))\\land q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\land q)\\equiv (p\\lor p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\equiv \\lnot q)\\lor q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\supset ((q\\supset p)\\land q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (p\\land (q\\lor (p\\land p))) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (((q\\lor p)\\lor p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((\\lnot q\\land q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot q\\land \\lnot p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1000, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\land p)\\equiv \\lnot q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot (p\\equiv p)\\equiv p) \\)" "a konklúzió igazságtáblájának főoszlopa: 1100, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot (q\\lor q)\\land p) \\)" "a konklúzió igazságtáblájának főoszlopa: 0010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( \\lnot ((q\\supset q)\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1010, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot p\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\supset (q\\equiv \\lnot p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1110, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((q\\equiv (q\\land p))\\equiv q) \\)" "a konklúzió igazságtáblájának főoszlopa: 0001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\land q)\\lor (q\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 1001, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (\\lnot q\\supset (q\\lor q)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\land (p\\lor q))\\supset q) \\)" "a konklúzió igazságtáblájának főoszlopa: 1101, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( ((p\\land p)\\land (p\\equiv p)) \\)" "a konklúzió igazságtáblájának főoszlopa: 0011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
            ["\\( (q\\supset (p\\lor (p\\equiv q))) \\)" "a konklúzió igazságtáblájának főoszlopa: 1011, míg a hipotézisek igazságtábláinak főoszlopai 0111 és 1111 "]
]}]
