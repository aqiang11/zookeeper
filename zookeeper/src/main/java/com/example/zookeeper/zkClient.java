package com.example.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: aqiang
 * @date: 2022/5/15 21:53
 */
public class zkClient {
    private String connectString = "node128:2181,node129:2181,node130:2181";
    private int sessionTimeOut = 2000;
    private ZooKeeper zooKeeper;


    @Before
    public void init() throws IOException {
        zooKeeper = new ZooKeeper(connectString, sessionTimeOut, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
//                List<String> children = null;
//                try {
//                    children = zooKeeper.getChildren("/", true);
//                } catch (KeeperException e) {
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                for (String child : children) {
//                    System.out.println(child);
//                }
            }
        });

    }

    @Test
    public void create() throws InterruptedException, KeeperException {
        String node = zooKeeper.create("/city", "aqiang.avi".getBytes(StandardCharsets.UTF_8), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }

    @Test
    public void getChildren() throws InterruptedException, KeeperException {

        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
    }

    @Test
    public void exist() throws InterruptedException, KeeperException {
        Stat stat = zooKeeper.exists("/aqiang", false);
    }
}
