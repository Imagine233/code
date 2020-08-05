package day0805.demo04;

public class Demo040Game {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");//设置英雄的名称

        //设置英雄的技能
        //hero.setSkill(new SkillImpl());//使用单独定义的实现类

        //还可以改成使用匿名内部类
        //Skill skill = new Skill() {
           // @Override
            //public void use() {
            //    System.out.println("Bu~bu~bu");
            //}
        //};
        //hero.setSkill(skill);//艾希开始释放技能：
                            //Bu~bu~bu
                           //释放技能完成

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Tu~tu~tu");
            }
        });//艾希开始释放技能：
          //Tu~tu~tu
         //释放技能完成

        hero.attack();//艾希开始释放技能：
                     //Biu~biu~biu
                    //释放技能完成
    }
}
