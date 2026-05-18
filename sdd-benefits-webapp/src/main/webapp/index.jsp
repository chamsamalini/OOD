<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Benefits of Spec-Driven Development</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background: #f4f7fb;
            color: #1f2933;
        }

        .page {
            max-width: 960px;
            margin: 0 auto;
            padding: 40px 24px 64px;
        }

        .hero,
        .section {
            background: #ffffff;
            border-radius: 14px;
            padding: 28px;
            margin-bottom: 24px;
            box-shadow: 0 8px 24px rgba(15, 23, 42, 0.08);
        }

        h1,
        h2 {
            color: #0f172a;
            margin-top: 0;
        }

        .workflow {
            display: flex;
            flex-wrap: wrap;
            gap: 12px;
            padding: 0;
            list-style: none;
        }

        .workflow li {
            background: #dbeafe;
            color: #1d4ed8;
            padding: 10px 16px;
            border-radius: 999px;
            font-weight: 600;
        }

        .benefits li {
            margin-bottom: 10px;
        }

        .note {
            background: #eff6ff;
            border-left: 4px solid #2563eb;
            padding: 16px;
            border-radius: 8px;
        }
    </style>
</head>
<body>
    <div class="page">
        <section class="hero">
            <h1>Benefits of Spec-Driven Development</h1>
            <p>
                Spec-Driven Development helps teams connect requirements, implementation, validation,
                and delivery in a way that is easy to review and explain.
            </p>
        </section>

        <section class="section">
            <h2>Why SDD Matters</h2>
            <ul class="benefits">
                <li><strong>Clarity:</strong> the team starts with explicit requirements instead of assumptions.</li>
                <li><strong>Alignment:</strong> business goals, developer work, and delivery expectations stay connected.</li>
                <li><strong>Traceability:</strong> every implementation decision can be traced back to a documented need.</li>
                <li><strong>Better testing:</strong> clear acceptance criteria make validation more objective.</li>
                <li><strong>Less rework:</strong> ambiguity is reduced early, before coding grows expensive.</li>
                <li><strong>CI/CD readiness:</strong> build and pipeline steps become easier to define and automate.</li>
            </ul>
        </section>

        <section class="section">
            <h2>SDD Workflow</h2>
            <ul class="workflow">
                <li>Spec</li>
                <li>Plan</li>
                <li>Tasks</li>
                <li>Code</li>
                <li>Test</li>
                <li>Deploy</li>
            </ul>
        </section>

        <section class="section">
            <h2>Consultant Delivery Benefits</h2>
            <p>
                For consultants, SDD improves client delivery by making scope visible, reducing misunderstandings,
                supporting better status reporting, and giving stakeholders a clearer view of what will be built and why.
            </p>
            <div class="note">
                A simple project like this is enough to teach how specifications, plans, tasks, and build pipelines
                should reinforce each other.
            </div>
        </section>
    </div>
</body>
</html>