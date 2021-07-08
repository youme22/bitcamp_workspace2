package shop.watchawiki.api.admin.service;
import shop.watchawiki.api.admin.domain.AdminDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface AdminService{
    void saveID(AdminDto AVO);
    void deleteID(String ID);
    boolean loginID(String ID, String PW);
    ArrayList<AdminDto> viewAdminAccountList();
}
