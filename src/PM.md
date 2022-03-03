# Loggbok

Joel Abrahamsson , 2022-03-03

## Inledning

Målet med projektet var att skapa en loggbok som kunde spara och ladda flera loggar samt att man ska kunna spara och ladda själva loggboken. Projektet var uppbyggt enligt MVC principen så att själva modellen av loggboken ska kunna synas av en view med hjälp av controllern.

## Bakgrund

Projektet var uppbyggt enligt MVC principen, så jag började med att göra modellen, d.v.s. varje enskild logg och hela loggboken. Varje logg sparar information om vad meddelandet är, vem som skapat den och när den är skapad. Loggboken är i princip bara en arraylist av loggar med vissa metoder som finns för att man ska kunna hämta information och spara och ladda den i en extern fil. Efter jag gjorde modellen började jag bygga ett GUI med java swing. Jag använde intelliJs swing designer för att göra det lättare och snyggare. Sist kopplade jag ihop modellen och view med hjälp av en kontroller.

## Positiva erfarenheter

Projektets tekniker var OOP, MVC principen och filhantering. OOP och MVC gick väldigt bra att implementera i projektet eftersom att jag har jobbat med det ganska mycket med det och jag tycker om när saker är strukturerade för det gör projektet mer lättläst. Fil hanteringen var lite klurig, men jag fixade det i slutänden. Först så sparade jag inte loggboken i en egen variabel utan jag printade bara den i consolen vilket gjorde att den gick inte att visas i view. Sedan fick jag problem i controllern när jag skulle ladda in en loggbok fil för att jag inte bytte ut värderna när jag laddade in en ny fil från den gamla.

## Negativa erfarenheter

Det var ett par saker som jag skulle gjort annorlunda om jag gjorde om projektet. 1, tiden spenderad på hur GUI:t ser ut, det behövdes bara en simpel view för att visa hur programmet fungerar men även en funktionell. Jag spenderade lite för mycket tid på det för att swing är ganska klurig att få den som man vill. 2, filhanteringen han knappt bli klar eftersom att den klurade lite genom hela projektet och jag spenderade lite för mycket tid på annat så fanns det inte tid för att få den helt funktionell.

## Sammanfattning

Jag har lärt mig ganska mycket av projektet, jag förstår nu controllerns roll i MVC principen vilket jag inte hade helt klart för mig innan. Jag har också lärt mig en del om filhantering eftersom att det var den som strulade mest och var tvungen att spendera mest tid på debugging på den. Jag är ganska nöjd med projektet, den innehåller alla delar som behövdes men det finns utvecklingsmöjligheter. Den första är att programmet kan för tillfället inte ha en tom loggbok utan att kasta en error och det andra är att man kan enbart ladda och spara loggboken i en förinställd fil, det finns inget sätt man kan välja vart man ska spara i view:en.

