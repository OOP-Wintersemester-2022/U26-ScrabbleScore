# U26 | Scrabble Score

In Scrabble ist jedem Buchstaben eine Punktzahl zugeordnet, die von
seiner Häufigkeit in der entsprechenden Sprache abhängt.

Für die englische Version gelten die folgenden Punktzahlen:

| **Punkte** |          **Buchstaben**            |
| --- | --- |
| 1 |             A, E, I, L, N, O, R, S, T, U    | 
| 2  |                        D, G                |
| 3  |                     B, C, M, P             | 
| 4    |                 F, H, V, W, Y            | 
| 5   |                        K                  | 
| 8   |                       J, X                |  
| 10    |                     Q, Z                | 

Das Wort **FARM** ist folglich 9 Punkte wert: 4 für das F, jeweils einen für A und R und 3 für das M.

Schreiben Sie eine Klasse `ScrabbleScoreChecker `mit einer statischen
Methode

```
public static int getWordScore(String str)
```

welche die Punkte für ein übergebenes Wort zurückgibt. Um zu überprüfen, wie viele Punkte ein einzelner `char `bringt, können
Sie die einzelnen Buchstaben in jeweils einem String pro Gruppe
abspeichern, z.B.: 

```
private final String onePointChars = "AEILNORSTU";
```

und mit der `indexOf()`-Methode der `String`-Klasse überprüfen, an welcher Stelle ein bestimmter `char` darin vorkommt (gibt -1 zurück, falls er nicht darin vorkommt).
