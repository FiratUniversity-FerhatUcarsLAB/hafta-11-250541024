Kod: zoop metodu fred ve bob parametrelerini alıyor. Soru: zoop ikinci kez çağrıldığında durum nedir?.

Analiz:

main: zoop("just for", 5) çağırır (1. çağrı).

Bu çağrı biter.

main: clink(2*2) yani clink(4) çağırır.

clink: "It's " yazar ve zoop("breakfast", 4) çağırır (2. çağrı).

Stack Diyagramı (2. zoop çağrısı anında):

main:

args: (boş dizi)

bizz: 5

buzz: 2

clink:

fork: 4

zoop:

fred: "breakfast"

bob: 4

Çıktı:

zoop: "just for" -> bob (5) == 5 -> ping("not ") -> "any not more "

clink: "It's " -> 2. zoop: "breakfast" -> bob (4) != 5 -> else -> "!"

Tam Çıktı:

Plaintext

just for
any not more 
It's breakfast
!
