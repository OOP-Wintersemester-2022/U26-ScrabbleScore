# U10-1 | Delete Character

Schreiben Sie eine Klasse `Remover `mit einer statischen Methode

`public static String removeOccurrences(String str, char ch)`

die alle Zeichen `ch `aus `str `löscht und das Ergebnis wie folgend
zurückgibt:

```
Remover.removeOccurrences("This is a test", `t`)
```

**gibt zurück:** `This is a es`

```
Remover.removeOccurrences("Summer is here", `e`)

```

**gibt zurück:** `Summr is hr`

```
Remover.removeOccurrences("—0—", `-`)
 ```
 
 **gibt zurück:** `0`

Beachten Sie, dass Sie kein Objekt einer Klasse erstellen müssen, wenn
Sie lediglich statische Methoden (wie in diesem Fall) nutzen.