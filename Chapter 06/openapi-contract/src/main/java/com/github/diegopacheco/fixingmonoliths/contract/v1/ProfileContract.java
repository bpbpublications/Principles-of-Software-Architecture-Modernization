package com.github.diegopacheco.fixingmonoliths.contract.v1;

import java.util.List;
import java.util.UUID;

public interface ProfileContract {
    User getUserById(UUID id);
    List<User> getUserByIds(List<UUID> ids);
}
