[
 {:question "Válassza ki azokat a karaktersorozatokat, melyek formulái annak a nulladrendű nyelvnek, ahol \\(Con = \\{p,q,r\\}\\)! (Teljes zárójelezett alakkal dolgozunk!)"
  :good [
    "\\((p\\land (p\\equiv (p\\supset p)))\\)"
    "\\((r\\equiv (r\\supset (r\\lor p)))\\)"
    "\\((q\\equiv ((q\\supset p)\\equiv q))\\)"
    "\\((q\\land ((p\\land r)\\equiv q))\\)"
    "\\((((q\\equiv p)\\lor p)\\equiv r)\\)"
    "\\(((p\\equiv r)\\supset (q\\lor p))\\)"
    "\\((q\\land (p\\lor (q\\equiv p)))\\)"
    "\\(\\lnot ((r\\supset q)\\land \\lnot p)\\)"
    "\\(((p\\lor r)\\equiv (q\\equiv p))\\)"
    "\\(((p\\equiv (q\\land q))\\equiv q)\\)"
    "\\(((p\\land (q\\land q))\\land \\lnot r)\\)"
    "\\((r\\lor (p\\lor (p\\land r)))\\)"
    "\\(((p\\land (q\\lor r))\\land r)\\)"
    "\\(((r\\lor (q\\lor q))\\lor q)\\)"
    "\\((\\lnot (q\\land (p\\lor r))\\lor \\lnot q)\\)"
    "\\(((r\\land (r\\equiv q))\\equiv p)\\)"
    "\\((r\\supset ((p\\supset q)\\land q))\\)"
    "\\(((p\\land p)\\land (q\\supset q))\\)"
    "\\((r\\land ((p\\land p)\\supset r))\\)"
    "\\((r\\supset ((p\\land q)\\supset q))\\)"
    "\\((p\\land \\lnot (p\\lor (r\\equiv p)))\\)"
    "\\(((r\\equiv r)\\supset (p\\land p))\\)"
    "\\(((q\\land (r\\land p))\\equiv q)\\)"
    "\\((\\lnot (p\\supset q)\\equiv (q\\equiv p))\\)"
    "\\(((q\\lor (q\\equiv p))\\supset p)\\)"
    "\\(\\lnot (\\lnot (\\lnot (r\\equiv p)\\supset p)\\equiv p)\\)"
    "\\((p\\supset (p\\equiv (r\\land r)))\\)"
    "\\(((q\\land (q\\lor q))\\lor r)\\)"
    "\\(((q\\lor q)\\equiv \\lnot q)\\)"
    "\\(((r\\land q)\\land \\lnot q)\\)"
    "\\((p\\equiv ((p\\supset q)\\supset p))\\)"
    "\\((((q\\supset q)\\land p)\\lor q)\\)"
    "\\(((p\\equiv q)\\equiv (q\\equiv r))\\)"
    "\\((q\\lor ((\\lnot r\\land q)\\supset r))\\)"
    "\\(p\\)" ]
  :wrong [
    ["\\((x\\land ((y\\supset x)\\lor y))\\)" "az \\(x\\) és \\(y\\) nem nemlogikai konstansok"]
    ["\\(x\\)" "az \\(x\\) nem nemlogikai konstans"]
    ["\\(\\gamma\\)" "a \\(\\gamma\\) nem nemlogikai konstans"]
    ["\\(((p\\equiv q)\\equiv (q\\equiv \\beta))\\)" "a \\(\\beta\\) nem nemlogikai konstans"]
    ["\\(((A\\lor B)\\equiv (B\\equiv A))\\)" "az \\(A\\) és \\(B\\) nem nemlogikai konstansok"]

    ["\\((((q\\subset q)\\land p)\\lor q)\\)" "a \\(\\subset\\) nem logikai konstans"]
    ["\\((p\\not\\equiv ((p\\supset q)\\supset p))\\)" "a \\(\\not\\equiv\\) nem logikai konstans"]
    ["\\((r\\lor (p\\lor (p\\& r)))\\)" "a \\(\\&\\) nem logikai konstans"]
    ["\\((r+(p+(p\\& r)))\\)" "a \\(+\\) és a \\(\\&\\) nem logikai konstansok"]
    ["\\(((p\\leftrightarrow r)\\rightarrow (q\\lor p))\\)" "a \\(\\leftrightarrow\\) és a \\(\\rightarrow\\) nem logikai konstansok"]
    ["\\((p\\land \\sim (p\\lor (r\\equiv p)))\\)" "a \\(\\sim\\) nem logikai konstans"]
    ["\\(((p\\equiv r)\\supset \\overline{(q\\lor p)})\\)" "a tagadást nem felülvonással jelöljük"]
    ["\\((q\\lor (p\\,r))\\)" "a konjunkciót nem az egymás mellé írás jelöli"]
    ["\\(((q\\cdot (r\\cdot p))\\equiv q)\\)" "a \\((\\cdot\\)) nem logikai konstans"]
    ["\\(p\\supset q\\)" "az implikáció műveletéhez tartozik egy zárójelpár"]
    ["\\((p\\equiv q)\\equiv (q\\equiv r)\\)" "hiányzik a külső zárójelpár"]
    ["\\(\\lnot (r\\land (r\\equiv q))\\equiv p\\)" "hiányzik a külső zárójelpár."]
    ["\\(\\lnot (r\\supset q)\\land \\lnot p)\\)" "a zárójelek nincsenek párban"]
    ["\\(((q\\supset q)\\land p)\\lor q)\\)" "a zárójelek nincsenek párban"]
    ["\\((p\\supset (p\\equiv (r\\land r))\\)" "a zárójelek nincsenek párban"]
    ["\\(((q\\land (r\\lnot\\land p))\\equiv q)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((q\\lor q)\\lnot\\equiv \\lnot q)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((q\\land r\\land p)\\equiv q)\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((r\\lor p\\lor (p\\land r))\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((\\lnot p)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((p)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((\\lor p\\lor q)\\)" "a \\(\\lor\\) két részformulát köt össze, és egy zárójelpár tartozik hozzá"]
]}
 {:question "Válassza ki azokat a karaktersorozatokat, melyek formulái annak a nulladrendű nyelvnek, ahol \\(Con = \\{x,y,z\\}\\)! (Teljes zárójelezett alakkal dolgozunk!)"
  :good [
    "\\((x\\equiv (z\\supset y))\\)"
    "\\((z\\land ((y\\supset y)\\lor y))\\)"
    "\\(((x\\supset \\lnot x)\\supset x)\\)"
    "\\((z\\supset (z\\equiv \\lnot (z\\supset x)))\\)"
    "\\((x\\equiv (x\\land \\lnot z))\\)"
    "\\((y\\lor ((z\\lor y)\\supset y))\\)"
    "\\((x\\supset (\\lnot (z\\supset z)\\land x))\\)"
    "\\((x\\lor (y\\supset (z\\supset x)))\\)"
    "\\((\\lnot (z\\equiv x)\\supset (x\\lor x))\\)"
    "\\(((y\\land y)\\lor (y\\land y))\\)"
    "\\(\\lnot (\\lnot (\\lnot (y\\land y)\\lor y)\\land x)\\)"
    "\\((y\\equiv (z\\land (z\\land z)))\\)"
    "\\(((z\\lor (z\\land y))\\equiv x)\\)"
    "\\(((x\\land (z\\supset x))\\land z)\\)"
    "\\((y\\equiv (y\\equiv \\lnot (x\\equiv z)))\\)"
    "\\(((z\\supset z)\\lor (y\\land x))\\)"
    "\\(((y\\lor x)\\lor \\lnot (x\\equiv x))\\)"
    "\\((\\lnot (z\\land (x\\lor y))\\equiv z)\\)"
    "\\(((y\\lor (x\\equiv z))\\equiv x)\\)"
    "\\((z\\lor (\\lnot p\\land x))\\)"
    "\\((\\lnot (z\\equiv z)\\land y)\\)"
    "\\((\\lnot (\\lnot q\\land y)\\supset y)\\)"
    "\\(((z\\land (y\\equiv y))\\land y)\\)"
    "\\(((x\\supset (y\\land y))\\land x)\\)"
    "\\((((\\lnot y\\land y)\\land y)\\supset x)\\)"
    "\\((((x\\supset y)\\supset z)\\lor z)\\)"
    "\\(((y\\land \\lnot z)\\lor x)\\)"
    "\\((x\\land ((\\lnot z\\land z)\\supset x))\\)"
    "\\(((y\\land (z\\lor y))\\equiv z)\\)"
    "\\(((y\\lor (x\\lor y))\\supset x)\\)"
    "\\(((y\\supset (y\\equiv x))\\land x)\\)"
    "\\(((y\\lor x)\\equiv (x\\land x))\\)"
    "\\((x\\land ((y\\equiv y)\\equiv z))\\)"
    "\\(((z\\land (x\\lor x))\\equiv y)\\)"
    "\\(((z\\lor (y\\equiv z))\\land y)\\)"
    "\\(((y\\supset (y\\equiv y))\\supset x)\\)"
    "\\(((y\\land z)\\land (x\\equiv z))\\)"
    "\\((y\\lor (z\\supset (y\\equiv z)))\\)"
    "\\(\\lnot ((x\\land z)\\lor z)\\)"
    "\\((y\\land (\\lnot x\\equiv (z\\land y)))\\)"
    "\\((((x\\equiv y)\\supset y)\\land x)\\)"
    "\\(((z\\supset z)\\supset (x\\supset y))\\)"
    "\\(((y\\supset \\lnot y)\\supset y)\\)"
    "\\((((x\\lor z)\\land z)\\equiv z)\\)"
    "\\((((y\\land x)\\equiv y)\\lor z)\\)"
    "\\((z\\supset (z\\equiv (y\\lor y)))\\)"
    "\\(((z\\land (\\lnot x\\equiv z))\\lor x)\\)"
    "\\((y\\supset ((x\\supset x)\\lor x))\\)"
    "\\(\\lnot ((x\\equiv x)\\land y)\\)"
    "\\((y\\lor (z\\equiv (z\\equiv z)))\\)"
    "\\(((y\\land z)\\lor (x\\equiv y))\\)"
    "\\((y\\supset (\\lnot p\\land x))\\)"
    "\\(((y\\lor y)\\land (y\\equiv x))\\)"
    "\\((((x\\equiv x)\\lor y)\\supset x)\\)"
    "\\((\\lnot ((y\\land z)\\land x)\\supset y)\\)"
    "\\((y\\equiv ((x\\land z)\\lor x))\\)"
    "\\(((z\\supset (y\\equiv x))\\supset y)\\)"
    "\\((((x\\land y)\\supset x)\\land z)\\)"
    "\\(((x\\equiv (x\\land y))\\land z)\\)"
    "\\((z\\land ((y\\land x)\\supset y))\\)"
    "\\((((z\\lor y)\\equiv z)\\equiv x)\\)"
    "\\(((x\\land z)\\lor (x\\equiv z))\\)"
    "\\(((y\\supset x)\\equiv (y\\land z))\\)"
    "\\(((x\\supset (z\\lor z))\\equiv z)\\)"
    "\\((y\\lor ((z\\equiv z)\\supset x))\\)"
    "\\((\\lnot (z\\land x)\\supset \\lnot z)\\)"
    "\\(((z\\lor y)\\equiv (z\\lor z))\\)"
    "\\((\\lnot (y\\supset \\lnot z)\\equiv z)\\)"
    "\\(\\lnot (z\\lor (x\\supset x))\\)"
    "\\(\\lnot ((x\\supset x)\\land y)\\)" ]
  :wrong [
    ["\\((p\\land ((q\\supset p)\\lor q))\\)" "a \\(q\\) és \\(p\\) nem nemlogikai konstansok"]
    ["\\(r\\)" "az \\(r\\) nem nemlogikai konstans"]
    ["\\(\\gamma\\)" "a \\(\\gamma\\) nem nemlogikai konstans"]
    ["\\(((x\\equiv y)\\equiv (y\\equiv \\beta))\\)" "a \\(\\beta\\) nem nemlogikai konstans"]
    ["\\(((A\\lor B)\\equiv (B\\equiv A))\\)" "az \\(A\\) és \\(B\\) nem nemlogikai konstansok"]

    ["\\((((y\\subset y)\\land x)\\lor y)\\)" "a \\(\\subset\\) nem logikai konstans"]
    ["\\((x\\not\\equiv ((x\\supset y)\\supset x))\\)" "a \\(\\not\\equiv\\) nem logikai konstans"]
    ["\\((z\\lor (x\\lor (x\\& z)))\\)" "a \\(\\&\\) nem logikai konstans"]
    ["\\((z+(x+(x\\& z)))\\)" "a \\(+\\) és a \\(\\&\\) nem logikai konstansok"]
    ["\\(((x\\leftrightarrow z)\\rightarrow (y\\lor x))\\)" "a \\(\\leftrightarrow\\) és a \\(\\rightarrow\\) nem logikai konstansok"]
    ["\\((x\\land \\sim (x\\lor (z\\equiv x)))\\)" "a \\(\\sim\\) nem logikai konstans"]
    ["\\(((x\\equiv z)\\supset \\overline{(y\\lor x)})\\)" "a tagadást nem felülvonással jelöljük"]
    ["\\((y\\lor (x\\,z))\\)" "a konjunkciót nem az egymás mellé írás jelöli"]
    ["\\(((y\\cdot (z\\cdot x))\\equiv y)\\)" "a \\((\\cdot\\)) nem logikai konstans"]
    ["\\(x\\supset y\\)" "az implikáció műveletéhez tartozik egy zárójelpár"]
    ["\\((x\\equiv y)\\equiv (y\\equiv z)\\)" "hiányzik a külső zárójelpár"]
    ["\\(\\lnot (z\\land (z\\equiv y))\\equiv x\\)" "hiányzik a külső zárójelpár."]
    ["\\(\\lnot (z\\supset y)\\land \\lnot x)\\)" "a zárójelek nincsenek párban"]
    ["\\((((y\\supset y)\\land x)\\lor y)\\)" "a zárójelek nincsenek párban"]
    ["\\((x\\supset (x\\equiv (z\\land z))\\)" "a zárójelek nincsenek párban"]
    ["\\(((y\\land (z\\lnot\\land x))\\equiv y)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((y\\lor y)\\lnot\\equiv \\lnot y)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((y\\land z\\land x)\\equiv y)\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((z\\lor x\\lor (x\\land z))\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((\\lnot x)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((x)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((\\lor x\\lor y)\\)" "a \\(\\lor\\) két részformulát köt össze, és egy zárójelpár tartozik hozzá"] ]}
 {:question "Válassza ki azokat a karaktersorozatokat, melyek formulái annak a nulladrendű nyelvnek, ahol \\(Con = \\{\\alpha,\\beta,\\gamma\\}\\)! (Teljes zárójelezett alakkal dolgozunk!)"
  :good [
    "\\((((\\gamma\\supset\\beta)\\supset\\beta)\\land\\beta)\\)"
    "\\((\\lnot (\\alpha\\land \\alpha)\\supset (\\beta\\equiv \\gamma))\\)"
    "\\((\\beta\\lor (\\beta\\equiv (\\gamma\\equiv \\gamma)))\\)"
    "\\(((\\beta\\land \\gamma)\\land \\alpha)\\)"
    "\\((\\alpha\\lor (\\alpha\\lor \\alpha))\\)"
    "\\((\\beta\\equiv (\\alpha\\supset (\\beta\\supset\\beta)))\\)"
    "\\((\\alpha\\supset ((\\beta\\equiv \\alpha)\\supset \\gamma))\\)"
    "\\((\\lnot (\\beta\\lor (\\gamma\\lor \\alpha))\\land \\alpha)\\)"
    "\\((\\lnot (\\alpha\\equiv \\lnot \\gamma)\\land\\beta)\\)"
    "\\(((\\alpha\\lor \\gamma)\\equiv (\\beta\\land \\alpha))\\)"
    "\\(((\\gamma\\land (\\beta\\lor \\gamma))\\land \\alpha)\\)"
    "\\(\\lnot (\\alpha\\equiv (\\gamma\\equiv (\\gamma\\supset \\gamma)))\\)"
    "\\(((\\gamma\\equiv\\beta)\\supset (\\gamma\\equiv\\beta))\\)"
    "\\((\\beta\\supset ((\\beta\\supset \\alpha)\\supset \\gamma))\\)"
    "\\(((\\beta\\land (\\gamma\\land \\alpha))\\land \\gamma)\\)"
    "\\((\\alpha\\land (\\alpha\\equiv \\lnot \\alpha))\\)"
    "\\((((\\gamma\\equiv \\lnot \\gamma)\\equiv \\gamma)\\lor\\beta)\\)"
    "\\((\\alpha\\lor ((\\gamma\\equiv \\gamma)\\supset \\alpha))\\)"
    "\\((((\\alpha\\supset\\beta)\\lor \\gamma)\\land \\gamma)\\)"
    "\\(((\\alpha\\land \\alpha)\\land (\\alpha\\equiv \\gamma))\\)"
    "\\((((\\beta\\supset \\alpha)\\supset \\alpha)\\supset \\alpha)\\)"
    "\\((\\lnot (\\alpha\\lor \\alpha)\\lor (\\gamma\\lor\\beta))\\)"
    "\\((\\gamma\\land (\\gamma\\land \\lnot\\beta))\\)"
    "\\((\\alpha\\supset ((\\alpha\\land\\beta)\\land \\gamma))\\)"
    "\\((\\alpha\\equiv (\\alpha\\supset (\\alpha\\supset \\alpha)))\\)"
    "\\((\\alpha\\land ((\\beta\\supset\\beta)\\land \\gamma))\\)"
    "\\(((\\beta\\equiv \\gamma)\\equiv (\\gamma\\land\\beta))\\)"
    "\\((\\alpha\\equiv \\lnot (\\beta\\equiv (\\beta\\lor \\gamma)))\\)"
    "\\(((\\gamma\\land (\\gamma\\equiv \\gamma))\\supset \\alpha)\\)"
    "\\((\\lnot \\alpha\\lor (\\alpha\\land\\beta))\\)"
    "\\(\\lnot ((\\alpha\\land \\gamma)\\supset \\gamma)\\)"
    "\\((\\alpha\\supset (\\lnot q\\supset\\beta))\\)"
    "\\((\\beta\\supset ((\\alpha\\land \\gamma)\\land \\gamma))\\)"
    "\\(((\\gamma\\supset \\lnot\\beta)\\equiv \\alpha)\\)"
    "\\((\\beta\\supset (\\gamma\\equiv (\\alpha\\lor\\beta)))\\)"
    "\\((((\\beta\\supset\\beta)\\lor\\beta)\\lor\\beta)\\)"
    "\\((\\gamma\\equiv \\lnot (\\beta\\supset (\\gamma\\equiv \\gamma)))\\)"
    "\\((\\alpha\\lor (\\beta\\equiv (\\alpha\\land \\gamma)))\\)"
    "\\((((\\beta\\supset \\gamma)\\land \\lnot \\alpha)\\land \\alpha)\\)"
    "\\(((\\gamma\\lor (\\alpha\\lor \\alpha))\\equiv \\gamma)\\)"
    "\\((\\gamma\\equiv (\\alpha\\equiv (\\beta\\equiv \\gamma)))\\)"
    "\\((\\alpha\\equiv ((\\gamma\\land \\alpha)\\supset \\gamma))\\)"
    "\\(((\\beta\\supset \\alpha)\\equiv (\\gamma\\supset \\gamma))\\)"
    "\\(((\\alpha\\equiv\\beta)\\lor \\lnot\\beta)\\)"
    "\\(((\\alpha\\lor \\alpha)\\equiv \\lnot \\alpha)\\)"
    "\\(((\\beta\\supset (\\beta\\lor \\alpha))\\equiv \\alpha)\\)"
    "\\((\\alpha\\equiv (\\gamma\\supset \\lnot (\\gamma\\lor \\gamma)))\\)"
    "\\(((\\alpha\\supset\\beta)\\equiv (\\beta\\land \\gamma))\\)"
    "\\(((\\gamma\\land \\gamma)\\equiv (\\gamma\\land \\gamma))\\)"
    "\\((((\\gamma\\lor \\gamma)\\equiv \\gamma)\\lor \\alpha)\\)"
    "\\(((\\gamma\\supset \\gamma)\\supset (\\gamma\\lor\\beta))\\)"
    "\\((((\\gamma\\supset\\beta)\\lor \\lnot \\alpha)\\land \\gamma)\\)"
    "\\((((\\alpha\\equiv \\gamma)\\supset \\gamma)\\supset \\alpha)\\)"
    "\\(((\\alpha\\equiv (\\alpha\\supset \\gamma))\\supset \\alpha)\\)"
    "\\((\\lnot \\lnot r\\lor\\beta)\\)"
    "\\((((\\alpha\\land \\alpha)\\land \\gamma)\\lor \\gamma)\\)" ]
  :wrong [
    ["\\((p\\land ((q\\supset p)\\lor q))\\)" "a \\(q\\) és \\(p\\) nem nemlogikai konstansok"]
    ["\\(r\\)" "az \\(r\\) nem nemlogikai konstans"]
    ["\\(x\\)" "az \\(x\\) nem nemlogikai konstans"]
    ["\\(((\\alpha\\equiv \\beta)\\equiv (\\varphi\\equiv \\beta))\\)" "az \\(\\varphi\\) nem nemlogikai konstans"]
    ["\\(((A\\lor B)\\equiv (B\\equiv A))\\)" "az \\(A\\) és \\(B\\) nem nemlogikai konstansok"]

    ["\\((((\\beta\\subset \\beta)\\land \\alpha)\\lor \\beta)\\)" "a \\(\\subset\\) nem logikai konstans"]
    ["\\((\\alpha\\not\\equiv ((\\alpha\\supset \\beta)\\supset \\alpha))\\)" "a \\(\\not\\equiv\\) nem logikai konstans"]
    ["\\((\\gamma\\lor (\\alpha\\lor (\\alpha\\& \\gamma)))\\)" "a \\(\\&\\) nem logikai konstans"]
    ["\\((\\gamma+(\\alpha+(\\alpha\\& \\gamma)))\\)" "a \\(+\\) és a \\(\\&\\) nem logikai konstansok"]
    ["\\(((\\alpha\\leftrightarrow \\gamma)\\rightarrow (\\beta\\lor \\alpha))\\)" "a \\(\\leftrightarrow\\) és a \\(\\rightarrow\\) nem logikai konstansok"]
    ["\\((\\alpha\\land \\sim (\\alpha\\lor (\\gamma\\equiv \\alpha)))\\)" "a \\(\\sim\\) nem logikai konstans"]
    ["\\(((\\alpha\\equiv \\gamma)\\supset \\overline{(\\beta\\lor \\alpha)})\\)" "a tagadást nem felülvonással jelöljük"]
    ["\\((\\beta\\lor (\\alpha\\,\\gamma))\\)" "a konjunkciót nem az egymás mellé írás jelöli"]
    ["\\((\\beta\\cdot (\\gamma\\cdot \\alpha))\\equiv (\\beta)\\)" "a \\((\\cdot\\)) nem logikai konstans"]
    ["\\(\\alpha\\supset \\beta\\)" "az implikáció műveletéhez tartozik egy zárójelpár"]
    ["\\((\\alpha\\equiv \\beta)\\equiv (\\beta\\equiv \\gamma)\\)" "hiányzik a külső zárójelpár"]
    ["\\(\\lnot (\\gamma\\land (\\gamma\\equiv \\beta))\\equiv \\alpha\\)" "hiányzik a külső zárójelpár."]
    ["\\(\\lnot (\\gamma\\supset \\beta)\\land \\lnot \\alpha)\\)" "a zárójelek nincsenek párban"]
    ["\\(((\\beta\\supset \\beta)\\land \\alpha)\\lor \\beta)\\)" "a zárójelek nincsenek párban"]
    ["\\((\\alpha\\supset (\\alpha\\equiv (\\gamma\\land \\gamma))\\)" "a zárójelek nincsenek párban"]
    ["\\(((\\beta\\land (\\gamma\\lnot\\land \\alpha))\\equiv \\beta)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((\\beta\\lor \\beta)\\lnot\\equiv \\lnot \\beta)\\)" "a tagadást nemlogikai konstansnak, vagy zárójelnek kell követnie"]
    ["\\(((\\beta\\land z\\land \\alpha)\\equiv \\beta)\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((\\gamma\\lor \\alpha\\lor (\\alpha\\land \\gamma))\\)" "nem minden kétargumentumú logikai konstanshoz tartozik zárójelpár"]
    ["\\((\\lnot \\alpha)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((\\alpha)\\)" "feleslegesen nem zárójelezünk, a valódi logikai konstansok száma meghatározza a zárójelek számát"]
    ["\\((\\lor \\alpha\\lor \\beta)\\)" "a \\(\\lor\\) két részformulát köt össze, és egy zárójelpár tartozik hozzá"] ]}
]
