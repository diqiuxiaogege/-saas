package com.tuiba.saasadmininster.common.function;


import com.tuiba.saasadmininster.common.exception.RedisConnectException;

/**
 * @author MrBird
 */
@FunctionalInterface
public interface JedisExecutor<T, R> {
    R excute(T t) throws RedisConnectException;
}
