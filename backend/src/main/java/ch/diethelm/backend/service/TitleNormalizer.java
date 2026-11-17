package ch.diethelm.backend.service;

public final class TitleNormalizer {

    private TitleNormalizer() {
    }

    public static String normalize(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Titel darf nicht leer sein");
        }

        String normalized = title.trim().replaceAll("\\s+", " ");
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("Titel darf nicht leer sein");
        }

        return Character.toUpperCase(normalized.charAt(0)) + normalized.substring(1);
    }
}
