package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestPermission {

    PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    @DisplayName("Permission level should be set for ADMIN")
    void testSetAdmin() {
        assertEquals(PermissionLevel.ADMIN, permissionManager.set(PermissionLevel.ADMIN),
                "Regular level set should work for ADMIN");
    }

    @Test
    @DisplayName("Permission level should be returned when called for ADMIN")
    void testgetCurrentLevelAdmin() {
        assertEquals(PermissionLevel.ADMIN, permissionManager.set(PermissionLevel.ADMIN),
                "Regular level set should work for ADMIN");
        assertEquals("ADMIN", permissionManager.getCurrentLevel(),
                "Regular level get function should work for ADMIN");
    }

    @Test
    @DisplayName("Permission level should be set for USER")
    void testSetUser() {
        assertEquals(PermissionLevel.USER, permissionManager.set(PermissionLevel.USER),
                "Regular level set should work for USER");
    }

    @Test
    @DisplayName("Permission level should be returned when called for USER")
    void testgetCurrentLevelUser() {
        assertEquals("USER", permissionManager.getCurrentLevel(),
                "Regular level get function should work for USER");
    }

    @Test
    @DisplayName("Permission level should be set for DEVELOPER")
    void testSetDeveloper() {
        assertEquals(PermissionLevel.DEVELOPER, permissionManager.set(PermissionLevel.DEVELOPER),
                "Regular level set should work for DEVELOPER");
    }

    @Test
    @DisplayName("Permission level should be returned when called for DEVELOPER")
    void testgetCurrentLevelDeveloper() {
        assertEquals(PermissionLevel.DEVELOPER, permissionManager.set(PermissionLevel.DEVELOPER),
                "Regular level set should work for DEVELOPER");
        assertEquals("DEVELOPER", permissionManager.getCurrentLevel(),
                "Regular level get function should work for DEVELOPER");
    }
}
