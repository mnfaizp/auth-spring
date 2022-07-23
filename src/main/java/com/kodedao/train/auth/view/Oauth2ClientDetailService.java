package com.kodedao.train.auth.view;

import com.kodedao.train.auth.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

@Service
public class Oauth2ClientDetailService implements ClientDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        ClientDetails clientDetails = clientRepository.findOneByClientId(s);
        if (clientDetails == null) {
            throw  new ClientRegistrationException("Client not found");
        }

        return clientDetails;
    }
    @CacheEvict("oauth_client_id")
    public void clearCache(String s) {
        System.out.println("ini cache  oauth_client_id=  "+s);
    }


}
