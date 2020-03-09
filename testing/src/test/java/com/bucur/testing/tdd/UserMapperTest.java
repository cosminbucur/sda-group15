package com.bucur.testing.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserMapperTest {

    @Test
    // user with all details -> convert to user with some details
    public void givenUser_whenConvert_thenReturnUserDetails() {
        //given
        UserMapper userMapper = new UserMapper();
        User user = new User("jon", "secret", "jonsnow@gmail.com");
        //when
        UserDetails actual = userMapper.convert(user);
        UserDetails expected = new UserDetails("jon", "jonsnow@gmail.com");
        //then
        assertThat(actual).isEqualTo(expected);
    }


}
