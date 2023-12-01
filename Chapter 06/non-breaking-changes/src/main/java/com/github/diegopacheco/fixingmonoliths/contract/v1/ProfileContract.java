package com.github.diegopacheco.fixingmonoliths.contract.v1;

import java.util.List;
import java.util.UUID;

/**
 * Contract Specifications:              <br/>
 *   <b>Ordering</b>   : Not Guaranteed. <br/>
 *   <b>Date Format</b>: yyyy-mm-dd      <br/>
 *   <b>Encryption</b> : Cipher Text     <br/>
 *   <b>Errors </b>    : None, user not found returns empty user <br/>
 *   <b>Idempotency</b>: All operations <br/>
 *
 */
public interface ProfileContract {
    User getUserById(UUID id);
    List<User> getUserByIds(List<UUID> ids);

    // Non-Breaking Change: Add new Operation
    User getUserByEmail(String email);
}
