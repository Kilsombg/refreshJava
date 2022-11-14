package laboratory_B.lab4;

/*
1. Създайте абстрактен клас Стоки, съдържащ информация за артикули в търговска верига: цена и номер на артикул.
 Създайте необходимите конструктори и get/set методи. В класа да се реализира абстрактен метод
 public abstract double checkPromo(), който изчислява нова цена при даден процент отстъпка.
 Нека класът Стоки да се наследи от класовете Книги и Телевизори, съдържащи информация съответно за автор и заглавие,
 както и за производител, модел и мощност. Създайте интерфейс ElectricalAppliance, който има 1 абстрактен метод,
 изчисляващ разхода на  електроенергия. Нека класът Телевизори да имплементира този интерфейс.
 Създайте ваши изключения PriceException и PowerException като предефинирате метода getMessage().
 Създайте тестов клас, в който да демонстрират работоспособността на програмата, създавайки обекти
 от тип Книга и Телевизор. Нека промоционалната цена на телевизорите да е намалена с 9 %, а на книгите с 15 %.


2. Да се реализира клас Building, който описва дадена сграда с височина (цяло число метри),
площ (число с плаваща запетая в кв.м) и адрес (низ с произволна дължина). Да се реализира производен
клас  House,  който  допълнително  задава  брой  етажи  (цяло  число)  и
име  на собственик (низ с произволна дължина). За класовете да се реализират:
подходящи селектори и мутатори; методи за въвеждане от клавиатура и извеждане на екрана;
метод, който по даден масив от къщи намира най-просторната къща, т.е. тази с най-голяма средна височина на етаж.
Създайте подходящи ваши изключения. Създайте клас с main метод, в който да тествате работоспособността на
приложението.
*/