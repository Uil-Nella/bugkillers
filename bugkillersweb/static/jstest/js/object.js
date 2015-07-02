/**
 * Created by dongbin on 2015/6/15.
 */

//创建的对象的基本方法

//1.Object方式
var o1 = new Object();
o1.name = 'dongbin';
//2.对象字面量的方式
var o2 = {
    'name': 'dongbin'
};
o2.name = 'dongbin2';


//Js OO程序设计 之 创建对象的模式 大部门来自《JavaScript高级程序设计》第三版 其中也有自己的总结

//1.工厂模式：
function createPerson(name, age, job) {
    var o = new Object();
    o.name = name;
    o.age = age;
    o.job = job;
    o.sayName = function () {
        alert(this.name);
    };
    return o;
}
var person1 = createPerson('dongbin', '25', 'Jser');
console.log('工厂模式：' + person1);

//2.构造函数模式：首字母大写 以这种方式定义的构造函数是定义在Global对象（在浏览器中是window对象）
function Person(name, age, job) {
    this.name = name;
    this.age = age;
    this.job = job;
    this.sayName = function () {
        alert(this.name);
    };
}
var person2 = new Person('dongbin', '25', 'Tester');
console.log('构造函数模式：' + person2 + ',' + (person2.constructor == Person));
console.log((person2 instanceof Person) + ',' + (person2 instanceof Object));
console.log('创建自定义的构造函数意味着将来可以将它的实例标识为一种特定的类型；而这正是构造函数模式胜过工厂模式的地方')
console.log('构造函数模式应该将方法定义成全局函数，来避免同样的函数重复写多次；' +
    '那么问题来了，在全局作用域中定义的函数实际上只能被某个对象调用，这让全局作用域有点名不副实' +
    '更让人无法接受的是，如果对象需要定义很多方法，那么就要定义很多个全局函数，于是我们这个自定义的' +
    '引用类型就丝毫没有封装性可言了，好在这些问题可以通过原型模式来解决');

//3.原型模式：
function Person() {
}
Person.prototype.name = "dongbin";
Person.prototype.age = "25";
Person.prototype.job = "Coder";
Person.prototype.sayName = function () {
    alert(this.name);
};
/*
 * 上面的代码也可以这样写：使用对象字面量的方式重写原型 但是这样写后 建议一定要在重写prototype后创建实例
 * Person.prototype = {
 *   constructor:Person,//如果不这样的话，构造函数将指向Object
 *   name:'dongbin',
 *   sayName:function(){
 *       alert(this.name);
 *   }
 * }
 * //这相当于重写了prototype，在这之前创建对象的原型指针不会指向这个prototype
 */
var person3 = new Person();
person3.sayName();
var person4 = new Person();
person4.sayName();
console.log(person3.sayName == person4.sayName);
console.log(Person.prototype.isPrototypeOf(person3));//实例内部是否有指向Person.prototype的指针 有返回true
//利用Object.getPrototypeOf 可以方便的得到实例的原型 这在用原型实现继承的情况之下是非常重要的
console.log(Object.getPrototypeOf(person3) == Person.prototype);
//搜索属性的时候 先在实例中找 找不到 再到原型中找 使用delete 可以删除实例属性 继而可以访问到同名的原型属性

//判断一个属性来自实例中还是原型中 可以使用hasOwnProperty() 属性存在实例中 返回true
console.log(person3.hasOwnProperty('name'));
//使用in 判断 只要在实例或者原型中存在 就返回true
console.log("name" in person3);
//结合使用in 和 hasOwnProperty 可以判断是否来自原型
function hasPrototypeProperty(object, name) {
    return !object.hasOwnProperty(name) && (name in object);
}
//ECMAScript5的Object.keys()方法可以获取对象所有可枚举的实例的属性 不管是实例本身的还是原型的
//如果想得到所有的实例属性，无论是否可枚举，都可以使用Object.getOwnPropertyNames()方法
var keys = Object.getOwnPropertyNames(Person.prototype);
console.log(keys);

//原型模式的弊端：原型中的属性是被很多实例共享的，这种共享对于函数非常合适。对于那些包含基本值的属性倒也说的过去
//通过在实例上添加一个同名属性，可以隐藏原型中的对应属性。然而，对于包含引用类型的属性来说，问题
//就比较突出了：比如prototype中有一个属性是数组，那么实例1 通过 实例.属性.push('test')改变了该属性值，
//但是，这对于其他实例对象也是有影响的！

//4.组合使用构造函数模式和原型模式：这种模式是目前ECMAScript中使用最广泛，认同度最高的一种创建自定义类型的方法
//可以说是用来定义引用类型的一种默认模式
function Person(name, age, job) {
    this.name = name;
    this.age = age;
    this.job = job;
    this.friends = ['Ben', 'Tom'];
}
Person.prototype = {
    constructor: Person,
    sayName: function () {
        alert(this.name);
    }
};

var p1 = new Person("Dongbin", "25", "coder");
var p2 = new Person("Dongbin2", "25", "coder");
p1.friends.push('Mary');
alert(p1.friends);//有Mary
alert(p2.friends);//没有Mary
//构造函数和原型混成的模式，将实例们可能不一致的属性从原型中分离出来，放到构造方法中，
//这样就避免了原型模式中的弊端。其实这也是面向对象编程的一种体现，抽象要有概要性，要是通用属性

//5.动态原型模式：有其他OO语言经验的开发人员在
// 看到独立的构造函数和原型时，很可能感到困惑，动态原型模式就是解决这个问题的方案，
// 把虽有信息都封装在了构造函数中 实际上就是把4的模式 原型初始化放到了构造函数中
// 通过检查某个应该存在的方法是否有效，来决定是否需要初始化原型
function Person(name, age, job) {
    //属性
    this.name = name;
    this.age = age;
    this.job = job;
    //方法
    if (typeof  this.sayName != 'function') {
        Person.prototype.sayName = function () {
            alert(this.name);
        };
    }
}
var friend = new Person('dongbin', '25', 'coder');
friend.sayName();
//在使用动态原型模式时，不能使用对象字面量重写原型，前面已经解释过了，如果在已经创建了实例的
//情况下重写原型，那么会切断现有实例与新原型之间的联系


//6.寄生构造函数模式：如果上述方法不适用，可以考录使用本方法。
//基本思想是：创建一个函数，该函数的作用仅仅是封装创建对象的代码，然后再返回新创建的对象；
//单从表面上看，这个函数又很像经典的构造函数
function Person(name, age, job) { //和工厂模式的区别在于这个是构造函数 首字母大写 使用new来创建对象
    var o = new Object();
    o.name = name;
    o.age = age;
    o.job = job;
    o.sayName = function () {
        alert(this.name);
    };
    return o;
}
//关于继承构造函数模式，有一点需要说明：首先，返回的对象与构造函数或者构造函数的原型的属性
//之间没有关机，也就是说，构造函数返回的对象与在构造函数外部创建对象没什么不同，因此，不能依赖
//instanceof操作符来确定对象类型。由于上述问题，我们建议在可以使用其他模式的情况下，不要使用这种模式。

//7.稳妥构造函数模式：所谓稳妥对象指的是没有公共属性，而且其方法也不引用this对象。
//稳妥构造函数遵循与寄生构造函数类似的模式，但有两点不同：一是新创建对象的实例方法不引用this
//二是不适用new操作符来调用构造函数。
function Person(name, age, job) {
    var o = new Object();
    //可以在这里定义私有变量和函数

    //添加方法
    o.sayName = function () {
        alert(name);//在这种模式创建对象中，出来使用sayName方法之外，没有其他办法可以访问name的值
    };
    return o;
}
//该模式提供的这种安全性，使得它非常适合在某些安全执行环境下使用 如ADsafe(www.adsafe.org)和Caja
//该模式和寄生模式同样存在instanceof的问题

/***********************************************************/

