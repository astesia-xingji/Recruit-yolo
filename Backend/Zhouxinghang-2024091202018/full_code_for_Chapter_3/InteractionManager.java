package com.yolo3;

// 交互管理器（单例模式 + 策略模式）
public class InteractionManager {
    // 单例实例
    private static volatile InteractionManager instance;

    // 当前使用的交互策略
    private InteractionStrategy currentStrategy;

    // 私有构造方法
    private InteractionManager() {
        // 默认使用玩耍策略
        this.currentStrategy = new PlayStrategy();
        System.out.println("交互管理器初始化完成，默认使用玩耍策略");
    }

    // 获取单例实例
    public static InteractionManager getInstance() {
        if (instance == null) {
            synchronized (InteractionManager.class) {
                if (instance == null) {
                    instance = new InteractionManager();
                }
            }
        }
        return instance;
    }

    // 设置交互策略
    public void setStrategy(InteractionStrategy strategy) {
        this.currentStrategy = strategy;
        System.out.println("交互策略已更新");
    }

    // 处理宠物交互（使用当前策略）
    public void handleInteraction(Pet pet1, Pet pet2) {
        if (currentStrategy == null) {
            throw new IllegalStateException("未设置交互策略");
        }
        currentStrategy.interact(pet1, pet2);
    }

    // 便捷方法：直接使用指定策略处理一次交互
    public void handleInteractionWithStrategy(Pet pet1, Pet pet2, InteractionStrategy strategy) {
        strategy.interact(pet1, pet2);
    }
}

