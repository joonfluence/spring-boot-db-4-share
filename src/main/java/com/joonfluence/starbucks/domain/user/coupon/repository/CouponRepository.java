package com.joonfluence.starbucks.domain.user.coupon.repository;

import com.joonfluence.starbucks.domain.user.coupon.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {}
