import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisConceptsRunner {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool("localhost", 6379);
        try {
            // Store & Retrieve a simple string
            Jedis jedis = jedisPool.getResource();
            jedis.set("foo", "bar");
            System.out.println("foo: " + jedis.get("foo"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
