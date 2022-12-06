public class Main {
    public static void main(String[] args) {
       //Задача 1.
        //На уроке мы проходили разные типы переменных.
        //
        //Объявите переменные типа int, byte, short, long, float, double. Название переменных может быть любым, но если состоит из двух слов и более, должно придерживаться правила camelCase.
        //
        //Выведите в консоль значение каждой переменной в формате "Значение переменной … с типом … равно …"

        byte a=10;
        short b = 100;
        int c= 1000000;
        float d =1.5F;
        double e=5.4875;
        System.out.println("Значение переменной a с типом byte равно "+a);
        System.out.println("Значение переменной b с типом short равно "+b);
        System.out.println("Значение переменной c с типом int равно "+c);
        System.out.println("Значение переменной d с типом float равно "+d);
        System.out.println("Значение переменной e с типом double равно "+e);
        System.out.println();

        //Задача 2.
        //Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
        //
        //Значения:
        //
        //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        //
        //Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).

        float m=27.12f;
        long n =987678965549L;
        double k= 2.786;
        boolean z=false;
        short x = 569;
        short y= -159;
        int u=27897;
        byte q= 67;

        //Задача 3.
        //Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //
        //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        //
        //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        //
        //Для объявления переменных не используйте тип var.
        byte classLudmilyPavlovny=23;
        byte classAnnySergeevny=27;
        byte classEkaterinyAndreevny=30;
        short totalPaper=480;
        int paperOnOneStedent=totalPaper/(classAnnySergeevny+classEkaterinyAndreevny+classLudmilyPavlovny);
        System.out.println("На каждого ученика расчитано "+ paperOnOneStedent+" листов бумаги");
        System.out.println();

        //Задача 4.
        //Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        //
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //
        //Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        //
        //Для объявления переменных не используйте тип var.
        //
        //
        byte machinePerformance2Minute=16;
        int machinePerformanceOnMinute=machinePerformance2Minute/2;
        int machinePerfomanceOn20Minutes=machinePerformanceOnMinute*20;
        int machinePerfomanceOnDay=machinePerformanceOnMinute*60*24;
        int machinePerfomanceOn3Day=machinePerfomanceOnDay*3;
        int machinePerfomanceOnMounth=machinePerfomanceOnDay*30;
        System.out.println("За 20 минут машина произвела бутылок " +machinePerfomanceOn20Minutes+ " штук ");
        System.out.println("За сутки машина произвела бутылок " +machinePerfomanceOnDay+" штук ");
        System.out.println("За 3 дня машина произвела бутылок " +machinePerfomanceOn3Day+ " штук ");
        System.out.println("За месяц машина произвела бутылок " +machinePerfomanceOnMounth+ " штук ");
        System.out.println();
        //Задача 5.
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        //
        //Выведите результат задачи в консоль в формате "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".

        byte totalColor=120;
        byte whiteColorOnClass=2;
        byte brownColorOnClass=4;
        int numberOfClasses= totalColor/(whiteColorOnClass+brownColorOnClass);
        int whiteColor=whiteColorOnClass*numberOfClasses;
        int brownColor=brownColorOnClass*numberOfClasses;
        System.out.println("В школе, где " +numberOfClasses+" классов, нужно "+whiteColor+" банок белой краски и "+ brownColor+" банок коричневой краски");
        System.out.println();

        //Задача 6.
        //Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
        //
        //То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому, что и сколько они едят.
        //
        //Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        //
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //
        //Результат напечатайте в консоль.
        //
        //Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом), то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм, то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.

        byte bananasPortion=80;
        byte milkPortion=105;
        byte iceCreamSundaePortion=100;
        byte eggPortion=70;
        double recipeGram=bananasPortion*5+milkPortion*2+iceCreamSundaePortion*2+eggPortion*4;
        System.out.println(recipeGram);
        double recipeKg= recipeGram/1000;
        System.out.println(recipeKg);
        System.out.println();

        //Задача 7.
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        //
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        //
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //
        //Результаты всех подсчетов выведите в консоль.

        byte objectiveKg=7;
        int objectiveGram=objectiveKg*1000;
        short loseWeightLightGram=250;
        short loseWeightHighGram=500;
        int daysOnLoseWeightLight=objectiveGram/loseWeightLightGram;
        int daysOnLoseWeightHigh=objectiveGram/loseWeightHighGram;
        int avarageSpeed=(daysOnLoseWeightLight+daysOnLoseWeightHigh)/2;
        System.out.println("На похудение по "+loseWeightLightGram+" грамм спортсмену понадобиться "+daysOnLoseWeightLight+" дней");
        System.out.println("На похудение по "+loseWeightHighGram+" грамм спортсмену понадобиться "+daysOnLoseWeightHigh+" дней");
        System.out.println("В среднем на похудение спортсмену понадобиться "+avarageSpeed+" день");
        System.out.println();

        //Задача 8.
        //Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц
        //
        //Денис получает 83 690 рублей в месяц
        //
        //Кристина получает 76 230 рублей в месяц
        //
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        //Выведите в консоль информацию по каждому сотруднику.
        //
        //Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".
        int salaryMashaMonthToday=67760;
        int salaryDenisMonthToday=83690;
        int salaryKristinaMonthToday=76230;
        double salaryMashaMonthTomorrow=salaryMashaMonthToday*1.1;
        double differenceSalaryYearMasha=salaryMashaMonthTomorrow*12-salaryMashaMonthToday*12;
        double salaryDenisMonthTomorrow=salaryDenisMonthToday*1.1;
        double differenceSalaryYearDenis=salaryDenisMonthTomorrow*12-salaryDenisMonthToday*12;
        double salaryKristinaMonthTomorrow=salaryKristinaMonthToday*1.1;
        double differenceSalaryYearKristina=salaryKristinaMonthTomorrow*12-salaryKristinaMonthToday*12;
        System.out.println("Маша теперь получает "+salaryMashaMonthTomorrow+" рублей.Годовой доход вырос на "+differenceSalaryYearMasha+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisMonthTomorrow+" рублей.Годовой доход вырос на "+differenceSalaryYearDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryKristinaMonthTomorrow+" рублей.Годовой доход вырос на "+differenceSalaryYearKristina+" рублей");














    }
}