package kr.summer.boram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.summer.boram.dao.MemberDAO;

@Service
public class MemberServiceImp implements MemberService {
	@Autowired
	MemberDAO memberDao;
}
