/**
 * Created by dongbin on 2015/6/15.
 */
//原型链
//构造函数，原型，实例之间的关系：
//每一个构造函数都有一个原型对象，
//原型对象包含一个指向构造函数的指针，
//而实例都包含一个指向原型对象内部的指针。
//当原型对象指向另一个类型的实例，
//此时原型对象将包含一个指向两一个原型的指针，
//相应的，另一个原型中也包含着一个指向另一个构造函数的指针。
//假如另一个原型又是另一个类型的实例，那么上述关系依然存在
//如此层层递进，就构成了实例和原型的链条，这就是原型链的基本概念；

//原型式继承
//核心方法 ECMAScript5 中 Object.create()来规范化了原型式继承
function object(o) {
    function F() {
    };
    F.prototype = o;
    return new F();
}

//寄生式继承
function createAnother(original) {
    var clone = object(original);
    clone.sayHi = function () {
        alert('Hi');
    };
    return clone;
}

//寄生组合式继承 借用构造函数来继承属性 通过原型链来继承方法
function inheritPrototype(subType, superType) {
    var prototype = object(superType.prototype);//创建对象
    prototype.constructor = subType;//增强对象
    subType.prototype = prototype;//指定对象
}

function SuperType(name) {
    this.name = name;
    this.colors = ['red', 'blue', 'green'];
}
SuperType.prototype.sayName = function () {
    alert(this.name);
};
function SubType(name, age) {
    SuperType.call(this, name);//借用构造函数来继承属性
    this.age = age;
}
inheritPrototype(SubType, SubType);//通过原型链来继承方法
SubType.prototype.sayAge = function () {
    alert(this.age);
};

